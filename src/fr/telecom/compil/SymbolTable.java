package fr.telecom.compil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import fr.telecom.compil.type.ArrayType;
import fr.telecom.compil.type.IntegerType;
import fr.telecom.compil.type.VarType;

public class SymbolTable
{
	private ArrayList<Scope> scopes = new ArrayList<Scope>();
	
	public SymbolTable(SyntaxicTree AST)
	{
		try {
			Scope scope = new Scope(null);
			scope.loadAST(AST);
		} catch (DuplicateSymbolException e) {
			e.printStackTrace();
		}
	}
	
	public String toString()
	{
		String result = "";
		for(Scope scope : scopes)
		{
			result += "Scope " + scope.getId() + "\n" + scope;
		}
		return result;
	}
	
	private class Symbol
	{
		public Symbol(String name, VarType type, boolean adr)
		{
			this.name = name;
			this.type = type;
			this.adr = adr;
		}
		
		public String name;
		public VarType type;
		public boolean adr;
		
		public String toString()
		{
			return name + " " + (adr ? "adr " : "") + type;
		}
	}
	
	private class FunctionSymbol
	{
		public String name;
		public VarType returnType;
		public Symbol[] args;
		public int scopeId;

		public FunctionSymbol(String name, VarType returnType, Symbol[] args, int scopeId)
		{
			this.name = name;
			this.returnType = returnType;
			this.args = args;
			this.scopeId = scopeId;
		}
		
		public String toString()
		{
			String argString = "";
			for(int i=0; i<args.length; i++)
			{
				if(i != 0)
					argString += ", ";
				argString += args[i];
			}
			return returnType + " " + name + "(" + argString + ")" + " : " + scopeId;
		}
	}
	
	private class ProcSymbol
	{
		public String name;
		public Symbol[] args;
		public int scopeId;

		public ProcSymbol(String name, Symbol[] args, int scopeId)
		{
			this.name = name;
			this.args = args;
			this.scopeId = scopeId;
		}
		
		public String toString()
		{
			String argString = "";
			for(int i=0; i<args.length; i++)
			{
				if(i != 0)
					argString += ", ";
				argString += args[i];
			}
			return "void " + name + "(" + argString + ")" + " : " + scopeId;
		}
	}
	
	private class Scope
	{
		private Map<String, Symbol> symbols = new HashMap<String, Symbol>();
		private Map<String, FunctionSymbol> functionSymbols = new HashMap<String, FunctionSymbol>();
		private Map<String, ProcSymbol> procSymbols = new HashMap<String, ProcSymbol>();
		private Scope parent;
		private int id;
		
		public int getId() {
			return id;
		}

		public Scope(Scope parent)
		{
			this.id = scopes.size();
			this.parent = parent;
			scopes.add(this);
		}
		
		public void loadAST(SyntaxicTree AST) throws DuplicateSymbolException
		{
			SyntaxicTree declarationTree = AST.getChild("DECLARATIONS");
			for(SyntaxicTree tree : declarationTree.getChildren("VAR"))
			{
				VarType type = getTypeFromTree(tree.getChild("TYPE").getChild(0));
				
				for(SyntaxicTree nameTree : tree.getChild("NAME").getChildren())
				{
					Symbol symbol = new Symbol(nameTree.getLabel(), type, false);
					addSymbol(symbol);
				}
			}
			for(SyntaxicTree tree : declarationTree.getChildren("FUNCTION"))
			{
				// Récupération du prototype de la fonction
				SyntaxicTree prototypeTree = tree.getChild("PROTOTYPE");
				VarType returnType = getTypeFromTree(prototypeTree.getChild("TYPE").getChild(0));
				String name = prototypeTree.getChild("NAME").getChild(0).getLabel();
				SyntaxicTree paramsTree = prototypeTree.getChild("PARAMS");
				Symbol params[] = new Symbol[paramsTree.getChildCount()];
				// Ajout du contenu de la fonction dans la liste des scopes
				Scope scope = new Scope(this);
				for(int i=0; i<params.length; i++)
				{
					SyntaxicTree paramTree = paramsTree.getChild(i);
					Symbol symbol = new Symbol(paramTree.getChild("NAME").getChild(0).getLabel(), getTypeFromTree(paramTree.getChild("TYPE").getChild(0)), paramTree.getLabel().equals("ADR"));
					params[i] = symbol;
					scope.addSymbol(symbol);
				}
				FunctionSymbol symbol = new FunctionSymbol(name, returnType, params, scope.getId());
				addFunction(symbol);
				scope.loadAST(tree);
				
			}
			for(SyntaxicTree tree : declarationTree.getChildren("PROC"))
			{
				// Récupération du prototype de la fonction
				SyntaxicTree prototypeTree = tree.getChild("PROTOTYPE");
				String name = prototypeTree.getChild("NAME").getChild(0).getLabel();
				SyntaxicTree paramsTree = prototypeTree.getChild("PARAMS");
				Symbol params[] = new Symbol[paramsTree.getChildCount()];
				// Ajout du contenu de la fonction dans la liste des scopes
				Scope scope = new Scope(this);
				for(int i=0; i<params.length; i++)
				{
					SyntaxicTree paramTree = paramsTree.getChild(i);
					Symbol symbol = new Symbol(paramTree.getChild("NAME").getChild(0).getLabel(), getTypeFromTree(paramTree.getChild("TYPE").getChild(0)), paramTree.getLabel().equals("ADR"));
					params[i] = symbol;
					scope.addSymbol(symbol);
				}
				ProcSymbol symbol = new ProcSymbol(name, params, scope.getId());
				addProc(symbol);
				scope.loadAST(tree);
			}
		}
		
		public void addSymbol(Symbol symbol) throws DuplicateSymbolException
		{
			if(symbols.containsKey(symbol.name))
				throw new DuplicateSymbolException(symbol.name);
			symbols.put(symbol.name, symbol);
		}
		
		public void addFunction(FunctionSymbol symbol) throws DuplicateSymbolException
		{
			if(functionSymbols.containsKey(symbol.name))
				throw new DuplicateSymbolException(symbol.name);
			functionSymbols.put(symbol.name, symbol);
		}
		
		public void addProc(ProcSymbol symbol) throws DuplicateSymbolException
		{
			if(procSymbols.containsKey(symbol.name))
				throw new DuplicateSymbolException(symbol.name);
			procSymbols.put(symbol.name, symbol);
		}
		
		public VarType getTypeFromTree(SyntaxicTree tree)
		{
			if(tree.getLabel().equals("integer"))
				return new IntegerType();
			else if(tree.getLabel().equals("ARRAY"))
				return new ArrayType(tree);
			return null;
		}
		
		public Symbol getSymbol(String symbolName) throws SymbolNotFoundException
		{
			if(!symbols.containsKey(symbolName))
			{
				if(parent == null)
					throw new SymbolNotFoundException(symbolName);
				return parent.getSymbol(symbolName);
			}
			return symbols.get(symbolName);
		}
		
		public FunctionSymbol getFunction(String functionName) throws SymbolNotFoundException
		{
			if(!functionSymbols.containsKey(functionName))
			{
				if(parent == null)
					throw new SymbolNotFoundException(functionName);
				return parent.getFunction(functionName);
			}
			return functionSymbols.get(functionName);
		}
		
		public ProcSymbol getProc(String procName) throws SymbolNotFoundException
		{
			if(!procSymbols.containsKey(procName))
			{
				if(parent == null)
					throw new SymbolNotFoundException(procName);
				return parent.getProc(procName);
			}
			return procSymbols.get(procName);
		}
		
		public String toString()
		{
			String result = "Parent : ";
			if(parent != null)
				result += parent.getId();
			else result += "none";
			result += "\n----------------\nSymbols : \n";
			for(Symbol symbol : symbols.values())
				result += "	" + symbol + "\n";
			result += "Functions : \n";
			for(FunctionSymbol symbol : functionSymbols.values())
				result += "	" + symbol + "\n";
			result += "Procs : \n";
			for(ProcSymbol symbol : procSymbols.values())
				result += "	" + symbol + "\n";
			return result + "----------------\n\n";
		}
	}
	
	public class DuplicateSymbolException extends Exception
	{
		private String symbolName;
		
		public DuplicateSymbolException(String symbolName)
		{
			this.symbolName = symbolName;
		}
		
		@Override
		public String getMessage()
		{
			return "Variable " + symbolName + " declared twice in the same scope";
		}
	}
	
	public class SymbolNotFoundException extends Exception
	{
		private String symbolName;
		
		public SymbolNotFoundException(String symbolName)
		{
			this.symbolName = symbolName;
		}
		
		@Override
		public String getMessage()
		{
			return "Variable " + symbolName + " not declared in scope";
		}
	}

	public boolean hasSymbol(String varName, int scopeId) {
		return scopes.get(scopeId).symbols.containsKey(varName);
	}
}

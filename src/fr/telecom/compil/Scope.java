package fr.telecom.compil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import fr.telecom.compil.asm.AsmGenerator;
import fr.telecom.compil.asm.TreeHandler;
import fr.telecom.compil.exceptions.DuplicateSymbolException;
import fr.telecom.compil.exceptions.SymbolNotFoundException;
import fr.telecom.compil.type.ArrayType;
import fr.telecom.compil.type.BooleanType;
import fr.telecom.compil.type.IntegerType;
import fr.telecom.compil.type.VarType;

public class Scope
{
	private Map<String, Symbol> symbols = new HashMap<String, Symbol>();
	private Map<String, FunctionSymbol> functionSymbols = new HashMap<String, FunctionSymbol>();
	private Map<String, ProcSymbol> procSymbols = new HashMap<String, ProcSymbol>();
	private Scope parent;
	private int id, depth, varsSize;
	private SymbolTable table;
	
	public int getId() {
		return id;
	}

	public Scope(Scope parent, SymbolTable table)
	{
		this.table = table;
		this.id = table.getScopeCount();
		this.parent = parent;
		if(parent != null)
			this.depth = parent.depth+1;
		else this.depth = 0;
		table.addScope(this);
	}
	
	public void loadAST(SyntaxicTree AST) throws DuplicateSymbolException
	{
		SyntaxicTree declarationTree = AST.getChild("DECLARATIONS");
		int disp = 0;
		for(SyntaxicTree tree : declarationTree.getChildren("VAR"))
		{
			VarType type = getTypeFromTree(tree.getChild("TYPE").getChild(0));
			
			for(SyntaxicTree nameTree : tree.getChild("NAME").getChildren())
			{
				disp += type.getSize();
				Symbol symbol = new Symbol(nameTree.getLabel(), type, false, disp, depth);
				addSymbol(symbol);
			}
		}
		
		varsSize = disp;
		for(SyntaxicTree tree : declarationTree.getChildren("FUNCTION"))
		{
			// Récupération du prototype de la fonction
			SyntaxicTree prototypeTree = tree.getChild("PROTOTYPE");
			VarType returnType = getTypeFromTree(prototypeTree.getChild("TYPE").getChild(0));
			String name = prototypeTree.getChild("NAME").getChild(0).getLabel();
			SyntaxicTree paramsTree = prototypeTree.getChild("PARAMS");
			Symbol params[] = new Symbol[paramsTree.getChildCount()];
			// Ajout du contenu de la fonction dans la liste des scopes
			Scope scope = new Scope(this, table);
			disp = -6;
			for(int i=0; i<params.length; i++)
			{
				SyntaxicTree paramTree = paramsTree.getChild(i);
				VarType type = getTypeFromTree(paramTree.getChild("TYPE").getChild(0));
				Symbol symbol = new Symbol(paramTree.getChild("NAME").getChild(0).getLabel(), type, paramTree.getLabel().equals("ADR"), disp, scope.getDepth());
				params[i] = symbol;
				scope.addSymbol(symbol);
				disp -= type.getSize();
			}
			FunctionSymbol symbol = new FunctionSymbol(name, returnType, params, scope.getDepth());
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
			Scope scope = new Scope(this, table);
			for(int i=0; i<params.length; i++)
			{
				SyntaxicTree paramTree = paramsTree.getChild(i);
				Symbol symbol = new Symbol(paramTree.getChild("NAME").getChild(0).getLabel(), getTypeFromTree(paramTree.getChild("TYPE").getChild(0)), paramTree.getLabel().equals("ADR"), 0, scope.getDepth());
				params[i] = symbol;
				scope.addSymbol(symbol);
			}
			ProcSymbol symbol = new ProcSymbol(name, params, scope.getId());
			addProc(symbol);
			scope.loadAST(tree);
		}
	}
	
	public int getDepth()
	{
		return depth;
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
		else if(tree.getLabel().equals("boolean"))
			return new BooleanType();
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
	
	public FunctionSymbol getFunction(String functionName)
	{
		if(!functionSymbols.containsKey(functionName))
		{
			if(parent == null)
				return null;
			return parent.getFunction(functionName);
		}
		return functionSymbols.get(functionName);
	}
	
	public ProcSymbol getProc(String procName)
	{
		if(!procSymbols.containsKey(procName))
		{
			if(parent == null)
				return null;
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
		result += "\n Depth : " + depth;
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

	public int getVarsSize()
	{
		return varsSize;
	}

	public Collection<Symbol> getSymbols() {
		return symbols.values();
	}
	
	public String genVarLoad(AsmGenerator gen, SyntaxicTree tree, Scope scope)
	{
		Symbol symbol;
		if(tree.getLabel().equals("VAR_REF"))
		{
			String varName = tree.getChild().getLabel();
			String result = "";
			try {
				symbol = getSymbol(varName);
				int depthDiff = scope.depth-symbol.depth;

				result += "// appel de la variable " + varName + "\n";
				result += "// Profondeur variable : " + symbol.depth + "\n";
				result += "// Profondeur scope : " + scope.depth + "\n";
				result += "ldw r1, bp\n";
				for(int i=0; i<depthDiff; i++)
				{
					result += "adi r1, r1, #2\n";
					result += "ldw r1, (r1)\n";
				}
				result += "ldw r0, (r1)" + -symbol.disp + "\n";
				return result;
			} catch (SymbolNotFoundException e) {
				e.printStackTrace();
			}
		}
		else if(tree.getLabel().equals("ARRAY_ACCESS"))
		{
			try {
				String varName = tree.getChild("NAME").getChild().getLabel();
				symbol = getSymbol(varName);
				ArrayType type = (ArrayType)symbol.type;
				SyntaxicTree rangeTree = tree.getChild("RANGE");
				ArrayList<int[]> bounds = type.getBounds();
				String result = genArrayCellAdress(gen, rangeTree, bounds, scope)
						+ "stw r0, -(sp)\n"
						+ "ldw r1, bp\n";
				
				int depthDiff = scope.depth-symbol.depth;
				for(int i=0; i<depthDiff; i++)
				{
					result += "adi r1, r1, #2\n";
					result += "ldw r1, (r1)\n";
				}
				result += "ldw r2, #" + symbol.disp + "\n"
						+ "sub r1, r2, r1\n"
						+ "add r1, r0, r1\n"
						+ "add r1, r0, r1\n"
						+ "ldw r0, (r1)\n";
				return result;
			} catch (SymbolNotFoundException e) {
				e.printStackTrace();
			}
		}
		else {
			TreeHandler handler = gen.getHandler(tree);
			if(handler != null)
				return handler.genCode(gen, tree, scope);
		}
		return "ldw r0, #" + tree.getLabel() + "\n";
	}
	
	public String genVarAffect(AsmGenerator gen, SyntaxicTree syntaxicTree, Scope scope)
	{
		Symbol symbol;
		try {
			if(syntaxicTree.getLabel().equals("ARRAY_ACCESS"))
			{
				String varName = syntaxicTree.getChild("NAME").getChild().getLabel();
				String result = "stw r0, -(sp)\n";
				symbol = getSymbol(varName);
				ArrayType type = (ArrayType)symbol.type;
				SyntaxicTree rangeTree = syntaxicTree.getChild("RANGE");
				ArrayList<int[]> bounds = type.getBounds();
				result += genArrayCellAdress(gen, rangeTree, bounds, scope)
						+ "ldw r0, (sp)+\n"
						+ "ldw r1, bp\n";
				
				int depthDiff = scope.depth-symbol.depth;
				for(int i=0; i<depthDiff; i++)
				{
					result += "adi r1, r1, #2\n";
					result += "ldw r1, (r1)\n";
				}
				result += "ldw r2, #" + symbol.disp + "\n"
						+ "sub r1, r2, r1\n"
						+ "add r1, r0, r1\n"
						+ "add r1, r0, r1\n"
						+ "ldw r0, (sp)+\n"
						+ "stw r0, (r1)\n";

				
				return result;
			}
			else
			{
				String varName = syntaxicTree.getChild().getLabel();
				symbol = getSymbol(varName);
				return "stw r0, (bp)" + (-symbol.disp) + "\n";
			}
		} catch (SymbolNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String genArrayCellAdress(AsmGenerator gen, SyntaxicTree rangeTree, ArrayList<int[]> bounds, Scope scope)
	{
		String result = "//ArrayCellAccess start\n";
		result += "ldw r0, #0\n"
				+ "stw r0, -(sp)\n";
		for(int i=0; i<rangeTree.getChildCount(); i++)
		{
			result += genVarLoad(gen, rangeTree.getChild(i), scope)
					+ "ldw r1, #" + bounds.get(i)[0]+ "\n"
					+ "sub r0, r1, r0\n";
			int dimSize = 1;
			for(int j=0; j<i; j++)
				dimSize *= bounds.get(j)[1]-bounds.get(j)[0];
			result += "ldw r1, #"+dimSize+"\n"
					+ "mul r0, r1, r0\n"
					+ "ldw r1, (sp)+\n"
					+ "add r0, r1, r0\n"
					+ "stw r0, -(sp)\n"
					+ "//ArrayCellAccess end\n";
		}
		return result;
	}

	public String genScopeVarAllocation() {
		String result = "";
		for(Symbol symbol : getSymbols())
		{
			result += "adi sp, sp, #-" + symbol.type.getSize() + " //allocation de l'espace pour " + symbol.name + "\n";
		}
		return result;
	}

	public Scope getParent() {
		return parent;
	}
	
	public String genScopeEntrance()
	{
		String result = "ldw r1, bp\n"
				+ "stw bp, -(sp) // dyn chain\n"
				+ "ldw r0, #0\n"
				+ "stat_calc_start_" + id + " cmp r10, r0\n"
				+ "ble stat_calc_end_" + id + "-$-2\n"
				+ "adi r1, r1, #2\n"
				+ "ldw r1, (r1)\n"
				+ "ldw r0, #-1\n"
				+ "add r10, r0, r10\n"
				+ "bmp stat_calc_start_" + id + "-$-2\n"
				+ "stat_calc_end_" + id + " stw r1, -(sp) // stat chain\n"
				+ "ldw bp, sp // maj bas de pile\n";
		return result;
	}

	public boolean hasSymbol(String varName) {
		return symbols.containsKey(varName);
	}
	
	public String genScopeEnd()
	{
		return "ldw sp, bp //maj sommet de pile\n"
				+ "adi sp, sp, #2 // stat chain\n"
				+ "ldw bp, (sp)+ // dyn chain\n"
				+ "rts\n";
	}
	
	public String genStaticChain(int targetDepth)
	{
		String result = "";
		return result;
	}
}
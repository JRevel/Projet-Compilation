package fr.telecom.compil;

import java.util.ArrayList;

import fr.telecom.compil.SymbolTable.Symbol;
import fr.telecom.compil.SymbolTable.SymbolNotFoundException;
import fr.telecom.compil.exceptions.BadNumberArgumentsException;
import fr.telecom.compil.exceptions.NoReturnException;
import fr.telecom.compil.exceptions.SemanticException;
import fr.telecom.compil.exceptions.VarNotFoundException;
import fr.telecom.compil.exceptions.WrongTypeAffectationException;
import fr.telecom.compil.exceptions.WrongTypeArgumentsException;
import fr.telecom.compil.type.IntegerType;
import fr.telecom.compil.type.VarType;

public class SemanticAnalyser
{
	private static int currentScope = 0;
	
	public static void initSemanticAnalysis()
	{
		currentScope = 0;
	}
	
	public static void checkScope(SyntaxicTree AST, SymbolTable table)
	{
		try {
			checkInstructions(AST.getChild("INSTRUCTIONS"), currentScope, table);
			SyntaxicTree declTree = AST.getChild("DECLARATIONS");
			for(SyntaxicTree functionTree : declTree.getChildren("FUNCTION"))
			{
				currentScope++;
				checkScope(functionTree, table);
				checkReturn(functionTree, currentScope, table);
			}
			for(SyntaxicTree procTree : declTree.getChildren("PROC"))
			{
				currentScope++;
				checkScope(procTree, table);
			}
		} catch (SemanticException e) {
			System.err.println(e.getMessage());
		} catch (SymbolNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void checkInstructions(SyntaxicTree AST, int scopeId, SymbolTable table) throws VarNotFoundException, BadNumberArgumentsException, SymbolNotFoundException, WrongTypeArgumentsException, WrongTypeAffectationException
	{
		checkVarDef(AST, scopeId, table);
		checkNbArgFunc(AST,scopeId,table);
		checkNbArgProc(AST,scopeId,table);
		checkTypeArgumentsFunc(AST, scopeId, table);
		checkTypeArgumentsProc(AST, scopeId, table);
		checkTypeAffectation(AST, scopeId, table);
		
		for(int i=0; i<AST.getChildCount(); i++)
			checkInstructions(AST.getChild(i), scopeId, table);
	}
	
	private static void checkVarDef(SyntaxicTree varTree, int scopeId, SymbolTable table) throws VarNotFoundException
	{
		// Les utilisations de variables se font toujours via des des noeuds VAR_REF pour les integer et les boolean,
		// et ARRAY_ACCESS pour les tableaux
		if(varTree.getLabel().equals("VAR_REF"))
		{
			//on récupère le nom de la variable, c'est le label du seul fils du noeud VAR_REF
			SyntaxicTree child = varTree.getChild();
			String name = child.getLabel();
			// et on lance une exception si la variable n'est pas dans la table des symboles
			if(!table.hasSymbol(name, scopeId))
				throw new VarNotFoundException(child.getLineNumber(), name, scopeId);
		}
		else if(varTree.getLabel().equals("ARRAY_ACCESS"))
		{
			SyntaxicTree nameTree = varTree.getChild("NAME").getChild(0);
			String name = nameTree.getLabel();
			if(!table.hasSymbol(name, scopeId))
				throw new VarNotFoundException(nameTree.getLineNumber(), name, scopeId);
		}
	}
	
	private static void checkNbArgFunc(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, BadNumberArgumentsException
	{
		if (varTree.getLabel().equals("FUNC_CALL"))
		{
			String name = varTree.getChild("NAME").getChild().getLabel();
			SyntaxicTree child = varTree.getChild("ARGS");
			int ASTSize = child.getChildren().size();
			int tableSize = table.getFunction(name, scopeId).args.length;
			if(ASTSize!=tableSize)
				throw new BadNumberArgumentsException(varTree.getLineNumber(), name, ASTSize, tableSize);
		}
	}
	private static void checkNbArgProc(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, BadNumberArgumentsException
	{
		if (varTree.getLabel().equals("PROC_CALL"))
		{
			String name = varTree.getChild("NAME").getChild().getLabel();
			SyntaxicTree child = varTree.getChild("ARGS");
			int ASTSize = child.getChildren().size();
			int tableSize = table.getProc(name, scopeId).args.length;
			if(ASTSize!=tableSize)
				throw new BadNumberArgumentsException(varTree.getLineNumber(), name, ASTSize, tableSize);
		}
	}
	private static void checkTypeArgumentsFunc(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, WrongTypeArgumentsException
	{
		if (varTree.getLabel().equals("FUNC_CALL"))
		{
			VarType TypeArg;
			String FuncName = varTree.getChild("NAME").getChild().getLabel();
			ArrayList<SyntaxicTree> children = varTree.getChild("ARGS").getChildren();
			Symbol[] FuncArgs = table.getFunction(FuncName, scopeId).args;
			for (int i=0; i<children.size();i++)
			{
				String ArgName = children.get(i).getChild().getLabel();
				if (children.get(i).getLabel().equals("ARRAY_ACCESS"))
					TypeArg = new IntegerType();
				else TypeArg = table.getSymbol(ArgName, scopeId).type;
				VarType TypeFunc = FuncArgs[i].type;
				if (!TypeArg.getName().equals(TypeFunc.getName()))
					throw new WrongTypeArgumentsException(varTree.getLineNumber(), FuncName, ArgName, TypeArg, TypeFunc);
			}
		}
	}
	private static void checkTypeArgumentsProc(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, WrongTypeArgumentsException
	{
		if (varTree.getLabel().equals("PROC_CALL"))
		{
			VarType TypeArg;
			String ProcName = varTree.getChild("NAME").getChild().getLabel();
			ArrayList<SyntaxicTree> children = varTree.getChild("ARGS").getChildren();
			Symbol[] ProcArgs = table.getProc(ProcName, scopeId).args;
			for (int i=0; i<children.size();i++)
			{
				String ArgName = children.get(i).getChild().getLabel();
				if (children.get(i).getLabel().equals("ARRAY_ACCESS"))
					TypeArg = new IntegerType();
				else TypeArg = table.getSymbol(ArgName, scopeId).type;
				VarType TypeProc = ProcArgs[i].type;
				if (!TypeArg.getName().equals(TypeProc.getName()))
					throw new WrongTypeArgumentsException(varTree.getLineNumber(), ProcName, ArgName, TypeArg, TypeProc);
			}
		}
	}
	private static void checkTypeAffectation(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, WrongTypeAffectationException
	{
		if (varTree.getLabel().equals("="))
		{
			VarType TypeLeft;
			VarType TypeRight;
			SyntaxicTree ChildLeft= varTree.getChild(0);
			SyntaxicTree ChildRight = varTree.getChild(1);

			if (ChildLeft.getLabel().equals("VAR_REF"))
				TypeLeft = table.getSymbol(ChildLeft.getChild().getLabel(), scopeId).type;
			else if (ChildLeft.getLabel().equals("FUNC_CALL"))
				TypeLeft = table.getFunction(ChildLeft.getChild("NAME").getChild().getLabel(), scopeId).returnType;
			else TypeLeft = new IntegerType();
			
			if (ChildRight.getLabel().equals("VAR_REF"))
				TypeRight = table.getSymbol(ChildRight.getChild().getLabel(), scopeId).type;
			else if (ChildRight.getLabel().equals("FUNC_CALL"))
				TypeRight = table.getFunction(ChildRight.getChild("NAME").getChild().getLabel(), scopeId).returnType;
			else TypeRight = new IntegerType();
			
			if (!TypeLeft.getName().equals(TypeRight.getName()))
				throw new WrongTypeAffectationException(varTree.getLineNumber(), TypeRight,TypeLeft);
		}
	}
	
	private static void checkReturn(SyntaxicTree varTree, int scopeId, SymbolTable table) throws NoReturnException, SymbolNotFoundException
	{
		String functionName = varTree.getChild("PROTOTYPE").getChild("NAME").getChild(0).getLabel();
		checkReturn(varTree.getChild("INSTRUCTIONS"), functionName);
	}
	
	private static void checkReturn(SyntaxicTree varTree, String functionName) throws NoReturnException
	{
		SyntaxicTree lastChild = varTree.getChild(varTree.getChildCount()-1);
		String label = lastChild.getLabel();
		if(label.equals("IF"))
		{
			checkReturn(lastChild.getChild("THEN"), functionName);
			SyntaxicTree elseChild = lastChild.getChild("ELSE");
			if(elseChild != null)
				checkReturn(elseChild, functionName);
		}
		else if(!label.equals("RETURN"))
		{
			throw new NoReturnException(functionName, 0);
		}
	}
}

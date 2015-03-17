package fr.telecom.compil;

import fr.telecom.compil.exceptions.VarNotFoundException;

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
			}
			for(SyntaxicTree procTree : declTree.getChildren("PROC"))
			{
				currentScope++;
				checkScope(procTree, table);
			}
		} catch (VarNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static void checkInstructions(SyntaxicTree AST, int scopeId, SymbolTable table) throws VarNotFoundException
	{
		checkVarDef(AST, scopeId, table);
		for(int i=0; i<AST.getChildCount(); i++)
			checkInstructions(AST.getChild(i), scopeId, table);
	}
	
	private static void checkVarDef(SyntaxicTree varTree, int scopeId, SymbolTable table) throws VarNotFoundException
	{
		if(varTree.getLabel().equals("VAR_REF"))
		{
			SyntaxicTree child = varTree.getChild(0);
			if(child.getLabel().equals("ARRAY_ACCESS"))
			{
				String name = child.getChild("NAME").getChild(0).getLabel();
				if(!table.hasSymbol(name, scopeId))
					throw new VarNotFoundException(name, scopeId);
			}
			else
			{
				String name = child.getLabel();
				if(!table.hasSymbol(name, scopeId))
					throw new VarNotFoundException(name, scopeId);
			}
		}
		else
		{
			for(int i=0; i<varTree.getChildCount(); i++)
			{
				checkVarDef(varTree.getChild(i), scopeId, table);
			}
		}
	}
}

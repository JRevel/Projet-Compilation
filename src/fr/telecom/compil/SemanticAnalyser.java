package fr.telecom.compil;

import fr.telecom.compil.exceptions.VarNotFoundException;

public class SemanticAnalyser
{
	public static void check(SyntaxicTree AST)
	{
		
	}
	
	public static void checkVarDef(SyntaxicTree varTree, int scopeId, SymbolTable table) throws VarNotFoundException
	{
		if(varTree.getLabel().equals("VAR"))
		{
			SyntaxicTree tree = varTree.getChild(0);
			if(tree.getLabel().equals("ARRAY_ACCESS"))
			{
				String varName = tree.getChild("NAME").getChild(0).getLabel();
				if(!table.hasSymbol(varName, scopeId))
					throw new VarNotFoundException(varName, scopeId);
			}
			else
			{
				if(!table.hasSymbol(tree.getLabel(), scopeId))
					throw new VarNotFoundException(tree.getLabel(), scopeId);
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

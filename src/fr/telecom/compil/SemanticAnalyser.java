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
			System.err.println(e.getMessage());
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
}

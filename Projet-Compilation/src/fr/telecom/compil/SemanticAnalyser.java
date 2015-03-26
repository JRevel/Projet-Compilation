package fr.telecom.compil;

import java.util.ArrayList;

import fr.telecom.compil.SymbolTable.FunctionSymbol;
import fr.telecom.compil.SymbolTable.Symbol;
import fr.telecom.compil.SymbolTable.SymbolNotFoundException;
import fr.telecom.compil.exceptions.BadNumberArgumentsException;
import fr.telecom.compil.exceptions.BooleanIfConditionException;
import fr.telecom.compil.exceptions.NotIntegerInOperationException;
import fr.telecom.compil.exceptions.SemanticException;
import fr.telecom.compil.exceptions.VarNotFoundException;
import fr.telecom.compil.exceptions.WrongTypeAffectationException;
import fr.telecom.compil.exceptions.WrongTypeArgumentsException;
import fr.telecom.compil.exceptions.WrongTypeLowerGreaterException;
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
			}
			for(SyntaxicTree procTree : declTree.getChildren("PROC"))
			{
				currentScope++;
				checkScope(procTree, table);
			}
		} catch (SemanticException e) {
			System.err.println(e.getMessage());
		} catch (SymbolNotFoundException e) {
			// TODO Auto-generated catch block
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
			//on r�cup�re le nom de la variable, c'est le label du seul fils du noeud VAR_REF
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

	// Ajout de Guillaume BRUNEAU, � v�rifier
	private static boolean checkTypeArithmeticOperation(SyntaxicTree varTree, int scopeId, SymbolTable table) throws NotIntegerInOperationException, SymbolNotFoundException
	{
		if (varTree.getLabel().equals("+") || varTree.getLabel().equals("-") || varTree.getLabel().equals("*") || varTree.getLabel().equals("/"))
		{
			boolean resLeft=true, resRight=true;
			SyntaxicTree childLeft= varTree.getChild(0);
			SyntaxicTree childRight = varTree.getChild(1);

			if (childLeft.getLabel().equals("VAR_REF"))
				resLeft = table.getSymbol(childLeft.getChild().getLabel(), scopeId).type.getName().equals("integer");
			else if (childLeft.getLabel().equals("+") || childLeft.getLabel().equals("-") || childLeft.getLabel().equals("*") || childLeft.getLabel().equals("/"))
				resLeft = checkTypeArithmeticOperation(childLeft, scopeId, table);
			else resLeft=false;

			if (childRight.getLabel().equals("VAR_REF"))
				resRight = table.getSymbol(childRight.getChild().getLabel(), scopeId).type.getName().equals("integer");
			else if (childRight.getLabel().equals("+") || childRight.getLabel().equals("-") || childRight.getLabel().equals("*") || childRight.getLabel().equals("/"))
				resRight = checkTypeArithmeticOperation(childRight, scopeId, table);
			else resRight=false;

			if (!resLeft || !resRight )
				throw new NotIntegerInOperationException(varTree.getLineNumber(), resLeft, varTree.getLabel());


			return (resLeft && resRight);
		}
		else return false;
	}


	// Ajout de Guillaume BRUNEAU, � v�rifier
	private static void checkTypeIfCondition(SyntaxicTree varTree, int scopeId, SymbolTable table) throws BooleanIfConditionException, SymbolNotFoundException, WrongTypeLowerGreaterException
	{
		if (varTree.getLabel().equals("CONDITION"))
		{
			SyntaxicTree child= varTree.getChild();
			String label = child.getLabel();

			if (label.equals("VAR_REF"))
			{
				VarType childType = table.getSymbol(child.getChild().getLabel(), scopeId).type;
				if (!childType.equals("boolean") )
					throw new BooleanIfConditionException(varTree.getLineNumber(), false, label);
			}

			else if (label.equals(">") || label.equals("<"))
			{
				boolean resLeft=true, resRight=true;
				SyntaxicTree childLeft= child.getChild(0);
				SyntaxicTree childRight = child.getChild(1);

				if (childLeft.getLabel().equals("VAR_REF"))
					resLeft = table.getSymbol(childLeft.getChild().getLabel(), scopeId).type.getName().equals("boolean");
				else if (childLeft.getLabel().equals(">") || childLeft.getLabel().equals("<"))
					resLeft = true;
				else resLeft=false;

				if (childRight.getLabel().equals("VAR_REF"))
					resRight = table.getSymbol(childRight.getChild().getLabel(), scopeId).type.getName().equals("boolean");
				else if (childRight.getLabel().equals(">") || childRight.getLabel().equals("<"))
					resRight = true;
				else resRight=false;

				if (!resLeft || !resRight )
					throw new BooleanIfConditionException(varTree.getLineNumber(), resLeft, varTree.getLabel());
			}
		}
	}

	//Ajout de Guillaume BRUNEAU, � v�rifier
	private static void checkTypeLowerGreaterOperation(SyntaxicTree varTree, int scopeId, SymbolTable table) throws WrongTypeAffectationException, SymbolNotFoundException, NotIntegerInOperationException 
	{
		if (varTree.getLabel().equals(">") || varTree.getLabel().equals("<"))
		{
			VarType typeLeft, typeRight;
			SyntaxicTree childLeft= varTree.getChild(0);
			SyntaxicTree childRight = varTree.getChild(1);

			if (childLeft.getLabel().equals("VAR_REF"))
				typeLeft = table.getSymbol(childLeft.getChild().getLabel(), scopeId).type;
			else if (childLeft.getLabel().equals("+") || childLeft.getLabel().equals("-") || childLeft.getLabel().equals("*") || childLeft.getLabel().equals("/"))
				typeLeft = (new IntegerType());
			else typeLeft=null;

			if (childLeft.getLabel().equals("VAR_REF"))
				typeRight = table.getSymbol(childRight.getChild().getLabel(), scopeId).type;
			else if (childRight.getLabel().equals("+") || childRight.getLabel().equals("-") || childRight.getLabel().equals("*") || childRight.getLabel().equals("/"))
				typeRight = (new IntegerType());
			else typeRight=null;

			if (!typeLeft.equals(typeRight) || typeLeft.equals(null))
				throw new WrongTypeAffectationException(varTree.getLineNumber(), typeLeft, typeRight);

		}	
	}

}

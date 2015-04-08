package fr.telecom.compil;

import java.util.ArrayList;

import fr.telecom.compil.SymbolTable.FunctionSymbol;
import fr.telecom.compil.SymbolTable.Symbol;
import fr.telecom.compil.SymbolTable.SymbolNotFoundException;
import fr.telecom.compil.SyntaxicTree;
import fr.telecom.compil.exceptions.BadArrayBoundsDeclaration;
import fr.telecom.compil.exceptions.BadIndexArrayAccessStatique;
import fr.telecom.compil.exceptions.BadNumberArgumentsException;
import fr.telecom.compil.exceptions.BadTypeReturnFunction;
import fr.telecom.compil.exceptions.BooleanIfConditionException;
import fr.telecom.compil.exceptions.NotIntegerInOperationException;
//import fr.telecom.compil.exceptions.RangeIntException;
import fr.telecom.compil.exceptions.SemanticException;
import fr.telecom.compil.exceptions.VarNotFoundException;
import fr.telecom.compil.exceptions.WrongTypeAffectationException;
import fr.telecom.compil.exceptions.WrongTypeArgumentsException;
import fr.telecom.compil.type.ArrayType;
import fr.telecom.compil.type.BooleanType;
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
			checkDeclarations(AST.getChild("DECLARATIONS"), currentScope, table);
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

	private static void checkInstructions(SyntaxicTree AST, int scopeId, SymbolTable table) throws VarNotFoundException, BadNumberArgumentsException, SymbolNotFoundException, WrongTypeArgumentsException, WrongTypeAffectationException, BadIndexArrayAccessStatique, NotIntegerInOperationException, BooleanIfConditionException//, RangeIntException
, BadTypeReturnFunction
	{
		checkVarDef(AST, scopeId, table);
		checkNbArgFunc(AST,scopeId,table);
		checkNbArgProc(AST,scopeId,table);
		checkTypeArgumentsFunc(AST, scopeId, table);
		checkTypeArgumentsProc(AST, scopeId, table);
		checkTypeAffectation(AST, scopeId, table);
		checkIndexArrayAccessStatique(AST, scopeId, table);
		checkTypeArithmeticOperation(AST, scopeId, table);
		checkTypeIfCondition(AST, scopeId, table);
		checkTypeLowerGreaterOperation(AST, scopeId, table);
		//checkForRange(AST, scopeId, table);
		

		for(int i=0; i<AST.getChildCount(); i++)
			checkInstructions(AST.getChild(i), scopeId, table);
	}

	//Ajout par Didier pour check certains problèmes dans les déclarations


	private static void checkDeclarations(SyntaxicTree AST, int scopeId, SymbolTable table) throws SymbolNotFoundException, BadArrayBoundsDeclaration, BadTypeReturnFunction
	{
		checkArrayBoundsCroiss(AST, scopeId, table);
		checkTypeReturnFunction(AST, scopeId, table);
		


		for(int i=0; i<AST.getChildCount(); i++)
			checkDeclarations(AST.getChild(i), scopeId, table);
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

	// Ajout de Guillaume BRUNEAU 
	private static boolean checkTypeArithmeticOperation(SyntaxicTree varTree, int scopeId, SymbolTable table) throws NotIntegerInOperationException, SymbolNotFoundException
	{
		if (varTree.getLabel().equals("+") || varTree.getLabel().equals("-") || varTree.getLabel().equals("*") || varTree.getLabel().equals("/"))
		{
			boolean resLeft=true, resRight=true;
			SyntaxicTree childLeft= varTree.getChild(0);
			SyntaxicTree childRight = varTree.getChild(1);

			if (childLeft.getLabel().equals("VAR_REF")) 
				resLeft = table.getSymbol(childLeft.getChild().getLabel(), scopeId).type.getName().equals(new IntegerType().getName());
			else if (childLeft.getLabel().equals("+") || childLeft.getLabel().equals("-") || childLeft.getLabel().equals("*") || childLeft.getLabel().equals("/"))
				resLeft = true;
			else resLeft=false;

			if (childRight.getLabel().equals("VAR_REF"))
				resRight = table.getSymbol(childRight.getChild().getLabel(), scopeId).type.getName().equals("integer");
			else if (childRight.getLabel().equals("+") || childRight.getLabel().equals("-") || childRight.getLabel().equals("*") || childRight.getLabel().equals("/"))
				resRight = true;
			else resRight=false;

			if (!resLeft || !resRight )
				throw new NotIntegerInOperationException(varTree.getLineNumber(), resLeft, varTree.getLabel());


			return (resLeft && resRight);
		}
		else return false;
	}


	// Ajout de Guillaume BRUNEAU 
	private static void checkTypeIfCondition(SyntaxicTree varTree, int scopeId, SymbolTable table) throws BooleanIfConditionException, SymbolNotFoundException//, WrongTypeLowerGreaterException
	{
		if (varTree.getLabel().equals("CONDITION"))
		{
			SyntaxicTree child= varTree.getChild();
			String label = child.getLabel();

			if (label.equals("VAR_REF"))
			{
				VarType childType = table.getSymbol(child.getChild().getLabel(), scopeId).type;
				if (!childType.getName().equals(new BooleanType().getName()) )
					throw new BooleanIfConditionException(varTree.getLineNumber(), new IntegerType(), new IntegerType(), label);
			}

			else if (label.equals(">") || label.equals("<"))
				checkTypeLowerGreaterOperation(child, scopeId, table);

		}
	}

	//Ajout de Guillaume BRUNEAU
	private static void checkTypeLowerGreaterOperation(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, BooleanIfConditionException
	{
		if (varTree.getLabel().equals(">") || varTree.getLabel().equals("<"))
		{
			VarType typeLeft;
			VarType typeRight;
			SyntaxicTree childLeft= varTree.getChild(0);
			SyntaxicTree childRight = varTree.getChild(1);

			if (childLeft.getLabel().equals("VAR_REF"))
				typeLeft = table.getSymbol(childLeft.getChild().getLabel(), scopeId).type;
			else if (childLeft.getLabel().equals(">") || childLeft.getLabel().equals("<"))
				typeLeft=new BooleanType();
			else typeLeft=new IntegerType();

			if (childRight.getLabel().equals("VAR_REF"))
				typeRight = table.getSymbol(childRight.getChild().getLabel(), scopeId).type;
			else if (childRight.getLabel().equals(">") || childRight.getLabel().equals("<"))
				typeRight = new BooleanType();
			else typeRight = new IntegerType();

			if (!typeLeft.getName().equals(typeRight.getName()) )
				throw new BooleanIfConditionException(varTree.getLineNumber(), typeLeft, typeRight, varTree.getLabel());
		}
	}

	//Ajout par guillaume
	private static void checkForRange(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, NotIntegerInOperationException//, RangeIntException
	{
		if (varTree.getLabel().equals("FOR"))
		{ 
			SyntaxicTree child= varTree.getChild(1);
			SyntaxicTree childLeft= child.getChild(0);
			SyntaxicTree childRight = child.getChild(1);
			VarType typeLeft=new IntegerType();
			VarType typeRight=new IntegerType();
			int rangeMin;
			int rangeMax;

			if (childLeft.getLabel().equals("VAR_REF"))
				typeLeft = table.getSymbol(childLeft.getChild().getLabel(), scopeId).type;
			else 
				rangeMin = Integer.valueOf(childLeft.getLabel());

			if (childRight.getLabel().equals("VAR_REF"))
				typeRight = table.getSymbol(childRight.getChild().getLabel(), scopeId).type;
			else
				rangeMax = Integer.valueOf(childRight.getLabel());

			if (!typeLeft.getName().equals("integer") || !typeRight.getName().equals("integer"))
				throw new NotIntegerInOperationException(varTree.getLineNumber(), typeLeft.getName().equals("integer"), "range declaration");
			else
			{	
				rangeMin = Integer.valueOf(childLeft.getLabel());
				rangeMax = Integer.valueOf(childRight.getLabel());
		//		if(rangeMin > rangeMax)
		//			throw new RangeIntException();
			}
		}
	}

	//Ajout par Didier
	private static void checkArrayBoundsCroiss(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, BadArrayBoundsDeclaration
	{
		if (varTree.getLabel().equals("ARRAY"))
		{
			int nombreChild = varTree.getChildCount();
			for (int i = 0;i<nombreChild;i++)
			{
				//Label Range
				SyntaxicTree childRange = varTree.getChild(i);
				SyntaxicTree childLeft= childRange.getChild(0);
				SyntaxicTree childRight = childRange.getChild(1);

				int boundsmin = Integer.valueOf(childLeft.getLabel());
				int boundsmax = Integer.valueOf(childRight.getLabel());

				if(boundsmin > boundsmax)
				{
					throw new BadArrayBoundsDeclaration(varTree.getLineNumber());
				}
			}
		}
	}	
	//Ajout par Didier
	private static void checkIndexArrayAccessStatique(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, BadIndexArrayAccessStatique
	{
		if (varTree.getLabel().equals("ARRAY_ACCESS"))
		{
			SyntaxicTree childName = varTree.getChild(0);
			ArrayType tableauType = (ArrayType) table.getSymbol(childName.getChild(0).getLabel(), scopeId).type;
			ArrayList<int[]> bornes =tableauType.getBounds();

			//Valeur rangée dans un tableau
			if (varTree.getChild(1).getLabel().equals("CELLS"))
			{

				//Label Cells
				SyntaxicTree childCells = varTree.getChild("CELLS");
				int dim = 0;
				for (SyntaxicTree child : childCells.getChildren())
				{
					if (child.getLabel().equals("VAR_REF")!=true)
					{
						int valIndexStat = Integer.valueOf(child.getLabel());
						if(bornes.get(dim)[0]<= valIndexStat || bornes.get(dim)[1] >= valIndexStat)
						{
							throw new BadIndexArrayAccessStatique(varTree.getLineNumber());
						}
					}
				}

			}
			else 			
			{
				//Valeur cherchée dans un tableau
				if (varTree.getChild(1).getLabel().equals("RANGE"))
				{
					//Label Range
					SyntaxicTree childRange = varTree.getChild("RANGE");
					int dim = 0;
					for (SyntaxicTree child : childRange.getChildren())
					{
						if (child.getLabel().equals("VAR_REF")!=true)
						{
							int valIndexStat = Integer.valueOf(child.getLabel());
							if(bornes.get(dim)[0]<= valIndexStat || bornes.get(dim)[1] >= valIndexStat)
							{
								throw new BadIndexArrayAccessStatique(varTree.getLineNumber());
							}
						}
					}



				}
			}
		}
	}
	
	//Ajout par Didier
	private static void checkTypeReturnFunction(SyntaxicTree varTree, int scopeId, SymbolTable table) throws SymbolNotFoundException, BadTypeReturnFunction
	{
		if (varTree.getLabel().equals("FUNCTION"))
		{
			SyntaxicTree childProto = varTree.getChild("PROTOTYPE");
			SyntaxicTree childInstru = varTree.getChild("INSTRUCTIONS");
			String retour;
			scopeId++;
			
			if(childInstru.getChild("RETURN").getChild().getLabel().equals("VAR_REF"))
			{
				retour = childInstru.getChild("RETURN").getChild().getChild().getLabel();
			}
			else retour = childInstru.getChild("RETURN").getChild().getLabel();
			
			//La fonction renvoi un integer
			if (childProto.getChild("TYPE").getChild().getLabel().equals("integer"))
			{
				
				if(table.hasSymbol(retour, scopeId))
				{
					if((table.getSymbol(retour, scopeId).type instanceof IntegerType) == false)
					{
						throw new BadTypeReturnFunction(varTree.getLineNumber());
					}
						
				}
				else
				{
					//déclanche un exception si ce n'est pas un entier
					try
					{
						Integer.parseInt(retour);
					}
					catch (NumberFormatException e)
					{
						throw new BadTypeReturnFunction(varTree.getLineNumber());
					}
				}
			}
			else
			{
				//La fonction renvoi un boolean
				if (childProto.getChild(0).getLabel().equals("boolean"))
				{
					if(table.hasSymbol(retour, scopeId))
					{
						if((table.getSymbol(retour, scopeId).type instanceof BooleanType) == false)
						{
							throw new BadTypeReturnFunction(varTree.getLineNumber());
						}
							
					}
					else
					{
						if (retour != "true" && retour != "false")
							throw new BadTypeReturnFunction(varTree.getLineNumber());
					}
				}
				//Array
				else
				{
					if(table.hasSymbol(retour, scopeId))
					{
						if((table.getSymbol(retour, scopeId).type instanceof ArrayType) == false)
						{
							throw new BadTypeReturnFunction(varTree.getLineNumber());
						}		
					}
					else
					{
						throw new BadTypeReturnFunction(varTree.getLineNumber());
					}
				}
			}
			

		}
	}
}




package fr.telecom.compil.exceptions;

import fr.telecom.compil.type.VarType;

public class WrongTypeArgumentsException extends SemanticException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FuncName;
	private String ArgName;
	private int lineNumber;
	private VarType TypeArg;
	private VarType TypeFunc;
	
	public WrongTypeArgumentsException(int lineNumber, String FuncName, String ArgName, VarType TypeArg, VarType TypeFunc)
	{
		this.FuncName = FuncName;
		this.ArgName = ArgName;
		this.lineNumber = lineNumber;
		this.TypeArg = TypeArg;
		this.TypeFunc = TypeFunc;
	}
	
	@Override
	public String getErrorMessage()
	{
		return "line " + lineNumber + " : wrong type of arguments ; in " + FuncName + "the variable " +ArgName+" has for type "+TypeArg+" and it should have for type "+TypeFunc ;
	}
	
}

package fr.telecom.compil.exceptions;

import fr.telecom.compil.type.VarType;

public class WrongTypeAffectationException extends SemanticException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lineNumber;
	private VarType TypeLeft;
	private VarType TypeRight;
	
	public WrongTypeAffectationException(int lineNumber, VarType TypeLeft, VarType TypeRight)
	{
		this.lineNumber = lineNumber;
		this.TypeLeft = TypeLeft;
		this.TypeRight = TypeRight;
	}
	
	@Override
	public String getErrorMessage()
	{
		return "line " + lineNumber + " : wrong type of arguments  in this affectation ; The first one has for type "+TypeLeft+" when the second has for type "+TypeRight;
	}
	
}

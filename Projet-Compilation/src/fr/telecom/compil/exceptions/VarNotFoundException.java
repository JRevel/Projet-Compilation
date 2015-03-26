package fr.telecom.compil.exceptions;

public class VarNotFoundException extends SemanticException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String varName;
	private int scopeId;
	private int lineNumber;
	
	public VarNotFoundException(int lineNumber, String varName, int scopeId)
	{
		this.varName = varName;
		this.scopeId = scopeId;
		this.lineNumber = lineNumber;
	}
	
	@Override
	public String getErrorMessage()
	{
		return "line " + lineNumber + " : Variable " + varName + " not defined in scope " + scopeId;
	}
	
}

package fr.telecom.compil.exceptions;

public class BadTypeReturnFunction extends SemanticException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String varName;
	private int lineNumber;
	private int ASTSize;
	private int tableSize;
	
	public BadTypeReturnFunction(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	
	public String getErrorMessage()
	{
		return "line " + lineNumber + " : bad Type Return in function ;"; 
	}
}

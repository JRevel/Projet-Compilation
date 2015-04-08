package fr.telecom.compil.exceptions;

public class BadIndexArrayAccessStatique extends SemanticException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String varName;
	private int lineNumber;
	private int ASTSize;
	private int tableSize;
	
	public BadIndexArrayAccessStatique(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	
	public String getErrorMessage()
	{
		return "line " + lineNumber + " : bad  static index of Array Access;"; 
	}
}

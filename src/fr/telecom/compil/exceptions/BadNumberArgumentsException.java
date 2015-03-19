package fr.telecom.compil.exceptions;

public class BadNumberArgumentsException extends SemanticException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String varName;
	private int lineNumber;
	private int ASTSize;
	private int tableSize;
	
	public BadNumberArgumentsException(int lineNumber, String varName, int ASTSize, int tableSize)
	{
		this.varName = varName;
		this.lineNumber = lineNumber;
		this.ASTSize = ASTSize;
		this.tableSize = tableSize;
	}
	
	@Override
	public String getErrorMessage()
	{
		return "line " + lineNumber + " : bad number of arguments ; "+ ASTSize +" found in "+varName+" which request "+tableSize+" arguments";
	}
	
}

package fr.telecom.compil.exceptions;

public class BadNbDimArray  extends SemanticException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String varName;
	private int lineNumber;
	private int ASTSize;
	private int tableSize;
	

	public  BadNbDimArray(int lineNumber)
	{
		this.varName = varName;
		this.lineNumber = lineNumber;
		this.ASTSize = ASTSize;
		this.tableSize = tableSize;
	}
	
	@Override
	public String getErrorMessage()
	{
		return "line " + lineNumber + " : bad number of arguments ";
	}
	
}
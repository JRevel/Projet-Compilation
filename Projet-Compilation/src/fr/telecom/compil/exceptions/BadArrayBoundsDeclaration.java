package fr.telecom.compil.exceptions;

public class BadArrayBoundsDeclaration extends SemanticException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String varName;
	private int lineNumber;
	private int ASTSize;
	private int tableSize;
	
	public BadArrayBoundsDeclaration(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	
	@Override
	public String getErrorMessage()
	{
		return "line " + lineNumber + " : bad declaration of Array bounds ;"; 
	}
	
}
package fr.telecom.compil.exceptions;

public class NotIntegerInOperationException extends SemanticException 
{

	private int lineNumber;
	private boolean resLeft;
	private String label;
	
	public NotIntegerInOperationException(int lineNumber, boolean resLeft, String label) 
	{
		this.lineNumber=lineNumber;
		this.resLeft=resLeft;
		this.label=label;
	}

	@Override
	public String getErrorMessage() 
	{
		if (!resLeft)
			return "line " + lineNumber + " : wrong type at the left of "+label+" which request an integer";
		else
			return "line " + lineNumber + " : wrong type at the right of "+label+" which request an integer";
	}

}

// Ajout de Guillaume BRUNEAU, à vérifier
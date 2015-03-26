package fr.telecom.compil.exceptions;

public class BooleanIfConditionException extends SemanticException 
{

	private int lineNumber;
	private boolean resLeft;
	private String label;
	
	public BooleanIfConditionException(int lineNumber, boolean resLeft, String label) 
	{
		this.lineNumber=lineNumber;
		this.resLeft=resLeft;
		this.label=label;
	}

	@Override
	public String getErrorMessage() 
	{
		if (label.equals("VAR_REF"))
			return "line " + lineNumber + " : wrong type ; Boolean is requested";
		else if (!resLeft)
			return "line " + lineNumber + " : wrong type at the left of "+label+" which request an boolean";
		else
			return "line " + lineNumber + " : wrong type at the right of "+label+" which request an boolean";
	}	

}

//Ajout de Guillaume BRUNEAU, à vérifier
package fr.telecom.compil.exceptions;

import fr.telecom.compil.type.VarType;

public class BooleanIfConditionException extends SemanticException 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lineNumber;
	private VarType typeLeft, typeRight;
	private String label;
	
	public BooleanIfConditionException(int lineNumber, VarType typeLeft, VarType typeRight, String label) 
	{
		this.lineNumber=lineNumber;
		this.typeLeft=typeLeft;
		this.typeRight=typeRight;
		this.label=label;
	}

	@Override
	public String getErrorMessage() 
	{
		if (label.equals("VAR_REF"))
			return "line " + lineNumber + " : wrong type ; Boolean is requested";
		else 
			return "line " + lineNumber + " : wrong type of arguments in this "+label+" ; The first one has for type "+typeLeft+" when the second has for type "+typeRight;
		}	

}

//Ajout de Guillaume BRUNEAU
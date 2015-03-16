package fr.telecom.compil.exceptions;

public abstract class SemanticException extends Exception
{
	@Override
	public String getMessage()
	{
		return "Semantic Error : " + getErrorMessage();
	}
	
	public abstract String getErrorMessage();
}

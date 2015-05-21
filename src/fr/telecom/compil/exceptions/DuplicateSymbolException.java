package fr.telecom.compil.exceptions;

public class DuplicateSymbolException extends Exception
{
	private String symbolName;
	
	public DuplicateSymbolException(String symbolName)
	{
		this.symbolName = symbolName;
	}
	
	@Override
	public String getMessage()
	{
		return "Variable " + symbolName + " declared twice in the same scope";
	}
}
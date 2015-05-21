package fr.telecom.compil.exceptions;

public class SymbolNotFoundException extends Exception
{
	private String symbolName;
	
	public SymbolNotFoundException(String symbolName)
	{
		this.symbolName = symbolName;
	}
	
	@Override
	public String getMessage()
	{
		return "Variable " + symbolName + " not declared in scope";
	}
}
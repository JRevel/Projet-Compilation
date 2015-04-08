package fr.telecom.compil.exceptions;

public class NoReturnException extends SemanticException{
	private String functionName;
	private int lineNumber;
	
	public NoReturnException(String functionName, int lineNumber)
	{
		this.functionName = functionName;
		this.lineNumber = lineNumber;
	}
	
	@Override
	public String getErrorMessage()
	{
		return "Return missing in function " + functionName;
	}
}

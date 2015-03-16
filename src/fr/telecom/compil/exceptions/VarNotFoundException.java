package fr.telecom.compil.exceptions;

public class VarNotFoundException extends SemanticException
{
	String varName;
	int scopeId;
	
	public VarNotFoundException(String varName, int scopeId)
	{
		this.varName = varName;
		this.scopeId = scopeId;
	}
	
	@Override
	public String getErrorMessage()
	{
		return "Variable " + varName + " not defined in scope " + scopeId;
	}
	
}

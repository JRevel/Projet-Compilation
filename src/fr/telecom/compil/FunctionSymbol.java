package fr.telecom.compil;

import fr.telecom.compil.type.VarType;

public class FunctionSymbol extends ProcSymbol
{
	public VarType returnType;

	public FunctionSymbol(String name, VarType returnType, Symbol[] args, int scopeDepth)
	{
		super(name, args, scopeDepth);
		this.returnType = returnType;
	}
	
	public String toString()
	{
		String argString = "";
		for(int i=0; i<args.length; i++)
		{
			if(i != 0)
				argString += ", ";
			argString += args[i];
		}
		return returnType + " " + name + "(" + argString + ")" + " : " + scopeDepth;
	}
}
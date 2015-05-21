package fr.telecom.compil;

public class ProcSymbol
{
	public String name;
	public Symbol[] args;
	public int scopeDepth;

	public ProcSymbol(String name, Symbol[] args, int scopeDepth)
	{
		this.name = name;
		this.args = args;
		this.scopeDepth = scopeDepth;
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
		return "void " + name + "(" + argString + ")" + " : " + scopeDepth;
	}
}
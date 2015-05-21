package fr.telecom.compil;

import fr.telecom.compil.type.VarType;

public class Symbol
{
	public String name;
	public VarType type;
	public boolean adr;
	public int disp, depth;
	
	public Symbol(String name, VarType type, boolean adr, int disp, int depth)
	{
		this.name = name;
		this.type = type;
		this.adr = adr;
		this.disp = disp;
		this.depth = depth;
	}
	
	public String toString()
	{
		return name + " " + (adr ? "adr " : "") + type + "(disp : " + disp + ")";
	}
}

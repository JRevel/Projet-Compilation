package fr.telecom.compil.type;

public class BooleanType implements VarType {

	public String getName() {
		return "boolean";
	}

	public int getSize() {
		return 2;
	}
	
	@Override
	public String toString()
	{
		return getName();
	}

}

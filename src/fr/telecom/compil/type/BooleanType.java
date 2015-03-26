package fr.telecom.compil.type;

public class BooleanType implements VarType {

	@Override
	public String getName() {
		return "boolean";
	}

	@Override
	public int getSize() {
		return 2;
	}
	
	@Override
	public String toString()
	{
		return getName();
	}

}

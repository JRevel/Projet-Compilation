package fr.telecom.compil.type;

public class IntegerType implements VarType {

	public String getName() {
		return "integer";
	}
	
	@Override
	public String toString()
	{
		return getName();
	}

	public int getSize() {
		return 2;
	}

}

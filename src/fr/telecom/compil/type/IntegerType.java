package fr.telecom.compil.type;

public class IntegerType implements VarType {

	@Override
	public String getName() {
		return "integer";
	}
	
	@Override
	public String toString()
	{
		return getName();
	}

	@Override
	public int getSize() {
		return 4;
	}

}

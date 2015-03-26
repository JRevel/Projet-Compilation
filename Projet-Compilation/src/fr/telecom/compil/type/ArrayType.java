package fr.telecom.compil.type;

import java.util.ArrayList;

import fr.telecom.compil.SyntaxicTree;

public class ArrayType implements VarType
{
	private ArrayList<int[]> bounds = new ArrayList<int[]>();
	
	public ArrayType(ArrayList<int[]> bounds)
	{
		this.bounds = bounds;
	}
	
	public ArrayType(SyntaxicTree typeTree)
	{
		for(SyntaxicTree rangeTree : typeTree.getChildren("RANGE"))
		{
			int min = Integer.parseInt(rangeTree.getChild(0).getLabel());
			int max = Integer.parseInt(rangeTree.getChild(1).getLabel());
			bounds.add(new int[]{min, max});
		}
	}

	@Override
	public String getName() {
		String result =  "array[";
		for(int i=0; i<bounds.size(); i++)
		{
			if(i != 0)
				result += ", ";
			result += bounds.get(i)[0] + ".." + bounds.get(i)[1];
		}
		return result + ']';
	}
	
	@Override
	public String toString()
	{
		return getName();
	}

	@Override
	public int getSize() {
		int size = 1;
		for(int i=0; i<bounds.size(); i++)
		{
			size *= (bounds.get(i)[1]-bounds.get(i)[0]);
		}
		return size*4;
	}
	
}

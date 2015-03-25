package fr.telecom.compil.asm;

import java.util.ArrayList;

public class WriteInstruction implements Instruction
{
	private static int id = 0;
	private String text;
	
	public WriteInstruction(String text)
	{
		this.text = text;
	}

	@Override
	public ArrayList<String> genCode() {
		ArrayList<String> result = new ArrayList<String>();
		result.add("STR" + id + "	STRING	" + "\"" + text + "\"");
		result.add("	LDW	R0, #STR" + id);
		result.add("	TRP	#66");
		id++;
		return result;
	}
}

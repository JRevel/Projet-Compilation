package fr.telecom.compil.asm;

public class AsmGenerator {
	public AsmGenerator()
	{
		
	}
	
	public String genCode(Instruction inst)
	{
		String result = "";
		for(String s : inst.genCode())
			result += s + "\n";
		return result;
	}

	public String genInitCode(int i, int j) {
		return "	ORG 0x" + Integer.toHexString(i) + "\n" + "	START 0x" + Integer.toHexString(j) + "\n";
	}
	
	public String genEndCode()
	{
		return "\n	TRP #64\n";
	}
}

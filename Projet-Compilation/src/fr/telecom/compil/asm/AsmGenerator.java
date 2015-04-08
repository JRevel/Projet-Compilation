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
}

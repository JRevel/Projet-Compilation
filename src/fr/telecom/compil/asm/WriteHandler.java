package fr.telecom.compil.asm;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class WriteHandler implements TreeHandler
{
	public WriteHandler()
	{

	}

	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope)
	{
		SyntaxicTree child = tree.getChild();
		String result = scope.genVarLoad(gen, child, scope)
				+ "stw r0, -(sp)\n"
				+ "jsr @printval_\n"
				+ "adi sp, sp, #2\n";
		return result;
	}
}

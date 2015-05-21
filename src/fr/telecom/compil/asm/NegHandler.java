package fr.telecom.compil.asm;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class NegHandler implements TreeHandler
{

	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope)
	{
		String result = "";
		SyntaxicTree child = tree.getChild(0);
		TreeHandler handler = gen.getHandler(child);
		if(handler == null)
		{
			result += "ldw r0, #" + child.getLabel() + "\n";
		}
		else
		{
			result += handler.genCode(gen, child, scope);
		}
		result += "stw r0, -(sp)\n";
		
		result += "ldw r1, (sp)+\n"
				+ "ldw r2, #-1\n"
				+ "mul r1, r2, r0\n";
		return result;
	}

}

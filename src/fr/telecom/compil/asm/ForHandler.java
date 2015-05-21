package fr.telecom.compil.asm;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class ForHandler implements TreeHandler
{
	private static int forId = 0;

	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope) {
		String result = null;
		SyntaxicTree varName = tree.getChild("IT").getChild();
		SyntaxicTree rangeTree = tree.getChild("RANGE");
		int startValue = Integer.parseInt(rangeTree.getChild(0).getLabel());
		int endValue = Integer.parseInt(rangeTree.getChild(1).getLabel());
		String forLabel = "for"+(forId)+"_", endLabel = "endfor"+(forId)+"_";
		forId++;
		SyntaxicTree actionsTree = tree.getChild("INSTRUCTIONS");
		result = "ldw r0, #" + startValue + "\n // for init"
				+ scope.genVarAffect(gen, varName, scope)
				+ forLabel + " " + scope.genVarLoad(gen, varName, scope)
				+ "ldw r1, #" + endValue + "\n"
				+ "cmp r0, r1 \n"
				+ "bge 2\n"
				+ "bmp 2\n"
				+ "jea @" + endLabel + "\n for jump";
		
		for(int i=0; i<actionsTree.getChildCount(); i++)
		{
			SyntaxicTree child = actionsTree.getChild(i);
			System.out.println(child.getLabel());
			TreeHandler handler = gen.getHandler(child);
			result += handler.genCode(gen, child, scope);
		}
		result += scope.genVarLoad(gen, varName, scope)
				+ "ldw r1, #1\n"
				+ "add r0, r1, r0\n"
				+ scope.genVarAffect(gen, varName, scope)
				+ "jea @ " + forLabel + "\n end for"
				+ endLabel + " ";
		return result;
	}

}

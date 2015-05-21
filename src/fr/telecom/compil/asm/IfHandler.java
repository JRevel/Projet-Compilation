package fr.telecom.compil.asm;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class IfHandler implements TreeHandler
{
	private static int ifId = 0;

	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope) {
		SyntaxicTree condOpTree = tree.getChild("CONDITION").getChild();
		BooleanOpHandler condHandler = (BooleanOpHandler)gen.getHandler(condOpTree);
		String jumpLabel = "if"+(ifId)+"_", endLabel = "fi"+(ifId)+"_";
		ifId++;
		condHandler.setJumpAdress(jumpLabel);
		SyntaxicTree actionsTree = tree.getChild("THEN").getChild();
		TreeHandler thenHandler = gen.getHandler(actionsTree);
		SyntaxicTree elseTree = tree.getChild("ELSE").getChild();
		TreeHandler elseHandler = gen.getHandler(elseTree);
		String result = "//if\n" + condHandler.genCode(gen, condOpTree, scope)
				+ "//then\n" + thenHandler.genCode(gen, actionsTree, scope)
				+ "bmp " + endLabel + "-$-2\n"
				+ jumpLabel + " "
				+ "//else\n" + elseHandler.genCode(gen, elseTree, scope)
				+ endLabel + " ";
		return result;
	}

}

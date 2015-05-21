package fr.telecom.compil.asm;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class VarAffectHandler implements TreeHandler{

	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope) {
		TreeHandler handler = gen.getHandler(tree.getChild(1));
		String result = "";
		if(handler == null)
		{
			result += "ldw r0, #" + tree.getChild(1).getLabel() + "\n";
		}
		else
		{
			result += handler.genCode(gen, tree.getChild(1), scope);
		}
		result += scope.genVarAffect(gen, tree.getChild(0), scope);
		return result;
	}

}

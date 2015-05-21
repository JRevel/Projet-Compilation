package fr.telecom.compil.asm;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class VarRefHandler implements TreeHandler {

	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope) {
		return scope.genVarLoad(gen, tree, scope);
	}

}

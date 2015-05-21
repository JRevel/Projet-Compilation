package fr.telecom.compil.asm;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public interface TreeHandler
{
	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope); 
}

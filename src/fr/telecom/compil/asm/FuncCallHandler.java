package fr.telecom.compil.asm;

import fr.telecom.compil.FunctionSymbol;
import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class FuncCallHandler implements TreeHandler
{
	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope) {
		SyntaxicTree argsTree = tree.getChild("ARGS");
		String result = "//func init\n";
		for(int i=0; i<argsTree.getChildCount(); i++)
		{
			result += scope.genVarLoad(gen, argsTree.getChild(argsTree.getChildCount()-i-1), scope)
					+ "stw r0, -(sp)\n";
		}
		FunctionSymbol function = scope.getFunction(tree.getChild("NAME").getChild().getLabel());
		System.out.println(tree.getChild("NAME").getChild().getLabel());
		result += "ldw r10, #" + (scope.getDepth()-function.scopeDepth+1) + ""
				+ "// " + "function depth : " + function.scopeDepth + " " + ", Scope depth : " + scope.getDepth() + "\n";
		result += "jsr @function_" + function.name + "_ //func call\n"
				+ "ldw r1, r0\n";
		result += "ldw r0, #" + (2*argsTree.getChildCount()) + "\n"
				+ "add sp, r0, sp\n"
				+ "ldw r0, r1 //func call end\n";
		return result;
	}

}

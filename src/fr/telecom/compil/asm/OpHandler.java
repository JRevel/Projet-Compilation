package fr.telecom.compil.asm;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class OpHandler implements TreeHandler
{
	protected String opName;
	
	public OpHandler(String opName)
	{
		this.opName = opName;
	}

	public String genCode(AsmGenerator gen, SyntaxicTree tree, Scope scope) {
		String result = "";
		SyntaxicTree leftChild = tree.getChild(0), rightChild = tree.getChild(1);
		TreeHandler handlerLeft = gen.getHandler(leftChild);
		TreeHandler handlerRight = gen.getHandler(rightChild);
		if(handlerLeft == null)
		{
			result += "ldw r0, #" + leftChild.getLabel() + "\n";
		}
		else
		{
			result += handlerLeft.genCode(gen, leftChild, scope);
		}
		result += "stw r0, -(sp)\n";
		
		if(handlerRight == null)
		{
			result += "ldw r0, #" + rightChild.getLabel() + "\n";
		}
		else
		{
			result += handlerRight.genCode(gen, rightChild, scope);
		}
		result += "stw r0, -(sp)\n";
		
		result += "ldw r2, (sp)+\n"
				+ "ldw r1, (sp)+\n"
				+ genOpAction();
		return result;
	}
	
	public String genOpAction()
	{
		return opName + " r1, r2, r0\n";
	}

}

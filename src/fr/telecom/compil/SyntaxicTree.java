package fr.telecom.compil;

import java.util.ArrayList;

import org.antlr.runtime.tree.Tree;

public class SyntaxicTree
{
	private Tree tree;
	
	public SyntaxicTree(Tree tree)
	{
		this.tree = tree;
	} 
	
	public SyntaxicTree getChild(int id)
	{
		return new SyntaxicTree((Tree)(tree.getChild(id)));
	}
	
	public SyntaxicTree getChild()
	{
		return new SyntaxicTree((Tree)(tree.getChild(0)));
	}
	
	public SyntaxicTree getChild(String label)
	{
		for(int i=0; i<tree.getChildCount(); i++)
		{
			if(tree.getChild(i).toString().equals(label))
				return new SyntaxicTree(tree.getChild(i));
		}
		return null;
	}

	public String getLabel() {
		return ""+tree;
	}
	
	public String toString()
	{
		return getLabel();
	}

	public ArrayList<SyntaxicTree> getChildren(String label)
	{
		ArrayList<SyntaxicTree> result = new ArrayList<SyntaxicTree>();
		for(int i=0; i<tree.getChildCount(); i++)
		{
			if(tree.getChild(i).toString().equals(label))
				result.add(new SyntaxicTree(tree.getChild(i)));
		}
		return result;
	}

	public ArrayList<SyntaxicTree> getChildren() {
		ArrayList<SyntaxicTree> result = new ArrayList<SyntaxicTree>();
		for(int i=0; i<tree.getChildCount(); i++)
			result.add(new SyntaxicTree(tree.getChild(i)));
		return result;
	}

	public int getChildCount() {
		return tree.getChildCount();
	}
	
	public int getLineNumber()
	{
		return tree.getLine();
	}
	
	public int getPosInLine()
	{
		return tree.getCharPositionInLine();
	}
}

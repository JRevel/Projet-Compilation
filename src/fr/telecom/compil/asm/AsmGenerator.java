package fr.telecom.compil.asm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import fr.telecom.compil.Scope;
import fr.telecom.compil.SyntaxicTree;

public class AsmGenerator {
	Map<String, TreeHandler> instructionTypes = new HashMap<String, TreeHandler>();
	
	public AsmGenerator()
	{
		instructionTypes.put("WRITE", new WriteHandler());
		instructionTypes.put("=", new VarAffectHandler());
		instructionTypes.put("+", new OpHandler("add"));
		instructionTypes.put("-", new OpHandler("sub"));
		instructionTypes.put("*", new OpHandler("mul"));
		instructionTypes.put("/", new OpHandler("div"));
		instructionTypes.put("/", new OpHandler("div"));
		instructionTypes.put(">", new BooleanOpHandler("ble"));
		instructionTypes.put("<", new BooleanOpHandler("bge"));
		instructionTypes.put("VAR_REF", new VarRefHandler());
		instructionTypes.put("ARRAY_ACCESS", new VarRefHandler());
		instructionTypes.put("IF", new IfHandler());
		instructionTypes.put("NEG", new NegHandler());
		instructionTypes.put("FOR", new ForHandler());
		instructionTypes.put("RETURN", new ReturnHandler());
		instructionTypes.put("FUNC_CALL", new FuncCallHandler());
		instructionTypes.put("PROC_CALL", new FuncCallHandler());
	}
	
	public TreeHandler getHandler(SyntaxicTree tree)
	{
		return instructionTypes.get(tree.getLabel());
	}
	
	public String genCode(SyntaxicTree tree, Scope scope)
	{
		String result = "";
		for(int i=0; i<tree.getChildCount(); i++)
		{			
			TreeHandler handler = instructionTypes.get(tree.getChild(i).getLabel());
			if(handler != null)
				result += handler.genCode(this, tree.getChild(i), scope);
		}
		return result;
	}

	public String genInitCode(int i, int j) {
		String result = "";
		try {
			InputStream ips=new FileInputStream("inits.src");
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader buffer = new BufferedReader(ipsr);
			String line;
			while((line = buffer.readLine()) != null)
			{
				result += line + "\n";
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public String genScopeInit(Scope scope)
	{
		return "adi sp, sp, #-" + scope.getVarsSize() + "\n";
	}
	
	public String genMainEnd()
	{
		return "ldw sp, bp\n"
				+ "ldw bp, (sp)+\n"
				+ "trp #EXIT_EXC\n"
				+ "jea @main_\n";
	}
	
	public String genPrintCode()
	{
		String result = "";
		try {
			InputStream ips=new FileInputStream("print.src");
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader buffer = new BufferedReader(ipsr);
			String line;
			while((line = buffer.readLine()) != null)
			{
				result += line + "\n";
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}

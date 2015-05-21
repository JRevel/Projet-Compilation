package fr.telecom.compil;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import fr.telecom.compil.asm.AsmGenerator;


public class Main {
	public static void main(String[] args) throws org.antlr.runtime.RecognitionException
	{
		ANTLRInputStream input;
		try {
			// create a CharStream that reads from standard input
			input = new ANTLRInputStream(new FileInputStream("tests.txt"));
			// create a lexer that feeds off of input CharStream
			CompilLexer lexer = new CompilLexer(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			CompilParser parser = new CompilParser(tokens);
			// begin parsing at rule r
			SyntaxicTree AST = new SyntaxicTree((CommonTree)parser.program().getTree());
			SymbolTable symbols = new SymbolTable(AST);
			SemanticAnalyser.checkScope(AST, symbols);
			System.out.println(symbols);
			
			AsmGenerator gen = new AsmGenerator();
			try {
				FileOutputStream fileOut = new FileOutputStream("output.src");
				String code = "";
				code += gen.genInitCode(0xFF10, 0xFF60);
				code += symbols.getScope(0).genScopeVarAllocation();
				code += gen.genCode(AST.getChild("INSTRUCTIONS"), symbols.getScope(0));
				code += gen.genMainEnd();
				
				code += genFunctionCode(AST, symbols, gen);

				code += gen.genPrintCode();
				fileOut.write(code.getBytes());
				fileOut.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		runCommand("java -jar MicroPIUP/microPIUP.jar -ass output.src", false, true);
		runCommand("java -jar microPIUP/microPIUP.jar -batch output.iup", false, false);
	}
	
	private static int scopeToGen = 0;
	
	public static String genFunctionCode(SyntaxicTree AST, SymbolTable symbols, AsmGenerator gen)
	{
		String code = "";
		SyntaxicTree declTree = AST.getChild("DECLARATIONS");
		if(declTree == null)
				return code;
		ArrayList<SyntaxicTree> functionTrees = declTree.getChildren("FUNCTION");
		for(int i=0; i<functionTrees.size(); i++)
		{
			code += "function_" + functionTrees.get(i).getChild("PROTOTYPE").getChild("NAME").getChild().getLabel() + "_ ";
			System.out.println("function_" + functionTrees.get(i).getChild("PROTOTYPE").getChild("NAME").getChild().getLabel() + "_ ");
			Scope scope = symbols.getScope(++scopeToGen);
			code += scope.genScopeEntrance();
			code += scope.genScopeVarAllocation();
			code += gen.genCode(functionTrees.get(i).getChild("INSTRUCTIONS"), scope);
			code += genFunctionCode(functionTrees.get(i), symbols, gen);
			code += scope.genScopeEnd();
		}
		return code;
	}
	
	public static void runCommand(String command, boolean errorSilent, boolean outputSilent)
	{
		try {
			Runtime rt = Runtime.getRuntime();
	        Process proc = rt.exec(command);
	        StreamGobbler errorGobbler = new 
	            StreamGobbler(proc.getErrorStream(), "ERROR", errorSilent);            
	        
	        StreamGobbler outputGobbler = new 
	            StreamGobbler(proc.getInputStream(), "OUTPUT", outputSilent);
	            
	        errorGobbler.start();
	        outputGobbler.start();
	                                
	        int exitVal;
				exitVal = proc.waitFor();
	        System.out.println("ExitValue: " + exitVal);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

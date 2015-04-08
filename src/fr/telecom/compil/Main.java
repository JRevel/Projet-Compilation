package fr.telecom.compil;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import fr.telecom.compil.asm.AsmGenerator;
import fr.telecom.compil.asm.WriteInstruction;


public class Main {
	public static void main(String[] args)
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
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		AsmGenerator gen = new AsmGenerator();
		try {
			FileOutputStream fileOut = new FileOutputStream("output.src");
			String code = "";
			code += gen.genInitCode(0xFF10, 0xFF60);
			code += gen.genCode(new WriteInstruction("This is a test"));
			code += gen.genEndCode();
			fileOut.write(code.getBytes());
			fileOut.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			Process proc = Runtime.getRuntime().exec("java -jar microPIUP/microPIUP.jar -ass output.src");
			BufferedReader in = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
			String line;
			while((line = in.readLine()) != null)
			{
				System.err.println(line);
			}
			proc = Runtime.getRuntime().exec("java -jar microPIUP/microPIUP.jar -batch output.iup");
			in = new BufferedReader(new InputStreamReader(proc.getErrorStream()));
			while((line = in.readLine()) != null)
			{
				System.err.println(line);
			}
			in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			while((line = in.readLine()) != null)
			{
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

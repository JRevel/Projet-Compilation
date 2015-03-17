package fr.telecom.compil;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

import fr.telecom.compil.CompilParser.program_return;


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
	}
}

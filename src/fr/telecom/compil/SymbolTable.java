package fr.telecom.compil;

import java.util.ArrayList;

import fr.telecom.compil.exceptions.DuplicateSymbolException;
import fr.telecom.compil.exceptions.SymbolNotFoundException;

public class SymbolTable
{
	private ArrayList<Scope> scopes = new ArrayList<Scope>();
	
	public SymbolTable(SyntaxicTree AST)
	{
		try {
			Scope scope = new Scope(null, this);
			scope.loadAST(AST);
		} catch (DuplicateSymbolException e) {
			e.printStackTrace();
		}
	}
	
	public Scope getScope(int id)
	{
		return scopes.get(id);
	}
	
	public String toString()
	{
		String result = "";
		for(Scope scope : scopes)
		{
			result += "Scope " + scope.getId() + "\n" + scope;
		}
		return result;
	}

	public boolean hasSymbol(String varName, int scopeId)
	{
		Scope scope = scopes.get(scopeId);
		return (scope.hasSymbol(varName) || (scope.getParent() != null && hasSymbol(varName, scope.getParent().getId())));
	}
	
	public FunctionSymbol getFunction(String functionName, int scopeId) throws SymbolNotFoundException
	{
		FunctionSymbol symbol = scopes.get(scopeId).getFunction(functionName);
		if(symbol == null)
			throw new SymbolNotFoundException(functionName);
		return symbol;
	}
	
	public ProcSymbol getProc(String procName, int scopeId) throws SymbolNotFoundException
	{
		ProcSymbol symbol = scopes.get(scopeId).getProc(procName);
		if(symbol == null)
		{
			symbol = scopes.get(scopeId).getFunction(procName);
			if(symbol == null)
				throw new SymbolNotFoundException(procName);
		}
		return symbol;
	}
	
	public Symbol getSymbol(String name, int scopeId) throws SymbolNotFoundException {

		Scope scope = scopes.get(scopeId);
		return scope.getSymbol(name);
	}

	public int getScopeCount() {
		return scopes.size();
	}

	public void addScope(Scope scope) {
		scopes.add(scope);
	}
	
}
	

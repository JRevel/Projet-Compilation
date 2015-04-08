package fr.telecom.compil.exceptions;

public class RangeIntException extends SemanticException {

	@Override
	public String getErrorMessage() {
		return "The range should increase";
	}

}

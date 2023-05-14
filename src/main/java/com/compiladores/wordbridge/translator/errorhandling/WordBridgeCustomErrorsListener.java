package com.compiladores.wordbridge.translator.errorhandling;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class WordBridgeCustomErrorsListener extends BaseErrorListener {
	
	private WordBridgeCustomErrorsTable errorsTable;
	
	public WordBridgeCustomErrorsListener(WordBridgeCustomErrorsTable errorsTable) {
		this.errorsTable = errorsTable;
	}

	@Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String[] error = new String[3];
        error[0] = String.valueOf(line);
        error[1] = String.valueOf(charPositionInLine);
        error[2] = msg;
        this.errorsTable.addError(error);
    }

}

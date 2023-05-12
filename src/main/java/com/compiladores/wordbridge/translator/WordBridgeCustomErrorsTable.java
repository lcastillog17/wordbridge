package com.compiladores.wordbridge.translator;

import java.util.ArrayList;
import java.util.List;

public class WordBridgeCustomErrorsTable {
	
	private List<String[]> errors = new ArrayList<>();
	
	public String[] addError(String[] error) {
		errors.add(error);
		return error;
	}
	
	public List<String[]> getErrorsList() {
		return this.errors;
	}
	
	public int getSize() {
		return this.getErrorsList().size();
	}
	
	public boolean hasErrors() {
		return this.getSize() > 0;
	}
	
    public Object[][] getErrorsTable() {
        Object[][] matrix = new Object[this.getSize()][3];
        int i = 0;
        for (String[] error : this.getErrorsList()) {
        	matrix[i][0] = error[0];
            matrix[i][1] = error[1];
            matrix[i][2] = error[2];
            i++;
        }
        return matrix;
    }

}

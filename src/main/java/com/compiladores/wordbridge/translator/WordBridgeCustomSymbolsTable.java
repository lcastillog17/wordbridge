package com.compiladores.wordbridge.translator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBridgeCustomSymbolsTable {
	
	private List<String[]> symbols = new ArrayList<>();
	
	public String[] addSymbol(String[] symbol) {
		symbols.add(symbol);
		return symbol;
	}
	
	public List<String[]> getSymbolsList() {
		return this.symbols;
	}
	
	public int getSize() {
		return this.getSymbolsList().size();
	}
	
	public Object[][] getSymbolsTable() {
    	Object[][] matrix = new Object[this.getSize()][3];
        Map<String, Integer> symbolsMap = new HashMap<>();
        int i = 0;
        for (String[] symbol : this.getSymbolsList()) {
            String token = symbol[0];
            int firstRow = symbolsMap.getOrDefault(token, i);
            symbolsMap.putIfAbsent(token, i);
            matrix[i][0] = (firstRow == i) ? (i + 1) : matrix[firstRow][0];
            matrix[i][1] = token;
            matrix[i][2] = symbol[1];
            i++;
        }
        return matrix;
    }

}

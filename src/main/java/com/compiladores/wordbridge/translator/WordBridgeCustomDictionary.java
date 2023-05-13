package com.compiladores.wordbridge.translator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class WordBridgeCustomDictionary {
	
	private String filePath;
	private HashMap<String, String> dictionary = new HashMap<>();
	
	public WordBridgeCustomDictionary(String filePath) {
		this.filePath = filePath;
	}
	
	public void loadDictionary() {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                if (values.length >= 2) {
                    String word = values[0].trim();
                    String translation = values[1].trim();
                    dictionary.put(word, translation);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void setDictionary(String filePath) {
		this.filePath = filePath;
	}
	
	public HashMap<String, String> getDictionary() {
		return this.dictionary;
	}
	
	public String getTranslation(String word) {
		return this.getDictionary().getOrDefault(word, word);
	}

}

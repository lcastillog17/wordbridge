package com.compiladores.wordbridge.translator.vocabulary.spanish;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordBridgeCustomSpanishDictionary extends WordBridgeCustomDictionary{
	
	public WordBridgeCustomSpanishDictionary(String filePath) {
		super(filePath);
	}

	public void loadDictionary() {
		try (BufferedReader br = new BufferedReader(new FileReader(this.filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                if (values.length >= 2) {
                    String word = values[0].trim();
                    String translation = values[1].trim();
                    this.dictionary.put(word, translation);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}

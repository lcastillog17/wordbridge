package com.compiladores.wordbridge.translator.vocabulary.spanish;

import java.util.HashMap;

public abstract class WordBridgeCustomDictionary {

	protected String filePath;
	protected HashMap<String, String> dictionary = new HashMap<>();
	
	public WordBridgeCustomDictionary(String filePath) {
		this.filePath = filePath;
	}
	
	public abstract void loadDictionary();
	
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

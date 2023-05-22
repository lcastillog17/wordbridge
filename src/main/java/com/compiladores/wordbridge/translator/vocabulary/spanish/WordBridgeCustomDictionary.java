package com.compiladores.wordbridge.translator.vocabulary.spanish;

import java.util.HashMap;

import com.compiladores.wordbridge.translator.vocabulary.spanish.languages.Language;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Word;

public abstract class WordBridgeCustomDictionary<T extends Language> {

	protected String filePath;
	protected HashMap<String, T> dictionary = new HashMap<>();
	
	public WordBridgeCustomDictionary(String filePath) {
		this.filePath = filePath;
	}
	
	public abstract void loadDictionary();
	
	public void setDictionary(String filePath) {
		this.filePath = filePath;
	}
	
	public HashMap<String, T> getDictionary() {
		return this.dictionary;
	}
	
	@SuppressWarnings("unchecked")
	public T getWordRecord(String word) {
		return this.getDictionary().containsKey(word) ? this.getDictionary().get(word): (T) new Word(word);
	}
}

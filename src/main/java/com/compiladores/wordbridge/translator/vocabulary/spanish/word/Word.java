package com.compiladores.wordbridge.translator.vocabulary.spanish.word;

import com.compiladores.wordbridge.translator.vocabulary.spanish.languages.SpanishLanguage;

public class Word implements SpanishLanguage {

	protected String word;
	protected String englishTranslation;
	protected String category;
	
	public Word(String word) {
		this.word = word;
		this.englishTranslation = word;
		this.category = "UNKONWN";
	}
	
	public Word(String word, String englishTranslation, String category) {
		this.word = word;
		this.englishTranslation = englishTranslation;
		this.category = category;
	}

	public String getWord() {
		return word;
	}

	public String getEnglishTranslation() {
		return englishTranslation;
	}

	public String getCategory() {
		return category;
	}
	
}

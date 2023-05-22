package com.compiladores.wordbridge.translator.vocabulary.spanish.word;

public class Verb extends Word {
	
	private String tense;
	private String person;
	private String number;

	public Verb(String word, String englishTranslation, String category, String tense, String person, String number) {
		super(word, englishTranslation, category);
		this.tense = tense;
		this.person = person;
		this.number = number;
	}

	public String getTense() {
		return tense;
	}

	public String getPerson() {
		return person;
	}

	public String getNumber() {
		return number;
	}

}

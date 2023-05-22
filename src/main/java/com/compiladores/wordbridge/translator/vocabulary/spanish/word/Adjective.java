package com.compiladores.wordbridge.translator.vocabulary.spanish.word;

public class Adjective extends Word {

	private String gender;
	private String number;

	public Adjective(String word, String englishTranslation, String category, String gender, String number) {
		super(word, englishTranslation, category);
		this.gender = gender;
		this.number = number;
	}

	public String getGender() {
		return gender;
	}

	public String getNumber() {
		return number;
	}

}

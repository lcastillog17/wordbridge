package com.compiladores.wordbridge.translator.customtranslator;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.compiladores.wordbridge.translator.vocabulary.spanish.WordBridgeCustomSpanishDictionary;

public class WordBridgeCustomSpanishToEnglishTranslator implements WordBridgeCustomTranslator {

	private WordBridgeCustomSpanishDictionary dictionary;
	
	public WordBridgeCustomSpanishToEnglishTranslator(WordBridgeCustomSpanishDictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	private String getFullTranslation(String sentence, String translation) {
		String sentenceEnd = "";
		
		for (int i = sentence.length() - 1; i >= 0; i--) {
			char currentChar = sentence.charAt(i);
			if (currentChar == ' ' || currentChar == '.' || currentChar == '¿' || currentChar == '?') {
				sentenceEnd = currentChar + sentenceEnd;
			} else {
				break;
			}
		}
		
		String fullTranslation = translation + sentenceEnd;
		
		return fullTranslation;
	}
	
	private String translateSentence(String[] words) {
		return Arrays
	    		.asList(words)
	    		.stream()
	    	    .map(dictionary::getTranslation)
	    	    .collect(Collectors.joining(" "));
	}

	@Override
	public String translateStatement(String statement) {
	    String[] words = statement.split("[\\s\\.]+");

	    String translation = translateSentence(words);

	    return getFullTranslation(statement, translation);
	}

	@Override
	public String translateQuestion(String question) {
	    String[] words = question.split("[\\s\\¿\\?]+");

	    String translation = translateSentence(words);

	    return getFullTranslation(question, translation);
	}
	
	
}

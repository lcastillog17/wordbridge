package com.compiladores.wordbridge.translator.vocabulary.spanish;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.compiladores.wordbridge.translator.vocabulary.spanish.languages.SpanishLanguage;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Adjective;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Adverb;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Article;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Conjunction;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Contraction;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Interjection;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Noun;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Preposition;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Pronoun;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Verb;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Word;

public class WordBridgeCustomSpanishDictionary<T extends SpanishLanguage> extends WordBridgeCustomDictionary<T> {
	
	private final int WORD = 0;
	private final int CATEGORY = 1;
	private final int ENGLISH_TRANSLATION = 2;
	private final int TENSE = 3;
	private final int PERSON = 4;
	private final int NUMBER = 5;
	private final int GENDER = 6;
	
	public WordBridgeCustomSpanishDictionary(String filePath) {
		super(filePath);
	}

	@SuppressWarnings("unchecked")
	public void loadDictionary() {
		try (BufferedReader br = new BufferedReader(new FileReader(this.filePath))) {
            T wordRecord;
			String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                if (values.length >= 7) {

                    String word = values[WORD].trim();
                    String category = values[CATEGORY].trim();
                    String englishTranslation = values[ENGLISH_TRANSLATION].trim();
                    String tense = values[TENSE].trim();
                    String person = values[PERSON].trim();
                    String number = values[NUMBER].trim();
                    String gender = values[GENDER].trim();

                    if (category.equals("VERB")) {
                    	wordRecord = (T) new Verb(word, englishTranslation, category, tense, person, number);
                    } else if (category.equals("ARTICLE")) {
                    	wordRecord = (T) new Article(word, englishTranslation, category, gender, number);
                    } else if (category.equals("PRONOUN")) {
                    	wordRecord = (T) new Pronoun(word, englishTranslation, category);
                    } else if (category.equals("ADJECTIVE")) {
                    	wordRecord = (T) new Adjective(word, englishTranslation, category, gender, number);
                    } else if (category.equals("NOUN")) {
                    	wordRecord = (T) new Noun(word, englishTranslation, category, gender, number);
                    } else if (category.equals("ADVERB")) {
                    	wordRecord = (T) new Adverb(word, englishTranslation, category);
                    } else if (category.equals("PREPOSITION")) {
                    	wordRecord = (T) new Preposition(word, englishTranslation, category);
                    } else if (category.equals("CONJUNCTION")) {
                    	wordRecord = (T) new Conjunction(word, englishTranslation, category);
                    } else if (category.equals("INTERJECTION")) {
                    	wordRecord = (T) new Interjection(word, englishTranslation, category);
                    } else if (category.equals("CONTRACTION")) {
                    	wordRecord = (T) new Contraction(word, englishTranslation, category);
                    } else {
                    	wordRecord = (T) new Word(word, englishTranslation, category);
                    }
                    
                    this.dictionary.put(word, wordRecord);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}

package com.compiladores.wordbridge.translator.symbolhandling;

import org.antlr.v4.runtime.ParserRuleContext;

import com.compiladores.wordbridge.translator.WordBridgeParser.AdjectiveContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ArticleContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.NounContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.VerbContext;
import com.compiladores.wordbridge.translator.vocabulary.spanish.WordBridgeCustomDictionary;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Adjective;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Article;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Noun;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Verb;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Word;

public class WordBridgeCustomVisitorUtils {
	
	private WordBridgeCustomDictionary<Word> dictionary;
	public final String MISSING_SYMBOL_REGEX = "<missing .+>";
	
	public WordBridgeCustomVisitorUtils(WordBridgeCustomDictionary<Word> dictionary) {
		this.dictionary = dictionary;
	}
	
	public boolean isValidSymbol(ParserRuleContext ctx) {
	    return ctx != null && !ctx.getText().matches(MISSING_SYMBOL_REGEX);
	}
	
	public Article getArticleRecord(ArticleContext articleCtx) {
	    if (isValidSymbol(articleCtx)) {
	        try {
	            return (Article) dictionary.getWordRecord(articleCtx.getText());
	        } catch (ClassCastException ex) {
	            handleClassCastException(ex);
	        }
	    }
	    return null;
	}

	public Noun getNounRecord(NounContext nounCtx) {
	    if (isValidSymbol(nounCtx)) {
	        try {
	            return (Noun) dictionary.getWordRecord(nounCtx.getText());
	        } catch (ClassCastException ex) {
	            handleClassCastException(ex);
	        }
	    }
	    return null;
	}

	public Adjective getAdjectiveRecord(AdjectiveContext adjectiveCtx) {
	    if (isValidSymbol(adjectiveCtx)) {
	        try {
	            return (Adjective) dictionary.getWordRecord(adjectiveCtx.getText());
	        } catch (ClassCastException ex) {
	            handleClassCastException(ex);
	        }
	    }
	    return null;
	}
	
	public Verb getVerbRecord(VerbContext verbCtx) {
	    if (isValidSymbol(verbCtx)) {
	        try {
	            return (Verb) dictionary.getWordRecord(verbCtx.getText());
	        } catch (ClassCastException ex) {
	            handleClassCastException(ex);
	        }
	    }
	    return null;
	}

	public boolean isGrammaticNumberCorrect(ParserRuleContext firstCtx, ParserRuleContext secondCtx, String firstNumber, String secondNumber) {
	    return !isValidSymbol(firstCtx) || !isValidSymbol(secondCtx) || (!isValidSymbol(firstCtx) && !isValidSymbol(secondCtx)) || firstNumber.equals(secondNumber);
	}

	public boolean isGrammaticGenderCorrect(ParserRuleContext firstCtx, ParserRuleContext secondCtx, String firstGender, String secondGender) {
	    return !isValidSymbol(firstCtx) || !isValidSymbol(secondCtx) || (!isValidSymbol(firstCtx) && !isValidSymbol(secondCtx)) || firstGender.equals(secondGender);
	}

	private void handleClassCastException(ClassCastException ex) {
	    System.out.println("Error while trying to cast symbol type. Please check the existence of your input in the corresponding dictionary source.");
	    System.out.println(ex.getMessage());
	}
}

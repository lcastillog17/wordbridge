
package com.compiladores.wordbridge.translator.symbolhandling;

import java.util.ArrayList;
import java.util.List;

import com.compiladores.wordbridge.translator.WordBridgeBaseVisitor;
import com.compiladores.wordbridge.translator.WordBridgeParser.AdjectiveContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.AdverbContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ArticleContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ConjunctionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ContractionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.DotContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.InterjectionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.NounContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ParagraphContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.PredicateContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.PrepositionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.PronounContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.QuestionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.SentenceContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.StatementContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.SubjectContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.TextContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.VerbContext;
import com.compiladores.wordbridge.translator.customtranslator.WordBridgeCustomTranslator;
import com.compiladores.wordbridge.translator.errorhandling.WordBridgeCustomErrorsTable;
import com.compiladores.wordbridge.translator.vocabulary.spanish.WordBridgeCustomDictionary;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Adjective;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Article;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Noun;
import com.compiladores.wordbridge.translator.vocabulary.spanish.word.Word;

public class WordBridgeCustomVisitor extends WordBridgeBaseVisitor<String> {

	private WordBridgeCustomTranslator translator;
	private WordBridgeCustomSymbolsTable symbolsTable;
	private WordBridgeCustomErrorsTable errorsTable;
	private WordBridgeCustomVisitorUtils visitorUtils;
	
	public WordBridgeCustomVisitor(
			WordBridgeCustomDictionary<Word> dictionary,
			WordBridgeCustomTranslator translator,
			WordBridgeCustomSymbolsTable symbolsTable,
			WordBridgeCustomErrorsTable errorsTable
	) {
		this.translator = translator;
		this.symbolsTable = symbolsTable;
		this.errorsTable = errorsTable;
		this.visitorUtils = new WordBridgeCustomVisitorUtils(dictionary);
	}

	@Override
	public String visitText(TextContext ctx) {
		String translation = "";
		List<String> sentences = new ArrayList<>();

		// Recorrer los parrafos del texto
		for (ParagraphContext paragraph : ctx.paragraph()) {

			// Recorrer las oraciones del parrafo
			for (SentenceContext sentence : paragraph.sentence()) {
				
				// Verificar si se trata de una afirmacion
				if (sentence.statement() != null) {
					StatementContext statement = sentence.statement();
					translation = translator.translateStatement(statement.getText());
					
				// Verificar si se trata de una pregunta
				} else if (sentence.question() != null) {
					QuestionContext question = sentence.question();
					translation = translator.translateQuestion(question.getText());
				}
				
				// Agregar la traduccion a la lista
				sentences.add(translation);
			}
			
			// Verificar si hay un salto de linea
			if (paragraph.new_line() != null) {
				sentences.add("\n");
			}
	    }
		
	    String paragraphs = String.join("", sentences);
	    super.visitText(ctx);
	    return paragraphs;
    }
	
	@Override
	public String visitSubject(SubjectContext ctx) {
		
	    ArticleContext articleCtx = ctx.article();
	    NounContext nounCtx = ctx.noun();
	    AdjectiveContext adjectiveCtx = ctx.adjective();

	    Article articleRecord = visitorUtils.getArticleRecord(articleCtx);
	    Noun nounRecord = visitorUtils.getNounRecord(nounCtx);
	    Adjective adjectiveRecord = visitorUtils.getAdjectiveRecord(adjectiveCtx);

	    String articleNumber = articleRecord != null ? articleRecord.getNumber() : null;
		String nounNumber = nounRecord != null ? nounRecord.getNumber() : null;
		String adjectiveNumber = adjectiveRecord != null ? adjectiveRecord.getNumber() : null;
		
		String articleGender = articleRecord != null ? articleRecord.getGender() : null;
		String nounGender = nounRecord != null ? nounRecord.getGender() : null;
		String adjectiveGender = adjectiveRecord != null ? adjectiveRecord.getGender() : null;

	    boolean isGrammaticNumberCorrect = visitorUtils.isGrammaticNumberCorrect(articleCtx, nounCtx, articleNumber, nounNumber)
	            && visitorUtils.isGrammaticNumberCorrect(nounCtx, adjectiveCtx, nounNumber, adjectiveNumber)
	            && visitorUtils.isGrammaticNumberCorrect(articleCtx, adjectiveCtx, articleNumber, adjectiveNumber);

	    boolean isGrammaticGenderCorrect = visitorUtils.isGrammaticGenderCorrect(articleCtx, nounCtx, articleGender, nounGender)
	            && visitorUtils.isGrammaticGenderCorrect(nounCtx, adjectiveCtx, nounGender, adjectiveGender)
	            && visitorUtils.isGrammaticGenderCorrect(articleCtx, adjectiveCtx, articleGender, adjectiveGender);

	    if (!isGrammaticNumberCorrect) {
	        errorsTable.addError(new String[] {"", "", "Semantic Error: Incorrect Grammatic Number"});
	    }

	    if (!isGrammaticGenderCorrect) {
	        errorsTable.addError(new String[] {"", "", "Semantic Error: Incorrect Grammatic Gender"});
	    }

	    return super.visitSubject(ctx);
	}

	@Override
	public String visitPredicate(PredicateContext ctx) {

		return super.visitPredicate(ctx);
	}

	@Override
	public String visitVerb(VerbContext ctx) {
		String token = "Verbo";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitVerb(ctx);
	}

	@Override
	public String visitArticle(ArticleContext ctx) {
		String token = "Articulo";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitArticle(ctx);
	}
	
	@Override
	public String visitPronoun(PronounContext ctx) {
		String token = "Pronombre";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitPronoun(ctx);
	}

	@Override
	public String visitAdjective(AdjectiveContext ctx) {
		String token = "Adjetivo";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitAdjective(ctx);
	}

	@Override
	public String visitNoun(NounContext ctx) {
		String token = "Sustantivo";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitNoun(ctx);
	}

	@Override
	public String visitAdverb(AdverbContext ctx) {
		String token = "Adverbio";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitAdverb(ctx);
	}

	@Override
	public String visitPreposition(PrepositionContext ctx) {
		String token = "Preposicion";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitPreposition(ctx);
	}

	@Override
	public String visitConjunction(ConjunctionContext ctx) {
		String token = "Conjuncion";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitConjunction(ctx);
	}

	@Override
	public String visitInterjection(InterjectionContext ctx) {
		String token = "Interjeccion";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitInterjection(ctx);
	}

	@Override
	public String visitContraction(ContractionContext ctx) {
		String token = "Contraccion";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitContraction(ctx);
	}

	@Override
	public String visitDot(DotContext ctx) {
		String token = "Punto";
		String lexema = String.valueOf(ctx.getText());
		if (!lexema.matches(visitorUtils.MISSING_SYMBOL_REGEX)) {
			symbolsTable.addSymbol(new String[] {token, lexema});			
		}
		return super.visitDot(ctx);
	}

}

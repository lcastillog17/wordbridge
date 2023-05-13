
package com.compiladores.wordbridge.translator;

import java.util.ArrayList;
import java.util.List;

import com.compiladores.wordbridge.translator.WordBridgeParser.AdjectiveContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.AdverbContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ArticleContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ConjunctionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ContractionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.DotContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.InterjectionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.NounContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ParagraphContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.PrepositionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.SentenceContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.StatementContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.TextContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.VerbContext;

public class WordBridgeCustomVisitor extends WordBridgeBaseVisitor<String> {

	private WordBridgeCustomTranslator translator;
	private WordBridgeCustomSymbolsTable symbolsTable;
	
	public WordBridgeCustomVisitor(WordBridgeCustomTranslator translator, WordBridgeCustomSymbolsTable symbolsTable) {
		this.translator = translator;
		this.symbolsTable = symbolsTable;
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
	public String visitVerb(VerbContext ctx) {
		String token = "Verbo";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitVerb(ctx);
	}

	@Override
	public String visitArticle(ArticleContext ctx) {
		String token = "Articulo";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitArticle(ctx);
	}

	@Override
	public String visitAdjective(AdjectiveContext ctx) {
		String token = "Adjetivo";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitAdjective(ctx);
	}

	@Override
	public String visitNoun(NounContext ctx) {
		String token = "Sustantivo";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitNoun(ctx);
	}

	@Override
	public String visitAdverb(AdverbContext ctx) {
		String token = "Adverbio";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitAdverb(ctx);
	}

	@Override
	public String visitPreposition(PrepositionContext ctx) {
		String token = "Preposicion";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitPreposition(ctx);
	}

	@Override
	public String visitConjunction(ConjunctionContext ctx) {
		String token = "Conjuncion";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitConjunction(ctx);
	}

	@Override
	public String visitInterjection(InterjectionContext ctx) {
		String token = "Interjeccion";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitInterjection(ctx);
	}

	@Override
	public String visitContraction(ContractionContext ctx) {
		String token = "Contraccion";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitContraction(ctx);
	}

	@Override
	public String visitDot(DotContext ctx) {
		String token = "Punto";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitDot(ctx);
	}

}

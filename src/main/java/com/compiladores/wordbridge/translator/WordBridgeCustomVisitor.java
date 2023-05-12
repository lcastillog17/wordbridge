
package com.compiladores.wordbridge.translator;

import com.compiladores.wordbridge.translator.WordBridgeParser.AdjectiveContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.AdverbContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ArticleContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ConjunctionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ContractionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.DotContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.InterjectionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.NounContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ObjectContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.ParagraphContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.PredicateContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.PrepositionContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.SentenceContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.StatementContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.SubjectContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.TextContext;
import com.compiladores.wordbridge.translator.WordBridgeParser.VerbContext;

public class WordBridgeCustomVisitor extends WordBridgeBaseVisitor<Void> {

	private WordBridgeCustomSymbolsTable symbolsTable = new WordBridgeCustomSymbolsTable();
	
	public WordBridgeCustomVisitor(WordBridgeCustomSymbolsTable symbolsTable) {
		this.symbolsTable = symbolsTable;
	}

	@Override
	public Void visitText(TextContext ctx) {
		// TODO Auto-generated method stub
		return super.visitText(ctx);
	}

	@Override
	public Void visitParagraph(ParagraphContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParagraph(ctx);
	}

	@Override
	public Void visitSentence(SentenceContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSentence(ctx);
	}

	@Override
	public Void visitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		return super.visitStatement(ctx);
	}

	@Override
	public Void visitSubject(SubjectContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSubject(ctx);
	}

	@Override
	public Void visitPredicate(PredicateContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPredicate(ctx);
	}

	@Override
	public Void visitObject(ObjectContext ctx) {
		// TODO Auto-generated method stub
		return super.visitObject(ctx);
	}

	@Override
	public Void visitVerb(VerbContext ctx) {
		String token = "Verbo";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitVerb(ctx);
	}

	@Override
	public Void visitArticle(ArticleContext ctx) {
		String token = "Articulo";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitArticle(ctx);
	}

	@Override
	public Void visitAdjective(AdjectiveContext ctx) {
		String token = "Adjetivo";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitAdjective(ctx);
	}

	@Override
	public Void visitNoun(NounContext ctx) {
		String token = "Sustantivo";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitNoun(ctx);
	}

	@Override
	public Void visitAdverb(AdverbContext ctx) {
		String token = "Adverbio";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitAdverb(ctx);
	}

	@Override
	public Void visitPreposition(PrepositionContext ctx) {
		String token = "Preposicion";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitPreposition(ctx);
	}

	@Override
	public Void visitConjunction(ConjunctionContext ctx) {
		String token = "Conjuncion";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitConjunction(ctx);
	}

	@Override
	public Void visitInterjection(InterjectionContext ctx) {
		String token = "Interjeccion";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitInterjection(ctx);
	}

	@Override
	public Void visitContraction(ContractionContext ctx) {
		String token = "Contraccion";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitContraction(ctx);
	}

	@Override
	public Void visitDot(DotContext ctx) {
		String token = "Punto";
		String lexema = String.valueOf(ctx.getText());
		symbolsTable.addSymbol(new String[] {token, lexema});
		return super.visitDot(ctx);
	}

}

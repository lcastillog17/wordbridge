// Generated from com/compiladores/wordbridge/translator/Words.g4 by ANTLR 4.5.1
package com.compiladores.wordbridge.translator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WordsParser}.
 */
public interface WordsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WordsParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(WordsParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(WordsParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordsParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(WordsParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(WordsParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordsParser#adjective}.
	 * @param ctx the parse tree
	 */
	void enterAdjective(WordsParser.AdjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#adjective}.
	 * @param ctx the parse tree
	 */
	void exitAdjective(WordsParser.AdjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordsParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(WordsParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(WordsParser.NounContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordsParser#adverb}.
	 * @param ctx the parse tree
	 */
	void enterAdverb(WordsParser.AdverbContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#adverb}.
	 * @param ctx the parse tree
	 */
	void exitAdverb(WordsParser.AdverbContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordsParser#preposition}.
	 * @param ctx the parse tree
	 */
	void enterPreposition(WordsParser.PrepositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#preposition}.
	 * @param ctx the parse tree
	 */
	void exitPreposition(WordsParser.PrepositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordsParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(WordsParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(WordsParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordsParser#interjection}.
	 * @param ctx the parse tree
	 */
	void enterInterjection(WordsParser.InterjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#interjection}.
	 * @param ctx the parse tree
	 */
	void exitInterjection(WordsParser.InterjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordsParser#contraction}.
	 * @param ctx the parse tree
	 */
	void enterContraction(WordsParser.ContractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordsParser#contraction}.
	 * @param ctx the parse tree
	 */
	void exitContraction(WordsParser.ContractionContext ctx);
}
// Generated from com/compiladores/wordbridge/translator/Words.g4 by ANTLR 4.5.1
package com.compiladores.wordbridge.translator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WordsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WordsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WordsParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(WordsParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordsParser#article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(WordsParser.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordsParser#adjective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjective(WordsParser.AdjectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordsParser#noun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun(WordsParser.NounContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordsParser#adverb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdverb(WordsParser.AdverbContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordsParser#preposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreposition(WordsParser.PrepositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordsParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(WordsParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordsParser#interjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterjection(WordsParser.InterjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordsParser#contraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContraction(WordsParser.ContractionContext ctx);
}
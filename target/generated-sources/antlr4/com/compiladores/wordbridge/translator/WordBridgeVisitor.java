// Generated from com/compiladores/wordbridge/translator/WordBridge.g4 by ANTLR 4.5.1
package com.compiladores.wordbridge.translator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WordBridgeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WordBridgeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(WordBridgeParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(WordBridgeParser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(WordBridgeParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(WordBridgeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(WordBridgeParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(WordBridgeParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(WordBridgeParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#noun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoun(WordBridgeParser.NounContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#adjective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdjective(WordBridgeParser.AdjectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#article}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArticle(WordBridgeParser.ArticleContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#pronoun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPronoun(WordBridgeParser.PronounContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(WordBridgeParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#adverb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdverb(WordBridgeParser.AdverbContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#preposition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreposition(WordBridgeParser.PrepositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(WordBridgeParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#interjection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterjection(WordBridgeParser.InterjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#contraction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContraction(WordBridgeParser.ContractionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDot(WordBridgeParser.DotContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#new_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_line(WordBridgeParser.New_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link WordBridgeParser#white_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhite_space(WordBridgeParser.White_spaceContext ctx);
}
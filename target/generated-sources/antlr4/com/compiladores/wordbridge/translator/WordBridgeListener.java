// Generated from com/compiladores/wordbridge/translator/WordBridge.g4 by ANTLR 4.5.1
package com.compiladores.wordbridge.translator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WordBridgeParser}.
 */
public interface WordBridgeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(WordBridgeParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(WordBridgeParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(WordBridgeParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(WordBridgeParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(WordBridgeParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(WordBridgeParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(WordBridgeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(WordBridgeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(WordBridgeParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(WordBridgeParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(WordBridgeParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(WordBridgeParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(WordBridgeParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(WordBridgeParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#noun}.
	 * @param ctx the parse tree
	 */
	void enterNoun(WordBridgeParser.NounContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#noun}.
	 * @param ctx the parse tree
	 */
	void exitNoun(WordBridgeParser.NounContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#adjective}.
	 * @param ctx the parse tree
	 */
	void enterAdjective(WordBridgeParser.AdjectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#adjective}.
	 * @param ctx the parse tree
	 */
	void exitAdjective(WordBridgeParser.AdjectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(WordBridgeParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(WordBridgeParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void enterPronoun(WordBridgeParser.PronounContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#pronoun}.
	 * @param ctx the parse tree
	 */
	void exitPronoun(WordBridgeParser.PronounContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(WordBridgeParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(WordBridgeParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#adverb}.
	 * @param ctx the parse tree
	 */
	void enterAdverb(WordBridgeParser.AdverbContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#adverb}.
	 * @param ctx the parse tree
	 */
	void exitAdverb(WordBridgeParser.AdverbContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#preposition}.
	 * @param ctx the parse tree
	 */
	void enterPreposition(WordBridgeParser.PrepositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#preposition}.
	 * @param ctx the parse tree
	 */
	void exitPreposition(WordBridgeParser.PrepositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(WordBridgeParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(WordBridgeParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#interjection}.
	 * @param ctx the parse tree
	 */
	void enterInterjection(WordBridgeParser.InterjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#interjection}.
	 * @param ctx the parse tree
	 */
	void exitInterjection(WordBridgeParser.InterjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#contraction}.
	 * @param ctx the parse tree
	 */
	void enterContraction(WordBridgeParser.ContractionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#contraction}.
	 * @param ctx the parse tree
	 */
	void exitContraction(WordBridgeParser.ContractionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(WordBridgeParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(WordBridgeParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#new_line}.
	 * @param ctx the parse tree
	 */
	void enterNew_line(WordBridgeParser.New_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#new_line}.
	 * @param ctx the parse tree
	 */
	void exitNew_line(WordBridgeParser.New_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link WordBridgeParser#white_space}.
	 * @param ctx the parse tree
	 */
	void enterWhite_space(WordBridgeParser.White_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WordBridgeParser#white_space}.
	 * @param ctx the parse tree
	 */
	void exitWhite_space(WordBridgeParser.White_spaceContext ctx);
}
// Generated from com/compiladores/wordbridge/translator/WordBridge.g4 by ANTLR 4.5.1
package com.compiladores.wordbridge.translator;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WordBridgeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOUN=1, POSSESSIVE_ADJECTIVE=2, DEMONSTRATIVE_ADJECTIVE=3, QUALIFYING_ADJECTIVE=4, 
		CARDINAL_ADJECTIVE=5, ORDINAL_ADJECTIVE=6, INDEFINITE_ADJECTIVE=7, DEFINITE_ARTICLE=8, 
		INDEFINITE_ARTICLE=9, PERSONAL_PRONOUN=10, NUMERAL_PRONOUN=11, DEMOSTRATIVE_PRONOUN=12, 
		INTERROGATIVE_PRONOUN=13, PRESENT_TENSE_VERB=14, TIME_ADVERB=15, PLACE_ADVERB=16, 
		QUANTITY_ADVERB=17, MODE_ADVERB=18, AFFIRMATION_ADVERB=19, NEGATION_ADVERB=20, 
		DOUBT_ADVERB=21, PREPOSITION=22, COORDINATING_CONJUNCTION=23, SUBORDINANT_CONJUNCTION=24, 
		INTERJECTION=25, CONTRACTION=26, DOT=27, NEW_LINE=28, WHITE_SPACE=29, 
		UNRECOGNIZED=30;
	public static final int
		RULE_text = 0, RULE_paragraph = 1, RULE_sentence = 2, RULE_statement = 3, 
		RULE_subject = 4, RULE_predicate = 5, RULE_object = 6, RULE_noun = 7, 
		RULE_adjective = 8, RULE_article = 9, RULE_pronoun = 10, RULE_verb = 11, 
		RULE_adverb = 12, RULE_preposition = 13, RULE_conjunction = 14, RULE_interjection = 15, 
		RULE_contraction = 16, RULE_dot = 17, RULE_new_line = 18, RULE_white_space = 19;
	public static final String[] ruleNames = {
		"text", "paragraph", "sentence", "statement", "subject", "predicate", 
		"object", "noun", "adjective", "article", "pronoun", "verb", "adverb", 
		"preposition", "conjunction", "interjection", "contraction", "dot", "new_line", 
		"white_space"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOUN", "POSSESSIVE_ADJECTIVE", "DEMONSTRATIVE_ADJECTIVE", "QUALIFYING_ADJECTIVE", 
		"CARDINAL_ADJECTIVE", "ORDINAL_ADJECTIVE", "INDEFINITE_ADJECTIVE", "DEFINITE_ARTICLE", 
		"INDEFINITE_ARTICLE", "PERSONAL_PRONOUN", "NUMERAL_PRONOUN", "DEMOSTRATIVE_PRONOUN", 
		"INTERROGATIVE_PRONOUN", "PRESENT_TENSE_VERB", "TIME_ADVERB", "PLACE_ADVERB", 
		"QUANTITY_ADVERB", "MODE_ADVERB", "AFFIRMATION_ADVERB", "NEGATION_ADVERB", 
		"DOUBT_ADVERB", "PREPOSITION", "COORDINATING_CONJUNCTION", "SUBORDINANT_CONJUNCTION", 
		"INTERJECTION", "CONTRACTION", "DOT", "NEW_LINE", "WHITE_SPACE", "UNRECOGNIZED"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WordBridge.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WordBridgeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TextContext extends ParserRuleContext {
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOUN) | (1L << DEFINITE_ARTICLE) | (1L << INDEFINITE_ARTICLE) | (1L << NEW_LINE))) != 0)) {
				{
				setState(40);
				paragraph();
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(41);
						new_line();
						setState(42);
						paragraph();
						}
						} 
					}
					setState(48);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(49);
					new_line();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParagraphContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<New_lineContext> new_line() {
			return getRuleContexts(New_lineContext.class);
		}
		public New_lineContext new_line(int i) {
			return getRuleContext(New_lineContext.class,i);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitParagraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitParagraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paragraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(57);
				new_line();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			sentence();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOUN) | (1L << DEFINITE_ARTICLE) | (1L << INDEFINITE_ARTICLE))) != 0)) {
				{
				{
				setState(64);
				sentence();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public White_spaceContext white_space() {
			return getRuleContext(White_spaceContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			subject();
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(73);
				predicate();
				}
				break;
			}
			setState(77);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(76);
				dot();
				}
			}

			setState(80);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(79);
				white_space();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
		}
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_la = _input.LA(1);
			if (_la==DEFINITE_ARTICLE || _la==INDEFINITE_ARTICLE) {
				{
				setState(82);
				article();
				setState(83);
				white_space();
				}
			}

			setState(87);
			noun();
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(88);
				white_space();
				setState(89);
				adjective();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public White_spaceContext white_space() {
			return getRuleContext(White_spaceContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			white_space();
			setState(94);
			verb();
			setState(95);
			object();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
		}
		public AdverbContext adverb() {
			return getRuleContext(AdverbContext.class,0);
		}
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public AdjectiveContext adjective() {
			return getRuleContext(AdjectiveContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(97);
				white_space();
				setState(98);
				adverb();
				}
				break;
			}
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(102);
				white_space();
				setState(103);
				article();
				}
				break;
			}
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(107);
				white_space();
				setState(108);
				noun();
				}
				break;
			}
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(112);
				white_space();
				setState(113);
				adjective();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NounContext extends ParserRuleContext {
		public TerminalNode NOUN() { return getToken(WordBridgeParser.NOUN, 0); }
		public NounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterNoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitNoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitNoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NounContext noun() throws RecognitionException {
		NounContext _localctx = new NounContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_noun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(NOUN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdjectiveContext extends ParserRuleContext {
		public TerminalNode POSSESSIVE_ADJECTIVE() { return getToken(WordBridgeParser.POSSESSIVE_ADJECTIVE, 0); }
		public TerminalNode DEMONSTRATIVE_ADJECTIVE() { return getToken(WordBridgeParser.DEMONSTRATIVE_ADJECTIVE, 0); }
		public TerminalNode QUALIFYING_ADJECTIVE() { return getToken(WordBridgeParser.QUALIFYING_ADJECTIVE, 0); }
		public TerminalNode CARDINAL_ADJECTIVE() { return getToken(WordBridgeParser.CARDINAL_ADJECTIVE, 0); }
		public TerminalNode ORDINAL_ADJECTIVE() { return getToken(WordBridgeParser.ORDINAL_ADJECTIVE, 0); }
		public TerminalNode INDEFINITE_ADJECTIVE() { return getToken(WordBridgeParser.INDEFINITE_ADJECTIVE, 0); }
		public AdjectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adjective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterAdjective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitAdjective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitAdjective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdjectiveContext adjective() throws RecognitionException {
		AdjectiveContext _localctx = new AdjectiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_adjective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << POSSESSIVE_ADJECTIVE) | (1L << DEMONSTRATIVE_ADJECTIVE) | (1L << QUALIFYING_ADJECTIVE) | (1L << CARDINAL_ADJECTIVE) | (1L << ORDINAL_ADJECTIVE) | (1L << INDEFINITE_ADJECTIVE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArticleContext extends ParserRuleContext {
		public TerminalNode DEFINITE_ARTICLE() { return getToken(WordBridgeParser.DEFINITE_ARTICLE, 0); }
		public TerminalNode INDEFINITE_ARTICLE() { return getToken(WordBridgeParser.INDEFINITE_ARTICLE, 0); }
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitArticle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitArticle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==DEFINITE_ARTICLE || _la==INDEFINITE_ARTICLE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PronounContext extends ParserRuleContext {
		public TerminalNode PERSONAL_PRONOUN() { return getToken(WordBridgeParser.PERSONAL_PRONOUN, 0); }
		public TerminalNode NUMERAL_PRONOUN() { return getToken(WordBridgeParser.NUMERAL_PRONOUN, 0); }
		public TerminalNode DEMOSTRATIVE_PRONOUN() { return getToken(WordBridgeParser.DEMOSTRATIVE_PRONOUN, 0); }
		public TerminalNode INTERROGATIVE_PRONOUN() { return getToken(WordBridgeParser.INTERROGATIVE_PRONOUN, 0); }
		public PronounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pronoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterPronoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitPronoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitPronoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PronounContext pronoun() throws RecognitionException {
		PronounContext _localctx = new PronounContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pronoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERSONAL_PRONOUN) | (1L << NUMERAL_PRONOUN) | (1L << DEMOSTRATIVE_PRONOUN) | (1L << INTERROGATIVE_PRONOUN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode PRESENT_TENSE_VERB() { return getToken(WordBridgeParser.PRESENT_TENSE_VERB, 0); }
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitVerb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitVerb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(PRESENT_TENSE_VERB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdverbContext extends ParserRuleContext {
		public TerminalNode TIME_ADVERB() { return getToken(WordBridgeParser.TIME_ADVERB, 0); }
		public TerminalNode PLACE_ADVERB() { return getToken(WordBridgeParser.PLACE_ADVERB, 0); }
		public TerminalNode QUANTITY_ADVERB() { return getToken(WordBridgeParser.QUANTITY_ADVERB, 0); }
		public TerminalNode MODE_ADVERB() { return getToken(WordBridgeParser.MODE_ADVERB, 0); }
		public TerminalNode AFFIRMATION_ADVERB() { return getToken(WordBridgeParser.AFFIRMATION_ADVERB, 0); }
		public TerminalNode NEGATION_ADVERB() { return getToken(WordBridgeParser.NEGATION_ADVERB, 0); }
		public TerminalNode DOUBT_ADVERB() { return getToken(WordBridgeParser.DOUBT_ADVERB, 0); }
		public AdverbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adverb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterAdverb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitAdverb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitAdverb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdverbContext adverb() throws RecognitionException {
		AdverbContext _localctx = new AdverbContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_adverb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIME_ADVERB) | (1L << PLACE_ADVERB) | (1L << QUANTITY_ADVERB) | (1L << MODE_ADVERB) | (1L << AFFIRMATION_ADVERB) | (1L << NEGATION_ADVERB) | (1L << DOUBT_ADVERB))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrepositionContext extends ParserRuleContext {
		public TerminalNode PREPOSITION() { return getToken(WordBridgeParser.PREPOSITION, 0); }
		public PrepositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterPreposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitPreposition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitPreposition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrepositionContext preposition() throws RecognitionException {
		PrepositionContext _localctx = new PrepositionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_preposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(PREPOSITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConjunctionContext extends ParserRuleContext {
		public TerminalNode COORDINATING_CONJUNCTION() { return getToken(WordBridgeParser.COORDINATING_CONJUNCTION, 0); }
		public TerminalNode SUBORDINANT_CONJUNCTION() { return getToken(WordBridgeParser.SUBORDINANT_CONJUNCTION, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==COORDINATING_CONJUNCTION || _la==SUBORDINANT_CONJUNCTION) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterjectionContext extends ParserRuleContext {
		public TerminalNode INTERJECTION() { return getToken(WordBridgeParser.INTERJECTION, 0); }
		public InterjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterInterjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitInterjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitInterjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterjectionContext interjection() throws RecognitionException {
		InterjectionContext _localctx = new InterjectionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(INTERJECTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContractionContext extends ParserRuleContext {
		public TerminalNode CONTRACTION() { return getToken(WordBridgeParser.CONTRACTION, 0); }
		public ContractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterContraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitContraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitContraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractionContext contraction() throws RecognitionException {
		ContractionContext _localctx = new ContractionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_contraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(CONTRACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(WordBridgeParser.DOT, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitDot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitDot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_lineContext extends ParserRuleContext {
		public TerminalNode NEW_LINE() { return getToken(WordBridgeParser.NEW_LINE, 0); }
		public New_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterNew_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitNew_line(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitNew_line(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_lineContext new_line() throws RecognitionException {
		New_lineContext _localctx = new New_lineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_new_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(NEW_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class White_spaceContext extends ParserRuleContext {
		public TerminalNode WHITE_SPACE() { return getToken(WordBridgeParser.WHITE_SPACE, 0); }
		public White_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_white_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterWhite_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitWhite_space(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitWhite_space(this);
			else return visitor.visitChildren(this);
		}
	}

	public final White_spaceContext white_space() throws RecognitionException {
		White_spaceContext _localctx = new White_spaceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_white_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(WHITE_SPACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3 \u0092\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\5\2:\n\2\3\3\7\3=\n\3\f\3\16\3@\13\3"+
		"\3\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\5\3\5\5\5M\n\5\3\5\5\5P\n\5"+
		"\3\5\5\5S\n\5\3\6\3\6\3\6\5\6X\n\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\5\bg\n\b\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\b\5\bq\n\b"+
		"\3\b\3\b\3\b\5\bv\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\7\3\2\4"+
		"\t\3\2\n\13\3\2\f\17\3\2\21\27\3\2\31\32\u008b\29\3\2\2\2\4>\3\2\2\2\6"+
		"H\3\2\2\2\bJ\3\2\2\2\nW\3\2\2\2\f_\3\2\2\2\16f\3\2\2\2\20w\3\2\2\2\22"+
		"y\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\177\3\2\2\2\32\u0081\3\2\2\2\34\u0083"+
		"\3\2\2\2\36\u0085\3\2\2\2 \u0087\3\2\2\2\"\u0089\3\2\2\2$\u008b\3\2\2"+
		"\2&\u008d\3\2\2\2(\u008f\3\2\2\2*\60\5\4\3\2+,\5&\24\2,-\5\4\3\2-/\3\2"+
		"\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\66\3\2\2\2\62"+
		"\60\3\2\2\2\63\65\5&\24\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67"+
		"\3\2\2\2\67:\3\2\2\28\66\3\2\2\29*\3\2\2\29:\3\2\2\2:\3\3\2\2\2;=\5&\24"+
		"\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AE\5\6\4"+
		"\2BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GE\3\2"+
		"\2\2HI\5\b\5\2I\7\3\2\2\2JL\5\n\6\2KM\5\f\7\2LK\3\2\2\2LM\3\2\2\2MO\3"+
		"\2\2\2NP\5$\23\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\5(\25\2RQ\3\2\2\2RS\3"+
		"\2\2\2S\t\3\2\2\2TU\5\24\13\2UV\5(\25\2VX\3\2\2\2WT\3\2\2\2WX\3\2\2\2"+
		"XY\3\2\2\2Y]\5\20\t\2Z[\5(\25\2[\\\5\22\n\2\\^\3\2\2\2]Z\3\2\2\2]^\3\2"+
		"\2\2^\13\3\2\2\2_`\5(\25\2`a\5\30\r\2ab\5\16\b\2b\r\3\2\2\2cd\5(\25\2"+
		"de\5\32\16\2eg\3\2\2\2fc\3\2\2\2fg\3\2\2\2gk\3\2\2\2hi\5(\25\2ij\5\24"+
		"\13\2jl\3\2\2\2kh\3\2\2\2kl\3\2\2\2lp\3\2\2\2mn\5(\25\2no\5\20\t\2oq\3"+
		"\2\2\2pm\3\2\2\2pq\3\2\2\2qu\3\2\2\2rs\5(\25\2st\5\22\n\2tv\3\2\2\2ur"+
		"\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wx\7\3\2\2x\21\3\2\2\2yz\t\2\2\2z\23\3\2"+
		"\2\2{|\t\3\2\2|\25\3\2\2\2}~\t\4\2\2~\27\3\2\2\2\177\u0080\7\20\2\2\u0080"+
		"\31\3\2\2\2\u0081\u0082\t\5\2\2\u0082\33\3\2\2\2\u0083\u0084\7\30\2\2"+
		"\u0084\35\3\2\2\2\u0085\u0086\t\6\2\2\u0086\37\3\2\2\2\u0087\u0088\7\33"+
		"\2\2\u0088!\3\2\2\2\u0089\u008a\7\34\2\2\u008a#\3\2\2\2\u008b\u008c\7"+
		"\35\2\2\u008c%\3\2\2\2\u008d\u008e\7\36\2\2\u008e\'\3\2\2\2\u008f\u0090"+
		"\7\37\2\2\u0090)\3\2\2\2\20\60\669>ELORW]fkpu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
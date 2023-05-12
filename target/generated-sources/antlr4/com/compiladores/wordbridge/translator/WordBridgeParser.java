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
		PRONOMBRE=1, VERB=2, ARTICLE=3, ADJECTIVE=4, NOUN=5, ADVERB=6, PREPOSITION=7, 
		CONJUNCTION=8, INTERJECTION=9, CONTRACTION=10, DOT=11, NEW_LINE=12, WHITE_SPACE=13, 
		UNRECOGNIZED=14;
	public static final int
		RULE_text = 0, RULE_paragraph = 1, RULE_sentence = 2, RULE_statement = 3, 
		RULE_subject = 4, RULE_predicate = 5, RULE_object = 6, RULE_verb = 7, 
		RULE_article = 8, RULE_adjective = 9, RULE_noun = 10, RULE_adverb = 11, 
		RULE_preposition = 12, RULE_conjunction = 13, RULE_interjection = 14, 
		RULE_contraction = 15, RULE_dot = 16, RULE_new_line = 17, RULE_white_space = 18;
	public static final String[] ruleNames = {
		"text", "paragraph", "sentence", "statement", "subject", "predicate", 
		"object", "verb", "article", "adjective", "noun", "adverb", "preposition", 
		"conjunction", "interjection", "contraction", "dot", "new_line", "white_space"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRONOMBRE", "VERB", "ARTICLE", "ADJECTIVE", "NOUN", "ADVERB", "PREPOSITION", 
		"CONJUNCTION", "INTERJECTION", "CONTRACTION", "DOT", "NEW_LINE", "WHITE_SPACE", 
		"UNRECOGNIZED"
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
			setState(53);
			_la = _input.LA(1);
			if (_la==ARTICLE || _la==NEW_LINE) {
				{
				setState(38);
				paragraph();
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(39);
						new_line();
						setState(40);
						paragraph();
						}
						} 
					}
					setState(46);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEW_LINE) {
					{
					{
					setState(47);
					new_line();
					}
					}
					setState(52);
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
		public List<DotContext> dot() {
			return getRuleContexts(DotContext.class);
		}
		public DotContext dot(int i) {
			return getRuleContext(DotContext.class,i);
		}
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(55);
				new_line();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			sentence();
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					dot();
					setState(63);
					white_space();
					setState(64);
					sentence();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(72);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(71);
				dot();
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
			setState(74);
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
		public White_spaceContext white_space() {
			return getRuleContext(White_spaceContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
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
			setState(76);
			subject();
			setState(80);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(77);
				white_space();
				setState(78);
				predicate();
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
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
		}
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			article();
			setState(83);
			white_space();
			setState(84);
			noun();
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(85);
				white_space();
				setState(86);
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
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public White_spaceContext white_space() {
			return getRuleContext(White_spaceContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			verb();
			setState(94);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(91);
				white_space();
				setState(92);
				object();
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

	public static class ObjectContext extends ParserRuleContext {
		public NounContext noun() {
			return getRuleContext(NounContext.class,0);
		}
		public AdverbContext adverb() {
			return getRuleContext(AdverbContext.class,0);
		}
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
		}
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if (_la==ADVERB) {
				{
				setState(96);
				adverb();
				setState(97);
				white_space();
				}
			}

			setState(104);
			_la = _input.LA(1);
			if (_la==ARTICLE) {
				{
				setState(101);
				article();
				setState(102);
				white_space();
				}
			}

			setState(109);
			_la = _input.LA(1);
			if (_la==ADJECTIVE) {
				{
				setState(106);
				adjective();
				setState(107);
				white_space();
				}
			}

			setState(111);
			noun();
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
		public TerminalNode VERB() { return getToken(WordBridgeParser.VERB, 0); }
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
		enterRule(_localctx, 14, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(VERB);
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
		public TerminalNode ARTICLE() { return getToken(WordBridgeParser.ARTICLE, 0); }
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
		enterRule(_localctx, 16, RULE_article);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ARTICLE);
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
		public TerminalNode ADJECTIVE() { return getToken(WordBridgeParser.ADJECTIVE, 0); }
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
		enterRule(_localctx, 18, RULE_adjective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ADJECTIVE);
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
		enterRule(_localctx, 20, RULE_noun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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

	public static class AdverbContext extends ParserRuleContext {
		public TerminalNode ADVERB() { return getToken(WordBridgeParser.ADVERB, 0); }
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
		enterRule(_localctx, 22, RULE_adverb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ADVERB);
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
		enterRule(_localctx, 24, RULE_preposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
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
		public TerminalNode CONJUNCTION() { return getToken(WordBridgeParser.CONJUNCTION, 0); }
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
		enterRule(_localctx, 26, RULE_conjunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(CONJUNCTION);
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
		enterRule(_localctx, 28, RULE_interjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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
		enterRule(_localctx, 30, RULE_contraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		enterRule(_localctx, 32, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 34, RULE_new_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		enterRule(_localctx, 36, RULE_white_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\5\28\n\2\3\3\7\3;\n\3\f\3\16\3>\13\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\5\3K\n\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5S\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\3\7\5\7a\n"+
		"\7\3\b\3\b\3\b\5\bf\n\b\3\b\3\b\3\b\5\bk\n\b\3\b\3\b\3\b\5\bp\n\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\2\u0084\2\67\3\2\2\2\4<\3\2\2\2\6L"+
		"\3\2\2\2\bN\3\2\2\2\nT\3\2\2\2\f\\\3\2\2\2\16e\3\2\2\2\20s\3\2\2\2\22"+
		"u\3\2\2\2\24w\3\2\2\2\26y\3\2\2\2\30{\3\2\2\2\32}\3\2\2\2\34\177\3\2\2"+
		"\2\36\u0081\3\2\2\2 \u0083\3\2\2\2\"\u0085\3\2\2\2$\u0087\3\2\2\2&\u0089"+
		"\3\2\2\2(.\5\4\3\2)*\5$\23\2*+\5\4\3\2+-\3\2\2\2,)\3\2\2\2-\60\3\2\2\2"+
		".,\3\2\2\2./\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61\63\5$\23\2\62\61\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2"+
		"\67(\3\2\2\2\678\3\2\2\28\3\3\2\2\29;\5$\23\2:9\3\2\2\2;>\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?F\5\6\4\2@A\5\"\22\2AB\5&\24\2BC"+
		"\5\6\4\2CE\3\2\2\2D@\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2H"+
		"F\3\2\2\2IK\5\"\22\2JI\3\2\2\2JK\3\2\2\2K\5\3\2\2\2LM\5\b\5\2M\7\3\2\2"+
		"\2NR\5\n\6\2OP\5&\24\2PQ\5\f\7\2QS\3\2\2\2RO\3\2\2\2RS\3\2\2\2S\t\3\2"+
		"\2\2TU\5\22\n\2UV\5&\24\2VZ\5\26\f\2WX\5&\24\2XY\5\24\13\2Y[\3\2\2\2Z"+
		"W\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\`\5\20\t\2]^\5&\24\2^_\5\16\b\2_a\3\2"+
		"\2\2`]\3\2\2\2`a\3\2\2\2a\r\3\2\2\2bc\5\30\r\2cd\5&\24\2df\3\2\2\2eb\3"+
		"\2\2\2ef\3\2\2\2fj\3\2\2\2gh\5\22\n\2hi\5&\24\2ik\3\2\2\2jg\3\2\2\2jk"+
		"\3\2\2\2ko\3\2\2\2lm\5\24\13\2mn\5&\24\2np\3\2\2\2ol\3\2\2\2op\3\2\2\2"+
		"pq\3\2\2\2qr\5\26\f\2r\17\3\2\2\2st\7\4\2\2t\21\3\2\2\2uv\7\5\2\2v\23"+
		"\3\2\2\2wx\7\6\2\2x\25\3\2\2\2yz\7\7\2\2z\27\3\2\2\2{|\7\b\2\2|\31\3\2"+
		"\2\2}~\7\t\2\2~\33\3\2\2\2\177\u0080\7\n\2\2\u0080\35\3\2\2\2\u0081\u0082"+
		"\7\13\2\2\u0082\37\3\2\2\2\u0083\u0084\7\f\2\2\u0084!\3\2\2\2\u0085\u0086"+
		"\7\r\2\2\u0086#\3\2\2\2\u0087\u0088\7\16\2\2\u0088%\3\2\2\2\u0089\u008a"+
		"\7\17\2\2\u008a\'\3\2\2\2\16.\64\67<FJRZ`ejo";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
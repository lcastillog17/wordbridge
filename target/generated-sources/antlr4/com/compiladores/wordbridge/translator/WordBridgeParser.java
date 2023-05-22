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
		INDEFINITE_ARTICLE=9, PERSONAL_PRONOUN=10, DEMOSTRATIVE_PRONOUN=11, INTERROGATIVE_PRONOUN=12, 
		PRESENT_TENSE_VERB=13, TIME_ADVERB=14, PLACE_ADVERB=15, QUANTITY_ADVERB=16, 
		MODE_ADVERB=17, AFFIRMATION_ADVERB=18, NEGATION_ADVERB=19, DOUBT_ADVERB=20, 
		PREPOSITION=21, COORDINATING_CONJUNCTION=22, SUBORDINANT_CONJUNCTION=23, 
		INTERJECTION=24, CONTRACTION=25, DOT=26, OPEN_QUESTION=27, CLOSE_QUESTION=28, 
		NEW_LINE=29, WHITE_SPACE=30, UNRECOGNIZED=31;
	public static final int
		RULE_text = 0, RULE_paragraph = 1, RULE_sentence = 2, RULE_statement = 3, 
		RULE_question = 4, RULE_subject = 5, RULE_predicate = 6, RULE_object = 7, 
		RULE_noun = 8, RULE_adjective = 9, RULE_article = 10, RULE_pronoun = 11, 
		RULE_verb = 12, RULE_adverb = 13, RULE_preposition = 14, RULE_conjunction = 15, 
		RULE_interjection = 16, RULE_contraction = 17, RULE_dot = 18, RULE_open_question = 19, 
		RULE_close_question = 20, RULE_new_line = 21, RULE_white_space = 22;
	public static final String[] ruleNames = {
		"text", "paragraph", "sentence", "statement", "question", "subject", "predicate", 
		"object", "noun", "adjective", "article", "pronoun", "verb", "adverb", 
		"preposition", "conjunction", "interjection", "contraction", "dot", "open_question", 
		"close_question", "new_line", "white_space"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'.'", "'¿'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOUN", "POSSESSIVE_ADJECTIVE", "DEMONSTRATIVE_ADJECTIVE", "QUALIFYING_ADJECTIVE", 
		"CARDINAL_ADJECTIVE", "ORDINAL_ADJECTIVE", "INDEFINITE_ADJECTIVE", "DEFINITE_ARTICLE", 
		"INDEFINITE_ARTICLE", "PERSONAL_PRONOUN", "DEMOSTRATIVE_PRONOUN", "INTERROGATIVE_PRONOUN", 
		"PRESENT_TENSE_VERB", "TIME_ADVERB", "PLACE_ADVERB", "QUANTITY_ADVERB", 
		"MODE_ADVERB", "AFFIRMATION_ADVERB", "NEGATION_ADVERB", "DOUBT_ADVERB", 
		"PREPOSITION", "COORDINATING_CONJUNCTION", "SUBORDINANT_CONJUNCTION", 
		"INTERJECTION", "CONTRACTION", "DOT", "OPEN_QUESTION", "CLOSE_QUESTION", 
		"NEW_LINE", "WHITE_SPACE", "UNRECOGNIZED"
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
			setState(61);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOUN) | (1L << DEFINITE_ARTICLE) | (1L << INDEFINITE_ARTICLE) | (1L << PERSONAL_PRONOUN) | (1L << DEMOSTRATIVE_PRONOUN) | (1L << INTERROGATIVE_PRONOUN) | (1L << OPEN_QUESTION) | (1L << NEW_LINE))) != 0)) {
				{
				setState(46);
				paragraph();
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(47);
						new_line();
						setState(48);
						paragraph();
						}
						} 
					}
					setState(54);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
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
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(63);
				new_line();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			sentence();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOUN) | (1L << DEFINITE_ARTICLE) | (1L << INDEFINITE_ARTICLE) | (1L << PERSONAL_PRONOUN) | (1L << DEMOSTRATIVE_PRONOUN) | (1L << INTERROGATIVE_PRONOUN) | (1L << OPEN_QUESTION))) != 0)) {
				{
				{
				setState(70);
				sentence();
				}
				}
				setState(75);
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
		public QuestionContext question() {
			return getRuleContext(QuestionContext.class,0);
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
			setState(78);
			switch (_input.LA(1)) {
			case NOUN:
			case DEFINITE_ARTICLE:
			case INDEFINITE_ARTICLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				statement();
				}
				break;
			case PERSONAL_PRONOUN:
			case DEMOSTRATIVE_PRONOUN:
			case INTERROGATIVE_PRONOUN:
			case OPEN_QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				question();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(80);
			subject();
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(81);
				predicate();
				}
				break;
			}
			setState(85);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(84);
				dot();
				}
			}

			setState(88);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(87);
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

	public static class QuestionContext extends ParserRuleContext {
		public PronounContext pronoun() {
			return getRuleContext(PronounContext.class,0);
		}
		public Close_questionContext close_question() {
			return getRuleContext(Close_questionContext.class,0);
		}
		public Open_questionContext open_question() {
			return getRuleContext(Open_questionContext.class,0);
		}
		public List<White_spaceContext> white_space() {
			return getRuleContexts(White_spaceContext.class);
		}
		public White_spaceContext white_space(int i) {
			return getRuleContext(White_spaceContext.class,i);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if (_la==OPEN_QUESTION) {
				{
				setState(90);
				open_question();
				}
			}

			setState(93);
			pronoun();
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(95);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(94);
					predicate();
					}
					break;
				}
				setState(98);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(97);
					white_space();
					}
				}

				setState(101);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOUN) | (1L << DEFINITE_ARTICLE) | (1L << INDEFINITE_ARTICLE))) != 0)) {
					{
					setState(100);
					subject();
					}
				}

				}
				break;
			case 2:
				{
				setState(104);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOUN) | (1L << DEFINITE_ARTICLE) | (1L << INDEFINITE_ARTICLE))) != 0)) {
					{
					setState(103);
					subject();
					}
				}

				setState(107);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(106);
					white_space();
					}
					break;
				}
				setState(110);
				_la = _input.LA(1);
				if (_la==WHITE_SPACE) {
					{
					setState(109);
					predicate();
					}
				}

				}
				break;
			}
			setState(114);
			close_question();
			setState(116);
			_la = _input.LA(1);
			if (_la==WHITE_SPACE) {
				{
				setState(115);
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
		enterRule(_localctx, 10, RULE_subject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_la = _input.LA(1);
			if (_la==DEFINITE_ARTICLE || _la==INDEFINITE_ARTICLE) {
				{
				setState(118);
				article();
				setState(119);
				white_space();
				}
			}

			setState(123);
			noun();
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(124);
				white_space();
				setState(125);
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
		enterRule(_localctx, 12, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			white_space();
			setState(130);
			verb();
			setState(131);
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
		enterRule(_localctx, 14, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(133);
				white_space();
				setState(134);
				adverb();
				}
				break;
			}
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(138);
				white_space();
				setState(139);
				article();
				}
				break;
			}
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(143);
				white_space();
				setState(144);
				noun();
				}
				break;
			}
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(148);
				white_space();
				setState(149);
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
		enterRule(_localctx, 16, RULE_noun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		enterRule(_localctx, 18, RULE_adjective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
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
		enterRule(_localctx, 20, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
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
		enterRule(_localctx, 22, RULE_pronoun);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERSONAL_PRONOUN) | (1L << DEMOSTRATIVE_PRONOUN) | (1L << INTERROGATIVE_PRONOUN))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 26, RULE_adverb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		enterRule(_localctx, 28, RULE_preposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 30, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		enterRule(_localctx, 32, RULE_interjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		enterRule(_localctx, 34, RULE_contraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		enterRule(_localctx, 36, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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

	public static class Open_questionContext extends ParserRuleContext {
		public TerminalNode OPEN_QUESTION() { return getToken(WordBridgeParser.OPEN_QUESTION, 0); }
		public Open_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterOpen_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitOpen_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitOpen_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Open_questionContext open_question() throws RecognitionException {
		Open_questionContext _localctx = new Open_questionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_open_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(OPEN_QUESTION);
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

	public static class Close_questionContext extends ParserRuleContext {
		public TerminalNode CLOSE_QUESTION() { return getToken(WordBridgeParser.CLOSE_QUESTION, 0); }
		public Close_questionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).enterClose_question(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WordBridgeListener ) ((WordBridgeListener)listener).exitClose_question(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WordBridgeVisitor ) return ((WordBridgeVisitor<? extends T>)visitor).visitClose_question(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Close_questionContext close_question() throws RecognitionException {
		Close_questionContext _localctx = new Close_questionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_close_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(CLOSE_QUESTION);
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
		enterRule(_localctx, 42, RULE_new_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 44, RULE_white_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\7\2;\n\2\f\2\16\2>\13\2\5\2@\n\2"+
		"\3\3\7\3C\n\3\f\3\16\3F\13\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4\5"+
		"\4Q\n\4\3\5\3\5\5\5U\n\5\3\5\5\5X\n\5\3\5\5\5[\n\5\3\6\5\6^\n\6\3\6\3"+
		"\6\5\6b\n\6\3\6\5\6e\n\6\3\6\5\6h\n\6\3\6\5\6k\n\6\3\6\5\6n\n\6\3\6\5"+
		"\6q\n\6\5\6s\n\6\3\6\3\6\5\6w\n\6\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0082\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\u008b\n\t\3\t\3\t\3\t\5"+
		"\t\u0090\n\t\3\t\3\t\3\t\5\t\u0095\n\t\3\t\3\t\3\t\5\t\u009a\n\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\4\t"+
		"\3\2\n\13\3\2\f\16\3\2\20\26\3\2\30\31\u00ba\2?\3\2\2\2\4D\3\2\2\2\6P"+
		"\3\2\2\2\bR\3\2\2\2\n]\3\2\2\2\f{\3\2\2\2\16\u0083\3\2\2\2\20\u008a\3"+
		"\2\2\2\22\u009b\3\2\2\2\24\u009d\3\2\2\2\26\u009f\3\2\2\2\30\u00a1\3\2"+
		"\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2"+
		"\"\u00ab\3\2\2\2$\u00ad\3\2\2\2&\u00af\3\2\2\2(\u00b1\3\2\2\2*\u00b3\3"+
		"\2\2\2,\u00b5\3\2\2\2.\u00b7\3\2\2\2\60\66\5\4\3\2\61\62\5,\27\2\62\63"+
		"\5\4\3\2\63\65\3\2\2\2\64\61\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\67<\3\2\2\28\66\3\2\2\29;\5,\27\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=@\3\2\2\2><\3\2\2\2?\60\3\2\2\2?@\3\2\2\2@\3\3\2\2\2AC\5,\27"+
		"\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GK\5\6\4"+
		"\2HJ\5\6\4\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MK\3\2"+
		"\2\2NQ\5\b\5\2OQ\5\n\6\2PN\3\2\2\2PO\3\2\2\2Q\7\3\2\2\2RT\5\f\7\2SU\5"+
		"\16\b\2TS\3\2\2\2TU\3\2\2\2UW\3\2\2\2VX\5&\24\2WV\3\2\2\2WX\3\2\2\2XZ"+
		"\3\2\2\2Y[\5.\30\2ZY\3\2\2\2Z[\3\2\2\2[\t\3\2\2\2\\^\5(\25\2]\\\3\2\2"+
		"\2]^\3\2\2\2^_\3\2\2\2_r\5\30\r\2`b\5\16\b\2a`\3\2\2\2ab\3\2\2\2bd\3\2"+
		"\2\2ce\5.\30\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5\f\7\2gf\3\2\2\2gh\3\2"+
		"\2\2hs\3\2\2\2ik\5\f\7\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\5.\30\2ml\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2oq\5\16\b\2po\3\2\2\2pq\3\2\2\2qs\3\2\2\2ra\3"+
		"\2\2\2rj\3\2\2\2st\3\2\2\2tv\5*\26\2uw\5.\30\2vu\3\2\2\2vw\3\2\2\2w\13"+
		"\3\2\2\2xy\5\26\f\2yz\5.\30\2z|\3\2\2\2{x\3\2\2\2{|\3\2\2\2|}\3\2\2\2"+
		"}\u0081\5\22\n\2~\177\5.\30\2\177\u0080\5\24\13\2\u0080\u0082\3\2\2\2"+
		"\u0081~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\r\3\2\2\2\u0083\u0084\5.\30"+
		"\2\u0084\u0085\5\32\16\2\u0085\u0086\5\20\t\2\u0086\17\3\2\2\2\u0087\u0088"+
		"\5.\30\2\u0088\u0089\5\34\17\2\u0089\u008b\3\2\2\2\u008a\u0087\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008f\3\2\2\2\u008c\u008d\5.\30\2\u008d\u008e"+
		"\5\26\f\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u0090\3\2\2\2"+
		"\u0090\u0094\3\2\2\2\u0091\u0092\5.\30\2\u0092\u0093\5\22\n\2\u0093\u0095"+
		"\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0099\3\2\2\2\u0096"+
		"\u0097\5.\30\2\u0097\u0098\5\24\13\2\u0098\u009a\3\2\2\2\u0099\u0096\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\21\3\2\2\2\u009b\u009c\7\3\2\2\u009c"+
		"\23\3\2\2\2\u009d\u009e\t\2\2\2\u009e\25\3\2\2\2\u009f\u00a0\t\3\2\2\u00a0"+
		"\27\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7\17\2\2"+
		"\u00a4\33\3\2\2\2\u00a5\u00a6\t\5\2\2\u00a6\35\3\2\2\2\u00a7\u00a8\7\27"+
		"\2\2\u00a8\37\3\2\2\2\u00a9\u00aa\t\6\2\2\u00aa!\3\2\2\2\u00ab\u00ac\7"+
		"\32\2\2\u00ac#\3\2\2\2\u00ad\u00ae\7\33\2\2\u00ae%\3\2\2\2\u00af\u00b0"+
		"\7\34\2\2\u00b0\'\3\2\2\2\u00b1\u00b2\7\35\2\2\u00b2)\3\2\2\2\u00b3\u00b4"+
		"\7\36\2\2\u00b4+\3\2\2\2\u00b5\u00b6\7\37\2\2\u00b6-\3\2\2\2\u00b7\u00b8"+
		"\7 \2\2\u00b8/\3\2\2\2\32\66<?DKPTWZ]adgjmprv{\u0081\u008a\u008f\u0094"+
		"\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
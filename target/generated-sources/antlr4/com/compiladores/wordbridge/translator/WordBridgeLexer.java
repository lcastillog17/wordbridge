// Generated from com/compiladores/wordbridge/translator/WordBridge.g4 by ANTLR 4.5.1
package com.compiladores.wordbridge.translator;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WordBridgeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRONOMBRE=1, VERB=2, ARTICLE=3, ADJECTIVE=4, NOUN=5, ADVERB=6, PREPOSITION=7, 
		CONJUNCTION=8, INTERJECTION=9, CONTRACTION=10, DOT=11, NEW_LINE=12, WHITE_SPACE=13, 
		UNRECOGNIZED=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRONOMBRE", "VERB", "ARTICLE", "ADJECTIVE", "NOUN", "ADVERB", "PREPOSITION", 
		"CONJUNCTION", "INTERJECTION", "CONTRACTION", "DOT", "NEW_LINE", "WHITE_SPACE", 
		"UNRECOGNIZED"
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


	public WordBridgeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WordBridge.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20\u01aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2D\n\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3g\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u00b0\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00de\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0110\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b\u0129\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u014c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0173\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u0199\n\13\3\f\3\f\3\r\5\r\u019e\n\r\3"+
		"\r\3\r\3\16\6\16\u01a3\n\16\r\16\16\16\u01a4\3\17\3\17\3\17\3\17\2\2\20"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\3\2\4\4\2qq{{\4\2\13\13\"\"\u01f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\3C\3\2\2\2\5f\3\2\2\2\7\177\3\2\2\2\t\u00af\3\2\2\2\13\u00dd\3\2\2"+
		"\2\r\u010f\3\2\2\2\17\u0128\3\2\2\2\21\u014b\3\2\2\2\23\u0172\3\2\2\2"+
		"\25\u0198\3\2\2\2\27\u019a\3\2\2\2\31\u019d\3\2\2\2\33\u01a2\3\2\2\2\35"+
		"\u01a6\3\2\2\2\37 \7{\2\2 D\7q\2\2!\"\7v\2\2\"D\7\u00fc\2\2#$\7\u00eb"+
		"\2\2$D\7n\2\2%&\7g\2\2&\'\7n\2\2\'(\7n\2\2(D\7c\2\2)*\7p\2\2*+\7q\2\2"+
		"+,\7u\2\2,-\7q\2\2-.\7v\2\2./\7t\2\2/\60\7q\2\2\60D\7u\2\2\61\62\7x\2"+
		"\2\62\63\7q\2\2\63\64\7u\2\2\64\65\7q\2\2\65\66\7v\2\2\66\67\7t\2\2\67"+
		"8\7q\2\28D\7u\2\29:\7g\2\2:;\7n\2\2;<\7n\2\2<=\7q\2\2=D\7u\2\2>?\7g\2"+
		"\2?@\7n\2\2@A\7n\2\2AB\7c\2\2BD\7u\2\2C\37\3\2\2\2C!\3\2\2\2C#\3\2\2\2"+
		"C%\3\2\2\2C)\3\2\2\2C\61\3\2\2\2C9\3\2\2\2C>\3\2\2\2D\4\3\2\2\2EF\7e\2"+
		"\2FG\7q\2\2GH\7t\2\2HI\7t\2\2Ig\7g\2\2JK\7u\2\2KL\7c\2\2LM\7n\2\2MN\7"+
		"v\2\2Ng\7c\2\2OP\7e\2\2PQ\7c\2\2QR\7p\2\2RS\7v\2\2Sg\7c\2\2TU\7e\2\2U"+
		"V\7q\2\2VW\7o\2\2Wg\7g\2\2XY\7f\2\2YZ\7w\2\2Z[\7g\2\2[\\\7t\2\2\\]\7o"+
		"\2\2]g\7g\2\2^_\7g\2\2_`\7u\2\2`a\7v\2\2ag\7\u00e3\2\2bc\7g\2\2cg\7u\2"+
		"\2de\7j\2\2eg\7c\2\2fE\3\2\2\2fJ\3\2\2\2fO\3\2\2\2fT\3\2\2\2fX\3\2\2\2"+
		"f^\3\2\2\2fb\3\2\2\2fd\3\2\2\2g\6\3\2\2\2hi\7g\2\2i\u0080\7n\2\2jk\7n"+
		"\2\2k\u0080\7c\2\2lm\7n\2\2mn\7q\2\2n\u0080\7u\2\2op\7n\2\2pq\7c\2\2q"+
		"\u0080\7u\2\2rs\7w\2\2s\u0080\7p\2\2tu\7w\2\2uv\7p\2\2v\u0080\7c\2\2w"+
		"x\7w\2\2xy\7p\2\2yz\7q\2\2z\u0080\7u\2\2{|\7w\2\2|}\7p\2\2}~\7c\2\2~\u0080"+
		"\7u\2\2\177h\3\2\2\2\177j\3\2\2\2\177l\3\2\2\2\177o\3\2\2\2\177r\3\2\2"+
		"\2\177t\3\2\2\2\177w\3\2\2\2\177{\3\2\2\2\u0080\b\3\2\2\2\u0081\u0082"+
		"\7t\2\2\u0082\u0083\7q\2\2\u0083\u0084\7l\2\2\u0084\u00b0\7q\2\2\u0085"+
		"\u0086\7c\2\2\u0086\u0087\7|\2\2\u0087\u0088\7w\2\2\u0088\u00b0\7n\2\2"+
		"\u0089\u008a\7i\2\2\u008a\u008b\7t\2\2\u008b\u008c\7c\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7f\2\2\u008e\u00b0\7g\2\2\u008f\u0090\7r\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7s\2\2\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2"+
		"\u0094\u0095\7\u00f3\2\2\u0095\u00b0\7q\2\2\u0096\u0097\7d\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7n\2\2\u0099\u009a\7n\2\2\u009a\u00b0\7q\2\2\u009b"+
		"\u009c\7h\2\2\u009c\u009d\7g\2\2\u009d\u00b0\7q\2\2\u009e\u009f\7f\2\2"+
		"\u009f\u00a0\7g\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3"+
		"\7e\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7u\2\2\u00a6"+
		"\u00b0\7q\2\2\u00a7\u00a8\7j\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7t\2\2"+
		"\u00aa\u00ab\7t\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7d\2\2\u00ad\u00ae"+
		"\7n\2\2\u00ae\u00b0\7g\2\2\u00af\u0081\3\2\2\2\u00af\u0085\3\2\2\2\u00af"+
		"\u0089\3\2\2\2\u00af\u008f\3\2\2\2\u00af\u0096\3\2\2\2\u00af\u009b\3\2"+
		"\2\2\u00af\u009e\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0\n\3\2\2\2\u00b1\u00b2"+
		"\7r\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7t\2\2\u00b5"+
		"\u00de\7q\2\2\u00b6\u00b7\7i\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7v\2\2"+
		"\u00b9\u00de\7q\2\2\u00ba\u00bb\7\u00e3\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd"+
		"\7d\2\2\u00bd\u00be\7q\2\2\u00be\u00de\7n\2\2\u00bf\u00c0\7o\2\2\u00c0"+
		"\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7c\2\2"+
		"\u00c4\u00c5\7\u00f3\2\2\u00c5\u00de\7c\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8"+
		"\7o\2\2\u00c8\u00c9\7q\2\2\u00c9\u00de\7t\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\u00cc\7f\2\2\u00cc\u00cd\7k\2\2\u00cd\u00de\7q\2\2\u00ce\u00cf\7u\2\2"+
		"\u00cf\u00d0\7k\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7n\2\2\u00d2\u00de"+
		"\7c\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7u\2\2\u00d6"+
		"\u00de\7c\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7o\2\2"+
		"\u00da\u00db\7k\2\2\u00db\u00dc\7f\2\2\u00dc\u00de\7c\2\2\u00dd\u00b1"+
		"\3\2\2\2\u00dd\u00b6\3\2\2\2\u00dd\u00ba\3\2\2\2\u00dd\u00bf\3\2\2\2\u00dd"+
		"\u00c6\3\2\2\2\u00dd\u00ca\3\2\2\2\u00dd\u00ce\3\2\2\2\u00dd\u00d3\3\2"+
		"\2\2\u00dd\u00d7\3\2\2\2\u00de\f\3\2\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1"+
		"\7\u00e3\2\2\u00e1\u00e2\7r\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7f\2\2"+
		"\u00e4\u00e5\7c\2\2\u00e5\u00e6\7o\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8"+
		"\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u0110\7g\2\2\u00ea\u00eb\7n\2\2\u00eb"+
		"\u00ec\7g\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7c\2\2"+
		"\u00ef\u00f0\7o\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3"+
		"\7v\2\2\u00f3\u0110\7g\2\2\u00f4\u00f5\7d\2\2\u00f5\u00f6\7k\2\2\u00f6"+
		"\u00f7\7g\2\2\u00f7\u0110\7p\2\2\u00f8\u00f9\7o\2\2\u00f9\u00fa\7c\2\2"+
		"\u00fa\u0110\7n\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7k\2\2\u00fd\u00fe"+
		"\7g\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7r\2\2\u0100\u0101\7t\2\2\u0101"+
		"\u0110\7g\2\2\u0102\u0103\7p\2\2\u0103\u0104\7w\2\2\u0104\u0105\7p\2\2"+
		"\u0105\u0106\7e\2\2\u0106\u0110\7c\2\2\u0107\u0108\7c\2\2\u0108\u0109"+
		"\7s\2\2\u0109\u010a\7w\2\2\u010a\u0110\7\u00ef\2\2\u010b\u010c\7c\2\2"+
		"\u010c\u010d\7n\2\2\u010d\u010e\7n\2\2\u010e\u0110\7\u00ef\2\2\u010f\u00df"+
		"\3\2\2\2\u010f\u00ea\3\2\2\2\u010f\u00f4\3\2\2\2\u010f\u00f8\3\2\2\2\u010f"+
		"\u00fb\3\2\2\2\u010f\u0102\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2"+
		"\2\2\u0110\16\3\2\2\2\u0111\u0129\7c\2\2\u0112\u0113\7f\2\2\u0113\u0129"+
		"\7g\2\2\u0114\u0115\7g\2\2\u0115\u0129\7p\2\2\u0116\u0117\7r\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0129\7t\2\2\u0119\u011a\7r\2\2\u011a\u011b\7c\2\2"+
		"\u011b\u011c\7t\2\2\u011c\u0129\7c\2\2\u011d\u011e\7e\2\2\u011e\u011f"+
		"\7q\2\2\u011f\u0129\7p\2\2\u0120\u0121\7u\2\2\u0121\u0122\7k\2\2\u0122"+
		"\u0129\7p\2\2\u0123\u0124\7j\2\2\u0124\u0125\7c\2\2\u0125\u0126\7e\2\2"+
		"\u0126\u0127\7k\2\2\u0127\u0129\7c\2\2\u0128\u0111\3\2\2\2\u0128\u0112"+
		"\3\2\2\2\u0128\u0114\3\2\2\2\u0128\u0116\3\2\2\2\u0128\u0119\3\2\2\2\u0128"+
		"\u011d\3\2\2\2\u0128\u0120\3\2\2\2\u0128\u0123\3\2\2\2\u0129\20\3\2\2"+
		"\2\u012a\u014c\t\2\2\2\u012b\u012c\7r\2\2\u012c\u012d\7g\2\2\u012d\u012e"+
		"\7t\2\2\u012e\u014c\7q\2\2\u012f\u0130\7r\2\2\u0130\u0131\7q\2\2\u0131"+
		"\u0132\7t\2\2\u0132\u0133\7s\2\2\u0133\u0134\7w\2\2\u0134\u014c\7g\2\2"+
		"\u0135\u0136\7c\2\2\u0136\u0137\7w\2\2\u0137\u0138\7p\2\2\u0138\u0139"+
		"\7s\2\2\u0139\u013a\7w\2\2\u013a\u014c\7g\2\2\u013b\u013c\7u\2\2\u013c"+
		"\u014c\7k\2\2\u013d\u013e\7e\2\2\u013e\u013f\7w\2\2\u013f\u0140\7c\2\2"+
		"\u0140\u0141\7p\2\2\u0141\u0142\7f\2\2\u0142\u014c\7q\2\2\u0143\u0144"+
		"\7o\2\2\u0144\u0145\7k\2\2\u0145\u0146\7g\2\2\u0146\u0147\7p\2\2\u0147"+
		"\u0148\7v\2\2\u0148\u0149\7t\2\2\u0149\u014a\7c\2\2\u014a\u014c\7u\2\2"+
		"\u014b\u012a\3\2\2\2\u014b\u012b\3\2\2\2\u014b\u012f\3\2\2\2\u014b\u0135"+
		"\3\2\2\2\u014b\u013b\3\2\2\2\u014b\u013d\3\2\2\2\u014b\u0143\3\2\2\2\u014c"+
		"\22\3\2\2\2\u014d\u014e\7\u00a3\2\2\u014e\u014f\7j\2\2\u014f\u0150\7q"+
		"\2\2\u0150\u0151\7n\2\2\u0151\u0152\7c\2\2\u0152\u0173\7#\2\2\u0153\u0154"+
		"\7\u00a3\2\2\u0154\u0155\7c\2\2\u0155\u0156\7f\2\2\u0156\u0157\7k\2\2"+
		"\u0157\u0158\7\u00f5\2\2\u0158\u0159\7u\2\2\u0159\u0173\7#\2\2\u015a\u015b"+
		"\7\u00a3\2\2\u015b\u015c\7c\2\2\u015c\u015d\7{\2\2\u015d\u0173\7#\2\2"+
		"\u015e\u015f\7\u00a3\2\2\u015f\u0160\7q\2\2\u0160\u0161\7w\2\2\u0161\u0162"+
		"\7e\2\2\u0162\u0163\7j\2\2\u0163\u0173\7#\2\2\u0164\u0165\7\u00a3\2\2"+
		"\u0165\u0166\7x\2\2\u0166\u0167\7k\2\2\u0167\u0168\7x\2\2\u0168\u0169"+
		"\7c\2\2\u0169\u0173\7#\2\2\u016a\u016b\7\u00a3\2\2\u016b\u016c\7q\2\2"+
		"\u016c\u016d\7j\2\2\u016d\u0173\7#\2\2\u016e\u016f\7\u00a3\2\2\u016f\u0170"+
		"\7w\2\2\u0170\u0171\7h\2\2\u0171\u0173\7#\2\2\u0172\u014d\3\2\2\2\u0172"+
		"\u0153\3\2\2\2\u0172\u015a\3\2\2\2\u0172\u015e\3\2\2\2\u0172\u0164\3\2"+
		"\2\2\u0172\u016a\3\2\2\2\u0172\u016e\3\2\2\2\u0173\24\3\2\2\2\u0174\u0175"+
		"\7c\2\2\u0175\u0199\7n\2\2\u0176\u0177\7f\2\2\u0177\u0178\7g\2\2\u0178"+
		"\u0199\7n\2\2\u0179\u017a\7c\2\2\u017a\u017b\7n\2\2\u017b\u017c\7i\2\2"+
		"\u017c\u017d\7w\2\2\u017d\u017e\7p\2\2\u017e\u0199\7q\2\2\u017f\u0180"+
		"\7c\2\2\u0180\u0181\7n\2\2\u0181\u0182\7i\2\2\u0182\u0183\7w\2\2\u0183"+
		"\u0184\7p\2\2\u0184\u0199\7c\2\2\u0185\u0186\7c\2\2\u0186\u0187\7n\2\2"+
		"\u0187\u0188\7i\2\2\u0188\u0189\7w\2\2\u0189\u018a\7p\2\2\u018a\u018b"+
		"\7q\2\2\u018b\u0199\7u\2\2\u018c\u018d\7c\2\2\u018d\u018e\7n\2\2\u018e"+
		"\u018f\7i\2\2\u018f\u0190\7w\2\2\u0190\u0191\7p\2\2\u0191\u0192\7c\2\2"+
		"\u0192\u0199\7u\2\2\u0193\u0194\7f\2\2\u0194\u0199\7g\2\2\u0195\u0196"+
		"\7r\2\2\u0196\u0197\7q\2\2\u0197\u0199\7t\2\2\u0198\u0174\3\2\2\2\u0198"+
		"\u0176\3\2\2\2\u0198\u0179\3\2\2\2\u0198\u017f\3\2\2\2\u0198\u0185\3\2"+
		"\2\2\u0198\u018c\3\2\2\2\u0198\u0193\3\2\2\2\u0198\u0195\3\2\2\2\u0199"+
		"\26\3\2\2\2\u019a\u019b\7\60\2\2\u019b\30\3\2\2\2\u019c\u019e\7\17\2\2"+
		"\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0"+
		"\7\f\2\2\u01a0\32\3\2\2\2\u01a1\u01a3\t\3\2\2\u01a2\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\34\3\2\2"+
		"\2\u01a6\u01a7\13\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\b\17\2\2\u01a9"+
		"\36\3\2\2\2\17\2Cf\177\u00af\u00dd\u010f\u0128\u014b\u0172\u0198\u019d"+
		"\u01a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
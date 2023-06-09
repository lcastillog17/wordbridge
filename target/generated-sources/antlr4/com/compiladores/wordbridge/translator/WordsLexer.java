// Generated from com/compiladores/wordbridge/translator/Words.g4 by ANTLR 4.5.1
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
public class WordsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRONOMBRE=1, VERB=2, ARTICLE=3, ADJECTIVE=4, NOUN=5, ADVERB=6, PREPOSITION=7, 
		CONJUNCTION=8, INTERJECTION=9, CONTRACTION=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRONOMBRE", "VERB", "ARTICLE", "ADJECTIVE", "NOUN", "ADVERB", "PREPOSITION", 
		"CONJUNCTION", "INTERJECTION", "CONTRACTION"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRONOMBRE", "VERB", "ARTICLE", "ADJECTIVE", "NOUN", "ADVERB", "PREPOSITION", 
		"CONJUNCTION", "INTERJECTION", "CONTRACTION"
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


	public WordsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Words.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f\u0192\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2<\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3_\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4x\n\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a8\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u00d6\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7\u0108\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0121\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0144\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u016b\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0191\n\13"+
		"\2\2\f\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\3\4\2qq{{\u01d6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\3;\3\2\2\2\5"+
		"^\3\2\2\2\7w\3\2\2\2\t\u00a7\3\2\2\2\13\u00d5\3\2\2\2\r\u0107\3\2\2\2"+
		"\17\u0120\3\2\2\2\21\u0143\3\2\2\2\23\u016a\3\2\2\2\25\u0190\3\2\2\2\27"+
		"\30\7{\2\2\30<\7q\2\2\31\32\7v\2\2\32<\7\u00fc\2\2\33\34\7\u00eb\2\2\34"+
		"<\7n\2\2\35\36\7g\2\2\36\37\7n\2\2\37 \7n\2\2 <\7c\2\2!\"\7p\2\2\"#\7"+
		"q\2\2#$\7u\2\2$%\7q\2\2%&\7v\2\2&\'\7t\2\2\'(\7q\2\2(<\7u\2\2)*\7x\2\2"+
		"*+\7q\2\2+,\7u\2\2,-\7q\2\2-.\7v\2\2./\7t\2\2/\60\7q\2\2\60<\7u\2\2\61"+
		"\62\7g\2\2\62\63\7n\2\2\63\64\7n\2\2\64\65\7q\2\2\65<\7u\2\2\66\67\7g"+
		"\2\2\678\7n\2\289\7n\2\29:\7c\2\2:<\7u\2\2;\27\3\2\2\2;\31\3\2\2\2;\33"+
		"\3\2\2\2;\35\3\2\2\2;!\3\2\2\2;)\3\2\2\2;\61\3\2\2\2;\66\3\2\2\2<\4\3"+
		"\2\2\2=>\7e\2\2>?\7q\2\2?@\7t\2\2@A\7t\2\2A_\7g\2\2BC\7u\2\2CD\7c\2\2"+
		"DE\7n\2\2EF\7v\2\2F_\7c\2\2GH\7e\2\2HI\7c\2\2IJ\7p\2\2JK\7v\2\2K_\7c\2"+
		"\2LM\7e\2\2MN\7q\2\2NO\7o\2\2O_\7g\2\2PQ\7f\2\2QR\7w\2\2RS\7g\2\2ST\7"+
		"t\2\2TU\7o\2\2U_\7g\2\2VW\7g\2\2WX\7u\2\2XY\7v\2\2Y_\7\u00e3\2\2Z[\7g"+
		"\2\2[_\7u\2\2\\]\7j\2\2]_\7c\2\2^=\3\2\2\2^B\3\2\2\2^G\3\2\2\2^L\3\2\2"+
		"\2^P\3\2\2\2^V\3\2\2\2^Z\3\2\2\2^\\\3\2\2\2_\6\3\2\2\2`a\7g\2\2ax\7n\2"+
		"\2bc\7n\2\2cx\7c\2\2de\7n\2\2ef\7q\2\2fx\7u\2\2gh\7n\2\2hi\7c\2\2ix\7"+
		"u\2\2jk\7w\2\2kx\7p\2\2lm\7w\2\2mn\7p\2\2nx\7c\2\2op\7w\2\2pq\7p\2\2q"+
		"r\7q\2\2rx\7u\2\2st\7w\2\2tu\7p\2\2uv\7c\2\2vx\7u\2\2w`\3\2\2\2wb\3\2"+
		"\2\2wd\3\2\2\2wg\3\2\2\2wj\3\2\2\2wl\3\2\2\2wo\3\2\2\2ws\3\2\2\2x\b\3"+
		"\2\2\2yz\7t\2\2z{\7q\2\2{|\7l\2\2|\u00a8\7q\2\2}~\7c\2\2~\177\7|\2\2\177"+
		"\u0080\7w\2\2\u0080\u00a8\7n\2\2\u0081\u0082\7i\2\2\u0082\u0083\7t\2\2"+
		"\u0083\u0084\7c\2\2\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\u00a8"+
		"\7g\2\2\u0087\u0088\7r\2\2\u0088\u0089\7g\2\2\u0089\u008a\7s\2\2\u008a"+
		"\u008b\7w\2\2\u008b\u008c\7g\2\2\u008c\u008d\7\u00f3\2\2\u008d\u00a8\7"+
		"q\2\2\u008e\u008f\7d\2\2\u008f\u0090\7g\2\2\u0090\u0091\7n\2\2\u0091\u0092"+
		"\7n\2\2\u0092\u00a8\7q\2\2\u0093\u0094\7h\2\2\u0094\u0095\7g\2\2\u0095"+
		"\u00a8\7q\2\2\u0096\u0097\7f\2\2\u0097\u0098\7g\2\2\u0098\u0099\7n\2\2"+
		"\u0099\u009a\7k\2\2\u009a\u009b\7e\2\2\u009b\u009c\7k\2\2\u009c\u009d"+
		"\7q\2\2\u009d\u009e\7u\2\2\u009e\u00a8\7q\2\2\u009f\u00a0\7j\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7d\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a8\7g\2\2\u00a7y\3\2\2"+
		"\2\u00a7}\3\2\2\2\u00a7\u0081\3\2\2\2\u00a7\u0087\3\2\2\2\u00a7\u008e"+
		"\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7\u0096\3\2\2\2\u00a7\u009f\3\2\2\2\u00a8"+
		"\n\3\2\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7t\2\2\u00ad\u00d6\7q\2\2\u00ae\u00af\7i\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7v\2\2\u00b1\u00d6\7q\2\2\u00b2\u00b3\7\u00e3\2\2\u00b3\u00b4"+
		"\7t\2\2\u00b4\u00b5\7d\2\2\u00b5\u00b6\7q\2\2\u00b6\u00d6\7n\2\2\u00b7"+
		"\u00b8\7o\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2"+
		"\u00bb\u00bc\7c\2\2\u00bc\u00bd\7\u00f3\2\2\u00bd\u00d6\7c\2\2\u00be\u00bf"+
		"\7c\2\2\u00bf\u00c0\7o\2\2\u00c0\u00c1\7q\2\2\u00c1\u00d6\7t\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7k\2\2\u00c5\u00d6\7q\2\2"+
		"\u00c6\u00c7\7u\2\2\u00c7\u00c8\7k\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca"+
		"\7n\2\2\u00ca\u00d6\7c\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00ce\7u\2\2\u00ce\u00d6\7c\2\2\u00cf\u00d0\7e\2\2\u00d0\u00d1\7q\2\2"+
		"\u00d1\u00d2\7o\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d6"+
		"\7c\2\2\u00d5\u00a9\3\2\2\2\u00d5\u00ae\3\2\2\2\u00d5\u00b2\3\2\2\2\u00d5"+
		"\u00b7\3\2\2\2\u00d5\u00be\3\2\2\2\u00d5\u00c2\3\2\2\2\u00d5\u00c6\3\2"+
		"\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d6\f\3\2\2\2\u00d7\u00d8"+
		"\7t\2\2\u00d8\u00d9\7\u00e3\2\2\u00d9\u00da\7r\2\2\u00da\u00db\7k\2\2"+
		"\u00db\u00dc\7f\2\2\u00dc\u00dd\7c\2\2\u00dd\u00de\7o\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7v\2\2\u00e1\u0108\7g\2\2\u00e2"+
		"\u00e3\7n\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7v\2\2"+
		"\u00e6\u00e7\7c\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7p\2\2\u00ea\u00eb\7v\2\2\u00eb\u0108\7g\2\2\u00ec\u00ed\7d\2\2\u00ed"+
		"\u00ee\7k\2\2\u00ee\u00ef\7g\2\2\u00ef\u0108\7p\2\2\u00f0\u00f1\7o\2\2"+
		"\u00f1\u00f2\7c\2\2\u00f2\u0108\7n\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5"+
		"\7k\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7o\2\2\u00f7\u00f8\7r\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u0108\7g\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc\7w\2\2"+
		"\u00fc\u00fd\7p\2\2\u00fd\u00fe\7e\2\2\u00fe\u0108\7c\2\2\u00ff\u0100"+
		"\7c\2\2\u0100\u0101\7s\2\2\u0101\u0102\7w\2\2\u0102\u0108\7\u00ef\2\2"+
		"\u0103\u0104\7c\2\2\u0104\u0105\7n\2\2\u0105\u0106\7n\2\2\u0106\u0108"+
		"\7\u00ef\2\2\u0107\u00d7\3\2\2\2\u0107\u00e2\3\2\2\2\u0107\u00ec\3\2\2"+
		"\2\u0107\u00f0\3\2\2\2\u0107\u00f3\3\2\2\2\u0107\u00fa\3\2\2\2\u0107\u00ff"+
		"\3\2\2\2\u0107\u0103\3\2\2\2\u0108\16\3\2\2\2\u0109\u0121\7c\2\2\u010a"+
		"\u010b\7f\2\2\u010b\u0121\7g\2\2\u010c\u010d\7g\2\2\u010d\u0121\7p\2\2"+
		"\u010e\u010f\7r\2\2\u010f\u0110\7q\2\2\u0110\u0121\7t\2\2\u0111\u0112"+
		"\7r\2\2\u0112\u0113\7c\2\2\u0113\u0114\7t\2\2\u0114\u0121\7c\2\2\u0115"+
		"\u0116\7e\2\2\u0116\u0117\7q\2\2\u0117\u0121\7p\2\2\u0118\u0119\7u\2\2"+
		"\u0119\u011a\7k\2\2\u011a\u0121\7p\2\2\u011b\u011c\7j\2\2\u011c\u011d"+
		"\7c\2\2\u011d\u011e\7e\2\2\u011e\u011f\7k\2\2\u011f\u0121\7c\2\2\u0120"+
		"\u0109\3\2\2\2\u0120\u010a\3\2\2\2\u0120\u010c\3\2\2\2\u0120\u010e\3\2"+
		"\2\2\u0120\u0111\3\2\2\2\u0120\u0115\3\2\2\2\u0120\u0118\3\2\2\2\u0120"+
		"\u011b\3\2\2\2\u0121\20\3\2\2\2\u0122\u0144\t\2\2\2\u0123\u0124\7r\2\2"+
		"\u0124\u0125\7g\2\2\u0125\u0126\7t\2\2\u0126\u0144\7q\2\2\u0127\u0128"+
		"\7r\2\2\u0128\u0129\7q\2\2\u0129\u012a\7t\2\2\u012a\u012b\7s\2\2\u012b"+
		"\u012c\7w\2\2\u012c\u0144\7g\2\2\u012d\u012e\7c\2\2\u012e\u012f\7w\2\2"+
		"\u012f\u0130\7p\2\2\u0130\u0131\7s\2\2\u0131\u0132\7w\2\2\u0132\u0144"+
		"\7g\2\2\u0133\u0134\7u\2\2\u0134\u0144\7k\2\2\u0135\u0136\7e\2\2\u0136"+
		"\u0137\7w\2\2\u0137\u0138\7c\2\2\u0138\u0139\7p\2\2\u0139\u013a\7f\2\2"+
		"\u013a\u0144\7q\2\2\u013b\u013c\7o\2\2\u013c\u013d\7k\2\2\u013d\u013e"+
		"\7g\2\2\u013e\u013f\7p\2\2\u013f\u0140\7v\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7c\2\2\u0142\u0144\7u\2\2\u0143\u0122\3\2\2\2\u0143\u0123\3\2\2"+
		"\2\u0143\u0127\3\2\2\2\u0143\u012d\3\2\2\2\u0143\u0133\3\2\2\2\u0143\u0135"+
		"\3\2\2\2\u0143\u013b\3\2\2\2\u0144\22\3\2\2\2\u0145\u0146\7\u00a3\2\2"+
		"\u0146\u0147\7j\2\2\u0147\u0148\7q\2\2\u0148\u0149\7n\2\2\u0149\u014a"+
		"\7c\2\2\u014a\u016b\7#\2\2\u014b\u014c\7\u00a3\2\2\u014c\u014d\7c\2\2"+
		"\u014d\u014e\7f\2\2\u014e\u014f\7k\2\2\u014f\u0150\7\u00f5\2\2\u0150\u0151"+
		"\7u\2\2\u0151\u016b\7#\2\2\u0152\u0153\7\u00a3\2\2\u0153\u0154\7c\2\2"+
		"\u0154\u0155\7{\2\2\u0155\u016b\7#\2\2\u0156\u0157\7\u00a3\2\2\u0157\u0158"+
		"\7q\2\2\u0158\u0159\7w\2\2\u0159\u015a\7e\2\2\u015a\u015b\7j\2\2\u015b"+
		"\u016b\7#\2\2\u015c\u015d\7\u00a3\2\2\u015d\u015e\7x\2\2\u015e\u015f\7"+
		"k\2\2\u015f\u0160\7x\2\2\u0160\u0161\7c\2\2\u0161\u016b\7#\2\2\u0162\u0163"+
		"\7\u00a3\2\2\u0163\u0164\7q\2\2\u0164\u0165\7j\2\2\u0165\u016b\7#\2\2"+
		"\u0166\u0167\7\u00a3\2\2\u0167\u0168\7w\2\2\u0168\u0169\7h\2\2\u0169\u016b"+
		"\7#\2\2\u016a\u0145\3\2\2\2\u016a\u014b\3\2\2\2\u016a\u0152\3\2\2\2\u016a"+
		"\u0156\3\2\2\2\u016a\u015c\3\2\2\2\u016a\u0162\3\2\2\2\u016a\u0166\3\2"+
		"\2\2\u016b\24\3\2\2\2\u016c\u016d\7c\2\2\u016d\u0191\7n\2\2\u016e\u016f"+
		"\7f\2\2\u016f\u0170\7g\2\2\u0170\u0191\7n\2\2\u0171\u0172\7c\2\2\u0172"+
		"\u0173\7n\2\2\u0173\u0174\7i\2\2\u0174\u0175\7w\2\2\u0175\u0176\7p\2\2"+
		"\u0176\u0191\7q\2\2\u0177\u0178\7c\2\2\u0178\u0179\7n\2\2\u0179\u017a"+
		"\7i\2\2\u017a\u017b\7w\2\2\u017b\u017c\7p\2\2\u017c\u0191\7c\2\2\u017d"+
		"\u017e\7c\2\2\u017e\u017f\7n\2\2\u017f\u0180\7i\2\2\u0180\u0181\7w\2\2"+
		"\u0181\u0182\7p\2\2\u0182\u0183\7q\2\2\u0183\u0191\7u\2\2\u0184\u0185"+
		"\7c\2\2\u0185\u0186\7n\2\2\u0186\u0187\7i\2\2\u0187\u0188\7w\2\2\u0188"+
		"\u0189\7p\2\2\u0189\u018a\7c\2\2\u018a\u0191\7u\2\2\u018b\u018c\7f\2\2"+
		"\u018c\u0191\7g\2\2\u018d\u018e\7r\2\2\u018e\u018f\7q\2\2\u018f\u0191"+
		"\7t\2\2\u0190\u016c\3\2\2\2\u0190\u016e\3\2\2\2\u0190\u0171\3\2\2\2\u0190"+
		"\u0177\3\2\2\2\u0190\u017d\3\2\2\2\u0190\u0184\3\2\2\2\u0190\u018b\3\2"+
		"\2\2\u0190\u018d\3\2\2\2\u0191\26\3\2\2\2\r\2;^w\u00a7\u00d5\u0107\u0120"+
		"\u0143\u016a\u0190\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
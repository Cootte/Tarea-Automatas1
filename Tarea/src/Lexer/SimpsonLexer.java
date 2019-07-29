package Lexer;

// Generated from Simpson.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpsonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PLUS=5, EXP=6, VAR=7, DEFVAR=8, NUMBER=9, 
		TEXT=10, FOR=11, START_T=12, UNARY=13, INT_TYPE=14, REAL_TYPE=15, BOOL_TYPE=16, 
		STRING_TYPE=17, BEGIN_RW=18, END_RW=19, IF_RW=20, ELSE_RW=21, WHILE_RW=22, 
		FOR_RW=23, WRITE_RW=24, READ_RW=25, TRUE_LITERAL=26, FALSE_LITERAL=27, 
		ID=28, WS=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "PLUS", "EXP", "VAR", "DEFVAR", "NUMBER", 
		"TEXT", "TRUE", "FALSE", "FOR", "START_T", "UNARY", "NAT", "INT_TYPE", 
		"REAL_TYPE", "BOOL_TYPE", "STRING_TYPE", "BEGIN_RW", "END_RW", "IF_RW", 
		"ELSE_RW", "WHILE_RW", "FOR_RW", "WRITE_RW", "READ_RW", "TRUE_LITERAL", 
		"FALSE_LITERAL", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#!/usr/bin/Tarea'", "'personaje'", "'springfield'", "'kwik'", 
		"'+'", "'^'", null, null, null, null, "'for'", "'start'", null, "'bart'", 
		"'lisa'", "'homer0'", "'marge'", "'ned'", "'modi'", "'luann'", "'kirk'", 
		"'alegria'", "'elena'", "'lenny'", "'karl'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "PLUS", "EXP", "VAR", "DEFVAR", "NUMBER", 
		"TEXT", "FOR", "START_T", "UNARY", "INT_TYPE", "REAL_TYPE", "BOOL_TYPE", 
		"STRING_TYPE", "BEGIN_RW", "END_RW", "IF_RW", "ELSE_RW", "WHILE_RW", "FOR_RW", 
		"WRITE_RW", "READ_RW", "TRUE_LITERAL", "FALSE_LITERAL", "ID", "WS"
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


	public SimpsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simpson.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u0112\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\bu"+
		"\n\b\r\b\16\bv\3\t\3\t\6\t{\n\t\r\t\16\t|\3\n\6\n\u0080\n\n\r\n\16\n\u0081"+
		"\3\n\3\n\6\n\u0086\n\n\r\n\16\n\u0087\7\n\u008a\n\n\f\n\16\n\u008d\13"+
		"\n\3\n\3\n\6\n\u0091\n\n\r\n\16\n\u0092\5\n\u0095\n\n\3\13\3\13\6\13\u0099"+
		"\n\13\r\13\16\13\u009a\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u0108\n \r \16"+
		" \u0109\3!\6!\u010d\n!\r!\16!\u010e\3!\3!\2\2\"\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\2\31\2\33\r\35\16\37\17!\2#\20%\21\'\22)\23"+
		"+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37\3\2\b\4\2C\\"+
		"c|\3\2\62;\b\2\"\"\60\60\62;C\\aac|\4\2--//\3\2c|\5\2\13\f\17\17\"\"\u0118"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\3C\3\2\2\2\5T\3\2\2\2\7^\3\2\2\2\tj\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2"+
		"\17t\3\2\2\2\21x\3\2\2\2\23\u0094\3\2\2\2\25\u0096\3\2\2\2\27\u009e\3"+
		"\2\2\2\31\u00a3\3\2\2\2\33\u00a9\3\2\2\2\35\u00ad\3\2\2\2\37\u00b3\3\2"+
		"\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%\u00bc\3\2\2\2\'\u00c1\3\2\2\2)\u00c8"+
		"\3\2\2\2+\u00ce\3\2\2\2-\u00d2\3\2\2\2/\u00d7\3\2\2\2\61\u00dd\3\2\2\2"+
		"\63\u00e2\3\2\2\2\65\u00ea\3\2\2\2\67\u00f0\3\2\2\29\u00f6\3\2\2\2;\u00fb"+
		"\3\2\2\2=\u0100\3\2\2\2?\u0107\3\2\2\2A\u010c\3\2\2\2CD\7%\2\2DE\7#\2"+
		"\2EF\7\61\2\2FG\7w\2\2GH\7u\2\2HI\7t\2\2IJ\7\61\2\2JK\7d\2\2KL\7k\2\2"+
		"LM\7p\2\2MN\7\61\2\2NO\7V\2\2OP\7c\2\2PQ\7t\2\2QR\7g\2\2RS\7c\2\2S\4\3"+
		"\2\2\2TU\7r\2\2UV\7g\2\2VW\7t\2\2WX\7u\2\2XY\7q\2\2YZ\7p\2\2Z[\7c\2\2"+
		"[\\\7l\2\2\\]\7g\2\2]\6\3\2\2\2^_\7u\2\2_`\7r\2\2`a\7t\2\2ab\7k\2\2bc"+
		"\7p\2\2cd\7i\2\2de\7h\2\2ef\7k\2\2fg\7g\2\2gh\7n\2\2hi\7f\2\2i\b\3\2\2"+
		"\2jk\7m\2\2kl\7y\2\2lm\7k\2\2mn\7m\2\2n\n\3\2\2\2op\7-\2\2p\f\3\2\2\2"+
		"qr\7`\2\2r\16\3\2\2\2su\t\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2w\20\3\2\2\2xz\7&\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\22\3\2\2\2~\u0080\t\3\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u008b\3\2\2\2\u0083\u0085\7\60"+
		"\2\2\u0084\u0086\t\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0083\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0095\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\60\2\2\u008f\u0091\t"+
		"\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\177\3\2\2\2\u0094\u008e\3\2\2"+
		"\2\u0095\24\3\2\2\2\u0096\u0098\7)\2\2\u0097\u0099\t\4\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\7)\2\2\u009d\26\3\2\2\2\u009e\u009f\7v\2\2"+
		"\u009f\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7g\2\2\u00a2\30\3\2"+
		"\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7n\2\2\u00a6\u00a7"+
		"\7u\2\2\u00a7\u00a8\7g\2\2\u00a8\32\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\36\3\2\2\2\u00b3\u00b4\t\5\2\2\u00b4 \3\2\2\2\u00b5\u00b6\t\3\2\2\u00b6"+
		"\"\3\2\2\2\u00b7\u00b8\7d\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\u00bb\7v\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\u00c0\7c\2\2\u00c0&\3\2\2\2\u00c1\u00c2\7j\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7t\2\2"+
		"\u00c6\u00c7\7\62\2\2\u00c7(\3\2\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca\7"+
		"c\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7i\2\2\u00cc\u00cd\7g\2\2\u00cd*"+
		"\3\2\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7f\2\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\7o\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5\7f\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6.\3\2\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9\7w\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7p\2\2\u00dc\60\3\2\2\2\u00dd"+
		"\u00de\7m\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7m\2\2"+
		"\u00e1\62\3\2\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7"+
		"g\2\2\u00e5\u00e6\7i\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9"+
		"\7c\2\2\u00e9\64\3\2\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed"+
		"\7g\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7c\2\2\u00ef\66\3\2\2\2\u00f0\u00f1"+
		"\7n\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\u00f5\7{\2\2\u00f58\3\2\2\2\u00f6\u00f7\7m\2\2\u00f7\u00f8\7c\2\2\u00f8"+
		"\u00f9\7t\2\2\u00f9\u00fa\7n\2\2\u00fa:\3\2\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"\u00fd\7t\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7g\2\2\u00ff<\3\2\2\2\u0100"+
		"\u0101\7h\2\2\u0101\u0102\7c\2\2\u0102\u0103\7n\2\2\u0103\u0104\7u\2\2"+
		"\u0104\u0105\7g\2\2\u0105>\3\2\2\2\u0106\u0108\t\6\2\2\u0107\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"@\3\2\2\2\u010b\u010d\t\7\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\b!\2\2\u0111B\3\2\2\2\r\2v|\u0081\u0087\u008b\u0092\u0094\u009a\u0109"+
		"\u010e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
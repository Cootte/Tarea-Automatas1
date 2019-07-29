// Generated from Simpson.g4 by ANTLR 4.4
package Lexer;
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, PRINTLN=2, READ=3, ASSING=4, VAR=5, DEFVAR=6, NUMBER=7, TEXT=8, 
		UNARY=9, INT_TYPE=10, REAL_TYPE=11, BOOL_TYPE=12, STRING_TYPE=13, BEGIN_RW=14, 
		END_RW=15, IF_RW=16, ELSE_RW=17, WHILE_RW=18, FOR_RW=19, WRITE_RW=20, 
		READ_RW=21, TRUE_LITERAL=22, FALSE_LITERAL=23, ID=24, WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'"
	};
	public static final String[] ruleNames = {
		"PROGRAM", "PRINTLN", "READ", "ASSING", "VAR", "DEFVAR", "NUMBER", "TEXT", 
		"TRUE", "FALSE", "UNARY", "NAT", "INT_TYPE", "REAL_TYPE", "BOOL_TYPE", 
		"STRING_TYPE", "BEGIN_RW", "END_RW", "IF_RW", "ELSE_RW", "WHILE_RW", "FOR_RW", 
		"WRITE_RW", "READ_RW", "TRUE_LITERAL", "FALSE_LITERAL", "ID", "WS"
	};


	public SimpsonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simpson.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u00f2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6]\n\6\r\6\16\6^\3\7\3\7\6\7"+
		"c\n\7\r\7\16\7d\3\b\6\bh\n\b\r\b\16\bi\3\b\3\b\6\bn\n\b\r\b\16\bo\7\b"+
		"r\n\b\f\b\16\bu\13\b\3\b\3\b\6\by\n\b\r\b\16\bz\5\b}\n\b\3\t\3\t\6\t\u0081"+
		"\n\t\r\t\16\t\u0082\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\7\34\u00e7\n\34\f\34\16\34\u00ea\13\34\3\35\6\35\u00ed\n\35"+
		"\r\35\16\35\u00ee\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\2\25\2\27\13\31\2\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26"+
		"\61\27\63\30\65\31\67\329\33\3\2\b\4\2C\\c|\3\2\62;\b\2\"\"\60\60\62;"+
		"C\\aac|\4\2--//\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u00f8\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\3;\3\2\2\2\5C\3\2\2\2\7M\3\2\2\2\tY\3\2\2\2\13\\\3\2\2\2\r"+
		"`\3\2\2\2\17|\3\2\2\2\21~\3\2\2\2\23\u0086\3\2\2\2\25\u008b\3\2\2\2\27"+
		"\u0091\3\2\2\2\31\u0093\3\2\2\2\33\u0095\3\2\2\2\35\u009a\3\2\2\2\37\u009f"+
		"\3\2\2\2!\u00a6\3\2\2\2#\u00ac\3\2\2\2%\u00b0\3\2\2\2\'\u00b5\3\2\2\2"+
		")\u00bb\3\2\2\2+\u00c0\3\2\2\2-\u00c8\3\2\2\2/\u00ce\3\2\2\2\61\u00d4"+
		"\3\2\2\2\63\u00d9\3\2\2\2\65\u00de\3\2\2\2\67\u00e4\3\2\2\29\u00ec\3\2"+
		"\2\2;<\7r\2\2<=\7t\2\2=>\7q\2\2>?\7i\2\2?@\7t\2\2@A\7c\2\2AB\7o\2\2B\4"+
		"\3\2\2\2CD\7m\2\2DE\7y\2\2EF\7k\2\2FG\7m\2\2GH\7/\2\2HI\7o\2\2IJ\7c\2"+
		"\2JK\7t\2\2KL\7m\2\2L\6\3\2\2\2MN\7u\2\2NO\7r\2\2OP\7t\2\2PQ\7k\2\2QR"+
		"\7p\2\2RS\7i\2\2ST\7h\2\2TU\7k\2\2UV\7g\2\2VW\7n\2\2WX\7f\2\2X\b\3\2\2"+
		"\2YZ\7?\2\2Z\n\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2"+
		"\2\2_\f\3\2\2\2`b\7&\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2e\16\3\2\2\2fh\t\3\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2js\3"+
		"\2\2\2km\7\60\2\2ln\t\3\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pr"+
		"\3\2\2\2qk\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t}\3\2\2\2us\3\2\2\2v"+
		"x\7\60\2\2wy\t\3\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2"+
		"|g\3\2\2\2|v\3\2\2\2}\20\3\2\2\2~\u0080\7)\2\2\177\u0081\t\4\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0085\7)\2\2\u0085\22\3\2\2\2\u0086\u0087"+
		"\7v\2\2\u0087\u0088\7t\2\2\u0088\u0089\7w\2\2\u0089\u008a\7g\2\2\u008a"+
		"\24\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e"+
		"\u008f\7u\2\2\u008f\u0090\7g\2\2\u0090\26\3\2\2\2\u0091\u0092\t\5\2\2"+
		"\u0092\30\3\2\2\2\u0093\u0094\t\3\2\2\u0094\32\3\2\2\2\u0095\u0096\7d"+
		"\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\u0099\7v\2\2\u0099\34"+
		"\3\2\2\2\u009a\u009b\7n\2\2\u009b\u009c\7k\2\2\u009c\u009d\7u\2\2\u009d"+
		"\u009e\7c\2\2\u009e\36\3\2\2\2\u009f\u00a0\7j\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7o\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7q\2\2"+
		"\u00a5 \3\2\2\2\u00a6\u00a7\7o\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2"+
		"\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7g\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7"+
		"p\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7f\2\2\u00af$\3\2\2\2\u00b0\u00b1"+
		"\7o\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"&\3\2\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7c\2\2\u00b8"+
		"\u00b9\7p\2\2\u00b9\u00ba\7p\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7m\2\2\u00bc"+
		"\u00bd\7k\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7m\2\2\u00bf*\3\2\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7i\2\2"+
		"\u00c4\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7c\2\2\u00c7,\3\2\2"+
		"\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc"+
		"\7p\2\2\u00cc\u00cd\7c\2\2\u00cd.\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0"+
		"\7g\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7{\2\2\u00d3"+
		"\60\3\2\2\2\u00d4\u00d5\7m\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7t\2\2\u00d7"+
		"\u00d8\7n\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7t\2\2\u00db"+
		"\u00dc\7w\2\2\u00dc\u00dd\7g\2\2\u00dd\64\3\2\2\2\u00de\u00df\7h\2\2\u00df"+
		"\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e3\66\3\2\2\2\u00e4\u00e8\t\2\2\2\u00e5\u00e7\t\6\2\2\u00e6\u00e5"+
		"\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"8\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\t\7\2\2\u00ec\u00eb\3\2\2\2"+
		"\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f1\b\35\2\2\u00f1:\3\2\2\2\r\2^diosz|\u0082\u00e8\u00ee"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
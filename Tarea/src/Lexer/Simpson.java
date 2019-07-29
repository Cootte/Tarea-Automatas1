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
public class Simpson extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, EXP=2, FOR=3, START_T=4, UNARY=5, NUMBER=6, INT_TYPE=7, REAL_TYPE=8, 
		BOOL_TYPE=9, STRING_TYPE=10, BEGIN_RW=11, END_RW=12, IF_RW=13, ELSE_RW=14, 
		WHILE_RW=15, FOR_RW=16, WRITE_RW=17, READ_RW=18, TRUE_LITERAL=19, FALSE_LITERAL=20, 
		ID=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PLUS", "EXP", "TRUE", "FALSE", "FOR", "START_T", "UNARY", "NAT", "NUMBER", 
		"INT_TYPE", "REAL_TYPE", "BOOL_TYPE", "STRING_TYPE", "BEGIN_RW", "END_RW", 
		"IF_RW", "ELSE_RW", "WHILE_RW", "FOR_RW", "WRITE_RW", "READ_RW", "TRUE_LITERAL", 
		"FALSE_LITERAL", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'^'", null, "'start'", null, null, "'int'", "'real'", "'bool'", 
		"'string'", "'begin'", "'end'", "'if'", "'else'", "'while'", null, "'write'", 
		"'read'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PLUS", "EXP", "FOR", "START_T", "UNARY", "NUMBER", "INT_TYPE", 
		"REAL_TYPE", "BOOL_TYPE", "STRING_TYPE", "BEGIN_RW", "END_RW", "IF_RW", 
		"ELSE_RW", "WHILE_RW", "FOR_RW", "WRITE_RW", "READ_RW", "TRUE_LITERAL", 
		"FALSE_LITERAL", "ID", "WS"
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


	public Simpson(CharStream input) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\6\n"+
		"T\n\n\r\n\16\nU\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\6\31\u00a0\n\31\r\31\16\31\u00a1\3\32\6\32\u00a5\n\32"+
		"\r\32\16\32\u00a6\3\32\3\32\2\2\33\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\2"+
		"\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25/\26"+
		"\61\27\63\30\3\2\6\4\2--//\3\2\62;\3\2c|\5\2\13\f\17\17\"\"\u00a9\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2"+
		"\5\67\3\2\2\2\79\3\2\2\2\t>\3\2\2\2\13D\3\2\2\2\rH\3\2\2\2\17N\3\2\2\2"+
		"\21P\3\2\2\2\23S\3\2\2\2\25W\3\2\2\2\27[\3\2\2\2\31`\3\2\2\2\33e\3\2\2"+
		"\2\35l\3\2\2\2\37r\3\2\2\2!v\3\2\2\2#y\3\2\2\2%~\3\2\2\2\'\u0084\3\2\2"+
		"\2)\u0088\3\2\2\2+\u008e\3\2\2\2-\u0093\3\2\2\2/\u0098\3\2\2\2\61\u009f"+
		"\3\2\2\2\63\u00a4\3\2\2\2\65\66\7-\2\2\66\4\3\2\2\2\678\7`\2\28\6\3\2"+
		"\2\29:\7v\2\2:;\7t\2\2;<\7w\2\2<=\7g\2\2=\b\3\2\2\2>?\7h\2\2?@\7c\2\2"+
		"@A\7n\2\2AB\7u\2\2BC\7g\2\2C\n\3\2\2\2DE\7h\2\2EF\7q\2\2FG\7t\2\2G\f\3"+
		"\2\2\2HI\7u\2\2IJ\7v\2\2JK\7c\2\2KL\7t\2\2LM\7v\2\2M\16\3\2\2\2NO\t\2"+
		"\2\2O\20\3\2\2\2PQ\t\3\2\2Q\22\3\2\2\2RT\5\21\t\2SR\3\2\2\2TU\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2V\24\3\2\2\2WX\7k\2\2XY\7p\2\2YZ\7v\2\2Z\26\3\2\2"+
		"\2[\\\7t\2\2\\]\7g\2\2]^\7c\2\2^_\7n\2\2_\30\3\2\2\2`a\7d\2\2ab\7q\2\2"+
		"bc\7q\2\2cd\7n\2\2d\32\3\2\2\2ef\7u\2\2fg\7v\2\2gh\7t\2\2hi\7k\2\2ij\7"+
		"p\2\2jk\7i\2\2k\34\3\2\2\2lm\7d\2\2mn\7g\2\2no\7i\2\2op\7k\2\2pq\7p\2"+
		"\2q\36\3\2\2\2rs\7g\2\2st\7p\2\2tu\7f\2\2u \3\2\2\2vw\7k\2\2wx\7h\2\2"+
		"x\"\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}$\3\2\2\2~\177\7y\2\2"+
		"\177\u0080\7j\2\2\u0080\u0081\7k\2\2\u0081\u0082\7n\2\2\u0082\u0083\7"+
		"g\2\2\u0083&\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086\7q\2\2\u0086\u0087"+
		"\7t\2\2\u0087(\3\2\2\2\u0088\u0089\7y\2\2\u0089\u008a\7t\2\2\u008a\u008b"+
		"\7k\2\2\u008b\u008c\7v\2\2\u008c\u008d\7g\2\2\u008d*\3\2\2\2\u008e\u008f"+
		"\7t\2\2\u008f\u0090\7g\2\2\u0090\u0091\7c\2\2\u0091\u0092\7f\2\2\u0092"+
		",\3\2\2\2\u0093\u0094\7v\2\2\u0094\u0095\7t\2\2\u0095\u0096\7w\2\2\u0096"+
		"\u0097\7g\2\2\u0097.\3\2\2\2\u0098\u0099\7h\2\2\u0099\u009a\7c\2\2\u009a"+
		"\u009b\7n\2\2\u009b\u009c\7u\2\2\u009c\u009d\7g\2\2\u009d\60\3\2\2\2\u009e"+
		"\u00a0\t\4\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\62\3\2\2\2\u00a3\u00a5\t\5\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\b\32\2\2\u00a9\64\3\2\2\2\6\2U\u00a1\u00a6"+
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
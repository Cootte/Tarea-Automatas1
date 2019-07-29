// Generated from SimpsonParse.g4 by ANTLR 4.6
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
public class SimpsonParseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, PRINTLN=2, READ=3, ASSING=4, VAR=5, NUMBER=6, TEXT=7, UNARY=8, 
		INT_TYPE=9, REAL_TYPE=10, BOOL_TYPE=11, STRING_TYPE=12, BRACKET_OPEN=13, 
		BRACKET_CLOSE=14, PAR_OPEN=15, PAR_CLOSE=16, SEMICOLON=17, IF_RW=18, ELSE_RW=19, 
		WHILE_RW=20, FOR_RW=21, SIN=22, COS=23, SUMA=24, RESTA=25, DIVISION=26, 
		MULTIPLICACION=27, GT=28, LT=29, EQ=30, GEQ=31, LEQ=32, TRUE_LITERAL=33, 
		FALSE_LITERAL=34, AND=35, OR=36, NOT=37, ID=38, WS=39;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PROGRAM", "PRINTLN", "READ", "ASSING", "VAR", "NUMBER", "TEXT", "UNARY", 
		"NAT", "INT_TYPE", "REAL_TYPE", "BOOL_TYPE", "STRING_TYPE", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "IF_RW", "ELSE_RW", 
		"WHILE_RW", "FOR_RW", "SIN", "COS", "SUMA", "RESTA", "DIVISION", "MULTIPLICACION", 
		"GT", "LT", "EQ", "GEQ", "LEQ", "TRUE_LITERAL", "FALSE_LITERAL", "AND", 
		"OR", "NOT", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'maggie'", "'springfield'", "'='", null, null, null, 
		null, "'bart'", "'lisa'", "'homero'", "'marge'", "'{'", "'}'", "'('", 
		"')'", "';'", "'luann'", "'kirk'", "'alegria'", "'elena'", "'kwik'", "'mark'", 
		"'apu'", "'manjula'", "'ayudante_de_santa'", "'bola_de_nieve'", "'>'", 
		"'<'", "'=='", "'>='", "'<='", "'true'", "'false'", "'almeida'", "'krabappel'", 
		"'skinner'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PROGRAM", "PRINTLN", "READ", "ASSING", "VAR", "NUMBER", "TEXT", 
		"UNARY", "INT_TYPE", "REAL_TYPE", "BOOL_TYPE", "STRING_TYPE", "BRACKET_OPEN", 
		"BRACKET_CLOSE", "PAR_OPEN", "PAR_CLOSE", "SEMICOLON", "IF_RW", "ELSE_RW", 
		"WHILE_RW", "FOR_RW", "SIN", "COS", "SUMA", "RESTA", "DIVISION", "MULTIPLICACION", 
		"GT", "LT", "EQ", "GEQ", "LEQ", "TRUE_LITERAL", "FALSE_LITERAL", "AND", 
		"OR", "NOT", "ID", "WS"
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


	public SimpsonParseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpsonParse.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2)\u014a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\5\6u\n\6\3\7\6\7x\n\7"+
		"\r\7\16\7y\3\7\3\7\6\7~\n\7\r\7\16\7\177\7\7\u0082\n\7\f\7\16\7\u0085"+
		"\13\7\3\7\3\7\6\7\u0089\n\7\r\7\16\7\u008a\5\7\u008d\n\7\3\b\3\b\6\b\u0091"+
		"\n\b\r\b\16\b\u0092\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\7("+
		"\u013f\n(\f(\16(\u0142\13(\3)\6)\u0145\n)\r)\16)\u0146\3)\3)\2\2*\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\13\27\f\31\r\33\16\35\17\37\20"+
		"!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37"+
		"? A!C\"E#G$I%K&M\'O(Q)\3\2\b\3\2\62;\b\2\"\"\60\60\62;C\\aac|\4\2--//"+
		"\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0153\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5[\3\2\2\2\7b\3\2\2\2\tn\3\2\2\2\13"+
		"t\3\2\2\2\r\u008c\3\2\2\2\17\u008e\3\2\2\2\21\u0096\3\2\2\2\23\u0098\3"+
		"\2\2\2\25\u009a\3\2\2\2\27\u009f\3\2\2\2\31\u00a4\3\2\2\2\33\u00ab\3\2"+
		"\2\2\35\u00b1\3\2\2\2\37\u00b3\3\2\2\2!\u00b5\3\2\2\2#\u00b7\3\2\2\2%"+
		"\u00b9\3\2\2\2\'\u00bb\3\2\2\2)\u00c1\3\2\2\2+\u00c6\3\2\2\2-\u00ce\3"+
		"\2\2\2/\u00d4\3\2\2\2\61\u00d9\3\2\2\2\63\u00de\3\2\2\2\65\u00e2\3\2\2"+
		"\2\67\u00ea\3\2\2\29\u00fc\3\2\2\2;\u010a\3\2\2\2=\u010c\3\2\2\2?\u010e"+
		"\3\2\2\2A\u0111\3\2\2\2C\u0114\3\2\2\2E\u0117\3\2\2\2G\u011c\3\2\2\2I"+
		"\u0122\3\2\2\2K\u012a\3\2\2\2M\u0134\3\2\2\2O\u013c\3\2\2\2Q\u0144\3\2"+
		"\2\2ST\7r\2\2TU\7t\2\2UV\7q\2\2VW\7i\2\2WX\7t\2\2XY\7c\2\2YZ\7o\2\2Z\4"+
		"\3\2\2\2[\\\7o\2\2\\]\7c\2\2]^\7i\2\2^_\7i\2\2_`\7k\2\2`a\7g\2\2a\6\3"+
		"\2\2\2bc\7u\2\2cd\7r\2\2de\7t\2\2ef\7k\2\2fg\7p\2\2gh\7i\2\2hi\7h\2\2"+
		"ij\7k\2\2jk\7g\2\2kl\7n\2\2lm\7f\2\2m\b\3\2\2\2no\7?\2\2o\n\3\2\2\2pu"+
		"\5\25\13\2qu\5\31\r\2ru\5\27\f\2su\5\33\16\2tp\3\2\2\2tq\3\2\2\2tr\3\2"+
		"\2\2ts\3\2\2\2u\f\3\2\2\2vx\t\2\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3"+
		"\2\2\2z\u0083\3\2\2\2{}\7\60\2\2|~\t\2\2\2}|\3\2\2\2~\177\3\2\2\2\177"+
		"}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081{\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u008d\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0088\7\60\2\2\u0087\u0089\t\2\2\2\u0088\u0087\3"+
		"\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008cw\3\2\2\2\u008c\u0086\3\2\2\2\u008d\16\3\2\2\2\u008e"+
		"\u0090\7)\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\7)\2\2\u0095\20\3\2\2\2\u0096\u0097\t\4\2\2\u0097\22\3\2\2\2\u0098"+
		"\u0099\t\2\2\2\u0099\24\3\2\2\2\u009a\u009b\7d\2\2\u009b\u009c\7c\2\2"+
		"\u009c\u009d\7t\2\2\u009d\u009e\7v\2\2\u009e\26\3\2\2\2\u009f\u00a0\7"+
		"n\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7c\2\2\u00a3\30"+
		"\3\2\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7o\2\2\u00a7"+
		"\u00a8\7g\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7q\2\2\u00aa\32\3\2\2\2\u00ab"+
		"\u00ac\7o\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7i\2\2"+
		"\u00af\u00b0\7g\2\2\u00b0\34\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2\36\3\2\2"+
		"\2\u00b3\u00b4\7\177\2\2\u00b4 \3\2\2\2\u00b5\u00b6\7*\2\2\u00b6\"\3\2"+
		"\2\2\u00b7\u00b8\7+\2\2\u00b8$\3\2\2\2\u00b9\u00ba\7=\2\2\u00ba&\3\2\2"+
		"\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7c\2\2\u00be\u00bf"+
		"\7p\2\2\u00bf\u00c0\7p\2\2\u00c0(\3\2\2\2\u00c1\u00c2\7m\2\2\u00c2\u00c3"+
		"\7k\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5\7m\2\2\u00c5*\3\2\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca\7i\2\2\u00ca"+
		"\u00cb\7t\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7c\2\2\u00cd,\3\2\2\2\u00ce"+
		"\u00cf\7g\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2\u00d3\7c\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7m\2\2\u00d5\u00d6\7y\2"+
		"\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7m\2\2\u00d8\60\3\2\2\2\u00d9\u00da"+
		"\7o\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7m\2\2\u00dd"+
		"\62\3\2\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7r\2\2\u00e0\u00e1\7w\2\2\u00e1"+
		"\64\3\2\2\2\u00e2\u00e3\7o\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7p\2\2\u00e5"+
		"\u00e6\7l\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7c\2\2"+
		"\u00e9\66\3\2\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7{\2\2\u00ec\u00ed\7"+
		"w\2\2\u00ed\u00ee\7f\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1"+
		"\7v\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7a\2\2\u00f3\u00f4\7f\2\2\u00f4"+
		"\u00f5\7g\2\2\u00f5\u00f6\7a\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7c\2\2"+
		"\u00f8\u00f9\7p\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7c\2\2\u00fb8\3\2\2"+
		"\2\u00fc\u00fd\7d\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100"+
		"\7c\2\2\u0100\u0101\7a\2\2\u0101\u0102\7f\2\2\u0102\u0103\7g\2\2\u0103"+
		"\u0104\7a\2\2\u0104\u0105\7p\2\2\u0105\u0106\7k\2\2\u0106\u0107\7g\2\2"+
		"\u0107\u0108\7x\2\2\u0108\u0109\7g\2\2\u0109:\3\2\2\2\u010a\u010b\7@\2"+
		"\2\u010b<\3\2\2\2\u010c\u010d\7>\2\2\u010d>\3\2\2\2\u010e\u010f\7?\2\2"+
		"\u010f\u0110\7?\2\2\u0110@\3\2\2\2\u0111\u0112\7@\2\2\u0112\u0113\7?\2"+
		"\2\u0113B\3\2\2\2\u0114\u0115\7>\2\2\u0115\u0116\7?\2\2\u0116D\3\2\2\2"+
		"\u0117\u0118\7v\2\2\u0118\u0119\7t\2\2\u0119\u011a\7w\2\2\u011a\u011b"+
		"\7g\2\2\u011bF\3\2\2\2\u011c\u011d\7h\2\2\u011d\u011e\7c\2\2\u011e\u011f"+
		"\7n\2\2\u011f\u0120\7u\2\2\u0120\u0121\7g\2\2\u0121H\3\2\2\2\u0122\u0123"+
		"\7c\2\2\u0123\u0124\7n\2\2\u0124\u0125\7o\2\2\u0125\u0126\7g\2\2\u0126"+
		"\u0127\7k\2\2\u0127\u0128\7f\2\2\u0128\u0129\7c\2\2\u0129J\3\2\2\2\u012a"+
		"\u012b\7m\2\2\u012b\u012c\7t\2\2\u012c\u012d\7c\2\2\u012d\u012e\7d\2\2"+
		"\u012e\u012f\7c\2\2\u012f\u0130\7r\2\2\u0130\u0131\7r\2\2\u0131\u0132"+
		"\7g\2\2\u0132\u0133\7n\2\2\u0133L\3\2\2\2\u0134\u0135\7u\2\2\u0135\u0136"+
		"\7m\2\2\u0136\u0137\7k\2\2\u0137\u0138\7p\2\2\u0138\u0139\7p\2\2\u0139"+
		"\u013a\7g\2\2\u013a\u013b\7t\2\2\u013bN\3\2\2\2\u013c\u0140\t\5\2\2\u013d"+
		"\u013f\t\6\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141P\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0145"+
		"\t\7\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\b)\2\2\u0149R\3\2\2\2\f"+
		"\2ty\177\u0083\u008a\u008c\u0092\u0140\u0146\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from SimpsonParse.g4 by ANTLR 4.6
package Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpsonParseParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_sentence = 1, RULE_condiciones = 2, RULE_operaciones = 3, 
		RULE_elena = 4, RULE_alegria = 5, RULE_kirk = 6, RULE_luann = 7, RULE_maggie = 8, 
		RULE_funcionesmat = 9, RULE_declaracion = 10, RULE_tipo_valores = 11;
	public static final String[] ruleNames = {
		"program", "sentence", "condiciones", "operaciones", "elena", "alegria", 
		"kirk", "luann", "maggie", "funcionesmat", "declaracion", "tipo_valores"
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

	@Override
	public String getGrammarFileName() { return "SimpsonParse.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpsonParseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(SimpsonParseParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(SimpsonParseParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpsonParseParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpsonParseParser.BRACKET_CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(PROGRAM);
			setState(25);
			match(ID);
			setState(26);
			match(BRACKET_OPEN);
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << VAR) | (1L << NUMBER) | (1L << TEXT) | (1L << IF_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(27);
				sentence();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(BRACKET_CLOSE);
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
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public MaggieContext maggie() {
			return getRuleContext(MaggieContext.class,0);
		}
		public LuannContext luann() {
			return getRuleContext(LuannContext.class,0);
		}
		public KirkContext kirk() {
			return getRuleContext(KirkContext.class,0);
		}
		public AlegriaContext alegria() {
			return getRuleContext(AlegriaContext.class,0);
		}
		public ElenaContext elena() {
			return getRuleContext(ElenaContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public FuncionesmatContext funcionesmat() {
			return getRuleContext(FuncionesmatContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentence);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				maggie();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				luann();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				kirk();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				alegria();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				elena();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				operaciones();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(42);
				condiciones();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(43);
				funcionesmat();
				}
				break;
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

	public static class CondicionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimpsonParseParser.ID, 0); }
		public TerminalNode EQ() { return getToken(SimpsonParseParser.EQ, 0); }
		public TerminalNode GT() { return getToken(SimpsonParseParser.GT, 0); }
		public TerminalNode LT() { return getToken(SimpsonParseParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(SimpsonParseParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(SimpsonParseParser.LEQ, 0); }
		public CondicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condiciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterCondiciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitCondiciones(this);
		}
	}

	public final CondicionesContext condiciones() throws RecognitionException {
		CondicionesContext _localctx = new CondicionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condiciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQ) | (1L << GEQ) | (1L << LEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class OperacionesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpsonParseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpsonParseParser.ID, i);
		}
		public List<Tipo_valoresContext> tipo_valores() {
			return getRuleContexts(Tipo_valoresContext.class);
		}
		public Tipo_valoresContext tipo_valores(int i) {
			return getRuleContext(Tipo_valoresContext.class,i);
		}
		public List<TerminalNode> SUMA() { return getTokens(SimpsonParseParser.SUMA); }
		public TerminalNode SUMA(int i) {
			return getToken(SimpsonParseParser.SUMA, i);
		}
		public List<TerminalNode> RESTA() { return getTokens(SimpsonParseParser.RESTA); }
		public TerminalNode RESTA(int i) {
			return getToken(SimpsonParseParser.RESTA, i);
		}
		public List<TerminalNode> DIVISION() { return getTokens(SimpsonParseParser.DIVISION); }
		public TerminalNode DIVISION(int i) {
			return getToken(SimpsonParseParser.DIVISION, i);
		}
		public List<TerminalNode> MULTIPLICACION() { return getTokens(SimpsonParseParser.MULTIPLICACION); }
		public TerminalNode MULTIPLICACION(int i) {
			return getToken(SimpsonParseParser.MULTIPLICACION, i);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitOperaciones(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(49);
				match(ID);
				}
				break;
			case NUMBER:
			case TEXT:
			case TRUE_LITERAL:
			case FALSE_LITERAL:
				{
				setState(50);
				tipo_valores();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << DIVISION) | (1L << MULTIPLICACION))) != 0)) {
				{
				{
				setState(53);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << RESTA) | (1L << DIVISION) | (1L << MULTIPLICACION))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(54);
					match(ID);
					}
					break;
				case NUMBER:
				case TEXT:
				case TRUE_LITERAL:
				case FALSE_LITERAL:
					{
					setState(55);
					tipo_valores();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(62);
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

	public static class ElenaContext extends ParserRuleContext {
		public TerminalNode FOR_RW() { return getToken(SimpsonParseParser.FOR_RW, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(SimpsonParseParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SimpsonParseParser.NUMBER, i);
		}
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SimpsonParseParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SimpsonParseParser.SEMICOLON, i);
		}
		public List<TerminalNode> ID() { return getTokens(SimpsonParseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpsonParseParser.ID, i);
		}
		public TerminalNode ASSING() { return getToken(SimpsonParseParser.ASSING, 0); }
		public TerminalNode SUMA() { return getToken(SimpsonParseParser.SUMA, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpsonParseParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpsonParseParser.BRACKET_CLOSE, 0); }
		public TerminalNode VAR() { return getToken(SimpsonParseParser.VAR, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public ElenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elena; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterElena(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitElena(this);
		}
	}

	public final ElenaContext elena() throws RecognitionException {
		ElenaContext _localctx = new ElenaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_elena);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(FOR_RW);
			setState(64);
			match(NUMBER);
			setState(65);
			condiciones();
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(67);
			match(SEMICOLON);
			setState(68);
			match(ID);
			setState(69);
			match(ASSING);
			setState(70);
			match(ID);
			setState(71);
			match(SUMA);
			setState(72);
			match(NUMBER);
			setState(73);
			match(BRACKET_OPEN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << VAR) | (1L << NUMBER) | (1L << TEXT) | (1L << IF_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(74);
				sentence();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(BRACKET_CLOSE);
			setState(81);
			match(SEMICOLON);
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

	public static class AlegriaContext extends ParserRuleContext {
		public TerminalNode WHILE_RW() { return getToken(SimpsonParseParser.WHILE_RW, 0); }
		public TerminalNode VAR() { return getToken(SimpsonParseParser.VAR, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode BRACKET_OPEN() { return getToken(SimpsonParseParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpsonParseParser.BRACKET_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpsonParseParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(SimpsonParseParser.NUMBER, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(SimpsonParseParser.BOOL_TYPE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public AlegriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alegria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterAlegria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitAlegria(this);
		}
	}

	public final AlegriaContext alegria() throws RecognitionException {
		AlegriaContext _localctx = new AlegriaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alegria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(WHILE_RW);
			setState(84);
			match(VAR);
			setState(85);
			condiciones();
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==BOOL_TYPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(87);
			match(BRACKET_OPEN);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << VAR) | (1L << NUMBER) | (1L << TEXT) | (1L << IF_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(88);
				sentence();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(BRACKET_CLOSE);
			setState(95);
			match(SEMICOLON);
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

	public static class KirkContext extends ParserRuleContext {
		public TerminalNode WHILE_RW() { return getToken(SimpsonParseParser.WHILE_RW, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpsonParseParser.PAR_OPEN, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SimpsonParseParser.NUMBER, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpsonParseParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpsonParseParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpsonParseParser.BRACKET_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpsonParseParser.SEMICOLON, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public KirkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kirk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterKirk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitKirk(this);
		}
	}

	public final KirkContext kirk() throws RecognitionException {
		KirkContext _localctx = new KirkContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_kirk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(WHILE_RW);
			setState(98);
			match(PAR_OPEN);
			setState(99);
			condiciones();
			setState(100);
			match(NUMBER);
			setState(101);
			match(PAR_CLOSE);
			setState(102);
			match(BRACKET_OPEN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << VAR) | (1L << NUMBER) | (1L << TEXT) | (1L << IF_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(103);
				sentence();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(BRACKET_CLOSE);
			setState(110);
			match(SEMICOLON);
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

	public static class LuannContext extends ParserRuleContext {
		public TerminalNode IF_RW() { return getToken(SimpsonParseParser.IF_RW, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpsonParseParser.PAR_OPEN, 0); }
		public CondicionesContext condiciones() {
			return getRuleContext(CondicionesContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(SimpsonParseParser.PAR_CLOSE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(SimpsonParseParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(SimpsonParseParser.BRACKET_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpsonParseParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(SimpsonParseParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(SimpsonParseParser.NUMBER, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public LuannContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_luann; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterLuann(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitLuann(this);
		}
	}

	public final LuannContext luann() throws RecognitionException {
		LuannContext _localctx = new LuannContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_luann);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(IF_RW);
			setState(113);
			match(PAR_OPEN);
			setState(114);
			condiciones();
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(116);
			match(PAR_CLOSE);
			setState(117);
			match(BRACKET_OPEN);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTLN) | (1L << VAR) | (1L << NUMBER) | (1L << TEXT) | (1L << IF_RW) | (1L << WHILE_RW) | (1L << FOR_RW) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << ID))) != 0)) {
				{
				{
				setState(118);
				sentence();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(BRACKET_CLOSE);
			setState(125);
			match(SEMICOLON);
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

	public static class MaggieContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(SimpsonParseParser.PRINTLN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpsonParseParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(SimpsonParseParser.ID, 0); }
		public TerminalNode VAR() { return getToken(SimpsonParseParser.VAR, 0); }
		public MaggieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maggie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterMaggie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitMaggie(this);
		}
	}

	public final MaggieContext maggie() throws RecognitionException {
		MaggieContext _localctx = new MaggieContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_maggie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PRINTLN);
			setState(128);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(129);
			match(SEMICOLON);
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

	public static class FuncionesmatContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpsonParseParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpsonParseParser.ID, i);
		}
		public TerminalNode ASSING() { return getToken(SimpsonParseParser.ASSING, 0); }
		public TerminalNode PAR_OPEN() { return getToken(SimpsonParseParser.PAR_OPEN, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(SimpsonParseParser.PAR_CLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpsonParseParser.SEMICOLON, 0); }
		public TerminalNode SIN() { return getToken(SimpsonParseParser.SIN, 0); }
		public TerminalNode COS() { return getToken(SimpsonParseParser.COS, 0); }
		public FuncionesmatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionesmat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterFuncionesmat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitFuncionesmat(this);
		}
	}

	public final FuncionesmatContext funcionesmat() throws RecognitionException {
		FuncionesmatContext _localctx = new FuncionesmatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcionesmat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
			setState(132);
			match(ASSING);
			setState(133);
			match(PAR_OPEN);
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==SIN || _la==COS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(ID);
			setState(136);
			match(PAR_CLOSE);
			setState(137);
			match(SEMICOLON);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimpsonParseParser.VAR, 0); }
		public TerminalNode ID() { return getToken(SimpsonParseParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(SimpsonParseParser.SEMICOLON, 0); }
		public TerminalNode ASSING() { return getToken(SimpsonParseParser.ASSING, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitDeclaracion(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(VAR);
			setState(140);
			match(ID);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSING) {
				{
				setState(141);
				match(ASSING);
				setState(142);
				operaciones();
				}
			}

			setState(145);
			match(SEMICOLON);
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

	public static class Tipo_valoresContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SimpsonParseParser.TEXT, 0); }
		public TerminalNode TRUE_LITERAL() { return getToken(SimpsonParseParser.TRUE_LITERAL, 0); }
		public TerminalNode FALSE_LITERAL() { return getToken(SimpsonParseParser.FALSE_LITERAL, 0); }
		public TerminalNode NUMBER() { return getToken(SimpsonParseParser.NUMBER, 0); }
		public Tipo_valoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).enterTipo_valores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpsonParseListener ) ((SimpsonParseListener)listener).exitTipo_valores(this);
		}
	}

	public final Tipo_valoresContext tipo_valores() throws RecognitionException {
		Tipo_valoresContext _localctx = new Tipo_valoresContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << TEXT) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u0098\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\5\3\5\5\5"+
		"\66\n\5\3\5\3\5\3\5\5\5;\n\5\7\5=\n\5\f\5\16\5@\13\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\\\n\7\f\7\16\7_\13\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0092\n\f\3\f\3"+
		"\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\n\3\2\36\"\3\2\32"+
		"\35\3\2\7\b\4\2\b\b\r\r\4\2\b\b((\4\2\7\7((\3\2\30\31\4\2\b\t#$\u009c"+
		"\2\32\3\2\2\2\4.\3\2\2\2\6\60\3\2\2\2\b\65\3\2\2\2\nA\3\2\2\2\fU\3\2\2"+
		"\2\16c\3\2\2\2\20r\3\2\2\2\22\u0081\3\2\2\2\24\u0085\3\2\2\2\26\u008d"+
		"\3\2\2\2\30\u0095\3\2\2\2\32\33\7\3\2\2\33\34\7(\2\2\34 \7\17\2\2\35\37"+
		"\5\4\3\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\""+
		" \3\2\2\2#$\7\20\2\2$\3\3\2\2\2%/\5\26\f\2&/\5\22\n\2\'/\5\20\t\2(/\5"+
		"\16\b\2)/\5\f\7\2*/\5\n\6\2+/\5\b\5\2,/\5\6\4\2-/\5\24\13\2.%\3\2\2\2"+
		".&\3\2\2\2.\'\3\2\2\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2"+
		"\2.-\3\2\2\2/\5\3\2\2\2\60\61\7(\2\2\61\62\t\2\2\2\62\7\3\2\2\2\63\66"+
		"\7(\2\2\64\66\5\30\r\2\65\63\3\2\2\2\65\64\3\2\2\2\66>\3\2\2\2\67:\t\3"+
		"\2\28;\7(\2\29;\5\30\r\2:8\3\2\2\2:9\3\2\2\2;=\3\2\2\2<\67\3\2\2\2=@\3"+
		"\2\2\2><\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@>\3\2\2\2AB\7\27\2\2BC\7\b\2\2C"+
		"D\5\6\4\2DE\t\4\2\2EF\7\23\2\2FG\7(\2\2GH\7\6\2\2HI\7(\2\2IJ\7\32\2\2"+
		"JK\7\b\2\2KO\7\17\2\2LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2PR\3\2\2\2QO\3\2\2\2RS\7\20\2\2ST\7\23\2\2T\13\3\2\2\2UV\7\26\2\2VW"+
		"\7\7\2\2WX\5\6\4\2XY\t\5\2\2Y]\7\17\2\2Z\\\5\4\3\2[Z\3\2\2\2\\_\3\2\2"+
		"\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\20\2\2ab\7\23\2\2b\r\3"+
		"\2\2\2cd\7\26\2\2de\7\21\2\2ef\5\6\4\2fg\7\b\2\2gh\7\22\2\2hl\7\17\2\2"+
		"ik\5\4\3\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2"+
		"op\7\20\2\2pq\7\23\2\2q\17\3\2\2\2rs\7\24\2\2st\7\21\2\2tu\5\6\4\2uv\t"+
		"\6\2\2vw\7\22\2\2w{\7\17\2\2xz\5\4\3\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{"+
		"|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\20\2\2\177\u0080\7\23\2\2\u0080\21"+
		"\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083\t\7\2\2\u0083\u0084\7\23\2\2"+
		"\u0084\23\3\2\2\2\u0085\u0086\7(\2\2\u0086\u0087\7\6\2\2\u0087\u0088\7"+
		"\21\2\2\u0088\u0089\t\b\2\2\u0089\u008a\7(\2\2\u008a\u008b\7\22\2\2\u008b"+
		"\u008c\7\23\2\2\u008c\25\3\2\2\2\u008d\u008e\7\7\2\2\u008e\u0091\7(\2"+
		"\2\u008f\u0090\7\6\2\2\u0090\u0092\5\b\5\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\23\2\2\u0094\27\3\2\2\2\u0095"+
		"\u0096\t\t\2\2\u0096\31\3\2\2\2\f .\65:>O]l{\u0091";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
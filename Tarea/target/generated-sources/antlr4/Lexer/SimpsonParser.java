// Generated from Simpson.g4 by ANTLR 4.4
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
public class SimpsonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, PLUS=4, EXP=5, VAR=6, DEFVAR=7, NUMBER=8, TEXT=9, 
		FOR=10, START_T=11, UNARY=12, INT_TYPE=13, REAL_TYPE=14, BOOL_TYPE=15, 
		STRING_TYPE=16, BEGIN_RW=17, END_RW=18, IF_RW=19, ELSE_RW=20, WHILE_RW=21, 
		FOR_RW=22, WRITE_RW=23, READ_RW=24, TRUE_LITERAL=25, FALSE_LITERAL=26, 
		ID=27, WS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'kwik'", "'personaje'", "'springfield'", "'+'", "'^'", "VAR", 
		"DEFVAR", "NUMBER", "TEXT", "'for'", "'start'", "UNARY", "'bart'", "'lisa'", 
		"'homero'", "'marge'", "'ned'", "'modi'", "'luann'", "'kirk'", "'alegria'", 
		"'elena'", "'lenny'", "'karl'", "'true'", "'false'", "ID", "WS"
	};
	public static final int
		RULE_program = 0, RULE_statments = 1, RULE_state = 2, RULE_let = 3, RULE_echo = 4;
	public static final String[] ruleNames = {
		"program", "statments", "state", "let", "echo"
	};

	@Override
	public String getGrammarFileName() { return "Simpson.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatmentsContext> statments() {
			return getRuleContexts(StatmentsContext.class);
		}
		public StatmentsContext statments(int i) {
			return getRuleContext(StatmentsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpsonVisitor ) return ((SimpsonVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); statments();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << VAR))) != 0) );
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

	public static class StatmentsContext extends ParserRuleContext {
		public List<EchoContext> echo() {
			return getRuleContexts(EchoContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public EchoContext echo(int i) {
			return getRuleContext(EchoContext.class,i);
		}
		public LetContext let(int i) {
			return getRuleContext(LetContext.class,i);
		}
		public List<LetContext> let() {
			return getRuleContexts(LetContext.class);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpsonVisitor ) return ((SimpsonVisitor<? extends T>)visitor).visitStatments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentsContext statments() throws RecognitionException {
		StatmentsContext _localctx = new StatmentsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(18);
					switch (_input.LA(1)) {
					case T__1:
						{
						setState(15); state();
						}
						break;
					case VAR:
						{
						setState(16); let();
						}
						break;
					case T__2:
						{
						setState(17); echo();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(20); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StateContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimpsonParser.VAR, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpsonVisitor ) return ((SimpsonVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(T__1);
			{
			setState(23); match(VAR);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SimpsonParser.TEXT, 0); }
		public TerminalNode VAR() { return getToken(SimpsonParser.VAR, 0); }
		public TerminalNode NUMBER() { return getToken(SimpsonParser.NUMBER, 0); }
		public TerminalNode DEFVAR() { return getToken(SimpsonParser.DEFVAR, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpsonVisitor ) return ((SimpsonVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(25); match(VAR);
			}
			setState(26); match(T__0);
			setState(27);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFVAR) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class EchoContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(SimpsonParser.TEXT, 0); }
		public TerminalNode DEFVAR() { return getToken(SimpsonParser.DEFVAR, 0); }
		public EchoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpsonVisitor ) return ((SimpsonVisitor<? extends T>)visitor).visitEcho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EchoContext echo() throws RecognitionException {
		EchoContext _localctx = new EchoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_echo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(T__2);
			setState(30);
			_la = _input.LA(1);
			if ( !(_la==DEFVAR || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36#\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\6\3"+
		"\25\n\3\r\3\16\3\26\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\4\3\2\t\13\4\2\t\t\13\13!\2\r\3\2\2\2\4\24\3\2\2\2\6\30\3"+
		"\2\2\2\b\33\3\2\2\2\n\37\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2"+
		"\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\25\5\6\4\2\22\25\5\b\5\2"+
		"\23\25\5\n\6\2\24\21\3\2\2\2\24\22\3\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2"+
		"\26\24\3\2\2\2\26\27\3\2\2\2\27\5\3\2\2\2\30\31\7\4\2\2\31\32\7\b\2\2"+
		"\32\7\3\2\2\2\33\34\7\b\2\2\34\35\7\5\2\2\35\36\t\2\2\2\36\t\3\2\2\2\37"+
		" \7\3\2\2 !\t\3\2\2!\13\3\2\2\2\5\17\24\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
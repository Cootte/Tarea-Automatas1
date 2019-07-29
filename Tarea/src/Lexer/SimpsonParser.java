package Lexer;

// Generated from Simpson.g4 by ANTLR 4.6
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
	public static final int
		RULE_interpreter = 0, RULE_state = 1, RULE_let = 2, RULE_echo = 3;
	public static final String[] ruleNames = {
		"interpreter", "state", "let", "echo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'#!/usr/bin/Tarea'", "'personaje'", "'springfield'", "'kwik'", 
		"'+'", "'^'", null, null, null, null, "'for'", "'start'", null, "'bart'", 
		"'lisa'", "'homero'", "'marge'", "'ned'", "'modi'", "'luann'", "'kirk'", 
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

	@Override
	public String getGrammarFileName() { return "Simpson.g4"; }

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
	public static class InterpreterContext extends ParserRuleContext {
		public InterpreterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpreter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpsonVisitor ) return ((SimpsonVisitor<? extends T>)visitor).visitInterpreter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpreterContext interpreter() throws RecognitionException {
		InterpreterContext _localctx = new InterpreterContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_interpreter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			match(T__0);
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
		enterRule(_localctx, 2, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__1);
			{
			setState(11);
			match(VAR);
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
		public TerminalNode DEFVAR() { return getToken(SimpsonParser.DEFVAR, 0); }
		public TerminalNode TEXT() { return getToken(SimpsonParser.TEXT, 0); }
		public TerminalNode NUMBER() { return getToken(SimpsonParser.NUMBER, 0); }
		public TerminalNode VAR() { return getToken(SimpsonParser.VAR, 0); }
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
		enterRule(_localctx, 4, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(13);
			match(VAR);
			}
			setState(14);
			match(T__2);
			setState(15);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DEFVAR) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
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

	public static class EchoContext extends ParserRuleContext {
		public TerminalNode DEFVAR() { return getToken(SimpsonParser.DEFVAR, 0); }
		public TerminalNode TEXT() { return getToken(SimpsonParser.TEXT, 0); }
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
		enterRule(_localctx, 6, RULE_echo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T__3);
			setState(18);
			_la = _input.LA(1);
			if ( !(_la==DEFVAR || _la==TEXT) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\27\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\2\2\6\2\4\6\b\2\4\3\2\n\f\4\2\n\n\f\f\22\2\n\3\2\2\2\4\f\3\2\2\2\6"+
		"\17\3\2\2\2\b\23\3\2\2\2\n\13\7\3\2\2\13\3\3\2\2\2\f\r\7\4\2\2\r\16\7"+
		"\t\2\2\16\5\3\2\2\2\17\20\7\t\2\2\20\21\7\5\2\2\21\22\t\2\2\2\22\7\3\2"+
		"\2\2\23\24\7\6\2\2\24\25\t\3\2\2\25\t\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
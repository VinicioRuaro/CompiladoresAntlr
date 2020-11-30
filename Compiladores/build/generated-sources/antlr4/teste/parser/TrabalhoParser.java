// Generated from C:\Users\vinic\Documents\NetBeansProjects\Compiladores\grammar\teste\parser\Trabalho.g4 by ANTLR 4.6
 
package teste.parser;
import java.util.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrabalhoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, EOL=6, PE=7, PD=8, ADIC=9, RESTO=10, 
		MENOS=11, MULT=12, DIV=13, IGUAL=14, NUM=15, PALA=16, VAR=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_input = 2, RULE_output = 3, RULE_expr0 = 4, 
		RULE_expr1 = 5, RULE_expr2 = 6;
	public static final String[] ruleNames = {
		"prog", "stmt", "input", "output", "expr0", "expr1", "expr2"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'double'", "'string'", "'\"'", "'print'", "';'", "'('", 
		"')'", "'+'", "'%'", "'-'", "'*'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "EOL", "PE", "PD", "ADIC", "RESTO", 
		"MENOS", "MULT", "DIV", "IGUAL", "NUM", "PALA", "VAR", "WS"
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
	public String getGrammarFileName() { return "Trabalho.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private HashMap<String,Simbolo> memory = new HashMap<String,Simbolo>();

	public TrabalhoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Integer val;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				stmt();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << PE) | (1L << NUM))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public Integer val;
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode EOL() { return getToken(TrabalhoParser.EOL, 0); }
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case PE:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				input();
				setState(20);
				match(EOL);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				output();
				setState(23);
				match(EOL);
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

	public static class InputContext extends ParserRuleContext {
		public Integer val;
		public Token VAR;
		public Expr0Context expr0;
		public Token PALA;
		public List<TerminalNode> WS() { return getTokens(TrabalhoParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TrabalhoParser.WS, i);
		}
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode PALA() { return getToken(TrabalhoParser.PALA, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__0);
				setState(28);
				match(WS);
				setState(29);
				((InputContext)_localctx).VAR = match(VAR);
				Simbolo simbolo = new Simbolo("int",2);
				                                 simbolo.valori=0;
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+0);              
				                                   
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(T__0);
				setState(32);
				match(WS);
				setState(33);
				((InputContext)_localctx).VAR = match(VAR);
				setState(34);
				match(WS);
				setState(35);
				match(IGUAL);
				setState(36);
				match(WS);
				setState(37);
				((InputContext)_localctx).expr0 = expr0();
				Simbolo simbolo = new Simbolo("int",2);
				                                 simbolo.valori=((InputContext)_localctx).expr0.val;
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+((InputContext)_localctx).expr0.val);              
				                                   
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				match(T__1);
				setState(41);
				match(WS);
				setState(42);
				((InputContext)_localctx).VAR = match(VAR);
				Simbolo simbolo = new Simbolo("double",1);
				                                 simbolo.valord=0;
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+0);              
				                                   
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__1);
				setState(45);
				match(WS);
				setState(46);
				((InputContext)_localctx).VAR = match(VAR);
				setState(47);
				match(WS);
				setState(48);
				match(IGUAL);
				setState(49);
				match(WS);
				setState(50);
				((InputContext)_localctx).expr0 = expr0();
				Simbolo simbolo = new Simbolo("double",1);
				                                 simbolo.valord=((InputContext)_localctx).expr0.val;
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+((InputContext)_localctx).expr0.val);              
				                                   
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(T__2);
				setState(54);
				match(WS);
				setState(55);
				((InputContext)_localctx).VAR = match(VAR);
				setState(56);
				match(WS);
				setState(57);
				match(IGUAL);
				setState(58);
				match(WS);
				setState(59);
				match(T__3);
				setState(60);
				((InputContext)_localctx).PALA = match(PALA);
				setState(61);
				match(T__3);
				Simbolo simbolo = new Simbolo("String",0);
				                                 simbolo.valors=(((InputContext)_localctx).PALA!=null?((InputContext)_localctx).PALA.getText():null);
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+(((InputContext)_localctx).PALA!=null?((InputContext)_localctx).PALA.getText():null));              
				                                   
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				match(T__2);
				setState(64);
				match(WS);
				setState(65);
				((InputContext)_localctx).VAR = match(VAR);
				Simbolo simbolo = new Simbolo("String",0);
				                                 simbolo.valors="";
				                                 memory.put((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null),simbolo);
				                                 System.out.println((((InputContext)_localctx).VAR!=null?((InputContext)_localctx).VAR.getText():null)+"="+"");              
				                                  
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				((InputContext)_localctx).expr0 = expr0();
				System.out.println(((InputContext)_localctx).expr0.val);
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

	public static class OutputContext extends ParserRuleContext {
		public String val;
		public Token VAR;
		public TerminalNode VAR() { return getToken(TrabalhoParser.VAR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			((OutputContext)_localctx).VAR = match(VAR);
			   System.out.println(memory.get((((OutputContext)_localctx).VAR!=null?((OutputContext)_localctx).VAR.getText():null)));
			                                        
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

	public static class Expr0Context extends ParserRuleContext {
		public Integer val;
		public Expr1Context expr1;
		public Expr0Context h1;
		public Expr0Context h2;
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr0);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((Expr0Context)_localctx).expr1 = expr1();
				setState(77);
				match(ADIC);
				setState(78);
				((Expr0Context)_localctx).h1 = expr0();
				((Expr0Context)_localctx).val =  ((Expr0Context)_localctx).expr1.val + ((Expr0Context)_localctx).h1.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				((Expr0Context)_localctx).expr1 = expr1();
				setState(82);
				match(MENOS);
				setState(83);
				((Expr0Context)_localctx).h2 = expr0();
				((Expr0Context)_localctx).val =  ((Expr0Context)_localctx).expr1.val - ((Expr0Context)_localctx).h2.val;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				((Expr0Context)_localctx).expr1 = expr1();
				((Expr0Context)_localctx).val =  ((Expr0Context)_localctx).expr1.val;
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

	public static class Expr1Context extends ParserRuleContext {
		public Integer val;
		public Expr2Context expr2;
		public Expr1Context t1;
		public Expr1Context t2;
		public Expr1Context t3;
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr1);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				((Expr1Context)_localctx).expr2 = expr2();
				setState(92);
				match(MULT);
				setState(93);
				((Expr1Context)_localctx).t1 = expr1();
				((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val * ((Expr1Context)_localctx).t1.val;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				((Expr1Context)_localctx).expr2 = expr2();
				setState(97);
				match(DIV);
				setState(98);
				((Expr1Context)_localctx).t2 = expr1();
				((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val / ((Expr1Context)_localctx).t2.val;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				((Expr1Context)_localctx).expr2 = expr2();
				setState(102);
				match(RESTO);
				setState(103);
				((Expr1Context)_localctx).t3 = expr1();
				((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val % ((Expr1Context)_localctx).t3.val;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				((Expr1Context)_localctx).expr2 = expr2();
				((Expr1Context)_localctx).val =  ((Expr1Context)_localctx).expr2.val;
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

	public static class Expr2Context extends ParserRuleContext {
		public Integer val;
		public Expr0Context expr0;
		public Token NUM;
		public TerminalNode PE() { return getToken(TrabalhoParser.PE, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode PD() { return getToken(TrabalhoParser.PD, 0); }
		public TerminalNode NUM() { return getToken(TrabalhoParser.NUM, 0); }
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr2);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(PE);
				setState(112);
				((Expr2Context)_localctx).expr0 = expr0();
				setState(113);
				match(PD);
				((Expr2Context)_localctx).val =  ((Expr2Context)_localctx).expr0.val;
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((Expr2Context)_localctx).NUM = match(NUM);
				((Expr2Context)_localctx).val =  Integer.parseInt((((Expr2Context)_localctx).NUM!=null?((Expr2Context)_localctx).NUM.getText():null));
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4I\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\by\n\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\2\u0081\2\21\3\2\2\2\4\33\3\2\2\2\6H\3\2\2\2\bJ"+
		"\3\2\2\2\n[\3\2\2\2\fo\3\2\2\2\16x\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2"+
		"\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\5\6\4\2"+
		"\26\27\7\b\2\2\27\34\3\2\2\2\30\31\5\b\5\2\31\32\7\b\2\2\32\34\3\2\2\2"+
		"\33\25\3\2\2\2\33\30\3\2\2\2\34\5\3\2\2\2\35\36\7\3\2\2\36\37\7\24\2\2"+
		"\37 \7\23\2\2 I\b\4\1\2!\"\7\3\2\2\"#\7\24\2\2#$\7\23\2\2$%\7\24\2\2%"+
		"&\7\20\2\2&\'\7\24\2\2\'(\5\n\6\2()\b\4\1\2)I\3\2\2\2*+\7\4\2\2+,\7\24"+
		"\2\2,-\7\23\2\2-I\b\4\1\2./\7\4\2\2/\60\7\24\2\2\60\61\7\23\2\2\61\62"+
		"\7\24\2\2\62\63\7\20\2\2\63\64\7\24\2\2\64\65\5\n\6\2\65\66\b\4\1\2\66"+
		"I\3\2\2\2\678\7\5\2\289\7\24\2\29:\7\23\2\2:;\7\24\2\2;<\7\20\2\2<=\7"+
		"\24\2\2=>\7\6\2\2>?\7\22\2\2?@\7\6\2\2@I\b\4\1\2AB\7\5\2\2BC\7\24\2\2"+
		"CD\7\23\2\2DI\b\4\1\2EF\5\n\6\2FG\b\4\1\2GI\3\2\2\2H\35\3\2\2\2H!\3\2"+
		"\2\2H*\3\2\2\2H.\3\2\2\2H\67\3\2\2\2HA\3\2\2\2HE\3\2\2\2I\7\3\2\2\2JK"+
		"\7\7\2\2KL\7\23\2\2LM\b\5\1\2M\t\3\2\2\2NO\5\f\7\2OP\7\13\2\2PQ\5\n\6"+
		"\2QR\b\6\1\2R\\\3\2\2\2ST\5\f\7\2TU\7\r\2\2UV\5\n\6\2VW\b\6\1\2W\\\3\2"+
		"\2\2XY\5\f\7\2YZ\b\6\1\2Z\\\3\2\2\2[N\3\2\2\2[S\3\2\2\2[X\3\2\2\2\\\13"+
		"\3\2\2\2]^\5\16\b\2^_\7\16\2\2_`\5\f\7\2`a\b\7\1\2ap\3\2\2\2bc\5\16\b"+
		"\2cd\7\17\2\2de\5\f\7\2ef\b\7\1\2fp\3\2\2\2gh\5\16\b\2hi\7\f\2\2ij\5\f"+
		"\7\2jk\b\7\1\2kp\3\2\2\2lm\5\16\b\2mn\b\7\1\2np\3\2\2\2o]\3\2\2\2ob\3"+
		"\2\2\2og\3\2\2\2ol\3\2\2\2p\r\3\2\2\2qr\7\t\2\2rs\5\n\6\2st\7\n\2\2tu"+
		"\b\b\1\2uy\3\2\2\2vw\7\21\2\2wy\b\b\1\2xq\3\2\2\2xv\3\2\2\2y\17\3\2\2"+
		"\2\b\23\33H[ox";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
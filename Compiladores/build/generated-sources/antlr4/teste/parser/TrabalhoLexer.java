// Generated from C:\Users\vinic\Documents\NetBeansProjects\Compiladores\grammar\teste\parser\Trabalho.g4 by ANTLR 4.6
 
package teste.parser;
import java.util.*;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TrabalhoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, EOL=6, PE=7, PD=8, ADIC=9, RESTO=10, 
		MENOS=11, MULT=12, DIV=13, IGUAL=14, NUM=15, PALA=16, VAR=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "EOL", "PE", "PD", "ADIC", "RESTO", 
		"MENOS", "MULT", "DIV", "IGUAL", "NUM", "PALA", "VAR", "WS"
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


	    private HashMap<String,Simbolo> memory = new HashMap<String,Simbolo>();


	public TrabalhoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Trabalho.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\24k\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20U\n\20\r"+
		"\20\16\20V\3\21\6\21Z\n\21\r\21\16\21[\3\22\3\22\7\22`\n\22\f\22\16\22"+
		"c\13\22\3\23\6\23f\n\23\r\23\16\23g\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3"+
		"\2\6\3\2\62;\6\2\62;C\\aac|\4\2C\\c|\5\2\13\f\17\17\"\"n\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\3\'\3\2\2\2\5+\3\2\2\2\7\62\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\rA\3\2\2\2"+
		"\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2"+
		"\2\33O\3\2\2\2\35Q\3\2\2\2\37T\3\2\2\2!Y\3\2\2\2#]\3\2\2\2%e\3\2\2\2\'"+
		"(\7k\2\2()\7p\2\2)*\7v\2\2*\4\3\2\2\2+,\7f\2\2,-\7q\2\2-.\7w\2\2./\7d"+
		"\2\2/\60\7n\2\2\60\61\7g\2\2\61\6\3\2\2\2\62\63\7u\2\2\63\64\7v\2\2\64"+
		"\65\7t\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7i\2\28\b\3\2\2\29:\7$\2\2:\n"+
		"\3\2\2\2;<\7r\2\2<=\7t\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@\f\3\2\2\2AB\7="+
		"\2\2B\16\3\2\2\2CD\7*\2\2D\20\3\2\2\2EF\7+\2\2F\22\3\2\2\2GH\7-\2\2H\24"+
		"\3\2\2\2IJ\7\'\2\2J\26\3\2\2\2KL\7/\2\2L\30\3\2\2\2MN\7,\2\2N\32\3\2\2"+
		"\2OP\7\61\2\2P\34\3\2\2\2QR\7?\2\2R\36\3\2\2\2SU\t\2\2\2TS\3\2\2\2UV\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2W \3\2\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\\"\3\2\2\2]a\t\4\2\2^`\t\3\2\2_^\3\2\2\2`c\3\2\2\2"+
		"a_\3\2\2\2ab\3\2\2\2b$\3\2\2\2ca\3\2\2\2df\t\5\2\2ed\3\2\2\2fg\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\23\2\2j&\3\2\2\2\7\2V[ag\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
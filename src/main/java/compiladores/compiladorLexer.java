// Generated from /home/anto/Documents/LM/compiladores/ProyectoCompiladores/src/main/java/compiladores/compilador.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, LLA=3, LLC=4, PYC=5, IGU=6, COM=7, SUMA=8, MULT=9, DIFF=10, 
		DIVI=11, AND=12, INT=13, DOUBLE=14, VOID=15, ID=16, NUMERO=17, NUMERO_INT=18, 
		WS=19, OTRO=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "PA", "PC", "LLA", "LLC", "PYC", "IGU", "COM", "SUMA", 
			"MULT", "DIFF", "DIVI", "AND", "INT", "DOUBLE", "VOID", "ID", "NUMERO", 
			"NUMERO_INT", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'='", "','", "'+'", "'*'", 
			"'-'", "'/'", "'&&'", "'int'", "'double'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LLA", "LLC", "PYC", "IGU", "COM", "SUMA", "MULT", 
			"DIFF", "DIVI", "AND", "INT", "DOUBLE", "VOID", "ID", "NUMERO", "NUMERO_INT", 
			"WS", "OTRO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public compiladorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\5\23_\n\23\3\23"+
		"\3\23\3\23\7\23d\n\23\f\23\16\23g\13\23\3\24\7\24j\n\24\f\24\16\24m\13"+
		"\24\3\24\6\24p\n\24\r\24\16\24q\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\2\2\30\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35"+
		"\16\37\17!\20#\21%\22\'\23)\24+\25-\26\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f"+
		"\17\17\"\"\2~\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2"+
		"\2\2\7\63\3\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21"+
		"=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2"+
		"\35I\3\2\2\2\37L\3\2\2\2!P\3\2\2\2#W\3\2\2\2%^\3\2\2\2\'k\3\2\2\2)s\3"+
		"\2\2\2+u\3\2\2\2-y\3\2\2\2/\60\t\2\2\2\60\4\3\2\2\2\61\62\t\3\2\2\62\6"+
		"\3\2\2\2\63\64\7*\2\2\64\b\3\2\2\2\65\66\7+\2\2\66\n\3\2\2\2\678\7}\2"+
		"\28\f\3\2\2\29:\7\177\2\2:\16\3\2\2\2;<\7=\2\2<\20\3\2\2\2=>\7?\2\2>\22"+
		"\3\2\2\2?@\7.\2\2@\24\3\2\2\2AB\7-\2\2B\26\3\2\2\2CD\7,\2\2D\30\3\2\2"+
		"\2EF\7/\2\2F\32\3\2\2\2GH\7\61\2\2H\34\3\2\2\2IJ\7(\2\2JK\7(\2\2K\36\3"+
		"\2\2\2LM\7k\2\2MN\7p\2\2NO\7v\2\2O \3\2\2\2PQ\7f\2\2QR\7q\2\2RS\7w\2\2"+
		"ST\7d\2\2TU\7n\2\2UV\7g\2\2V\"\3\2\2\2WX\7x\2\2XY\7q\2\2YZ\7k\2\2Z[\7"+
		"f\2\2[$\3\2\2\2\\_\5\3\2\2]_\7a\2\2^\\\3\2\2\2^]\3\2\2\2_e\3\2\2\2`d\5"+
		"\3\2\2ad\5\5\3\2bd\7a\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2f&\3\2\2\2ge\3\2\2\2hj\7/\2\2ih\3\2\2\2jm\3\2\2\2ki\3"+
		"\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\5\5\3\2on\3\2\2\2pq\3\2\2\2qo\3"+
		"\2\2\2qr\3\2\2\2r(\3\2\2\2st\5\'\24\2t*\3\2\2\2uv\t\4\2\2vw\3\2\2\2wx"+
		"\b\26\2\2x,\3\2\2\2yz\13\2\2\2z.\3\2\2\2\b\2^cekq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
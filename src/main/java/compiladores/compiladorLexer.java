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
		DIVI=11, MOD=12, INC_OP=13, DEC_OP=14, MUL_ASIGN=15, DIV_ASIGN=16, MOD_ASIGN=17, 
		ADD_ASIGN=18, SUB_ASIGN=19, AND_OP=20, OR_OP=21, EQ_OP=22, NE_OP=23, GE_OP=24, 
		LE_OP=25, LT_OP=26, GT_OP=27, INT=28, DOUBLE=29, VOID=30, IF=31, ELSE=32, 
		WHILE=33, DO=34, FOR=35, CONTINUE=36, BREAK=37, RETURN=38, ID=39, NUMERO_INT=40, 
		WS=41, COMMENT=42, LINE_COMMENT=43, OTRO=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "NUMERO", "PA", "PC", "LLA", "LLC", "PYC", "IGU", 
			"COM", "SUMA", "MULT", "DIFF", "DIVI", "MOD", "INC_OP", "DEC_OP", "MUL_ASIGN", 
			"DIV_ASIGN", "MOD_ASIGN", "ADD_ASIGN", "SUB_ASIGN", "AND_OP", "OR_OP", 
			"EQ_OP", "NE_OP", "GE_OP", "LE_OP", "LT_OP", "GT_OP", "INT", "DOUBLE", 
			"VOID", "IF", "ELSE", "WHILE", "DO", "FOR", "CONTINUE", "BREAK", "RETURN", 
			"ID", "NUMERO_INT", "WS", "COMMENT", "LINE_COMMENT", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'='", "','", "'+'", "'*'", 
			"'-'", "'/'", "'%'", "'++'", "'--'", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'&&'", "'||'", "'=='", "'!='", "'>='", "'<='", "'<'", "'>'", 
			"'int'", "'double'", "'void'", "'if'", "'else'", "'while'", "'do'", "'for'", 
			"'continue'", "'break'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LLA", "LLC", "PYC", "IGU", "COM", "SUMA", "MULT", 
			"DIFF", "DIVI", "MOD", "INC_OP", "DEC_OP", "MUL_ASIGN", "DIV_ASIGN", 
			"MOD_ASIGN", "ADD_ASIGN", "SUB_ASIGN", "AND_OP", "OR_OP", "EQ_OP", "NE_OP", 
			"GE_OP", "LE_OP", "LT_OP", "GT_OP", "INT", "DOUBLE", "VOID", "IF", "ELSE", 
			"WHILE", "DO", "FOR", "CONTINUE", "BREAK", "RETURN", "ID", "NUMERO_INT", 
			"WS", "COMMENT", "LINE_COMMENT", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\6\4g\n\4\r\4\16\4"+
		"h\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3*\3*\3+\3+\5+\u00eb\n+\3+\3+\3+\7+\u00f0\n+\f+\16+\u00f3"+
		"\13+\3,\7,\u00f6\n,\f,\16,\u00f9\13,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\7."+
		"\u0105\n.\f.\16.\u0108\13.\3.\3.\3.\3.\3.\3/\3/\3/\3/\7/\u0113\n/\f/\16"+
		"/\u0116\13/\3/\3/\3\60\3\60\3\u0106\2\61\3\2\5\2\7\2\t\3\13\4\r\5\17\6"+
		"\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#\20%\21\'\22)\23+\24-\25"+
		"/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M%O&Q\'S(U"+
		")W*Y+[,]-_.\3\2\6\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2"+
		"\u011f\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5c\3\2\2\2\7f\3\2\2\2\t"+
		"j\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21r\3\2\2\2\23t\3\2\2\2\25"+
		"v\3\2\2\2\27x\3\2\2\2\31z\3\2\2\2\33|\3\2\2\2\35~\3\2\2\2\37\u0080\3\2"+
		"\2\2!\u0082\3\2\2\2#\u0085\3\2\2\2%\u0088\3\2\2\2\'\u008b\3\2\2\2)\u008e"+
		"\3\2\2\2+\u0091\3\2\2\2-\u0094\3\2\2\2/\u0097\3\2\2\2\61\u009a\3\2\2\2"+
		"\63\u009d\3\2\2\2\65\u00a0\3\2\2\2\67\u00a3\3\2\2\29\u00a6\3\2\2\2;\u00a9"+
		"\3\2\2\2=\u00ab\3\2\2\2?\u00ad\3\2\2\2A\u00b1\3\2\2\2C\u00b8\3\2\2\2E"+
		"\u00bd\3\2\2\2G\u00c0\3\2\2\2I\u00c5\3\2\2\2K\u00cb\3\2\2\2M\u00ce\3\2"+
		"\2\2O\u00d2\3\2\2\2Q\u00db\3\2\2\2S\u00e1\3\2\2\2U\u00ea\3\2\2\2W\u00f7"+
		"\3\2\2\2Y\u00fc\3\2\2\2[\u0100\3\2\2\2]\u010e\3\2\2\2_\u0119\3\2\2\2a"+
		"b\t\2\2\2b\4\3\2\2\2cd\t\3\2\2d\6\3\2\2\2eg\5\5\3\2fe\3\2\2\2gh\3\2\2"+
		"\2hf\3\2\2\2hi\3\2\2\2i\b\3\2\2\2jk\7*\2\2k\n\3\2\2\2lm\7+\2\2m\f\3\2"+
		"\2\2no\7}\2\2o\16\3\2\2\2pq\7\177\2\2q\20\3\2\2\2rs\7=\2\2s\22\3\2\2\2"+
		"tu\7?\2\2u\24\3\2\2\2vw\7.\2\2w\26\3\2\2\2xy\7-\2\2y\30\3\2\2\2z{\7,\2"+
		"\2{\32\3\2\2\2|}\7/\2\2}\34\3\2\2\2~\177\7\61\2\2\177\36\3\2\2\2\u0080"+
		"\u0081\7\'\2\2\u0081 \3\2\2\2\u0082\u0083\7-\2\2\u0083\u0084\7-\2\2\u0084"+
		"\"\3\2\2\2\u0085\u0086\7/\2\2\u0086\u0087\7/\2\2\u0087$\3\2\2\2\u0088"+
		"\u0089\7,\2\2\u0089\u008a\7?\2\2\u008a&\3\2\2\2\u008b\u008c\7\61\2\2\u008c"+
		"\u008d\7?\2\2\u008d(\3\2\2\2\u008e\u008f\7\'\2\2\u008f\u0090\7?\2\2\u0090"+
		"*\3\2\2\2\u0091\u0092\7-\2\2\u0092\u0093\7?\2\2\u0093,\3\2\2\2\u0094\u0095"+
		"\7/\2\2\u0095\u0096\7?\2\2\u0096.\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099"+
		"\7(\2\2\u0099\60\3\2\2\2\u009a\u009b\7~\2\2\u009b\u009c\7~\2\2\u009c\62"+
		"\3\2\2\2\u009d\u009e\7?\2\2\u009e\u009f\7?\2\2\u009f\64\3\2\2\2\u00a0"+
		"\u00a1\7#\2\2\u00a1\u00a2\7?\2\2\u00a2\66\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4"+
		"\u00a5\7?\2\2\u00a58\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7?\2\2\u00a8"+
		":\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa<\3\2\2\2\u00ab\u00ac\7@\2\2\u00ac>"+
		"\3\2\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"@\3\2\2\2\u00b1\u00b2\7f\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7w\2\2\u00b4"+
		"\u00b5\7d\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7B\3\2\2\2\u00b8"+
		"\u00b9\7x\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7k\2\2\u00bb\u00bc\7f\2\2"+
		"\u00bcD\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7h\2\2\u00bfF\3\2\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4H\3\2\2\2\u00c5\u00c6\7y\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7k\2"+
		"\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00caJ\3\2\2\2\u00cb\u00cc\7"+
		"f\2\2\u00cc\u00cd\7q\2\2\u00cdL\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0"+
		"\7q\2\2\u00d0\u00d1\7t\2\2\u00d1N\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4"+
		"\7q\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7p\2\2\u00d8\u00d9\7w\2\2\u00d9\u00da\7g\2\2\u00daP\3\2\2\2\u00db"+
		"\u00dc\7d\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7c\2\2"+
		"\u00df\u00e0\7m\2\2\u00e0R\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7g\2"+
		"\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2\u00e6\u00e7"+
		"\7p\2\2\u00e7T\3\2\2\2\u00e8\u00eb\5\3\2\2\u00e9\u00eb\7a\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00f1\3\2\2\2\u00ec\u00f0\5\3\2\2\u00ed"+
		"\u00f0\5\5\3\2\u00ee\u00f0\7a\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2V\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\7/\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\5\7\4\2\u00fb"+
		"X\3\2\2\2\u00fc\u00fd\t\4\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b-\2\2\u00ff"+
		"Z\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7,\2\2\u0102\u0106\3\2\2\2"+
		"\u0103\u0105\13\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010a\7,\2\2\u010a\u010b\7\61\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b."+
		"\2\2\u010d\\\3\2\2\2\u010e\u010f\7\61\2\2\u010f\u0110\7\61\2\2\u0110\u0114"+
		"\3\2\2\2\u0111\u0113\n\5\2\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0118\b/\2\2\u0118^\3\2\2\2\u0119\u011a\13\2\2\2\u011a`\3\2"+
		"\2\2\n\2h\u00ea\u00ef\u00f1\u00f7\u0106\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
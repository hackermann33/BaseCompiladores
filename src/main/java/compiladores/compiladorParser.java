// Generated from /home/anto/Documents/LM/compiladores/ProyectoCompiladores/src/main/java/compiladores/compilador.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class compiladorParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_instrucciones_externa = 1, RULE_instruccion_externa = 2, 
		RULE_definicion_funcion = 3, RULE_bloque = 4, RULE_instrucciones = 5, 
		RULE_instruccion = 6, RULE_expresiones = 7, RULE_expresion = 8, RULE_expresion_multiplicativa = 9, 
		RULE_expresion_aditiva = 10, RULE_expresion_relacional = 11, RULE_expresion_igualdad = 12, 
		RULE_expresion_logica_and = 13, RULE_expresion_logica_or = 14, RULE_expresion_asignacion = 15, 
		RULE_operador_asignacion = 16, RULE_expresion_primaria = 17, RULE_lista_parametros_expresiones = 18, 
		RULE_expresion_postfija = 19, RULE_declaracion = 20, RULE_init_lista_declarador = 21, 
		RULE_init_declarador = 22, RULE_specificador_tipo = 23, RULE_declarador = 24, 
		RULE_lista_parametros = 25, RULE_declaracion_parametro = 26, RULE_statement = 27, 
		RULE_expression_statement = 28, RULE_seleccion = 29, RULE_iteracion = 30, 
		RULE_salto = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones_externa", "instruccion_externa", "definicion_funcion", 
			"bloque", "instrucciones", "instruccion", "expresiones", "expresion", 
			"expresion_multiplicativa", "expresion_aditiva", "expresion_relacional", 
			"expresion_igualdad", "expresion_logica_and", "expresion_logica_or", 
			"expresion_asignacion", "operador_asignacion", "expresion_primaria", 
			"lista_parametros_expresiones", "expresion_postfija", "declaracion", 
			"init_lista_declarador", "init_declarador", "specificador_tipo", "declarador", 
			"lista_parametros", "declaracion_parametro", "statement", "expression_statement", 
			"seleccion", "iteracion", "salto"
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

	@Override
	public String getGrammarFileName() { return "compilador.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public Instrucciones_externaContext instrucciones_externa() {
			return getRuleContext(Instrucciones_externaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(compiladorParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			instrucciones_externa();
			setState(65);
			match(EOF);
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

	public static class Instrucciones_externaContext extends ParserRuleContext {
		public Instruccion_externaContext instruccion_externa() {
			return getRuleContext(Instruccion_externaContext.class,0);
		}
		public Instrucciones_externaContext instrucciones_externa() {
			return getRuleContext(Instrucciones_externaContext.class,0);
		}
		public Instrucciones_externaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones_externa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInstrucciones_externa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInstrucciones_externa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInstrucciones_externa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instrucciones_externaContext instrucciones_externa() throws RecognitionException {
		Instrucciones_externaContext _localctx = new Instrucciones_externaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones_externa);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				instruccion_externa();
				setState(68);
				instrucciones_externa();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Instruccion_externaContext extends ParserRuleContext {
		public Definicion_funcionContext definicion_funcion() {
			return getRuleContext(Definicion_funcionContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Instruccion_externaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_externa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInstruccion_externa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInstruccion_externa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInstruccion_externa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_externaContext instruccion_externa() throws RecognitionException {
		Instruccion_externaContext _localctx = new Instruccion_externaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion_externa);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				definicion_funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				declaracion();
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

	public static class Definicion_funcionContext extends ParserRuleContext {
		public Specificador_tipoContext specificador_tipo() {
			return getRuleContext(Specificador_tipoContext.class,0);
		}
		public DeclaradorContext declarador() {
			return getRuleContext(DeclaradorContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Definicion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDefinicion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDefinicion_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDefinicion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definicion_funcionContext definicion_funcion() throws RecognitionException {
		Definicion_funcionContext _localctx = new Definicion_funcionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			specificador_tipo();
			setState(78);
			declarador(0);
			setState(79);
			bloque();
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLA() { return getToken(compiladorParser.LLA, 0); }
		public TerminalNode LLC() { return getToken(compiladorParser.LLC, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(LLA);
				setState(82);
				match(LLC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LLA);
				setState(84);
				instrucciones();
				setState(85);
				match(LLC);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instrucciones);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case LLA:
			case PYC:
			case INT:
			case DOUBLE:
			case VOID:
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case CONTINUE:
			case BREAK:
			case RETURN:
			case ID:
			case NUMERO_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				instruccion();
				setState(90);
				instrucciones();
				}
				break;
			case LLC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccion);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				declaracion();
				}
				break;
			case PA:
			case LLA:
			case PYC:
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case CONTINUE:
			case BREAK:
			case RETURN:
			case ID:
			case NUMERO_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				statement();
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

	public static class ExpresionesContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public ExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionesContext expresiones() throws RecognitionException {
		ExpresionesContext _localctx = new ExpresionesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expresiones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			expresion(0);
			setState(100);
			match(PYC);
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

	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_asignacionContext expresion_asignacion() {
			return getRuleContext(Expresion_asignacionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COM() { return getToken(compiladorParser.COM, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(103);
			expresion_asignacion();
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(105);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(106);
					match(COM);
					setState(107);
					expresion_asignacion();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_multiplicativaContext extends ParserRuleContext {
		public Expresion_postfijaContext expresion_postfija() {
			return getRuleContext(Expresion_postfijaContext.class,0);
		}
		public List<Expresion_multiplicativaContext> expresion_multiplicativa() {
			return getRuleContexts(Expresion_multiplicativaContext.class);
		}
		public Expresion_multiplicativaContext expresion_multiplicativa(int i) {
			return getRuleContext(Expresion_multiplicativaContext.class,i);
		}
		public TerminalNode MOD() { return getToken(compiladorParser.MOD, 0); }
		public TerminalNode MULT() { return getToken(compiladorParser.MULT, 0); }
		public TerminalNode DIVI() { return getToken(compiladorParser.DIVI, 0); }
		public Expresion_multiplicativaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_multiplicativa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_multiplicativa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_multiplicativa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_multiplicativa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_multiplicativaContext expresion_multiplicativa() throws RecognitionException {
		return expresion_multiplicativa(0);
	}

	private Expresion_multiplicativaContext expresion_multiplicativa(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_multiplicativaContext _localctx = new Expresion_multiplicativaContext(_ctx, _parentState);
		Expresion_multiplicativaContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expresion_multiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			expresion_postfija(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(125);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Expresion_multiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_multiplicativa);
						setState(116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(117);
						match(MOD);
						setState(118);
						expresion_multiplicativa(2);
						}
						break;
					case 2:
						{
						_localctx = new Expresion_multiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_multiplicativa);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						match(MULT);
						setState(121);
						expresion_postfija(0);
						}
						break;
					case 3:
						{
						_localctx = new Expresion_multiplicativaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_multiplicativa);
						setState(122);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(123);
						match(DIVI);
						setState(124);
						expresion_postfija(0);
						}
						break;
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_aditivaContext extends ParserRuleContext {
		public Expresion_multiplicativaContext expresion_multiplicativa() {
			return getRuleContext(Expresion_multiplicativaContext.class,0);
		}
		public Expresion_aditivaContext expresion_aditiva() {
			return getRuleContext(Expresion_aditivaContext.class,0);
		}
		public TerminalNode SUMA() { return getToken(compiladorParser.SUMA, 0); }
		public TerminalNode DIFF() { return getToken(compiladorParser.DIFF, 0); }
		public Expresion_aditivaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_aditiva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_aditiva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_aditiva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_aditiva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_aditivaContext expresion_aditiva() throws RecognitionException {
		return expresion_aditiva(0);
	}

	private Expresion_aditivaContext expresion_aditiva(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_aditivaContext _localctx = new Expresion_aditivaContext(_ctx, _parentState);
		Expresion_aditivaContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expresion_aditiva, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(131);
			expresion_multiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Expresion_aditivaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_aditiva);
						setState(133);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(134);
						match(SUMA);
						setState(135);
						expresion_multiplicativa(0);
						}
						break;
					case 2:
						{
						_localctx = new Expresion_aditivaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_aditiva);
						setState(136);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(137);
						match(DIFF);
						setState(138);
						expresion_multiplicativa(0);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_relacionalContext extends ParserRuleContext {
		public Expresion_aditivaContext expresion_aditiva() {
			return getRuleContext(Expresion_aditivaContext.class,0);
		}
		public Expresion_relacionalContext expresion_relacional() {
			return getRuleContext(Expresion_relacionalContext.class,0);
		}
		public TerminalNode LE_OP() { return getToken(compiladorParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(compiladorParser.GE_OP, 0); }
		public TerminalNode LT_OP() { return getToken(compiladorParser.LT_OP, 0); }
		public TerminalNode GT_OP() { return getToken(compiladorParser.GT_OP, 0); }
		public Expresion_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_relacionalContext expresion_relacional() throws RecognitionException {
		return expresion_relacional(0);
	}

	private Expresion_relacionalContext expresion_relacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_relacionalContext _localctx = new Expresion_relacionalContext(_ctx, _parentState);
		Expresion_relacionalContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expresion_relacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			expresion_aditiva(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Expresion_relacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_relacional);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						match(LE_OP);
						setState(149);
						expresion_aditiva(0);
						}
						break;
					case 2:
						{
						_localctx = new Expresion_relacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_relacional);
						setState(150);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(151);
						match(GE_OP);
						setState(152);
						expresion_aditiva(0);
						}
						break;
					case 3:
						{
						_localctx = new Expresion_relacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_relacional);
						setState(153);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(154);
						match(LT_OP);
						setState(155);
						expresion_aditiva(0);
						}
						break;
					case 4:
						{
						_localctx = new Expresion_relacionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_relacional);
						setState(156);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(157);
						match(GT_OP);
						setState(158);
						expresion_aditiva(0);
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_igualdadContext extends ParserRuleContext {
		public Expresion_relacionalContext expresion_relacional() {
			return getRuleContext(Expresion_relacionalContext.class,0);
		}
		public Expresion_igualdadContext expresion_igualdad() {
			return getRuleContext(Expresion_igualdadContext.class,0);
		}
		public TerminalNode EQ_OP() { return getToken(compiladorParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(compiladorParser.NE_OP, 0); }
		public Expresion_igualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_igualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_igualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_igualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_igualdadContext expresion_igualdad() throws RecognitionException {
		return expresion_igualdad(0);
	}

	private Expresion_igualdadContext expresion_igualdad(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_igualdadContext _localctx = new Expresion_igualdadContext(_ctx, _parentState);
		Expresion_igualdadContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expresion_igualdad, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(165);
			expresion_relacional(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(173);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Expresion_igualdadContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_igualdad);
						setState(167);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(168);
						match(EQ_OP);
						setState(169);
						expresion_relacional(0);
						}
						break;
					case 2:
						{
						_localctx = new Expresion_igualdadContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_igualdad);
						setState(170);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(171);
						match(NE_OP);
						setState(172);
						expresion_relacional(0);
						}
						break;
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_logica_andContext extends ParserRuleContext {
		public Expresion_igualdadContext expresion_igualdad() {
			return getRuleContext(Expresion_igualdadContext.class,0);
		}
		public Expresion_logica_andContext expresion_logica_and() {
			return getRuleContext(Expresion_logica_andContext.class,0);
		}
		public TerminalNode AND_OP() { return getToken(compiladorParser.AND_OP, 0); }
		public Expresion_logica_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_logica_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_logica_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_logica_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logica_andContext expresion_logica_and() throws RecognitionException {
		return expresion_logica_and(0);
	}

	private Expresion_logica_andContext expresion_logica_and(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_logica_andContext _localctx = new Expresion_logica_andContext(_ctx, _parentState);
		Expresion_logica_andContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expresion_logica_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(179);
			expresion_igualdad(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_logica_andContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_logica_and);
					setState(181);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(182);
					match(AND_OP);
					setState(183);
					expresion_igualdad(0);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_logica_orContext extends ParserRuleContext {
		public Expresion_logica_andContext expresion_logica_and() {
			return getRuleContext(Expresion_logica_andContext.class,0);
		}
		public Expresion_logica_orContext expresion_logica_or() {
			return getRuleContext(Expresion_logica_orContext.class,0);
		}
		public TerminalNode OR_OP() { return getToken(compiladorParser.OR_OP, 0); }
		public Expresion_logica_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_logica_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_logica_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_logica_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_logica_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_logica_orContext expresion_logica_or() throws RecognitionException {
		return expresion_logica_or(0);
	}

	private Expresion_logica_orContext expresion_logica_or(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_logica_orContext _localctx = new Expresion_logica_orContext(_ctx, _parentState);
		Expresion_logica_orContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expresion_logica_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			expresion_logica_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_logica_orContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_logica_or);
					setState(192);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(193);
					match(OR_OP);
					setState(194);
					expresion_logica_and(0);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_asignacionContext extends ParserRuleContext {
		public Expresion_logica_orContext expresion_logica_or() {
			return getRuleContext(Expresion_logica_orContext.class,0);
		}
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public Operador_asignacionContext operador_asignacion() {
			return getRuleContext(Operador_asignacionContext.class,0);
		}
		public Expresion_asignacionContext expresion_asignacion() {
			return getRuleContext(Expresion_asignacionContext.class,0);
		}
		public Expresion_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_asignacionContext expresion_asignacion() throws RecognitionException {
		Expresion_asignacionContext _localctx = new Expresion_asignacionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresion_asignacion);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				expresion_logica_or(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(ID);
				setState(202);
				operador_asignacion();
				setState(203);
				expresion_asignacion();
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

	public static class Operador_asignacionContext extends ParserRuleContext {
		public TerminalNode IGU() { return getToken(compiladorParser.IGU, 0); }
		public TerminalNode MUL_ASIGN() { return getToken(compiladorParser.MUL_ASIGN, 0); }
		public TerminalNode DIV_ASIGN() { return getToken(compiladorParser.DIV_ASIGN, 0); }
		public TerminalNode MOD_ASIGN() { return getToken(compiladorParser.MOD_ASIGN, 0); }
		public TerminalNode ADD_ASIGN() { return getToken(compiladorParser.ADD_ASIGN, 0); }
		public TerminalNode SUB_ASIGN() { return getToken(compiladorParser.SUB_ASIGN, 0); }
		public Operador_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOperador_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOperador_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitOperador_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_asignacionContext operador_asignacion() throws RecognitionException {
		Operador_asignacionContext _localctx = new Operador_asignacionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operador_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGU) | (1L << MUL_ASIGN) | (1L << DIV_ASIGN) | (1L << MOD_ASIGN) | (1L << ADD_ASIGN) | (1L << SUB_ASIGN))) != 0)) ) {
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

	public static class Expresion_primariaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public TerminalNode NUMERO_INT() { return getToken(compiladorParser.NUMERO_INT, 0); }
		public Expresion_primariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_primaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_primaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_primaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_primaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_primariaContext expresion_primaria() throws RecognitionException {
		Expresion_primariaContext _localctx = new Expresion_primariaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresion_primaria);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(PA);
				setState(211);
				expresion(0);
				setState(212);
				match(PC);
				}
				break;
			case NUMERO_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(NUMERO_INT);
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

	public static class Lista_parametros_expresionesContext extends ParserRuleContext {
		public Expresion_asignacionContext expresion_asignacion() {
			return getRuleContext(Expresion_asignacionContext.class,0);
		}
		public Lista_parametros_expresionesContext lista_parametros_expresiones() {
			return getRuleContext(Lista_parametros_expresionesContext.class,0);
		}
		public TerminalNode COM() { return getToken(compiladorParser.COM, 0); }
		public Lista_parametros_expresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros_expresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterLista_parametros_expresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitLista_parametros_expresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitLista_parametros_expresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametros_expresionesContext lista_parametros_expresiones() throws RecognitionException {
		return lista_parametros_expresiones(0);
	}

	private Lista_parametros_expresionesContext lista_parametros_expresiones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_parametros_expresionesContext _localctx = new Lista_parametros_expresionesContext(_ctx, _parentState);
		Lista_parametros_expresionesContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_lista_parametros_expresiones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(218);
				expresion_asignacion();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametros_expresionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros_expresiones);
					setState(222);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(223);
					match(COM);
					setState(224);
					expresion_asignacion();
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresion_postfijaContext extends ParserRuleContext {
		public Expresion_primariaContext expresion_primaria() {
			return getRuleContext(Expresion_primariaContext.class,0);
		}
		public Expresion_postfijaContext expresion_postfija() {
			return getRuleContext(Expresion_postfijaContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(compiladorParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(compiladorParser.DEC_OP, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public Lista_parametros_expresionesContext lista_parametros_expresiones() {
			return getRuleContext(Lista_parametros_expresionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public Expresion_postfijaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_postfija; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpresion_postfija(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpresion_postfija(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpresion_postfija(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresion_postfijaContext expresion_postfija() throws RecognitionException {
		return expresion_postfija(0);
	}

	private Expresion_postfijaContext expresion_postfija(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_postfijaContext _localctx = new Expresion_postfijaContext(_ctx, _parentState);
		Expresion_postfijaContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expresion_postfija, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			expresion_primaria();
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new Expresion_postfijaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_postfija);
						setState(233);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(234);
						match(INC_OP);
						}
						break;
					case 2:
						{
						_localctx = new Expresion_postfijaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_postfija);
						setState(235);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(236);
						match(DEC_OP);
						}
						break;
					case 3:
						{
						_localctx = new Expresion_postfijaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_postfija);
						setState(237);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(238);
						match(PA);
						setState(239);
						lista_parametros_expresiones(0);
						setState(240);
						match(PC);
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public Specificador_tipoContext specificador_tipo() {
			return getRuleContext(Specificador_tipoContext.class,0);
		}
		public Init_lista_declaradorContext init_lista_declarador() {
			return getRuleContext(Init_lista_declaradorContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			specificador_tipo();
			setState(248);
			init_lista_declarador(0);
			setState(249);
			match(PYC);
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

	public static class Init_lista_declaradorContext extends ParserRuleContext {
		public Init_declaradorContext init_declarador() {
			return getRuleContext(Init_declaradorContext.class,0);
		}
		public Init_lista_declaradorContext init_lista_declarador() {
			return getRuleContext(Init_lista_declaradorContext.class,0);
		}
		public TerminalNode COM() { return getToken(compiladorParser.COM, 0); }
		public Init_lista_declaradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_lista_declarador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInit_lista_declarador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInit_lista_declarador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInit_lista_declarador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_lista_declaradorContext init_lista_declarador() throws RecognitionException {
		return init_lista_declarador(0);
	}

	private Init_lista_declaradorContext init_lista_declarador(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Init_lista_declaradorContext _localctx = new Init_lista_declaradorContext(_ctx, _parentState);
		Init_lista_declaradorContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_init_lista_declarador, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(252);
			init_declarador();
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Init_lista_declaradorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_init_lista_declarador);
					setState(254);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(255);
					match(COM);
					setState(256);
					init_declarador();
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Init_declaradorContext extends ParserRuleContext {
		public DeclaradorContext declarador() {
			return getRuleContext(DeclaradorContext.class,0);
		}
		public TerminalNode IGU() { return getToken(compiladorParser.IGU, 0); }
		public Expresion_asignacionContext expresion_asignacion() {
			return getRuleContext(Expresion_asignacionContext.class,0);
		}
		public Init_declaradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_declarador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterInit_declarador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitInit_declarador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitInit_declarador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Init_declaradorContext init_declarador() throws RecognitionException {
		Init_declaradorContext _localctx = new Init_declaradorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_init_declarador);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				declarador(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				declarador(0);
				setState(264);
				match(IGU);
				setState(265);
				expresion_asignacion();
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

	public static class Specificador_tipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(compiladorParser.INT, 0); }
		public TerminalNode VOID() { return getToken(compiladorParser.VOID, 0); }
		public TerminalNode DOUBLE() { return getToken(compiladorParser.DOUBLE, 0); }
		public Specificador_tipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificador_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterSpecificador_tipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitSpecificador_tipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitSpecificador_tipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specificador_tipoContext specificador_tipo() throws RecognitionException {
		Specificador_tipoContext _localctx = new Specificador_tipoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_specificador_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << VOID))) != 0)) ) {
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

	public static class DeclaradorContext extends ParserRuleContext {
		public DeclaradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarador; }
	 
		public DeclaradorContext() { }
		public void copyFrom(DeclaradorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declarador_funcionContext extends DeclaradorContext {
		public DeclaradorContext declarador() {
			return getRuleContext(DeclaradorContext.class,0);
		}
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public Declarador_funcionContext(DeclaradorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclarador_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclarador_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclarador_funcion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentificadorContext extends DeclaradorContext {
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public IdentificadorContext(DeclaradorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaradorContext declarador() throws RecognitionException {
		return declarador(0);
	}

	private DeclaradorContext declarador(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclaradorContext _localctx = new DeclaradorContext(_ctx, _parentState);
		DeclaradorContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_declarador, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IdentificadorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(272);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Declarador_funcionContext(new DeclaradorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_declarador);
					setState(274);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(275);
					match(PA);
					setState(276);
					lista_parametros(0);
					setState(277);
					match(PC);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Lista_parametrosContext extends ParserRuleContext {
		public Declaracion_parametroContext declaracion_parametro() {
			return getRuleContext(Declaracion_parametroContext.class,0);
		}
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public TerminalNode COM() { return getToken(compiladorParser.COM, 0); }
		public Lista_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterLista_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitLista_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitLista_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_parametrosContext lista_parametros() throws RecognitionException {
		return lista_parametros(0);
	}

	private Lista_parametrosContext lista_parametros(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_parametrosContext _localctx = new Lista_parametrosContext(_ctx, _parentState);
		Lista_parametrosContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_lista_parametros, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(285);
				declaracion_parametro();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametrosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros);
					setState(289);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(290);
					match(COM);
					setState(291);
					declaracion_parametro();
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Declaracion_parametroContext extends ParserRuleContext {
		public Specificador_tipoContext specificador_tipo() {
			return getRuleContext(Specificador_tipoContext.class,0);
		}
		public DeclaradorContext declarador() {
			return getRuleContext(DeclaradorContext.class,0);
		}
		public Declaracion_parametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclaracion_parametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclaracion_parametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclaracion_parametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_parametroContext declaracion_parametro() throws RecognitionException {
		Declaracion_parametroContext _localctx = new Declaracion_parametroContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declaracion_parametro);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				specificador_tipo();
				setState(298);
				declarador(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				specificador_tipo();
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

	public static class StatementContext extends ParserRuleContext {
		public SeleccionContext seleccion() {
			return getRuleContext(SeleccionContext.class,0);
		}
		public IteracionContext iteracion() {
			return getRuleContext(IteracionContext.class,0);
		}
		public Expression_statementContext expression_statement() {
			return getRuleContext(Expression_statementContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public SaltoContext salto() {
			return getRuleContext(SaltoContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				seleccion();
				}
				break;
			case WHILE:
			case DO:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				iteracion();
				}
				break;
			case PA:
			case PYC:
			case ID:
			case NUMERO_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				expression_statement();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				bloque();
				}
				break;
			case CONTINUE:
			case BREAK:
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				salto();
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

	public static class Expression_statementContext extends ParserRuleContext {
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterExpression_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitExpression_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitExpression_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression_statement);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				match(PYC);
				}
				break;
			case PA:
			case ID:
			case NUMERO_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				expresion(0);
				setState(312);
				match(PYC);
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

	public static class SeleccionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(compiladorParser.IF, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(compiladorParser.ELSE, 0); }
		public SeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterSeleccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitSeleccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitSeleccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionContext seleccion() throws RecognitionException {
		SeleccionContext _localctx = new SeleccionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_seleccion);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(IF);
				setState(317);
				match(PA);
				setState(318);
				expresion(0);
				setState(319);
				match(PC);
				setState(320);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(IF);
				setState(323);
				match(PA);
				setState(324);
				expresion(0);
				setState(325);
				match(PC);
				setState(326);
				statement();
				setState(327);
				match(ELSE);
				setState(328);
				statement();
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

	public static class IteracionContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(compiladorParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode DO() { return getToken(compiladorParser.DO, 0); }
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public TerminalNode FOR() { return getToken(compiladorParser.FOR, 0); }
		public List<Expression_statementContext> expression_statement() {
			return getRuleContexts(Expression_statementContext.class);
		}
		public Expression_statementContext expression_statement(int i) {
			return getRuleContext(Expression_statementContext.class,i);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public IteracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterIteracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitIteracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitIteracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteracionContext iteracion() throws RecognitionException {
		IteracionContext _localctx = new IteracionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_iteracion);
		try {
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(WHILE);
				setState(333);
				match(PA);
				setState(334);
				expresion(0);
				setState(335);
				match(PC);
				setState(336);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(DO);
				setState(339);
				statement();
				setState(340);
				match(WHILE);
				setState(341);
				match(PA);
				setState(342);
				expresion(0);
				setState(343);
				match(PC);
				setState(344);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				match(FOR);
				setState(347);
				match(PA);
				setState(348);
				expression_statement();
				setState(349);
				expression_statement();
				setState(350);
				match(PC);
				setState(351);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(353);
				match(FOR);
				setState(354);
				match(PA);
				setState(355);
				expression_statement();
				setState(356);
				expression_statement();
				setState(357);
				expresion(0);
				setState(358);
				match(PC);
				setState(359);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				match(FOR);
				setState(362);
				match(PA);
				setState(363);
				declaracion();
				setState(364);
				expression_statement();
				setState(365);
				match(PC);
				setState(366);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				match(FOR);
				setState(369);
				match(PA);
				setState(370);
				declaracion();
				setState(371);
				expression_statement();
				setState(372);
				expresion(0);
				setState(373);
				match(PC);
				setState(374);
				statement();
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

	public static class SaltoContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(compiladorParser.CONTINUE, 0); }
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public TerminalNode BREAK() { return getToken(compiladorParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(compiladorParser.RETURN, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public SaltoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterSalto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitSalto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitSalto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaltoContext salto() throws RecognitionException {
		SaltoContext _localctx = new SaltoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_salto);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(CONTINUE);
				setState(379);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(BREAK);
				setState(381);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				match(RETURN);
				setState(383);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				match(RETURN);
				setState(385);
				expresion(0);
				setState(386);
				match(PYC);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		case 9:
			return expresion_multiplicativa_sempred((Expresion_multiplicativaContext)_localctx, predIndex);
		case 10:
			return expresion_aditiva_sempred((Expresion_aditivaContext)_localctx, predIndex);
		case 11:
			return expresion_relacional_sempred((Expresion_relacionalContext)_localctx, predIndex);
		case 12:
			return expresion_igualdad_sempred((Expresion_igualdadContext)_localctx, predIndex);
		case 13:
			return expresion_logica_and_sempred((Expresion_logica_andContext)_localctx, predIndex);
		case 14:
			return expresion_logica_or_sempred((Expresion_logica_orContext)_localctx, predIndex);
		case 18:
			return lista_parametros_expresiones_sempred((Lista_parametros_expresionesContext)_localctx, predIndex);
		case 19:
			return expresion_postfija_sempred((Expresion_postfijaContext)_localctx, predIndex);
		case 21:
			return init_lista_declarador_sempred((Init_lista_declaradorContext)_localctx, predIndex);
		case 24:
			return declarador_sempred((DeclaradorContext)_localctx, predIndex);
		case 25:
			return lista_parametros_sempred((Lista_parametrosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_multiplicativa_sempred(Expresion_multiplicativaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresion_aditiva_sempred(Expresion_aditivaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_relacional_sempred(Expresion_relacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_igualdad_sempred(Expresion_igualdadContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_logica_and_sempred(Expresion_logica_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_logica_or_sempred(Expresion_logica_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_parametros_expresiones_sempred(Lista_parametros_expresionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresion_postfija_sempred(Expresion_postfijaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean init_lista_declarador_sempred(Init_lista_declaradorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarador_sempred(DeclaradorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_parametros_sempred(Lista_parametrosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\5\4N\n\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b"+
		"\5\bd\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\no\n\n\f\n\16\nr\13\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0080"+
		"\n\13\f\13\16\13\u0083\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u008e"+
		"\n\f\f\f\16\f\u0091\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\7\r\u00a2\n\r\f\r\16\r\u00a5\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u00b0\n\16\f\16\16\16\u00b3\13\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u00bb\n\17\f\17\16\17\u00be\13\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u00c6\n\20\f\20\16\20\u00c9\13\20\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00d0\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00da\n\23\3\24\3\24\3\24\5\24\u00df\n\24\3\24\3\24\3\24\7"+
		"\24\u00e4\n\24\f\24\16\24\u00e7\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\7\25\u00f5\n\25\f\25\16\25\u00f8\13\25\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0104\n\27\f\27"+
		"\16\27\u0107\13\27\3\30\3\30\3\30\3\30\3\30\5\30\u010e\n\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u011a\n\32\f\32\16\32\u011d"+
		"\13\32\3\33\3\33\3\33\5\33\u0122\n\33\3\33\3\33\3\33\7\33\u0127\n\33\f"+
		"\33\16\33\u012a\13\33\3\34\3\34\3\34\3\34\5\34\u0130\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u0137\n\35\3\36\3\36\3\36\3\36\5\36\u013d\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u014d\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \5 \u017b\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0187\n!\3!\2\16\22"+
		"\24\26\30\32\34\36&(,\62\64\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@\2\4\4\2\b\b\21\25\3\2\36 \2\u0197\2B\3\2\2\2"+
		"\4I\3\2\2\2\6M\3\2\2\2\bO\3\2\2\2\nY\3\2\2\2\f_\3\2\2\2\16c\3\2\2\2\20"+
		"e\3\2\2\2\22h\3\2\2\2\24s\3\2\2\2\26\u0084\3\2\2\2\30\u0092\3\2\2\2\32"+
		"\u00a6\3\2\2\2\34\u00b4\3\2\2\2\36\u00bf\3\2\2\2 \u00cf\3\2\2\2\"\u00d1"+
		"\3\2\2\2$\u00d9\3\2\2\2&\u00de\3\2\2\2(\u00e8\3\2\2\2*\u00f9\3\2\2\2,"+
		"\u00fd\3\2\2\2.\u010d\3\2\2\2\60\u010f\3\2\2\2\62\u0111\3\2\2\2\64\u0121"+
		"\3\2\2\2\66\u012f\3\2\2\28\u0136\3\2\2\2:\u013c\3\2\2\2<\u014c\3\2\2\2"+
		">\u017a\3\2\2\2@\u0186\3\2\2\2BC\5\4\3\2CD\7\2\2\3D\3\3\2\2\2EF\5\6\4"+
		"\2FG\5\4\3\2GJ\3\2\2\2HJ\3\2\2\2IE\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KN\5\b"+
		"\5\2LN\5*\26\2MK\3\2\2\2ML\3\2\2\2N\7\3\2\2\2OP\5\60\31\2PQ\5\62\32\2"+
		"QR\5\n\6\2R\t\3\2\2\2ST\7\5\2\2TZ\7\6\2\2UV\7\5\2\2VW\5\f\7\2WX\7\6\2"+
		"\2XZ\3\2\2\2YS\3\2\2\2YU\3\2\2\2Z\13\3\2\2\2[\\\5\16\b\2\\]\5\f\7\2]`"+
		"\3\2\2\2^`\3\2\2\2_[\3\2\2\2_^\3\2\2\2`\r\3\2\2\2ad\5*\26\2bd\58\35\2"+
		"ca\3\2\2\2cb\3\2\2\2d\17\3\2\2\2ef\5\22\n\2fg\7\7\2\2g\21\3\2\2\2hi\b"+
		"\n\1\2ij\5 \21\2jp\3\2\2\2kl\f\3\2\2lm\7\t\2\2mo\5 \21\2nk\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2q\23\3\2\2\2rp\3\2\2\2st\b\13\1\2tu\5(\25\2"+
		"u\u0081\3\2\2\2vw\f\3\2\2wx\7\16\2\2x\u0080\5\24\13\4yz\f\5\2\2z{\7\13"+
		"\2\2{\u0080\5(\25\2|}\f\4\2\2}~\7\r\2\2~\u0080\5(\25\2\177v\3\2\2\2\177"+
		"y\3\2\2\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\25\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\b\f\1\2\u0085"+
		"\u0086\5\24\13\2\u0086\u008f\3\2\2\2\u0087\u0088\f\4\2\2\u0088\u0089\7"+
		"\n\2\2\u0089\u008e\5\24\13\2\u008a\u008b\f\3\2\2\u008b\u008c\7\f\2\2\u008c"+
		"\u008e\5\24\13\2\u008d\u0087\3\2\2\2\u008d\u008a\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\27\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\b\r\1\2\u0093\u0094\5\26\f\2\u0094\u00a3\3"+
		"\2\2\2\u0095\u0096\f\6\2\2\u0096\u0097\7\33\2\2\u0097\u00a2\5\26\f\2\u0098"+
		"\u0099\f\5\2\2\u0099\u009a\7\32\2\2\u009a\u00a2\5\26\f\2\u009b\u009c\f"+
		"\4\2\2\u009c\u009d\7\34\2\2\u009d\u00a2\5\26\f\2\u009e\u009f\f\3\2\2\u009f"+
		"\u00a0\7\35\2\2\u00a0\u00a2\5\26\f\2\u00a1\u0095\3\2\2\2\u00a1\u0098\3"+
		"\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\31\3\2\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a7\b\16\1\2\u00a7\u00a8\5\30\r\2\u00a8\u00b1\3\2\2\2\u00a9"+
		"\u00aa\f\4\2\2\u00aa\u00ab\7\30\2\2\u00ab\u00b0\5\30\r\2\u00ac\u00ad\f"+
		"\3\2\2\u00ad\u00ae\7\31\2\2\u00ae\u00b0\5\30\r\2\u00af\u00a9\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\33\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\17\1\2\u00b5\u00b6"+
		"\5\32\16\2\u00b6\u00bc\3\2\2\2\u00b7\u00b8\f\3\2\2\u00b8\u00b9\7\26\2"+
		"\2\u00b9\u00bb\5\32\16\2\u00ba\u00b7\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bc\3\2\2"+
		"\2\u00bf\u00c0\b\20\1\2\u00c0\u00c1\5\34\17\2\u00c1\u00c7\3\2\2\2\u00c2"+
		"\u00c3\f\3\2\2\u00c3\u00c4\7\27\2\2\u00c4\u00c6\5\34\17\2\u00c5\u00c2"+
		"\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\37\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00d0\5\36\20\2\u00cb\u00cc\7)\2"+
		"\2\u00cc\u00cd\5\"\22\2\u00cd\u00ce\5 \21\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00ca\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0!\3\2\2\2\u00d1\u00d2\t\2\2\2"+
		"\u00d2#\3\2\2\2\u00d3\u00da\7)\2\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6\5\22"+
		"\n\2\u00d6\u00d7\7\4\2\2\u00d7\u00da\3\2\2\2\u00d8\u00da\7*\2\2\u00d9"+
		"\u00d3\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da%\3\2\2\2"+
		"\u00db\u00dc\b\24\1\2\u00dc\u00df\5 \21\2\u00dd\u00df\3\2\2\2\u00de\u00db"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e5\3\2\2\2\u00e0\u00e1\f\4\2\2\u00e1"+
		"\u00e2\7\t\2\2\u00e2\u00e4\5 \21\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\'\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e8\u00e9\b\25\1\2\u00e9\u00ea\5$\23\2\u00ea\u00f6\3\2\2\2"+
		"\u00eb\u00ec\f\5\2\2\u00ec\u00f5\7\17\2\2\u00ed\u00ee\f\4\2\2\u00ee\u00f5"+
		"\7\20\2\2\u00ef\u00f0\f\3\2\2\u00f0\u00f1\7\3\2\2\u00f1\u00f2\5&\24\2"+
		"\u00f2\u00f3\7\4\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00eb\3\2\2\2\u00f4\u00ed"+
		"\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7)\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\5\60\31"+
		"\2\u00fa\u00fb\5,\27\2\u00fb\u00fc\7\7\2\2\u00fc+\3\2\2\2\u00fd\u00fe"+
		"\b\27\1\2\u00fe\u00ff\5.\30\2\u00ff\u0105\3\2\2\2\u0100\u0101\f\3\2\2"+
		"\u0101\u0102\7\t\2\2\u0102\u0104\5.\30\2\u0103\u0100\3\2\2\2\u0104\u0107"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106-\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u010e\5\62\32\2\u0109\u010a\5\62\32\2\u010a\u010b"+
		"\7\b\2\2\u010b\u010c\5 \21\2\u010c\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010d"+
		"\u0109\3\2\2\2\u010e/\3\2\2\2\u010f\u0110\t\3\2\2\u0110\61\3\2\2\2\u0111"+
		"\u0112\b\32\1\2\u0112\u0113\7)\2\2\u0113\u011b\3\2\2\2\u0114\u0115\f\3"+
		"\2\2\u0115\u0116\7\3\2\2\u0116\u0117\5\64\33\2\u0117\u0118\7\4\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0114\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\63\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f"+
		"\b\33\1\2\u011f\u0122\5\66\34\2\u0120\u0122\3\2\2\2\u0121\u011e\3\2\2"+
		"\2\u0121\u0120\3\2\2\2\u0122\u0128\3\2\2\2\u0123\u0124\f\4\2\2\u0124\u0125"+
		"\7\t\2\2\u0125\u0127\5\66\34\2\u0126\u0123\3\2\2\2\u0127\u012a\3\2\2\2"+
		"\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\65\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012b\u012c\5\60\31\2\u012c\u012d\5\62\32\2\u012d\u0130\3\2\2"+
		"\2\u012e\u0130\5\60\31\2\u012f\u012b\3\2\2\2\u012f\u012e\3\2\2\2\u0130"+
		"\67\3\2\2\2\u0131\u0137\5<\37\2\u0132\u0137\5> \2\u0133\u0137\5:\36\2"+
		"\u0134\u0137\5\n\6\2\u0135\u0137\5@!\2\u0136\u0131\3\2\2\2\u0136\u0132"+
		"\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"9\3\2\2\2\u0138\u013d\7\7\2\2\u0139\u013a\5\22\n\2\u013a\u013b\7\7\2\2"+
		"\u013b\u013d\3\2\2\2\u013c\u0138\3\2\2\2\u013c\u0139\3\2\2\2\u013d;\3"+
		"\2\2\2\u013e\u013f\7!\2\2\u013f\u0140\7\3\2\2\u0140\u0141\5\22\n\2\u0141"+
		"\u0142\7\4\2\2\u0142\u0143\58\35\2\u0143\u014d\3\2\2\2\u0144\u0145\7!"+
		"\2\2\u0145\u0146\7\3\2\2\u0146\u0147\5\22\n\2\u0147\u0148\7\4\2\2\u0148"+
		"\u0149\58\35\2\u0149\u014a\7\"\2\2\u014a\u014b\58\35\2\u014b\u014d\3\2"+
		"\2\2\u014c\u013e\3\2\2\2\u014c\u0144\3\2\2\2\u014d=\3\2\2\2\u014e\u014f"+
		"\7#\2\2\u014f\u0150\7\3\2\2\u0150\u0151\5\22\n\2\u0151\u0152\7\4\2\2\u0152"+
		"\u0153\58\35\2\u0153\u017b\3\2\2\2\u0154\u0155\7$\2\2\u0155\u0156\58\35"+
		"\2\u0156\u0157\7#\2\2\u0157\u0158\7\3\2\2\u0158\u0159\5\22\n\2\u0159\u015a"+
		"\7\4\2\2\u015a\u015b\7\7\2\2\u015b\u017b\3\2\2\2\u015c\u015d\7%\2\2\u015d"+
		"\u015e\7\3\2\2\u015e\u015f\5:\36\2\u015f\u0160\5:\36\2\u0160\u0161\7\4"+
		"\2\2\u0161\u0162\58\35\2\u0162\u017b\3\2\2\2\u0163\u0164\7%\2\2\u0164"+
		"\u0165\7\3\2\2\u0165\u0166\5:\36\2\u0166\u0167\5:\36\2\u0167\u0168\5\22"+
		"\n\2\u0168\u0169\7\4\2\2\u0169\u016a\58\35\2\u016a\u017b\3\2\2\2\u016b"+
		"\u016c\7%\2\2\u016c\u016d\7\3\2\2\u016d\u016e\5*\26\2\u016e\u016f\5:\36"+
		"\2\u016f\u0170\7\4\2\2\u0170\u0171\58\35\2\u0171\u017b\3\2\2\2\u0172\u0173"+
		"\7%\2\2\u0173\u0174\7\3\2\2\u0174\u0175\5*\26\2\u0175\u0176\5:\36\2\u0176"+
		"\u0177\5\22\n\2\u0177\u0178\7\4\2\2\u0178\u0179\58\35\2\u0179\u017b\3"+
		"\2\2\2\u017a\u014e\3\2\2\2\u017a\u0154\3\2\2\2\u017a\u015c\3\2\2\2\u017a"+
		"\u0163\3\2\2\2\u017a\u016b\3\2\2\2\u017a\u0172\3\2\2\2\u017b?\3\2\2\2"+
		"\u017c\u017d\7&\2\2\u017d\u0187\7\7\2\2\u017e\u017f\7\'\2\2\u017f\u0187"+
		"\7\7\2\2\u0180\u0181\7(\2\2\u0181\u0187\7\7\2\2\u0182\u0183\7(\2\2\u0183"+
		"\u0184\5\22\n\2\u0184\u0185\7\7\2\2\u0185\u0187\3\2\2\2\u0186\u017c\3"+
		"\2\2\2\u0186\u017e\3\2\2\2\u0186\u0180\3\2\2\2\u0186\u0182\3\2\2\2\u0187"+
		"A\3\2\2\2#IMY_cp\177\u0081\u008d\u008f\u00a1\u00a3\u00af\u00b1\u00bc\u00c7"+
		"\u00cf\u00d9\u00de\u00e5\u00f4\u00f6\u0105\u010d\u011b\u0121\u0128\u012f"+
		"\u0136\u013c\u014c\u017a\u0186";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		RULE_instruccion = 6, RULE_expresiones = 7, RULE_expresion = 8, RULE_operador_multiplicacion = 9, 
		RULE_expresion_multiplicativa = 10, RULE_operador_adicion = 11, RULE_expresion_aditiva = 12, 
		RULE_operador_relacional = 13, RULE_expresion_relacional = 14, RULE_operador_igualdad = 15, 
		RULE_expresion_igualdad = 16, RULE_expresion_logica_and = 17, RULE_expresion_logica_or = 18, 
		RULE_expresion_asignacion = 19, RULE_operador_asignacion = 20, RULE_expresion_primaria = 21, 
		RULE_lista_parametros_expresiones = 22, RULE_operador_prefijo = 23, RULE_expresion_postfija = 24, 
		RULE_declaracion = 25, RULE_init_lista_declarador = 26, RULE_init_declarador = 27, 
		RULE_specificador_tipo = 28, RULE_declarador = 29, RULE_lista_parametros = 30, 
		RULE_declaracion_parametro = 31, RULE_statement = 32, RULE_expression_statement = 33, 
		RULE_seleccion = 34, RULE_iteracion = 35, RULE_salto = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones_externa", "instruccion_externa", "definicion_funcion", 
			"bloque", "instrucciones", "instruccion", "expresiones", "expresion", 
			"operador_multiplicacion", "expresion_multiplicativa", "operador_adicion", 
			"expresion_aditiva", "operador_relacional", "expresion_relacional", "operador_igualdad", 
			"expresion_igualdad", "expresion_logica_and", "expresion_logica_or", 
			"expresion_asignacion", "operador_asignacion", "expresion_primaria", 
			"lista_parametros_expresiones", "operador_prefijo", "expresion_postfija", 
			"declaracion", "init_lista_declarador", "init_declarador", "specificador_tipo", 
			"declarador", "lista_parametros", "declaracion_parametro", "statement", 
			"expression_statement", "seleccion", "iteracion", "salto"
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
			setState(74);
			instrucciones_externa();
			setState(75);
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
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
			case INT:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				instruccion_externa();
				setState(78);
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
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				definicion_funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				declaracion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
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

	public static class Definicion_funcionContext extends ParserRuleContext {
		public Specificador_tipoContext specificador_tipo() {
			return getRuleContext(Specificador_tipoContext.class,0);
		}
		public Init_declaradorContext init_declarador() {
			return getRuleContext(Init_declaradorContext.class,0);
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
			setState(88);
			specificador_tipo();
			setState(89);
			init_declarador();
			setState(90);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(LLA);
				setState(93);
				match(LLC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(LLA);
				setState(95);
				instrucciones();
				setState(96);
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case LLA:
			case PYC:
			case SUMA:
			case DIFF:
			case INC_OP:
			case DEC_OP:
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
				setState(100);
				instruccion();
				setState(101);
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
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
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
			setState(111);
			expresion(0);
			setState(112);
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
			setState(115);
			expresion_asignacion();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
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
					setState(117);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(118);
					match(COM);
					setState(119);
					expresion_asignacion();
					}
					} 
				}
				setState(124);
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

	public static class Operador_multiplicacionContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(compiladorParser.MULT, 0); }
		public TerminalNode DIVI() { return getToken(compiladorParser.DIVI, 0); }
		public TerminalNode MOD() { return getToken(compiladorParser.MOD, 0); }
		public Operador_multiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOperador_multiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOperador_multiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitOperador_multiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_multiplicacionContext operador_multiplicacion() throws RecognitionException {
		Operador_multiplicacionContext _localctx = new Operador_multiplicacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operador_multiplicacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVI) | (1L << MOD))) != 0)) ) {
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

	public static class Expresion_multiplicativaContext extends ParserRuleContext {
		public Expresion_postfijaContext expresion_postfija() {
			return getRuleContext(Expresion_postfijaContext.class,0);
		}
		public Expresion_multiplicativaContext expresion_multiplicativa() {
			return getRuleContext(Expresion_multiplicativaContext.class,0);
		}
		public Operador_multiplicacionContext operador_multiplicacion() {
			return getRuleContext(Operador_multiplicacionContext.class,0);
		}
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expresion_multiplicativa, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			expresion_postfija(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_multiplicativaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_multiplicativa);
					setState(130);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(131);
					operador_multiplicacion();
					setState(132);
					expresion_postfija(0);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Operador_adicionContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladorParser.SUMA, 0); }
		public TerminalNode DIFF() { return getToken(compiladorParser.DIFF, 0); }
		public Operador_adicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_adicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOperador_adicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOperador_adicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitOperador_adicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_adicionContext operador_adicion() throws RecognitionException {
		Operador_adicionContext _localctx = new Operador_adicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operador_adicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !(_la==SUMA || _la==DIFF) ) {
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

	public static class Expresion_aditivaContext extends ParserRuleContext {
		public Expresion_multiplicativaContext expresion_multiplicativa() {
			return getRuleContext(Expresion_multiplicativaContext.class,0);
		}
		public Expresion_aditivaContext expresion_aditiva() {
			return getRuleContext(Expresion_aditivaContext.class,0);
		}
		public Operador_adicionContext operador_adicion() {
			return getRuleContext(Operador_adicionContext.class,0);
		}
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expresion_aditiva, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(142);
			expresion_multiplicativa(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_aditivaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_aditiva);
					setState(144);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(145);
					operador_adicion();
					setState(146);
					expresion_multiplicativa(0);
					}
					} 
				}
				setState(152);
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

	public static class Operador_relacionalContext extends ParserRuleContext {
		public TerminalNode LE_OP() { return getToken(compiladorParser.LE_OP, 0); }
		public TerminalNode GE_OP() { return getToken(compiladorParser.GE_OP, 0); }
		public TerminalNode LT_OP() { return getToken(compiladorParser.LT_OP, 0); }
		public TerminalNode GT_OP() { return getToken(compiladorParser.GT_OP, 0); }
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOperador_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitOperador_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GE_OP) | (1L << LE_OP) | (1L << LT_OP) | (1L << GT_OP))) != 0)) ) {
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

	public static class Expresion_relacionalContext extends ParserRuleContext {
		public Expresion_aditivaContext expresion_aditiva() {
			return getRuleContext(Expresion_aditivaContext.class,0);
		}
		public Expresion_relacionalContext expresion_relacional() {
			return getRuleContext(Expresion_relacionalContext.class,0);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expresion_relacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(156);
			expresion_aditiva(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_relacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_relacional);
					setState(158);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(159);
					operador_relacional();
					setState(160);
					expresion_aditiva(0);
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Operador_igualdadContext extends ParserRuleContext {
		public TerminalNode EQ_OP() { return getToken(compiladorParser.EQ_OP, 0); }
		public TerminalNode NE_OP() { return getToken(compiladorParser.NE_OP, 0); }
		public Operador_igualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_igualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOperador_igualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOperador_igualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitOperador_igualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_igualdadContext operador_igualdad() throws RecognitionException {
		Operador_igualdadContext _localctx = new Operador_igualdadContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operador_igualdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !(_la==EQ_OP || _la==NE_OP) ) {
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

	public static class Expresion_igualdadContext extends ParserRuleContext {
		public Expresion_relacionalContext expresion_relacional() {
			return getRuleContext(Expresion_relacionalContext.class,0);
		}
		public Expresion_igualdadContext expresion_igualdad() {
			return getRuleContext(Expresion_igualdadContext.class,0);
		}
		public Operador_igualdadContext operador_igualdad() {
			return getRuleContext(Operador_igualdadContext.class,0);
		}
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expresion_igualdad, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(170);
			expresion_relacional(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_igualdadContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_igualdad);
					setState(172);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(173);
					operador_igualdad();
					setState(174);
					expresion_relacional(0);
					}
					} 
				}
				setState(180);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expresion_logica_and, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(182);
			expresion_igualdad(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_logica_andContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_logica_and);
					setState(184);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(185);
					match(AND_OP);
					setState(186);
					expresion_igualdad(0);
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expresion_logica_or, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(193);
			expresion_logica_and(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresion_logica_orContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion_logica_or);
					setState(195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(196);
					match(OR_OP);
					setState(197);
					expresion_logica_and(0);
					}
					} 
				}
				setState(202);
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
		enterRule(_localctx, 38, RULE_expresion_asignacion);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				expresion_logica_or(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(ID);
				setState(205);
				operador_asignacion();
				setState(206);
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
		enterRule(_localctx, 40, RULE_operador_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 42, RULE_expresion_primaria);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(PA);
				setState(214);
				expresion(0);
				setState(215);
				match(PC);
				}
				break;
			case NUMERO_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_lista_parametros_expresiones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(221);
				expresion_asignacion();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametros_expresionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros_expresiones);
					setState(225);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(226);
					match(COM);
					setState(227);
					expresion_asignacion();
					}
					} 
				}
				setState(232);
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

	public static class Operador_prefijoContext extends ParserRuleContext {
		public TerminalNode INC_OP() { return getToken(compiladorParser.INC_OP, 0); }
		public TerminalNode DEC_OP() { return getToken(compiladorParser.DEC_OP, 0); }
		public TerminalNode DIFF() { return getToken(compiladorParser.DIFF, 0); }
		public TerminalNode SUMA() { return getToken(compiladorParser.SUMA, 0); }
		public Operador_prefijoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_prefijo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterOperador_prefijo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitOperador_prefijo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitOperador_prefijo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operador_prefijoContext operador_prefijo() throws RecognitionException {
		Operador_prefijoContext _localctx = new Operador_prefijoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operador_prefijo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUMA) | (1L << DIFF) | (1L << INC_OP) | (1L << DEC_OP))) != 0)) ) {
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

	public static class Expresion_postfijaContext extends ParserRuleContext {
		public Expresion_primariaContext expresion_primaria() {
			return getRuleContext(Expresion_primariaContext.class,0);
		}
		public Operador_prefijoContext operador_prefijo() {
			return getRuleContext(Operador_prefijoContext.class,0);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expresion_postfija, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case ID:
			case NUMERO_INT:
				{
				setState(236);
				expresion_primaria();
				}
				break;
			case SUMA:
			case DIFF:
			case INC_OP:
			case DEC_OP:
				{
				setState(237);
				operador_prefijo();
				setState(238);
				expresion_postfija(4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(253);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(251);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Expresion_postfijaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_postfija);
						setState(242);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(243);
						match(INC_OP);
						}
						break;
					case 2:
						{
						_localctx = new Expresion_postfijaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_postfija);
						setState(244);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(245);
						match(DEC_OP);
						}
						break;
					case 3:
						{
						_localctx = new Expresion_postfijaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_postfija);
						setState(246);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(247);
						match(PA);
						setState(248);
						lista_parametros_expresiones(0);
						setState(249);
						match(PC);
						}
						break;
					}
					} 
				}
				setState(255);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 50, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			specificador_tipo();
			setState(257);
			init_lista_declarador(0);
			setState(258);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_init_lista_declarador, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(261);
			init_declarador();
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Init_lista_declaradorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_init_lista_declarador);
					setState(263);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(264);
					match(COM);
					setState(265);
					init_declarador();
					}
					} 
				}
				setState(270);
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
		enterRule(_localctx, 54, RULE_init_declarador);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				declarador(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				declarador(0);
				setState(273);
				match(IGU);
				setState(274);
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
		enterRule(_localctx, 56, RULE_specificador_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public DeclaradorContext declarador() {
			return getRuleContext(DeclaradorContext.class,0);
		}
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public Lista_parametrosContext lista_parametros() {
			return getRuleContext(Lista_parametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public DeclaradorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterDeclarador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitDeclarador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitDeclarador(this);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_declarador, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(281);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(290);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclaradorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarador);
					setState(283);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(284);
					match(PA);
					setState(285);
					lista_parametros(0);
					setState(286);
					match(PC);
					}
					} 
				}
				setState(292);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_lista_parametros, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(294);
				declaracion_parametro();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametrosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros);
					setState(298);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(299);
					match(COM);
					setState(300);
					declaracion_parametro();
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 62, RULE_declaracion_parametro);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				specificador_tipo();
				setState(307);
				declarador(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
		enterRule(_localctx, 64, RULE_statement);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				seleccion();
				}
				break;
			case WHILE:
			case DO:
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				iteracion();
				}
				break;
			case PA:
			case PYC:
			case SUMA:
			case DIFF:
			case INC_OP:
			case DEC_OP:
			case ID:
			case NUMERO_INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				expression_statement();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				bloque();
				}
				break;
			case CONTINUE:
			case BREAK:
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
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
		enterRule(_localctx, 66, RULE_expression_statement);
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PYC:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				match(PYC);
				}
				break;
			case PA:
			case SUMA:
			case DIFF:
			case INC_OP:
			case DEC_OP:
			case ID:
			case NUMERO_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				expresion(0);
				setState(321);
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
		public SeleccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seleccion; }
	 
		public SeleccionContext() { }
		public void copyFrom(SeleccionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Seleccion_ifContext extends SeleccionContext {
		public TerminalNode IF() { return getToken(compiladorParser.IF, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Seleccion_ifContext(SeleccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterSeleccion_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitSeleccion_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitSeleccion_if(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Seleccion_if_elseContext extends SeleccionContext {
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
		public Seleccion_if_elseContext(SeleccionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterSeleccion_if_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitSeleccion_if_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitSeleccion_if_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeleccionContext seleccion() throws RecognitionException {
		SeleccionContext _localctx = new SeleccionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_seleccion);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new Seleccion_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(IF);
				setState(326);
				match(PA);
				setState(327);
				expresion(0);
				setState(328);
				match(PC);
				setState(329);
				statement();
				}
				break;
			case 2:
				_localctx = new Seleccion_if_elseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(IF);
				setState(332);
				match(PA);
				setState(333);
				expresion(0);
				setState(334);
				match(PC);
				setState(335);
				statement();
				setState(336);
				match(ELSE);
				setState(337);
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
		enterRule(_localctx, 70, RULE_iteracion);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(WHILE);
				setState(342);
				match(PA);
				setState(343);
				expresion(0);
				setState(344);
				match(PC);
				setState(345);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(DO);
				setState(348);
				statement();
				setState(349);
				match(WHILE);
				setState(350);
				match(PA);
				setState(351);
				expresion(0);
				setState(352);
				match(PC);
				setState(353);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(FOR);
				setState(356);
				match(PA);
				setState(357);
				expression_statement();
				setState(358);
				expression_statement();
				setState(359);
				match(PC);
				setState(360);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(FOR);
				setState(363);
				match(PA);
				setState(364);
				expression_statement();
				setState(365);
				expression_statement();
				setState(366);
				expresion(0);
				setState(367);
				match(PC);
				setState(368);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(370);
				match(FOR);
				setState(371);
				match(PA);
				setState(372);
				declaracion();
				setState(373);
				expression_statement();
				setState(374);
				match(PC);
				setState(375);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(377);
				match(FOR);
				setState(378);
				match(PA);
				setState(379);
				declaracion();
				setState(380);
				expression_statement();
				setState(381);
				expresion(0);
				setState(382);
				match(PC);
				setState(383);
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
		enterRule(_localctx, 72, RULE_salto);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(CONTINUE);
				setState(388);
				match(PYC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(BREAK);
				setState(390);
				match(PYC);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				match(RETURN);
				setState(392);
				match(PYC);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(393);
				match(RETURN);
				setState(394);
				expresion(0);
				setState(395);
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
		case 10:
			return expresion_multiplicativa_sempred((Expresion_multiplicativaContext)_localctx, predIndex);
		case 12:
			return expresion_aditiva_sempred((Expresion_aditivaContext)_localctx, predIndex);
		case 14:
			return expresion_relacional_sempred((Expresion_relacionalContext)_localctx, predIndex);
		case 16:
			return expresion_igualdad_sempred((Expresion_igualdadContext)_localctx, predIndex);
		case 17:
			return expresion_logica_and_sempred((Expresion_logica_andContext)_localctx, predIndex);
		case 18:
			return expresion_logica_or_sempred((Expresion_logica_orContext)_localctx, predIndex);
		case 22:
			return lista_parametros_expresiones_sempred((Lista_parametros_expresionesContext)_localctx, predIndex);
		case 24:
			return expresion_postfija_sempred((Expresion_postfijaContext)_localctx, predIndex);
		case 26:
			return init_lista_declarador_sempred((Init_lista_declaradorContext)_localctx, predIndex);
		case 29:
			return declarador_sempred((DeclaradorContext)_localctx, predIndex);
		case 30:
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
		}
		return true;
	}
	private boolean expresion_aditiva_sempred(Expresion_aditivaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_relacional_sempred(Expresion_relacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_igualdad_sempred(Expresion_igualdadContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_logica_and_sempred(Expresion_logica_andContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expresion_logica_or_sempred(Expresion_logica_orContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_parametros_expresiones_sempred(Lista_parametros_expresionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expresion_postfija_sempred(Expresion_postfijaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean init_lista_declarador_sempred(Init_lista_declaradorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarador_sempred(DeclaradorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_parametros_sempred(Lista_parametrosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0192\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3T\n"+
		"\3\3\4\3\4\3\4\5\4Y\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n"+
		"\6\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\5\bp\n\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n{\n\n\f\n\16\n~\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u0089\n\f\f\f\16\f\u008c\13\f\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u0097\n\16\f\16\16\16\u009a\13\16\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\7\20\u00a5\n\20\f\20\16\20\u00a8\13\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00b3\n\22\f\22\16\22"+
		"\u00b6\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00be\n\23\f\23\16\23"+
		"\u00c1\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00c9\n\24\f\24\16\24"+
		"\u00cc\13\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d3\n\25\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\5\27\u00dd\n\27\3\30\3\30\3\30\5\30\u00e2\n\30"+
		"\3\30\3\30\3\30\7\30\u00e7\n\30\f\30\16\30\u00ea\13\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u00f3\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u00fe\n\32\f\32\16\32\u0101\13\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u010d\n\34\f\34\16\34\u0110\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0117\n\35\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\7\37\u0123\n\37\f\37\16\37\u0126\13\37\3 \3 \3 \5"+
		" \u012b\n \3 \3 \3 \7 \u0130\n \f \16 \u0133\13 \3!\3!\3!\3!\5!\u0139"+
		"\n!\3\"\3\"\3\"\3\"\3\"\5\"\u0140\n\"\3#\3#\3#\3#\5#\u0146\n#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0156\n$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0184\n%\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\5&\u0190\n&\3&\2\16\22\26\32\36\"$&.\62\66<>\'\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\t\4\2\13"+
		"\13\r\16\4\2\n\n\f\f\3\2\32\35\3\2\30\31\4\2\b\b\21\25\5\2\n\n\f\f\17"+
		"\20\3\2\36 \2\u0197\2L\3\2\2\2\4S\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\nd\3\2"+
		"\2\2\fj\3\2\2\2\16o\3\2\2\2\20q\3\2\2\2\22t\3\2\2\2\24\177\3\2\2\2\26"+
		"\u0081\3\2\2\2\30\u008d\3\2\2\2\32\u008f\3\2\2\2\34\u009b\3\2\2\2\36\u009d"+
		"\3\2\2\2 \u00a9\3\2\2\2\"\u00ab\3\2\2\2$\u00b7\3\2\2\2&\u00c2\3\2\2\2"+
		"(\u00d2\3\2\2\2*\u00d4\3\2\2\2,\u00dc\3\2\2\2.\u00e1\3\2\2\2\60\u00eb"+
		"\3\2\2\2\62\u00f2\3\2\2\2\64\u0102\3\2\2\2\66\u0106\3\2\2\28\u0116\3\2"+
		"\2\2:\u0118\3\2\2\2<\u011a\3\2\2\2>\u012a\3\2\2\2@\u0138\3\2\2\2B\u013f"+
		"\3\2\2\2D\u0145\3\2\2\2F\u0155\3\2\2\2H\u0183\3\2\2\2J\u018f\3\2\2\2L"+
		"M\5\4\3\2MN\7\2\2\3N\3\3\2\2\2OP\5\6\4\2PQ\5\4\3\2QT\3\2\2\2RT\3\2\2\2"+
		"SO\3\2\2\2SR\3\2\2\2T\5\3\2\2\2UY\5\b\5\2VY\5\64\33\2WY\7\7\2\2XU\3\2"+
		"\2\2XV\3\2\2\2XW\3\2\2\2Y\7\3\2\2\2Z[\5:\36\2[\\\58\35\2\\]\5\n\6\2]\t"+
		"\3\2\2\2^_\7\5\2\2_e\7\6\2\2`a\7\5\2\2ab\5\f\7\2bc\7\6\2\2ce\3\2\2\2d"+
		"^\3\2\2\2d`\3\2\2\2e\13\3\2\2\2fg\5\16\b\2gh\5\f\7\2hk\3\2\2\2ik\3\2\2"+
		"\2jf\3\2\2\2ji\3\2\2\2k\r\3\2\2\2lp\5\64\33\2mp\5B\"\2np\7\7\2\2ol\3\2"+
		"\2\2om\3\2\2\2on\3\2\2\2p\17\3\2\2\2qr\5\22\n\2rs\7\7\2\2s\21\3\2\2\2"+
		"tu\b\n\1\2uv\5(\25\2v|\3\2\2\2wx\f\3\2\2xy\7\t\2\2y{\5(\25\2zw\3\2\2\2"+
		"{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\23\3\2\2\2~|\3\2\2\2\177\u0080\t\2\2\2"+
		"\u0080\25\3\2\2\2\u0081\u0082\b\f\1\2\u0082\u0083\5\62\32\2\u0083\u008a"+
		"\3\2\2\2\u0084\u0085\f\3\2\2\u0085\u0086\5\24\13\2\u0086\u0087\5\62\32"+
		"\2\u0087\u0089\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\27\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\t\3\2\2\u008e\31\3\2\2\2\u008f\u0090\b\16\1\2\u0090\u0091\5\26"+
		"\f\2\u0091\u0098\3\2\2\2\u0092\u0093\f\3\2\2\u0093\u0094\5\30\r\2\u0094"+
		"\u0095\5\26\f\2\u0095\u0097\3\2\2\2\u0096\u0092\3\2\2\2\u0097\u009a\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\33\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009c\t\4\2\2\u009c\35\3\2\2\2\u009d\u009e\b\20\1"+
		"\2\u009e\u009f\5\32\16\2\u009f\u00a6\3\2\2\2\u00a0\u00a1\f\3\2\2\u00a1"+
		"\u00a2\5\34\17\2\u00a2\u00a3\5\32\16\2\u00a3\u00a5\3\2\2\2\u00a4\u00a0"+
		"\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\37\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\t\5\2\2\u00aa!\3\2\2\2\u00ab"+
		"\u00ac\b\22\1\2\u00ac\u00ad\5\36\20\2\u00ad\u00b4\3\2\2\2\u00ae\u00af"+
		"\f\3\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\5\36\20\2\u00b1\u00b3\3\2\2\2"+
		"\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5#\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\b\23\1\2\u00b8"+
		"\u00b9\5\"\22\2\u00b9\u00bf\3\2\2\2\u00ba\u00bb\f\3\2\2\u00bb\u00bc\7"+
		"\26\2\2\u00bc\u00be\5\"\22\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0%\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c2\u00c3\b\24\1\2\u00c3\u00c4\5$\23\2\u00c4\u00ca\3\2\2\2\u00c5\u00c6"+
		"\f\3\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00c9\5$\23\2\u00c8\u00c5\3\2\2\2"+
		"\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\'\3"+
		"\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00d3\5&\24\2\u00ce\u00cf\7)\2\2\u00cf"+
		"\u00d0\5*\26\2\u00d0\u00d1\5(\25\2\u00d1\u00d3\3\2\2\2\u00d2\u00cd\3\2"+
		"\2\2\u00d2\u00ce\3\2\2\2\u00d3)\3\2\2\2\u00d4\u00d5\t\6\2\2\u00d5+\3\2"+
		"\2\2\u00d6\u00dd\7)\2\2\u00d7\u00d8\7\3\2\2\u00d8\u00d9\5\22\n\2\u00d9"+
		"\u00da\7\4\2\2\u00da\u00dd\3\2\2\2\u00db\u00dd\7*\2\2\u00dc\u00d6\3\2"+
		"\2\2\u00dc\u00d7\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd-\3\2\2\2\u00de\u00df"+
		"\b\30\1\2\u00df\u00e2\5(\25\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2\2\2"+
		"\u00e1\u00e0\3\2\2\2\u00e2\u00e8\3\2\2\2\u00e3\u00e4\f\4\2\2\u00e4\u00e5"+
		"\7\t\2\2\u00e5\u00e7\5(\25\2\u00e6\u00e3\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9/\3\2\2\2\u00ea\u00e8\3\2\2\2"+
		"\u00eb\u00ec\t\7\2\2\u00ec\61\3\2\2\2\u00ed\u00ee\b\32\1\2\u00ee\u00f3"+
		"\5,\27\2\u00ef\u00f0\5\60\31\2\u00f0\u00f1\5\62\32\6\u00f1\u00f3\3\2\2"+
		"\2\u00f2\u00ed\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\u00ff\3\2\2\2\u00f4\u00f5"+
		"\f\5\2\2\u00f5\u00fe\7\17\2\2\u00f6\u00f7\f\4\2\2\u00f7\u00fe\7\20\2\2"+
		"\u00f8\u00f9\f\3\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb\5.\30\2\u00fb\u00fc"+
		"\7\4\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd"+
		"\u00f8\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\63\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\5:\36\2\u0103\u0104"+
		"\5\66\34\2\u0104\u0105\7\7\2\2\u0105\65\3\2\2\2\u0106\u0107\b\34\1\2\u0107"+
		"\u0108\58\35\2\u0108\u010e\3\2\2\2\u0109\u010a\f\3\2\2\u010a\u010b\7\t"+
		"\2\2\u010b\u010d\58\35\2\u010c\u0109\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\67\3\2\2\2\u0110\u010e\3\2\2"+
		"\2\u0111\u0117\5<\37\2\u0112\u0113\5<\37\2\u0113\u0114\7\b\2\2\u0114\u0115"+
		"\5(\25\2\u0115\u0117\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0117"+
		"9\3\2\2\2\u0118\u0119\t\b\2\2\u0119;\3\2\2\2\u011a\u011b\b\37\1\2\u011b"+
		"\u011c\7)\2\2\u011c\u0124\3\2\2\2\u011d\u011e\f\3\2\2\u011e\u011f\7\3"+
		"\2\2\u011f\u0120\5> \2\u0120\u0121\7\4\2\2\u0121\u0123\3\2\2\2\u0122\u011d"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"=\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\b \1\2\u0128\u012b\5@!\2\u0129"+
		"\u012b\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0129\3\2\2\2\u012b\u0131\3\2"+
		"\2\2\u012c\u012d\f\4\2\2\u012d\u012e\7\t\2\2\u012e\u0130\5@!\2\u012f\u012c"+
		"\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"?\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5:\36\2\u0135\u0136\5<\37\2"+
		"\u0136\u0139\3\2\2\2\u0137\u0139\5:\36\2\u0138\u0134\3\2\2\2\u0138\u0137"+
		"\3\2\2\2\u0139A\3\2\2\2\u013a\u0140\5F$\2\u013b\u0140\5H%\2\u013c\u0140"+
		"\5D#\2\u013d\u0140\5\n\6\2\u013e\u0140\5J&\2\u013f\u013a\3\2\2\2\u013f"+
		"\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u013e\3\2"+
		"\2\2\u0140C\3\2\2\2\u0141\u0146\7\7\2\2\u0142\u0143\5\22\n\2\u0143\u0144"+
		"\7\7\2\2\u0144\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0146"+
		"E\3\2\2\2\u0147\u0148\7!\2\2\u0148\u0149\7\3\2\2\u0149\u014a\5\22\n\2"+
		"\u014a\u014b\7\4\2\2\u014b\u014c\5B\"\2\u014c\u0156\3\2\2\2\u014d\u014e"+
		"\7!\2\2\u014e\u014f\7\3\2\2\u014f\u0150\5\22\n\2\u0150\u0151\7\4\2\2\u0151"+
		"\u0152\5B\"\2\u0152\u0153\7\"\2\2\u0153\u0154\5B\"\2\u0154\u0156\3\2\2"+
		"\2\u0155\u0147\3\2\2\2\u0155\u014d\3\2\2\2\u0156G\3\2\2\2\u0157\u0158"+
		"\7#\2\2\u0158\u0159\7\3\2\2\u0159\u015a\5\22\n\2\u015a\u015b\7\4\2\2\u015b"+
		"\u015c\5B\"\2\u015c\u0184\3\2\2\2\u015d\u015e\7$\2\2\u015e\u015f\5B\""+
		"\2\u015f\u0160\7#\2\2\u0160\u0161\7\3\2\2\u0161\u0162\5\22\n\2\u0162\u0163"+
		"\7\4\2\2\u0163\u0164\7\7\2\2\u0164\u0184\3\2\2\2\u0165\u0166\7%\2\2\u0166"+
		"\u0167\7\3\2\2\u0167\u0168\5D#\2\u0168\u0169\5D#\2\u0169\u016a\7\4\2\2"+
		"\u016a\u016b\5B\"\2\u016b\u0184\3\2\2\2\u016c\u016d\7%\2\2\u016d\u016e"+
		"\7\3\2\2\u016e\u016f\5D#\2\u016f\u0170\5D#\2\u0170\u0171\5\22\n\2\u0171"+
		"\u0172\7\4\2\2\u0172\u0173\5B\"\2\u0173\u0184\3\2\2\2\u0174\u0175\7%\2"+
		"\2\u0175\u0176\7\3\2\2\u0176\u0177\5\64\33\2\u0177\u0178\5D#\2\u0178\u0179"+
		"\7\4\2\2\u0179\u017a\5B\"\2\u017a\u0184\3\2\2\2\u017b\u017c\7%\2\2\u017c"+
		"\u017d\7\3\2\2\u017d\u017e\5\64\33\2\u017e\u017f\5D#\2\u017f\u0180\5\22"+
		"\n\2\u0180\u0181\7\4\2\2\u0181\u0182\5B\"\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0157\3\2\2\2\u0183\u015d\3\2\2\2\u0183\u0165\3\2\2\2\u0183\u016c\3\2"+
		"\2\2\u0183\u0174\3\2\2\2\u0183\u017b\3\2\2\2\u0184I\3\2\2\2\u0185\u0186"+
		"\7&\2\2\u0186\u0190\7\7\2\2\u0187\u0188\7\'\2\2\u0188\u0190\7\7\2\2\u0189"+
		"\u018a\7(\2\2\u018a\u0190\7\7\2\2\u018b\u018c\7(\2\2\u018c\u018d\5\22"+
		"\n\2\u018d\u018e\7\7\2\2\u018e\u0190\3\2\2\2\u018f\u0185\3\2\2\2\u018f"+
		"\u0187\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018b\3\2\2\2\u0190K\3\2\2\2"+
		" SXdjo|\u008a\u0098\u00a6\u00b4\u00bf\u00ca\u00d2\u00dc\u00e1\u00e8\u00f2"+
		"\u00fd\u00ff\u010e\u0116\u0124\u012a\u0131\u0138\u013f\u0145\u0155\u0183"+
		"\u018f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		DIVI=11, AND=12, OR=13, EQ=14, GE=15, LE=16, LT=17, GT=18, INT=19, DOUBLE=20, 
		VOID=21, ID=22, NUMERO_INT=23, WS=24, COMMENT=25, LINE_COMMENT=26, OTRO=27;
	public static final int
		RULE_programa = 0, RULE_instrucciones_externa = 1, RULE_instruccion_externa = 2, 
		RULE_declaracion = 3, RULE_init_lista_declarador = 4, RULE_init_declarador = 5, 
		RULE_specificador_tipo = 6, RULE_declarador = 7, RULE_lista_parametros = 8, 
		RULE_declaracion_parametro = 9, RULE_definicion_funcion = 10, RULE_bloque = 11, 
		RULE_lista_elem_bloque = 12, RULE_elem_bloque = 13, RULE_statement = 14, 
		RULE_instrucciones = 15, RULE_instruccion = 16, RULE_expresion = 17, RULE_asignacion = 18, 
		RULE_lista_asignacion = 19, RULE_term_log = 20, RULE_term = 21, RULE_tl = 22, 
		RULE_t = 23, RULE_f = 24, RULE_factor = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones_externa", "instruccion_externa", "declaracion", 
			"init_lista_declarador", "init_declarador", "specificador_tipo", "declarador", 
			"lista_parametros", "declaracion_parametro", "definicion_funcion", "bloque", 
			"lista_elem_bloque", "elem_bloque", "statement", "instrucciones", "instruccion", 
			"expresion", "asignacion", "lista_asignacion", "term_log", "term", "tl", 
			"t", "f", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "';'", "'='", "','", "'+'", "'*'", 
			"'-'", "'/'", "'&&'", "'||'", "'=='", "'>='", "'<='", "'<'", "'>'", "'int'", 
			"'double'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "LLA", "LLC", "PYC", "IGU", "COM", "SUMA", "MULT", 
			"DIFF", "DIVI", "AND", "OR", "EQ", "GE", "LE", "LT", "GT", "INT", "DOUBLE", 
			"VOID", "ID", "NUMERO_INT", "WS", "COMMENT", "LINE_COMMENT", "OTRO"
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
			setState(52);
			instrucciones_externa();
			setState(53);
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
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				instruccion_externa();
				setState(57);
				instrucciones_externa();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				definicion_funcion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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
		enterRule(_localctx, 6, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			specificador_tipo();
			setState(67);
			init_lista_declarador(0);
			setState(68);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_init_lista_declarador, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(71);
			init_declarador();
			}
			_ctx.stop = _input.LT(-1);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Init_lista_declaradorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_init_lista_declarador);
					setState(73);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(74);
					match(COM);
					setState(75);
					init_declarador();
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public TerminalNode NUMERO_INT() { return getToken(compiladorParser.NUMERO_INT, 0); }
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
		enterRule(_localctx, 10, RULE_init_declarador);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				declarador(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				declarador(0);
				setState(83);
				match(IGU);
				setState(84);
				match(NUMERO_INT);
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
		enterRule(_localctx, 12, RULE_specificador_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_declarador, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IdentificadorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(91);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Declarador_funcionContext(new DeclaradorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_declarador);
					setState(93);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(94);
					match(PA);
					setState(95);
					lista_parametros(0);
					setState(96);
					match(PC);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_lista_parametros, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(104);
				declaracion_parametro();
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_parametrosContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_parametros);
					setState(108);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(109);
					match(COM);
					setState(110);
					declaracion_parametro();
					}
					} 
				}
				setState(115);
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
		enterRule(_localctx, 18, RULE_declaracion_parametro);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				specificador_tipo();
				setState(117);
				declarador(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
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
		enterRule(_localctx, 20, RULE_definicion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			specificador_tipo();
			setState(123);
			declarador(0);
			setState(124);
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
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLC() { return getToken(compiladorParser.LLC, 0); }
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
		enterRule(_localctx, 22, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LLA);
			setState(127);
			instrucciones();
			setState(128);
			match(LLC);
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

	public static class Lista_elem_bloqueContext extends ParserRuleContext {
		public Lista_elem_bloqueContext lista_elem_bloque() {
			return getRuleContext(Lista_elem_bloqueContext.class,0);
		}
		public Elem_bloqueContext elem_bloque() {
			return getRuleContext(Elem_bloqueContext.class,0);
		}
		public Lista_elem_bloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_elem_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterLista_elem_bloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitLista_elem_bloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitLista_elem_bloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_elem_bloqueContext lista_elem_bloque() throws RecognitionException {
		return lista_elem_bloque(0);
	}

	private Lista_elem_bloqueContext lista_elem_bloque(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_elem_bloqueContext _localctx = new Lista_elem_bloqueContext(_ctx, _parentState);
		Lista_elem_bloqueContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_lista_elem_bloque, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Lista_elem_bloqueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_lista_elem_bloque);
					setState(134);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(135);
					elem_bloque();
					}
					} 
				}
				setState(140);
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

	public static class Elem_bloqueContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Elem_bloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterElem_bloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitElem_bloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitElem_bloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elem_bloqueContext elem_bloque() throws RecognitionException {
		Elem_bloqueContext _localctx = new Elem_bloqueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elem_bloque);
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				declaracion();
				}
				break;
			case LLA:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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

	public static class StatementContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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
		enterRule(_localctx, 30, RULE_instrucciones);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLA:
			case INT:
			case DOUBLE:
			case VOID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				instruccion();
				setState(148);
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
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
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
		enterRule(_localctx, 32, RULE_instruccion);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LLA:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				bloque();
				}
				break;
			case INT:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				declaracion();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				asignacion();
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

	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode NUMERO_INT() { return getToken(compiladorParser.NUMERO_INT, 0); }
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
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(NUMERO_INT);
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

	public static class AsignacionContext extends ParserRuleContext {
		public Lista_asignacionContext lista_asignacion() {
			return getRuleContext(Lista_asignacionContext.class,0);
		}
		public TerminalNode PYC() { return getToken(compiladorParser.PYC, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			lista_asignacion();
			setState(161);
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

	public static class Lista_asignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode IGU() { return getToken(compiladorParser.IGU, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode COM() { return getToken(compiladorParser.COM, 0); }
		public Lista_asignacionContext lista_asignacion() {
			return getRuleContext(Lista_asignacionContext.class,0);
		}
		public Lista_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterLista_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitLista_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitLista_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_asignacionContext lista_asignacion() throws RecognitionException {
		Lista_asignacionContext _localctx = new Lista_asignacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lista_asignacion);
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(ID);
				setState(164);
				match(IGU);
				setState(165);
				expresion();
				setState(166);
				match(COM);
				setState(167);
				lista_asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(ID);
				setState(170);
				match(IGU);
				setState(171);
				expresion();
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

	public static class Term_logContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public Term_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterTerm_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitTerm_log(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitTerm_log(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_logContext term_log() throws RecognitionException {
		Term_logContext _localctx = new Term_logContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			term();
			setState(175);
			t();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			factor();
			setState(178);
			f();
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

	public static class TlContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(compiladorParser.AND, 0); }
		public Term_logContext term_log() {
			return getRuleContext(Term_logContext.class,0);
		}
		public TlContext tl() {
			return getRuleContext(TlContext.class,0);
		}
		public TlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterTl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitTl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitTl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TlContext tl() throws RecognitionException {
		TlContext _localctx = new TlContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tl);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(AND);
				setState(181);
				term_log();
				setState(182);
				tl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(compiladorParser.SUMA, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIFF() { return getToken(compiladorParser.DIFF, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_t);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(SUMA);
				setState(188);
				term();
				setState(189);
				t();
				}
				break;
			case DIFF:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(DIFF);
				setState(192);
				term();
				setState(193);
				t();
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 3);
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

	public static class FContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(compiladorParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode DIVI() { return getToken(compiladorParser.DIVI, 0); }
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_f);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(MULT);
				setState(199);
				factor();
				setState(200);
				f();
				}
				break;
			case DIVI:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(DIVI);
				setState(203);
				factor();
				setState(204);
				f();
				}
				break;
			case SUMA:
			case DIFF:
			case AND:
				enterOuterAlt(_localctx, 3);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUMERO_INT() { return getToken(compiladorParser.NUMERO_INT, 0); }
		public TerminalNode ID() { return getToken(compiladorParser.ID, 0); }
		public TerminalNode PA() { return getToken(compiladorParser.PA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PC() { return getToken(compiladorParser.PC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladorListener ) ((compiladorListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladorVisitor ) return ((compiladorVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(NUMERO_INT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(ID);
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(PA);
				setState(212);
				expresion();
				setState(213);
				match(PC);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return init_lista_declarador_sempred((Init_lista_declaradorContext)_localctx, predIndex);
		case 7:
			return declarador_sempred((DeclaradorContext)_localctx, predIndex);
		case 8:
			return lista_parametros_sempred((Lista_parametrosContext)_localctx, predIndex);
		case 12:
			return lista_elem_bloque_sempred((Lista_elem_bloqueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean init_lista_declarador_sempred(Init_lista_declaradorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarador_sempred(DeclaradorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lista_parametros_sempred(Lista_parametrosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_elem_bloque_sempred(Lista_elem_bloqueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3?\n\3\3\4\3\4"+
		"\5\4C\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6O\n\6\f\6\16\6R\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\te\n\t\f\t\16\th\13\t\3\n\3\n\3\n\5\nm\n\n\3\n\3\n\3\n\7\nr\n\n\f"+
		"\n\16\nu\13\n\3\13\3\13\3\13\3\13\5\13{\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\5\16\u0087\n\16\3\16\3\16\7\16\u008b\n\16\f\16\16\16"+
		"\u008e\13\16\3\17\3\17\5\17\u0092\n\17\3\20\3\20\3\21\3\21\3\21\3\21\5"+
		"\21\u009a\n\21\3\22\3\22\3\22\5\22\u009f\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00af\n\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u00bc\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00c7\n\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u00d2\n\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00da\n\33\3\33\2\6\n\20\22\32\34\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\2\3\3\2\25\27\2\u00d8\2\66\3\2\2\2\4>\3\2"+
		"\2\2\6B\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20\\\3\2"+
		"\2\2\22l\3\2\2\2\24z\3\2\2\2\26|\3\2\2\2\30\u0080\3\2\2\2\32\u0086\3\2"+
		"\2\2\34\u0091\3\2\2\2\36\u0093\3\2\2\2 \u0099\3\2\2\2\"\u009e\3\2\2\2"+
		"$\u00a0\3\2\2\2&\u00a2\3\2\2\2(\u00ae\3\2\2\2*\u00b0\3\2\2\2,\u00b3\3"+
		"\2\2\2.\u00bb\3\2\2\2\60\u00c6\3\2\2\2\62\u00d1\3\2\2\2\64\u00d9\3\2\2"+
		"\2\66\67\5\4\3\2\678\7\2\2\38\3\3\2\2\29?\3\2\2\2:;\5\6\4\2;<\5\4\3\2"+
		"<?\3\2\2\2=?\3\2\2\2>9\3\2\2\2>:\3\2\2\2>=\3\2\2\2?\5\3\2\2\2@C\5\26\f"+
		"\2AC\5\b\5\2B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DE\5\16\b\2EF\5\n\6\2FG\7\7"+
		"\2\2G\t\3\2\2\2HI\b\6\1\2IJ\5\f\7\2JP\3\2\2\2KL\f\3\2\2LM\7\t\2\2MO\5"+
		"\f\7\2NK\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\13\3\2\2\2RP\3\2\2\2S"+
		"Y\5\20\t\2TU\5\20\t\2UV\7\b\2\2VW\7\31\2\2WY\3\2\2\2XS\3\2\2\2XT\3\2\2"+
		"\2Y\r\3\2\2\2Z[\t\2\2\2[\17\3\2\2\2\\]\b\t\1\2]^\7\30\2\2^f\3\2\2\2_`"+
		"\f\3\2\2`a\7\3\2\2ab\5\22\n\2bc\7\4\2\2ce\3\2\2\2d_\3\2\2\2eh\3\2\2\2"+
		"fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2\2\2ij\b\n\1\2jm\5\24\13\2km\3\2"+
		"\2\2li\3\2\2\2lk\3\2\2\2ms\3\2\2\2no\f\4\2\2op\7\t\2\2pr\5\24\13\2qn\3"+
		"\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\23\3\2\2\2us\3\2\2\2vw\5\16\b\2"+
		"wx\5\20\t\2x{\3\2\2\2y{\5\16\b\2zv\3\2\2\2zy\3\2\2\2{\25\3\2\2\2|}\5\16"+
		"\b\2}~\5\20\t\2~\177\5\30\r\2\177\27\3\2\2\2\u0080\u0081\7\5\2\2\u0081"+
		"\u0082\5 \21\2\u0082\u0083\7\6\2\2\u0083\31\3\2\2\2\u0084\u0087\b\16\1"+
		"\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u008c"+
		"\3\2\2\2\u0088\u0089\f\4\2\2\u0089\u008b\5\34\17\2\u008a\u0088\3\2\2\2"+
		"\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\33"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0092\5\b\5\2\u0090\u0092\5\36\20\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\35\3\2\2\2\u0093\u0094"+
		"\5\30\r\2\u0094\37\3\2\2\2\u0095\u0096\5\"\22\2\u0096\u0097\5 \21\2\u0097"+
		"\u009a\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a!\3\2\2\2\u009b\u009f\5\30\r\2\u009c\u009f\5\b\5\2\u009d\u009f"+
		"\5&\24\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"#\3\2\2\2\u00a0\u00a1\7\31\2\2\u00a1%\3\2\2\2\u00a2\u00a3\5(\25\2\u00a3"+
		"\u00a4\7\7\2\2\u00a4\'\3\2\2\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\7\b\2"+
		"\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\5(\25\2\u00aa\u00af"+
		"\3\2\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\7\b\2\2\u00ad\u00af\5$\23\2"+
		"\u00ae\u00a5\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af)\3\2\2\2\u00b0\u00b1\5"+
		",\27\2\u00b1\u00b2\5\60\31\2\u00b2+\3\2\2\2\u00b3\u00b4\5\64\33\2\u00b4"+
		"\u00b5\5\62\32\2\u00b5-\3\2\2\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\5*\26"+
		"\2\u00b8\u00b9\5.\30\2\u00b9\u00bc\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b6"+
		"\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc/\3\2\2\2\u00bd\u00be\7\n\2\2\u00be"+
		"\u00bf\5,\27\2\u00bf\u00c0\5\60\31\2\u00c0\u00c7\3\2\2\2\u00c1\u00c2\7"+
		"\f\2\2\u00c2\u00c3\5,\27\2\u00c3\u00c4\5\60\31\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00bd\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\61\3\2\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\5\64\33\2\u00ca"+
		"\u00cb\5\62\32\2\u00cb\u00d2\3\2\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\5"+
		"\64\33\2\u00ce\u00cf\5\62\32\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\3\2\2\2"+
		"\u00d1\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\63"+
		"\3\2\2\2\u00d3\u00da\7\31\2\2\u00d4\u00da\7\30\2\2\u00d5\u00d6\7\3\2\2"+
		"\u00d6\u00d7\5$\23\2\u00d7\u00d8\7\4\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d3"+
		"\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\65\3\2\2\2\24>"+
		"BPXflsz\u0086\u008c\u0091\u0099\u009e\u00ae\u00bb\u00c6\u00d1\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
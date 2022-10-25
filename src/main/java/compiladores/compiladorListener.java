// Generated from /home/anto/Documents/LM/compiladores/ProyectoCompiladores/src/main/java/compiladores/compilador.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladorParser}.
 */
public interface compiladorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladorParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladorParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#instrucciones_externa}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones_externa(compiladorParser.Instrucciones_externaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#instrucciones_externa}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones_externa(compiladorParser.Instrucciones_externaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#instruccion_externa}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_externa(compiladorParser.Instruccion_externaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#instruccion_externa}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_externa(compiladorParser.Instruccion_externaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#init_lista_declarador}.
	 * @param ctx the parse tree
	 */
	void enterInit_lista_declarador(compiladorParser.Init_lista_declaradorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#init_lista_declarador}.
	 * @param ctx the parse tree
	 */
	void exitInit_lista_declarador(compiladorParser.Init_lista_declaradorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#init_declarador}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarador(compiladorParser.Init_declaradorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#init_declarador}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarador(compiladorParser.Init_declaradorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#specificador_tipo}.
	 * @param ctx the parse tree
	 */
	void enterSpecificador_tipo(compiladorParser.Specificador_tipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#specificador_tipo}.
	 * @param ctx the parse tree
	 */
	void exitSpecificador_tipo(compiladorParser.Specificador_tipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarador_funcion}
	 * labeled alternative in {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 */
	void enterDeclarador_funcion(compiladorParser.Declarador_funcionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarador_funcion}
	 * labeled alternative in {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 */
	void exitDeclarador_funcion(compiladorParser.Declarador_funcionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identificador}
	 * labeled alternative in {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(compiladorParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identificador}
	 * labeled alternative in {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(compiladorParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros(compiladorParser.Lista_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros(compiladorParser.Lista_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracion_parametro}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_parametro(compiladorParser.Declaracion_parametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracion_parametro}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_parametro(compiladorParser.Declaracion_parametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion(compiladorParser.Definicion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion(compiladorParser.Definicion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#lista_elem_bloque}.
	 * @param ctx the parse tree
	 */
	void enterLista_elem_bloque(compiladorParser.Lista_elem_bloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#lista_elem_bloque}.
	 * @param ctx the parse tree
	 */
	void exitLista_elem_bloque(compiladorParser.Lista_elem_bloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#elem_bloque}.
	 * @param ctx the parse tree
	 */
	void enterElem_bloque(compiladorParser.Elem_bloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#elem_bloque}.
	 * @param ctx the parse tree
	 */
	void exitElem_bloque(compiladorParser.Elem_bloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(compiladorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(compiladorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladorParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladorParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladorParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladorParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladorParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladorParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladorParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladorParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#lista_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterLista_asignacion(compiladorParser.Lista_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#lista_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitLista_asignacion(compiladorParser.Lista_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#term_log}.
	 * @param ctx the parse tree
	 */
	void enterTerm_log(compiladorParser.Term_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#term_log}.
	 * @param ctx the parse tree
	 */
	void exitTerm_log(compiladorParser.Term_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladorParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladorParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#tl}.
	 * @param ctx the parse tree
	 */
	void enterTl(compiladorParser.TlContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#tl}.
	 * @param ctx the parse tree
	 */
	void exitTl(compiladorParser.TlContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladorParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladorParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(compiladorParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(compiladorParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladorParser.FactorContext ctx);
}
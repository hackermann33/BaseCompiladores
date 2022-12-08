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
	 * Enter a parse tree produced by {@link compiladorParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void enterExpresiones(compiladorParser.ExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void exitExpresiones(compiladorParser.ExpresionesContext ctx);
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
	 * Enter a parse tree produced by {@link compiladorParser#expresion_multiplicativa}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_multiplicativa(compiladorParser.Expresion_multiplicativaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_multiplicativa}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_multiplicativa(compiladorParser.Expresion_multiplicativaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_aditiva(compiladorParser.Expresion_aditivaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_aditiva(compiladorParser.Expresion_aditivaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_relacional(compiladorParser.Expresion_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_relacional(compiladorParser.Expresion_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion_igualdad}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_igualdad(compiladorParser.Expresion_igualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_igualdad}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_igualdad(compiladorParser.Expresion_igualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion_logica_and}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica_and(compiladorParser.Expresion_logica_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_logica_and}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica_and(compiladorParser.Expresion_logica_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion_logica_or}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_logica_or(compiladorParser.Expresion_logica_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_logica_or}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_logica_or(compiladorParser.Expresion_logica_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_asignacion(compiladorParser.Expresion_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_asignacion(compiladorParser.Expresion_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#operador_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterOperador_asignacion(compiladorParser.Operador_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#operador_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitOperador_asignacion(compiladorParser.Operador_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion_primaria}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_primaria(compiladorParser.Expresion_primariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_primaria}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_primaria(compiladorParser.Expresion_primariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#lista_parametros_expresiones}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros_expresiones(compiladorParser.Lista_parametros_expresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#lista_parametros_expresiones}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros_expresiones(compiladorParser.Lista_parametros_expresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#expresion_postfija}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_postfija(compiladorParser.Expresion_postfijaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expresion_postfija}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_postfija(compiladorParser.Expresion_postfijaContext ctx);
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
	 * Enter a parse tree produced by {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 */
	void enterDeclarador(compiladorParser.DeclaradorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 */
	void exitDeclarador(compiladorParser.DeclaradorContext ctx);
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
	 * Enter a parse tree produced by {@link compiladorParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void enterExpression_statement(compiladorParser.Expression_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#expression_statement}.
	 * @param ctx the parse tree
	 */
	void exitExpression_statement(compiladorParser.Expression_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void enterSeleccion(compiladorParser.SeleccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#seleccion}.
	 * @param ctx the parse tree
	 */
	void exitSeleccion(compiladorParser.SeleccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#iteracion}.
	 * @param ctx the parse tree
	 */
	void enterIteracion(compiladorParser.IteracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#iteracion}.
	 * @param ctx the parse tree
	 */
	void exitIteracion(compiladorParser.IteracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#salto}.
	 * @param ctx the parse tree
	 */
	void enterSalto(compiladorParser.SaltoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#salto}.
	 * @param ctx the parse tree
	 */
	void exitSalto(compiladorParser.SaltoContext ctx);
}
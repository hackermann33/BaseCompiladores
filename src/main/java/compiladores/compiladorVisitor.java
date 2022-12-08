// Generated from /home/anto/Documents/LM/compiladores/ProyectoCompiladores/src/main/java/compiladores/compilador.g4 by ANTLR 4.9.2

package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladorParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladorParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#instrucciones_externa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones_externa(compiladorParser.Instrucciones_externaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#instruccion_externa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_externa(compiladorParser.Instruccion_externaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#definicion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion(compiladorParser.Definicion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladorParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladorParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones(compiladorParser.ExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladorParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_multiplicativa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_multiplicativa(compiladorParser.Expresion_multiplicativaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_aditiva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_aditiva(compiladorParser.Expresion_aditivaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_relacional(compiladorParser.Expresion_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_igualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_igualdad(compiladorParser.Expresion_igualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_logica_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica_and(compiladorParser.Expresion_logica_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_logica_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_logica_or(compiladorParser.Expresion_logica_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_asignacion(compiladorParser.Expresion_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#operador_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperador_asignacion(compiladorParser.Operador_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_primaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_primaria(compiladorParser.Expresion_primariaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#lista_parametros_expresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros_expresiones(compiladorParser.Lista_parametros_expresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expresion_postfija}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_postfija(compiladorParser.Expresion_postfijaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladorParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#init_lista_declarador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_lista_declarador(compiladorParser.Init_lista_declaradorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#init_declarador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarador(compiladorParser.Init_declaradorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#specificador_tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificador_tipo(compiladorParser.Specificador_tipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarador(compiladorParser.DeclaradorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#lista_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros(compiladorParser.Lista_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracion_parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_parametro(compiladorParser.Declaracion_parametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(compiladorParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#expression_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_statement(compiladorParser.Expression_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#seleccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccion(compiladorParser.SeleccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#iteracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteracion(compiladorParser.IteracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#salto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalto(compiladorParser.SaltoContext ctx);
}
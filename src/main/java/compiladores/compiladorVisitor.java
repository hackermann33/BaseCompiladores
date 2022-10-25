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
	 * Visit a parse tree produced by the {@code declarador_funcion}
	 * labeled alternative in {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarador_funcion(compiladorParser.Declarador_funcionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identificador}
	 * labeled alternative in {@link compiladorParser#declarador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(compiladorParser.IdentificadorContext ctx);
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
	 * Visit a parse tree produced by {@link compiladorParser#lista_elem_bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_elem_bloque(compiladorParser.Lista_elem_bloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#elem_bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem_bloque(compiladorParser.Elem_bloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(compiladorParser.StatementContext ctx);
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
	 * Visit a parse tree produced by {@link compiladorParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladorParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladorParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#lista_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_asignacion(compiladorParser.Lista_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#term_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_log(compiladorParser.Term_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladorParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#tl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTl(compiladorParser.TlContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(compiladorParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(compiladorParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladorParser.FactorContext ctx);
}
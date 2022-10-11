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
	 * Visit a parse tree produced by {@link compiladorParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladorParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracion_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_var(compiladorParser.Declaracion_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#lista_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_declaracion(compiladorParser.Lista_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#bd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBd(compiladorParser.BdContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#bloque_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_declaracion(compiladorParser.Bloque_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#declaracion_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_func(compiladorParser.Declaracion_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#lista_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_params(compiladorParser.Lista_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(compiladorParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(compiladorParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#implementacion_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementacion_func(compiladorParser.Implementacion_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#lista_params_impl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_params_impl(compiladorParser.Lista_params_implContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#pi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPi(compiladorParser.PiContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#param_impl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_impl(compiladorParser.Param_implContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#opar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpar(compiladorParser.OparContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladorParser.ExpContext ctx);
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
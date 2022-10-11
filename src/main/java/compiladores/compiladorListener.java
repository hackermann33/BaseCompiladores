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
	 * Enter a parse tree produced by {@link compiladorParser#declaracion_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_var(compiladorParser.Declaracion_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracion_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_var(compiladorParser.Declaracion_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#lista_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterLista_declaracion(compiladorParser.Lista_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#lista_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitLista_declaracion(compiladorParser.Lista_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bd}.
	 * @param ctx the parse tree
	 */
	void enterBd(compiladorParser.BdContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bd}.
	 * @param ctx the parse tree
	 */
	void exitBd(compiladorParser.BdContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#bloque_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterBloque_declaracion(compiladorParser.Bloque_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#bloque_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitBloque_declaracion(compiladorParser.Bloque_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#declaracion_func}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_func(compiladorParser.Declaracion_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#declaracion_func}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_func(compiladorParser.Declaracion_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#lista_params}.
	 * @param ctx the parse tree
	 */
	void enterLista_params(compiladorParser.Lista_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#lista_params}.
	 * @param ctx the parse tree
	 */
	void exitLista_params(compiladorParser.Lista_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(compiladorParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(compiladorParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(compiladorParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(compiladorParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#implementacion_func}.
	 * @param ctx the parse tree
	 */
	void enterImplementacion_func(compiladorParser.Implementacion_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#implementacion_func}.
	 * @param ctx the parse tree
	 */
	void exitImplementacion_func(compiladorParser.Implementacion_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#lista_params_impl}.
	 * @param ctx the parse tree
	 */
	void enterLista_params_impl(compiladorParser.Lista_params_implContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#lista_params_impl}.
	 * @param ctx the parse tree
	 */
	void exitLista_params_impl(compiladorParser.Lista_params_implContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#pi}.
	 * @param ctx the parse tree
	 */
	void enterPi(compiladorParser.PiContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#pi}.
	 * @param ctx the parse tree
	 */
	void exitPi(compiladorParser.PiContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#param_impl}.
	 * @param ctx the parse tree
	 */
	void enterParam_impl(compiladorParser.Param_implContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#param_impl}.
	 * @param ctx the parse tree
	 */
	void exitParam_impl(compiladorParser.Param_implContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#opar}.
	 * @param ctx the parse tree
	 */
	void enterOpar(compiladorParser.OparContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#opar}.
	 * @param ctx the parse tree
	 */
	void exitOpar(compiladorParser.OparContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladorParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladorParser.ExpContext ctx);
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
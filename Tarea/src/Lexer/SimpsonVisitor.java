package Lexer;

// Generated from Simpson.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpsonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpsonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SimpsonParser#interpreter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpreter(SimpsonParser.InterpreterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpsonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(SimpsonParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpsonParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(SimpsonParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpsonParser#echo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcho(SimpsonParser.EchoContext ctx);
}
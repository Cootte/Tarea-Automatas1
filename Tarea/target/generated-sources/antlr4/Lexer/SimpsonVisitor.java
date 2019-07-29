// Generated from Simpson.g4 by ANTLR 4.4
package Lexer;
import org.antlr.v4.runtime.misc.NotNull;
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
	 * Visit a parse tree produced by {@link SimpsonParser#statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatments(@NotNull SimpsonParser.StatmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpsonParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(@NotNull SimpsonParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpsonParser#echo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEcho(@NotNull SimpsonParser.EchoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpsonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull SimpsonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpsonParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(@NotNull SimpsonParser.StateContext ctx);
}
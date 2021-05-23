// Generated from C:/Users/harry/IdeaProjects/lenglang/src\lenglangrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lenglangrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lenglangrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(lenglangrammarParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(lenglangrammarParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(lenglangrammarParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#operatorChain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorChain(lenglangrammarParser.OperatorChainContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#equationSide}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationSide(lenglangrammarParser.EquationSideContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(lenglangrammarParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(lenglangrammarParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#mathstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathstatement(lenglangrammarParser.MathstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#logicstatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicstatements(lenglangrammarParser.LogicstatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#stringchars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringchars(lenglangrammarParser.StringcharsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(lenglangrammarParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(lenglangrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(lenglangrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#typenames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypenames(lenglangrammarParser.TypenamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(lenglangrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#codechunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodechunk(lenglangrammarParser.CodechunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(lenglangrammarParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(lenglangrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#seqentialstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqentialstatement(lenglangrammarParser.SeqentialstatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(lenglangrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#iterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterator(lenglangrammarParser.IteratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link lenglangrammarParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(lenglangrammarParser.ScriptContext ctx);
}
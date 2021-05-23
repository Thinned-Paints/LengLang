// Generated from C:/Users/harry/IdeaProjects/lenglang/src\lenglangrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lenglangrammarParser}.
 */
public interface lenglangrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(lenglangrammarParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(lenglangrammarParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(lenglangrammarParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(lenglangrammarParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(lenglangrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(lenglangrammarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#operatorChain}.
	 * @param ctx the parse tree
	 */
	void enterOperatorChain(lenglangrammarParser.OperatorChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#operatorChain}.
	 * @param ctx the parse tree
	 */
	void exitOperatorChain(lenglangrammarParser.OperatorChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#equationSide}.
	 * @param ctx the parse tree
	 */
	void enterEquationSide(lenglangrammarParser.EquationSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#equationSide}.
	 * @param ctx the parse tree
	 */
	void exitEquationSide(lenglangrammarParser.EquationSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(lenglangrammarParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(lenglangrammarParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(lenglangrammarParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(lenglangrammarParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#mathstatement}.
	 * @param ctx the parse tree
	 */
	void enterMathstatement(lenglangrammarParser.MathstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#mathstatement}.
	 * @param ctx the parse tree
	 */
	void exitMathstatement(lenglangrammarParser.MathstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#logicstatements}.
	 * @param ctx the parse tree
	 */
	void enterLogicstatements(lenglangrammarParser.LogicstatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#logicstatements}.
	 * @param ctx the parse tree
	 */
	void exitLogicstatements(lenglangrammarParser.LogicstatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#stringchars}.
	 * @param ctx the parse tree
	 */
	void enterStringchars(lenglangrammarParser.StringcharsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#stringchars}.
	 * @param ctx the parse tree
	 */
	void exitStringchars(lenglangrammarParser.StringcharsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(lenglangrammarParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(lenglangrammarParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(lenglangrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(lenglangrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(lenglangrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(lenglangrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#typenames}.
	 * @param ctx the parse tree
	 */
	void enterTypenames(lenglangrammarParser.TypenamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#typenames}.
	 * @param ctx the parse tree
	 */
	void exitTypenames(lenglangrammarParser.TypenamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(lenglangrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(lenglangrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#codechunk}.
	 * @param ctx the parse tree
	 */
	void enterCodechunk(lenglangrammarParser.CodechunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#codechunk}.
	 * @param ctx the parse tree
	 */
	void exitCodechunk(lenglangrammarParser.CodechunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(lenglangrammarParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(lenglangrammarParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(lenglangrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(lenglangrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#seqentialstatement}.
	 * @param ctx the parse tree
	 */
	void enterSeqentialstatement(lenglangrammarParser.SeqentialstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#seqentialstatement}.
	 * @param ctx the parse tree
	 */
	void exitSeqentialstatement(lenglangrammarParser.SeqentialstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(lenglangrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(lenglangrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterIterator(lenglangrammarParser.IteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitIterator(lenglangrammarParser.IteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link lenglangrammarParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(lenglangrammarParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link lenglangrammarParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(lenglangrammarParser.ScriptContext ctx);
}
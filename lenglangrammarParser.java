// Generated from C:/Users/harry/IdeaProjects/lenglang/src\lenglangrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lenglangrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, INT=13, CHAR=14, BOOL=15, PLUS=16, MINUS=17, 
		DIV=18, MULT=19, RBRACK=20, LBRACK=21, EQUALS=22, PERIOD=23, RCAR=24, 
		IF=25, NOT=26, AND=27, OR=28, XOR=29, ASSERT=30, WHILE=31, QUOTATIONS=32, 
		LOGICALSTART=33, SOL=34, EOL=35, SOP=36, EOP=37;
	public static final int
		RULE_operator = 0, RULE_decimal = 1, RULE_number = 2, RULE_operatorChain = 3, 
		RULE_equationSide = 4, RULE_equation = 5, RULE_container = 6, RULE_mathstatement = 7, 
		RULE_logicstatements = 8, RULE_stringchars = 9, RULE_variable = 10, RULE_string = 11, 
		RULE_type = 12, RULE_typenames = 13, RULE_assignment = 14, RULE_codechunk = 15, 
		RULE_logic = 16, RULE_statement = 17, RULE_seqentialstatement = 18, RULE_print = 19, 
		RULE_iterator = 20, RULE_script = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"operator", "decimal", "number", "operatorChain", "equationSide", "equation", 
			"container", "mathstatement", "logicstatements", "stringchars", "variable", 
			"string", "type", "typenames", "assignment", "codechunk", "logic", "statement", 
			"seqentialstatement", "print", "iterator", "script"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "' '", "'INT'", "'CHAR'", "'STRING'", "'DECIMAL'", "'{'", 
			"';}'", "':'", "'--'", "'PRINT'", "'ITERATE'", null, null, null, "'+'", 
			"'-'", null, null, "')'", "'('", "'='", "'.'", null, "'IF'", null, null, 
			null, null, "'=='", "'WHILE'", null, "'LOGIC('", "'#'", null, null, "'/3'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "CHAR", "BOOL", "PLUS", "MINUS", "DIV", "MULT", "RBRACK", 
			"LBRACK", "EQUALS", "PERIOD", "RCAR", "IF", "NOT", "AND", "OR", "XOR", 
			"ASSERT", "WHILE", "QUOTATIONS", "LOGICALSTART", "SOL", "EOL", "SOP", 
			"EOP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "lenglangrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lenglangrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(lenglangrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(lenglangrammarParser.MINUS, 0); }
		public TerminalNode MULT() { return getToken(lenglangrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(lenglangrammarParser.DIV, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MULT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(lenglangrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(lenglangrammarParser.INT, i);
		}
		public TerminalNode PERIOD() { return getToken(lenglangrammarParser.PERIOD, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(INT);
			setState(47);
			match(PERIOD);
			setState(48);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public TerminalNode INT() { return getToken(lenglangrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(lenglangrammarParser.CHAR, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				decimal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				match(CHAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorChainContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<ContainerContext> container() {
			return getRuleContexts(ContainerContext.class);
		}
		public ContainerContext container(int i) {
			return getRuleContext(ContainerContext.class,i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public OperatorChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterOperatorChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitOperatorChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitOperatorChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorChainContext operatorChain() throws RecognitionException {
		OperatorChainContext _localctx = new OperatorChainContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operatorChain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
				{
				setState(55);
				number();
				}
				break;
			case LBRACK:
				{
				setState(56);
				container();
				}
				break;
			case T__0:
				{
				setState(57);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				operator();
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(61);
					variable();
					}
					break;
				case INT:
				case CHAR:
					{
					setState(62);
					number();
					}
					break;
				case LBRACK:
					{
					setState(63);
					container();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << DIV) | (1L << MULT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationSideContext extends ParserRuleContext {
		public OperatorChainContext operatorChain() {
			return getRuleContext(OperatorChainContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public EquationSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equationSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterEquationSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitEquationSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitEquationSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationSideContext equationSide() throws RecognitionException {
		EquationSideContext _localctx = new EquationSideContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equationSide);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				operatorChain();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				container();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public List<EquationSideContext> equationSide() {
			return getRuleContexts(EquationSideContext.class);
		}
		public EquationSideContext equationSide(int i) {
			return getRuleContext(EquationSideContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(lenglangrammarParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(lenglangrammarParser.EQUALS, i);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			equationSide();
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				match(EQUALS);
				setState(77);
				equationSide();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EQUALS );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(lenglangrammarParser.LBRACK, 0); }
		public MathstatementContext mathstatement() {
			return getRuleContext(MathstatementContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(lenglangrammarParser.RBRACK, 0); }
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_container);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(LBRACK);
			setState(83);
			mathstatement();
			setState(84);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathstatementContext extends ParserRuleContext {
		public EquationSideContext equationSide() {
			return getRuleContext(EquationSideContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public OperatorChainContext operatorChain() {
			return getRuleContext(OperatorChainContext.class,0);
		}
		public MathstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterMathstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitMathstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitMathstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathstatementContext mathstatement() throws RecognitionException {
		MathstatementContext _localctx = new MathstatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mathstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(86);
				equationSide();
				}
				break;
			case 2:
				{
				setState(87);
				container();
				}
				break;
			case 3:
				{
				setState(88);
				operatorChain();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicstatementsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(lenglangrammarParser.IF, 0); }
		public TerminalNode NOT() { return getToken(lenglangrammarParser.NOT, 0); }
		public TerminalNode AND() { return getToken(lenglangrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(lenglangrammarParser.OR, 0); }
		public TerminalNode XOR() { return getToken(lenglangrammarParser.XOR, 0); }
		public TerminalNode ASSERT() { return getToken(lenglangrammarParser.ASSERT, 0); }
		public LogicstatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicstatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterLogicstatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitLogicstatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitLogicstatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicstatementsContext logicstatements() throws RecognitionException {
		LogicstatementsContext _localctx = new LogicstatementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logicstatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << NOT) | (1L << AND) | (1L << OR) | (1L << XOR) | (1L << ASSERT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringcharsContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(lenglangrammarParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(lenglangrammarParser.CHAR, i);
		}
		public StringcharsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringchars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterStringchars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitStringchars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitStringchars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringcharsContext stringchars() throws RecognitionException {
		StringcharsContext _localctx = new StringcharsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stringchars);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(93);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public StringcharsContext stringchars() {
			return getRuleContext(StringcharsContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__0);
			setState(99);
			stringchars();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> QUOTATIONS() { return getTokens(lenglangrammarParser.QUOTATIONS); }
		public TerminalNode QUOTATIONS(int i) {
			return getToken(lenglangrammarParser.QUOTATIONS, i);
		}
		public List<StringcharsContext> stringchars() {
			return getRuleContexts(StringcharsContext.class);
		}
		public StringcharsContext stringchars(int i) {
			return getRuleContext(StringcharsContext.class,i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(QUOTATIONS);
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR:
					{
					setState(102);
					stringchars();
					}
					break;
				case T__1:
					{
					setState(103);
					match(T__1);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 || _la==CHAR );
			setState(108);
			match(QUOTATIONS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(lenglangrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(lenglangrammarParser.CHAR, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				decimal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenamesContext extends ParserRuleContext {
		public TypenamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterTypenames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitTypenames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitTypenames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenamesContext typenames() throws RecognitionException {
		TypenamesContext _localctx = new TypenamesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_typenames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(lenglangrammarParser.EQUALS, 0); }
		public TypenamesContext typenames() {
			return getRuleContext(TypenamesContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(lenglangrammarParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(lenglangrammarParser.RBRACK, 0); }
		public MathstatementContext mathstatement() {
			return getRuleContext(MathstatementContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			variable();
			setState(119);
			match(EQUALS);
			setState(120);
			typenames();
			setState(121);
			match(LBRACK);
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(122);
				mathstatement();
				}
				break;
			case 2:
				{
				setState(123);
				type();
				}
				break;
			}
			setState(126);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodechunkContext extends ParserRuleContext {
		public SeqentialstatementContext seqentialstatement() {
			return getRuleContext(SeqentialstatementContext.class,0);
		}
		public CodechunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codechunk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterCodechunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitCodechunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitCodechunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodechunkContext codechunk() throws RecognitionException {
		CodechunkContext _localctx = new CodechunkContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_codechunk);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__6);
			setState(129);
			seqentialstatement();
			setState(130);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode LOGICALSTART() { return getToken(lenglangrammarParser.LOGICALSTART, 0); }
		public List<TerminalNode> RBRACK() { return getTokens(lenglangrammarParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(lenglangrammarParser.RBRACK, i);
		}
		public CodechunkContext codechunk() {
			return getRuleContext(CodechunkContext.class,0);
		}
		public TerminalNode IF() { return getToken(lenglangrammarParser.IF, 0); }
		public TerminalNode WHILE() { return getToken(lenglangrammarParser.WHILE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(lenglangrammarParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(lenglangrammarParser.LBRACK, i);
		}
		public List<MathstatementContext> mathstatement() {
			return getRuleContexts(MathstatementContext.class);
		}
		public MathstatementContext mathstatement(int i) {
			return getRuleContext(MathstatementContext.class,i);
		}
		public TerminalNode ASSERT() { return getToken(lenglangrammarParser.ASSERT, 0); }
		public TerminalNode NOT() { return getToken(lenglangrammarParser.NOT, 0); }
		public TerminalNode OR() { return getToken(lenglangrammarParser.OR, 0); }
		public TerminalNode XOR() { return getToken(lenglangrammarParser.XOR, 0); }
		public TerminalNode AND() { return getToken(lenglangrammarParser.AND, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LOGICALSTART);
			setState(133);
			_la = _input.LA(1);
			if ( !(_la==IF || _la==WHILE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(134);
				variable();
				}
				break;
			case LBRACK:
				{
				setState(135);
				match(LBRACK);
				setState(136);
				mathstatement();
				setState(137);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(141);
				match(ASSERT);
				}
				break;
			case 2:
				{
				setState(142);
				match(ASSERT);
				setState(143);
				match(NOT);
				}
				break;
			case 3:
				{
				setState(144);
				match(OR);
				}
				break;
			case 4:
				{
				setState(145);
				match(XOR);
				}
				break;
			case 5:
				{
				setState(146);
				match(AND);
				}
				break;
			case 6:
				{
				setState(147);
				match(AND);
				setState(148);
				match(NOT);
				}
				break;
			}
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(151);
				variable();
				}
				break;
			case LBRACK:
				{
				setState(152);
				match(LBRACK);
				setState(153);
				mathstatement();
				setState(154);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(158);
			match(RBRACK);
			setState(159);
			match(T__8);
			setState(160);
			codechunk();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public MathstatementContext mathstatement() {
			return getRuleContext(MathstatementContext.class,0);
		}
		public IteratorContext iterator() {
			return getRuleContext(IteratorContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				logic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				print();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				mathstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				iterator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SeqentialstatementContext extends ParserRuleContext {
		public TerminalNode SOL() { return getToken(lenglangrammarParser.SOL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EOL() { return getToken(lenglangrammarParser.EOL, 0); }
		public SeqentialstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqentialstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterSeqentialstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitSeqentialstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitSeqentialstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeqentialstatementContext seqentialstatement() throws RecognitionException {
		SeqentialstatementContext _localctx = new SeqentialstatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_seqentialstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(SOL);
			setState(170);
			statement();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(171);
				match(T__9);
				setState(172);
				statement();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(lenglangrammarParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(lenglangrammarParser.RBRACK, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(lenglangrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(lenglangrammarParser.INT, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__10);
			setState(181);
			match(LBRACK);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT) | (1L << QUOTATIONS))) != 0)) {
				{
				setState(185);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(182);
					variable();
					}
					break;
				case INT:
					{
					setState(183);
					match(INT);
					}
					break;
				case QUOTATIONS:
					{
					setState(184);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(190);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratorContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(lenglangrammarParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(lenglangrammarParser.RBRACK, 0); }
		public CodechunkContext codechunk() {
			return getRuleContext(CodechunkContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode INT() { return getToken(lenglangrammarParser.INT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public IteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitIterator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitIterator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IteratorContext iterator() throws RecognitionException {
		IteratorContext _localctx = new IteratorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_iterator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__11);
			setState(193);
			match(LBRACK);
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(194);
				variable();
				}
				break;
			case INT:
				{
				setState(195);
				match(INT);
				}
				break;
			case QUOTATIONS:
				{
				setState(196);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
			match(RBRACK);
			setState(200);
			match(T__8);
			setState(201);
			codechunk();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SOP() { return getToken(lenglangrammarParser.SOP, 0); }
		public TerminalNode EOP() { return getToken(lenglangrammarParser.EOP, 0); }
		public List<SeqentialstatementContext> seqentialstatement() {
			return getRuleContexts(SeqentialstatementContext.class);
		}
		public SeqentialstatementContext seqentialstatement(int i) {
			return getRuleContext(SeqentialstatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lenglangrammarListener ) ((lenglangrammarListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof lenglangrammarVisitor ) return ((lenglangrammarVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(SOP);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				seqentialstatement();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SOL );
			setState(209);
			match(EOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00d6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\5\3\5\5\5C\n"+
		"\5\6\5E\n\5\r\5\16\5F\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\6\7Q\n\7\r\7\16"+
		"\7R\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t\\\n\t\3\n\3\n\3\13\6\13a\n\13\r\13"+
		"\16\13b\3\f\3\f\3\f\3\r\3\r\3\r\6\rk\n\r\r\r\16\rl\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\5\16u\n\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\177\n"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u008e\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0098\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u009f\n\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u00aa\n\23\3\24\3\24\3\24\3\24\7\24\u00b0\n\24\f"+
		"\24\16\24\u00b3\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u00bc\n"+
		"\25\f\25\16\25\u00bf\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00c8"+
		"\n\26\3\26\3\26\3\26\3\26\3\27\3\27\6\27\u00d0\n\27\r\27\16\27\u00d1\3"+
		"\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2"+
		"\6\3\2\22\25\3\2\33 \3\2\5\b\4\2\33\33!!\2\u00e4\2.\3\2\2\2\4\60\3\2\2"+
		"\2\6\67\3\2\2\2\b<\3\2\2\2\nK\3\2\2\2\fM\3\2\2\2\16T\3\2\2\2\20[\3\2\2"+
		"\2\22]\3\2\2\2\24`\3\2\2\2\26d\3\2\2\2\30g\3\2\2\2\32t\3\2\2\2\34v\3\2"+
		"\2\2\36x\3\2\2\2 \u0082\3\2\2\2\"\u0086\3\2\2\2$\u00a9\3\2\2\2&\u00ab"+
		"\3\2\2\2(\u00b6\3\2\2\2*\u00c2\3\2\2\2,\u00cd\3\2\2\2./\t\2\2\2/\3\3\2"+
		"\2\2\60\61\7\17\2\2\61\62\7\31\2\2\62\63\7\17\2\2\63\5\3\2\2\2\648\5\4"+
		"\3\2\658\7\17\2\2\668\7\20\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2"+
		"\28\7\3\2\2\29=\5\6\4\2:=\5\16\b\2;=\5\26\f\2<9\3\2\2\2<:\3\2\2\2<;\3"+
		"\2\2\2=D\3\2\2\2>B\5\2\2\2?C\5\26\f\2@C\5\6\4\2AC\5\16\b\2B?\3\2\2\2B"+
		"@\3\2\2\2BA\3\2\2\2CE\3\2\2\2D>\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2"+
		"G\t\3\2\2\2HL\5\b\5\2IL\5\6\4\2JL\5\16\b\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2"+
		"\2L\13\3\2\2\2MP\5\n\6\2NO\7\30\2\2OQ\5\n\6\2PN\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2S\r\3\2\2\2TU\7\27\2\2UV\5\20\t\2VW\7\26\2\2W\17\3\2\2"+
		"\2X\\\5\n\6\2Y\\\5\16\b\2Z\\\5\b\5\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\21"+
		"\3\2\2\2]^\t\3\2\2^\23\3\2\2\2_a\7\20\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2c\25\3\2\2\2de\7\3\2\2ef\5\24\13\2f\27\3\2\2\2gj\7\"\2\2h"+
		"k\5\24\13\2ik\7\4\2\2jh\3\2\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2"+
		"\2mn\3\2\2\2no\7\"\2\2o\31\3\2\2\2pu\7\17\2\2qu\7\20\2\2ru\5\30\r\2su"+
		"\5\4\3\2tp\3\2\2\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\33\3\2\2\2vw\t\4\2\2"+
		"w\35\3\2\2\2xy\5\26\f\2yz\7\30\2\2z{\5\34\17\2{~\7\27\2\2|\177\5\20\t"+
		"\2}\177\5\32\16\2~|\3\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7"+
		"\26\2\2\u0081\37\3\2\2\2\u0082\u0083\7\t\2\2\u0083\u0084\5&\24\2\u0084"+
		"\u0085\7\n\2\2\u0085!\3\2\2\2\u0086\u0087\7#\2\2\u0087\u008d\t\5\2\2\u0088"+
		"\u008e\5\26\f\2\u0089\u008a\7\27\2\2\u008a\u008b\5\20\t\2\u008b\u008c"+
		"\7\26\2\2\u008c\u008e\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2\2\2"+
		"\u008e\u0097\3\2\2\2\u008f\u0098\7 \2\2\u0090\u0091\7 \2\2\u0091\u0098"+
		"\7\34\2\2\u0092\u0098\7\36\2\2\u0093\u0098\7\37\2\2\u0094\u0098\7\35\2"+
		"\2\u0095\u0096\7\35\2\2\u0096\u0098\7\34\2\2\u0097\u008f\3\2\2\2\u0097"+
		"\u0090\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u009e\3\2\2\2\u0099\u009f\5\26\f\2\u009a"+
		"\u009b\7\27\2\2\u009b\u009c\5\20\t\2\u009c\u009d\7\26\2\2\u009d\u009f"+
		"\3\2\2\2\u009e\u0099\3\2\2\2\u009e\u009a\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\7\26\2\2\u00a1\u00a2\7\13\2\2\u00a2\u00a3\5 \21\2\u00a3#\3\2\2"+
		"\2\u00a4\u00aa\5\"\22\2\u00a5\u00aa\5\36\20\2\u00a6\u00aa\5(\25\2\u00a7"+
		"\u00aa\5\20\t\2\u00a8\u00aa\5*\26\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3"+
		"\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"%\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\u00b1\5$\23\2\u00ad\u00ae\7\f\2\2\u00ae"+
		"\u00b0\5$\23\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b5\7%\2\2\u00b5\'\3\2\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00bd\7\27\2\2"+
		"\u00b8\u00bc\5\26\f\2\u00b9\u00bc\7\17\2\2\u00ba\u00bc\5\30\r\2\u00bb"+
		"\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7\26\2\2\u00c1)\3\2\2\2\u00c2\u00c3\7\16\2"+
		"\2\u00c3\u00c7\7\27\2\2\u00c4\u00c8\5\26\f\2\u00c5\u00c8\7\17\2\2\u00c6"+
		"\u00c8\5\30\r\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00cb\7\13\2\2\u00cb"+
		"\u00cc\5 \21\2\u00cc+\3\2\2\2\u00cd\u00cf\7&\2\2\u00ce\u00d0\5&\24\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\'\2\2\u00d4-\3\2\2\2\27\67<BFK"+
		"R[bjlt~\u008d\u0097\u009e\u00a9\u00b1\u00bb\u00bd\u00c7\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
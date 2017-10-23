// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuicyBoysParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTE1=1, QUOTE2=2, INTEGER_LITERAL=3, CHAR_LITERAL=4, FLOAT_LITERAL=5, 
		STRING_LITERAL=6, VARIABLE_IDENTIFIER=7, COMMENT_BLOCK=8, TERMINATOR=9, 
		RETURN_KEYWORD=10, INTEGER_KEYWORD=11, BOOLEAN_KEYWORD=12, FLOAT_KEYWORD=13, 
		STRING_KEYWORD=14, CHAR_KEYWORD=15, VOID_KEYWORD=16, DOUBLE_KEYWORD=17, 
		DO_LOOP=18, WHILE_LOOP=19, FOR_LOOP=20, OUTPUT_FUNCTION=21, INPUT_FUNCTION=22, 
		MAIN_KEYWORD=23, IF_STATEMENT=24, ELSE_STATEMENT=25, COLON=26, ADDITION_OPERATOR=27, 
		SUBTRACTION_OPERATOR=28, MULTIPLICATION_OPERATOR=29, DIVISION_OPERATOR=30, 
		MODULO_OPERATOR=31, INCREMENTAL_OPERATOR=32, DECREMENTAL_OPERATOR=33, 
		AND_operator=34, OR_operator=35, NOT_operator=36, ASSIGNMENT_OPERATOR=37, 
		PLUS_EQUAL_OPERATOR=38, MINUS_EQUAL_OPERATOR=39, TIMES_EQUAL_OPERATOR=40, 
		DIVIDE_EQUAL_OPERATOR=41, MODULO_EQUAL_OPERATOR=42, GREATER_THAN_OPERATOR=43, 
		LESS_THAN_OPERATOR=44, LESS_EQUAL_OPERATOR=45, GREATER_EQUAL_OPERATOR=46, 
		NOT_EQUAL_OPERATOR=47, EQUALS_OPERATOR=48, OPEN_BRACE=49, CLOSE_BRACE=50, 
		OPEN_BRACKET=51, CLOSE_BRACKET=52, OPEN_PAR=53, CLOSE_PAR=54, COMMA=55, 
		ARRAY_IDENTIFIER=56, FUNCTION_IDENTIFIER=57, CONSTANT_KEYWORD=58, TRUE_LITERAL=59, 
		FALSE_LITERAL=60, WS=61;
	public static final int
		RULE_start = 0, RULE_funcdecl_list = 1, RULE_function_declaration = 2, 
		RULE_function_return = 3, RULE_function_noreturn = 4, RULE_parameter_list = 5, 
		RULE_parameters = 6, RULE_function_content = 7, RULE_main_function = 8, 
		RULE_vardecl_list = 9, RULE_var_decl = 10, RULE_data_type = 11, RULE_identifier_list = 12, 
		RULE_statement = 13, RULE_assignment_statement = 14, RULE_funccall_statement = 15, 
		RULE_actual_parameter_list = 16, RULE_actual_params = 17, RULE_multiple_actual_parameters = 18, 
		RULE_return_statement = 19, RULE_if_statement = 20, RULE_while_statement = 21, 
		RULE_do_while_statement = 22, RULE_for_statement = 23, RULE_statement_list = 24, 
		RULE_expression = 25, RULE_string_expression = 26, RULE_num_expression = 27, 
		RULE_num_term = 28, RULE_num_factor = 29, RULE_num_identifier = 30, RULE_bool_expression = 31, 
		RULE_bool_expression_for = 32, RULE_rel_op = 33, RULE_bool_logical = 34, 
		RULE_bool_term = 35, RULE_bool_factor = 36, RULE_bool_identifier = 37, 
		RULE_constdecl_list = 38, RULE_const_statement = 39, RULE_constant = 40, 
		RULE_sign = 41, RULE_output = 42, RULE_output_list = 43, RULE_input = 44, 
		RULE_input_list = 45;
	public static final String[] ruleNames = {
		"start", "funcdecl_list", "function_declaration", "function_return", "function_noreturn", 
		"parameter_list", "parameters", "function_content", "main_function", "vardecl_list", 
		"var_decl", "data_type", "identifier_list", "statement", "assignment_statement", 
		"funccall_statement", "actual_parameter_list", "actual_params", "multiple_actual_parameters", 
		"return_statement", "if_statement", "while_statement", "do_while_statement", 
		"for_statement", "statement_list", "expression", "string_expression", 
		"num_expression", "num_term", "num_factor", "num_identifier", "bool_expression", 
		"bool_expression_for", "rel_op", "bool_logical", "bool_term", "bool_factor", 
		"bool_identifier", "constdecl_list", "const_statement", "constant", "sign", 
		"output", "output_list", "input", "input_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "'^'", null, null, null, null, null, null, "';istop'", "'balik'", 
		"'numero'", "'bolyan'", "'lutang'", "'sinulid'", "'kar'", "'boyd'", "'dobol'", 
		"'gawin habang'", "'habang'", "'simulanhanggang'", "'isulat'", "'basahin'", 
		"'simula'", "'pag'", "'o kaya'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'padagdag'", "'pabawas'", "'tsaka'", "'pwede rin'", "'hindi'", null, 
		"'+='", "'-='", "'*='", null, "'%='", "'>'", "'<'", null, "'>='", "'!='", 
		"'=='", "'{'", "'}'", "'['", "']'", "'('", "')'", "','", null, null, "'kunstant'", 
		"'totoo'", "'talon'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "QUOTE1", "QUOTE2", "INTEGER_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", 
		"STRING_LITERAL", "VARIABLE_IDENTIFIER", "COMMENT_BLOCK", "TERMINATOR", 
		"RETURN_KEYWORD", "INTEGER_KEYWORD", "BOOLEAN_KEYWORD", "FLOAT_KEYWORD", 
		"STRING_KEYWORD", "CHAR_KEYWORD", "VOID_KEYWORD", "DOUBLE_KEYWORD", "DO_LOOP", 
		"WHILE_LOOP", "FOR_LOOP", "OUTPUT_FUNCTION", "INPUT_FUNCTION", "MAIN_KEYWORD", 
		"IF_STATEMENT", "ELSE_STATEMENT", "COLON", "ADDITION_OPERATOR", "SUBTRACTION_OPERATOR", 
		"MULTIPLICATION_OPERATOR", "DIVISION_OPERATOR", "MODULO_OPERATOR", "INCREMENTAL_OPERATOR", 
		"DECREMENTAL_OPERATOR", "AND_operator", "OR_operator", "NOT_operator", 
		"ASSIGNMENT_OPERATOR", "PLUS_EQUAL_OPERATOR", "MINUS_EQUAL_OPERATOR", 
		"TIMES_EQUAL_OPERATOR", "DIVIDE_EQUAL_OPERATOR", "MODULO_EQUAL_OPERATOR", 
		"GREATER_THAN_OPERATOR", "LESS_THAN_OPERATOR", "LESS_EQUAL_OPERATOR", 
		"GREATER_EQUAL_OPERATOR", "NOT_EQUAL_OPERATOR", "EQUALS_OPERATOR", "OPEN_BRACE", 
		"CLOSE_BRACE", "OPEN_BRACKET", "CLOSE_BRACKET", "OPEN_PAR", "CLOSE_PAR", 
		"COMMA", "ARRAY_IDENTIFIER", "FUNCTION_IDENTIFIER", "CONSTANT_KEYWORD", 
		"TRUE_LITERAL", "FALSE_LITERAL", "WS"
	};
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
	public String getGrammarFileName() { return "JuicyBoys.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JuicyBoysParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public Constdecl_listContext constdecl_list() {
			return getRuleContext(Constdecl_listContext.class,0);
		}
		public Funcdecl_listContext funcdecl_list() {
			return getRuleContext(Funcdecl_listContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT_KEYWORD) {
				{
				setState(92);
				constdecl_list();
				}
			}

			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(95);
				funcdecl_list();
				}
				break;
			}
			setState(98);
			main_function();
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

	public static class Funcdecl_listContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Funcdecl_listContext funcdecl_list() {
			return getRuleContext(Funcdecl_listContext.class,0);
		}
		public Funcdecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFuncdecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFuncdecl_list(this);
		}
	}

	public final Funcdecl_listContext funcdecl_list() throws RecognitionException {
		Funcdecl_listContext _localctx = new Funcdecl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcdecl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			function_declaration();
			setState(101);
			funcdecl_list();
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

	public static class Function_declarationContext extends ParserRuleContext {
		public Function_returnContext function_return() {
			return getRuleContext(Function_returnContext.class,0);
		}
		public Function_noreturnContext function_noreturn() {
			return getRuleContext(Function_noreturnContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunction_declaration(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_declaration);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KEYWORD:
			case BOOLEAN_KEYWORD:
			case FLOAT_KEYWORD:
			case STRING_KEYWORD:
			case CHAR_KEYWORD:
			case DOUBLE_KEYWORD:
			case ARRAY_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				function_return();
				}
				break;
			case VOID_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				function_noreturn();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Function_returnContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunction_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunction_return(this);
		}
	}

	public final Function_returnContext function_return() throws RecognitionException {
		Function_returnContext _localctx = new Function_returnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_return);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				data_type();
				setState(108);
				match(FUNCTION_IDENTIFIER);
				setState(109);
				match(OPEN_PAR);
				setState(110);
				parameter_list();
				setState(111);
				match(CLOSE_PAR);
				setState(112);
				function_content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				data_type();
				setState(115);
				match(FUNCTION_IDENTIFIER);
				setState(116);
				match(OPEN_PAR);
				setState(117);
				match(CLOSE_PAR);
				setState(118);
				function_content();
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

	public static class Function_noreturnContext extends ParserRuleContext {
		public TerminalNode VOID_KEYWORD() { return getToken(JuicyBoysParser.VOID_KEYWORD, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Function_noreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_noreturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunction_noreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunction_noreturn(this);
		}
	}

	public final Function_noreturnContext function_noreturn() throws RecognitionException {
		Function_noreturnContext _localctx = new Function_noreturnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_noreturn);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(VOID_KEYWORD);
				setState(123);
				match(FUNCTION_IDENTIFIER);
				setState(124);
				match(OPEN_PAR);
				setState(125);
				parameter_list();
				setState(126);
				match(CLOSE_PAR);
				setState(127);
				function_content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(VOID_KEYWORD);
				setState(130);
				match(FUNCTION_IDENTIFIER);
				setState(131);
				match(OPEN_PAR);
				setState(132);
				match(CLOSE_PAR);
				setState(133);
				function_content();
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

	public static class Parameter_listContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitParameter_list(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			parameters();
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

	public static class ParametersContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JuicyBoysParser.COMMA, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				var_decl();
				setState(139);
				match(COMMA);
				setState(140);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				var_decl();
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

	public static class Function_contentContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(JuicyBoysParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(JuicyBoysParser.CLOSE_BRACE, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Function_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunction_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunction_content(this);
		}
	}

	public final Function_contentContext function_content() throws RecognitionException {
		Function_contentContext _localctx = new Function_contentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(OPEN_BRACE);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KEYWORD) | (1L << BOOLEAN_KEYWORD) | (1L << FLOAT_KEYWORD) | (1L << STRING_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << DOUBLE_KEYWORD) | (1L << ARRAY_IDENTIFIER))) != 0)) {
				{
				setState(146);
				vardecl_list();
				}
			}

			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << CHAR_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << VARIABLE_IDENTIFIER) | (1L << COMMENT_BLOCK) | (1L << RETURN_KEYWORD) | (1L << DO_LOOP) | (1L << WHILE_LOOP) | (1L << FOR_LOOP) | (1L << OUTPUT_FUNCTION) | (1L << IF_STATEMENT) | (1L << SUBTRACTION_OPERATOR) | (1L << NOT_operator) | (1L << GREATER_THAN_OPERATOR) | (1L << OPEN_BRACE) | (1L << OPEN_PAR) | (1L << FUNCTION_IDENTIFIER) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL))) != 0)) {
				{
				setState(149);
				statement_list();
				}
			}

			setState(152);
			match(CLOSE_BRACE);
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

	public static class Main_functionContext extends ParserRuleContext {
		public TerminalNode VOID_KEYWORD() { return getToken(JuicyBoysParser.VOID_KEYWORD, 0); }
		public TerminalNode MAIN_KEYWORD() { return getToken(JuicyBoysParser.MAIN_KEYWORD, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public Function_contentContext function_content() {
			return getRuleContext(Function_contentContext.class,0);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMain_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMain_function(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_main_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(VOID_KEYWORD);
			setState(155);
			match(MAIN_KEYWORD);
			setState(156);
			match(OPEN_PAR);
			setState(157);
			match(CLOSE_PAR);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(158);
				function_content();
				}
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

	public static class Vardecl_listContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Vardecl_listContext vardecl_list() {
			return getRuleContext(Vardecl_listContext.class,0);
		}
		public Vardecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVardecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVardecl_list(this);
		}
	}

	public final Vardecl_listContext vardecl_list() throws RecognitionException {
		Vardecl_listContext _localctx = new Vardecl_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_vardecl_list);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				var_decl();
				setState(162);
				match(TERMINATOR);
				setState(163);
				vardecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				var_decl();
				setState(166);
				match(TERMINATOR);
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

	public static class Var_declContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			data_type();
			setState(171);
			identifier_list();
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER_KEYWORD() { return getToken(JuicyBoysParser.INTEGER_KEYWORD, 0); }
		public TerminalNode DOUBLE_KEYWORD() { return getToken(JuicyBoysParser.DOUBLE_KEYWORD, 0); }
		public TerminalNode CHAR_KEYWORD() { return getToken(JuicyBoysParser.CHAR_KEYWORD, 0); }
		public TerminalNode STRING_KEYWORD() { return getToken(JuicyBoysParser.STRING_KEYWORD, 0); }
		public TerminalNode BOOLEAN_KEYWORD() { return getToken(JuicyBoysParser.BOOLEAN_KEYWORD, 0); }
		public TerminalNode FLOAT_KEYWORD() { return getToken(JuicyBoysParser.FLOAT_KEYWORD, 0); }
		public TerminalNode ARRAY_IDENTIFIER() { return getToken(JuicyBoysParser.ARRAY_IDENTIFIER, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KEYWORD) | (1L << BOOLEAN_KEYWORD) | (1L << FLOAT_KEYWORD) | (1L << STRING_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << DOUBLE_KEYWORD) | (1L << ARRAY_IDENTIFIER))) != 0)) ) {
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

	public static class Identifier_listContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(JuicyBoysParser.COMMA, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier_list);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(VARIABLE_IDENTIFIER);
				setState(176);
				match(COMMA);
				setState(177);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				match(VARIABLE_IDENTIFIER);
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

	public static class StatementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public Do_while_statementContext do_while_statement() {
			return getRuleContext(Do_while_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(JuicyBoysParser.OPEN_BRACE, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(JuicyBoysParser.CLOSE_BRACE, 0); }
		public TerminalNode COMMENT_BLOCK() { return getToken(JuicyBoysParser.COMMENT_BLOCK, 0); }
		public Output_listContext output_list() {
			return getRuleContext(Output_listContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				assignment_statement();
				setState(182);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				funccall_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				do_while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				for_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				match(OPEN_BRACE);
				setState(191);
				statement_list();
				setState(192);
				match(CLOSE_BRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(194);
				match(COMMENT_BLOCK);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(195);
				output_list();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(196);
				output();
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuicyBoysParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INCREMENTAL_OPERATOR() { return getToken(JuicyBoysParser.INCREMENTAL_OPERATOR, 0); }
		public TerminalNode DECREMENTAL_OPERATOR() { return getToken(JuicyBoysParser.DECREMENTAL_OPERATOR, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_statement);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(VARIABLE_IDENTIFIER);
				setState(200);
				match(ASSIGNMENT_OPERATOR);
				setState(201);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(VARIABLE_IDENTIFIER);
				setState(203);
				match(INCREMENTAL_OPERATOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(VARIABLE_IDENTIFIER);
				setState(205);
				match(DECREMENTAL_OPERATOR);
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

	public static class Funccall_statementContext extends ParserRuleContext {
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Funccall_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFunccall_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFunccall_statement(this);
		}
	}

	public final Funccall_statementContext funccall_statement() throws RecognitionException {
		Funccall_statementContext _localctx = new Funccall_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funccall_statement);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(FUNCTION_IDENTIFIER);
				setState(209);
				match(OPEN_PAR);
				setState(210);
				actual_parameter_list();
				setState(211);
				match(CLOSE_PAR);
				setState(212);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(FUNCTION_IDENTIFIER);
				setState(215);
				match(OPEN_PAR);
				setState(216);
				match(CLOSE_PAR);
				setState(217);
				match(TERMINATOR);
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

	public static class Actual_parameter_listContext extends ParserRuleContext {
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Actual_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterActual_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitActual_parameter_list(this);
		}
	}

	public final Actual_parameter_listContext actual_parameter_list() throws RecognitionException {
		Actual_parameter_listContext _localctx = new Actual_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_actual_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			actual_params();
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

	public static class Actual_paramsContext extends ParserRuleContext {
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public Multiple_actual_parametersContext multiple_actual_parameters() {
			return getRuleContext(Multiple_actual_parametersContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JuicyBoysParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Actual_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actual_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterActual_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitActual_params(this);
		}
	}

	public final Actual_paramsContext actual_params() throws RecognitionException {
		Actual_paramsContext _localctx = new Actual_paramsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_actual_params);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				funccall_statement();
				setState(223);
				multiple_actual_parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				match(VARIABLE_IDENTIFIER);
				setState(226);
				multiple_actual_parameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(INTEGER_LITERAL);
				setState(228);
				multiple_actual_parameters();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(229);
				match(FLOAT_LITERAL);
				setState(230);
				multiple_actual_parameters();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(231);
				match(CHAR_LITERAL);
				setState(232);
				multiple_actual_parameters();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				match(STRING_LITERAL);
				setState(234);
				multiple_actual_parameters();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(235);
				expression();
				setState(236);
				multiple_actual_parameters();
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

	public static class Multiple_actual_parametersContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(JuicyBoysParser.COMMA, 0); }
		public Actual_paramsContext actual_params() {
			return getRuleContext(Actual_paramsContext.class,0);
		}
		public Multiple_actual_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_actual_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterMultiple_actual_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitMultiple_actual_parameters(this);
		}
	}

	public final Multiple_actual_parametersContext multiple_actual_parameters() throws RecognitionException {
		Multiple_actual_parametersContext _localctx = new Multiple_actual_parametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multiple_actual_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(COMMA);
			setState(241);
			actual_params();
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

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN_KEYWORD() { return getToken(JuicyBoysParser.RETURN_KEYWORD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterReturn_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitReturn_statement(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(RETURN_KEYWORD);
			setState(244);
			expression();
			setState(245);
			match(TERMINATOR);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF_STATEMENT() { return getToken(JuicyBoysParser.IF_STATEMENT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE_STATEMENT() { return getToken(JuicyBoysParser.ELSE_STATEMENT, 0); }
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_statement);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(IF_STATEMENT);
				setState(248);
				match(OPEN_PAR);
				setState(249);
				bool_expression();
				setState(250);
				match(CLOSE_PAR);
				setState(251);
				statement();
				setState(252);
				match(ELSE_STATEMENT);
				setState(253);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(IF_STATEMENT);
				setState(256);
				match(OPEN_PAR);
				setState(257);
				bool_expression();
				setState(258);
				match(CLOSE_PAR);
				setState(259);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(IF_STATEMENT);
				setState(262);
				match(OPEN_PAR);
				setState(263);
				bool_expression();
				notifyErrorListeners("Missing ')' ");
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE_LOOP() { return getToken(JuicyBoysParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitWhile_statement(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(WHILE_LOOP);
			setState(269);
			match(OPEN_PAR);
			setState(270);
			bool_expression();
			setState(271);
			match(CLOSE_PAR);
			setState(272);
			statement();
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

	public static class Do_while_statementContext extends ParserRuleContext {
		public TerminalNode DO_LOOP() { return getToken(JuicyBoysParser.DO_LOOP, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE_LOOP() { return getToken(JuicyBoysParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Do_while_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterDo_while_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitDo_while_statement(this);
		}
	}

	public final Do_while_statementContext do_while_statement() throws RecognitionException {
		Do_while_statementContext _localctx = new Do_while_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(DO_LOOP);
			setState(275);
			statement();
			setState(276);
			match(WHILE_LOOP);
			setState(277);
			match(OPEN_PAR);
			setState(278);
			bool_expression_for();
			setState(279);
			match(CLOSE_PAR);
			setState(280);
			match(TERMINATOR);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR_LOOP() { return getToken(JuicyBoysParser.FOR_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public TerminalNode INTEGER_KEYWORD() { return getToken(JuicyBoysParser.INTEGER_KEYWORD, 0); }
		public List<Assignment_statementContext> assignment_statement() {
			return getRuleContexts(Assignment_statementContext.class);
		}
		public Assignment_statementContext assignment_statement(int i) {
			return getRuleContext(Assignment_statementContext.class,i);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(JuicyBoysParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(JuicyBoysParser.TERMINATOR, i);
		}
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(FOR_LOOP);
			setState(283);
			match(OPEN_PAR);
			setState(284);
			match(INTEGER_KEYWORD);
			setState(285);
			assignment_statement();
			setState(286);
			match(TERMINATOR);
			setState(287);
			bool_expression_for();
			setState(288);
			match(TERMINATOR);
			setState(289);
			assignment_statement();
			setState(290);
			match(CLOSE_PAR);
			setState(291);
			statement();
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

	public static class Statement_listContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterStatement_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitStatement_list(this);
		}
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		Statement_listContext _localctx = new Statement_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statement_list);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				statement();
				setState(294);
				statement_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				statement();
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

	public static class ExpressionContext extends ParserRuleContext {
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				num_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				bool_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(FUNCTION_IDENTIFIER);
				setState(303);
				match(OPEN_PAR);
				setState(304);
				actual_parameter_list();
				setState(305);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				match(FUNCTION_IDENTIFIER);
				setState(308);
				match(OPEN_PAR);
				setState(309);
				match(CLOSE_PAR);
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

	public static class String_expressionContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ADDITION_OPERATOR() { return getToken(JuicyBoysParser.ADDITION_OPERATOR, 0); }
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public TerminalNode NOT_operator() { return getToken(JuicyBoysParser.NOT_operator, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(JuicyBoysParser.SUBTRACTION_OPERATOR, 0); }
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitString_expression(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_string_expression);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(VARIABLE_IDENTIFIER);
				setState(313);
				match(ADDITION_OPERATOR);
				setState(314);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(STRING_LITERAL);
				setState(316);
				match(ADDITION_OPERATOR);
				setState(317);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(319);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(320);
				match(NOT_operator);
				setState(321);
				string_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				match(SUBTRACTION_OPERATOR);
				setState(323);
				string_expression();
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

	public static class Num_expressionContext extends ParserRuleContext {
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public TerminalNode ADDITION_OPERATOR() { return getToken(JuicyBoysParser.ADDITION_OPERATOR, 0); }
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(JuicyBoysParser.SUBTRACTION_OPERATOR, 0); }
		public Num_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNum_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNum_expression(this);
		}
	}

	public final Num_expressionContext num_expression() throws RecognitionException {
		Num_expressionContext _localctx = new Num_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_num_expression);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				num_term();
				setState(327);
				match(ADDITION_OPERATOR);
				setState(328);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				num_term();
				setState(331);
				match(SUBTRACTION_OPERATOR);
				setState(332);
				num_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				num_term();
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

	public static class Num_termContext extends ParserRuleContext {
		public Num_factorContext num_factor() {
			return getRuleContext(Num_factorContext.class,0);
		}
		public TerminalNode MULTIPLICATION_OPERATOR() { return getToken(JuicyBoysParser.MULTIPLICATION_OPERATOR, 0); }
		public Num_termContext num_term() {
			return getRuleContext(Num_termContext.class,0);
		}
		public TerminalNode DIVISION_OPERATOR() { return getToken(JuicyBoysParser.DIVISION_OPERATOR, 0); }
		public TerminalNode MODULO_OPERATOR() { return getToken(JuicyBoysParser.MODULO_OPERATOR, 0); }
		public TerminalNode INCREMENTAL_OPERATOR() { return getToken(JuicyBoysParser.INCREMENTAL_OPERATOR, 0); }
		public TerminalNode DECREMENTAL_OPERATOR() { return getToken(JuicyBoysParser.DECREMENTAL_OPERATOR, 0); }
		public Num_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNum_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNum_term(this);
		}
	}

	public final Num_termContext num_term() throws RecognitionException {
		Num_termContext _localctx = new Num_termContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_num_term);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				num_factor();
				setState(338);
				match(MULTIPLICATION_OPERATOR);
				setState(339);
				num_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				num_factor();
				setState(342);
				match(DIVISION_OPERATOR);
				setState(343);
				num_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				num_factor();
				setState(346);
				match(MODULO_OPERATOR);
				setState(347);
				num_term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				num_factor();
				setState(350);
				match(INCREMENTAL_OPERATOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				num_factor();
				setState(353);
				match(DECREMENTAL_OPERATOR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(355);
				num_factor();
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

	public static class Num_factorContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Num_expressionContext num_expression() {
			return getRuleContext(Num_expressionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JuicyBoysParser.FLOAT_LITERAL, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(JuicyBoysParser.GREATER_THAN_OPERATOR, 0); }
		public Num_identifierContext num_identifier() {
			return getRuleContext(Num_identifierContext.class,0);
		}
		public Num_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNum_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNum_factor(this);
		}
	}

	public final Num_factorContext num_factor() throws RecognitionException {
		Num_factorContext _localctx = new Num_factorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_num_factor);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(OPEN_PAR);
				setState(359);
				num_expression();
				setState(360);
				match(CLOSE_PAR);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(CHAR_LITERAL);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(363);
				match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				match(FLOAT_LITERAL);
				}
				break;
			case GREATER_THAN_OPERATOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(365);
				match(GREATER_THAN_OPERATOR);
				setState(366);
				num_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Num_identifierContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public Num_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterNum_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitNum_identifier(this);
		}
	}

	public final Num_identifierContext num_identifier() throws RecognitionException {
		Num_identifierContext _localctx = new Num_identifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_num_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(STRING_LITERAL);
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public Bool_expression_forContext bool_expression_for() {
			return getRuleContext(Bool_expression_forContext.class,0);
		}
		public TerminalNode TRUE_LITERAL() { return getToken(JuicyBoysParser.TRUE_LITERAL, 0); }
		public TerminalNode FALSE_LITERAL() { return getToken(JuicyBoysParser.FALSE_LITERAL, 0); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression() throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bool_expression);
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_LITERAL:
			case CHAR_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
			case VARIABLE_IDENTIFIER:
			case SUBTRACTION_OPERATOR:
			case NOT_operator:
			case GREATER_THAN_OPERATOR:
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				bool_expression_for();
				}
				break;
			case TRUE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(TRUE_LITERAL);
				}
				break;
			case FALSE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				match(FALSE_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bool_expression_forContext extends ParserRuleContext {
		public List<Num_expressionContext> num_expression() {
			return getRuleContexts(Num_expressionContext.class);
		}
		public Num_expressionContext num_expression(int i) {
			return getRuleContext(Num_expressionContext.class,i);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode EQUALS_OPERATOR() { return getToken(JuicyBoysParser.EQUALS_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.NOT_EQUAL_OPERATOR, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public List<TerminalNode> VARIABLE_IDENTIFIER() { return getTokens(JuicyBoysParser.VARIABLE_IDENTIFIER); }
		public TerminalNode VARIABLE_IDENTIFIER(int i) {
			return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, i);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public Bool_expression_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expression_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_expression_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_expression_for(this);
		}
	}

	public final Bool_expression_forContext bool_expression_for() throws RecognitionException {
		Bool_expression_forContext _localctx = new Bool_expression_forContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_bool_expression_for);
		try {
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				num_expression();
				setState(377);
				rel_op();
				setState(378);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				string_expression();
				setState(381);
				match(EQUALS_OPERATOR);
				setState(382);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				string_expression();
				setState(385);
				match(NOT_EQUAL_OPERATOR);
				setState(386);
				string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				bool_logical();
				setState(389);
				match(EQUALS_OPERATOR);
				setState(390);
				bool_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				bool_logical();
				setState(393);
				match(NOT_EQUAL_OPERATOR);
				setState(394);
				bool_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
				bool_logical();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(397);
				match(VARIABLE_IDENTIFIER);
				setState(398);
				rel_op();
				setState(399);
				match(INTEGER_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(401);
				match(VARIABLE_IDENTIFIER);
				setState(402);
				rel_op();
				setState(403);
				match(VARIABLE_IDENTIFIER);
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

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode EQUALS_OPERATOR() { return getToken(JuicyBoysParser.EQUALS_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.NOT_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.LESS_EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_EQUAL_OPERATOR() { return getToken(JuicyBoysParser.GREATER_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(JuicyBoysParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(JuicyBoysParser.GREATER_THAN_OPERATOR, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATER_THAN_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << LESS_EQUAL_OPERATOR) | (1L << GREATER_EQUAL_OPERATOR) | (1L << NOT_EQUAL_OPERATOR) | (1L << EQUALS_OPERATOR))) != 0)) ) {
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

	public static class Bool_logicalContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public TerminalNode OR_operator() { return getToken(JuicyBoysParser.OR_operator, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public Bool_logicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_logical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_logical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_logical(this);
		}
	}

	public final Bool_logicalContext bool_logical() throws RecognitionException {
		Bool_logicalContext _localctx = new Bool_logicalContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bool_logical);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				bool_term();
				setState(410);
				match(OR_operator);
				setState(411);
				bool_logical();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				bool_term();
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

	public static class Bool_termContext extends ParserRuleContext {
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public TerminalNode AND_operator() { return getToken(JuicyBoysParser.AND_operator, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bool_term);
		try {
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				bool_factor();
				setState(417);
				match(AND_operator);
				setState(418);
				bool_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				bool_factor();
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

	public static class Bool_factorContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public Bool_logicalContext bool_logical() {
			return getRuleContext(Bool_logicalContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode NOT_operator() { return getToken(JuicyBoysParser.NOT_operator, 0); }
		public Bool_identifierContext bool_identifier() {
			return getRuleContext(Bool_identifierContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor() throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_bool_factor);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				match(OPEN_PAR);
				setState(424);
				bool_logical();
				setState(425);
				match(CLOSE_PAR);
				}
				break;
			case NOT_operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				match(NOT_operator);
				setState(428);
				bool_logical();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				bool_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bool_identifierContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public Bool_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterBool_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitBool_identifier(this);
		}
	}

	public final Bool_identifierContext bool_identifier() throws RecognitionException {
		Bool_identifierContext _localctx = new Bool_identifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bool_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(STRING_LITERAL);
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

	public static class Constdecl_listContext extends ParserRuleContext {
		public Const_statementContext const_statement() {
			return getRuleContext(Const_statementContext.class,0);
		}
		public Constdecl_listContext constdecl_list() {
			return getRuleContext(Constdecl_listContext.class,0);
		}
		public Constdecl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstdecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstdecl_list(this);
		}
	}

	public final Constdecl_listContext constdecl_list() throws RecognitionException {
		Constdecl_listContext _localctx = new Constdecl_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_constdecl_list);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(434);
				const_statement();
				setState(435);
				constdecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				const_statement();
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

	public static class Const_statementContext extends ParserRuleContext {
		public TerminalNode CONSTANT_KEYWORD() { return getToken(JuicyBoysParser.CONSTANT_KEYWORD, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuicyBoysParser.ASSIGNMENT_OPERATOR, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public Const_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConst_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConst_statement(this);
		}
	}

	public final Const_statementContext const_statement() throws RecognitionException {
		Const_statementContext _localctx = new Const_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_const_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(CONSTANT_KEYWORD);
			setState(441);
			data_type();
			setState(442);
			match(VARIABLE_IDENTIFIER);
			setState(443);
			match(ASSIGNMENT_OPERATOR);
			setState(444);
			constant();
			setState(445);
			match(TERMINATOR);
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

	public static class ConstantContext extends ParserRuleContext {
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(JuicyBoysParser.FLOAT_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constant);
		try {
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				sign();
				setState(448);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				sign();
				setState(451);
				match(FLOAT_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				match(INTEGER_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(456);
				match(FLOAT_LITERAL);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADDITION_OPERATOR() { return getToken(JuicyBoysParser.ADDITION_OPERATOR, 0); }
		public TerminalNode SUBTRACTION_OPERATOR() { return getToken(JuicyBoysParser.SUBTRACTION_OPERATOR, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==ADDITION_OPERATOR || _la==SUBTRACTION_OPERATOR) ) {
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT_FUNCTION() { return getToken(JuicyBoysParser.OUTPUT_FUNCTION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_output);
		try {
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(OUTPUT_FUNCTION);
				setState(462);
				match(OPEN_PAR);
				setState(463);
				match(STRING_LITERAL);
				setState(464);
				match(CLOSE_PAR);
				setState(465);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(OUTPUT_FUNCTION);
				setState(467);
				match(OPEN_PAR);
				setState(468);
				match(STRING_LITERAL);
				setState(469);
				match(CLOSE_PAR);
				notifyErrorListeners("Missing ';iStop' ");
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

	public static class Output_listContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public Funccall_statementContext funccall_statement() {
			return getRuleContext(Funccall_statementContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public Output_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterOutput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitOutput_list(this);
		}
	}

	public final Output_listContext output_list() throws RecognitionException {
		Output_listContext _localctx = new Output_listContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_output_list);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				funccall_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				match(STRING_LITERAL);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode VARIABLE_IDENTIFIER() { return getToken(JuicyBoysParser.VARIABLE_IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuicyBoysParser.ASSIGNMENT_OPERATOR, 0); }
		public TerminalNode INPUT_FUNCTION() { return getToken(JuicyBoysParser.INPUT_FUNCTION, 0); }
		public Input_listContext input_list() {
			return getRuleContext(Input_listContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(JuicyBoysParser.TERMINATOR, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(VARIABLE_IDENTIFIER);
			setState(480);
			match(ASSIGNMENT_OPERATOR);
			setState(481);
			match(INPUT_FUNCTION);
			setState(482);
			input_list();
			setState(483);
			match(TERMINATOR);
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

	public static class Input_listContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(JuicyBoysParser.INTEGER_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JuicyBoysParser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(JuicyBoysParser.CHAR_LITERAL, 0); }
		public Input_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterInput_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitInput_list(this);
		}
	}

	public final Input_listContext input_list() throws RecognitionException {
		Input_listContext _localctx = new Input_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_input_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u01ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\5\2`\n\2\3\2\5\2c\n\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5{\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0089\n\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\5\t\u0096\n\t\3\t\5"+
		"\t\u0099\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a2\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00ab\n\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\5\16\u00b6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00dd\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f1\n\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010d\n\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32"+
		"\u012c\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u0139\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0147\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0152"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0167\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u0172\n\37\3 \3 \3!\3!\3!\5!\u0179\n!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0198\n\"\3#\3#\3$\3$\3$"+
		"\3$\3$\5$\u01a1\n$\3%\3%\3%\3%\3%\5%\u01a8\n%\3&\3&\3&\3&\3&\3&\3&\5&"+
		"\u01b1\n&\3\'\3\'\3(\3(\3(\3(\5(\u01b9\n(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u01cc\n*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\5,\u01da\n,\3-\3-\3-\3-\5-\u01e0\n-\3.\3.\3.\3.\3.\3.\3/\3/\3/\2\2\60"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"JLNPRTVXZ\\\2\6\5\2\r\21\23\23::\3\2-\62\3\2\35\36\4\2\5\6\b\b\2\u0207"+
		"\2_\3\2\2\2\4f\3\2\2\2\6k\3\2\2\2\bz\3\2\2\2\n\u0088\3\2\2\2\f\u008a\3"+
		"\2\2\2\16\u0091\3\2\2\2\20\u0093\3\2\2\2\22\u009c\3\2\2\2\24\u00aa\3\2"+
		"\2\2\26\u00ac\3\2\2\2\30\u00af\3\2\2\2\32\u00b5\3\2\2\2\34\u00c7\3\2\2"+
		"\2\36\u00d0\3\2\2\2 \u00dc\3\2\2\2\"\u00de\3\2\2\2$\u00f0\3\2\2\2&\u00f2"+
		"\3\2\2\2(\u00f5\3\2\2\2*\u010c\3\2\2\2,\u010e\3\2\2\2.\u0114\3\2\2\2\60"+
		"\u011c\3\2\2\2\62\u012b\3\2\2\2\64\u0138\3\2\2\2\66\u0146\3\2\2\28\u0151"+
		"\3\2\2\2:\u0166\3\2\2\2<\u0171\3\2\2\2>\u0173\3\2\2\2@\u0178\3\2\2\2B"+
		"\u0197\3\2\2\2D\u0199\3\2\2\2F\u01a0\3\2\2\2H\u01a7\3\2\2\2J\u01b0\3\2"+
		"\2\2L\u01b2\3\2\2\2N\u01b8\3\2\2\2P\u01ba\3\2\2\2R\u01cb\3\2\2\2T\u01cd"+
		"\3\2\2\2V\u01d9\3\2\2\2X\u01df\3\2\2\2Z\u01e1\3\2\2\2\\\u01e7\3\2\2\2"+
		"^`\5N(\2_^\3\2\2\2_`\3\2\2\2`b\3\2\2\2ac\5\4\3\2ba\3\2\2\2bc\3\2\2\2c"+
		"d\3\2\2\2de\5\22\n\2e\3\3\2\2\2fg\5\6\4\2gh\5\4\3\2h\5\3\2\2\2il\5\b\5"+
		"\2jl\5\n\6\2ki\3\2\2\2kj\3\2\2\2l\7\3\2\2\2mn\5\30\r\2no\7;\2\2op\7\67"+
		"\2\2pq\5\f\7\2qr\78\2\2rs\5\20\t\2s{\3\2\2\2tu\5\30\r\2uv\7;\2\2vw\7\67"+
		"\2\2wx\78\2\2xy\5\20\t\2y{\3\2\2\2zm\3\2\2\2zt\3\2\2\2{\t\3\2\2\2|}\7"+
		"\22\2\2}~\7;\2\2~\177\7\67\2\2\177\u0080\5\f\7\2\u0080\u0081\78\2\2\u0081"+
		"\u0082\5\20\t\2\u0082\u0089\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u0085\7"+
		";\2\2\u0085\u0086\7\67\2\2\u0086\u0087\78\2\2\u0087\u0089\5\20\t\2\u0088"+
		"|\3\2\2\2\u0088\u0083\3\2\2\2\u0089\13\3\2\2\2\u008a\u008b\5\16\b\2\u008b"+
		"\r\3\2\2\2\u008c\u008d\5\26\f\2\u008d\u008e\79\2\2\u008e\u008f\5\16\b"+
		"\2\u008f\u0092\3\2\2\2\u0090\u0092\5\26\f\2\u0091\u008c\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\17\3\2\2\2\u0093\u0095\7\63\2\2\u0094\u0096\5\24"+
		"\13\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097"+
		"\u0099\5\62\32\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\7\64\2\2\u009b\21\3\2\2\2\u009c\u009d\7\22\2\2\u009d"+
		"\u009e\7\31\2\2\u009e\u009f\7\67\2\2\u009f\u00a1\78\2\2\u00a0\u00a2\5"+
		"\20\t\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\23\3\2\2\2\u00a3"+
		"\u00a4\5\26\f\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00ab"+
		"\3\2\2\2\u00a7\u00a8\5\26\f\2\u00a8\u00a9\7\13\2\2\u00a9\u00ab\3\2\2\2"+
		"\u00aa\u00a3\3\2\2\2\u00aa\u00a7\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00ad"+
		"\5\30\r\2\u00ad\u00ae\5\32\16\2\u00ae\27\3\2\2\2\u00af\u00b0\t\2\2\2\u00b0"+
		"\31\3\2\2\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3\79\2\2\u00b3\u00b6\5\32\16"+
		"\2\u00b4\u00b6\7\t\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\33"+
		"\3\2\2\2\u00b7\u00b8\5\36\20\2\u00b8\u00b9\7\13\2\2\u00b9\u00c8\3\2\2"+
		"\2\u00ba\u00c8\5 \21\2\u00bb\u00c8\5*\26\2\u00bc\u00c8\5,\27\2\u00bd\u00c8"+
		"\5.\30\2\u00be\u00c8\5\60\31\2\u00bf\u00c8\5(\25\2\u00c0\u00c1\7\63\2"+
		"\2\u00c1\u00c2\5\62\32\2\u00c2\u00c3\7\64\2\2\u00c3\u00c8\3\2\2\2\u00c4"+
		"\u00c8\7\n\2\2\u00c5\u00c8\5X-\2\u00c6\u00c8\5V,\2\u00c7\u00b7\3\2\2\2"+
		"\u00c7\u00ba\3\2\2\2\u00c7\u00bb\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00bd"+
		"\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7"+
		"\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\35\3\2\2"+
		"\2\u00c9\u00ca\7\t\2\2\u00ca\u00cb\7\'\2\2\u00cb\u00d1\5\64\33\2\u00cc"+
		"\u00cd\7\t\2\2\u00cd\u00d1\7\"\2\2\u00ce\u00cf\7\t\2\2\u00cf\u00d1\7#"+
		"\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1"+
		"\37\3\2\2\2\u00d2\u00d3\7;\2\2\u00d3\u00d4\7\67\2\2\u00d4\u00d5\5\"\22"+
		"\2\u00d5\u00d6\78\2\2\u00d6\u00d7\7\13\2\2\u00d7\u00dd\3\2\2\2\u00d8\u00d9"+
		"\7;\2\2\u00d9\u00da\7\67\2\2\u00da\u00db\78\2\2\u00db\u00dd\7\13\2\2\u00dc"+
		"\u00d2\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd!\3\2\2\2\u00de\u00df\5$\23\2"+
		"\u00df#\3\2\2\2\u00e0\u00e1\5 \21\2\u00e1\u00e2\5&\24\2\u00e2\u00f1\3"+
		"\2\2\2\u00e3\u00e4\7\t\2\2\u00e4\u00f1\5&\24\2\u00e5\u00e6\7\5\2\2\u00e6"+
		"\u00f1\5&\24\2\u00e7\u00e8\7\7\2\2\u00e8\u00f1\5&\24\2\u00e9\u00ea\7\6"+
		"\2\2\u00ea\u00f1\5&\24\2\u00eb\u00ec\7\b\2\2\u00ec\u00f1\5&\24\2\u00ed"+
		"\u00ee\5\64\33\2\u00ee\u00ef\5&\24\2\u00ef\u00f1\3\2\2\2\u00f0\u00e0\3"+
		"\2\2\2\u00f0\u00e3\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00e7\3\2\2\2\u00f0"+
		"\u00e9\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1%\3\2\2\2"+
		"\u00f2\u00f3\79\2\2\u00f3\u00f4\5$\23\2\u00f4\'\3\2\2\2\u00f5\u00f6\7"+
		"\f\2\2\u00f6\u00f7\5\64\33\2\u00f7\u00f8\7\13\2\2\u00f8)\3\2\2\2\u00f9"+
		"\u00fa\7\32\2\2\u00fa\u00fb\7\67\2\2\u00fb\u00fc\5@!\2\u00fc\u00fd\78"+
		"\2\2\u00fd\u00fe\5\34\17\2\u00fe\u00ff\7\33\2\2\u00ff\u0100\5\34\17\2"+
		"\u0100\u010d\3\2\2\2\u0101\u0102\7\32\2\2\u0102\u0103\7\67\2\2\u0103\u0104"+
		"\5@!\2\u0104\u0105\78\2\2\u0105\u0106\5\34\17\2\u0106\u010d\3\2\2\2\u0107"+
		"\u0108\7\32\2\2\u0108\u0109\7\67\2\2\u0109\u010a\5@!\2\u010a\u010b\b\26"+
		"\1\2\u010b\u010d\3\2\2\2\u010c\u00f9\3\2\2\2\u010c\u0101\3\2\2\2\u010c"+
		"\u0107\3\2\2\2\u010d+\3\2\2\2\u010e\u010f\7\25\2\2\u010f\u0110\7\67\2"+
		"\2\u0110\u0111\5@!\2\u0111\u0112\78\2\2\u0112\u0113\5\34\17\2\u0113-\3"+
		"\2\2\2\u0114\u0115\7\24\2\2\u0115\u0116\5\34\17\2\u0116\u0117\7\25\2\2"+
		"\u0117\u0118\7\67\2\2\u0118\u0119\5B\"\2\u0119\u011a\78\2\2\u011a\u011b"+
		"\7\13\2\2\u011b/\3\2\2\2\u011c\u011d\7\26\2\2\u011d\u011e\7\67\2\2\u011e"+
		"\u011f\7\r\2\2\u011f\u0120\5\36\20\2\u0120\u0121\7\13\2\2\u0121\u0122"+
		"\5B\"\2\u0122\u0123\7\13\2\2\u0123\u0124\5\36\20\2\u0124\u0125\78\2\2"+
		"\u0125\u0126\5\34\17\2\u0126\61\3\2\2\2\u0127\u0128\5\34\17\2\u0128\u0129"+
		"\5\62\32\2\u0129\u012c\3\2\2\2\u012a\u012c\5\34\17\2\u012b\u0127\3\2\2"+
		"\2\u012b\u012a\3\2\2\2\u012c\63\3\2\2\2\u012d\u0139\5\66\34\2\u012e\u0139"+
		"\58\35\2\u012f\u0139\5@!\2\u0130\u0131\7;\2\2\u0131\u0132\7\67\2\2\u0132"+
		"\u0133\5\"\22\2\u0133\u0134\78\2\2\u0134\u0139\3\2\2\2\u0135\u0136\7;"+
		"\2\2\u0136\u0137\7\67\2\2\u0137\u0139\78\2\2\u0138\u012d\3\2\2\2\u0138"+
		"\u012e\3\2\2\2\u0138\u012f\3\2\2\2\u0138\u0130\3\2\2\2\u0138\u0135\3\2"+
		"\2\2\u0139\65\3\2\2\2\u013a\u013b\7\t\2\2\u013b\u013c\7\35\2\2\u013c\u0147"+
		"\5\66\34\2\u013d\u013e\7\b\2\2\u013e\u013f\7\35\2\2\u013f\u0147\5\66\34"+
		"\2\u0140\u0147\7\t\2\2\u0141\u0147\7\b\2\2\u0142\u0143\7&\2\2\u0143\u0147"+
		"\5\66\34\2\u0144\u0145\7\36\2\2\u0145\u0147\5\66\34\2\u0146\u013a\3\2"+
		"\2\2\u0146\u013d\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0141\3\2\2\2\u0146"+
		"\u0142\3\2\2\2\u0146\u0144\3\2\2\2\u0147\67\3\2\2\2\u0148\u0149\5:\36"+
		"\2\u0149\u014a\7\35\2\2\u014a\u014b\58\35\2\u014b\u0152\3\2\2\2\u014c"+
		"\u014d\5:\36\2\u014d\u014e\7\36\2\2\u014e\u014f\58\35\2\u014f\u0152\3"+
		"\2\2\2\u0150\u0152\5:\36\2\u0151\u0148\3\2\2\2\u0151\u014c\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u01529\3\2\2\2\u0153\u0154\5<\37\2\u0154\u0155\7\37\2\2"+
		"\u0155\u0156\5:\36\2\u0156\u0167\3\2\2\2\u0157\u0158\5<\37\2\u0158\u0159"+
		"\7 \2\2\u0159\u015a\5:\36\2\u015a\u0167\3\2\2\2\u015b\u015c\5<\37\2\u015c"+
		"\u015d\7!\2\2\u015d\u015e\5:\36\2\u015e\u0167\3\2\2\2\u015f\u0160\5<\37"+
		"\2\u0160\u0161\7\"\2\2\u0161\u0167\3\2\2\2\u0162\u0163\5<\37\2\u0163\u0164"+
		"\7#\2\2\u0164\u0167\3\2\2\2\u0165\u0167\5<\37\2\u0166\u0153\3\2\2\2\u0166"+
		"\u0157\3\2\2\2\u0166\u015b\3\2\2\2\u0166\u015f\3\2\2\2\u0166\u0162\3\2"+
		"\2\2\u0166\u0165\3\2\2\2\u0167;\3\2\2\2\u0168\u0169\7\67\2\2\u0169\u016a"+
		"\58\35\2\u016a\u016b\78\2\2\u016b\u0172\3\2\2\2\u016c\u0172\7\6\2\2\u016d"+
		"\u0172\7\5\2\2\u016e\u0172\7\7\2\2\u016f\u0170\7-\2\2\u0170\u0172\5> "+
		"\2\u0171\u0168\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u016d\3\2\2\2\u0171\u016e"+
		"\3\2\2\2\u0171\u016f\3\2\2\2\u0172=\3\2\2\2\u0173\u0174\7\b\2\2\u0174"+
		"?\3\2\2\2\u0175\u0179\5B\"\2\u0176\u0179\7=\2\2\u0177\u0179\7>\2\2\u0178"+
		"\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179A\3\2\2\2"+
		"\u017a\u017b\58\35\2\u017b\u017c\5D#\2\u017c\u017d\58\35\2\u017d\u0198"+
		"\3\2\2\2\u017e\u017f\5\66\34\2\u017f\u0180\7\62\2\2\u0180\u0181\5\66\34"+
		"\2\u0181\u0198\3\2\2\2\u0182\u0183\5\66\34\2\u0183\u0184\7\61\2\2\u0184"+
		"\u0185\5\66\34\2\u0185\u0198\3\2\2\2\u0186\u0187\5F$\2\u0187\u0188\7\62"+
		"\2\2\u0188\u0189\5@!\2\u0189\u0198\3\2\2\2\u018a\u018b\5F$\2\u018b\u018c"+
		"\7\61\2\2\u018c\u018d\5@!\2\u018d\u0198\3\2\2\2\u018e\u0198\5F$\2\u018f"+
		"\u0190\7\t\2\2\u0190\u0191\5D#\2\u0191\u0192\7\5\2\2\u0192\u0198\3\2\2"+
		"\2\u0193\u0194\7\t\2\2\u0194\u0195\5D#\2\u0195\u0196\7\t\2\2\u0196\u0198"+
		"\3\2\2\2\u0197\u017a\3\2\2\2\u0197\u017e\3\2\2\2\u0197\u0182\3\2\2\2\u0197"+
		"\u0186\3\2\2\2\u0197\u018a\3\2\2\2\u0197\u018e\3\2\2\2\u0197\u018f\3\2"+
		"\2\2\u0197\u0193\3\2\2\2\u0198C\3\2\2\2\u0199\u019a\t\3\2\2\u019aE\3\2"+
		"\2\2\u019b\u019c\5H%\2\u019c\u019d\7%\2\2\u019d\u019e\5F$\2\u019e\u01a1"+
		"\3\2\2\2\u019f\u01a1\5H%\2\u01a0\u019b\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1"+
		"G\3\2\2\2\u01a2\u01a3\5J&\2\u01a3\u01a4\7$\2\2\u01a4\u01a5\5H%\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a8\5J&\2\u01a7\u01a2\3\2\2\2\u01a7\u01a6\3\2\2"+
		"\2\u01a8I\3\2\2\2\u01a9\u01aa\7\67\2\2\u01aa\u01ab\5F$\2\u01ab\u01ac\7"+
		"8\2\2\u01ac\u01b1\3\2\2\2\u01ad\u01ae\7&\2\2\u01ae\u01b1\5F$\2\u01af\u01b1"+
		"\5L\'\2\u01b0\u01a9\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1"+
		"K\3\2\2\2\u01b2\u01b3\7\b\2\2\u01b3M\3\2\2\2\u01b4\u01b5\5P)\2\u01b5\u01b6"+
		"\5N(\2\u01b6\u01b9\3\2\2\2\u01b7\u01b9\5P)\2\u01b8\u01b4\3\2\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9O\3\2\2\2\u01ba\u01bb\7<\2\2\u01bb\u01bc\5\30\r\2"+
		"\u01bc\u01bd\7\t\2\2\u01bd\u01be\7\'\2\2\u01be\u01bf\5R*\2\u01bf\u01c0"+
		"\7\13\2\2\u01c0Q\3\2\2\2\u01c1\u01c2\5T+\2\u01c2\u01c3\7\5\2\2\u01c3\u01cc"+
		"\3\2\2\2\u01c4\u01c5\5T+\2\u01c5\u01c6\7\7\2\2\u01c6\u01cc\3\2\2\2\u01c7"+
		"\u01cc\7\6\2\2\u01c8\u01cc\7\b\2\2\u01c9\u01cc\7\5\2\2\u01ca\u01cc\7\7"+
		"\2\2\u01cb\u01c1\3\2\2\2\u01cb\u01c4\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb"+
		"\u01c8\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01ccS\3\2\2\2"+
		"\u01cd\u01ce\t\4\2\2\u01ceU\3\2\2\2\u01cf\u01d0\7\27\2\2\u01d0\u01d1\7"+
		"\67\2\2\u01d1\u01d2\7\b\2\2\u01d2\u01d3\78\2\2\u01d3\u01da\7\13\2\2\u01d4"+
		"\u01d5\7\27\2\2\u01d5\u01d6\7\67\2\2\u01d6\u01d7\7\b\2\2\u01d7\u01d8\7"+
		"8\2\2\u01d8\u01da\b,\1\2\u01d9\u01cf\3\2\2\2\u01d9\u01d4\3\2\2\2\u01da"+
		"W\3\2\2\2\u01db\u01e0\5\64\33\2\u01dc\u01e0\7\t\2\2\u01dd\u01e0\5 \21"+
		"\2\u01de\u01e0\7\b\2\2\u01df\u01db\3\2\2\2\u01df\u01dc\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01df\u01de\3\2\2\2\u01e0Y\3\2\2\2\u01e1\u01e2\7\t\2\2\u01e2"+
		"\u01e3\7\'\2\2\u01e3\u01e4\7\30\2\2\u01e4\u01e5\5\\/\2\u01e5\u01e6\7\13"+
		"\2\2\u01e6[\3\2\2\2\u01e7\u01e8\t\5\2\2\u01e8]\3\2\2\2!_bkz\u0088\u0091"+
		"\u0095\u0098\u00a1\u00aa\u00b5\u00c7\u00d0\u00dc\u00f0\u010c\u012b\u0138"+
		"\u0146\u0151\u0166\u0171\u0178\u0197\u01a0\u01a7\u01b0\u01b8\u01cb\u01d9"+
		"\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
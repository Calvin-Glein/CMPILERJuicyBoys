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
		RULE_vardecl_list = 9, RULE_var_decl = 10, RULE_data_type = 11, RULE_array = 12, 
		RULE_identifier_list = 13, RULE_statement = 14, RULE_assignment_statement = 15, 
		RULE_funccall_statement = 16, RULE_actual_parameter_list = 17, RULE_actual_params = 18, 
		RULE_multiple_actual_parameters = 19, RULE_return_statement = 20, RULE_if_statement = 21, 
		RULE_while_statement = 22, RULE_do_while_statement = 23, RULE_for_statement = 24, 
		RULE_statement_list = 25, RULE_expression = 26, RULE_string_expression = 27, 
		RULE_num_expression = 28, RULE_num_term = 29, RULE_num_factor = 30, RULE_num_identifier = 31, 
		RULE_bool_expression = 32, RULE_bool_expression_for = 33, RULE_rel_op = 34, 
		RULE_bool_logical = 35, RULE_bool_term = 36, RULE_bool_factor = 37, RULE_bool_identifier = 38, 
		RULE_constdecl_list = 39, RULE_const_statement = 40, RULE_constant = 41, 
		RULE_sign = 42, RULE_output = 43, RULE_output_list = 44, RULE_input = 45, 
		RULE_input_list = 46;
	public static final String[] ruleNames = {
		"start", "funcdecl_list", "function_declaration", "function_return", "function_noreturn", 
		"parameter_list", "parameters", "function_content", "main_function", "vardecl_list", 
		"var_decl", "data_type", "array", "identifier_list", "statement", "assignment_statement", 
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTANT_KEYWORD) {
				{
				setState(94);
				constdecl_list();
				}
			}

			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(97);
				funcdecl_list();
				}
				break;
			}
			setState(100);
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
			setState(102);
			function_declaration();
			setState(103);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KEYWORD:
			case BOOLEAN_KEYWORD:
			case FLOAT_KEYWORD:
			case STRING_KEYWORD:
			case CHAR_KEYWORD:
			case DOUBLE_KEYWORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				function_return();
				}
				break;
			case VOID_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				data_type();
				setState(110);
				match(FUNCTION_IDENTIFIER);
				setState(111);
				match(OPEN_PAR);
				setState(112);
				parameter_list();
				setState(113);
				match(CLOSE_PAR);
				setState(114);
				function_content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				data_type();
				setState(117);
				match(FUNCTION_IDENTIFIER);
				setState(118);
				match(OPEN_PAR);
				setState(119);
				match(CLOSE_PAR);
				setState(120);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(VOID_KEYWORD);
				setState(125);
				match(FUNCTION_IDENTIFIER);
				setState(126);
				match(OPEN_PAR);
				setState(127);
				parameter_list();
				setState(128);
				match(CLOSE_PAR);
				setState(129);
				function_content();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(VOID_KEYWORD);
				setState(132);
				match(FUNCTION_IDENTIFIER);
				setState(133);
				match(OPEN_PAR);
				setState(134);
				match(CLOSE_PAR);
				setState(135);
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
			setState(138);
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				var_decl();
				setState(141);
				match(COMMA);
				setState(142);
				parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
			setState(147);
			match(OPEN_BRACE);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KEYWORD) | (1L << BOOLEAN_KEYWORD) | (1L << FLOAT_KEYWORD) | (1L << STRING_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << DOUBLE_KEYWORD))) != 0)) {
				{
				setState(148);
				vardecl_list();
				}
			}

			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_LITERAL) | (1L << CHAR_LITERAL) | (1L << FLOAT_LITERAL) | (1L << STRING_LITERAL) | (1L << VARIABLE_IDENTIFIER) | (1L << COMMENT_BLOCK) | (1L << RETURN_KEYWORD) | (1L << DO_LOOP) | (1L << WHILE_LOOP) | (1L << FOR_LOOP) | (1L << OUTPUT_FUNCTION) | (1L << IF_STATEMENT) | (1L << SUBTRACTION_OPERATOR) | (1L << NOT_operator) | (1L << GREATER_THAN_OPERATOR) | (1L << OPEN_BRACE) | (1L << OPEN_PAR) | (1L << FUNCTION_IDENTIFIER) | (1L << TRUE_LITERAL) | (1L << FALSE_LITERAL))) != 0)) {
				{
				setState(151);
				statement_list();
				}
			}

			setState(154);
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
			setState(156);
			match(VOID_KEYWORD);
			setState(157);
			match(MAIN_KEYWORD);
			setState(158);
			match(OPEN_PAR);
			setState(159);
			match(CLOSE_PAR);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_BRACE) {
				{
				setState(160);
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
		public TerminalNode ASSIGNMENT_OPERATOR() { return getToken(JuicyBoysParser.ASSIGNMENT_OPERATOR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				var_decl();
				setState(164);
				match(ASSIGNMENT_OPERATOR);
				setState(165);
				expression(0);
				setState(166);
				match(TERMINATOR);
				setState(167);
				vardecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				var_decl();
				setState(170);
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
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				data_type();
				setState(175);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				array();
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER_KEYWORD() { return getToken(JuicyBoysParser.INTEGER_KEYWORD, 0); }
		public TerminalNode DOUBLE_KEYWORD() { return getToken(JuicyBoysParser.DOUBLE_KEYWORD, 0); }
		public TerminalNode CHAR_KEYWORD() { return getToken(JuicyBoysParser.CHAR_KEYWORD, 0); }
		public TerminalNode STRING_KEYWORD() { return getToken(JuicyBoysParser.STRING_KEYWORD, 0); }
		public TerminalNode BOOLEAN_KEYWORD() { return getToken(JuicyBoysParser.BOOLEAN_KEYWORD, 0); }
		public TerminalNode FLOAT_KEYWORD() { return getToken(JuicyBoysParser.FLOAT_KEYWORD, 0); }
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
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER_KEYWORD) | (1L << BOOLEAN_KEYWORD) | (1L << FLOAT_KEYWORD) | (1L << STRING_KEYWORD) | (1L << CHAR_KEYWORD) | (1L << DOUBLE_KEYWORD))) != 0)) ) {
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

	public static class ArrayContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode ARRAY_IDENTIFIER() { return getToken(JuicyBoysParser.ARRAY_IDENTIFIER, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JuicyBoysListener ) ((JuicyBoysListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			data_type();
			setState(183);
			match(ARRAY_IDENTIFIER);
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
		enterRule(_localctx, 26, RULE_identifier_list);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(VARIABLE_IDENTIFIER);
				setState(186);
				match(COMMA);
				setState(187);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				assignment_statement();
				setState(192);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				funccall_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				if_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				while_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				do_while_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				for_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				return_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				match(OPEN_BRACE);
				setState(201);
				statement_list();
				setState(202);
				match(CLOSE_BRACE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(204);
				match(COMMENT_BLOCK);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(205);
				output_list();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(206);
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
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
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
		enterRule(_localctx, 30, RULE_assignment_statement);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(VARIABLE_IDENTIFIER);
				setState(210);
				match(ASSIGNMENT_OPERATOR);
				setState(211);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(VARIABLE_IDENTIFIER);
				setState(213);
				match(ASSIGNMENT_OPERATOR);
				setState(214);
				input();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				match(VARIABLE_IDENTIFIER);
				setState(216);
				match(INCREMENTAL_OPERATOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(VARIABLE_IDENTIFIER);
				setState(218);
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
		enterRule(_localctx, 32, RULE_funccall_statement);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(FUNCTION_IDENTIFIER);
				setState(222);
				match(OPEN_PAR);
				setState(223);
				actual_parameter_list();
				setState(224);
				match(CLOSE_PAR);
				setState(225);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(FUNCTION_IDENTIFIER);
				setState(228);
				match(OPEN_PAR);
				setState(229);
				match(CLOSE_PAR);
				setState(230);
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
		enterRule(_localctx, 34, RULE_actual_parameter_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
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
		enterRule(_localctx, 36, RULE_actual_params);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				funccall_statement();
				setState(236);
				multiple_actual_parameters();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(VARIABLE_IDENTIFIER);
				setState(239);
				multiple_actual_parameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(INTEGER_LITERAL);
				setState(241);
				multiple_actual_parameters();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(FLOAT_LITERAL);
				setState(243);
				multiple_actual_parameters();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				match(CHAR_LITERAL);
				setState(245);
				multiple_actual_parameters();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
				match(STRING_LITERAL);
				setState(247);
				multiple_actual_parameters();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				expression(0);
				setState(249);
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
		enterRule(_localctx, 38, RULE_multiple_actual_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(COMMA);
			setState(254);
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
		enterRule(_localctx, 40, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(RETURN_KEYWORD);
			setState(257);
			expression(0);
			setState(258);
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
		enterRule(_localctx, 42, RULE_if_statement);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(IF_STATEMENT);
				setState(261);
				match(OPEN_PAR);
				setState(262);
				bool_expression();
				setState(263);
				match(CLOSE_PAR);
				setState(264);
				statement();
				setState(265);
				match(ELSE_STATEMENT);
				setState(266);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(IF_STATEMENT);
				setState(269);
				match(OPEN_PAR);
				setState(270);
				bool_expression();
				setState(271);
				match(CLOSE_PAR);
				setState(272);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(IF_STATEMENT);
				setState(275);
				match(OPEN_PAR);
				setState(276);
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
		enterRule(_localctx, 44, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(WHILE_LOOP);
			setState(282);
			match(OPEN_PAR);
			setState(283);
			bool_expression();
			setState(284);
			match(CLOSE_PAR);
			setState(285);
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
		enterRule(_localctx, 46, RULE_do_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(DO_LOOP);
			setState(288);
			statement();
			setState(289);
			match(WHILE_LOOP);
			setState(290);
			match(OPEN_PAR);
			setState(291);
			bool_expression_for();
			setState(292);
			match(CLOSE_PAR);
			setState(293);
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
		enterRule(_localctx, 48, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(FOR_LOOP);
			setState(296);
			match(OPEN_PAR);
			setState(297);
			match(INTEGER_KEYWORD);
			setState(298);
			assignment_statement();
			setState(299);
			match(TERMINATOR);
			setState(300);
			bool_expression_for();
			setState(301);
			match(TERMINATOR);
			setState(302);
			assignment_statement();
			setState(303);
			match(CLOSE_PAR);
			setState(304);
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
		enterRule(_localctx, 50, RULE_statement_list);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				statement();
				setState(307);
				statement_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
		public TerminalNode NOT_operator() { return getToken(JuicyBoysParser.NOT_operator, 0); }
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
		public TerminalNode FUNCTION_IDENTIFIER() { return getToken(JuicyBoysParser.FUNCTION_IDENTIFIER, 0); }
		public Actual_parameter_listContext actual_parameter_list() {
			return getRuleContext(Actual_parameter_listContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(313);
				string_expression();
				}
				break;
			case 2:
				{
				setState(314);
				num_expression();
				}
				break;
			case 3:
				{
				setState(315);
				bool_expression();
				}
				break;
			case 4:
				{
				setState(316);
				match(NOT_operator);
				setState(317);
				match(OPEN_PAR);
				setState(318);
				expression(0);
				setState(319);
				match(CLOSE_PAR);
				}
				break;
			case 5:
				{
				setState(321);
				match(FUNCTION_IDENTIFIER);
				setState(322);
				match(OPEN_PAR);
				setState(323);
				actual_parameter_list();
				setState(324);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(326);
				match(FUNCTION_IDENTIFIER);
				setState(327);
				match(OPEN_PAR);
				setState(328);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(329);
				match(OPEN_PAR);
				setState(330);
				expression(0);
				setState(331);
				match(CLOSE_PAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(335);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(336);
					rel_op();
					setState(337);
					expression(5);
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 54, RULE_string_expression);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(VARIABLE_IDENTIFIER);
				setState(345);
				match(ADDITION_OPERATOR);
				setState(346);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(STRING_LITERAL);
				setState(348);
				match(ADDITION_OPERATOR);
				setState(349);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(350);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(352);
				match(NOT_operator);
				setState(353);
				string_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(354);
				match(SUBTRACTION_OPERATOR);
				setState(355);
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
		enterRule(_localctx, 56, RULE_num_expression);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				num_term();
				setState(359);
				match(ADDITION_OPERATOR);
				setState(360);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				num_term();
				setState(363);
				match(SUBTRACTION_OPERATOR);
				setState(364);
				num_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
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
		enterRule(_localctx, 58, RULE_num_term);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				num_factor();
				setState(370);
				match(MULTIPLICATION_OPERATOR);
				setState(371);
				num_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				num_factor();
				setState(374);
				match(DIVISION_OPERATOR);
				setState(375);
				num_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				num_factor();
				setState(378);
				match(MODULO_OPERATOR);
				setState(379);
				num_term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				num_factor();
				setState(382);
				match(INCREMENTAL_OPERATOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(384);
				num_factor();
				setState(385);
				match(DECREMENTAL_OPERATOR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
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
		enterRule(_localctx, 60, RULE_num_factor);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(OPEN_PAR);
				setState(391);
				num_expression();
				setState(392);
				match(CLOSE_PAR);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(CHAR_LITERAL);
				}
				break;
			case INTEGER_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(INTEGER_LITERAL);
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(FLOAT_LITERAL);
				}
				break;
			case GREATER_THAN_OPERATOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				match(GREATER_THAN_OPERATOR);
				setState(398);
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
		enterRule(_localctx, 62, RULE_num_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 64, RULE_bool_expression);
		try {
			setState(406);
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
				setState(403);
				bool_expression_for();
				}
				break;
			case TRUE_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
				match(TRUE_LITERAL);
				}
				break;
			case FALSE_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
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
		enterRule(_localctx, 66, RULE_bool_expression_for);
		try {
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				num_expression();
				setState(409);
				rel_op();
				setState(410);
				num_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				string_expression();
				setState(413);
				match(EQUALS_OPERATOR);
				setState(414);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(416);
				string_expression();
				setState(417);
				match(NOT_EQUAL_OPERATOR);
				setState(418);
				string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				bool_logical();
				setState(421);
				match(EQUALS_OPERATOR);
				setState(422);
				bool_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				bool_logical();
				setState(425);
				match(NOT_EQUAL_OPERATOR);
				setState(426);
				bool_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(428);
				bool_logical();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(429);
				match(VARIABLE_IDENTIFIER);
				setState(430);
				rel_op();
				setState(431);
				match(INTEGER_LITERAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(433);
				match(VARIABLE_IDENTIFIER);
				setState(434);
				rel_op();
				setState(435);
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
		public TerminalNode AND_operator() { return getToken(JuicyBoysParser.AND_operator, 0); }
		public TerminalNode OR_operator() { return getToken(JuicyBoysParser.OR_operator, 0); }
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
		enterRule(_localctx, 68, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND_operator) | (1L << OR_operator) | (1L << GREATER_THAN_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << LESS_EQUAL_OPERATOR) | (1L << GREATER_EQUAL_OPERATOR) | (1L << NOT_EQUAL_OPERATOR) | (1L << EQUALS_OPERATOR))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_bool_logical);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				bool_term();
				setState(442);
				match(OR_operator);
				setState(443);
				bool_logical();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
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
		enterRule(_localctx, 72, RULE_bool_term);
		try {
			setState(453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				bool_factor();
				setState(449);
				match(AND_operator);
				setState(450);
				bool_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
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
		enterRule(_localctx, 74, RULE_bool_factor);
		try {
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(OPEN_PAR);
				setState(456);
				bool_logical();
				setState(457);
				match(CLOSE_PAR);
				}
				break;
			case NOT_operator:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(NOT_operator);
				setState(460);
				bool_logical();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
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
		enterRule(_localctx, 76, RULE_bool_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
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
		enterRule(_localctx, 78, RULE_constdecl_list);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				const_statement();
				setState(467);
				constdecl_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
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
		enterRule(_localctx, 80, RULE_const_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(CONSTANT_KEYWORD);
			setState(473);
			data_type();
			setState(474);
			match(VARIABLE_IDENTIFIER);
			setState(475);
			match(ASSIGNMENT_OPERATOR);
			setState(476);
			constant();
			setState(477);
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
		enterRule(_localctx, 82, RULE_constant);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479);
				sign();
				setState(480);
				match(INTEGER_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				sign();
				setState(483);
				match(FLOAT_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(485);
				match(CHAR_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(486);
				match(STRING_LITERAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(487);
				match(INTEGER_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(488);
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
		enterRule(_localctx, 84, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
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
		enterRule(_localctx, 86, RULE_output);
		try {
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(OUTPUT_FUNCTION);
				setState(494);
				match(OPEN_PAR);
				setState(495);
				match(STRING_LITERAL);
				setState(496);
				match(CLOSE_PAR);
				setState(497);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(OUTPUT_FUNCTION);
				setState(499);
				match(OPEN_PAR);
				setState(500);
				match(STRING_LITERAL);
				setState(501);
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
		enterRule(_localctx, 88, RULE_output_list);
		try {
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(506);
				match(VARIABLE_IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(507);
				funccall_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(508);
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
		public TerminalNode OPEN_PAR() { return getToken(JuicyBoysParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(JuicyBoysParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 90, RULE_input);
		try {
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(VARIABLE_IDENTIFIER);
				setState(512);
				match(ASSIGNMENT_OPERATOR);
				setState(513);
				match(INPUT_FUNCTION);
				setState(514);
				input_list();
				}
				break;
			case INPUT_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(INPUT_FUNCTION);
				setState(516);
				match(OPEN_PAR);
				setState(517);
				match(CLOSE_PAR);
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
		enterRule(_localctx, 92, RULE_input_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u020d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\5\2b\n\2\3\2\5\2e\n\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5}\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"\u008b\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\b\u0094\n\b\3\t\3\t\5\t\u0098"+
		"\n\t\3\t\5\t\u009b\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a4\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3\f\3\f\3\f\3"+
		"\f\5\f\u00b5\n\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00c0"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d2\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00de\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00ea\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fe\n\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u011a\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33"+
		"\u0139\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0150\n\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0156\n\34\f\34\16\34\u0159\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0167\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0172\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0187\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0192\n \3!\3!\3\"\3\""+
		"\3\"\5\"\u0199\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u01b8\n#\3$\3$\3%\3%\3%\3%\3%"+
		"\5%\u01c1\n%\3&\3&\3&\3&\3&\5&\u01c8\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u01d1\n\'\3(\3(\3)\3)\3)\3)\5)\u01d9\n)\3*\3*\3*\3*\3*\3*\3*\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01ec\n+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\5-\u01fa\n-\3.\3.\3.\3.\5.\u0200\n.\3/\3/\3/\3/\3/\3/\3/\5/\u0209"+
		"\n/\3\60\3\60\3\60\2\3\66\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\6\4\2\r\21\23\23\4\2$%-\62\3"+
		"\2\35\36\4\2\5\6\b\b\2\u022f\2a\3\2\2\2\4h\3\2\2\2\6m\3\2\2\2\b|\3\2\2"+
		"\2\n\u008a\3\2\2\2\f\u008c\3\2\2\2\16\u0093\3\2\2\2\20\u0095\3\2\2\2\22"+
		"\u009e\3\2\2\2\24\u00ae\3\2\2\2\26\u00b4\3\2\2\2\30\u00b6\3\2\2\2\32\u00b8"+
		"\3\2\2\2\34\u00bf\3\2\2\2\36\u00d1\3\2\2\2 \u00dd\3\2\2\2\"\u00e9\3\2"+
		"\2\2$\u00eb\3\2\2\2&\u00fd\3\2\2\2(\u00ff\3\2\2\2*\u0102\3\2\2\2,\u0119"+
		"\3\2\2\2.\u011b\3\2\2\2\60\u0121\3\2\2\2\62\u0129\3\2\2\2\64\u0138\3\2"+
		"\2\2\66\u014f\3\2\2\28\u0166\3\2\2\2:\u0171\3\2\2\2<\u0186\3\2\2\2>\u0191"+
		"\3\2\2\2@\u0193\3\2\2\2B\u0198\3\2\2\2D\u01b7\3\2\2\2F\u01b9\3\2\2\2H"+
		"\u01c0\3\2\2\2J\u01c7\3\2\2\2L\u01d0\3\2\2\2N\u01d2\3\2\2\2P\u01d8\3\2"+
		"\2\2R\u01da\3\2\2\2T\u01eb\3\2\2\2V\u01ed\3\2\2\2X\u01f9\3\2\2\2Z\u01ff"+
		"\3\2\2\2\\\u0208\3\2\2\2^\u020a\3\2\2\2`b\5P)\2a`\3\2\2\2ab\3\2\2\2bd"+
		"\3\2\2\2ce\5\4\3\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\5\22\n\2g\3\3\2\2\2"+
		"hi\5\6\4\2ij\5\4\3\2j\5\3\2\2\2kn\5\b\5\2ln\5\n\6\2mk\3\2\2\2ml\3\2\2"+
		"\2n\7\3\2\2\2op\5\30\r\2pq\7;\2\2qr\7\67\2\2rs\5\f\7\2st\78\2\2tu\5\20"+
		"\t\2u}\3\2\2\2vw\5\30\r\2wx\7;\2\2xy\7\67\2\2yz\78\2\2z{\5\20\t\2{}\3"+
		"\2\2\2|o\3\2\2\2|v\3\2\2\2}\t\3\2\2\2~\177\7\22\2\2\177\u0080\7;\2\2\u0080"+
		"\u0081\7\67\2\2\u0081\u0082\5\f\7\2\u0082\u0083\78\2\2\u0083\u0084\5\20"+
		"\t\2\u0084\u008b\3\2\2\2\u0085\u0086\7\22\2\2\u0086\u0087\7;\2\2\u0087"+
		"\u0088\7\67\2\2\u0088\u0089\78\2\2\u0089\u008b\5\20\t\2\u008a~\3\2\2\2"+
		"\u008a\u0085\3\2\2\2\u008b\13\3\2\2\2\u008c\u008d\5\16\b\2\u008d\r\3\2"+
		"\2\2\u008e\u008f\5\26\f\2\u008f\u0090\79\2\2\u0090\u0091\5\16\b\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0094\5\26\f\2\u0093\u008e\3\2\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\17\3\2\2\2\u0095\u0097\7\63\2\2\u0096\u0098\5\24\13\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\5\64"+
		"\33\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\64\2\2\u009d\21\3\2\2\2\u009e\u009f\7\22\2\2\u009f\u00a0\7\31"+
		"\2\2\u00a0\u00a1\7\67\2\2\u00a1\u00a3\78\2\2\u00a2\u00a4\5\20\t\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\23\3\2\2\2\u00a5\u00a6\5\26\f"+
		"\2\u00a6\u00a7\7\'\2\2\u00a7\u00a8\5\66\34\2\u00a8\u00a9\7\13\2\2\u00a9"+
		"\u00aa\5\24\13\2\u00aa\u00af\3\2\2\2\u00ab\u00ac\5\26\f\2\u00ac\u00ad"+
		"\7\13\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00ab\3\2\2\2"+
		"\u00af\25\3\2\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\5\34\17\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b5\5\32\16\2\u00b4\u00b0\3\2\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b5\27\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\5\30"+
		"\r\2\u00b9\u00ba\7:\2\2\u00ba\33\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc\u00bd"+
		"\79\2\2\u00bd\u00c0\5\34\17\2\u00be\u00c0\7\t\2\2\u00bf\u00bb\3\2\2\2"+
		"\u00bf\u00be\3\2\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\5 \21\2\u00c2\u00c3"+
		"\7\13\2\2\u00c3\u00d2\3\2\2\2\u00c4\u00d2\5\"\22\2\u00c5\u00d2\5,\27\2"+
		"\u00c6\u00d2\5.\30\2\u00c7\u00d2\5\60\31\2\u00c8\u00d2\5\62\32\2\u00c9"+
		"\u00d2\5*\26\2\u00ca\u00cb\7\63\2\2\u00cb\u00cc\5\64\33\2\u00cc\u00cd"+
		"\7\64\2\2\u00cd\u00d2\3\2\2\2\u00ce\u00d2\7\n\2\2\u00cf\u00d2\5Z.\2\u00d0"+
		"\u00d2\5X-\2\u00d1\u00c1\3\2\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00c5\3\2\2"+
		"\2\u00d1\u00c6\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00c9"+
		"\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\37\3\2\2\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\7\'\2"+
		"\2\u00d5\u00de\5\66\34\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\7\'\2\2\u00d8"+
		"\u00de\5\\/\2\u00d9\u00da\7\t\2\2\u00da\u00de\7\"\2\2\u00db\u00dc\7\t"+
		"\2\2\u00dc\u00de\7#\2\2\u00dd\u00d3\3\2\2\2\u00dd\u00d6\3\2\2\2\u00dd"+
		"\u00d9\3\2\2\2\u00dd\u00db\3\2\2\2\u00de!\3\2\2\2\u00df\u00e0\7;\2\2\u00e0"+
		"\u00e1\7\67\2\2\u00e1\u00e2\5$\23\2\u00e2\u00e3\78\2\2\u00e3\u00e4\7\13"+
		"\2\2\u00e4\u00ea\3\2\2\2\u00e5\u00e6\7;\2\2\u00e6\u00e7\7\67\2\2\u00e7"+
		"\u00e8\78\2\2\u00e8\u00ea\7\13\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e5\3\2"+
		"\2\2\u00ea#\3\2\2\2\u00eb\u00ec\5&\24\2\u00ec%\3\2\2\2\u00ed\u00ee\5\""+
		"\22\2\u00ee\u00ef\5(\25\2\u00ef\u00fe\3\2\2\2\u00f0\u00f1\7\t\2\2\u00f1"+
		"\u00fe\5(\25\2\u00f2\u00f3\7\5\2\2\u00f3\u00fe\5(\25\2\u00f4\u00f5\7\7"+
		"\2\2\u00f5\u00fe\5(\25\2\u00f6\u00f7\7\6\2\2\u00f7\u00fe\5(\25\2\u00f8"+
		"\u00f9\7\b\2\2\u00f9\u00fe\5(\25\2\u00fa\u00fb\5\66\34\2\u00fb\u00fc\5"+
		"(\25\2\u00fc\u00fe\3\2\2\2\u00fd\u00ed\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fd"+
		"\u00f2\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fd\u00f8\3\2"+
		"\2\2\u00fd\u00fa\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u0100\79\2\2\u0100\u0101"+
		"\5&\24\2\u0101)\3\2\2\2\u0102\u0103\7\f\2\2\u0103\u0104\5\66\34\2\u0104"+
		"\u0105\7\13\2\2\u0105+\3\2\2\2\u0106\u0107\7\32\2\2\u0107\u0108\7\67\2"+
		"\2\u0108\u0109\5B\"\2\u0109\u010a\78\2\2\u010a\u010b\5\36\20\2\u010b\u010c"+
		"\7\33\2\2\u010c\u010d\5\36\20\2\u010d\u011a\3\2\2\2\u010e\u010f\7\32\2"+
		"\2\u010f\u0110\7\67\2\2\u0110\u0111\5B\"\2\u0111\u0112\78\2\2\u0112\u0113"+
		"\5\36\20\2\u0113\u011a\3\2\2\2\u0114\u0115\7\32\2\2\u0115\u0116\7\67\2"+
		"\2\u0116\u0117\5B\"\2\u0117\u0118\b\27\1\2\u0118\u011a\3\2\2\2\u0119\u0106"+
		"\3\2\2\2\u0119\u010e\3\2\2\2\u0119\u0114\3\2\2\2\u011a-\3\2\2\2\u011b"+
		"\u011c\7\25\2\2\u011c\u011d\7\67\2\2\u011d\u011e\5B\"\2\u011e\u011f\7"+
		"8\2\2\u011f\u0120\5\36\20\2\u0120/\3\2\2\2\u0121\u0122\7\24\2\2\u0122"+
		"\u0123\5\36\20\2\u0123\u0124\7\25\2\2\u0124\u0125\7\67\2\2\u0125\u0126"+
		"\5D#\2\u0126\u0127\78\2\2\u0127\u0128\7\13\2\2\u0128\61\3\2\2\2\u0129"+
		"\u012a\7\26\2\2\u012a\u012b\7\67\2\2\u012b\u012c\7\r\2\2\u012c\u012d\5"+
		" \21\2\u012d\u012e\7\13\2\2\u012e\u012f\5D#\2\u012f\u0130\7\13\2\2\u0130"+
		"\u0131\5 \21\2\u0131\u0132\78\2\2\u0132\u0133\5\36\20\2\u0133\63\3\2\2"+
		"\2\u0134\u0135\5\36\20\2\u0135\u0136\5\64\33\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0139\5\36\20\2\u0138\u0134\3\2\2\2\u0138\u0137\3\2\2\2\u0139\65\3\2"+
		"\2\2\u013a\u013b\b\34\1\2\u013b\u0150\58\35\2\u013c\u0150\5:\36\2\u013d"+
		"\u0150\5B\"\2\u013e\u013f\7&\2\2\u013f\u0140\7\67\2\2\u0140\u0141\5\66"+
		"\34\2\u0141\u0142\78\2\2\u0142\u0150\3\2\2\2\u0143\u0144\7;\2\2\u0144"+
		"\u0145\7\67\2\2\u0145\u0146\5$\23\2\u0146\u0147\78\2\2\u0147\u0150\3\2"+
		"\2\2\u0148\u0149\7;\2\2\u0149\u014a\7\67\2\2\u014a\u0150\78\2\2\u014b"+
		"\u014c\7\67\2\2\u014c\u014d\5\66\34\2\u014d\u014e\78\2\2\u014e\u0150\3"+
		"\2\2\2\u014f\u013a\3\2\2\2\u014f\u013c\3\2\2\2\u014f\u013d\3\2\2\2\u014f"+
		"\u013e\3\2\2\2\u014f\u0143\3\2\2\2\u014f\u0148\3\2\2\2\u014f\u014b\3\2"+
		"\2\2\u0150\u0157\3\2\2\2\u0151\u0152\f\6\2\2\u0152\u0153\5F$\2\u0153\u0154"+
		"\5\66\34\7\u0154\u0156\3\2\2\2\u0155\u0151\3\2\2\2\u0156\u0159\3\2\2\2"+
		"\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\67\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u015a\u015b\7\t\2\2\u015b\u015c\7\35\2\2\u015c\u0167\58\35\2"+
		"\u015d\u015e\7\b\2\2\u015e\u015f\7\35\2\2\u015f\u0167\58\35\2\u0160\u0167"+
		"\7\t\2\2\u0161\u0167\7\b\2\2\u0162\u0163\7&\2\2\u0163\u0167\58\35\2\u0164"+
		"\u0165\7\36\2\2\u0165\u0167\58\35\2\u0166\u015a\3\2\2\2\u0166\u015d\3"+
		"\2\2\2\u0166\u0160\3\2\2\2\u0166\u0161\3\2\2\2\u0166\u0162\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u01679\3\2\2\2\u0168\u0169\5<\37\2\u0169\u016a\7\35\2\2"+
		"\u016a\u016b\5:\36\2\u016b\u0172\3\2\2\2\u016c\u016d\5<\37\2\u016d\u016e"+
		"\7\36\2\2\u016e\u016f\5:\36\2\u016f\u0172\3\2\2\2\u0170\u0172\5<\37\2"+
		"\u0171\u0168\3\2\2\2\u0171\u016c\3\2\2\2\u0171\u0170\3\2\2\2\u0172;\3"+
		"\2\2\2\u0173\u0174\5> \2\u0174\u0175\7\37\2\2\u0175\u0176\5<\37\2\u0176"+
		"\u0187\3\2\2\2\u0177\u0178\5> \2\u0178\u0179\7 \2\2\u0179\u017a\5<\37"+
		"\2\u017a\u0187\3\2\2\2\u017b\u017c\5> \2\u017c\u017d\7!\2\2\u017d\u017e"+
		"\5<\37\2\u017e\u0187\3\2\2\2\u017f\u0180\5> \2\u0180\u0181\7\"\2\2\u0181"+
		"\u0187\3\2\2\2\u0182\u0183\5> \2\u0183\u0184\7#\2\2\u0184\u0187\3\2\2"+
		"\2\u0185\u0187\5> \2\u0186\u0173\3\2\2\2\u0186\u0177\3\2\2\2\u0186\u017b"+
		"\3\2\2\2\u0186\u017f\3\2\2\2\u0186\u0182\3\2\2\2\u0186\u0185\3\2\2\2\u0187"+
		"=\3\2\2\2\u0188\u0189\7\67\2\2\u0189\u018a\5:\36\2\u018a\u018b\78\2\2"+
		"\u018b\u0192\3\2\2\2\u018c\u0192\7\6\2\2\u018d\u0192\7\5\2\2\u018e\u0192"+
		"\7\7\2\2\u018f\u0190\7-\2\2\u0190\u0192\5@!\2\u0191\u0188\3\2\2\2\u0191"+
		"\u018c\3\2\2\2\u0191\u018d\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192?\3\2\2\2\u0193\u0194\7\b\2\2\u0194A\3\2\2\2\u0195\u0199\5D"+
		"#\2\u0196\u0199\7=\2\2\u0197\u0199\7>\2\2\u0198\u0195\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0197\3\2\2\2\u0199C\3\2\2\2\u019a\u019b\5:\36\2\u019b"+
		"\u019c\5F$\2\u019c\u019d\5:\36\2\u019d\u01b8\3\2\2\2\u019e\u019f\58\35"+
		"\2\u019f\u01a0\7\62\2\2\u01a0\u01a1\58\35\2\u01a1\u01b8\3\2\2\2\u01a2"+
		"\u01a3\58\35\2\u01a3\u01a4\7\61\2\2\u01a4\u01a5\58\35\2\u01a5\u01b8\3"+
		"\2\2\2\u01a6\u01a7\5H%\2\u01a7\u01a8\7\62\2\2\u01a8\u01a9\5B\"\2\u01a9"+
		"\u01b8\3\2\2\2\u01aa\u01ab\5H%\2\u01ab\u01ac\7\61\2\2\u01ac\u01ad\5B\""+
		"\2\u01ad\u01b8\3\2\2\2\u01ae\u01b8\5H%\2\u01af\u01b0\7\t\2\2\u01b0\u01b1"+
		"\5F$\2\u01b1\u01b2\7\5\2\2\u01b2\u01b8\3\2\2\2\u01b3\u01b4\7\t\2\2\u01b4"+
		"\u01b5\5F$\2\u01b5\u01b6\7\t\2\2\u01b6\u01b8\3\2\2\2\u01b7\u019a\3\2\2"+
		"\2\u01b7\u019e\3\2\2\2\u01b7\u01a2\3\2\2\2\u01b7\u01a6\3\2\2\2\u01b7\u01aa"+
		"\3\2\2\2\u01b7\u01ae\3\2\2\2\u01b7\u01af\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b8"+
		"E\3\2\2\2\u01b9\u01ba\t\3\2\2\u01baG\3\2\2\2\u01bb\u01bc\5J&\2\u01bc\u01bd"+
		"\7%\2\2\u01bd\u01be\5H%\2\u01be\u01c1\3\2\2\2\u01bf\u01c1\5J&\2\u01c0"+
		"\u01bb\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1I\3\2\2\2\u01c2\u01c3\5L\'\2\u01c3"+
		"\u01c4\7$\2\2\u01c4\u01c5\5J&\2\u01c5\u01c8\3\2\2\2\u01c6\u01c8\5L\'\2"+
		"\u01c7\u01c2\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8K\3\2\2\2\u01c9\u01ca\7"+
		"\67\2\2\u01ca\u01cb\5H%\2\u01cb\u01cc\78\2\2\u01cc\u01d1\3\2\2\2\u01cd"+
		"\u01ce\7&\2\2\u01ce\u01d1\5H%\2\u01cf\u01d1\5N(\2\u01d0\u01c9\3\2\2\2"+
		"\u01d0\u01cd\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1M\3\2\2\2\u01d2\u01d3\7"+
		"\b\2\2\u01d3O\3\2\2\2\u01d4\u01d5\5R*\2\u01d5\u01d6\5P)\2\u01d6\u01d9"+
		"\3\2\2\2\u01d7\u01d9\5R*\2\u01d8\u01d4\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9"+
		"Q\3\2\2\2\u01da\u01db\7<\2\2\u01db\u01dc\5\30\r\2\u01dc\u01dd\7\t\2\2"+
		"\u01dd\u01de\7\'\2\2\u01de\u01df\5T+\2\u01df\u01e0\7\13\2\2\u01e0S\3\2"+
		"\2\2\u01e1\u01e2\5V,\2\u01e2\u01e3\7\5\2\2\u01e3\u01ec\3\2\2\2\u01e4\u01e5"+
		"\5V,\2\u01e5\u01e6\7\7\2\2\u01e6\u01ec\3\2\2\2\u01e7\u01ec\7\6\2\2\u01e8"+
		"\u01ec\7\b\2\2\u01e9\u01ec\7\5\2\2\u01ea\u01ec\7\7\2\2\u01eb\u01e1\3\2"+
		"\2\2\u01eb\u01e4\3\2\2\2\u01eb\u01e7\3\2\2\2\u01eb\u01e8\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ecU\3\2\2\2\u01ed\u01ee\t\4\2\2"+
		"\u01eeW\3\2\2\2\u01ef\u01f0\7\27\2\2\u01f0\u01f1\7\67\2\2\u01f1\u01f2"+
		"\7\b\2\2\u01f2\u01f3\78\2\2\u01f3\u01fa\7\13\2\2\u01f4\u01f5\7\27\2\2"+
		"\u01f5\u01f6\7\67\2\2\u01f6\u01f7\7\b\2\2\u01f7\u01f8\78\2\2\u01f8\u01fa"+
		"\b-\1\2\u01f9\u01ef\3\2\2\2\u01f9\u01f4\3\2\2\2\u01faY\3\2\2\2\u01fb\u0200"+
		"\5\66\34\2\u01fc\u0200\7\t\2\2\u01fd\u0200\5\"\22\2\u01fe\u0200\7\b\2"+
		"\2\u01ff\u01fb\3\2\2\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff\u01fe"+
		"\3\2\2\2\u0200[\3\2\2\2\u0201\u0202\7\t\2\2\u0202\u0203\7\'\2\2\u0203"+
		"\u0204\7\30\2\2\u0204\u0209\5^\60\2\u0205\u0206\7\30\2\2\u0206\u0207\7"+
		"\67\2\2\u0207\u0209\78\2\2\u0208\u0201\3\2\2\2\u0208\u0205\3\2\2\2\u0209"+
		"]\3\2\2\2\u020a\u020b\t\5\2\2\u020b_\3\2\2\2$adm|\u008a\u0093\u0097\u009a"+
		"\u00a3\u00ae\u00b4\u00bf\u00d1\u00dd\u00e9\u00fd\u0119\u0138\u014f\u0157"+
		"\u0166\u0171\u0186\u0191\u0198\u01b7\u01c0\u01c7\u01d0\u01d8\u01eb\u01f9"+
		"\u01ff\u0208";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from JuicyBoys.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuicyBoysLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"QUOTE1", "QUOTE2", "INTEGER_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", 
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


	public JuicyBoysLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JuicyBoys.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2?\u01e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\3\3\3\3\4\6\4\u0083\n\4\r\4\16\4\u0084\3\5\3\5\3\5\3"+
		"\5\3\6\6\6\u008c\n\6\r\6\16\6\u008d\3\6\3\6\6\6\u0092\n\6\r\6\16\6\u0093"+
		"\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00aa\n\b\r\b\16\b\u00ab\3\b\7\b\u00af\n"+
		"\b\f\b\16\b\u00b2\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00be"+
		"\n\t\f\t\16\t\u00c1\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\39\39\3"+
		"9\69\u01b1\n9\r9\169\u01b2\39\39\69\u01b7\n9\r9\169\u01b8\39\39\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\6:\u01c8\n:\r:\16:\u01c9\3;\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3>\6>\u01e2\n>\r>\16>\u01e3"+
		"\3>\3>\2\2?\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?\3\2\b\3\2\62;\5\2\62;C\\c|\7\2\"#\60\60\62<C"+
		"\\c|\5\2C\\aac|\4\2C\\c|\5\2\13\f\17\17\"\"\2\u01f1\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2"+
		"\2\5\177\3\2\2\2\7\u0082\3\2\2\2\t\u0086\3\2\2\2\13\u008b\3\2\2\2\r\u0095"+
		"\3\2\2\2\17\u009e\3\2\2\2\21\u00b3\3\2\2\2\23\u00cb\3\2\2\2\25\u00d2\3"+
		"\2\2\2\27\u00d8\3\2\2\2\31\u00df\3\2\2\2\33\u00e6\3\2\2\2\35\u00ed\3\2"+
		"\2\2\37\u00f5\3\2\2\2!\u00f9\3\2\2\2#\u00fe\3\2\2\2%\u0104\3\2\2\2\'\u0111"+
		"\3\2\2\2)\u0118\3\2\2\2+\u0128\3\2\2\2-\u012f\3\2\2\2/\u0137\3\2\2\2\61"+
		"\u013e\3\2\2\2\63\u0142\3\2\2\2\65\u0149\3\2\2\2\67\u014b\3\2\2\29\u014d"+
		"\3\2\2\2;\u014f\3\2\2\2=\u0151\3\2\2\2?\u0153\3\2\2\2A\u0155\3\2\2\2C"+
		"\u015e\3\2\2\2E\u0166\3\2\2\2G\u016c\3\2\2\2I\u0176\3\2\2\2K\u017c\3\2"+
		"\2\2M\u017e\3\2\2\2O\u0181\3\2\2\2Q\u0184\3\2\2\2S\u0187\3\2\2\2U\u0189"+
		"\3\2\2\2W\u018c\3\2\2\2Y\u018e\3\2\2\2[\u0190\3\2\2\2]\u0192\3\2\2\2_"+
		"\u0195\3\2\2\2a\u0198\3\2\2\2c\u019b\3\2\2\2e\u019d\3\2\2\2g\u019f\3\2"+
		"\2\2i\u01a1\3\2\2\2k\u01a3\3\2\2\2m\u01a5\3\2\2\2o\u01a7\3\2\2\2q\u01a9"+
		"\3\2\2\2s\u01bc\3\2\2\2u\u01cb\3\2\2\2w\u01d4\3\2\2\2y\u01da\3\2\2\2{"+
		"\u01e1\3\2\2\2}~\7)\2\2~\4\3\2\2\2\177\u0080\7`\2\2\u0080\6\3\2\2\2\u0081"+
		"\u0083\t\2\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2"+
		"\2\2\u0084\u0085\3\2\2\2\u0085\b\3\2\2\2\u0086\u0087\5\3\2\2\u0087\u0088"+
		"\t\3\2\2\u0088\u0089\5\3\2\2\u0089\n\3\2\2\2\u008a\u008c\t\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0091\7\60\2\2\u0090\u0092\t\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\f\3\2\2\2\u0095\u0099\5\5\3\2\u0096\u0098\t\4\2\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\5\5\3\2\u009d\16\3\2\2"+
		"\2\u009e\u009f\7d\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2"+
		"\7{\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7q\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\t\5"+
		"\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00af\t\2\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\20\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7m\2\2\u00b4\u00b5\7q\2\2"+
		"\u00b5\u00b6\7y\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7#\2\2\u00bb\u00bf\3\2\2\2\u00bc"+
		"\u00be\t\3\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7#\2\2\u00c3\u00c4\7m\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7y\2\2"+
		"\u00c6\u00c7\7o\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca"+
		"\7v\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7=\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce"+
		"\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7r\2\2\u00d1"+
		"\24\3\2\2\2\u00d2\u00d3\7d\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7n\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6\u00d7\7m\2\2\u00d7\26\3\2\2\2\u00d8\u00d9\7p\2\2\u00d9"+
		"\u00da\7w\2\2\u00da\u00db\7o\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7t\2\2"+
		"\u00dd\u00de\7q\2\2\u00de\30\3\2\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7"+
		"q\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7{\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5"+
		"\7p\2\2\u00e5\32\3\2\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9"+
		"\7v\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7p\2\2\u00eb\u00ec\7i\2\2\u00ec"+
		"\34\3\2\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0"+
		"\u00f1\7w\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7f\2\2"+
		"\u00f4\36\3\2\2\2\u00f5\u00f6\7m\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8\7"+
		"t\2\2\u00f8 \3\2\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc"+
		"\7{\2\2\u00fc\u00fd\7f\2\2\u00fd\"\3\2\2\2\u00fe\u00ff\7f\2\2\u00ff\u0100"+
		"\7q\2\2\u0100\u0101\7d\2\2\u0101\u0102\7q\2\2\u0102\u0103\7n\2\2\u0103"+
		"$\3\2\2\2\u0104\u0105\7i\2\2\u0105\u0106\7c\2\2\u0106\u0107\7y\2\2\u0107"+
		"\u0108\7k\2\2\u0108\u0109\7p\2\2\u0109\u010a\7\"\2\2\u010a\u010b\7j\2"+
		"\2\u010b\u010c\7c\2\2\u010c\u010d\7d\2\2\u010d\u010e\7c\2\2\u010e\u010f"+
		"\7p\2\2\u010f\u0110\7i\2\2\u0110&\3\2\2\2\u0111\u0112\7j\2\2\u0112\u0113"+
		"\7c\2\2\u0113\u0114\7d\2\2\u0114\u0115\7c\2\2\u0115\u0116\7p\2\2\u0116"+
		"\u0117\7i\2\2\u0117(\3\2\2\2\u0118\u0119\7u\2\2\u0119\u011a\7k\2\2\u011a"+
		"\u011b\7o\2\2\u011b\u011c\7w\2\2\u011c\u011d\7n\2\2\u011d\u011e\7c\2\2"+
		"\u011e\u011f\7p\2\2\u011f\u0120\7j\2\2\u0120\u0121\7c\2\2\u0121\u0122"+
		"\7p\2\2\u0122\u0123\7i\2\2\u0123\u0124\7i\2\2\u0124\u0125\7c\2\2\u0125"+
		"\u0126\7p\2\2\u0126\u0127\7i\2\2\u0127*\3\2\2\2\u0128\u0129\7k\2\2\u0129"+
		"\u012a\7u\2\2\u012a\u012b\7w\2\2\u012b\u012c\7n\2\2\u012c\u012d\7c\2\2"+
		"\u012d\u012e\7v\2\2\u012e,\3\2\2\2\u012f\u0130\7d\2\2\u0130\u0131\7c\2"+
		"\2\u0131\u0132\7u\2\2\u0132\u0133\7c\2\2\u0133\u0134\7j\2\2\u0134\u0135"+
		"\7k\2\2\u0135\u0136\7p\2\2\u0136.\3\2\2\2\u0137\u0138\7u\2\2\u0138\u0139"+
		"\7k\2\2\u0139\u013a\7o\2\2\u013a\u013b\7w\2\2\u013b\u013c\7n\2\2\u013c"+
		"\u013d\7c\2\2\u013d\60\3\2\2\2\u013e\u013f\7r\2\2\u013f\u0140\7c\2\2\u0140"+
		"\u0141\7i\2\2\u0141\62\3\2\2\2\u0142\u0143\7q\2\2\u0143\u0144\7\"\2\2"+
		"\u0144\u0145\7m\2\2\u0145\u0146\7c\2\2\u0146\u0147\7{\2\2\u0147\u0148"+
		"\7c\2\2\u0148\64\3\2\2\2\u0149\u014a\7<\2\2\u014a\66\3\2\2\2\u014b\u014c"+
		"\7-\2\2\u014c8\3\2\2\2\u014d\u014e\7/\2\2\u014e:\3\2\2\2\u014f\u0150\7"+
		",\2\2\u0150<\3\2\2\2\u0151\u0152\7\61\2\2\u0152>\3\2\2\2\u0153\u0154\7"+
		"\'\2\2\u0154@\3\2\2\2\u0155\u0156\7r\2\2\u0156\u0157\7c\2\2\u0157\u0158"+
		"\7f\2\2\u0158\u0159\7c\2\2\u0159\u015a\7i\2\2\u015a\u015b\7f\2\2\u015b"+
		"\u015c\7c\2\2\u015c\u015d\7i\2\2\u015dB\3\2\2\2\u015e\u015f\7r\2\2\u015f"+
		"\u0160\7c\2\2\u0160\u0161\7d\2\2\u0161\u0162\7c\2\2\u0162\u0163\7y\2\2"+
		"\u0163\u0164\7c\2\2\u0164\u0165\7u\2\2\u0165D\3\2\2\2\u0166\u0167\7v\2"+
		"\2\u0167\u0168\7u\2\2\u0168\u0169\7c\2\2\u0169\u016a\7m\2\2\u016a\u016b"+
		"\7c\2\2\u016bF\3\2\2\2\u016c\u016d\7r\2\2\u016d\u016e\7y\2\2\u016e\u016f"+
		"\7g\2\2\u016f\u0170\7f\2\2\u0170\u0171\7g\2\2\u0171\u0172\7\"\2\2\u0172"+
		"\u0173\7t\2\2\u0173\u0174\7k\2\2\u0174\u0175\7p\2\2\u0175H\3\2\2\2\u0176"+
		"\u0177\7j\2\2\u0177\u0178\7k\2\2\u0178\u0179\7p\2\2\u0179\u017a\7f\2\2"+
		"\u017a\u017b\7k\2\2\u017bJ\3\2\2\2\u017c\u017d\7?\2\2\u017dL\3\2\2\2\u017e"+
		"\u017f\7-\2\2\u017f\u0180\7?\2\2\u0180N\3\2\2\2\u0181\u0182\7/\2\2\u0182"+
		"\u0183\7?\2\2\u0183P\3\2\2\2\u0184\u0185\7,\2\2\u0185\u0186\7?\2\2\u0186"+
		"R\3\2\2\2\u0187\u0188\7?\2\2\u0188T\3\2\2\2\u0189\u018a\7\'\2\2\u018a"+
		"\u018b\7?\2\2\u018bV\3\2\2\2\u018c\u018d\7@\2\2\u018dX\3\2\2\2\u018e\u018f"+
		"\7>\2\2\u018fZ\3\2\2\2\u0190\u0191\7?\2\2\u0191\\\3\2\2\2\u0192\u0193"+
		"\7@\2\2\u0193\u0194\7?\2\2\u0194^\3\2\2\2\u0195\u0196\7#\2\2\u0196\u0197"+
		"\7?\2\2\u0197`\3\2\2\2\u0198\u0199\7?\2\2\u0199\u019a\7?\2\2\u019ab\3"+
		"\2\2\2\u019b\u019c\7}\2\2\u019cd\3\2\2\2\u019d\u019e\7\177\2\2\u019ef"+
		"\3\2\2\2\u019f\u01a0\7]\2\2\u01a0h\3\2\2\2\u01a1\u01a2\7_\2\2\u01a2j\3"+
		"\2\2\2\u01a3\u01a4\7*\2\2\u01a4l\3\2\2\2\u01a5\u01a6\7+\2\2\u01a6n\3\2"+
		"\2\2\u01a7\u01a8\7.\2\2\u01a8p\3\2\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab"+
		"\7t\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7{\2\2\u01ad\u01ae\7\"\2\2\u01ae"+
		"\u01b0\3\2\2\2\u01af\u01b1\t\6\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b6\7]\2\2\u01b5\u01b7\t\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\u01bb\7_\2\2\u01bbr\3\2\2\2\u01bc\u01bd\7r\2\2\u01bd\u01be\7c\2\2\u01be"+
		"\u01bf\7p\2\2\u01bf\u01c0\7m\2\2\u01c0\u01c1\7u\2\2\u01c1\u01c2\7{\2\2"+
		"\u01c2\u01c3\7q\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7\"\2\2\u01c5\u01c7"+
		"\3\2\2\2\u01c6\u01c8\t\6\2\2\u01c7\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01cat\3\2\2\2\u01cb\u01cc\7m\2\2\u01cc"+
		"\u01cd\7w\2\2\u01cd\u01ce\7p\2\2\u01ce\u01cf\7u\2\2\u01cf\u01d0\7v\2\2"+
		"\u01d0\u01d1\7c\2\2\u01d1\u01d2\7p\2\2\u01d2\u01d3\7v\2\2\u01d3v\3\2\2"+
		"\2\u01d4\u01d5\7v\2\2\u01d5\u01d6\7q\2\2\u01d6\u01d7\7v\2\2\u01d7\u01d8"+
		"\7q\2\2\u01d8\u01d9\7q\2\2\u01d9x\3\2\2\2\u01da\u01db\7v\2\2\u01db\u01dc"+
		"\7c\2\2\u01dc\u01dd\7n\2\2\u01dd\u01de\7q\2\2\u01de\u01df\7p\2\2\u01df"+
		"z\3\2\2\2\u01e0\u01e2\t\7\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2"+
		"\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6"+
		"\b>\2\2\u01e6|\3\2\2\2\16\2\u0084\u008d\u0093\u0099\u00ab\u00b0\u00bf"+
		"\u01b2\u01b8\u01c9\u01e3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
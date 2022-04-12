// Generated from ./src/main/java/org/rumbledb/parser/Jsoniq.g4 by ANTLR 4.7

// Java header
package org.rumbledb.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsoniqLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, Kfor=62, Klet=63, Kwhere=64, Kgroup=65, Kby=66, Korder=67, 
		Kreturn=68, Kif=69, Kin=70, Kas=71, Kat=72, Kallowing=73, Kempty=74, Kcount=75, 
		Kstable=76, Kascending=77, Kdescending=78, Ksome=79, Kevery=80, Ksatisfies=81, 
		Kcollation=82, Kgreatest=83, Kleast=84, Kswitch=85, Kcase=86, Ktry=87, 
		Kcatch=88, Kdefault=89, Kthen=90, Kelse=91, Ktypeswitch=92, Kor=93, Kand=94, 
		Knot=95, Kto=96, Kinstance=97, Kof=98, Kstatically=99, Kis=100, Ktreat=101, 
		Kcast=102, Kcastable=103, Kversion=104, Kjsoniq=105, Kunordered=106, Ktrue=107, 
		Kfalse=108, Ktype=109, Kdeclare=110, Kcontext=111, Kitem=112, Kvariable=113, 
		STRING=114, ArgumentPlaceholder=115, NullLiteral=116, Literal=117, NumericLiteral=118, 
		IntegerLiteral=119, DecimalLiteral=120, DoubleLiteral=121, WS=122, NCName=123, 
		XQComment=124, ContentChar=125;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "Kfor", "Klet", "Kwhere", "Kgroup", 
		"Kby", "Korder", "Kreturn", "Kif", "Kin", "Kas", "Kat", "Kallowing", "Kempty", 
		"Kcount", "Kstable", "Kascending", "Kdescending", "Ksome", "Kevery", "Ksatisfies", 
		"Kcollation", "Kgreatest", "Kleast", "Kswitch", "Kcase", "Ktry", "Kcatch", 
		"Kdefault", "Kthen", "Kelse", "Ktypeswitch", "Kor", "Kand", "Knot", "Kto", 
		"Kinstance", "Kof", "Kstatically", "Kis", "Ktreat", "Kcast", "Kcastable", 
		"Kversion", "Kjsoniq", "Kunordered", "Ktrue", "Kfalse", "Ktype", "Kdeclare", 
		"Kcontext", "Kitem", "Kvariable", "STRING", "ESC", "UNICODE", "HEX", "ArgumentPlaceholder", 
		"NullLiteral", "Literal", "NumericLiteral", "IntegerLiteral", "DecimalLiteral", 
		"DoubleLiteral", "Digits", "WS", "NCName", "NameStartChar", "NameChar", 
		"XQComment", "ContentChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'module'", "'namespace'", "'='", "'ordering'", "'ordered'", 
		"'decimal-format'", "':'", "'decimal-separator'", "'grouping-separator'", 
		"'infinity'", "'minus-sign'", "'NaN'", "'percent'", "'per-mille'", "'zero-digit'", 
		"'digit'", "'pattern-separator'", "'import'", "','", "':='", "'external'", 
		"'function'", "'('", "')'", "'{'", "'}'", "'jsound'", "'compact'", "'verbose'", 
		"'json'", "'schema'", "'$'", "'|'", "'*'", "'eq'", "'ne'", "'lt'", "'le'", 
		"'gt'", "'ge'", "'!='", "'<'", "'<='", "'>'", "'>='", "'||'", "'+'", "'-'", 
		"'div'", "'idiv'", "'mod'", "'validate'", "'!'", "'['", "']'", "'.'", 
		"'$$'", "'#'", "'{|'", "'|}'", "'for'", "'let'", "'where'", "'group'", 
		"'by'", "'order'", "'return'", "'if'", "'in'", "'as'", "'at'", "'allowing'", 
		"'empty'", "'count'", "'stable'", "'ascending'", "'descending'", "'some'", 
		"'every'", "'satisfies'", "'collation'", "'greatest'", "'least'", "'switch'", 
		"'case'", "'try'", "'catch'", "'default'", "'then'", "'else'", "'typeswitch'", 
		"'or'", "'and'", "'not'", "'to'", "'instance'", "'of'", "'statically'", 
		"'is'", "'treat'", "'cast'", "'castable'", "'version'", "'jsoniq'", "'unordered'", 
		"'true'", "'false'", "'type'", "'declare'", "'context'", "'item'", "'variable'", 
		null, "'?'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "Kfor", "Klet", "Kwhere", "Kgroup", "Kby", "Korder", "Kreturn", 
		"Kif", "Kin", "Kas", "Kat", "Kallowing", "Kempty", "Kcount", "Kstable", 
		"Kascending", "Kdescending", "Ksome", "Kevery", "Ksatisfies", "Kcollation", 
		"Kgreatest", "Kleast", "Kswitch", "Kcase", "Ktry", "Kcatch", "Kdefault", 
		"Kthen", "Kelse", "Ktypeswitch", "Kor", "Kand", "Knot", "Kto", "Kinstance", 
		"Kof", "Kstatically", "Kis", "Ktreat", "Kcast", "Kcastable", "Kversion", 
		"Kjsoniq", "Kunordered", "Ktrue", "Kfalse", "Ktype", "Kdeclare", "Kcontext", 
		"Kitem", "Kvariable", "STRING", "ArgumentPlaceholder", "NullLiteral", 
		"Literal", "NumericLiteral", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", 
		"WS", "NCName", "XQComment", "ContentChar"
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


	public JsoniqLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jsoniq.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\177\u040b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3"+
		"-\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3"+
		"<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3"+
		"B\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3"+
		"G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3"+
		"K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3"+
		"W\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3"+
		"[\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3_\3_"+
		"\3_\3_\3`\3`\3`\3`\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3d\3d"+
		"\3d\3d\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\3f\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g"+
		"\3h\3h\3h\3h\3h\3h\3h\3h\3h\3i\3i\3i\3i\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j"+
		"\3j\3k\3k\3k\3k\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3n"+
		"\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q"+
		"\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\7s\u0399\ns\fs\16s\u039c\13"+
		"s\3s\3s\3t\3t\3t\5t\u03a3\nt\3u\3u\3u\3u\3u\3u\3v\3v\3w\3w\3x\3x\3x\3"+
		"x\3x\3y\3y\3z\3z\3z\5z\u03b9\nz\3{\3{\3|\3|\3|\3|\3|\7|\u03c2\n|\f|\16"+
		"|\u03c5\13|\5|\u03c7\n|\3}\3}\3}\3}\3}\7}\u03ce\n}\f}\16}\u03d1\13}\5"+
		"}\u03d3\n}\5}\u03d5\n}\3}\3}\5}\u03d9\n}\3}\3}\3~\6~\u03de\n~\r~\16~\u03df"+
		"\3\177\3\177\3\177\3\177\3\u0080\3\u0080\7\u0080\u03e8\n\u0080\f\u0080"+
		"\16\u0080\u03eb\13\u0080\3\u0081\5\u0081\u03ee\n\u0081\3\u0082\3\u0082"+
		"\5\u0082\u03f2\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\7\u0083\u03fc\n\u0083\f\u0083\16\u0083\u03ff\13\u0083"+
		"\3\u0083\6\u0083\u0402\n\u0083\r\u0083\16\u0083\u0403\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\3\u0084\2\2\u0085\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9"+
		"V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd"+
		"`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1"+
		"j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3s\u00e5"+
		"t\u00e7\2\u00e9\2\u00eb\2\u00edu\u00efv\u00f1w\u00f3x\u00f5y\u00f7z\u00f9"+
		"{\u00fb\2\u00fd|\u00ff}\u0101\2\u0103\2\u0105~\u0107\177\3\2\17\4\2$$"+
		"^^\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\62;\4\2GGgg\4\2--//\5\2\13"+
		"\f\17\17\"\"\20\2C\\aac|\u00c2\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f"+
		"\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1"+
		"\ufdf2\uffff\7\2//\62;\u00b9\u00b9\u0302\u0371\u2041\u2042\3\2<<\3\2+"+
		"+\4\2**<<\7\2$$()>>}}\177\177\2\u0417\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3"+
		"\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2"+
		"\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2"+
		"\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3"+
		"\3\2\2\2\2\u00e5\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2"+
		"\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fd"+
		"\3\2\2\2\2\u00ff\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\3\u0109\3\2\2"+
		"\2\5\u010b\3\2\2\2\7\u0112\3\2\2\2\t\u011c\3\2\2\2\13\u011e\3\2\2\2\r"+
		"\u0127\3\2\2\2\17\u012f\3\2\2\2\21\u013e\3\2\2\2\23\u0140\3\2\2\2\25\u0152"+
		"\3\2\2\2\27\u0165\3\2\2\2\31\u016e\3\2\2\2\33\u0179\3\2\2\2\35\u017d\3"+
		"\2\2\2\37\u0185\3\2\2\2!\u018f\3\2\2\2#\u019a\3\2\2\2%\u01a0\3\2\2\2\'"+
		"\u01b2\3\2\2\2)\u01b9\3\2\2\2+\u01bb\3\2\2\2-\u01be\3\2\2\2/\u01c7\3\2"+
		"\2\2\61\u01d0\3\2\2\2\63\u01d2\3\2\2\2\65\u01d4\3\2\2\2\67\u01d6\3\2\2"+
		"\29\u01d8\3\2\2\2;\u01df\3\2\2\2=\u01e7\3\2\2\2?\u01ef\3\2\2\2A\u01f4"+
		"\3\2\2\2C\u01fb\3\2\2\2E\u01fd\3\2\2\2G\u01ff\3\2\2\2I\u0201\3\2\2\2K"+
		"\u0204\3\2\2\2M\u0207\3\2\2\2O\u020a\3\2\2\2Q\u020d\3\2\2\2S\u0210\3\2"+
		"\2\2U\u0213\3\2\2\2W\u0216\3\2\2\2Y\u0218\3\2\2\2[\u021b\3\2\2\2]\u021d"+
		"\3\2\2\2_\u0220\3\2\2\2a\u0223\3\2\2\2c\u0225\3\2\2\2e\u0227\3\2\2\2g"+
		"\u022b\3\2\2\2i\u0230\3\2\2\2k\u0234\3\2\2\2m\u023d\3\2\2\2o\u023f\3\2"+
		"\2\2q\u0241\3\2\2\2s\u0243\3\2\2\2u\u0245\3\2\2\2w\u0248\3\2\2\2y\u024a"+
		"\3\2\2\2{\u024d\3\2\2\2}\u0250\3\2\2\2\177\u0254\3\2\2\2\u0081\u0258\3"+
		"\2\2\2\u0083\u025e\3\2\2\2\u0085\u0264\3\2\2\2\u0087\u0267\3\2\2\2\u0089"+
		"\u026d\3\2\2\2\u008b\u0274\3\2\2\2\u008d\u0277\3\2\2\2\u008f\u027a\3\2"+
		"\2\2\u0091\u027d\3\2\2\2\u0093\u0280\3\2\2\2\u0095\u0289\3\2\2\2\u0097"+
		"\u028f\3\2\2\2\u0099\u0295\3\2\2\2\u009b\u029c\3\2\2\2\u009d\u02a6\3\2"+
		"\2\2\u009f\u02b1\3\2\2\2\u00a1\u02b6\3\2\2\2\u00a3\u02bc\3\2\2\2\u00a5"+
		"\u02c6\3\2\2\2\u00a7\u02d0\3\2\2\2\u00a9\u02d9\3\2\2\2\u00ab\u02df\3\2"+
		"\2\2\u00ad\u02e6\3\2\2\2\u00af\u02eb\3\2\2\2\u00b1\u02ef\3\2\2\2\u00b3"+
		"\u02f5\3\2\2\2\u00b5\u02fd\3\2\2\2\u00b7\u0302\3\2\2\2\u00b9\u0307\3\2"+
		"\2\2\u00bb\u0312\3\2\2\2\u00bd\u0315\3\2\2\2\u00bf\u0319\3\2\2\2\u00c1"+
		"\u031d\3\2\2\2\u00c3\u0320\3\2\2\2\u00c5\u0329\3\2\2\2\u00c7\u032c\3\2"+
		"\2\2\u00c9\u0337\3\2\2\2\u00cb\u033a\3\2\2\2\u00cd\u0340\3\2\2\2\u00cf"+
		"\u0345\3\2\2\2\u00d1\u034e\3\2\2\2\u00d3\u0356\3\2\2\2\u00d5\u035d\3\2"+
		"\2\2\u00d7\u0367\3\2\2\2\u00d9\u036c\3\2\2\2\u00db\u0372\3\2\2\2\u00dd"+
		"\u0377\3\2\2\2\u00df\u037f\3\2\2\2\u00e1\u0387\3\2\2\2\u00e3\u038c\3\2"+
		"\2\2\u00e5\u0395\3\2\2\2\u00e7\u039f\3\2\2\2\u00e9\u03a4\3\2\2\2\u00eb"+
		"\u03aa\3\2\2\2\u00ed\u03ac\3\2\2\2\u00ef\u03ae\3\2\2\2\u00f1\u03b3\3\2"+
		"\2\2\u00f3\u03b8\3\2\2\2\u00f5\u03ba\3\2\2\2\u00f7\u03c6\3\2\2\2\u00f9"+
		"\u03d4\3\2\2\2\u00fb\u03dd\3\2\2\2\u00fd\u03e1\3\2\2\2\u00ff\u03e5\3\2"+
		"\2\2\u0101\u03ed\3\2\2\2\u0103\u03f1\3\2\2\2\u0105\u03f3\3\2\2\2\u0107"+
		"\u0409\3\2\2\2\u0109\u010a\7=\2\2\u010a\4\3\2\2\2\u010b\u010c\7o\2\2\u010c"+
		"\u010d\7q\2\2\u010d\u010e\7f\2\2\u010e\u010f\7w\2\2\u010f\u0110\7n\2\2"+
		"\u0110\u0111\7g\2\2\u0111\6\3\2\2\2\u0112\u0113\7p\2\2\u0113\u0114\7c"+
		"\2\2\u0114\u0115\7o\2\2\u0115\u0116\7g\2\2\u0116\u0117\7u\2\2\u0117\u0118"+
		"\7r\2\2\u0118\u0119\7c\2\2\u0119\u011a\7e\2\2\u011a\u011b\7g\2\2\u011b"+
		"\b\3\2\2\2\u011c\u011d\7?\2\2\u011d\n\3\2\2\2\u011e\u011f\7q\2\2\u011f"+
		"\u0120\7t\2\2\u0120\u0121\7f\2\2\u0121\u0122\7g\2\2\u0122\u0123\7t\2\2"+
		"\u0123\u0124\7k\2\2\u0124\u0125\7p\2\2\u0125\u0126\7i\2\2\u0126\f\3\2"+
		"\2\2\u0127\u0128\7q\2\2\u0128\u0129\7t\2\2\u0129\u012a\7f\2\2\u012a\u012b"+
		"\7g\2\2\u012b\u012c\7t\2\2\u012c\u012d\7g\2\2\u012d\u012e\7f\2\2\u012e"+
		"\16\3\2\2\2\u012f\u0130\7f\2\2\u0130\u0131\7g\2\2\u0131\u0132\7e\2\2\u0132"+
		"\u0133\7k\2\2\u0133\u0134\7o\2\2\u0134\u0135\7c\2\2\u0135\u0136\7n\2\2"+
		"\u0136\u0137\7/\2\2\u0137\u0138\7h\2\2\u0138\u0139\7q\2\2\u0139\u013a"+
		"\7t\2\2\u013a\u013b\7o\2\2\u013b\u013c\7c\2\2\u013c\u013d\7v\2\2\u013d"+
		"\20\3\2\2\2\u013e\u013f\7<\2\2\u013f\22\3\2\2\2\u0140\u0141\7f\2\2\u0141"+
		"\u0142\7g\2\2\u0142\u0143\7e\2\2\u0143\u0144\7k\2\2\u0144\u0145\7o\2\2"+
		"\u0145\u0146\7c\2\2\u0146\u0147\7n\2\2\u0147\u0148\7/\2\2\u0148\u0149"+
		"\7u\2\2\u0149\u014a\7g\2\2\u014a\u014b\7r\2\2\u014b\u014c\7c\2\2\u014c"+
		"\u014d\7t\2\2\u014d\u014e\7c\2\2\u014e\u014f\7v\2\2\u014f\u0150\7q\2\2"+
		"\u0150\u0151\7t\2\2\u0151\24\3\2\2\2\u0152\u0153\7i\2\2\u0153\u0154\7"+
		"t\2\2\u0154\u0155\7q\2\2\u0155\u0156\7w\2\2\u0156\u0157\7r\2\2\u0157\u0158"+
		"\7k\2\2\u0158\u0159\7p\2\2\u0159\u015a\7i\2\2\u015a\u015b\7/\2\2\u015b"+
		"\u015c\7u\2\2\u015c\u015d\7g\2\2\u015d\u015e\7r\2\2\u015e\u015f\7c\2\2"+
		"\u015f\u0160\7t\2\2\u0160\u0161\7c\2\2\u0161\u0162\7v\2\2\u0162\u0163"+
		"\7q\2\2\u0163\u0164\7t\2\2\u0164\26\3\2\2\2\u0165\u0166\7k\2\2\u0166\u0167"+
		"\7p\2\2\u0167\u0168\7h\2\2\u0168\u0169\7k\2\2\u0169\u016a\7p\2\2\u016a"+
		"\u016b\7k\2\2\u016b\u016c\7v\2\2\u016c\u016d\7{\2\2\u016d\30\3\2\2\2\u016e"+
		"\u016f\7o\2\2\u016f\u0170\7k\2\2\u0170\u0171\7p\2\2\u0171\u0172\7w\2\2"+
		"\u0172\u0173\7u\2\2\u0173\u0174\7/\2\2\u0174\u0175\7u\2\2\u0175\u0176"+
		"\7k\2\2\u0176\u0177\7i\2\2\u0177\u0178\7p\2\2\u0178\32\3\2\2\2\u0179\u017a"+
		"\7P\2\2\u017a\u017b\7c\2\2\u017b\u017c\7P\2\2\u017c\34\3\2\2\2\u017d\u017e"+
		"\7r\2\2\u017e\u017f\7g\2\2\u017f\u0180\7t\2\2\u0180\u0181\7e\2\2\u0181"+
		"\u0182\7g\2\2\u0182\u0183\7p\2\2\u0183\u0184\7v\2\2\u0184\36\3\2\2\2\u0185"+
		"\u0186\7r\2\2\u0186\u0187\7g\2\2\u0187\u0188\7t\2\2\u0188\u0189\7/\2\2"+
		"\u0189\u018a\7o\2\2\u018a\u018b\7k\2\2\u018b\u018c\7n\2\2\u018c\u018d"+
		"\7n\2\2\u018d\u018e\7g\2\2\u018e \3\2\2\2\u018f\u0190\7|\2\2\u0190\u0191"+
		"\7g\2\2\u0191\u0192\7t\2\2\u0192\u0193\7q\2\2\u0193\u0194\7/\2\2\u0194"+
		"\u0195\7f\2\2\u0195\u0196\7k\2\2\u0196\u0197\7i\2\2\u0197\u0198\7k\2\2"+
		"\u0198\u0199\7v\2\2\u0199\"\3\2\2\2\u019a\u019b\7f\2\2\u019b\u019c\7k"+
		"\2\2\u019c\u019d\7i\2\2\u019d\u019e\7k\2\2\u019e\u019f\7v\2\2\u019f$\3"+
		"\2\2\2\u01a0\u01a1\7r\2\2\u01a1\u01a2\7c\2\2\u01a2\u01a3\7v\2\2\u01a3"+
		"\u01a4\7v\2\2\u01a4\u01a5\7g\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7p\2\2"+
		"\u01a7\u01a8\7/\2\2\u01a8\u01a9\7u\2\2\u01a9\u01aa\7g\2\2\u01aa\u01ab"+
		"\7r\2\2\u01ab\u01ac\7c\2\2\u01ac\u01ad\7t\2\2\u01ad\u01ae\7c\2\2\u01ae"+
		"\u01af\7v\2\2\u01af\u01b0\7q\2\2\u01b0\u01b1\7t\2\2\u01b1&\3\2\2\2\u01b2"+
		"\u01b3\7k\2\2\u01b3\u01b4\7o\2\2\u01b4\u01b5\7r\2\2\u01b5\u01b6\7q\2\2"+
		"\u01b6\u01b7\7t\2\2\u01b7\u01b8\7v\2\2\u01b8(\3\2\2\2\u01b9\u01ba\7.\2"+
		"\2\u01ba*\3\2\2\2\u01bb\u01bc\7<\2\2\u01bc\u01bd\7?\2\2\u01bd,\3\2\2\2"+
		"\u01be\u01bf\7g\2\2\u01bf\u01c0\7z\2\2\u01c0\u01c1\7v\2\2\u01c1\u01c2"+
		"\7g\2\2\u01c2\u01c3\7t\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7c\2\2\u01c5"+
		"\u01c6\7n\2\2\u01c6.\3\2\2\2\u01c7\u01c8\7h\2\2\u01c8\u01c9\7w\2\2\u01c9"+
		"\u01ca\7p\2\2\u01ca\u01cb\7e\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7k\2\2"+
		"\u01cd\u01ce\7q\2\2\u01ce\u01cf\7p\2\2\u01cf\60\3\2\2\2\u01d0\u01d1\7"+
		"*\2\2\u01d1\62\3\2\2\2\u01d2\u01d3\7+\2\2\u01d3\64\3\2\2\2\u01d4\u01d5"+
		"\7}\2\2\u01d5\66\3\2\2\2\u01d6\u01d7\7\177\2\2\u01d78\3\2\2\2\u01d8\u01d9"+
		"\7l\2\2\u01d9\u01da\7u\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7w\2\2\u01dc"+
		"\u01dd\7p\2\2\u01dd\u01de\7f\2\2\u01de:\3\2\2\2\u01df\u01e0\7e\2\2\u01e0"+
		"\u01e1\7q\2\2\u01e1\u01e2\7o\2\2\u01e2\u01e3\7r\2\2\u01e3\u01e4\7c\2\2"+
		"\u01e4\u01e5\7e\2\2\u01e5\u01e6\7v\2\2\u01e6<\3\2\2\2\u01e7\u01e8\7x\2"+
		"\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7t\2\2\u01ea\u01eb\7d\2\2\u01eb\u01ec"+
		"\7q\2\2\u01ec\u01ed\7u\2\2\u01ed\u01ee\7g\2\2\u01ee>\3\2\2\2\u01ef\u01f0"+
		"\7l\2\2\u01f0\u01f1\7u\2\2\u01f1\u01f2\7q\2\2\u01f2\u01f3\7p\2\2\u01f3"+
		"@\3\2\2\2\u01f4\u01f5\7u\2\2\u01f5\u01f6\7e\2\2\u01f6\u01f7\7j\2\2\u01f7"+
		"\u01f8\7g\2\2\u01f8\u01f9\7o\2\2\u01f9\u01fa\7c\2\2\u01faB\3\2\2\2\u01fb"+
		"\u01fc\7&\2\2\u01fcD\3\2\2\2\u01fd\u01fe\7~\2\2\u01feF\3\2\2\2\u01ff\u0200"+
		"\7,\2\2\u0200H\3\2\2\2\u0201\u0202\7g\2\2\u0202\u0203\7s\2\2\u0203J\3"+
		"\2\2\2\u0204\u0205\7p\2\2\u0205\u0206\7g\2\2\u0206L\3\2\2\2\u0207\u0208"+
		"\7n\2\2\u0208\u0209\7v\2\2\u0209N\3\2\2\2\u020a\u020b\7n\2\2\u020b\u020c"+
		"\7g\2\2\u020cP\3\2\2\2\u020d\u020e\7i\2\2\u020e\u020f\7v\2\2\u020fR\3"+
		"\2\2\2\u0210\u0211\7i\2\2\u0211\u0212\7g\2\2\u0212T\3\2\2\2\u0213\u0214"+
		"\7#\2\2\u0214\u0215\7?\2\2\u0215V\3\2\2\2\u0216\u0217\7>\2\2\u0217X\3"+
		"\2\2\2\u0218\u0219\7>\2\2\u0219\u021a\7?\2\2\u021aZ\3\2\2\2\u021b\u021c"+
		"\7@\2\2\u021c\\\3\2\2\2\u021d\u021e\7@\2\2\u021e\u021f\7?\2\2\u021f^\3"+
		"\2\2\2\u0220\u0221\7~\2\2\u0221\u0222\7~\2\2\u0222`\3\2\2\2\u0223\u0224"+
		"\7-\2\2\u0224b\3\2\2\2\u0225\u0226\7/\2\2\u0226d\3\2\2\2\u0227\u0228\7"+
		"f\2\2\u0228\u0229\7k\2\2\u0229\u022a\7x\2\2\u022af\3\2\2\2\u022b\u022c"+
		"\7k\2\2\u022c\u022d\7f\2\2\u022d\u022e\7k\2\2\u022e\u022f\7x\2\2\u022f"+
		"h\3\2\2\2\u0230\u0231\7o\2\2\u0231\u0232\7q\2\2\u0232\u0233\7f\2\2\u0233"+
		"j\3\2\2\2\u0234\u0235\7x\2\2\u0235\u0236\7c\2\2\u0236\u0237\7n\2\2\u0237"+
		"\u0238\7k\2\2\u0238\u0239\7f\2\2\u0239\u023a\7c\2\2\u023a\u023b\7v\2\2"+
		"\u023b\u023c\7g\2\2\u023cl\3\2\2\2\u023d\u023e\7#\2\2\u023en\3\2\2\2\u023f"+
		"\u0240\7]\2\2\u0240p\3\2\2\2\u0241\u0242\7_\2\2\u0242r\3\2\2\2\u0243\u0244"+
		"\7\60\2\2\u0244t\3\2\2\2\u0245\u0246\7&\2\2\u0246\u0247\7&\2\2\u0247v"+
		"\3\2\2\2\u0248\u0249\7%\2\2\u0249x\3\2\2\2\u024a\u024b\7}\2\2\u024b\u024c"+
		"\7~\2\2\u024cz\3\2\2\2\u024d\u024e\7~\2\2\u024e\u024f\7\177\2\2\u024f"+
		"|\3\2\2\2\u0250\u0251\7h\2\2\u0251\u0252\7q\2\2\u0252\u0253\7t\2\2\u0253"+
		"~\3\2\2\2\u0254\u0255\7n\2\2\u0255\u0256\7g\2\2\u0256\u0257\7v\2\2\u0257"+
		"\u0080\3\2\2\2\u0258\u0259\7y\2\2\u0259\u025a\7j\2\2\u025a\u025b\7g\2"+
		"\2\u025b\u025c\7t\2\2\u025c\u025d\7g\2\2\u025d\u0082\3\2\2\2\u025e\u025f"+
		"\7i\2\2\u025f\u0260\7t\2\2\u0260\u0261\7q\2\2\u0261\u0262\7w\2\2\u0262"+
		"\u0263\7r\2\2\u0263\u0084\3\2\2\2\u0264\u0265\7d\2\2\u0265\u0266\7{\2"+
		"\2\u0266\u0086\3\2\2\2\u0267\u0268\7q\2\2\u0268\u0269\7t\2\2\u0269\u026a"+
		"\7f\2\2\u026a\u026b\7g\2\2\u026b\u026c\7t\2\2\u026c\u0088\3\2\2\2\u026d"+
		"\u026e\7t\2\2\u026e\u026f\7g\2\2\u026f\u0270\7v\2\2\u0270\u0271\7w\2\2"+
		"\u0271\u0272\7t\2\2\u0272\u0273\7p\2\2\u0273\u008a\3\2\2\2\u0274\u0275"+
		"\7k\2\2\u0275\u0276\7h\2\2\u0276\u008c\3\2\2\2\u0277\u0278\7k\2\2\u0278"+
		"\u0279\7p\2\2\u0279\u008e\3\2\2\2\u027a\u027b\7c\2\2\u027b\u027c\7u\2"+
		"\2\u027c\u0090\3\2\2\2\u027d\u027e\7c\2\2\u027e\u027f\7v\2\2\u027f\u0092"+
		"\3\2\2\2\u0280\u0281\7c\2\2\u0281\u0282\7n\2\2\u0282\u0283\7n\2\2\u0283"+
		"\u0284\7q\2\2\u0284\u0285\7y\2\2\u0285\u0286\7k\2\2\u0286\u0287\7p\2\2"+
		"\u0287\u0288\7i\2\2\u0288\u0094\3\2\2\2\u0289\u028a\7g\2\2\u028a\u028b"+
		"\7o\2\2\u028b\u028c\7r\2\2\u028c\u028d\7v\2\2\u028d\u028e\7{\2\2\u028e"+
		"\u0096\3\2\2\2\u028f\u0290\7e\2\2\u0290\u0291\7q\2\2\u0291\u0292\7w\2"+
		"\2\u0292\u0293\7p\2\2\u0293\u0294\7v\2\2\u0294\u0098\3\2\2\2\u0295\u0296"+
		"\7u\2\2\u0296\u0297\7v\2\2\u0297\u0298\7c\2\2\u0298\u0299\7d\2\2\u0299"+
		"\u029a\7n\2\2\u029a\u029b\7g\2\2\u029b\u009a\3\2\2\2\u029c\u029d\7c\2"+
		"\2\u029d\u029e\7u\2\2\u029e\u029f\7e\2\2\u029f\u02a0\7g\2\2\u02a0\u02a1"+
		"\7p\2\2\u02a1\u02a2\7f\2\2\u02a2\u02a3\7k\2\2\u02a3\u02a4\7p\2\2\u02a4"+
		"\u02a5\7i\2\2\u02a5\u009c\3\2\2\2\u02a6\u02a7\7f\2\2\u02a7\u02a8\7g\2"+
		"\2\u02a8\u02a9\7u\2\2\u02a9\u02aa\7e\2\2\u02aa\u02ab\7g\2\2\u02ab\u02ac"+
		"\7p\2\2\u02ac\u02ad\7f\2\2\u02ad\u02ae\7k\2\2\u02ae\u02af\7p\2\2\u02af"+
		"\u02b0\7i\2\2\u02b0\u009e\3\2\2\2\u02b1\u02b2\7u\2\2\u02b2\u02b3\7q\2"+
		"\2\u02b3\u02b4\7o\2\2\u02b4\u02b5\7g\2\2\u02b5\u00a0\3\2\2\2\u02b6\u02b7"+
		"\7g\2\2\u02b7\u02b8\7x\2\2\u02b8\u02b9\7g\2\2\u02b9\u02ba\7t\2\2\u02ba"+
		"\u02bb\7{\2\2\u02bb\u00a2\3\2\2\2\u02bc\u02bd\7u\2\2\u02bd\u02be\7c\2"+
		"\2\u02be\u02bf\7v\2\2\u02bf\u02c0\7k\2\2\u02c0\u02c1\7u\2\2\u02c1\u02c2"+
		"\7h\2\2\u02c2\u02c3\7k\2\2\u02c3\u02c4\7g\2\2\u02c4\u02c5\7u\2\2\u02c5"+
		"\u00a4\3\2\2\2\u02c6\u02c7\7e\2\2\u02c7\u02c8\7q\2\2\u02c8\u02c9\7n\2"+
		"\2\u02c9\u02ca\7n\2\2\u02ca\u02cb\7c\2\2\u02cb\u02cc\7v\2\2\u02cc\u02cd"+
		"\7k\2\2\u02cd\u02ce\7q\2\2\u02ce\u02cf\7p\2\2\u02cf\u00a6\3\2\2\2\u02d0"+
		"\u02d1\7i\2\2\u02d1\u02d2\7t\2\2\u02d2\u02d3\7g\2\2\u02d3\u02d4\7c\2\2"+
		"\u02d4\u02d5\7v\2\2\u02d5\u02d6\7g\2\2\u02d6\u02d7\7u\2\2\u02d7\u02d8"+
		"\7v\2\2\u02d8\u00a8\3\2\2\2\u02d9\u02da\7n\2\2\u02da\u02db\7g\2\2\u02db"+
		"\u02dc\7c\2\2\u02dc\u02dd\7u\2\2\u02dd\u02de\7v\2\2\u02de\u00aa\3\2\2"+
		"\2\u02df\u02e0\7u\2\2\u02e0\u02e1\7y\2\2\u02e1\u02e2\7k\2\2\u02e2\u02e3"+
		"\7v\2\2\u02e3\u02e4\7e\2\2\u02e4\u02e5\7j\2\2\u02e5\u00ac\3\2\2\2\u02e6"+
		"\u02e7\7e\2\2\u02e7\u02e8\7c\2\2\u02e8\u02e9\7u\2\2\u02e9\u02ea\7g\2\2"+
		"\u02ea\u00ae\3\2\2\2\u02eb\u02ec\7v\2\2\u02ec\u02ed\7t\2\2\u02ed\u02ee"+
		"\7{\2\2\u02ee\u00b0\3\2\2\2\u02ef\u02f0\7e\2\2\u02f0\u02f1\7c\2\2\u02f1"+
		"\u02f2\7v\2\2\u02f2\u02f3\7e\2\2\u02f3\u02f4\7j\2\2\u02f4\u00b2\3\2\2"+
		"\2\u02f5\u02f6\7f\2\2\u02f6\u02f7\7g\2\2\u02f7\u02f8\7h\2\2\u02f8\u02f9"+
		"\7c\2\2\u02f9\u02fa\7w\2\2\u02fa\u02fb\7n\2\2\u02fb\u02fc\7v\2\2\u02fc"+
		"\u00b4\3\2\2\2\u02fd\u02fe\7v\2\2\u02fe\u02ff\7j\2\2\u02ff\u0300\7g\2"+
		"\2\u0300\u0301\7p\2\2\u0301\u00b6\3\2\2\2\u0302\u0303\7g\2\2\u0303\u0304"+
		"\7n\2\2\u0304\u0305\7u\2\2\u0305\u0306\7g\2\2\u0306\u00b8\3\2\2\2\u0307"+
		"\u0308\7v\2\2\u0308\u0309\7{\2\2\u0309\u030a\7r\2\2\u030a\u030b\7g\2\2"+
		"\u030b\u030c\7u\2\2\u030c\u030d\7y\2\2\u030d\u030e\7k\2\2\u030e\u030f"+
		"\7v\2\2\u030f\u0310\7e\2\2\u0310\u0311\7j\2\2\u0311\u00ba\3\2\2\2\u0312"+
		"\u0313\7q\2\2\u0313\u0314\7t\2\2\u0314\u00bc\3\2\2\2\u0315\u0316\7c\2"+
		"\2\u0316\u0317\7p\2\2\u0317\u0318\7f\2\2\u0318\u00be\3\2\2\2\u0319\u031a"+
		"\7p\2\2\u031a\u031b\7q\2\2\u031b\u031c\7v\2\2\u031c\u00c0\3\2\2\2\u031d"+
		"\u031e\7v\2\2\u031e\u031f\7q\2\2\u031f\u00c2\3\2\2\2\u0320\u0321\7k\2"+
		"\2\u0321\u0322\7p\2\2\u0322\u0323\7u\2\2\u0323\u0324\7v\2\2\u0324\u0325"+
		"\7c\2\2\u0325\u0326\7p\2\2\u0326\u0327\7e\2\2\u0327\u0328\7g\2\2\u0328"+
		"\u00c4\3\2\2\2\u0329\u032a\7q\2\2\u032a\u032b\7h\2\2\u032b\u00c6\3\2\2"+
		"\2\u032c\u032d\7u\2\2\u032d\u032e\7v\2\2\u032e\u032f\7c\2\2\u032f\u0330"+
		"\7v\2\2\u0330\u0331\7k\2\2\u0331\u0332\7e\2\2\u0332\u0333\7c\2\2\u0333"+
		"\u0334\7n\2\2\u0334\u0335\7n\2\2\u0335\u0336\7{\2\2\u0336\u00c8\3\2\2"+
		"\2\u0337\u0338\7k\2\2\u0338\u0339\7u\2\2\u0339\u00ca\3\2\2\2\u033a\u033b"+
		"\7v\2\2\u033b\u033c\7t\2\2\u033c\u033d\7g\2\2\u033d\u033e\7c\2\2\u033e"+
		"\u033f\7v\2\2\u033f\u00cc\3\2\2\2\u0340\u0341\7e\2\2\u0341\u0342\7c\2"+
		"\2\u0342\u0343\7u\2\2\u0343\u0344\7v\2\2\u0344\u00ce\3\2\2\2\u0345\u0346"+
		"\7e\2\2\u0346\u0347\7c\2\2\u0347\u0348\7u\2\2\u0348\u0349\7v\2\2\u0349"+
		"\u034a\7c\2\2\u034a\u034b\7d\2\2\u034b\u034c\7n\2\2\u034c\u034d\7g\2\2"+
		"\u034d\u00d0\3\2\2\2\u034e\u034f\7x\2\2\u034f\u0350\7g\2\2\u0350\u0351"+
		"\7t\2\2\u0351\u0352\7u\2\2\u0352\u0353\7k\2\2\u0353\u0354\7q\2\2\u0354"+
		"\u0355\7p\2\2\u0355\u00d2\3\2\2\2\u0356\u0357\7l\2\2\u0357\u0358\7u\2"+
		"\2\u0358\u0359\7q\2\2\u0359\u035a\7p\2\2\u035a\u035b\7k\2\2\u035b\u035c"+
		"\7s\2\2\u035c\u00d4\3\2\2\2\u035d\u035e\7w\2\2\u035e\u035f\7p\2\2\u035f"+
		"\u0360\7q\2\2\u0360\u0361\7t\2\2\u0361\u0362\7f\2\2\u0362\u0363\7g\2\2"+
		"\u0363\u0364\7t\2\2\u0364\u0365\7g\2\2\u0365\u0366\7f\2\2\u0366\u00d6"+
		"\3\2\2\2\u0367\u0368\7v\2\2\u0368\u0369\7t\2\2\u0369\u036a\7w\2\2\u036a"+
		"\u036b\7g\2\2\u036b\u00d8\3\2\2\2\u036c\u036d\7h\2\2\u036d\u036e\7c\2"+
		"\2\u036e\u036f\7n\2\2\u036f\u0370\7u\2\2\u0370\u0371\7g\2\2\u0371\u00da"+
		"\3\2\2\2\u0372\u0373\7v\2\2\u0373\u0374\7{\2\2\u0374\u0375\7r\2\2\u0375"+
		"\u0376\7g\2\2\u0376\u00dc\3\2\2\2\u0377\u0378\7f\2\2\u0378\u0379\7g\2"+
		"\2\u0379\u037a\7e\2\2\u037a\u037b\7n\2\2\u037b\u037c\7c\2\2\u037c\u037d"+
		"\7t\2\2\u037d\u037e\7g\2\2\u037e\u00de\3\2\2\2\u037f\u0380\7e\2\2\u0380"+
		"\u0381\7q\2\2\u0381\u0382\7p\2\2\u0382\u0383\7v\2\2\u0383\u0384\7g\2\2"+
		"\u0384\u0385\7z\2\2\u0385\u0386\7v\2\2\u0386\u00e0\3\2\2\2\u0387\u0388"+
		"\7k\2\2\u0388\u0389\7v\2\2\u0389\u038a\7g\2\2\u038a\u038b\7o\2\2\u038b"+
		"\u00e2\3\2\2\2\u038c\u038d\7x\2\2\u038d\u038e\7c\2\2\u038e\u038f\7t\2"+
		"\2\u038f\u0390\7k\2\2\u0390\u0391\7c\2\2\u0391\u0392\7d\2\2\u0392\u0393"+
		"\7n\2\2\u0393\u0394\7g\2\2\u0394\u00e4\3\2\2\2\u0395\u039a\7$\2\2\u0396"+
		"\u0399\5\u00e7t\2\u0397\u0399\n\2\2\2\u0398\u0396\3\2\2\2\u0398\u0397"+
		"\3\2\2\2\u0399\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b"+
		"\u039d\3\2\2\2\u039c\u039a\3\2\2\2\u039d\u039e\7$\2\2\u039e\u00e6\3\2"+
		"\2\2\u039f\u03a2\7^\2\2\u03a0\u03a3\t\3\2\2\u03a1\u03a3\5\u00e9u\2\u03a2"+
		"\u03a0\3\2\2\2\u03a2\u03a1\3\2\2\2\u03a3\u00e8\3\2\2\2\u03a4\u03a5\7w"+
		"\2\2\u03a5\u03a6\5\u00ebv\2\u03a6\u03a7\5\u00ebv\2\u03a7\u03a8\5\u00eb"+
		"v\2\u03a8\u03a9\5\u00ebv\2\u03a9\u00ea\3\2\2\2\u03aa\u03ab\t\4\2\2\u03ab"+
		"\u00ec\3\2\2\2\u03ac\u03ad\7A\2\2\u03ad\u00ee\3\2\2\2\u03ae\u03af\7p\2"+
		"\2\u03af\u03b0\7w\2\2\u03b0\u03b1\7n\2\2\u03b1\u03b2\7n\2\2\u03b2\u00f0"+
		"\3\2\2\2\u03b3\u03b4\5\u00f3z\2\u03b4\u00f2\3\2\2\2\u03b5\u03b9\5\u00f5"+
		"{\2\u03b6\u03b9\5\u00f7|\2\u03b7\u03b9\5\u00f9}\2\u03b8\u03b5\3\2\2\2"+
		"\u03b8\u03b6\3\2\2\2\u03b8\u03b7\3\2\2\2\u03b9\u00f4\3\2\2\2\u03ba\u03bb"+
		"\5\u00fb~\2\u03bb\u00f6\3\2\2\2\u03bc\u03bd\7\60\2\2\u03bd\u03c7\5\u00fb"+
		"~\2\u03be\u03bf\5\u00fb~\2\u03bf\u03c3\7\60\2\2\u03c0\u03c2\t\5\2\2\u03c1"+
		"\u03c0\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4\3\2"+
		"\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03bc\3\2\2\2\u03c6"+
		"\u03be\3\2\2\2\u03c7\u00f8\3\2\2\2\u03c8\u03c9\7\60\2\2\u03c9\u03d5\5"+
		"\u00fb~\2\u03ca\u03d2\5\u00fb~\2\u03cb\u03cf\7\60\2\2\u03cc\u03ce\t\5"+
		"\2\2\u03cd\u03cc\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03cb\3\2"+
		"\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03c8\3\2\2\2\u03d4"+
		"\u03ca\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d8\t\6\2\2\u03d7\u03d9\t\7"+
		"\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03db\5\u00fb~\2\u03db\u00fa\3\2\2\2\u03dc\u03de\t\5\2\2\u03dd\u03dc"+
		"\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0"+
		"\u00fc\3\2\2\2\u03e1\u03e2\t\b\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\b\177"+
		"\2\2\u03e4\u00fe\3\2\2\2\u03e5\u03e9\5\u0101\u0081\2\u03e6\u03e8\5\u0103"+
		"\u0082\2\u03e7\u03e6\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea\u0100\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ee\t\t"+
		"\2\2\u03ed\u03ec\3\2\2\2\u03ee\u0102\3\2\2\2\u03ef\u03f2\5\u0101\u0081"+
		"\2\u03f0\u03f2\t\n\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f0\3\2\2\2\u03f2\u0104"+
		"\3\2\2\2\u03f3\u03f4\7*\2\2\u03f4\u03fd\7<\2\2\u03f5\u03fc\5\u0105\u0083"+
		"\2\u03f6\u03f7\7*\2\2\u03f7\u03fc\n\13\2\2\u03f8\u03f9\7<\2\2\u03f9\u03fc"+
		"\n\f\2\2\u03fa\u03fc\n\r\2\2\u03fb\u03f5\3\2\2\2\u03fb\u03f6\3\2\2\2\u03fb"+
		"\u03f8\3\2\2\2\u03fb\u03fa\3\2\2\2\u03fc\u03ff\3\2\2\2\u03fd\u03fb\3\2"+
		"\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u0400"+
		"\u0402\7<\2\2\u0401\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0401\3\2"+
		"\2\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\7+\2\2\u0406"+
		"\u0407\3\2\2\2\u0407\u0408\b\u0083\2\2\u0408\u0106\3\2\2\2\u0409\u040a"+
		"\n\16\2\2\u040a\u0108\3\2\2\2\24\2\u0398\u039a\u03a2\u03b8\u03c3\u03c6"+
		"\u03cf\u03d2\u03d4\u03d8\u03df\u03e9\u03ed\u03f1\u03fb\u03fd\u0403\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
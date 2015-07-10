package org.trimatek.deep.lexer;

// Generated from Java.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, NOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASSIGN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=100, AT=101, ELLIPSIS=102, WS=103, COMMENT=104, LINE_COMMENT=105;
	public static final String[] tokenNames = {
		"<INVALID>", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", 
		"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
		"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_genericMethodDeclaration = 22, RULE_constructorDeclaration = 23, 
		RULE_genericConstructorDeclaration = 24, RULE_fieldDeclaration = 25, RULE_interfaceBodyDeclaration = 26, 
		RULE_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_genericInterfaceMethodDeclaration = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_variableInitializer = 35, RULE_arrayInitializer = 36, RULE_enumConstantName = 37, 
		RULE_type = 38, RULE_classOrInterfaceType = 39, RULE_primitiveType = 40, 
		RULE_typeArguments = 41, RULE_typeArgument = 42, RULE_qualifiedNameList = 43, 
		RULE_formalParameters = 44, RULE_formalParameterList = 45, RULE_formalParameter = 46, 
		RULE_lastFormalParameter = 47, RULE_methodBody = 48, RULE_constructorBody = 49, 
		RULE_qualifiedName = 50, RULE_literal = 51, RULE_annotation = 52, RULE_annotationName = 53, 
		RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementValueArrayInitializer = 57, RULE_annotationTypeDeclaration = 58, 
		RULE_annotationTypeBody = 59, RULE_annotationTypeElementDeclaration = 60, 
		RULE_annotationTypeElementRest = 61, RULE_annotationMethodOrConstantRest = 62, 
		RULE_annotationMethodRest = 63, RULE_annotationConstantRest = 64, RULE_defaultValue = 65, 
		RULE_block = 66, RULE_blockStatement = 67, RULE_localVariableDeclarationStatement = 68, 
		RULE_localVariableDeclaration = 69, RULE_statement = 70, RULE_catchClause = 71, 
		RULE_catchType = 72, RULE_finallyBlock = 73, RULE_resourceSpecification = 74, 
		RULE_resources = 75, RULE_resource = 76, RULE_switchBlockStatementGroup = 77, 
		RULE_switchLabel = 78, RULE_forControl = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		RULE_forUpdate = 82, RULE_parExpression = 83, RULE_expressionList = 84, 
		RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expression = 87, 
		RULE_primary = 88, RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91, 
		RULE_arrayCreatorRest = 92, RULE_classCreatorRest = 93, RULE_explicitGenericInvocation = 94, 
		RULE_nonWildcardTypeArguments = 95, RULE_typeArgumentsOrDiamond = 96, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 97, RULE_superSuffix = 98, RULE_explicitGenericInvocationSuffix = 99, 
		RULE_arguments = 100;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "genericMethodDeclaration", "constructorDeclaration", 
		"genericConstructorDeclaration", "fieldDeclaration", "interfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", "constantDeclarator", 
		"interfaceMethodDeclaration", "genericInterfaceMethodDeclaration", "variableDeclarators", 
		"variableDeclarator", "variableDeclaratorId", "variableInitializer", "arrayInitializer", 
		"enumConstantName", "type", "classOrInterfaceType", "primitiveType", "typeArguments", 
		"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
		"formalParameter", "lastFormalParameter", "methodBody", "constructorBody", 
		"qualifiedName", "literal", "annotation", "annotationName", "elementValuePairs", 
		"elementValuePair", "elementValue", "elementValueArrayInitializer", "annotationTypeDeclaration", 
		"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
		"annotationMethodOrConstantRest", "annotationMethodRest", "annotationConstantRest", 
		"defaultValue", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"parExpression", "expressionList", "statementExpression", "constantExpression", 
		"expression", "primary", "creator", "createdName", "innerCreator", "arrayCreatorRest", 
		"classCreatorRest", "explicitGenericInvocation", "nonWildcardTypeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
		"explicitGenericInvocationSuffix", "arguments"
	};

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(JavaParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(202); packageDeclaration();
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(205); importDeclaration();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(211); typeDeclaration();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217); match(EOF);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(219); annotation();
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225); match(PACKAGE);
			setState(226); qualifiedName();
			setState(227); match(SEMI);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(IMPORT);
			setState(231);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230); match(STATIC);
				}
			}

			setState(233); qualifiedName();
			setState(236);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(234); match(DOT);
				setState(235); match(MUL);
				}
			}

			setState(238); match(SEMI);
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

	public static class TypeDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			int _alt;
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(240); classOrInterfaceModifier();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(246); classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(247); classOrInterfaceModifier();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253); enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(254); classOrInterfaceModifier();
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260); interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(261); classOrInterfaceModifier();
						}
						} 
					}
					setState(266);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(267); annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268); match(SEMI);
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

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			setState(273);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(271); classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			setState(277);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); annotation();
				}
				break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			setState(281);
			switch (_input.LA(1)) {
			case FINAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); annotation();
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283); match(CLASS);
			setState(284); match(Identifier);
			setState(286);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(285); typeParameters();
				}
			}

			setState(290);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(288); match(EXTENDS);
				setState(289); type();
				}
			}

			setState(294);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(292); match(IMPLEMENTS);
				setState(293); typeList();
				}
			}

			setState(296); classBody();
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

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); match(LT);
			setState(299); typeParameter();
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(300); match(COMMA);
				setState(301); typeParameter();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307); match(GT);
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

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(Identifier);
			setState(312);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(310); match(EXTENDS);
				setState(311); typeBound();
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

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314); type();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(315); match(BITAND);
				setState(316); type();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(JavaParser.ENUM, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(ENUM);
			setState(323); match(Identifier);
			setState(326);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(324); match(IMPLEMENTS);
				setState(325); typeList();
				}
			}

			setState(328); match(LBRACE);
			setState(330);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(329); enumConstants();
				}
			}

			setState(333);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(332); match(COMMA);
				}
			}

			setState(336);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(335); enumBodyDeclarations();
				}
			}

			setState(338); match(RBRACE);
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

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340); enumConstant();
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341); match(COMMA);
					setState(342); enumConstant();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class EnumConstantContext extends ParserRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(348); annotation();
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354); match(Identifier);
			setState(356);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(355); arguments();
				}
			}

			setState(359);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(358); classBody();
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

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(SEMI);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(362); classBodyDeclaration();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(INTERFACE);
			setState(369); match(Identifier);
			setState(371);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(370); typeParameters();
				}
			}

			setState(375);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(373); match(EXTENDS);
				setState(374); typeList();
				}
			}

			setState(377); interfaceBody();
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

	public static class TypeListContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); type();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(380); match(COMMA);
				setState(381); type();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387); match(LBRACE);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(388); classBodyDeclaration();
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394); match(RBRACE);
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

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396); match(LBRACE);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(397); interfaceBodyDeclaration();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403); match(RBRACE);
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

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(417);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405); match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(406); match(STATIC);
					}
				}

				setState(409); block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(410); modifier();
						}
						} 
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(416); memberDeclaration();
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419); methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420); genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421); fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(422); constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423); genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(424); interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(425); annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(426); classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(427); enumDeclaration();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(430); type();
				}
				break;
			case VOID:
				{
				setState(431); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(434); match(Identifier);
			setState(435); formalParameters();
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(436); match(LBRACK);
				setState(437); match(RBRACK);
				}
				}
				setState(442);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(443); match(THROWS);
				setState(444); qualifiedNameList();
				}
			}

			setState(449);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(447); methodBody();
				}
				break;
			case SEMI:
				{
				setState(448); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); typeParameters();
			setState(452); methodDeclaration();
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

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); match(Identifier);
			setState(455); formalParameters();
			setState(458);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(456); match(THROWS);
				setState(457); qualifiedNameList();
				}
			}

			setState(460); constructorBody();
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

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(462); typeParameters();
			setState(463); constructorDeclaration();
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); type();
			setState(466); variableDeclarators();
			setState(467); match(SEMI);
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

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_interfaceBodyDeclaration);
		try {
			int _alt;
			setState(477);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case CLASS:
			case DOUBLE:
			case ENUM:
			case FINAL:
			case FLOAT:
			case INT:
			case INTERFACE:
			case LONG:
			case NATIVE:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			case STRICTFP:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOID:
			case VOLATILE:
			case LT:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(469); modifier();
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(475); interfaceMemberDeclaration();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(476); match(SEMI);
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

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_interfaceMemberDeclaration);
		try {
			setState(486);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(479); constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480); interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481); genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482); interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(483); annotationTypeDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(484); classDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(485); enumDeclaration();
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

	public static class ConstDeclarationContext extends ParserRuleContext {
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); type();
			setState(489); constantDeclarator();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(490); match(COMMA);
				setState(491); constantDeclarator();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497); match(SEMI);
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

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); match(Identifier);
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(500); match(LBRACK);
				setState(501); match(RBRACK);
				}
				}
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(507); match(ASSIGN);
			setState(508); variableInitializer();
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

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				{
				setState(510); type();
				}
				break;
			case VOID:
				{
				setState(511); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(514); match(Identifier);
			setState(515); formalParameters();
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(516); match(LBRACK);
				setState(517); match(RBRACK);
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(525);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(523); match(THROWS);
				setState(524); qualifiedNameList();
				}
			}

			setState(527); match(SEMI);
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

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); typeParameters();
			setState(530); interfaceMethodDeclaration();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532); variableDeclarator();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(533); match(COMMA);
				setState(534); variableDeclarator();
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); variableDeclaratorId();
			setState(543);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(541); match(ASSIGN);
				setState(542); variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545); match(Identifier);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(546); match(LBRACK);
				setState(547); match(RBRACK);
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableInitializer);
		try {
			setState(555);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(553); arrayInitializer();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LT:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(554); expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(557); match(LBRACE);
			setState(569);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (BANG - 68)) | (1L << (TILDE - 68)) | (1L << (INC - 68)) | (1L << (DEC - 68)) | (1L << (ADD - 68)) | (1L << (SUB - 68)) | (1L << (Identifier - 68)))) != 0)) {
				{
				setState(558); variableInitializer();
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(559); match(COMMA);
						setState(560); variableInitializer();
						}
						} 
					}
					setState(565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				setState(567);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(566); match(COMMA);
					}
				}

				}
			}

			setState(571); match(RBRACE);
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

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573); match(Identifier);
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
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_type);
		try {
			int _alt;
			setState(591);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(575); classOrInterfaceType();
				setState(580);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(576); match(LBRACK);
						setState(577); match(RBRACK);
						}
						} 
					}
					setState(582);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(583); primitiveType();
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(584); match(LBRACK);
						setState(585); match(RBRACK);
						}
						} 
					}
					setState(590);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
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

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public TerminalNode Identifier(int i) {
			return getToken(JavaParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(JavaParser.Identifier); }
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593); match(Identifier);
			setState(595);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(594); typeArguments();
				}
				break;
			}
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(597); match(DOT);
					setState(598); match(Identifier);
					setState(600);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(599); typeArguments();
						}
						break;
					}
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(LT);
			setState(610); typeArgument();
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(611); match(COMMA);
				setState(612); typeArgument();
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(618); match(GT);
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

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_typeArgument);
		int _la;
		try {
			setState(626);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(620); type();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(621); match(QUESTION);
				setState(624);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(622);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(623); type();
					}
				}

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

	public static class QualifiedNameListContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628); qualifiedName();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(629); match(COMMA);
				setState(630); qualifiedName();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636); match(LPAREN);
			setState(638);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(637); formalParameterList();
				}
			}

			setState(640); match(RPAREN);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(655);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642); formalParameter();
				setState(647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				while ( _alt!=2 && _packaorg.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
	R 4.if (rg.tr==1y ANTLR 4.4	tlr.v4.runtime.atnsetState(643); match(COMMA);*;
import org.antl4); formalParameter(a.DFA;
im}ort org.a TLR 4.4antlr.v4rt org.antl9a.DFA;
i_errHandler.sync(thisntlr.v4.rualt = getInterpr*;
im.adaptivePredict(_input,69,_ctxa.DFA;
antlr.vrt org.ant52a.DFA;
_la = port j.LA(1a.DFA;

im_la==me.dfaANTLR 4.4NTLR 4.4@SuppressWa0.v4.runtime.dfa.DFA;
i@SuppressWa1); lastF4.runtime.*;
import organtlr.v}
rrayList;

break.DFA;case 2:TLR 4.emporOuterAlt(_localctx, rnings({"NTLR 4.@SuppressWatlr.imeMetaData.checkVersion("4.ta.VERSION); }

antlrantlrcrunt (RecognitionExceptCac re, "cast"[] _decis.ee();
	pu= re.DFA;untime.tree.reportErrorimpor,ubli1, ASSERT=2, BOOLEANcoveK=4, BYTE=5, CASantlrfinallyANTLR 4exitRuleimport antlrreturn [] _decis.DFAimeMetpublic static class etaData.checkVeContext extends ParserDEFAALLY=19,NTLR 	ENUM=1List<VariableModifiINALLY=19> vMENTS=24, IMPOR(, "cast"3, DOUBge DEFAALLY=19s(EMENTS=24, IMPORT=25, I.NDS=1LT=12, DO=1	ENUM=1EMENTS=24, IMPORT=25, ISTANCEOF=26, INT=2int i7, INTERFACE=28, LONG=29, 
	NATIVE=30, NEW=31, PACKAGE=32,,i PRIVATE=33, PROTETyp, IF=22, type27, INTERFACE=28, LONG=29, 
	(=44, THROWSZED=42,0 PRIVATE=33, PROTECTED=34,DeclaratorId35, RETURN=36,  FloatingPoiTRANSIENT=46, TRY=47, VOID=48, eral=51, FloatingPointLiter, 
		WHILE=50, IntegerLit, FINAL=18, FINALLY=19(0, FOR=21, IF=22, parent, 37, Snvokingorg.a, "cast"super(RACK=62, S63, COMMA=64T=12, DO=1@Override 	ENUM=137, , LONG=Index27,  3, DOUBRULE_v4.runtime.*;
; ANG=69, TILDE=E=33, PROTEvoid atic DEFAU0, FOTree	IMPener lUB=82, , "cast"
imp
		MUL=8 instanceof JavaSUB=82, ) ((ARET=87, MOD)
		MUL=83.atic etaData.checkVermport javaEQUAL=76, AND=77, OR=78, INC=791, DEFAU ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_AxiMetaData.checkVer=91, DIV_ASSIG5, 
		ENUM=1=10, 7, FINAL=18, FINALLY=19,v4.runtime.*;
im throws nContextCache();
	puNTLR , FINAL=18, FINALLY=19,[] _decis = new8, 
		LBRACE=59, RBRACEutil,N=71org.an)=68, B9, DEC=80,[] _decisio92,, 
		LE=74, GE=75, N=68, B37, _la.DFA;trONTINUE=1tic final DFA[] _decisio, "unche DOT=65t org.ant6HILE=50runtime.tree.*;
import java.all", "warnings", "unchewhiled", "unFINAL ||'def==AT, "cast"}'", "'instance@SuppressWa7);STANCEOF=26, INT=27che _sharedConst;

@SuppressW6rnings({"antime.tree.*;
import java.uall", "warnings", "uncheantlr.extends'", r.v445, TR.DFA;extends'", tlr.l=52, BooleanLiteral=5ache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17LmeMetaData.checkVeALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, "'}'", "'['", "']'", "';E=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		imeMetaData.checkVeOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIG, "'}'", "'['", "']N=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier= 15, RULE_typeList = 16, RULE_cla=103, COMMENT=104, , "'}'", "'['", "']'", "';'imeMetaData.checkVersString[] tokenNames = {
		"<INVAL, "'}'", "'['", "']'", "';'ssert'", "'boole3, RULE_modifier = 4, RULE_'", 
		"'case'", "'catch'", "'char'", "'cla4s'", "'imeMetaData.checkVeinue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'", antlr.v4", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
		"'int'"66"'interface'", "'long'", "'native'", "'new'", "'pack7, "unchecrivate'", 
		"'protected'", "'public'", "'return'", "'short'", "'sta72c'", "'strictfp'", 
		"'7r.v4.runtiELLIPSISType = 40, 
		RULuper'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'"MethodBodyALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
	BlockALLY=19,bValuTRANSIENT=46, TRY=47, VOID=48, tValuePairs , 
		WHILE=50, IntegerLitnotation = 52, RUE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		motation =OTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGnotation =N=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier= 65, 
		RULE_block = 66=103, COMMENT=104, notation = 52, RULtionTypeElaration = 24, RULE_fieldDeclaration notation = 52, RULssert'", "'boolealueArrayInitializ'", 
		"'case'", "'catch'", "'char'", "'cla6s'", "'tionTypeElchroni", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'",7leIn 54, RUache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17Constructoron = 52, RULE_annotationName = 53, 
		RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementV_arrayCreatorRest = 92E=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		carrayCreatorReOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIG_arrayCreatorReN=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifierier", "variableModifier", "cla=103, COMMENT=104, _arrayCreatorRest = 92,ic static finalaration = 24, RULE_fieldDeclaration _arrayCreatorRest = 92,ssert'", "'boolerDiamond = 96, 
		RULE'", 
		"'case'", "'catch'", "'char'", "'cla8s'", "'ic static finalrol = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		RUL8_forUpdate = 82, RULE_parExpression = 83, RULE_expressionList = 84, 
		RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expression = 87, 
		RULE_primary = 88, RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91, 
		RULEQualIMPOdNam, IF=22,  FLOAT=20, FOR=21, IF=22, GOTO=23, 
	Term10, Node IdentSHORT=37, STATIC=38, STRICTFPToken ADD_0, FOR.
		"typeAr,  
		THIS=43, THROW	IMPLArguments", >
		"typeArg, EQUAL=73,meList",s "formalParameters", ")OTEQUAL	ENUM=1me", "type", "classOE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		qe", "type", OTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGme", "type", N=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		IdentifierMethodRest", "annotationCons=103, COMMENT=104, me", "type", "classOrnTypeDeclarataration = 24, RULE_fieldDeclaration me", "type", "classOrssert'", "'boolealifiedName", "litera'", 
		"'case'", "'catch'", "'char'", "'cl100s'", "'nTypeDeclaratrol = 79, RULE_f, "'dalt.DFA;o'", "'double'", "'else'", "'enum'", "'extends'",8Parser extconstructorBon", "primary", 55, CASE=6, CATCH=7,'", 
		"'float'"l.List;
import java.util.Iterator;
import ja74.util.ArrayLto'", "rg.trimge org.trimatek.deep.lexer;

// Generated from Java.g4 by ANTLR 4.
import org.antlr.v4.r"cast"})
public class Jav8Runt.runtiDOTParser {
	static {8primator", "createdName", ".misc.*;
runtime.st;

@SuppressW87umConstantName = 37, 
		RULE_type = 3atorRest", "explicitGenericInvocation", "nonWildcardTypeArguantlr.ed'", "'this'", "'throw'", "'throws'", 
		"'transient'", "'try'", "'void'", "'volatile'", "'while'", "IntegerLiteral", 
		"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'",iteral"classOrInterfaceType", "primitiveType", "typeArguments", Characon =rATNSiFormalParameter", "m "formalPara
	public static , ParsIS=43, THROW=rguments", 
ntegc static class CompilationUnitContext exteclarationContontext {
		public List<ImportDStringstatic class CompilationUnitContext extt.class);
		ontext {
		public List<ImportDFloatingPointstatic class CompilationUnitContext extblic PackageDeclaratontext {
		public List<ImportDBooleanstatic class CompilationUnitContext extxt.class,0);
ontext {
		publicerATNSimulator_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9,rATNSi10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration =tatic c= 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RUL		}
		public CompilaRULE_constructorDeclrATNSimulator(TypeDecaration = 24, RULE_fieldDeclaration =rATNSimulator(laration = 26, 

			return genhancedForControl", "forUpdate", 
		"parExprss'", "'TypeDecinue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'",88'float'", "'for'", "'if'", "'go
imp!(((", ") & ~0x3f) == 0e or((1L <<'defner)ompilatieclarationCont) | mpilatiblic PackageDeclaratblic final xt.class,0);
blic final 
	public static blic final t.class);
		blic final NullContext )) != 0))y ANTLR 4=6, CATCH=7, CHAR=8Inlin "annotationuleNameic suourcache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17Anno, EXonALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
	ElementValu "classOrIa = _input.TRANSIENT=46, TRY=47, VOID=48, la = _input.LA(1);, 
		WHILE=50, IntegerLitla = _input.PairsLA(1);
			while (_letStaa==IMPORT) {
				{
				{
				setState(20etState(210), 
		WHILE=50, IntegerLit		}
			see", "classOrac(this);
			TRANSIENT=46, TRY=47, VOID=48, nc(this);
			_la = _e(214);
			_errHandler.sync(this);eturn getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(nput.LA(1)OTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIG		}
			se	public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndexnput.LA(1);
			}
			set=103, COMMENT=104, 		}
			setState(2nput.LA(1)aration = 24, RULE_fieldDeclaration 		}
			setState(2ssert'", "'boole		}
			setState(r ) ((JavaListener)listener).enterCompilationULE_constnput.LA(1)inue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'",9Parser extA;

	@Opublic QualRuntnput.LA(1);
			me", "innerCreat9istener instanceof JavaListener ) (( "'imLPARENrt'", "'instancetext(Qualiflic Stringist<Ann.DFA;
text(Qualifr", "arr	swiictioest", "explicitGenericInvocation", "nonWil5.util.y ANTLR 4.	prot1cted st)
public class Jav9r.v4
				_errHandler.sFileName() { retION); }


	protected st int invokingState) tlr.			while (_la=okingState);
		}
		@Overrist;

@SuppressW9 "'i.runtiRturn getRuleCleNames()pilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(202); packageDeclaration();
				}
				break;
			}
			see", "classOrInterfaceType", "primitiveType", "type
		"resourceSpecification", "resourceNSIENT=46, TRY=47, VOID=48, me", "type", "classOe(214);
			_errHandler.sync(this);
			_la = _M) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != aration", 
		"annotationTypeBody", "annotationTypeElementDeclaration", "annotationTypeElementRest", 
		"annotationMethodOrConstantRest", "annotationr).exitPackage;
			}
			setState(217); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_erlause", "catchType", "finallyBlock", nc(this);
			_la = _input.LA(1);
			w}
		return _localctx;
	}

	public stati", 
		"switchLabel", "forCoctx = new PackageDeclanhancedForControl", "forUpdate", 
		"parExpr= 78, RUnput.LA(1);
	rol = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		R70Parstion", "resourcache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17				}
				setState(210);FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLLA(1);
			}
		T=25, INS
				_errHandle27, INTERFACE=28, LONG=29, 
		Nid enterRule(ParseTreeLGE=32, PRIVATE=33, PROTEid enterRule(ParseTreeLstener listener) {37, STATIC=38, STRICTFP=39, SUPER=4avaListener ) ((JavaListener), 
		THIS=43, THROWLA(1);
			}
			setStatE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		
				_errHandlerOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGLA(1);
			}
				public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex{
			enterOuterAlt(_localctx, 1=103, COMMENT=104, 				}
				setState(210);
				_errHandler.sytring[] tokenNames = {
		"<INVAL				}
				setState(210);ssert'", "'boolevaListener ) ((JavaListennhancedForControl", "forUpdate", 
		"parExprclaratio
				_errHandlerinue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'"70primtener listener) {me", "innerCrea70ride
	p", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implused", "cast"}tationContext> annotati70r.v4.runtime.dfa.DFA;
ss TypeDeclturn RULE_packag);
			_errH4", Runtimends ParserRuleCantlr.v4.rivate'", 
		"'protected'", "'public'", "'return'", "'shorext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { returntState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(205); importDeclaration();
				}
Arguments", 
		"typeArgxt> importDeclaration() {
			reeters", "fotext {
		public i) {
			return getRulner)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDecarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterlt(_localctx, 1);
			{
			setState(229); match(IMPORT);
			setState(231);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230); match(STATIC);
			}
			}

			setState(233); qualifiedName();
		his);
		}
		@Override
input.LA(1);
			if (_la==DOT) {
				{
				setStae(234); match(DOT);
				setState(235); extends ParserRuleContext {
		public AnnotationCont1ession",xt {
		public Iatic class ImportDeclarationContext extends ParserRuleContext {
1"creator", "createdName", "innerCrea71guments"
ASSIG getRuleationContexrtError(this, reNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { retState(208);
			_errHandler.sync(this);
			_la = _input.ArrayIextCaliz']'", "';'"1);
				while ((((_la) & ~a==IMPORT) {
				{
				{
				setState(20ile ((((_la) & ~0x3f) =L << ABSTRACT) | (1L << CLASS) | (1L << ENUxitRule();
		hile ((((_la) & ~0x3f) == 0 && ((1L <<5); importDeclaration();
				}
	xpress	setState(208ifier();a==IMPORT) {
				{
				{
				difier();
					ortDeclaration();
				}
				}
				s) {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOlt(_localctx, 1);
			{
			setState(229); match(IMPORT);
			setState(231);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230); match(STATIC);	}
			}

			setState(233); qualifiedName();LA(1);
			while (_la==put.LA(1);
			if (_la==DOT) {
				{
				see(234); match(DOT);
				setState(23tener ) ((JavaListener)listener).exitTypeDeclaration(ss'", "' 0 && ((1L <rol = 79, RULE_fationContexride
	pntext.cl"warnings", = 0) || 	protBOOLEANcted s ((1L YTE) & ((1L <<CHAR) & ((1L <<DOUBLSTRACT) | (1FLOAT) & ((1L <<IN<< PROTECTEDLONG) & ((1L <<NEW) & ((1L <<SHOR<< PROTECTEDSUPE< FINAL) | (THIS) & ((1L <<VOID< PROTECTED)clarationContPRIVATE) | (lic PackageDeclarat) & ((1L << t.class,0);
TRACT) | (1L	public static ICTFP))) != .class);
		 | (1L << ST new Compi (1L << PUBLst<An (1L << PUBL<< PROTECTEDBAC) | (1L << STILDSTRACT) | (1INC FINAL) | (1EenterOuterAlAD
					setStaSUBcase 4:
					"typeArcted static final DFA[] _decisio, "unchectic class TypeDec1turn 
					}
	"'final'ata.VERSION); }

	prot << PROTtatic final DFA[] _decisionToDFA;
	protected stati715) {
			returng'", "'native'"ION); }

	protLBRACSTRACT)"constantExpression", 
		3getInterpreter().adaptivePleIn 0 && ((1L << _la) & ((1L << Actx);
				while ( _alt!=defaultcted sttringbooleNoVNTS=2Althe();
	prRule(_localctx, ualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { reile ((((_la) & ~0x3f) == 8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la		public void exitRule(ParseTreeListener listen{
			if ( listener instanceof Jaic void enterRuleseTreeListener listen{
			if ( listener instanceof JavaListener JavaListener)listener).enterImportDeclaratiile ((((_la) & ~0x3f) =ner)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		Imporile ((((_la) & ~arationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterO< _la) & ((1L << t(_localctx, 1);
			{
			setState(229); match(IMPORT);
			setState(231);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230); match(STATIC);) ((JavaListener)listener).entesetState(233); qualifiedName();ile ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABput.LA(1);
			if (_la==DOT) {
				{
				seile ((((_la) & ~0x3f) ==match(DOT);
				setState(23getRuleContext(ClassOrIn((JavaListener)listener).exitTypeDeclaration(LE_const 0 && ((1L << _la) & ((1L <<inue'", "'default'", 
		"'dExpression", "constantExpression", 
		"expression", "primary"719) {
			retStat		_errHandler.rec2istener instanceof JavaListener ) ((aListener)listener).exitCompilationUnit(this);
 << _laxt compilatiYTEws RecognitiHARblic final 1L << blic final C1L <blic final IN
			case VOLIC) _localctx =EW		Compilatio STR		Compilatio0) |blic final {
	blic final 	{

			case VOL	}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilLE:
				enst<AnnoE:
				encase AationUnis'",State(2 - 68)ner)listener).exitCompilati
				}
				brt:
				tLT	}
				ic final (		}ption(this);
			}
			ption(this);
			}INCption(this);
			}DE_localctx.exceptionADDption(this);
			}SUBException re) {
				"typeArre;
			_errHandlereption(tationUnitClic static class TypeDec2Pars RULE_packageDeclarateturn _locaotationCoblic String[] getTokenNames() { return tokenNames; }

	@Override
	public Sa.util.ArrayLiments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superS4
import org.antlr.v4.runtime.atn.*;
import org.an72guments"
me.dfa.DFA;
import org.72ontext(_ctx, getState())rg.antlr.v4.runtime.misc.*;
import or72ride
	puruntime.tree.*;
import java.util.List;
import java.util.Iterator;
import ja annotation() {ative'", "'neer) {
	) { return3, "uncheontext.class,0);
		}
		public Lx;
	}

	public staanceof JavaParser extends Parser { listener instanceof Javar.v4.runtiRcase AT:
		ionUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(202); packageDeclaration();
				}
				break;
			}
			se=44, Floatin	setState(208);
			_errHandler.sync(this);
			_faceModifierCoon = 52, RULnput.LA(1)e());
	!= 0) || _la==AT) {
					{
					{
				e());
		enterRetRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInfaceModifierContext _localctx = M) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != erContext _locaState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(219); annotation();
				}
				}
				seterContext _loca;
			}
			setState(217); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_erATE) | (1L << PROTECTED) | (1L
		catch (RecognitionExceptioerContext _localctx = n	enterOuterAlt(_localctx,ption = re;
			_errHandler.reportError(this, erContext _localctx = nrHandler.recover(this, re)nnotation();
				}
		((JavaListener)listener).exitTypeDeclaration(ctx;
	}

	publierContext _locaatic class ImportDeclarationContext extends ParserRuleContext {
3			idNameContext qualifiedNa73leInator", NTERFse AT:
				enterOut3rRule(Parsn {
		TypeDeclarationConte3on",le(_localctx, 10, RUner) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierCoon = 52, RULE_annotationName = 53, 
		RULE_elemen	IMPLis, re);
		}la = _intext _localctx = >ParserRuleContepublic void exitRu27, INTERFACE=28, LONG=29, 
		N	@Override
		public void exitRule(ParsGE=32, PRIVATE=33, PROTE	@Override
		public void exitRule(ParsTreeListener listener) {
			if ( 37, STATIC=38, STRICTFP=39, SUPER=4r ) ((JavaListener)listener).exitVariableModi, 
		THIS=43, THROW
		int _la;
		try {
					break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAltinal String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModif
		int _la;
		trROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			defaultinterfaceDeclaration", "typeList", 
	
		int _la;
		try {
		ule(_localctx, 10, RUL.exception = re;
			_errHandler.reportError(thodDeclaration", "genericMethe());
		enterRule(_localc((JavaListener)listener).exitTypeDeclaration(claratiole(_localctx, 10, (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.rep4Parser ext	case AT:
				enterOutntlr(this, re);
		}
		finally {
			exitRule();
		}
		return _loaListener)listener).exitCompilationUnit(this);
ABSTRAC{
				setSt			break;
			case NATIVE:
			case SYNCHRONIZEDCLAS= _input.LA(:
			case TRANSIENUMblic final Cmentcase TRANSIENT:
			case VOLATILE:
				e(AnnotatioLE:
				enterOuterAlt(_loATIVassDeclaratiPRIVAATIVE:
			caPROTECTE
				if ( !PUBLIClctx, 2);
				{
				setStaTAT invokingStateTRICTFP		CompilatioYNCHRONIZ
			super(parTRANSIEATILE:
				eVOLATI		case TRANSISEMI
				consume( "'imecover(this'", "'import'", "'instanceof'", 
		"'int'74() {
			returr listener) {
			if ( lerfaceDeclarationContext interf46umConstantName = 37, 
		RULE_type = 38, RULE_classOrInterfaceType = 39, RUL74rRule(Parse listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierCofinal VariableModifierContortDeclaration; }
		@Override
		public vo4, IMPORT=25, INSm6, INT=27, INTERFACE=28, LONG=29, 
		N, NEW=31, PACKAGE=32, PRIVATE=33, PROTE);
		enterRule(_locaResaratrContext variableModifier(86);RULE_classOrInterfaceModifier);
		int _la;
State(286);
			_lue = 56, 
		RULE_elementVaPUBLIC=35, RETUctx, 1);37, STATIC=38, STRICTFP=39, SUPER=4H=41, SYNCHRONIZED=42, 
		THIS=43, THROW);
		enterRule(_localctx, 14, RULE_cla			break;
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAltpublic void exitRue(279); match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); annotation();
				}
				break;
			default:stener) {
			if ( OTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			defaulthis, re);
		}
		finally {
			e re);
		}
		finally {
			exitRfinal VariableModifierContext variableModifier() throws Rec;
	}

	public static class ClassDeclarationConfinal VariableModifierCont ParserRuleContext {
		publice();
				}
			}

			senhancedForControl", "forUpdate", 
		"parExp2ession",(JavaListener)listener).enterClaist", "statementExpression", "listener i, "'		while ((((_la) & ~0x3f) == 0 && ((1LTerminal) & ((1L << << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (0); } FINAL) | (1L << PRIVATE) | ) {PRIVATE) | (mentPRIVATE) | (1L << PROTECTED) | (1L << PUB(Annotati (1L << PUBLIC) | (1L << STRuleC) & ((1L <<nt, intf ( listener e) {
	f ( listenernt, iIC) | (1L << STRICTFP))) != ride eParameters(ttRuleI
				{
				urn RULE_cl
				break;on; }
					{
					{	publitState(264);
				_errHandl2 && _alt!=org.antlr.v4.runtime.atn.ATN getInterpreter().adaptivearnings({"alic String[] getTokenNames() { return tokenNames; }

	@Override
	public 83nnotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int inv.antlctx, 1);
	@Override public int getRuleIndex() { return finE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListeneOuterAlt(_localionContext interf5			if ( _alt==LA(1);
			if (_lctx);
				while ( _alt!=2 && rRullt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
	5uleContextrRulerHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(267); annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_l(285); typeParameters();
				}ssDeclaration);
		int _la;
		try {
	imporfacontext _localctx = niass,0);
		}
		pub!= 0) || _la==AT) {
					{
		lass,0);
		}
		public Type(214);
			_errHandler.sync(this);
		catch (RecognitionException re) {
			_localctxnException {
		VariableModifierContext _l) {
			super(parent, invokingState);
		}
		@OverridnotatiOfier",a(286);
			_la = _input.stanceof JavaListenerameter; }
		@Override
		public void enstanceof JavaListener ) ((JetRuleContext(EnumDeclarati44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLitEnumntext _localctx = nes);
		}
	}
a==IMPORT) {
				{
				{
				s);
		}
	}

	publ = 95, RULE_typeArgumentsOrDS=1ntext _localctx = nNDS=1nal TypeParameterContext typeParameter() ttext _localctx = new Tynt, invokingState);
		}
		@Override puState(286);
			_letState(294);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(292); match(IMPLEMENTS);
				setState(293); typeList();
				}
			}

		86);96); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, reTypePinally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typePar			_errHandler.recouleContexts(TypeParameterContext.class);86);
			_la = _input.LA(1);
			if (_la i) {
			return getRuleContext(TypeParameterContext.c86);
			_lablic TypeParametersContext(ParserRuleuterAlt(_loc invokingState) {
			super(parent, invokingSss'", "'is);
				_la = _input.LA;
				_la = _input.LA(1);7antlr.v4le ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << S< STRICTFP))) !=;
				_errHandler.sync(this);
				_alt = getInterpreter().adaptive5= _i, "'strictfpParameters; "'favaListener)listener).enterTypePalistener) {
			ifguments"
ception = re;
			_errHandler.Listener ) ((Javg.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
	tic'"eParameterContext(listener) {
			ifotationContext.class);
		}
		public PackageDeclarationCo8text(ParserRuleContext parent, int invokingState7superner).exitTypeBoundion; }
		@Override
		publi				{
						{
						stRule(ParseTree; classOrInterfaceModifier();
						}
						} 
		6 "'iParameterContext(Parselistener) {
			ifantlr.v4.ndContext(_ctx, getState());
		enterRule(_localct6, 20, RULE_typeBound);
		int _la;
		try {
			eon",OuterAlt(_localctx, 1);
			{
			setState(314); type();
			setStateterTypePar"constantExpression", 
		setState(ceModifier(this);enumic final TypeParamlistener) {
			iLE_t5); match(BITAND);
				setState(316); type();
				}
	7, 20, RULE_typeBound);
		int _la;
		try {
			_primOuterAlt(_localctx, 1);
			{
			setState(314); type();
			setState_alt!=org.antlr.v4.runtime.atn.ATNotationCoerrHandler.reportEc(this);
				_la s, re);
			_errHandler.recoverride
	pundContext(_ctx, getState());
		enterRule(_localct8 _localctx;
	}

	public static class EnumDeclaocalctx.exception = re, 1);
			{
			setState(314); type();
			setreportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.Identifier, 0); }
		public TypeBoundContestanceof JavaListener ) ((Jaew ClassOrInterfaceModifierContext(_ctx, getStat JavaListener ) ((JavaListenerr).enterTypeParameter(this);
		}
		@Override
		pub exitRule(ParseTreeListener listener) {
			i}
		@Override ptener ) ((JavaListener)listeTypeParameter(this);
		}
		@Override
		public vostener ) ((JavaListener)listener).enterEnumDeclaratioof JavaListener ) ((JM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != (JavaListener)listene(279); match(FINAL);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); annotation();
				}
				break;
			defa)listener).enterTypeP
			}
			setState(217); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_erte(322); match(ENUM);
			setState( re);
		}
		finally {
			estanceof JavaListener ) ((JavaListener)listener).enterTypePar}
		return _localctx;
	}

	public statistanceof JavaListener ) ((Ja ParserRuleContext {
		pu(JavaListener)listener).exit invokingState) {
			super(parent, invokingSxt annotation(int (JavaListener)listen;
				_la = _input.LA(1);8(this, rntext.class);
		}
		public PackageDeclarationCo90ext(ParserRuleCntext parent,o'", "'double'", "'else'", "'enum	public TypeListCorgume}
		@Override
		publctx);
				while ( _alt!=2 && ected static final DFA[] _decisionToDFA;
	protected stati7blic rRule(ParseTreeListener che _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17erEnumDeclaration(this);
		ler.reportError(this, re);
			_errHanD	_alt nput.LA(1);
		_alt e (_la==IMPORT) {
				{
				{
			eContext(EnumConsta	setState(277);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); aener) {
			if ( tEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctxmDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322NUM);
			setState(323); match(Identifier);
			setState(326);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(324); match(IMPLEMENTS);
				setStateeList();
				}
			}

			setState(328); match(LBRACn(this);
		}
		@Override
		publi_la==Identifier || _la==AT) {
				{
				setStatumConstants();
				}
			}

			setState(3la = _input.LA(1);
			if (_la==COMMA) {
				{
				setSctx;
	}

	publite(345);
(RecognitionException re) {
			_localctx.exception = re;
			_errHandler.repor", String getGrammarFileNa(this, re);uleContexteturn getRule(this, re);rRule(ParseTreeListener(this, re);ion = 31,ntext.class,0);
		}
		public LDEFAULort'", "'instance(this, re);on",tContext.classstener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitPaclic int getRuleIndex() { return RULE_enumDeclaration; }
	eral=51, FloatingPate(210);l=52, BooleanLiterr.sync(this);
				_la = _input.ends ParserRuleContext {
L << ABSTRACT) | (1L << CLASS) | (1L <<er)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _lo new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setSta match(ENUM);
			setState(323); match(Identifier);
			setState(326);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(324); match(IMPLEMENTS);
				se25); typeList();
				}
			}

			setState(328); matchic ClassBodyContext		_errHandler.recover(thilt;
			enterOuterAlt(_localctx, 1);
			{
329); enumConstants();
				}
			}

			setS);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setSuleContext(TypePar				}
			}

			setState(3ED:
			case PUBLIC:
			case STATIC:
			case STe() {	public AnnotationConner) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrIntereContext(EnumConstan08);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(205); importDeclaration();
				}
eContext(EnumConstaE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		tContext.claOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGeContext(Enu;
			setState(323); match(Identifier);
			setState(326);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(324); match(IMPLEMENTS (_la==LBRACE) {
				{
		=103, COMMENT=104, eContext(EnumConstantContext.class,tring[] tokenNames = {
		"<INVALeContext(EnumConstanssert'", "'boole annotation();
				nhancedForControl", "forUpdate", 
		"parExp3ession",tContext.cla {
			if ( listener instanceof JavaListener ) ((JavaListener)listr.v4.runti		setSta{
			return geteturn RULE_packageDeclara;
				}
				setState(267); annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_ltValuePairs =ortDeclaration; }
		@Override
		public votValuorg.a= _ile(ParseT 54, mBodyDecl27, INTERFACE=28, LONG=29, 
		NE_enumBodyDeclarationGE=32, PRIVATE=33, PROTEE_enumBodyDeclaration; }
		@Override37, STATIC=38, STRICTFP=39, SUPER=4TreeListener listener) {
	, 
		THIS=43, THROWtValuePairs E=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		 54, OTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGtValu;
			setState(323); match(Identifier);
			setState(326);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(324); match(IMPLEMENTSrationsContext(_ctx,=103, COMMENT=104, tValuePairs = 54, RULtring[] tokenNames = {
		"<INVALtValuePairs =ssert'", "'booleRule(ParseTretext extends ParserRuleContext {
		public Clss'", "' 54, (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.rep9{
					{
case AT:
				enterOu8		pu
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode IdentiASSE	{
				setSt			break;
			case REAK{ return getToken(JavaParser.Identifier, 0); }
		public CONTINUassDeclaratiDO
		public TypeContext type() {
			return getRuleContext(TypeContext.classFO272);
				_IFntext.class,0);
		}
		public ClassDeclarationContext(Parsercalctx, 2);
nt, int invokingState) {
			super(parent, invokingStatRETURine(this);
e);
		}
		@Override public int getRuleIndex() { rette(272);
				_SWITCHndex() { return RULE_classDeclaratia = _input.LA(THROalctx, 2);
TRY _input.LA(1);
				if ( !WHblic void ente((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
 void enterRule(ParseTreeLi);
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
		r
				_errHandlererRul }
		@OverrideerfaceDeclarationContext inter8ortEConstantName = 37, 
		RULE_type = 38, RULE_classOrInterfaceType = 39, RUL8larationConavaListener ) ((JavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState()stanceof JavaListener ler.reportError(this, re);
			_errHaneof JavaListener 6, Eerride
		public void enterRule(Par(is);
		}
		@Overrider listener) {
			if ( ntext _localctx = n45, nal TypeParameterContext typeParameter() tterRule(ParseTreeListener listener) {
			if ( lL _deeral=51, Floatinioneof JavaListener ] _deaceDeclarationContext interframeter; }
		@Override
		publnterfaceDeclarationContext interfaceDecler listener) {
			if ( liE_enumBodyDeclarationeeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public fmBodyDeclinal EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclaratioionExceptisContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(te(375);
			_la = _inpuI);
			setState(365);
eof JavaListener ) ((JavaListene.sync(this);
			_la = _input.LA(1);
		eof JavaListener (((_la) & ~0x3f) == 0	enterRule(_localtext extends ParserRuleContext {
		public ClLE_constetState(369); ;
				_la = _input.LA(1)80istener ut.LA(1);
			if (_la==SEMI) {
				{
				setStatuterAlt enumBodyDeclarations();
				}
			}

			setState(338); match(RBRACE)80UMBEration() throws RecognitionExceptionitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re80leIn		}
		@Ovectx);
				while ( _alt!=2 && 3e(261); classOrInterfaceModifier();
						}
						} 
	8overListener ) ((JavaLche _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17nterfaceDeclarationContext interfaceDeclaortDeclaration; }
		@Override
		publiation() throws RecognitaceDeclaration() throws Recognition {
		InterfaceDeclarationContext _localctx = new Inhis);
		}
	}

	public final InterfaceDeclarationContext interfaceDecl_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9,ation() throws RecognitionExcept10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration =ation() throws RecognitionExcepti= 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULput.LA(1);
			}
			}
		}
		catch (RecognitiRULE_constructorDeclterfaceDeclarationContext interfaceDeclaration() throws RecognitionExceptiontion = 24, RULE_fieldDeclaration =terfaceDeclarationContext interfaceDeclalaration = 26, 
x, 32, RULE_typeList);
		int _la;
		trtext extends ParserRuleContext {
		public Cl= 78, RU;
			while (_la==COMMA) {
				{rol = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		R8ionExecognitionException {
		TAT) | (1L << INTxt _localctception = rRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34,serRuleContext {
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
	CTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLiteListContext typeList() throws ry {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); type();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA)
				{
				setState(380); match(COMMA);
				setState(381); type();
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}atch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
_localctx;
	}

	public static class ClassBodyContext exthrows RecognitionException {
		TyionContext classBodyDeclaration(int i) {
			return getRu(ClassBodyDeclarationContext.class,i);
		}
		ptionsContext extends ParserRuleContext {
		public Clclaratio;
			while (_la==COMMA)inue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'"8			} = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_vari81r.v4nterface'", "'long'", "'native'", "'new'", "'pac81istener nterfaceBodyContext.class,0);
		}
		public InterfaceDeclarationConteRICTF, "'strictfp'", 
		"8alctx).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {ener).exitTypeList(this);
		}
	}

	public final TypeIMPLmBodyDeclarations;		}
		@Override
		public void exitRulse(ParseTreeListener lis PRIVATE=33, PROTEStext.Labeimulator(ntext.seTreer)listener).enterEnumBodyDeclaratiole(ParseTreeListenerride
		public void exitFosteneroimulator(frfaceBodyrameter; }
		@Override
		publerfaceBody(this);_la = _input.LA(1);
			whi	@Ovee(ParseTreeListen>er listener) ex() { return RULE_interfaceBodyistener ) ((JavaListene PRIVATE=33, PROTEParodifier();
					}perfaceBodyCorameter; }
		@Override
		publterfaceBodyContext ier listener) {
			if ( liResourceSpecific_localctx = nrceBodyContext(_ctx, rameter; }
		@Override
		publaceBodyContext(_ctx, getStatetRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInic voidifier();
					>}
					}
					setState(245);
					_errsHandler.sync(this);
			ULE_typeArgumentsOrruntClaus			break;edictEAN) |er)listener).enterEnumBodyDeclaratio BOOLEAN) | (1L <<istener)listener).enterInte10, COtValuePairs ==10, COrationerride
		public void exitRule(< FLOAT) | (1L << te(240); classOrInterfaceModifier();
					}
					}
			public void exitRule(ParseTreeListnterfaceBodyContext _lo 
		THIS=43, THROWceBodyver(this, re);GroupeListener listENT) | (1L << VOID) {
			if ( listener instanceof JavaListenENT) | (1L << VOID) | (1L << SYNCHRONIZED) | (1L << T	}
		@Oodifier();
					}		}
		@OfaceBody() throws RecognitionException { (Identifier - 68)) | (1L r listener) {
			if ( listener BOOLEAN) | (1L <<> BYTE) | (1L hile ((((_la) & ~0x3f) == 0 && OUBLE) | (1L << ENUM) | 		public void exitRule(ParseTr= 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementVlaration(this);
		}
		@Ov{
			if ( listener instanceof JavaLs);
		}
		@Override
		public void exittener instaENT) | (1L << VOID) | (1L stener )TILE) | (1L << SEMI)aListener)listener).exitInterfaceBody&& ((1L << (_la - 68)) & ((1L <<ntext(EnumDeclarationContext.clTATIC)	}
		public List<ClassOrInterfaTATIC)Context> classOrIn
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); type();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1)		}
		@OOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIG
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally 		return _localctx;
	}

	public static claration(this);
		}
		@Overtring[] tokenNames = {
		"<INVALleContext(ClassBodyDeclarationConublic List<ClassBodyDeclarationContext> classBodyDeclaration(4ession",		}
		@O FINAL:
			case PRIVATE:
			case PROTECTextends'"92rror(thintext.class);
		}
		public PackageDeclarationCo10n _localctx;
	}urn getRuleContext(TypeContext.class,i);
		}
		public List<TypkingSrUpdate = 82,TypeContext.class);
		}
		public TypeListContext(ParserRuleContext parent, int in2r.v4.runtiTATIC) listener) {
			82redict(_input,9,_ctx);
onContext(_ride
	publl", "warnings", "unchecked", "unusLOnnotationC)
public class Ja8lass4.runtime _laarser {
	static 8( liict(_input,9,_ctx);
4", RuntimeMetaDach ( getIntICTFP:
		xitTypeBound(this);
		}
	}

	pu);
		}
		@Override public int getRuleIndex() { return RULaLisContext(FeclarationContext(3primterfaceBody() tnterOuterAlt(_locar.v4gState) {
			supeerAlt(_locaride
		put.LA(1);
			if (_la==SEMI) {
				{
				setStat			}
				setState(321);
				_errHandler.sync(t83nterOuterAELS AT:
		(1);
				if 	setgState) {
			supe, 1);
			{
			setState(314); type();
			setState4re) {
			_localctx.exception = re;
			_errHandler.repor8ext(P.runti68))ut.LA(1);
				if ICTFP:
			turn getRuleContexts(A8RuleC
		}
		@Ovetlr.v4.runtime.atnase 2:
		eTreeListener runtime.atnprimgState) {
			super(parent, invokingState5eturn getToken(JavaParser.ENUM, 0); }
		public TypeListC8ntlr..runti.repor
						{
						{	set, 2);
				{
				setState(407);rrid				setState(410); modifier();
						}
	6cted static final DFA[] _decisioride
		p	_errHandler.sync(ut,35,_ctxDOlt = getInterpreter= _i	_la = _input.LA(1);
				ifaParser ext			_alt = getInterprete Runt, 2);
				{
				setState(407);arniionContext extends 				{
						{
						s7cted static final DFA[] _decisioride
	pu	_errHandler.sync fina.runticept
		finally {
				setxt classBodyDendler.syncew TypeBoundContexla) & ~0x3f) == 0 &&

	pubATCHsetState(409); block();
	, "'iE_classOrInterfaceModifier; }
		@Overll", "warnings", "unchec	dontlr.v4.runtime.atn.*;
import org.an8localrrHandler.synport org.antlr.v4.rturn getRuleContext= _i@Overriduntime.tree.*;
import java.utationContext annotationType} ments",  "unuterf 
			switch ( getInage'", "'pationContext annotationType	public Lrs(thLYantlr.v4.runtime.atneclarationCase NT) | (1L << Iport org.antlr.v4imeMetaDaate);
		}
		@Override puionContsetState(409); block();
	super getRuleContext(FieldDte);
		}
		@Overri		_alt = getInnterpreter().adaptivePredict(_input,9,_ctx)
			if ( liste
						{
						s8cted static final DFA[] _decisioleContext	_errHandler.synce (_lContext {
		public Interfais);());
		enterRule(_locanContext interface= _ilarationContext interfacr(this, rerivate'", 
		"'protected'", "'public'", "'return'", turn _localctxterf, "cast"})
public(409); block();
	7 ( lotationTypeDeclaratioclarationCotorDeclaration()otationCo
		public AnnotationTypeDeclarationContext annotationTypt extends ParserRListContex, RULE_classBodyDeclaration);
		iionContext fieldDructorDeclaration()				) {
			return getRuleContextimeMetaData.VERSION); }

	prot9cted static final DFA[] _decisioantlr.v4.	_errHandler.sync { rionConte
			}nContext interfac "cre, 2);
				{
				setState(407);rguments"
 << FLOAT) | @Override
	assOrInterfaceModifierContext extends ParserRuleContext {
		public AnnotationContextnUninotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int in8blic tatic class ClassBodyDeclarport org.antlr.v4.runtime.misc.*;
import or8rride
	puruntime.tree.*;
import java.util.List;
import java.util.Iterator;
import ja).enterMemberDect extends ParserRe() odDeclarationContext.class,0);
		}
		public GenericConstructorDeclaratioSE) {
			i		setState(347);enericInvocationSuffix", "8.syncener ) ((JavaRuleContext(GenericConstructorDeclssBoionContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() eturnrserRuleContext pareturn _localctx;
	}

10ontext _localctx = new TypeParame,_ctx);
	_errHandler.syncINAL) | (1Lturn RULE_clarRule(ParseTreeLierRul, 2);
				{
				setState(407);fiedext classBodyDeclaration() throws Reco1rations();
				}
			}

			setSState(338); match(RBRACE)9		pub _alt==		}
	rRule(ParseTreeL9Context(Intll", "warnings", "unchecked"tate(271); classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
			case VOLATILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NATIVE) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0)) ) {
				_errHandler.recoverInlin				consume();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);			exitRule();
	;
		}
		public M90rror(ter().adaptivePredict(_input,36,_ctx) ) {
		9Conte1:
				enterOuterAlt(_localctx, 1);
			1ected static final DFA[] _decisioCont
			case 4:
				enterOu	setState(
			_l 4);
				{
				serpreter().adaptivePrediis, re);
	ontext.claler.recover(this, re);
		}
		final);
		}
		@Override public int gblic
			case 4:
				enterOuic int getSYNCHRerRuleContext {
ak;
			ca, RULE_classBodyDeclaration);
		iconstructoron re) {
			_localctx.exceionException {
		TypeDeclarler.reportError(this, re);
blic lic MethodBodyContext methodBody() {
			rync(this);
				_alt = getInterprPred
			case 4:
				enterOPredi.runtimeLE) | (ersContext formalPride
		pu) {
			return getRuleContext(FormalParametersContext.class,0);
		}
		UMBER ) {
				if ( _alt==1ier() { return getToken(JavaPs);
				_la = _input.this, re);
		}
		final					} 
					}
					setState(41
		peContext.class,0);
		}ase 1:
				enterOuterAlt(_localctx, 1);
			1;
				}
				break;
			}
		}
qualifiedNse 4:
				enterOalctx< (AT - 68)))) != 0))erRuleContext {
okingState) RULE_methodDeclaration; }
		@Overr	public static class MemberDeclar
				whiener listener) {
	r.v4.runtiblic MethodDeclara {
			if (
		public Q7);
			swi {
			if (nterOuterAlt(_localctxaredContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17 BOOLEAN) | (1L <<  FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=onContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInicitGenericInvocation = 94, 
		RULE_nonWildcardTypeArguments = 95, RULE_typeArgumentsOrruntf ( listeneredictf ( t(_ctx, getState());
		enterRul(Identifier);
	}
			setState(434); match(IdeEAN) | (1L <<E_nonWildcardTypeArgumentsOrDiamond = 97, RULE_superSuffix = 98, RULE_explicitGenericInvocationSuffix = 99, 
		RULE_arguments = 100;
	publi
			_la = String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifiYTE) | (1L odifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclar(443); match(THROWS);
		n", "typeList", 
		BOOLEAN) | (1L << BYTE) | (1L dyDeclaration", "memberDeclaration",BOOLEAN) | (1L << n", "genericMetho
			_la = _input.).enterClassBodyDeclaration(this);
		}
		@Oss'", "'State(442);inue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'"9erAl	public onContener) {
			if (2 && _alt!=org.antlr.v4_errHandle
		 = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_vari9
		}nterface'", "'long'", "'native'", "'new'", "'pac9enteontext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaratio9RuleC		setState(();
		}
		retur;
		}
		public VariableModifierCon9put,35,_ctx
					setState(342); 9=2 &&rUpdate = 82, RULE_parExpression = 83, RULE_expressionList = 84, 
		RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expression = 87, 
		RULE_primary = 88, RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91, 
		RULE_(Identifier);
	ion(this);
		}
	}

	public final PackageDeclarationContext packageDec37, STATIC=38, STRICTFP=39, SUPER=4xception {
		PackageDeclar
			exitRule();
		}
		me", "type", "classO>text packageDeclaration() throws Recognitionsde
		public void exitRule(etState(434); match(Identifier);
.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(436); match(LBRACK);
				setState(437); match(RBRACK);
				}
				}
				setStatef ( 
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(443Stateh(THROWS);
				setState(444); qualifiedNameList();
				}
			}

			setState(449);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(447);;
			{
			setStat
				break;
			case SEntifier);
			setState(4); match(SEMI);
				}
				break;
		f ( listener	throw new NoViableAl	}

	publi).enterClassBodyDeclaration(this);
		}
		@OLE_consttx = new ocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandle	if (lic QualifiedNameCont	return getrror(this, re);
			_errHandler.recover(this, re);
		}
		finally {
		BIT8)) eContext {
		public TypeParame
			ormalPaParsetener ) ((JavaLislr.v4lic QualifiedNameContionContext genestructorBodleContext {
		public InterfaceBodyDeclarationContext interfaceBodyD
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17,< FLOAT) | (1L << IE_annotationName = 53, 
		RULE_elementValuePairs = 54, RULE_elementValuePair = 55, RULE_elementValue = 56, 
		RULE_elementV() { return RULE_coE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LT) | (1L <<OTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGNT) | (1L << =91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=ation() throws Recognition=103, COMMENT=104, L< FLOAT) | (1L << INT) | (1L << INtring[] tokenNames = {
		"<INVALI< FLOAT) | (1L << Issert'", "'booleastener ) ((JavaList).enterClassBodyDeclaration(this);
		}
		@O= 78, RU instanceof rol = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		R9 = _in,_ctx)onConteublic GenericMetaParsrUpdate = 82, RULE_parExpression = 83, RULE_expressionList = 84, 
		RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expression = 87, 
		RULE_primary = 88, RULE_creator = 89, RULE_createdName = 90, RULE_innerCreator = 91, 
		RULEaceBodyContext(_ctx, getStateler.reportError(this, re);
			_errHanaceBodyCate(210);());
		r.sync(this);
				_la = _input.rserRuleContext ext _localctx = new InterfaceBodyContext(_ctx, getStatE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		());
		enterRule(_loOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGaceBodyContext(_ctx, ows RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, Index() { return RULE_genericConstru=103, COMMENT=104, aceBodyContext(_ctx, getState());
		enterRule(_localtring[] tokenNames = {
		"<INVALaceBodyContext(_ctx, getStatessert'", "'booleParametersContext.class,0);
).enterClassBodyDeclaration(this);
		}
		@Oclaratio());
		enterRule(_loocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandle	exitRule()xitRule();
		}
		retu5r.v4
		public ctorDeclarationCor", "arrantext.class,0);
		}
		public LrRulele();
		}
		return _lo9rRuleContexception = re;
			ner instanceof Ja9, "'i0);
		}
		public structorBody();
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

	public s RULE_importDeclaration; }
		@Override
		public voaceBodyC listener());
		arationContext extends ParserRulurn _localctx;GE=32, PRIVATE=33, PROTEurn _localctx;	}

	pub37, STATIC=38, STRICTFP=39, SUPER=4onContext extends ParParseTreeListener liver(this, re);

		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		pularationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try ver(this,_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)		}
			}

			setState(233); qualrserRuleContext {
		public TreeListener listener) {
			if ( listenerte(234); match(DOT);
			torsContext.classnhancedForControl", "forUpdate", 
		"parExp5ession",ontext paist", "statementExpression", "constantExpression", 
		"expression", "primary"9blic }

	publublic GenericMetsupe "arrayCreatorRest", 
		"classCreatorRest", "explicitGenericInvocation", "nonWi111cardTypeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
		"explicitGenericInvocationSuffix", "9f ( lsContext.class,0);MI);
			}ase  = new FieldDeclme() { return "Java.g4"; }

	@Ov9bleIer listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener)
			enterOuterdNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex		public Variabl FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROWodifier();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1)eral=51, FloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58text Orlass,0);ntifier);
		vaListener)listenert(_ctx, getState());
		enterRule(_lstener)listener).enterext _localctx = new InterfaceBodyCxt.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext prent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
	_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)rride
		public void exitRule(ParseTreeLis VariableDeclarat			if ( listener instanceof JavaListener ) avaListener ) ((JavaListener)lisDeclaration(this);
		}
	}

	public final FieldDecss'", "'());
		ocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandle) {localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParamee (_lontext typeParameters() {
			return getRuleConte_priypeParametersContext.class,0);
		}
		public MethodDeclarationContext methLE_tynterfaceBodyDeclaratioublic GenericMetment = 42, RULE_qualifiedNameList
				while	setState(x = new TypeDeclaratio9mberD = re;
			_errHandnContext.class,i);
		}
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invRANSIENT) | (1L << VOID) | (1L <ride public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener inle(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInttener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceBody(this);
		}
	}

	public final Instanceof JavaListener ) ((JavaListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitation();
				}
				break;
			t<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public BlockContext block() {
			return getRuleCoContext {
		public MembockContext.class,0);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDatic class ClassBodyDeclanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class() {
			return getRuleContext(InterfacOverride
		public vRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << SEMI)tener listener) {
			if ( listener RANSIENT) | (1L << VOID) | (1L <istener ) ((JavaLarationContext genericInterfaceMion(this);
		}
	}

	public final FieldDecLE_constContext interfaceMethodDe
			case PROTECTED:
			case PUBLIC:
			case SHORT:
			case STATIC:
			caslic Const", "'finally'", 
		"'float'", "'for'", "'if'", "'goDeclaratio		enterRule(_localctx, 4ion",etInterpreter().adap
			return getRuleContergumeontext {
		public InterfaceBodyDeclarationContext interfacen getRuleContextberDeclaration);
nstructo
		}
		@Otlr.
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingStala =BodyContext interfaceBody() {
			return getRul9	{
	ide public int getRuleIndex() { return RULE_interfaceMemberDeclaratioTE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE) | (1L << SEMI))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LT - 68)) | (1L << (Identifier - 68)) | (1L << (AT - 68)))) != 0)) {
				{
				{
				setState(362); classBodyDeclaration();
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(JavaParser.nstructo		{
						{
						setState(469); modifier();
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(475); interfaceMemberDeclaration(seTreeListeneler.reportError(this, re);
			_errHanic Classodifier();
					}ic ste;
			_errHat(_ctx, getState());
		enterRul = re;
			_errHandler.rener).exitTypeParameter(this);, re);
e", "classOrIurn _localctx;ameterContext typeParameter() throw _localctx;
	}

tx.exception = re;
			_errcatch (RecognitioMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContexseTreclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {ener) ntext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(Annotation
		public ConstDecl		}
		public EnumDeclaraseTreeListener listener) text(EnumDeclarationContext.class,0);
		seTreeListenenContext constDeclarattorContext> cion(this);
		}
	}

	public final FieldDec= 78, RUtor(int i) ;
				_la = _input.LA(1)9fiedNameCr instanceof JavaListener ) ((JavaListener)listene1text(ParserRuleCDeclarations();
				}
			}

			setState(338); match(RBRACE)9.syncover(thiak;
			caublic finalic iportError(this, re);onContext constDelifiedNameCavaListener )ta.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected stati9n() {
			rarationContext constDe {
		ublic static classtDeclaration);
	stanceof JavaListener )Alt(_localctx, 1);
				{
				setState(405); match(SEMI);
				}
				break;
		9INAL) | (1LrationContext.tate(494);

			enter;
			{
			setState(488); type
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FaceBody(this);ler.reportError(this, re);
			_errHanFor(((_(this);
		(((_verride
		public void exitRule(Pa		_errHandlener).exitTypeParameter(thishR=86dRecognitionExceptio			exitRule();
	ameterContext typeParameter() thr		exitRule();
		}
		rte(240); classOrInterfaceModifier();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1)ForUpdatL:
			cafializerCverride
		public void exitRule(PalizerContext ); }
		public VariableInitiaaceBody(this);E=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=aceBodyOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=9ctx;
	}=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=10) ((JavaListener)liste=103, COMMENT=104, LINaceBody(this);
		}
		@Overtring[] tokenNames = {
		"<INVALID>aceBody(this);ssert'", "'boolean'
		}
		publicion(this);
		}
	}

	public final FieldDecclaratiotRuleIndexinue'", "'default'", 
		"'dextends'"10rn _localstener) {
			if ( listener instanceof JavaListenera.util.vaListener)listener).exitConstDeclaration(this);
		}
	}

	public fin10		pubturn _localctx;
	}onContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_local10setState(422); constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423); genericConstructorDeetRuleContext(TypeContext.class,0);
		}
		pk;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(424); interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(425); annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(426); classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(427); enumDeclaration();
				}
				break;
			}
		}
		catch (Recogniti
		}
		finally {
			exitRule();
	;
		}
		public M10ptionr.reportEDeclarationContext(ParserRuleCont10			_errHandler.recover(	return getRualifiedNameList() {
			return getRul;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423); genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(424); interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(425); annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(426); classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(427); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exc10c sta = re;
			_errHandler.reportError(this, re);10ext Context(TypeContext.class,0);				{
			blic QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public iariableInition("4.4", RuntimeMetaData.VERSION); }


		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, F		_errHandleler.reportError(this, re);
			_errHand
					}
tene
					}
					}
tene					setState(245);
					_errHandler.syn3); match(T_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && (RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localc = _input.LA(1E=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=(((_OTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=9eport=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=10);
		}
		public T=103, COMMENT=104, LIN		_errHandler.reportErtring[] tokenNames = {
		"<INVALID>		_errHandlessert'", "'boolean's, re);
		}nhancedForControl", "forUpdate", 
		"parExp6ession",RuleCon;
				_la = _input.LA(1)10qualifiedr instanceof JavaListener ) ((JavaListener)listene2e(335); enumBodyDeclarations();
				}
			}

			setState(338); match(RBRACE)10Preditext parent, int invokingState) 			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
		}ROWS);
				setSexitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDecl
			exitRule();
		}
		retFLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, IntegerLit			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JantDeclaratorContext extener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionExceptionntDeclaratorContearationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {urn _localctx;
	}t(_localctx, 1);
			{
			setState(229); match(IMPORT);
			setState(231);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230); matreturn RULE_variableDeclarators;setState(233); quali			exitRule();
		}
		return _localctx;
	}
put.LA(1);
			if (_la==DOT) {
					exitRule();
		}
		rematch(DOT);
				eDeclaratorContext.class,turn RULE_genericInterfaceMethodDeclaration; rrHandlerntDeclaratorConteinue'", "'default'", 
		"'do'", "'double'", "'else'", "'enum'", "'extends'"10okin = 31, 
		RULE_variableDeclarators = 32, RULE_variableDeclarator = 33, RULE_variableDeclaratorId = 34, 
		RULE_vari10xt panterface'", "'long'", "'native'", "'new'", "'pac10isteontext {
		public InterfaceBodyDeclarationContext interfaceBodyDeclaratio10nstan, "'strictfp'", 
		"10teneralt!=2 && _alt!=org.antlr.v4.runtime.10terprput.LA(1);
			whi
				setSta_typ( _alt==1 ) {
						{
						{
						setState(469); modifier();
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(475); interfaceMemberDeclartializerContext v;
			if (_la==THROWS) {
				{
				setState(523); match(THROWS);
				setState(524); qualifiedNameList();
				}
			}

			setState(527); match(SEMIeContext(VariablE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=lizerCOTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=9ableIni=91, DIV_ASSIGN=92, AND_ASSIGN=93, OR_ASSIGN=94, 
		XOR_ASSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN=97, RSHIFT_ASSIGN=98, URSHIFT_ASSIGN=99, 
		Identifier=10int invokingState) {=103, COMMENT=104, LINlizerContext variableInititring[] tokenNames = {
		"<INVALID>lizerContext vssert'", "'boolean'riableDeclaratturn RULE_genericInterfaceMethodDeclaration; LE_constext variarol = 79, RULE_forInit = 80, RULE_enhancedForControl = 81, 
		R10lly {stener)listener).exitG;
				}
				setState(267); annotationTypeDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(268); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_lterfaceBodyContext in;
			if (_la==THROWS) {
				{
				setState(52
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1)terfaceBodyContext iE=60, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		terfaceBody()OTEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGterfaceBodyCovokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public veturn _localctx;
	}

	pub=103, COMMENT=104, terfaceBodyContext interfaceBody() thtring[] tokenNames = {
		"<INVALterfaceBodyContext inssert'", "'boole
			if (_la==ASSIGN)turn RULE_genericInterfaceMethodDeclaration; = 78, RUterfaceBody()			if ( listener instanceof JavaListener ) ((JavaListener)listenercase 2:
		xitRule();
		}
		ret10alctx = re;
			_errHand((JavaListent(ParserRuluterAlt(_localctx, 1);
			{
			setState(462); typeParameters();
			setState(463); constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recoetState(523); match(THRO_la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState<< SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << his);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L <<etState(523); match(Tner)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException;
				}
			arationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {OWS);
				sett(_localctx, 1);
			{
			setState(229); match(IMPORT);
			setState(231);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230); mat re) {
			_localctx.exceptisetState(233); qualitState(523); match(THROWS);
				setStput.LA(1);
			if (_la==DOT) {
		tState(523); match(THmatch(DOT);
				er);
			setState(550turn RULE_genericInterfaceMethodDeclaration; MI);
			;
				}
			arators() throws RecognitionException {
		VariableDeclaratorsContext _localctenteristener).enterVariableDeclaratRule(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDe10RuleContexttext extends ParserRul10RuleCct(_input,9,_ctx);
				whi);
			{
			setSt
		eclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int (Identifier - 68)) | (1L <ception {
		VariableDeclaratorIdContext _localctx = new VariableDe				setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1) (Identifier - 68)) | (1L t<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public BlockContext block() {
			return getRuleContext(Blon re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		r (Identifier - 68))onContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclntifier, 0); }
		public VariableDeclaratorI (Identifier - 68)) | (1L << (AT - 68)))) != 0)) ner listener) {
			if ( listener instance invokingState);
		}
		@Overridectx, getState());
		enterRnhancedForControl", "forUpdate", 
		"parExp7verride
		public
		public void enterRule(ParseTreeListener listener) {
			if ( listener inlr.v4( _alt==1 ) {
						{
						{
						setState(469); modifier();
						}
						} 
					}
					setState(474);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				setState(475); interfaceMemberDeclar, re);
		}
		finally {ializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_, re);
		}
		finally {E_nonWildcardTypeArgumentsOrDiamond = 97, RULE_superSuffix = 98, RULE_explicitGenericInvocationSuffix = 99, 
		RULE_arguments = 100;
	public ste;
			_errHa String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier",rror(this, re)odifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclaratioE_arrayInitializer; }
		@Ovn", "typeList", 
		"clae;
			_errHandler.reportError(this, re);Declaration", "memberDeclaration", 
	e;
			_errHandler.ren", "genericMethodDecrContext.class,i);
	ase Identifier:
				enterOuterAlt(_localctx,eption re = re;
			_errHa54); expression(0);
				}
				break;
			default:
				throw new leInitializerContext(Parride
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
	NonWildcardf ( Argu= _iate(210);nYTE) | (1L << CHAR) | (
		VariableInitializerContext _BYTE) | (1L << CHAR) | (1L << D<< PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << ExplicitG82, icInvolass GenericConsacterLiteral) | (1L << 
		VariableInitializerContext _loccterLiteral) | (1L << StringL);
			_la = _input.LA(1);rimar= 52, RULp_la -  throws RecognitionException {
_la - 68)) & r.recover(this, re);
		}
		finally3); match(THROWS);
				setState(524); qualifiedNameList();
				}
			}

			setState(527); match(SEMIS, 
Suffix | (1L <<
				setSt)) {
				{
				{
				setState
				setState(558etRuleContext(EnumDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInRACE);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			whiis);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L <<InnerCreingPlic TypePa			}
				serRuleContext parent, int invoki			}
					setStatRuleContext(VariableInitia
					setStatc;
					_errHandler.sync(this);
				 = getInterpreter().adaptivePredict(_inpntext.class,i);
		}
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
	ializer() ch(RBRACK);
				}
				}
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
	ocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}
ublic static class VariableInitializerContex
					}
					}
			tring[] tokenNames = {
		"<INVAL3, DOUB = re;
			_errHa5, 
		rivateext _localctx = new VariableDeclar_pint invokingState) {
			super(parent,FOR=21, IF=22, rideent", "'butilnue'", "'darseTrre);ist;
'case'"ener JavaListener)listener).exitArrayInr(this);
		}
	}

	pu) {
			if (stanceof JavaListener ) (preveeListeE=14, ELSE=1			casstar		if ( li174 "'catch'",ecurr();uterAlt(_localctx,LA(1)) {
					}
tant FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case S10 "'final'stener listener) {
			if ( listener instanceof Javint i) {
			return getRuleCont getRuleIndex() ion re) {
=org.antlr.v4.runtime.a10on = tener listener) {
			10aParser ext=1 ) {
						{
						10 Runt = re;
			ic void exta.VERSION); }

	protected stnt getRuleIndex() onteException {
		InterfaceMethodDeclaJavaLi
				}79			break;
			default:
				throw nexceptit:
				t		_locexcep.exception = re;_errHandler.recr.repo_errHandler.rece);
	exceationUnitContext(__ctx, getState());
		enterRule(_local{
			se, RULE_compilat;
			}
		}redict(_input,9ide publicAlt(_localctx, 1);
				{
				ifier);
			}
		}t(TypeParaRecognitionException re) {
			n(Java
		}eListene
			turn _localctx;
	}

	public static class TypeContext extends ParserRuleContext {erpreter().adapt(TypeCont13);
				_errHandler.sync(thisifier);
			}
		}ak;
1L << (L(410); modifier();
						}
						} ifier);
			}
		}ethodDecla!= 0arserRuleContext {larat;
					exitMethodDeclaration(this);
	util.stop", "warningT(- = new V			enterOu1nsta(_ctx, getState());
		enterRule(_localctx, 50, RULE_fieldDeclaration);
		try {2umConstpeArguments", 
		"typeArgumentsOrDiamond", "nonWildcardTypeArgumentsOrDiamond", "superSuffix", 
		"explicitGe
impopc voSUB=82, s!=null ) triggion , DEFAEvlt(_localctx,ublic void exitRule(ParseaParser.Identifier, 01yIniicConstrtener listener) {
			if ( listener instanceof Javn _localctx;
	}ontext parent, untime.atn((JavaListener)listener).enterEnumCarseTreeLtantName(this);
		}1)) pushNew ( listenextends P] _decisioListener liistener ) ((JavaLa.DFA;
import org.10Context.clastene!(precpred

	pu13		}terpreter(Failedtor;
ateredict(_input,, "e();
				setState"
				setState(575); cl) {
			caationContext annotationType) {
			_localctx.83			break;
			default:
				throw nruntimet:
				tMUL ) {
		.exception IV1 ) {
						{
		MOreporunt	}
		return _localalctx;
	}

	public static class TypeC.class,0);extends ParserRuState(575); cl
		public PrimitsetState(3class,0);}
		@Overriide public int E_type);
		try {
			int _alt;
			setState(591);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(575); cl
		TypeConfaceType();
				setSta2e(580);
				_errHandler.sync(this);
				_alt = getInterprete2().adaptivePredict(_inpuportError);
				while ( _alt!=2 && _alt!=org "'impDDsOrInterfSUBK);
						setState(577); match(RBRACK);
						}
						} 
					}
					setState(582);
		
		@Override
ntext.clas;
					_alt = getInterpreter);
		}ivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:leContextSHORT:
				enterOuterAl1e(580);
				_errHandler.sync(this);
				_alt = getInterprete1().adaptivePredict(_inpmber		setStattener listener) {
			if ( listener instanceof JavdcardTy);
						sealctx, 76, RULEuntime.atntate(575); clICTFP:
			;

	@Oveeption(this);uleContext(er.recover(tlass,0);lt = getInterppreter().adaptivportError(this, re);
ErrorameLisGer.recover(this, re);
	exitRule()terfaceTypeContext extendr.v4.runtiterfaceTypeCotRule();
		}
		return _loca			setStat

	public static class
		publicterfaceTypeContext extend	setState(Context typeArguments(int i) {
			relass,0);
		}
		p10ion", ) {
					iassOrInterf
					_alt = getInterpreterync(thisivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG: { returnaptivePredict(_input,59,_0e(580);
				_errHandler.sync(this);
				_alt = getInterprete0().adaptivePredict(_inp "cr8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.67			break;
			default:
				throw neaceTypt:
				tGeptioaceTis);
			}ceptioListener listennExceListener listeGner instch(LBRACK);
						setState(577); match(RBRACK);
						}
						} 
					}
					setState(582);
	rgume ) {
					ilt!=2 && _a
					_alt = getInterpreter					} ivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:blicrInterfaceTypeContext(ParserRitio80);
				_errHandler.sync(this);
				_alt = getInterpret8gState);
		}
		@Overrit,58,_ctx);
				while ( _alt!=2 && _alt!=orgConteEQUnts'", "'imNOTy {
Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRulredict(_input,9ssOrInterfa
					_alt = getInterpreter;
				}avaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws Recogniti
			case SHORT:
				enterOuterAer )80);
				_errHandler.sync(this);
				_alt = getInterpret7gState);
		}
		@Overrite(533); mBITANn();
			rows Recogniti
		@Override
ter().adapt
					_alt = getInterpreter	public avaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws Recognititer().adaptivePredict(_input,59,6	while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALI6gState);
		}
		@Overriic int getCAREer.recover(.Identifierlifie = re;
			emberDecla
					setState(598); match(Ition() {ivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:mberDeclarSHORT:
				enterOuterA5	while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALI5().adaptivePredict(_inpn() {
			rdyContext connput,63,_ctx);NoViableAltExce
			}
		}
					_alt = getInterpreter) {
			ocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}
ync(this);aceType();
				setSt4	while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALI4ontext(ParserRuleContextn.ATN.INVAL
					{
					{
					sINAL) = re;
			
			case SH
					_alt = getInterpreter				enterocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}
	}
		catchaceType();
				setStte(580);
				_errHandler.sync(this);
				_alt = getInterpretr().adaptivePredict(_inplocalameLisinvokingState) {
			sup.exitVariableD(ync(this);
					_alt = getInterpreterieldDeclaivePredict(_input,58,_ctx);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG1) | (1L <ule(_localctx, 80, RULE_t(_localctx, 2);
				{
				setState(583); primitiveType();
			setState(588);
				1ptionameLisQUESTI);
			switandler.reporter)listener).enterVariaHandler.recoverr.v4.runtime7);
			switandler.reportredict(_input,9f ( _alt==1 ) {
						{
						{
			lly {
		AN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
	
			}
		}aceType();
				setSta	while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALIiableAltException(this)1over(thisc int getRuleIndex() { return RULE_classOrInterf6			break;
			default:
				throw neingStat:
				tx = neic int gre);
		}
		_() { return RULE_typeArgSUBnts; }
		@Override
		puMULnts; }
		@Override
		puDIVnts; }
		@Override
		puANents; }
		@Override
		puORnts; }
		@Override
		puXtener).enterTypeArguments(tMOents; }
		@Override
		puLSHIFTnts; }
		@Override
		puRListener listener) {
			if ( Ulistener instanceof ch(LBRACK);
						setState(577); match(RBRACK);
						}
						} 
					}
					setState(582);
1Metho ) {
					iic class TypeArgumentsContext extends 			setState(584); match(LBRACK);
						setState(585); match(RBRACK);
						}
						} 
					}
					setState(590);
					_errHandler.sync(this);
					_alt = getInterp1aceDeclaraonsume();
			}
		}
		ypeContext extends ParserRuleContext {
		public PrimitiveType2Context(ParserRuleConte1ionExceptio	};

	@Ove = _input.LA(ase 2:
			lic MethodDeclarat).exitPrimitiveType(this);
	return getTokens(JavaParser.Identifier); }
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public C1blic List<Tesume();
			}
		}
		(this);
		}
		@Override
		public void exitRule(ParseTreeLis2tener listener) {
			i1Parser.Idenile (_la==COMMA) {
				{RuleContexta = (611); match(COMMA);
				setState(61anceof JavaListener ) ((JavaListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws Recogni1ide publiction re) {
			_localctxte(580);
				_errHandler.sync(this);
				_alt = getInterpret2r().adaptivePredict(_in1			}		}
		finally {
			exitRule()
			enterRuleIndex()OMMA) {
				{e(609); mat
				while ( _alt!=2 && _alt!=lic Li
		try {
	ntext(TypeArgumentsCon1xt paUBLE) | (1L << FLOAT) | (1text typeArguments(nContext.cr) {
			if okinge(565);
					(611); match(COMMA);
				setState(6161,_ctx) ) {
			case 1:
				{
				setState(594); typeArguments();
				}
				break;
			}
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().a1kingeContext parent, int invokingS	catch (RecognitionException re) {
			_localctx.exception = ree;
			_errHandler.reporistener lisile (_la==COMMA) {
				nstanceof J = _inionException {
		TypnterO variableIni(611); match(COMMA);
				setState(61dentifier);
					setState(600);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						setState(599); typeArguments();
						1( listeneext parent, int invokingSontext(TypeArgumentContext.class,i);
		}
		public TypeArgume2ntsContext(ParserRuleConate(5t _la;
		try {
			setState(62ws Recoal) | (1L << NullLiteral(611); match(COMMA);
				setState(61{
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}1lly 
			case QUESTION:
				enterleContext parent, int invokingState) {
			super(parent, invok2ngState);
		}
		@Over1
		}
		@O << FetersContxception re) {tion = re;
			_errHandleception re) {exitRule()avaLiexception =ypeArgumentsContext extends nt getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaLis1			}rInterfaceTypeContext(ParserRu
		80);
				_errHandler.sync(this);
				_alt = getInterprete9cognitionException re) {	setState(=org.antlr.v4.s, re);
			_eext parent, int invokingState) {
			super;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(423); genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(424); interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(425); annotationTypeDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(426); classDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(427); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {Listener ) ((JavaListenRuleCstener)listener).exitGe
		}
		@Override
		public void e=2 && _alt!eTreeListener ;
					_alt = getInterpreter(	}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());1text parei) {
			return getRuleCo				} 
				}
				setState(606);
				_errHandler.sync(this);1
				_alt = getInterpr1	if andler.sync(this);
				_alt = getInterpreter()		_lDeclaratioCK);
						setState(577); match(RBRACK);
						}
						} 
					}
					setSta
					_alt = getInterpreter(<< BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
istener lition re) {
			_localctNameContext.class,i);
		}
		public List<QualifiedNameContext qualifiedName() {
			rlr.v4.runtiINSTANCEO	enterOuter) {
			if (		_la = _input.Ls, re);
			_errHandler.r() { return "Java.g4"; }

	@Ov11.antlr.v4.tener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener)		@Override
	dNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			superunrollse Identifier:
se(591);
		_ctx, getState());
		enterRule(_localctx, 66, RULE_variab_la - 68)) & (L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) ionContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrIntXTENDS || _la==SUPER) {	setState(558)EXTENDS || _la==SUPER) {iableInitializer();
				setState(563;
		try {
			enterOuterAlt(_localctxer listener) {
			if ( listen
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsCHAR) | (1L << DOaLOAT) | (1L << INT) | (1L << LONG) | (1 << SHORT) | (1L << SUPER) | (1L << THIS) verride
		public void en {
		InterfaceDeclarationConrATNSimulator & ~0x3f) == 0 && ((1L << (_la - 68)) & ) {
				{
				setState(541); match(ASSIGN);
				setState(542); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionExcep_la - 			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		re1L << (x;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(JavaParser.IrContext.class);
		}VariableDeclaratorId_la - 68)) & ((1L << (LTt invokingState) {
			super(paren_la - 68)) & (		}
		@Override ndler.reportErase Identifier:
				enterOuterAlt(_localctx,		@Overri_la - 
		public void enterRule(P1enumConst
		catch (RecognitionException re) {
			_localctx3aListener ) ((JavaListener)listener).enterGenericInterfaceMethodDeclaration(this1aParser exttx, getState());
		ente1erAlt(_localctx,rserRuleContext {11	exitRule()eTreeListener listenHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{1rRuleContexteturn _locaAlt(_localctx, 1);
				{
				setState(405); match(SEMI);
				}
				break;
		11ceDec
			switch (_input.13);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_i11ntextic void e(410); modifier();
						}
						} 
					}
					setState(415);
					_errHandler.syn11{
			enter			setState(611); 6); memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionExcep11lic i_localctx, 74, RULE_enu1ULE_tt _la;
		try {
( getInterp
		}
		ca0); }}
		return _localctx;
	}

	public static class MemberDeclarationContext extends Pars11age',_ctx) 1);

			case 1:
				en		int _la;
		try {
			_errHandl
		public (_localctx, 1
				break;packacase 8:packagenterOuterAlt(_localctx, 8).trima	{packagsetState(1165); nonWildcardTypeArguments(va.g4 by4.4
import 9import orwitch (_input.LA(1))  ANTLR tek.dSUPERep.lexetek.dIdentifierep.lexey ANTLR org.antlr.v4.6); explicitGenericInvocationSuffix
import o	}util.Lie org.trimart orgTHISruntime.misc.*;
import org.7); match(ratoa.util.Li4.4
import 8); a.atn.*;
import oist;
import java.utidefaultruntime.throw new NoViableAltExcep
imp(thisva.g4 byst;
imst;
ime org.trimast;
st;
c
@S (Recogni
imper {
	st reantlr.v4ated from.e; }

	p= re.trima_errHandler.reportErroratic ,protionToDFA;
	protectecove final Predictiost;
finallyntlr.v4exitRule
importst;
return ated from.tri}

	public static class CreatorContext extends ParserxtCa=3, BREA ANTLSTRACT=Nntlr.v4.runtime.atn.*;=3, BREAantlr.v4.runtime.atn.*;
intlr.v4lic stageextCa=3, BRE(
		CLASS=9, CONST=10, CONTINUE.RT=2,,0he();
	pubSTRACT=ArrayBOOLEANRest=3, BREAa, GOTO=23, 
		OUBLE=14, ELSE=15, 
		ENUM=16,2, GOTO=23, 
		IMPLEME19, FLOAT=20, FOR=21, IF=2CT=2,TO=23, 
		IMPLEMENRT=2,, IMPORT=25, INSTANCEOF=26, INT=27, INTERF2, PRIVATE=33, PROTECTETIVE=30, NEW=31, PACKAGE=32OOLEedNam=6, CATCHcD=42, 
		RETURN=36, 
		SHORT=37, STATIC=D=42, 
		THIS=43=40, SWITCH=41, SYNCHRONIZED=42AN=3, BRE(E=5, CASE=6, CATCHparent, int invoking
impUBLE=14,super(=52, Booleteral=53, 
e();
	pub@Override STRACT=lean5, 
		IndexOUBL lic staRULE_ THROor;  NullLiteral=5OR=21, IF=2void r;
xtCacE=5, TreeListime. l
		ASSUBLE=14,if (IGN=66, G instanceof Java 
		ASSI) ((UESTION=71, )GN=66, GT.r;
BOOLEANatic { Runt LBRACK=61, RBRACK=62, SEMI=63,ntextCac, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74xit=75, NOTEQUAL=76, AND=
		ABSTRACT=ew Pr BOOLEAN=3, BREABRACE=6() vaPars ata.VERSION); }

	p ANTLBOOLEAN=3, BREAated from =ser erLiteral=51, Fl_rom Jg.4
impo)al=55,, COMMA=64ated from J178,=59, RBRACE=6al=55,trdictionC4.4
import82dictionfa.DFA;
import org.antlr.v4tek.dLTep.lexer;

// Generated from J1va.g4 by ANTLR 4.4
import73rg.antlr.v4.runtime.atn.*;
import org.antlr.v474);, THROW=44, THatch'", "'char'", "org.=34, PUBLIC=35, RE RuntimeMetaDae org.trimatek.dBOOLEANep.lex'enum'YTExtends'", "CHA;
impotek.dDOUBLnal'", "'finFLOA	"<INVAt org.N'", "'goto'"LONG", "'goto'"SHOR'", "'goto'",antlr.v4.runtimer;

// Generated from Jic stati'boolean'", "'break'st;ss'", "'const'", "'continue'", 8AT=20, .dfa.DFA;
import org.antlr.v4.runtiLBRACKruntime.misc.*;
import org7arning=24, IMPORT=25, .util.List;
import java.util.IteLPAREextendsp'", 
		"'super'", "'9default'", 
		"'do'", "'dou "unused", "cast"})
public class JavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4public class JvaParser extends Parser {
	static { Runti.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLE, 
		THIS=43,K=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, ntime.atn.*;OrDiamond=3, BREAt>>='", "Identifier", (leanLUBLE=14, ELSE=15, 
		ENUM=16,>>>='", "Identifier", "'@'", 19, FLOiT=20, FOR=21, IF=2Termw PrNod", 
		"'intMENT", "LINE_COMMENT"
	TokenN=72,E=5, C. 
		"'int, Unit = 0, RULE_pack 
	<ageDeclarati>on = 1, RULE
		LBRACE= 2, 
		sRULE_typeDeclaration =)0, LBRAier = 4, RULE>>='", "Identifier", "'@'", >"'...'", "WS", 
		"COMMUBLE=14, ELSE=15, 
		ENUM=16s static final int
		RULE_compilatioT=20, FOR=21, IF=2Primitive7, RtLiteral=numConstant OUBLE=14, ELSE=15, 
		ENUM=16,enumConstant = 13, R=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43loatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE, 
		0, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=75, W=44, TEQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MUL_ASS
		RULE_interfaceMembN=92, AND_ASSIGN=93, OR_, 
		THIS=43, THROW=44, THRSSIGN=95, MOD_ASSIGN=96, LSHIFT_ASSIGN, 
		THIS=43,T_ASSIGN=98, URSHIFT_sBody = 17, 
 
		Identifier=100, AT=101, ELLIPSIS=102, W80103, COMMENT, 
		zed'",lean_la4, LINE_COMMENT=105;
	pub9runtime.c final String[] tokenNames = {
 
		"'int'", "'interface'", "'long'", "'nert'", "'boolean'", "'break8'cla

@Su = 6, RULE_ceList = 43, 
		RU6= 44, RU_la = 
import org. 44, RU=68,_la==LTantlr.v4..misc.*;
import org8org.	RULE_typeParameter = 9,, "'while'", "I
		ABceType = 39, RU5meterListA;
	protecsyncatic { Runtimt = 45, RULE_formalParamewhiler = 46,DO
		RULE_lastFormalstFormalParameter = arni

@Suame sWarnings({"all", "8"'voormalParameters = 44, RUType = 39, RUmalParameRULE_annotation = 52, RULEeter = 46, 
		RULE_lalementValType = 39, RU07, RULE_methodBody = 48, RULE_constist;
impody = 49,ementDeclara		RULE_annotation7rrayInitiae = 50, RULE_literal = 51, RRULE_annotation = 52, RULEeMetaData.checkVersion("4'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceinterface'", "'long'", "'native'", "'new'", "'package9arniLE_enumBodyDecl, "'double'", "'else'", "", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='",InnGE=75, NO=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, Ctifier", "'@'", "antlr.v4.runtime.atn.*;ameter = 9, RULE_typeBound = 10, RULE_e, EXTENDS=17, FINAL=18, Fint
		RULE_compilationAT=20, FOR=21, IF=2ageDeclaration = 1, RULEr = 5, 
		RULE_varRULE_typeDeclaration = 3Type1, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZate = 82, RULE_parEloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, Rite = 82, RU0, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GEate = 82, RUE_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_genericInterfeclaration", 
		"typeParamN=92, AND_ASSIGN=93ate = 82, RULE_parEx {
		"compiDeclarator = 33, RULE_variableDeclarate = 82, RULE_parExT_ASSIGN=98, URSArgumentsOrDiamond =rrayInitializer = 36, RULE_enumConstantName =2103, CO {
		"compi= 38, RULE_classOrInterfaceTypeArgument = 42, RULE_qualifiedNOMMENT=105;
	pu201elementValue = 56, 
		RULlaration", "3dictionC = 45, RULE_formalParamter = 46, 
		RULE_l ANTLR 4.4
impor202rg.antlr.v4.runtime.atn.*;dy = 48, RULE_consRULE_aody = 49bleDeclarato'default'", 
		"'do'", "'do.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, 2, GOTO=23, 
		IMPLEMENK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, Expression=3, BREAK=notationMENT", "LINE_COMMENT"
	};
	public annotationName", ilationUnit = 0, RULE_pack, RULannotationName", >"elementValu, RULE_typeBound = 10, RULE_enulementValue", "elementVT=20, FOR=21, IF=22, GOIERSIalizeULE_parExch'",mentRest", , INSTANCEOF=26, INT=27, INTERFACE=2mentRest", 
		"an19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMEloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, Rch'", "'synchron0, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE2, GOTO=23, 
		E_interfaceMemberDeclaration = 27, RULE_constDeclaration = 28, RULE_constantDeclarator = 29, 
		RULE_interfaceMethodDeclaration = 30, RULE_genericInterfarExpression", "expressionList"N=92, AND_ASSIGN=932, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, ISSIGN=95, MOD_ASSIGN=96, LSHIFT_A2, GOTO=23, 
		IMPLEMENT_ASSIGN=98, URSe", "block", "blockStaterrayInitializer = 36, RULE_enumConstantName =4103, COch'", "'synchron= 38, RULE_classOrInterfaceTRULE_alt 44, R"interfaceMemberDeclaration", "constDeclaration", "st;

@Su", "'s 
		"interfaceMet3alifiedNc final String[] tokenNames = {
R, "'strictfp "variableDeclarato, RULE_ele; }
= 44, RULE_formalP21odDeclarame = 50, RULE_literal = 51, RULE_annotation = 52, RULE_annotationN

	@O= 53, 
		RULE_elementValuePairs = 20_elementVa

	@Overrid return _seriaTypetSerializedATN() { r 60, 
		RULE_annotationTyp21alifiedNat = 61, RULE_annotationMethodOrConstantRest = 62, 
		RULE_annoextCache);
antlotationMethodOrCon, "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'",NEW"'import'", "'instanceof'",me.*;
impol.Iterator;
imtek.dVOID", "'goto'",ntegerLiteral, "'for'", "loatingPoint {
			return getRBoolean {
			return getRCharact() {
			return getRString {
			return getRNull {
			return getRws'", 
		"'= {
		"<INVAionConA, "'import'",TILDnal'", "'finINC'", 
		"'flEst<TypeDeclaADackageDeclarSUBstanceof'", 
		"'int'", "'i "variableDeclarat1st;elementValu'public'",xtCache);
g getSerializedATN() { return _seri2alifiedName = 50, RULE_literal = 51, RUalt =	RULatiorpretrCon.adaponstPredict
impor,139, 
	52, RULE_annota}

!=2 &&rRuleCoorg.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER arser(Toke=68, clar==1ingState);8, 
		RUL, 
		RULE_annotati21put);
		_interp = new Paclaration(intTypext.class);
		}
		p		@Override
	constantDe_ATN,_decisionTist;
imp	} cisionToDFA,_shlaration(intlementRest = 61, RULE_annotationMethodOrClarationContext.class,i);
		}
		public CompilationUnitContexeContext {
		publ3ative'", 	return getRuleContext(TypeDeclarationContext.class,i);
		}
		public Compil40ionUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return 2, RULE_eleationUnit; }
		@Override
	_elementVar) {
			if ( listener instanceof JavaListener ) ((Ja34Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRul(this);
		}
	rLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "''", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", , PRIVATE=33, PROTECTEDK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, s);
BodyROTECTED=34, er.sRETURN=36, 
		SHORT=37, STATIC=38, er.sync(thi19, FLOAT=20, FOR=21, IF=22,T=10, CONTINUE=ngs", "unchINSTANCEOF=26, INT=27, INTERFACL=18, FINALLY=19, FLOAT=20, FOR=21, IF=2s);
				_la = _input.LloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RB34, PUBLIC=35, 0, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE=34, PUBLIC=35, REQUAL=76, AND=77, OR=78, INC=79, DEC=80, ADD=81, SUB=82, 
		MUL=83, DIV=84, BITAND=85, BITOR=86, CARET=87, MOD=88, ADD_ASSIGN=89, 
		SUB_ASSIGN=90, MULion re) {
			_localctx.exceptN=92, AND_ASSIGN=93,, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETSSIGN=95, MOD_ASSIGN=96, LSHIFT_AS, PRIVATE=33, PROTECTEDT_ASSIGN=98, URSH (1L << PROTECTED) | (1rrayInitializer = 36, RULE_enumConstantName =6103, COM34, PUBLIC=35, 04, LINE_COMMENT"interfaceMemberDeclaration", "constDeclaration", 3st;ngs", "unchecked"c List<AnnotLE_primitiveType			setState(203);
			switch ( getInterpret2ionUniingState)tek.d1eContexts(TypeDeclaration3arni);
			_la , "'double'", "'else'", "on();
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(205); importDeclaration();
				}
				}
				setState(210);
				_errHandler.sync(thiE.v4.runtime.tree.*;
imp=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=2nterPackageDeclaration(thort jaName", "ele4.runtime.tree.*;
import java", 
		"elementValuePair", "elemic final PackageDeclarationContext tion(this);
		}
	}

	public final PackageDeclarED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SEMI))) != 0) || _la==AT) {
				{
				{
				setState(211); typeDeclaration();ackageDeclaration() throw0, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GEclarationContext _localctlocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _locainput.LA(1);
			}
			setState(225); maN=92, AND_ASSIGN=93nterPackageDeclaration(this);
		}put.LA(1);
			}
			setpublic AnnotationContext annotationnterPackageDeclaration(this);
		T_ASSIGN=98, URSnterPackageDeclaration(this);
	
		}
		public QualifiedNameContext qualified=103, COe);
		}
		finally {
		uleContext(QualifiedNameContext.class,0);
		}
		public List<Anno4consantlr.v4.runtime.atn.*;
import arationConters",r.v4.runtime.tree.*;
import java.util..4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, 
		CLASS=9, CONST=10, CONTINUE=^='", 
		"'%='", "'<<='", "'>>='", "'>>>= 
	"'@'", "'... 
	gnitionException {
		PackageDer) {
			if ( l19, FLOAT=20, FOR=21, IF=2
		CLASS=9, CONST=10, CONTINUEloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, Rantlr.v4.runtime.atn.*;0, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE
		CLASS=9, CONST=10, Clocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _loca
			setState(231);
			_la = _input.LAN=92, AND_ASSIGN=93
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBSSIGN=95, MOD_ASSIGN=96, LSHIFT_A
		CLASS=9, CONST=10, CONTINUE=T_ASSIGN=98, URSthis);
		}
	}

	public final 
		Identifier=100, AT=101, ELLIPSIS=102, W9 37, 
	antlr.v4.runtime.atn.*;ualifiedNameContext.class,0);
		}
		public ImportDeclarationConteLE_formalPLntValueParationConte47, RULEer inslic static class Tantl

@SuGntValueP.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, 7, RULE_typeParameters = 8, '^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Iden"'@'", "'...'", "WS",nstanceof JavaListener ) ((JavaListAL) | (1L << INTERFACE) | (1L << PRIVATE) 7, RULE_typeParameters = 8, loatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, R'...'", "WS", 
		"COM0, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE7, RULE_typeParameterslocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _locareturn getRuleContext(ClassDeclaratioN=92, AND_ASSIGN=93>>>='", "Identifier", "'@'", "'...'", "WS", 
		"COMM;
				}
			}

			setState(238);tionTypeDeclarationContext.claT_ASSIGN=98, URSss,i);
		}
		public EnumDeclption = re;
			_errHandler.reportError(this,ldDeclar'...'", "WS", 
		"COM04, LINE_COMMENT=105;
	pu25malParametRuleContexts(AnnotationContext.class);
		}
		pu3lic PackageDeclarationContexypeArgument = 42, RULE_qualifiedNameList = 43, 
		24lationUnitCntValuePaontext typeD_elementVantext {
otationMethodRest = 63, 2'", "'interface'", "'long'", "'native'", "'new'", "'packag25TypeBody = 59, RUinvokingState) {
			super(parenrride public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JavaListener ) ((JavaListener)listener).enterImportDeclaration(this);
		}
		@Override
		rationContext.class,0);
		}
		public ClassOrInterface
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=2.LA(1);
				while ((((_la) & ~0x3f) == l ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());OrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassDeclarationContext classDeclaration() {
			.LA(1);
				while ((((_la) & ~0x_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230); match(STATIC);
				}
			}

			setState(233); qualifiedName();
			setState(236);
			_la = _input.LA(1)ride public int getRuleIndex() { return RUL4, 
		RULE_statementExpression = 85, RULE_constantExpression = 86, RULE_expr
				}
			}

			setState(238); match(SEMI);
			}
		}tener instanceof JavaListener ) (
					setState(240); classOrInterfaceModiption = re;
			_errHandler.reportError(this,public Sation();
				}
				break;
			cstener listener) {
			if ( ameterLietRuleContexts(AnnotationContext.class);
		}
		pu4exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext type5", "}

	public st != 0) || _laLE_formalP
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRorg.antlr.v4.runtime.atn.*;
import ota.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, SterLationContext pac'", 
		"'%='", "'<<='", "'>>='", "'> = 91, 
		RULE_arrayCreatorRest = 92, RULE_classCreatorRest = 93, RULE_explicitGe << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) !=org.antlr.v4.runloatingPointLiteral=52, BooleanLiteral=53, 
		CharacterLiteral=54, StringLiteral=55, NullLiteral=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RcterLort ja0, LBRACK=61, RBRACK=62, SEMI=63, COMMA=64, DOT=65, 
		ASSIGN=66, GT=67, LT=68, BANG=69, TILDE=70, QUESTION=71, COLON=72, EQUAL=73, 
		LE=74, GE!=org.antlrlocalctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _locadler.reportError(this, re)N=92, AND_ASSIGN=93!=org.antlr.v4.runtctx, 5);
	A(1);
				}
				setState(253); enu!=org.antlr.v4.runtT_ASSIGN=98, URSInterpreter().adaptption = re;
			_errHandler.reportError(this,Name() {ctx, 5);
	stener listener) {
			if (6try {
	c final String[] tokenNames = {
	s'", 
		"'tC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _laarnings", "unchecked",ble'", "'else'", "'enumDO	"<INVALID>", "'abstract'", "'ass_ctx, getState());
		enterR_elementVamentValuePa {
			superator(this,arameters = 44, RULE_formalP26ative'", etRuleContexts(AnnotationContext.class);
		}
		pu5lic PackageDecllarationContex input) {
		super(i6consngs", "unchecked", "unused", "cast"})
rLiteral", "StringLiteral", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='",clarationContext _localctx = new Packatime.atn.ATN.INVALID_ALT_NUMBER ) {
		sOrInterfaceModifierContext classLE=14, ELSE=15, 
		ENUM=16,!=org.antlr.v4.runame = 90, RULE_innerCreator = 91, 
		RULE_arrayCreatorRest = 92, RULE_classCreatorRest = 93, RULE_explicitGe << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) clarationContext _localctx = new Packalctx, 2, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);5);
				{
				setState(268); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHanclarationContext _localctx = netState(225); match(PACKAGE);
			setState(226); qualifiedName();
			setState(227); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
		tends ParserRuleContext {
		public Clas PUBLIC:
			case STATIC:
			case STRICTkageDeclaration() throws RecogniitRule();
		}
		return _localctx;
	}

	public static RuleContext(ClassOrInterfaceMo && ((1L << _la) & ((1L << NATIVE) | (1ption = re;
			_errHandler.reportError(this,e() {
			return getRuleContext(Qnt, int invokingState) {
			supe7'public'c final String[] tokenNames = {
me.*;
impor		}
	}

	public final TypeDeclarationContext type.antl

@Sume.*;de
		public void exst;rContext clas enterRule(ParseTreeListener l 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'packag2warni
		}
		@Override
		public void ex"'vopublic void enterRule(ParseTreeListe", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='",rride
		public void exitRule(ParseTreeListener listeneannotation
			if ( lielementValer instanceof JavaListener ) ((Java				{
				setState(2= 0 && ((1L << _la) & ((1L << ABSTRACT) | ement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resate());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(IMPORT);31);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(230); match(STATIC);
				}
			}

			setState(233); qualifiedName();
			setState(236)put.LA(1);
			if (_la==DOT) {
				{
				 << ABSTRACT) | (1L << CLASS)umentsOrDiamond", "nonWildcardTypeA	}
		}
		catch (RecognitionEx			_localctx.exception = re;
			_errHandler.reportError(thi20 37, 
	
				if erfaceBodyDeclaration", 
		"interfaceMemberDeclaration", "constDeclaration", 7rs",}

	ps'", nContext extends P"'cleclaration", "genericInterfaceMet(( = 4) & ~0x3f) == 0text((1L <<E_clnotass,0);
'", "'e) | ublic VaYTEModifierConallyModifierConloat'"ModifierCon"'if'ModifierConIN
			super(p'", ModifierConNEWModifierCon "'inOverride pub	}
	odifierConppresodifierCont pa
			super(pation() {
			nvokingStateleContext(PackageDeModifierConttext.class,0)(ParserRuleCblic ImportDeclOverride pubxt importDecte);
		}
	 i) {
			nt, invokingblic A)) != 0) ||ntext(An - 68)notationContext.class,0);
ide
		public arseTreeLLT
		publidifierCon(ntexif ( listener inst
		}if ( listener instINCif ( listener instDEexitVariableModifieADDif ( listener instSUBaListener)listener)antlr.v4.
		publ
		}
	aration", "variableDeclarat'", "5); annotation()eDeclaratorId", "variableInitial7r(this);
Rblic Annotatint _la;
		try {
			int _alt;
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				_errHandler.sync(this);
			btext.c sempred(ASE=6, CATCHated from JleanrAREN=58,x, 2);				N=58,tate(27fa.DFA;
				{
tate(27tek.de7:	LBRACE=elementVal_:
				etionTypeElementDec)ated from JtState(280e();
	public statrusionTRULEprivate		case ATt:
				throw new NannotationName", "(_localctx, 2);tState(280); annotation(tState(280); anntek.d0			defaulprec				e 
		IalizedATaration
		finally {
			exitRulic statlocalct
		finally {
			exitRulmalParatek.d3c class ClassDeclarationCAT=20, tek.d4c class ClassDeclarationava.g4 tek.d5c class ClassDeclarationlementRtek.d6c class ClassDeclarationameterLtek.d
			defaully {
			exitRualifiedtek.deesBodyContext classBody(nnotatitek.d9n getRuleContext(ClassBoe();
		}
		}
		finally {
			exitRu	public stat1	return _localctx;
	}

();
		}
		ic class ClassDeclarationt i) {
Contexds ParserRuleContext {
	2dyContext.cl1arametersContext typePara2e();
		}
					return getRuleContext(2getRuleContexassBodyContext classBody(		pu) { returnrsContext.class,0);
		}ner ) { returnass,0);
		}
		public Tyic L) { returnrn getRuleContext(ClassBoRULEblic stati}
		finally {
			exitRuic int h (RecognitionException	ABSTRACT=1, ASSEc Classxt im _serRest",dATN =ULE_"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef lisd80\uaadd\3k\u0501\4\2\t\2\4"+stener) t\3\4\4\tssDec5\t\5\4\6\t\6\4\7\t\7\4\b\t\bDeclaubli4\n\t\n\4\13\tner).ent1assDf\t\f\4\r\t\ritRu;
	1	}
1		@O1verr20)lis0r in1)listenerr)lis2ner).ent4\2erCl2assD2ecla2sDec2on(t2his)2;
	2	}
2		@O2verr3stan3eof 3avaL31JavaListen3r)li32clarerClaassD3ecla3sDec3on(t3his)3;
	3	}
3		@O37\4 \t \4!ner).entt!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+tener).en,\t,\4-\t-\4.\t.\4/\t/is);stan6eof 6avaL6tene6r)li6Cont6erCl6assD64e(ParseTre6sDec6on(t6his);;
			}
6		@O67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=JavaListe>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4IClassDeclI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tTJavaListeU\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_tener).en`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\3\2\5\2\u00ce\n\2etSta7e(289)d ClassDecype(f\2	if 		}
	tRulee();
				}
	7		setState(294);
a		_la = _i3\(JavaList3\3\7r) {0df\n\3\setS16State(e2eeLi;
				setState(293)4); tyhis)EMENa	}

			stypeLi; typeList();
	92);		setState3\5\7\5);
fvoid5\f\5h(IM	}
		7ParseTreeLi5			}		}
		}
		batch (RecognitionEe re) {
			_localctx102atchner).ent(Recognitio105errHandler.reportError9atch (Recognitio10c re) {
			_lner).ent5y {
	10atch 3\IMPLgnit6rn _lvoidIMPLtSta
		}7rn _l8\nc clabrsCon5\bner).entn _lc\nConteClasext {on(tu0121oid et {
		public Li5t<TypeParameterCtends Parse2	}
ypeParamet32); mts(TypePar1);u013st<Tn\92);16rContextRulen\3	}

			s(TypeP);
	xt typePr.recntexxcep);
	setSeturn 7\fint 4ocalfTypeP16, re);
		ontetypePsetSr;
		}
		pub5\rxt.cl	}

		public TypeParadetersCon		}
		retpePar5ocalublic TypePar5ic T		}
		publi(IMPLvokingSt7ngSt
			a);
	, re);
		16c int g
			d
		voking7;
	ypePa6ocal1uleC1
		} RULE_ttypeP17TypeParamede
c vo5 }
		@O1); void enterRule(P@Overvoid20{
			7
			LE_t type0, re);
		20te(29tener71		_la		if 1ener)listen5er)l ((J		}r)listener).entertends Parse7@Over)listener).e3ner exitRule(P7ner u018st<T2etStaate(29Listenener).ent	_latRule;
	2lass2(int 8amet2,i);2x() {istenerber ineof Javr).exitTener).enter2
		2();19er listen2 {
	
	}

			_la
			sContext tyctx;2etur2
		}
		r

e
		ameterseters7onEx

 typeh (R2ecogn	TypePaavaLisameters() throws Recogavoid new TIMPLgetState());
		enterRule(_localctx, 15tateontef\nner).entgetSta {
	ente2ypePabic Tt _la;
int _la;
la;
7	try {
	}
2uleC2xception r6	try {
	exituterAlt(_loca		try {cocal		setState(299); typePxt(_cxception 3publandler.sync(td ex;
			_la = _5		_lypePleCo;
			_la = _inptRul3				{
				s) {
;
			setState(300);
		3	}
d	}
3stenpubl6OMMA);
	exit3ener).enter3
			3ListMMA);eocal		}
	tion06);
				_errHandler.sync(t5
					s9peParameter6);
IMPL
			}
			se7	}
			s92); 6tStaint g307); fTS);

			}ter();
			
			}calcon re) {7e) {	}
				suleC3
		}ocalctxeParamn re) {
		ter();
			7\3 re);5 \u0203\n);
	r.recover7	_errH9ndlef \16	_errH	exi.recovner).en
			_errloca.recover(!localctx\rHan}

	7\Reco21@Ove
		8); m statid listener i"\3#ends Pa5#stat22\n#\3$t {
		7$uleCo7\n$\f$\16ic TerPLEM$\3%exitRule(%\5%uleCoe\n%\3&arser.Iden7&stat34\n&\f&\16er, 0)7\1rser.I5er, 0)a\n&		}
		reer, 0)c }
rser.Id\'leCont(t(TypeB7(stat45\n(\f(\16Contex8\1(TypeBoner).eneBoundContexd.class,0);
		50
		pu5uleCon2.cla3)invo5)leCon6\nvokin3)ner).enteingState)b{
	7State)d{
	f)\16State6text)\3* int +etRuleInde7+ide p8	}

			+\f+\16{ retuenerRuleIndex,ide
		pub5,stat73\nic void e5terR3-eeLisner).en-\7-oid ea\n-\f-\16r) {
ndex-\3.ance5.statner ceof  ) (/JavaLis7/vaLisrn RULE_ty/\f/\16r)listenervaListen5r)listfterT
		}
		@92erridULE_7ULE_publ
		}
		rnULE_fULE_16tRule(Pa
		ULE_if ( listener inst1xitR(1);2arame61er l}
		@OveteneaListlctx =6d extTypeParameter(this);tRul}
	}ypePpublic
			al Ty {
			ent7ypePenerner )sten6te(30t typeb).exitl Typctx;ctx;
	}	TypePary {
			e	TypePa5t _lReco@Ove _localctx = new leCo _locacalcStat8);
		e78 newcener).entn8\f8\16Rule(_peBo8\39eter);
		i:t _la;5: newd0\n:\3;nterOuterA7;y {
cognitionn;\f;\16localc9\13;\5localcb
			(309); mateh(IdentsetS<ate(312);
			ner).en=\3=\7= newe9\n=\f=\161);
		exiut.LA
			>\7> newf1\n>\f>\16		setStRulner).en>{
	3>\5		setS8ate(3? typeBound();
	5?\u0300\n);
				}
			}4

		ner).en
				}
			}8

			}
		}
		cc

	}
			}e

		@re;5@
			12\n@\3A (RecogniAr.repA\5AerrHa8\nA\3BrrHanCler.recoDer(t7D
			ist<D\fD\16 re);tRulDner).ente(this3E
		}
	5Ere);b\nE\3Fctx;
	}G\7G
			xt.cG\fG\16ublic tRulG (RecogniG

	tendH ParserRuleCo5Hblic e\narserRuleConteRuleContext {
47publiner).enblic TypeContext type(intext.class,i);
		}
		public Li6t {
5cpublt parentH\1TypeCondontext {
61public tRuleCo4public TypeConte7RuleCoapublf{
	type() {leCondexxts(TypeCon70xt.class);
		}
		pubParaTypeBougStateate(		return getngStatetext>			super(paferRuleCoc int getRuleIndex() xt {
89publicner).enteetRuleIndex() { return lic verride
		public 
			rListener listeneeBound; }
		@xt {
antextsInceof J7Iner i6\nI\fI\16isteneate(eof Javaer).entner).enI\3J(this);7Jt(Pa
			J\fJ\16}
		@6\1thisKid exitRLle(Pars5L
		@e\nLner).ente(ParseM			if (7Mt(Pac5\nM\fM\16tener 
		M\3N\7Nener b\nN\fN\16((Javae listener Ner )und(this);
	O\6Ot(Pad6\nO\rO\1}

	p7}
	}

	pbblic finalhrows Reco3dc\3PgnitionException {
		TypeBo5Ps Re			iP\3Qcalc5Qntextd\nlctxner).entex = new Statlctx (_ctx, get5tatetx, get7tate(R20, 5R, getb\nR\3S\7S) throws Refe\nS\fS\16S {
0avaLS);
t(_localctx, T);
	U	{
			setSVate(314tError(tV {
11\nV\fV\16
			setRulV\3WHandlXr.synY(this);
			_la = _input.LAner).entehis);
	5Y {
rminhis);
			_la = _input.LA(1)ate(315); match(=BITANrtError(th{
				{
				{
				setState(315); match(BIT
			_la = _input.LA(1);
			while (_la=				_la = _input.LA(1);
			}
			}
		}
		catc=BITAN62\nr.sync(this);
				_la = _input.LA(1);
			}
			}
		}
=BITAN74tate(316); t;
			while (_la=7dler.rctatefY\16dler.r pubY\3Z		}
		finally {
			exitRulener).en}
		finally {
			exitRul5Z {
94\n

	publi6 sta3[numDeclarationConner).en[\5[publif\nds Parseinst[\3\\	publ5\\text t> tblic Tpublic TerminalN			}
			}\\7rminalNRule\\f\\er)lminalN pubublic Terminalb(thi\\3]
		5]peListx, 1);
				re(Typ^ListContex7^peLise\n^\f^\16ass,0cavaLstContext.ctsContext ner).en.class,0ca
		}
		publicndexontext.class,0d1
		}
		publi
			_^\5.classtx, 1);
	^\3_inal5_classa\n_\3`r() { reaurn getTokeb(JavaPa5b {
e6\nb\3c\3cner).entec\5cIdentb\nc\3declaration5d {
StatContext e3umBo3eons() {
	5eext e = _input.e\3fxt(E5ext.4fd\n(EnumionsCotRulu00b0giste\6\xcepic in20inst2ation3nceof Jav{
	s Re \"$&(*,.ULE_62ionE668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~clas8nceof Jav inv(289)8();
8= ne08Rule08aublic Enu08turn09ule(09(289)9();
9rride9rn RULE_tDecl int 9etRul9Indexa) { ra(289)a();
arrideapublia int aetRulaIndexbokingState);b(289)b();
brridebpublib int betRulbIndexc) { rc(289);();
crridecaration; }
catate7\6\2  ,,ext p0ic fe
	ext.cntext24#%()		set);
		_lclasc Ennceof Jav26
		i
			, re7\'lara\2).ex23**etSta65: voiQT voiGHinstUVZZ voiSTtener).ent2EFLMinstKKNNinstDD[ener )_typ57_la n(thdetStanal ();
			if tionCrrideetError(thisionCon.Ide10setStaogniConte);
	ognitiext.c) {
	aratietRule1onte(JavaListratiotener1c final En
			if2carationCon	}
ndlertionCon07); , 0)	entalctx = ne			i014Conteation3Liste5etStaion);	}
tType;
		tr07); 6 _locctx, 22, RU	_er17e();
tStaverridc final Eic T18tion setSer, 18;
		matcCont1a3terContextatch(*denti); match(void1b		setStatavaL1c			setStatRule(1c8	if (_la==, 22, RUL);
arationContMA);
ption {
	 = ne1d RecognitRule1eENTS) {
ry {1				}
			 match(<alctx			setSta		set0		setStat_err2eption {
B
			s _la;
				exitRul			s); match(FuleCoption {
xt(P22c final E}
	22 RecogniteLis2ionsocalctx = new((Ja25		enterOuonte25ption {
_typ2			enterOuTate(3ption {

			27ers(this);
==COX1);
 _la;
			pub27); match(ic Ty29		enterOuass,29 _la;
					{
						} Recognit.Ide2a _la;
		text2aENTS) {
ext.2aa	}

		h new 2ier);
			setStj new laration)l new ); match(Cont2carationCop}
		ENTS) {
pePa2cf		}
			}

		lic 2d		enterOuv);
			enterOux);
	 _la;
		z	setS
		enter|) throws Re0c final Et, i31		enterOut involer.rption {
	e);
		}319
			}

			set		}
		@O3t _loc	_errHand= ne3;
			if (ride publ32MI) {
		ublic int32; }
		publy {
			ex Enu3{
		y {
			exturn3aarationCondex() { 3aantsContext e9is, re);
	3a Recognitirn RULE_3b
		enterRE_enumDe3blocalctx;
	}9turn cd exir);
			setS}
		@Ov3cctx, getStOverride3d		if (_la=de
		pu3; typeList	publiint _la;
		 _la;
		t void en3flocalctx;
	}erRul3fContext> enum(Pars40calctContext.class);TreeL40cover(thieeListene4			_errHanener list41tContext enumar).exitTy
			t() {
			retbs, r4getSta	}
		@Ovtate49tContext enuminsta4 ParseContext.class);ceof 4beportError(thavaLi4b;
			_errHantener4bontext parentb; }
		pulass);
		}
		@Ovturn dnally {
			eener)4d();
		}
		risten4etion Context.class);r).en4elocalctx;
	}erEnu4fantsContext ecvoid ft(int i) {
	c			}
			tRul
		}
		@OverretRulceist()
	public f ( liParseTreeLisJavaLi;
		rEnumConstants(tIndexd	public void eext.0dut.Lis);}
	}ner)liContext> enum			}

		);
		ConstantsConlic finants() throws Recog;
			_errHandtate(2ENTS)Context.class);d();
tants(this);
d	}
	d299)xt elic firridentContext enumdtError(th==IMPLe(_localctx,publid public int g
		try ontext parentd9E_enu _localctx = new ==IMPLntext _lo	{
			se.Ide0dc
				xt.clascognConstants);
JavaLdRBRACE);5jS);
			semConstnvokingState)d	}
	eantsContext ee) { ravaListener)lieokingState);itionExceplt!=2 &t!=2345);
			_erect(_inpu.runtime.atnPLEMENntex"1);
			{
			se();
	5mBod6ublic fe	}
	e6\7Aalt!=org.lctx.runtime.atncalc0a = _input7tStalt!=org.publieandColt!=org._locant(int i) {
					} mConstants);				}
					_enally {
			eestantee		{
					{
etRuled\7C				}
		JavaLef\7Ulocalctx = nlt = greter(this);
						}
	Context> enume	}
	fNVALID_ALT_NUf) { rf}
		@OveState(341)ff Ja		_localctx._errHaListtRul_errHa.clas		public void fener).entionExer.reportErro	}
		345);
			_er
			exi public int gfrridele(Par1);
			{
			sf					tate(328);
	}

n _loc5instanc
		}_locafxt e);
			_errrHandler.syfontext parentfstantf();
		}
		rfetRuler) {
			if (n getRuc finblic static clasJavaL
		}
		publif		}
f	}
		catch (f	EnumDnds 30\rerRul10	return getor(t
		public10(1);0NVALID_ALT_Nor(tndler.
		}
		publ(int 0stantContext.class)entifiertants() throParsifie public int ler.ken(Ja
		public Lcognition
			re 		puic Tercalct09odyContext.clt extConsta	public L_loc			e { return getToken(tStaAnnoContext.classContenally {
						rtRulnvokingState10r) {
			if() {Context.clasJava			rev<		retur		}			rState(341ws REnumConstanctx);
			}ontext p	}
		catch ontextAnnotationContexent, i);
		}
		pubent, ir).exitTyContext.cla1
	pueIndex() { (1);1, re);
			_11	@Over).exindex() { erContextenumCorn RULE_enum(int 1antsContext 
		);
			_errHa11urn _l8his);int invokingSContext8eturn RULnumDecstancern RULE_enumterEnu }
		public 18xt parent,rn RULE_enums);
1);
	nstanerEnusCont1chis);
			_xt _tRule(ver(this, re);
	( listen);
		}
		pu1cr) {
	tener).enlic Ene;
	stener).enntext listener)7textener lext.c).entetiontext(_numDecContext> enuenumConid exi) throws }
		@OverrisConte) throws hrows avaList throws (int ers(N				mConstxt _lo { return getTokenx, getSmConstant(thi	TypeP2xt arguments(ule(_ltx, 13tContext _ 24, RULE_eturn5\"EnumDenumCon
		intantContext _
			{ontext paren;
	ndleaier);
			setSt.sync(tndleb\5$= new t.LA(1nitionException Enu12d\7Few EnumColic E
				{
		5final			while		}
	f\7Bew EnumCoext.cput.Ltion();
		enumDe2); matcint invokingSA(1);		}
tContext 
		indler.A(1);
			}
			notationConte3(int i
		}
		rtState(354);te());ner) {
			if				_ltateE(1);
			ener)tState(354);enterOuterAl3ablic final 3
			39x = new EnumC3r.synrserRuletext argum
				his);
			_la = _i_input.	return getRu3b_ctx, g			{
				{
	41ontext(_ct3tate(3r).exitTy7W			{
			ntext40y();
				}tate(3xt(ArgumentsC4numDec		{
				setS4}
		@Overri(329);ption = reumDecner) {
			if42meter()e);
			_(int 4seTreeLint invokingS4, get4{
		ler.recoveist<A48blic final 407); 4;
		try {
		4enterOuterAl4(_localctx, 1)4
			4
			setStateationsC
			_errHandl4r.syn4(this);
			_la = _i4input4cA(1)yDeclaraliste4dretuate(294);ContssBodyndler.recoventext.class,4 re) {
			_lolic E4ndler.reportErntext50	}
				set4ext.clner)listener).exitE<ClassB5;
		}
		pub5numDe5ner) {
			if5ror(t5e) {lic En() {
nterRule(Pa;
				}
() {
	leCont		return get(int 5rser.Identifi5, get55\7>larationContext5.LA(1rationsContetRuleI9);peBo
		@Ove5terEn58	}
				set5
			5			}
						super(parenr.syn5
		finally {		@OuleIndndex() { retliste5er instanceof JavaLiclarati
			super(palic 		public EnumBlic E5eturn getRuleeturn16	return g {
			if (BodyD			indler.recov=IMPLE _input.LA {
			of Javner ) ((Java}
		@Overri}
	}r ) ((Javaner).erser.Identifi6(int 			enterOut
		puRule6\7RBRACE);tener).eist<A6
		}
	ca	_la = );
		n {
ic void exaListeeIndex() { re6enterOuterAl6
			_errHandlLE_tysten);
			whil6r.syn6xt arguments(ic fina);
	ner) {
			if ( aLA(1);umBodyDeclliste6farserRuleCo6
			6epare2());
16lic E6blic static class E{
	 ((Javions() throwext.c6LE_enumBodyDeration7;
		}
		pub7tionContexeIndex() { re7nterE6umBodyDeclara7aratioic cl
		ns);
		atio5blic int invokingS7ener 7RULE_Context e7ist<A7rser.Identifi		setSt
			setState7t> annotatio7
			_errHandl7terEn78x = new EnumCrRuleidelocalctx, 1)7r.syn7e
		publicandler.syn ((((_);
		}
		pu7urn R7eturn getRule7liste7c{
	eListBOOLEner).en;
	T) | (1L <lic E82ontext(_ct7= new 		}
				set7ext.c8dy();
				vokingState) (1LL << CHAR) 8nterE8rser.Identifi
		}18;
		}
		pub INTERF		pubner) {
			if (8nds ) | (1L << ener 8		}
		@Overr8ist<A89text classBxitRu1tener).ent	EnumBodyDe8terEn8
			setState publsten< PRIVATE) |r.syn8eIndex() { re8 = _inputANSI);
		}
		puc int18
			super(pa8liste8
			_errHandlumCon18derRuleContext pare8d% << SYNCHRONI= new92 PUBLIC) | (ext.c9

	301);1L <<() { 18RBRACE);
			}
}

	pParame< PRIVATE) eturn - 6 (1L << (AT - 68))		public Enum9enterRule(PaIndex() { retrame(AT - ssBodyDeclarTypePa6				ntifier 6Contenstanceof JavaLi9terEna4arserRuleCoEnumCgnit
					}
19r.syn9xt arguments(		}
					}
			}

		 _input	catL << SYNCHRON9listeaList@OverDtion re
			9er in\tener ) ((Java9lic E9
			super(pa
		pualcterrHandler.r- 68))LE_enumBodyDe		}
			return g< PRIVATE) lic v1
		public Lialct
			exx;
	}

	p

	p4\5*) {
dentifrrHandler.syncx;
	}

	pry {9
			_errHandlontext static class I4)
				_errHandler.sa_localfc vo2
		@Ove(Parsurn g.turnationCnc(thi(Rec	pub			whilTreeL1ar.sync(thif ( l			retuar.synclass,);
	ationC) {
clas{
			retuaceptiofmConstters() {
		
			classParserRul1alic Eclassurn getRulner) 			r
		public Ty getTocognitionExJavaParser.Idents ParserRuleCo getToxt arguments(ext int{
		public TyinvokingStaetRu; }
		public InteL << SYNCHRONext int
			super(paext intContext.class,i);
1af+ceBodyContexverri
		ntext(_ctbublicblass6parent, innt, intfier, 0); }
		publnvoking(this, re);
bry {mBodyDeclaleIndexeInd			entreturn throws Recogba\5Z.return 07); b7\7?faceDecla;
			{7@faceDecla
			b
			}

			set
			{h(LT);lic int getR) {
bxt arguments(vaListeL << SYNCHRONblisteb| (1L << (Identifier) ((JListaration(thislic Ebener)aceDecla= newc0\5X-return RBRACE);ride
aration(thisext.c		}

			istenersten		public Enumc(1);
4\5xtends Pa(pare(JavxitInts);
				_lacry {nstantaration(this););
				}
		_localctx-inal Interfacist<Ac, 1);
			{
	erEnu1c7 getRuleContc7void
	}

	paration; }1c9blic final ctenerccOverride
c) {
cblic void exclistecdarseTreeLicntext.class,c}
		@Overrid listxt(_tion {
		Inlic Eener)lle(_localtRule(f\5erContext6			whilc(Jav, RULE_interinal 1}

;
			{
	( li01dBodyontext typeds,0);
		ner)listener).sCont1d4ingState) umCon1d5\5Bocal;
			s
		etState(3411	public Teener ) ((JavaLdterEnd(_lostatte(371
			( listener in				 typePlctx, 22, RULE_rame) {
e(340); enumC		setStaL << SYNCHRONnstan1etInterpreterypeP			_lfier, 0); }
		publrHand	set58		if

			= neweParserRuleCo).ada		sesetState(373tener listenavaListener)lsetSr)listener).ex.antl1e9	tryt _la	}
atch (9\5> ss,0);
		}
MBER gniti@!catch (
				s9text(TypeLis
				ion =onstantCe07); m9
		}
		rrminalNode
				this,r() { returstant
		aceBody();

		});
				}
		eterfaceDecla.v4.runtime.a
			exi | (1L << (AT
			exiken(JavaParse
			exi
			ner) {
			if (
			exirfaceBody();
 {
		public Te) {
ebingState) 	_alt1flistener i<ocalatch ( {
	dapt
				sett(_in mattext.class,i				seinstanceof Jaetener listen		public void1.exceype(peContext.class);f
		finally {vaLi01itRulener) {
			if (or(thclastContext(Parry {fs);
				_laf4;gState) {
		);
	Annotationlic final ;
	}1fc void enterss Entx.eeTreeListext extturn _localct1getRuleCon			_erverride
		p) {
le(ParseTreeLeTreeLisL << SYNCHRONn(int1nContext.class,i);
	_erener) if ( listeneist<Tfes, rstener )= newff\5H%tener )f=A(1);
			if (_la=20ule(P0kingState)2lass,tRuler(parent, ch(Lvoid eration);
20s,0);
		}reeL( listener iry {2arser.IdentifListtenenterfaceDecxitT(thi@Over}
			}

	tener020c void ente Typ re);eTreeList2nnotateneener)listeneters2ontext.claener)listene) {ws RContext _localctx L << SYNCHROext(tStastatic class
		TypeList_local		enterRule(A(1);0blic void e
		i	}
		rseTreeL);
eList)
				}
			}

	uterAlt1f ( listener 1ule(PrseTreeListen);
ate(2arserRuleC212h (Recogni		setState(JavaLant; ;
			{
inpu
			5tionExhile (A
			setState(inal 1xtends Pa5D#=COMMA)t typ1okingState)OMMAtatic (380); matn {
e);
		}
		@21rrHandler.s2clarationCo
				ype();
				_errHandler.terRule(Pars21cC
				_errHandler.86);rrHand _input.LA(1try {).enF$	_errHaerAlt ( lerTypeLicalcleConsetState(		}
		tion
			_ _input.LA(reportState(.exceptio2Eror(this, re)JavaL2rn RULE_typeList(thx, ge2 {
ListConte	Typeermist() throwule(_exitrrHandler.re 24, RULE_etifirrHandler.reState{
			setStattends Pasync(this);
29G
			}
			}
		}
nput.tendrrHandler.rendler2e\5J& ClassB ((J i) {class,Y ClassB	catc2xtends ParrHandler.reBodyDe = _input.LA(2eInContext.claserAlt3btext class2enumD2etState(35rHandler.A(1);232A);
				se
		i0); ration() {JavaL int invoking2meter();
c TypeionContext.cs);
e(ParseTreeLissBodyConitionExceptierAlt2ter)ntext parent, inTypeerRulet parent, inStategumern getRulen {
.LA( parent, inublic void ;
	lic int getRclassocalctx,			supendler	setState(354rride
		}
		public ArgumeRulener );
				_errH}
		23e	setState(23eKeturn RULE_clerAlt4}

	public final240Meturn RULE_crror(246\5P)assBodyssBody3);
		}
		er(th24
		}
		rst() throwly {@OveterClassBodys);
4ublic int getalctxstenstener instanass);
		}4		public Clas4r(par
			return g( linstancBody(this);n {
4e\5Rner).en*this);class4b
		public vndler4darseTreeListlisteubliody(this);	catc5State);
		}
		@Ovl Clion {ew ClassBodyContexrror(this, reClasslassBody(this);calctx = nBodyCox, 34, RULE_(this)aListener ) (	try {sync(this);
52O
			}
			}
		}
BodyD2rser)listenerext(Pe) {5T+CE);
	s);
clarationsCon
			_erifier, 0); }
		pube) {.LA(		int _la;
		xitCla8ptivePredi ~0x0 &&uments();
25uleIndex() {{
	e(391);
classions; }
	 << BOOLEAN (Recognitionclara		}ocalctx, 1);
			{c Enu_la) << CHAR) | 	catc ( li< CHAR) | Contelic void ente1L << FL| (1L << (Identifie25fQ FINAL) | (1Rule(P			while ((((_istenetion)Listener2			{
			SNATIVE) | (1L; matonte
				seIC) < SH9\5V,L << SHs);
list;
				sestener ) (retur(1L << STATr(parener ) ((Java< SYer; }<< TRANSIENTn {
r)listentx, 1);
			{(1L << lassBodyConte6class6t(_ctx, getStws ReLBRA || ((((_la liste6erContext=LPAREN) 26dU& ~0x3f) == 0Conte7Context(_c2ratio272aLisL << BY7n = r7}
		@Ove	pub)) | (1Leport7ule(ParseTrons);1L <FINAL) | (1	setStantext(ParserR7ontext exte| (1aration();
ORT) |		int _la;
	(393);rror(this, re75W
			}
			}
		}
71);
7b		{
					{2nc(th2s);;
				serRule(LA(1etState(394n {
7numDeclaration() 	}
		ener ithis);
				ndler_errHandler.sption = t(_ctx, getSt BYTE) | Ycalctx.except	catcSTRACT) | (1LtStaaLis0(_lohis, re)erAltNUM)\\c vo
		}ut.LA(1);
	rror(this, reis, r	exiocalctx;
	}eport<< PROTECTED) IntdyCo3\7<rseTreeListener8umDerfaceBodyCoORT) 89
		}6etersC2| (1L28(1L << STRICxitRustener).entfaceBodyDeclr(par
			setStafaceBoameter(xt {
		publn {
| (1L << TRAN2IENT) | (1L 2< VOID) | (1L
		}ic L		int _la;
	< LBRBodyxt {
		publliste != Bnds ParserRuleCo	catc8f\5`utergetRul;
		}t(_ctx, getStontexts_localctx;
	}tener listeblicxt {
		pub() { blicrn getRuleC - 68blicpublic InteraListe_enumConstants; }
292]ontext parent; mat9);
1	}
{
			ORT) 
				{
				singS {
	larationContext.clanumDe
		() { return RULE_i(1L << ENUM) ync(t2 {
		public etRuleIndex			}
			}
lic voiule(a1L << (Idee) {29bn re) {
	9b_terfaceBody; _localctx, 3r.repte);
		}
	catc		_errHandlerlistener).ody(this);
erAlt	finync(this);
			_l	publi ParserRuleCoisteener		public Intepublie(336);
		 {
		arseTreeLisaule(ParseTrontex2is);h( listene typeP5n re) {
	a5lassBodyContetifier, 0)blic
		}
	
			_er2a.reportError(tTreeL2aoverodyContext in9		int _lafinal Interfist<Iaf(LBRACE);
tCont2acx3f) == 0 &		pubePar_localctx =A(1);clarationContext.claext icognRule(_localcreeLisocalctx.excepaceBodbte(388); clasgState);g {
			enterOstenerrror(this, renvoki2bnt _lsetState(3i
			setState(lass);
		}inte0);396); nt gebc\5lterf396); = new 9
		finally Rule(w Ty5n8	InterfaceBodner l((_lar:a = _in {
	nt() {
			re& ((1L <ublic int get ((1L <		{
				setState(3w TyR) |xt(InterfaceBterInt(_c7nsta | (1Llistestener) {(1L <<~0x3f) == 0 ocalctx.excepbdkLOAT) | (1L <tx, 36umBodState(39bfm RULE_interfc	}
		returnc5\5p9 (1L <<eportceturn getRulterfa2ener< PRIVATEstene
		}
	}NATIVE) | (1ORT) c(1L << ENUM) nterfIC) | (1L << STRICTFP)	}

	publicc6ovoid exitRule(Parsecr(par			if (_la=tState | (ationContex(1L ))) actx.exceptistener liste2cb << _la) &cbq| (1L << SYNClistednds Context(ClasfaceD((1L s);
	8)) & ~0x3f)		}
(1L t	fintch(R- 68)) ) | (1L << T)))) !ocalctx.excep{
				int getRuleIndex() 2d0saceBodyDeclareportdationContexts Rec2etSt< _la) &sCont2dener).ent(RBRACE);umCon2d6;
				_errnt ge		EnumConstan _inetStat			setState(class ClassBntContext enu02);ecogublic int gettate(atchception re) != 0)( listingState) {
			setStateception re) .repor_localctx.excendleretInterpreter2dAL) | (1L <<dehis);
				_| (1L = 0)) {
				Rule();		int _la;
	
				2		setS
			_errHandler)))) etSt instancee0uError(this, .antl2e2andler.sync(Reco2eoid exitRint _la;
	2MBER 2 {
< SEMI)))xcept2				xxt c() {w extends Pars403);				}
			ionContext
				
			5zetStss,0) | (lic TypeConte
			XTENDSst<ModifierC68)) & ~0x3fnt(int i) {
2
			2nc(this);
		ifie.claocalctx.excepi);
ts(Mstatic class Classt(_in2ener instanceeey modifier() {)))) fxitR
				set2.exce2tRuleContext {
		pubrserRch(Eontext modif}
		pubi) {
			return ge | (1L << SYNf				}
				}mConstantContch(E	returblic ClassBont gef8\5|oid arse403);f8arsertx, 1);
			{ss EnclarationContext) {
		}

	publicf8{rationContextontexAnnotationL << (IdeTreeL2t {~Tree{ retu{ rec			_errHand) ((Jion ngState);
	erContextion;c TerminalNod2t(thi	}
eclaration;.class@Override
		p))))	}
static class Clas	}

		@Override
	3lass,3Rule{
			ret3{
			catState(34130ontext extedyDeistener)listry {	catistener)lists,i);vaListener)list << 30299)ationConte getRu3finalion ion(this);nititancistener)list) ((Jaublic int ge30ParseTreeLiListener listeneonte30ber.report3calctalction(this);assBl Cl
				}
			}

	ionConte> modifier() thron(this);
		}
	}	catctext annotatiClassBoderContexteclarationContexsten = new ClassBodyDe
				setStatssBodyDeyDeclarationCor).exitT}larationConter ins1Body invotateDecls, re)aration)2
		er.repssBodyoid exitRule(Pars _alt;etState(379);
		(_la) getInterpr void1mberDeclara31lass);
		}315
		finallyase 	ent7BLE) | (1L3	{
	
			ation)4ivePOuterAalctx,	setState(417);
		tate(4.exitClassBodtStat0public staticrecoerOuasetState(33		setState(30 | (1L		enterOunContseTree(294		setSionEx1d;
				_e);

		.enterEnumConstantsle()
	pu((1L << (_l3		_lo;
	ation)8LPARSTATs, re)rror(this, r3n {
		EnumCy {		setState(4}
				}				}
				break; | (1L << SYnter(_loTIC) {
					{
				x, ge	breOuterAlt(_loerOut2		setState(dler
		().adaptivePr class Class_location)a
		).adturn _aptivePreHict(_interAl5,_ctte());
 _lotInterpreter(alt = getInt=org.a.exitClassBodATN.INVyDeclarationCn(int0ionContext> ipublic stat{
	arat EnumGict(_inBodyD2edyDeclarati		}
0ext(Interface3yDeclc st
		}
		rte);
		}3enumD
		setState(40A(1);ypeBr.sync(this)				_err_alt = getInt				{
				e(ParseTreeLiput,;
	x, getState() = _istantsContext 
		rati6\5N TypeParalaratix, 1)37_localctx, er(pa08ocalctx.exce3tate) inscognitionExce3RuleIndex() 3gumeTE) | (1L re;rHan	setStatext(Cla3ride33c		}	_errHanmConstetState(415tError(this, BodyD) {
				{
		finallyaListener)listch (3andler.repxception = r					4ener listenc cl re) {setState(40rror(34eTremeterext exext exoid exitRetStaa8UleConte			});
tx);
				whily {3			exietRurfaceDon();47er(this, re);interfaceDx, 1) JavaListenereDeclara().adaptivePrexitCrationConte				{
				
		}34		}

			sontextontea 1:
				enlassB34aptivePa0QationTyxtends Pars3ontet(_localc {
	3laratxt(InterfaceDBodyDationContext exsetSt4f type();) | (1tionTy					51L << (faceDeclaon() 35 {
			_
				whi	try public {
					{
				
		}35ner per(pxt.class.clan = re;eContext(eclarrsertext co				{
				
			_3Statration() {
		x, 1)57dyDeclaratila) &public Construc& ((131L << ABSTJavaL
		}
		peDec6mete			_localctxBOOLEonte enum9068))) {re);
	}setState(417);
	c Enuturn larationConBodyD(1L << CHAR) }
		pubaListener)lis5invokingSta3<< FINAL) | (3BodyDCont		retu4K getRuRule(n() ss,0);
		}Contextions(thisenericMethodalt;	public void 3ide
	}
return getRuleCpublic_localcsBodyDeclaratmethod
		}
		@Over	}
ontext.class,0);TIC) 3listumDeclaratiTFP) | (1L <3ner inst96L
		}
tate(6aptivePrlocalctxT) | blic		return getRu6exception = al EnumBodyDeblic(ParsegetRuleContere);) & ~0x3f) ==torDecla	}
		public Argumes,0)c Cl(GenericMethodBodyD1L << VOID) |368))  parreturn getRuleCtener liste() {eclaration()) {
ate(388); clalassontext.class,0);
				3r - +		}
		public Cons);3
		ration() {
	try {377e(406); mat(393)te) cConstcOeclaration() 		setper(MemberDeclarx, 1)_errHandler.sate)
		}
RuleIndex() { retuRuleIndex() { retur3rRule3localctx.exce getx() { ic void entext(GeLEANenumCoPsBodyDeclarattion teneic void enteassDe _localctx;
publistene) ((JavaListener)lint getRuleIndex() 3);
	3FACE) | (1L <ner 		public void entis, re81r.sync(this809); block()ationContext edler.r ext << r instaninstlaratiofaceDecla}
		f85tRuleContext(Ilocalctx| (1L
			if ( listenex, 1)88fierf JavaLi{ retterfre);
	sBodyDeclarateturn 		_alt = getIneclaratetRuleIndex()odyDe3< VOID) | (1L	Mem(thison = re;
			_err3< LBR38c\7rrid= new assDe8eportError(this,
			38r();
						8t genericMet			if ( listeneublic9f JavarationCtext { ((1ut,36,_ctt, in
			torDeclarationCont			swit413);
				_eeturn3
				{
				s37,_, RULElctx = new9) ) {
			ca			sner i	enteron();97ate(428);
	x, 1)Index() { ret(419); m= re;
			_errHandl;
	;
	n getRuleContEnumCo 1:
				enterrRule 1:
				enteronCon9	setState(ener l		}tate(dDeclodyDeclaratiConstaationContext enterf39(_ctx, guterAlt(_locsetSt9f		_errHandl	puble) {
			_
				whir) {tionss,0);
		}ldDecla = _inputtion();
				}
	
			enterOut:
				eration();
				}
	
		int _la;
3		return getR
			return g			}
	(EXTaration();
				ener ) ((Java			}
	 EnumB}
				break;
ldDecl<< PROTECTED)
				{
vaListener)li				{
istener).ente		return getRrationContextuctorDeinterfaceBody 6:
			etRuleIndex()6:
			ontext block() {
				{
		ericConstructpubli0eak;
			case 6on();ner public	caselctx, 40, RU7 1:
				enss,i);ant, );
					_		ret
						break;
x, 1)returnState(424); intenContee 5:
				entenConte
				break;
on re)stanceof Javaaexception = erfaceBodyContx, sDecaptiveP92_errrationsDeccate(428);
		pub3ad type();t(_localcate()3aRuleConrDeclaratner) {h(COMMA);stantCo get4	}
		catch3
			if ( li3b1\7X, 1);
	;
			@Ov();
				}
			}
	notationTypeRuleIblicon();
				}
				 RULExcepe) {
			_lo_errHarn RULE_membe(this07,_ctx) ) {
	etRuleCont
			_eer.recover(t		casb);
	!= 0)) {	exi
		}laratiorDeclarat ((1L0arseTreeLier.recover(tlaratbb 1:
				enterIn3bxt.clas98MationCoassDeublitate(is, re);
		ener) instanceof JhodBodyCclarationCont< INT3b(GenericMetho list3< NATIVE) eDeclaratiener)l@Override
		onstlParnt, invoaNrmalParmalPar3t {
		public MethC) | r inontext formalPaMetho final Interfr inavaLisntext.class,his, re);
	c}
		finally erEnu3C) | (1L << Srn g		puetRuleIndex()E) | { reon();
				}
				 != 0vaLi			setState(nterft tydentifier, 0	breaclaration);
3tate());
		 getass,0);
		}ic QuericConstructfaceD3numConstantsCt.cl	}
		public TypeContext larat(1L 		}
		istC.claon re) {
);
	pub2ctx.exceptMethrati		public Interror(this,sConte			_localctx.3umCon	pubener) {okingSt0);
stantsState(424); int(403)peBou invokingSt		casntContext enut getRul	}
		public dDeclaration(ist();
				}3eptioxt t);
					}
		re);	pub public int 	brea
		}
		fi public int onstan@Override
		ponstanericConstructrHandlDeclaration();dt genericMetdtRul;
	onContlarattch(ent, i
		OverriOver1		_errHandl.antlxt _(EnumDeclarationCo(Reco3ener );
		}
MBER 3e4reeL'blic voMethoe5Rule(ParseTrr(this, re)stenener) {
			Overreturn 		try {

				xt _ule(ParseTr
		rcalctxState(424); intodDeclitRule();
		dDeclaravaListener)li				} ametersContex3{
			returnlctxde
		4Sblic vo	breaext.clasa2Rblic votContnc(this);
		(_ctx, g_localctx = new Clast(_in3
		}
		publmetht _lclass Membert.claetSt << (LT - onContext _lid exi(GenericMetholctx, ListContext(Pate(		swndler.reportEturn 3is, re);
lctx = new		superRude
		6T
			cas,i);,_ctx) ) {
	:
			crn RULE_monContext _l0);

		finally {Rulearatise LONG:
			case Sontext methodss Enutext _locaier:
				{
		rt {
State(410); e pub		}
				aaVak;
		larat

	public static cl			setStthodDeclaratin(int ifie
				break;tContfstener).enter3public void 	thrault:
				tturn eclarationConter insnConte); match(Iden4tanceof JavaListenere(43eterndler.reportate(i);
		}
		publ
		ler.kingState)(thi		_lener).ent re) {
4eTree4itTy_errHand_la=) {
			sutext(Cla	{
			drn RULE_memb40 24, RULE_e40
				{				{
	setSte(4de public ineCon}
	aration() {
		ate(ber(this, re);
		}
	;
	c(thypeDeclarat
		te(4thodDeclarat inv
			arationnContext member4	try 40		}
				seA(1)		setS				{
				set _la;nput);
			}
	1}
		@Overr			_ate(443); ma		{
						setState(444); efault:
			);
te(4ctx, 1);
			{
						_ate(44				}
			}
				ognition
				{
	tate(4ericConstruc41ACK);
				s;
				{
				{
	h(RBRA		_errHandleruterA41a\bY\etRule		{tStab type();	setState7);
4er) );
			_.LA(141UBLE) | (1LaultthroRuleContext(a = _1invokingStatrHandler.reco4		_lo4nstan;
		}
atch
			} << (LT - 0);4
			_lo
			case e
	cognitiognitiotion re) {
nExcepa = _andler.re2Zognitioitch  {
YTE) | (1cognitio
				andler.re4[ognitioide
.sync(this);itRule()		_errHandler2 ((JavaListloca
		}
		return _lterOuterAlt(_ericMeth
				setStatetry {4localcate(449);
			snput,429ameterarationC			}2ablic arationCte(44istener)eportE	public statis);2c	publicrationC Enum2dd exit.class,w newurn getRuleC			}42invokingStat(GT);x, 1);
4yDecl
			| (1L << 
			i;
	etRuleContex			_lretuEation() {
			ext.
		3la - 68)) ic GMethodDnericMethoitch 35ationContext
				tate(355);tionContexticMeth		_errHandler) {
	 int invokingt, invok
				setStatetate(355); a4aration();
	leInhodDeclarationCo invok			}3aTypeP) { retute(443xtends Patant(this);4ridedDeclarationCpePa4er.re43dss);enterRulw new3ener lss,0);
		}
		turn DeclarationCodDeclala==T4ner ers() {
Decla441
		}
		c4re;
			_err) ((JavaListeCont4ext {44,i);= re;
		ratio444rHanRule(Paritch LEAN(this, re);
		lic 4eturn44			_sContext Decla4
	}
		}
	Java
		@Overridener).entis);
		}44meteext.classypeDe4laraOener list		return getRuleCstenext(Annotatio44sCon!= 0)) {enerDecld\7r(paodDeclethodDeclarationC) ((Jaturn 4f\RBRACE);xt constericu04	pub68)) | (t _l = nROWS) {
				{
	try 452==LBRACK) {yDeclaration4ontexetRuleC
					publ) {dex() { retnCont45
		d enterRu
			_4;
			_la ner)aration)) ((Jurn getRuleCdDeclla) &458dDecclaration)rn RU59ptives,0);
		}
	onConocalte(428);4BOOLE45bdDecRULE_generis);5nterfaceBodcatc(452) int invoeTrecognitw new5edDecDeclarattx.e= refch (Recognitntextof J, re);
	 listener ogniti insta0is);ortErr, re)4, RULE_geneis, re)_input.LA(1))ide
46rOuterAlt		exitRule()lctx, 44enterR8]ver(thiitch 6odDecrRuleCons CoDecl6eters();
			setStisten467\7ntexer(thistener).exitGc6dxt {
	rn RU6metennotation4() {
			ret46ach (Recogniext(Gocalctx, 1e`xt {
	is);6sConlarater(thiionEx(1L << (_laoid ente4xt cl4
		andler.sync(t68)) 4ogniTreeListokentx, 44, RULE_s);
		}
		ew Ge7 ((Jule();
	nstrCont3			setStateons);.reptate(437); mat
				}
				dy()dex() { rettry {.repctorBodyContener) 36); match(LB		set52); ends ParserRule4c int47	setSualifiedNastener).		if ifiedNamrn RULmeterd enterRu7ters() {
		7e;
 << (ext.cleContext();
			_tion Type QualifiedNaontextsetState(449);
			sntext pState(443); mntext okingSsuper(parent, i44, RULE_gene7onContext geandler.reportarent, listener) {
{ returnic QualifiedNadDeclaraent, int invokingState) return getRul
		@Over
			super(parent, clarationsCon public int ge (1L << ENUM)
			if HORT:
			ca
			if 		setState(44		@Ove	publi, int invokingState) al EnumBodyDeeclaratile(ParseTreeListeneate(388); cla public int geI);
			setSteeListen(ParserRuleConionExcRuleIndex() { ethodDarent, int invokingStethodD
			super(parer) {ic class GenepublieContexlic Cons		}
		retur4Tree	setStateclass4<< Candler.sync(tontex4 exteDeclaratidDecl}
	ync(this);
			_4lic ItorD) {
			_l| (1Llctx ntext {


	ptorD5h
			ationCc int getRulctx }
		@OveleCon4terf);
			_odyDe48return getRuionCo48bstant(ts,0);
		}
	< LBRtorDeclarationCoionEx != r(parent, );
setSeeclaration);;
		9 ((JavaLitant(this);4arati49arent, ecover(th() { lic Parame8ers();
ext c ((1Declaratiic ConseturnetState(45nceof Jrmal);
		Alt(_localc
				sic class GenerOuterAlt(_luterAlt(_localc			{4FACE) | (1L <ameList(ass,0);
		}meList(.enterEnumConstants60); con; qualifiedNameList(istener ) ((JmeList((ParserRuleCoarseTreeLialctx,xception re) {
		RuleIndex() {numDecenterRule(Par4			ca49
				{< NATIVE)ers();
rn RU9larationlic andler			}		ifstener_ule();te(44notationTypeDeclarat4larat4r.rep		exitRule();ionEx9icMearseT^ule();tate(tionConte _loic static clentifi
			_errHandleentifi		setState(44	publ	}

	publ RULE_edler.
		return _localctxleContele(ParseTreeL
				his, re);
		4
			c4is);}
		@OveerOuterAlt(_lNod(this,e (_eclaratext cc Constructor	returic Constructoraratia_localctx = new Cla4c Enumocal (Recogni				e4aationContex4erRulea		returon() onstructorDe			}terOuterAlt(_parent, ener)listener, int  InterfaceDec4		bre4tifier, 0); }
		pub invTypeLiide public itate(s,0);
		}
	{ returnState(443); m invokingStatandler.reportpeLiricConAlt(_localcverridb2\5Rntext rridctorDe
				}
			}

	stener)n re) {
			_eLispublistener ) ((JRuleI4interfaceDec4rn RULetRuleContt(Pars4cterGenearati	}
		finallyis);
		erAlt(_localc	@OverrVOLATILE) | (1L << (Parlist();
			 _localcavaList;
		}
		ret ((1L4d();
		}
	4BYTE) | (1Listen(JavaParseterIn4bc) ((JavaListnt geublixitGenerictate(<< CLASSeListener list;
		
		}
	}

er).
	}
rDeclarationContener instanceoorDen() 				{
				aration() nstancRuleIndex() {stener{
	
			re4C) | 4ener	enterOuterAlt(_loc _loicCobs);
		}
	,0);4c6TerminalNodride
s Reandler.sync(taPars4nterfaceDerDeclaratiorn RUualifiedNameL4 != 0ionCionExceptionte(44ext qualified4conContext geeContext(Typeuctote(4
			_errHandlstCon4rtError(this,uterte(462(this);
		}
		@Orn ge4cft(_ctx, getSConted1RULE_generiass,0);
ionExceptioblic 4er.sync(th {
			_locanExcepti= re;
			_errHandn getRuleContsContDeclre);
			_ersetState(457		setState(463t, in4	}
		@Overri
			ex) | (1L << SYDeclpubltructorDeclaration() getR4			{WS) {
				{tate(ntif);
			whieldDontextn _localctx;ters() {
		ceof JavaListclarpublt genericConstener4dc Formalcover(thner )4derContextate(458);
			rHandl	GenericConstr
				4(thiRuleConte		@Ov4rridecalceListener lisoid e4itRunericMeth.antlrctorDeclaratio(Reco4listRuleConteMBER 4eer);
			s(TypeContehis);tate(391);r).e}
		p,0);
		}
	nvokinass,0);
		}Context(Pa.clan getRuleCont
				4e8 FieldDeclarrn RUebarserRuleConeConteturthis, re);
		}
		f
			de p
		@Overriderride
			setState(	_alt 
		try {
			eer) {
			if falParame{
				{t(_in4n ge (Recognion);4		in}
		@Ovet.cla enu
			if ( lisnstanceoflctx,er).ionExceptio;
		}ListContext(Pblic liste
	public static cturn 4tifier:
				ener) {t genericConsrrHandC) | (1L << S4:
		4fitRule(Parntext {
:
		4flaratiolParamete	case4leIn}
		@Ovet, ination(this		{
			n(this);xitRulass,0);
		}dDeclarer.recover(thContex
			setState(AnnotationCo4dyDe	setStatelassBeclatate(437); matthrowew FieldDeclaratt(_ctx void exitRule(Parsente, 50e) {
			_locsetStaffon {
		Coner in0structontexts(E 24, RULE_envaLists Recogtant()) { r				} yConte	}
		 ((JantifiersConte	EnumDontext extens);
		liste Recogn, getS		}
	la = _inputrror(thtionsC
			ravaLis		@Override
		pubenterEistenerc finagetSta	setStZED) |CHRONIZED)  - 68))or(thitener listenontextext innvokingaListelistenhis); {
			
				s {
		pubc TypeL68)) & ~0x3f{
			ialctx 
			se(int i;
			nds Pa listeBodyCoride pcognitnceof invokingStaerAlt(_
			_erOOLEAN		}
(1L <<	setStadyDection =}

	pdyDecl		}
9}
		@Overrn RULE_ireeLis
		tr((1L <listeRICTFP))))) gnition.reporreturn) { retifier - 68)t, invor inst void ) ((JanConteener)		switc		casbreak;dler.rxitRule(AnnotationText(Fit clas			casturn grDeclaublic { retu;
		e
		r			switeclara	return getR				enrror(thmeListreturnonstangetRulctx, geclarahrow netStats,i);his, re);
			setStla==THationContex) {
	is, retext.clListens Pars
				structoinvokingStatleContext(Conrent, 

	pnstanc			exiructor() {

		}
		releContstener).exitid ente
		publthrows Recogc" int	public void enterRuer l_er listenrHandTNDeTreeListess,idlistener) (eTreeListener .to ins2, GOr=100, 1, ASSE ANTL_decitionToDFA98, URSDFA[Pars.getNumberOfDstener)s()] int for MENT", = 0; i <(Parseclaration(this);
		}; i++tected stistener).ente[i]rInterface(d exitRuhis);
	
impoi) 3, RULE_modi}
}
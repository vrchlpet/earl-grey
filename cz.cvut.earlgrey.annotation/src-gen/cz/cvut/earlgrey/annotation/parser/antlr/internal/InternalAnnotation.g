/*
* generated by Xtext
*/
grammar InternalAnnotation;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package cz.cvut.earlgrey.annotation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package cz.cvut.earlgrey.annotation.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cz.cvut.earlgrey.annotation.services.AnnotationGrammarAccess;

}

@parser::members {

 	private AnnotationGrammarAccess grammarAccess;
 	
    public InternalAnnotationParser(TokenStream input, AnnotationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Annotation";	
   	}
   	
   	@Override
   	protected AnnotationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleAnnotation
entryRuleAnnotation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAnnotationRule()); }
	 iv_ruleAnnotation=ruleAnnotation 
	 { $current=$iv_ruleAnnotation.current; } 
	 EOF 
;

// Rule Annotation
ruleAnnotation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='@' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleExtendedID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnnotationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ExtendedID");
	        afterParserOrEnumRuleCall();
	    }

)
)(((	'(' 
)=>	otherlv_2='(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
	    }
		lv_parameter_3_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnnotationRule());
	        }
       		add(
       			$current, 
       			"parameter",
        		lv_parameter_3_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
	    }
		lv_parameter_5_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAnnotationRule());
	        }
       		add(
       			$current, 
       			"parameter",
        		lv_parameter_5_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
    }
)?)
;





// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	 iv_ruleParameter=ruleParameter 
	 { $current=$iv_ruleParameter.current; } 
	 EOF 
;

// Rule Parameter
ruleParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getParameterAccess().getAssignParameterParserRuleCall_0()); 
    }
    this_AssignParameter_0=ruleAssignParameter
    { 
        $current = $this_AssignParameter_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getParameterAccess().getValueParameterParserRuleCall_1()); 
    }
    this_ValueParameter_1=ruleValueParameter
    { 
        $current = $this_ValueParameter_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAssignParameter
entryRuleAssignParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAssignParameterRule()); }
	 iv_ruleAssignParameter=ruleAssignParameter 
	 { $current=$iv_ruleAssignParameter.current; } 
	 EOF 
;

// Rule AssignParameter
ruleAssignParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getAssignParameterAccess().getNameExtendedIDParserRuleCall_0_0()); 
	    }
		lv_name_0_0=ruleExtendedID		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssignParameterRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ExtendedID");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getAssignParameterAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAssignParameterAccess().getValueValueParserRuleCall_2_0()); 
	    }
		lv_value_2_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAssignParameterRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_2_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleValueParameter
entryRuleValueParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueParameterRule()); }
	 iv_ruleValueParameter=ruleValueParameter 
	 { $current=$iv_ruleValueParameter.current; } 
	 EOF 
;

// Rule ValueParameter
ruleValueParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getValueParameterAccess().getValueValueParserRuleCall_0()); 
	    }
		lv_value_0_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getValueParameterRule());
	        }
       		set(
       			$current, 
       			"value",
        		lv_value_0_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)
;





// Entry rule entryRuleValue
entryRuleValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValueRule()); } 
	 iv_ruleValue=ruleValue 
	 { $current=$iv_ruleValue.current.getText(); }  
	 EOF 
;

// Rule Value
ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
    }
    this_Integer_0=ruleInteger    {
		$current.merge(this_Integer_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |    this_STRING_1=RULE_STRING    {
		$current.merge(this_STRING_1);
    }

    { 
    newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
    }
    this_ExtendedID_2=ruleExtendedID    {
		$current.merge(this_ExtendedID_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    |    this_BOOLEAN_3=RULE_BOOLEAN    {
		$current.merge(this_BOOLEAN_3);
    }

    { 
    newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
    }

    |    this_NULL_4=RULE_NULL    {
		$current.merge(this_NULL_4);
    }

    { 
    newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
    }
    this_Real_5=ruleReal    {
		$current.merge(this_Real_5);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleExtendedID
entryRuleExtendedID returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getExtendedIDRule()); } 
	 iv_ruleExtendedID=ruleExtendedID 
	 { $current=$iv_ruleExtendedID.current.getText(); }  
	 EOF 
;

// Rule ExtendedID
ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleReal
entryRuleReal returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getRealRule()); } 
	 iv_ruleReal=ruleReal 
	 { $current=$iv_ruleReal.current.getText(); }  
	 EOF 
;

// Rule Real
ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_NATURAL_1=RULE_NATURAL    {
		$current.merge(this_NATURAL_1);
    }

    { 
    newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
    }

	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
    }
    this_NATURAL_3=RULE_NATURAL    {
		$current.merge(this_NATURAL_3);
    }

    { 
    newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
    }
((
	kw='e' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
    }

    |
	kw='E' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
    }
)(
	kw='+' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
    }

    |
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
    }
)    this_NATURAL_8=RULE_NATURAL    {
		$current.merge(this_NATURAL_8);
    }

    { 
    newLeafNode(this_NATURAL_8, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
    }
)?)
    ;





// Entry rule entryRuleInteger
entryRuleInteger returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntegerRule()); } 
	 iv_ruleInteger=ruleInteger 
	 { $current=$iv_ruleInteger.current.getText(); }  
	 EOF 
;

// Rule Integer
ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
	kw='-' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
    }
)?    this_NATURAL_1=RULE_NATURAL    {
		$current.merge(this_NATURAL_1);
    }

    { 
    newLeafNode(this_NATURAL_1, grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
    }
)
    ;





RULE_BOOLEAN : ('true'|'false');

RULE_NULL : ('null'|'nil'|'NULL');

RULE_ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_NATURAL : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



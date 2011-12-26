/*
* generated by Xtext
*/
grammar InternalClassmodel;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package cz.cvut.earlgrey.classmodel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package cz.cvut.earlgrey.classmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;

}

@parser::members {

 	private ClassmodelGrammarAccess grammarAccess;
 	
    public InternalClassmodelParser(TokenStream input, ClassmodelGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Classmodel";	
   	}
   	
   	@Override
   	protected ClassmodelGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleClassmodel
entryRuleClassmodel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassmodelRule()); }
	 iv_ruleClassmodel=ruleClassmodel 
	 { $current=$iv_ruleClassmodel.current; } 
	 EOF 
;

// Rule Classmodel
ruleClassmodel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getClassmodelAccess().getImportsImportParserRuleCall_0_0()); 
	    }
		lv_imports_0_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassmodelRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_0_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getClassmodelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
	    }
		lv_elements_1_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassmodelRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_1_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	 iv_ruleAbstractElement=ruleAbstractElement 
	 { $current=$iv_ruleAbstractElement.current; } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0()); 
    }
    this_Package_0=rulePackage
    { 
        $current = $this_Package_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
    }
    this_Entity_1=ruleEntity
    { 
        $current = $this_Entity_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_2()); 
    }
    this_Relation_2=ruleRelation
    { 
        $current = $this_Relation_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	 iv_rulePackage=rulePackage 
	 { $current=$iv_rulePackage.current; } 
	 EOF 
;

// Rule Package
rulePackage returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='package' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPackageRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
	    }
		lv_elements_3_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPackageRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_3_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
		lv_importURI_1_0=RULE_STRING
		{
			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImportRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"importURI",
        		lv_importURI_1_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	 iv_ruleEntity=ruleEntity 
	 { $current=$iv_ruleEntity.current; } 
	 EOF 
;

// Rule Entity
ruleEntity returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((((
(
	'class' 
 

)
)
    |(
(
	'interface' 
 

)
)
    |(
(
	'abstract' 
 

)
)))=>
    { 
        newCompositeNode(grammarAccess.getEntityAccess().getClassParserRuleCall_0()); 
    }
    this_Class_0=ruleClass
    { 
        $current = $this_Class_0.current; 
        afterParserOrEnumRuleCall();
    }
)
    |
    { 
        newCompositeNode(grammarAccess.getEntityAccess().getEnumParserRuleCall_1()); 
    }
    this_Enum_1=ruleEnum
    { 
        $current = $this_Enum_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	 iv_ruleClass=ruleClass 
	 { $current=$iv_ruleClass.current; } 
	 EOF 
;

// Rule Class
ruleClass returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((((
(
	'class' 
 

)
)
    |(
(
	'interface' 
 

)
)
    |(
(
	'abstract' 
 

)
)))=>((
(
		lv_class_0_0=	'class' 
    {
        newLeafNode(lv_class_0_0, grammarAccess.getClassAccess().getClassClassKeyword_0_0_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassRule());
	        }
       		setWithLastConsumed($current, "class", true, "class");
	    }

)
)
    |(
(
		lv_interface_1_0=	'interface' 
    {
        newLeafNode(lv_interface_1_0, grammarAccess.getClassAccess().getInterfaceInterfaceKeyword_0_0_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassRule());
	        }
       		setWithLastConsumed($current, "interface", true, "interface");
	    }

)
)
    |(
(
		lv_abstract_2_0=	'abstract' 
    {
        newLeafNode(lv_abstract_2_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassRule());
	        }
       		setWithLastConsumed($current, "abstract", true, "abstract");
	    }

)
)))(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getClassRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getClassAccess().getFeatureFeatureParserRuleCall_3_0()); 
	    }
		lv_feature_5_0=ruleFeature		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getClassRule());
	        }
       		add(
       			$current, 
       			"feature",
        		lv_feature_5_0, 
        		"Feature");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleEnum
entryRuleEnum returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumRule()); }
	 iv_ruleEnum=ruleEnum 
	 { $current=$iv_ruleEnum.current; } 
	 EOF 
;

// Rule Enum
ruleEnum returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_enumeration_0_0=	'enum' 
    {
        newLeafNode(lv_enumeration_0_0, grammarAccess.getEnumAccess().getEnumerationEnumKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumRule());
	        }
       		setWithLastConsumed($current, "enumeration", true, "enum");
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumAccess().getFeatureEnumConstantParserRuleCall_3_0()); 
	    }
		lv_feature_3_0=ruleEnumConstant		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumRule());
	        }
       		add(
       			$current, 
       			"feature",
        		lv_feature_3_0, 
        		"EnumConstant");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleEnumConstant
entryRuleEnumConstant returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEnumConstantRule()); }
	 iv_ruleEnumConstant=ruleEnumConstant 
	 { $current=$iv_ruleEnumConstant.current; } 
	 EOF 
;

// Rule EnumConstant
ruleEnumConstant returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getEnumConstantAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEnumConstantRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(((	'=' 
)=>	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getEnumConstantAccess().getEqualsSignKeyword_1_0());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEnumConstantAccess().getImplicitIntValueParserRuleCall_1_1_0()); 
	    }
		lv_implicit_2_0=ruleIntValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEnumConstantRule());
	        }
       		add(
       			$current, 
       			"implicit",
        		lv_implicit_2_0, 
        		"IntValue");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleReference
entryRuleReference returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getReferenceRule()); }
	 iv_ruleReference=ruleReference 
	 { $current=$iv_ruleReference.current; } 
	 EOF 
;

// Rule Reference
ruleReference returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getReferenceRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
	    }
		lv_array_1_0=ruleArray		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getReferenceRule());
	        }
       		add(
       			$current, 
       			"array",
        		lv_array_1_0, 
        		"Array");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleArray
entryRuleArray returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getArrayRule()); }
	 iv_ruleArray=ruleArray 
	 { $current=$iv_ruleArray.current; } 
	 EOF 
;

// Rule Array
ruleArray returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getArrayAccess().getArrayAction_0(),
            $current);
    }
)	otherlv_1='[' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
    }
(
(
		lv_size_2_0=RULE_INT
		{
			newLeafNode(lv_size_2_0, grammarAccess.getArrayAccess().getSizeINTTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getArrayRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"size",
        		lv_size_2_0, 
        		"INT");
	    }

)
)?	otherlv_3=']' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
    }
)
;





// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	 iv_ruleFeature=ruleFeature 
	 { $current=$iv_ruleFeature.current; } 
	 EOF 
;

// Rule Feature
ruleFeature returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
    }
    this_Attribute_0=ruleAttribute
    { 
        $current = $this_Attribute_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
    }
    this_Operation_1=ruleOperation
    { 
        $current = $this_Operation_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	 iv_ruleOperation=ruleOperation 
	 { $current=$iv_ruleOperation.current; } 
	 EOF 
;

// Rule Operation
ruleOperation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getModifierVisibilityEnumRuleCall_0_0_0()); 
	    }
		lv_modifier_1_0=ruleVisibility		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		set(
       			$current, 
       			"modifier",
        		lv_modifier_1_0, 
        		"Visibility");
	        afterParserOrEnumRuleCall();
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_0());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
	 				}
					({true}?=>(
(
		lv_static_2_0=	'static' 
    {
        newLeafNode(lv_static_2_0, grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationRule());
	        }
       		setWithLastConsumed($current, "static", true, "static");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_0());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_0());
	}

)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getOperationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4='(' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
    }
(((
(
ruleParameter
)
)=>
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); 
	    }
		lv_parameters_5_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_5_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_6=',' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
	    }
		lv_parameters_7_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_7_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_8=')' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
    }
	otherlv_9=':' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_5());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_6_0()); 
	    }
		lv_return_10_0=ruleReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOperationRule());
	        }
       		set(
       			$current, 
       			"return",
        		lv_return_10_0, 
        		"Reference");
	        afterParserOrEnumRuleCall();
	    }

)
))
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
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1=':' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"Reference");
	        afterParserOrEnumRuleCall();
	    }

)
)(((	'=' 
)=>	otherlv_3='=' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitValueParserRuleCall_3_1_0()); 
	    }
		lv_implicit_4_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		add(
       			$current, 
       			"implicit",
        		lv_implicit_4_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getCommaKeyword_3_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitValueParserRuleCall_3_2_1_0()); 
	    }
		lv_implicit_6_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getParameterRule());
	        }
       		add(
       			$current, 
       			"implicit",
        		lv_implicit_6_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	 iv_ruleAttribute=ruleAttribute 
	 { $current=$iv_ruleAttribute.current; } 
	 EOF 
;

// Rule Attribute
ruleAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((

(
	{ 
	  getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
	}
	(
		(

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
	 				}
					({true}?=>(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getModifierVisibilityEnumRuleCall_0_0_0()); 
	    }
		lv_modifier_1_0=ruleVisibility		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"modifier",
        		lv_modifier_1_0, 
        		"Visibility");
	        afterParserOrEnumRuleCall();
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
	 				}
 				)
			)  |

			( 
				{getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)}?=>(
					{ 
	 				  getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
	 				}
					({true}?=>(
(
		lv_static_2_0=	'static' 
    {
        newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed($current, "static", true, "static");
	    }

)
))
					{ 
	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
	 				}
 				)
			)  

		)*	
	)
)
	{ 
	  getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
	}

)(
(
		lv_name_3_0=RULE_ID
		{
			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAttributeRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_3_0, 
        		"ID");
	    }

)
)	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
	    }
		lv_type_5_0=ruleReference		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_5_0, 
        		"Reference");
	        afterParserOrEnumRuleCall();
	    }

)
)(((	'=' 
)=>	otherlv_6='=' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitValueParserRuleCall_4_1_0()); 
	    }
		lv_implicit_7_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		add(
       			$current, 
       			"implicit",
        		lv_implicit_7_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_8=',' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitValueParserRuleCall_4_2_1_0()); 
	    }
		lv_implicit_9_0=ruleValue		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAttributeRule());
	        }
       		add(
       			$current, 
       			"implicit",
        		lv_implicit_9_0, 
        		"Value");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
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
	kw='null' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValueAccess().getNullKeyword_0()); 
    }

    |    this_STRING_1=RULE_STRING    {
		$current.merge(this_STRING_1);
    }

    { 
    newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
    }

    |
    { 
        newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
    }
    this_IntValue_2=ruleIntValue    {
		$current.merge(this_IntValue_2);
    }

    { 
        afterParserOrEnumRuleCall();
    }
)
    ;





// Entry rule entryRuleIntValue
entryRuleIntValue returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getIntValueRule()); } 
	 iv_ruleIntValue=ruleIntValue 
	 { $current=$iv_ruleIntValue.current.getText(); }  
	 EOF 
;

// Rule IntValue
ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
    this_INT_0=RULE_INT    {
		$current.merge(this_INT_0);
    }

    { 
    newLeafNode(this_INT_0, grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 
    }

    ;





// Entry rule entryRuleRelation
entryRuleRelation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRelationRule()); }
	 iv_ruleRelation=ruleRelation 
	 { $current=$iv_ruleRelation.current; } 
	 EOF 
;

// Rule Relation
ruleRelation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRelationAccess().getOriginEntityCrossReference_0_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_cardinalityFrom_1_0=RULE_STRING
		{
			newLeafNode(lv_cardinalityFrom_1_0, grammarAccess.getRelationAccess().getCardinalityFromSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"cardinalityFrom",
        		lv_cardinalityFrom_1_0, 
        		"STRING");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_2_0()); 
	    }
		lv_type_2_0=ruleRelationType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRelationRule());
	        }
       		set(
       			$current, 
       			"type",
        		lv_type_2_0, 
        		"RelationType");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_cardinalityTo_3_0=RULE_STRING
		{
			newLeafNode(lv_cardinalityTo_3_0, grammarAccess.getRelationAccess().getCardinalityToSTRINGTerminalRuleCall_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"cardinalityTo",
        		lv_cardinalityTo_3_0, 
        		"STRING");
	    }

)
)?(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
        }
		{ 
	        newCompositeNode(grammarAccess.getRelationAccess().getDestinationEntityCrossReference_4_0()); 
	    }
		ruleQualifiedName		{ 
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=':' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getColonKeyword_5_0());
    }
(
(
		lv_label_6_0=RULE_STRING
		{
			newLeafNode(lv_label_6_0, grammarAccess.getRelationAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRelationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"label",
        		lv_label_6_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); } 
	 iv_ruleQualifiedName=ruleQualifiedName 
	 { $current=$iv_ruleQualifiedName.current.getText(); }  
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Rule RelationType
ruleRelationType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='associates' 
	{
        $current = grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='depends' 
	{
        $current = grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='extends' 
	{
        $current = grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='implements' 
	{
        $current = grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
    }
)
    |(	enumLiteral_4='aggregates' 
	{
        $current = grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_4, grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
    }
)
    |(	enumLiteral_5='composedOf' 
	{
        $current = grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_5, grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
    }
));



// Rule Visibility
ruleVisibility returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='+' 
	{
        $current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='-' 
	{
        $current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
    }
)
    |(	enumLiteral_2='#' 
	{
        $current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
    }
)
    |(	enumLiteral_3='~' 
	{
        $current = grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3()); 
    }
));





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



/*
* generated by Xtext
*/

package cz.cvut.earlgrey.classmodel.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ClassmodelGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ClassmodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Classmodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cElementsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cElementsAbstractElementParserRuleCall_1_0 = (RuleCall)cElementsAssignment_1.eContents().get(0);
		
		//Classmodel:
		//	imports+=Import* elements+=AbstractElement*;
		public ParserRule getRule() { return rule; }

		//imports+=Import* elements+=AbstractElement*
		public Group getGroup() { return cGroup; }

		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }

		//elements+=AbstractElement*
		public Assignment getElementsAssignment_1() { return cElementsAssignment_1; }

		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_1_0() { return cElementsAbstractElementParserRuleCall_1_0; }
	}

	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPackageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cRelationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		////TODO: Add short-class declaration?
		//AbstractElement:
		//	Package | Entity | Relation;
		public ParserRule getRule() { return rule; }

		//Package | Entity | Relation
		public Alternatives getAlternatives() { return cAlternatives; }

		//Package
		public RuleCall getPackageParserRuleCall_0() { return cPackageParserRuleCall_0; }

		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }

		//Relation
		public RuleCall getRelationParserRuleCall_2() { return cRelationParserRuleCall_2; }
	}

	public class PackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Package");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsAbstractElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Package:
		//	"package" name=QualifiedName "{" elements+=AbstractElement* "}";
		public ParserRule getRule() { return rule; }

		//"package" name=QualifiedName "{" elements+=AbstractElement* "}"
		public Group getGroup() { return cGroup; }

		//"package"
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }

		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//elements+=AbstractElement*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }

		//AbstractElement
		public RuleCall getElementsAbstractElementParserRuleCall_3_0() { return cElementsAbstractElementParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		////FIXME: importing works without 'import' declaration
		////FIXME: file import
		//Import:
		//	"import" importedNamespace=QualifiedNameWithWildcard;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeEntityTypeEnumRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributeAttributeParserRuleCall_3_0 = (RuleCall)cAttributeAssignment_3.eContents().get(0);
		private final Assignment cMethodAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cMethodMethodParserRuleCall_4_0 = (RuleCall)cMethodAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		////TODO: add generic types support (class A<T> {} ?)
		//Entity:
		//	type=EntityType name=ID "{" attribute+=Attribute* method+=Method* "}";
		public ParserRule getRule() { return rule; }

		//type=EntityType name=ID "{" attribute+=Attribute* method+=Method* "}"
		public Group getGroup() { return cGroup; }

		//type=EntityType
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//EntityType
		public RuleCall getTypeEntityTypeEnumRuleCall_0_0() { return cTypeEntityTypeEnumRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//attribute+=Attribute*
		public Assignment getAttributeAssignment_3() { return cAttributeAssignment_3; }

		//Attribute
		public RuleCall getAttributeAttributeParserRuleCall_3_0() { return cAttributeAttributeParserRuleCall_3_0; }

		//method+=Method*
		public Assignment getMethodAssignment_4() { return cMethodAssignment_4; }

		//Method
		public RuleCall getMethodMethodParserRuleCall_4_0() { return cMethodMethodParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class MethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Method");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifierAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifierVisibilityEnumRuleCall_0_0 = (RuleCall)cModifierAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_3_0_0 = (RuleCall)cParametersAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParametersAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_3_1_1_0 = (RuleCall)cParametersAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Keyword cColonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cReturnAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cReturnEntityCrossReference_6_0 = (CrossReference)cReturnAssignment_6.eContents().get(0);
		private final RuleCall cReturnEntityQualifiedNameParserRuleCall_6_0_1 = (RuleCall)cReturnEntityCrossReference_6_0.eContents().get(1);
		
		////TODO: change 'return' so it can handle generic types
		//Method:
		//	modifier=Visibility? name=ID "(" (parameters+=Parameter ("," parameters+=Parameter)*)? ")" ":"
		//	return=[Entity|QualifiedName];
		public ParserRule getRule() { return rule; }

		//modifier=Visibility? name=ID "(" (parameters+=Parameter ("," parameters+=Parameter)*)? ")" ":"
		//return=[Entity|QualifiedName]
		public Group getGroup() { return cGroup; }

		//modifier=Visibility?
		public Assignment getModifierAssignment_0() { return cModifierAssignment_0; }

		//Visibility
		public RuleCall getModifierVisibilityEnumRuleCall_0_0() { return cModifierVisibilityEnumRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		//(parameters+=Parameter ("," parameters+=Parameter)*)?
		public Group getGroup_3() { return cGroup_3; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_3_0() { return cParametersAssignment_3_0; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0_0() { return cParametersParameterParserRuleCall_3_0_0; }

		//("," parameters+=Parameter)*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }

		//parameters+=Parameter
		public Assignment getParametersAssignment_3_1_1() { return cParametersAssignment_3_1_1; }

		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_1_1_0() { return cParametersParameterParserRuleCall_3_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }

		//":"
		public Keyword getColonKeyword_5() { return cColonKeyword_5; }

		//return=[Entity|QualifiedName]
		public Assignment getReturnAssignment_6() { return cReturnAssignment_6; }

		//[Entity|QualifiedName]
		public CrossReference getReturnEntityCrossReference_6_0() { return cReturnEntityCrossReference_6_0; }

		//QualifiedName
		public RuleCall getReturnEntityQualifiedNameParserRuleCall_6_0_1() { return cReturnEntityQualifiedNameParserRuleCall_6_0_1; }
	}

	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeEntityCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeEntityQualifiedNameParserRuleCall_0_0_1 = (RuleCall)cTypeEntityCrossReference_0_0.eContents().get(1);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		////TODO: change 'type' so it can handle generic types
		//Parameter:
		//	type=[Entity|QualifiedName] name=ID;
		public ParserRule getRule() { return rule; }

		//type=[Entity|QualifiedName] name=ID
		public Group getGroup() { return cGroup; }

		//type=[Entity|QualifiedName]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//[Entity|QualifiedName]
		public CrossReference getTypeEntityCrossReference_0_0() { return cTypeEntityCrossReference_0_0; }

		//QualifiedName
		public RuleCall getTypeEntityQualifiedNameParserRuleCall_0_0_1() { return cTypeEntityQualifiedNameParserRuleCall_0_0_1; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifierAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifierVisibilityEnumRuleCall_0_0 = (RuleCall)cModifierAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeEntityCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeEntityQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cTypeEntityCrossReference_3_0.eContents().get(1);
		
		////TODO: change 'type' so it can handle generic types
		//Attribute:
		//	modifier=Visibility? name=ID ":" type=[Entity|QualifiedName];
		public ParserRule getRule() { return rule; }

		//modifier=Visibility? name=ID ":" type=[Entity|QualifiedName]
		public Group getGroup() { return cGroup; }

		//modifier=Visibility?
		public Assignment getModifierAssignment_0() { return cModifierAssignment_0; }

		//Visibility
		public RuleCall getModifierVisibilityEnumRuleCall_0_0() { return cModifierVisibilityEnumRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//type=[Entity|QualifiedName]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//[Entity|QualifiedName]
		public CrossReference getTypeEntityCrossReference_3_0() { return cTypeEntityCrossReference_3_0; }

		//QualifiedName
		public RuleCall getTypeEntityQualifiedNameParserRuleCall_3_0_1() { return cTypeEntityQualifiedNameParserRuleCall_3_0_1; }
	}

	public class RelationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Relation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFromEntityCrossReference_0_0 = (CrossReference)cFromAssignment_0.eContents().get(0);
		private final RuleCall cFromEntityQualifiedNameParserRuleCall_0_0_1 = (RuleCall)cFromEntityCrossReference_0_0.eContents().get(1);
		private final Assignment cCardinalityFromAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCardinalityFromSTRINGTerminalRuleCall_1_0 = (RuleCall)cCardinalityFromAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeRelationTypeEnumRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		private final Assignment cCardinalityToAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCardinalityToSTRINGTerminalRuleCall_3_0 = (RuleCall)cCardinalityToAssignment_3.eContents().get(0);
		private final Assignment cToAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cToEntityCrossReference_4_0 = (CrossReference)cToAssignment_4.eContents().get(0);
		private final RuleCall cToEntityQualifiedNameParserRuleCall_4_0_1 = (RuleCall)cToEntityCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cColonKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cLabelAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_5_1_0 = (RuleCall)cLabelAssignment_5_1.eContents().get(0);
		
		////FIXME: rename from/to
		//Relation:
		//	from=[Entity|QualifiedName] cardinalityFrom=STRING? type=RelationType cardinalityTo=STRING? to=[Entity|QualifiedName]
		//	(":" label=STRING)?;
		public ParserRule getRule() { return rule; }

		//from=[Entity|QualifiedName] cardinalityFrom=STRING? type=RelationType cardinalityTo=STRING? to=[Entity|QualifiedName]
		//(":" label=STRING)?
		public Group getGroup() { return cGroup; }

		//from=[Entity|QualifiedName]
		public Assignment getFromAssignment_0() { return cFromAssignment_0; }

		//[Entity|QualifiedName]
		public CrossReference getFromEntityCrossReference_0_0() { return cFromEntityCrossReference_0_0; }

		//QualifiedName
		public RuleCall getFromEntityQualifiedNameParserRuleCall_0_0_1() { return cFromEntityQualifiedNameParserRuleCall_0_0_1; }

		//cardinalityFrom=STRING?
		public Assignment getCardinalityFromAssignment_1() { return cCardinalityFromAssignment_1; }

		//STRING
		public RuleCall getCardinalityFromSTRINGTerminalRuleCall_1_0() { return cCardinalityFromSTRINGTerminalRuleCall_1_0; }

		//type=RelationType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//RelationType
		public RuleCall getTypeRelationTypeEnumRuleCall_2_0() { return cTypeRelationTypeEnumRuleCall_2_0; }

		//cardinalityTo=STRING?
		public Assignment getCardinalityToAssignment_3() { return cCardinalityToAssignment_3; }

		//STRING
		public RuleCall getCardinalityToSTRINGTerminalRuleCall_3_0() { return cCardinalityToSTRINGTerminalRuleCall_3_0; }

		//to=[Entity|QualifiedName]
		public Assignment getToAssignment_4() { return cToAssignment_4; }

		//[Entity|QualifiedName]
		public CrossReference getToEntityCrossReference_4_0() { return cToEntityCrossReference_4_0; }

		//QualifiedName
		public RuleCall getToEntityQualifiedNameParserRuleCall_4_0_1() { return cToEntityQualifiedNameParserRuleCall_4_0_1; }

		//(":" label=STRING)?
		public Group getGroup_5() { return cGroup_5; }

		//":"
		public Keyword getColonKeyword_5_0() { return cColonKeyword_5_0; }

		//label=STRING
		public Assignment getLabelAssignment_5_1() { return cLabelAssignment_5_1; }

		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_5_1_0() { return cLabelSTRINGTerminalRuleCall_5_1_0; }
	}

	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName ".*"?;
		public ParserRule getRule() { return rule; }

		//QualifiedName ".*"?
		public Group getGroup() { return cGroup; }

		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }

		//".*"?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	
	
	public class RelationTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "RelationType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cASSOCIATIONEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cASSOCIATIONAssociatesKeyword_0_0 = (Keyword)cASSOCIATIONEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cDEPENCYEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cDEPENCYDependsKeyword_1_0 = (Keyword)cDEPENCYEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cGENERALIZATIONEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cGENERALIZATIONExtendsKeyword_2_0 = (Keyword)cGENERALIZATIONEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cREALIZATIONEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cREALIZATIONImplementsKeyword_3_0 = (Keyword)cREALIZATIONEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cAGGREGATIONEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cAGGREGATIONAggregatesKeyword_4_0 = (Keyword)cAGGREGATIONEnumLiteralDeclaration_4.eContents().get(0);
		private final EnumLiteralDeclaration cCOMPOSITIONEnumLiteralDeclaration_5 = (EnumLiteralDeclaration)cAlternatives.eContents().get(5);
		private final Keyword cCOMPOSITIONComposesKeyword_5_0 = (Keyword)cCOMPOSITIONEnumLiteralDeclaration_5.eContents().get(0);
		
		////A in relationship with B
		//enum RelationType:
		//	ASSOCIATION= //A is in assocition with B
		//	"associates" | DEPENCY= // A depends on B
		//	"depends" | GENERALIZATION= // A extends B
		//	"extends" | REALIZATION= // A implements B
		//	"implements" | AGGREGATION= //A aggregates B (A consists of B(s), but A can exist without B)
		//	"aggregates" | COMPOSITION= //A x B (A is composed of B(s), but cant exist without B)
		//	"composes";
		public EnumRule getRule() { return rule; }

		//ASSOCIATION= //A is in assocition with B
		//"associates" | DEPENCY= // A depends on B
		//"depends" | GENERALIZATION= // A extends B
		//"extends" | REALIZATION= // A implements B
		//"implements" | AGGREGATION= //A aggregates B (A consists of B(s), but A can exist without B)
		//"aggregates" | COMPOSITION= //A x B (A is composed of B(s), but cant exist without B)
		//"composes"
		public Alternatives getAlternatives() { return cAlternatives; }

		//ASSOCIATION= //A is in assocition with B
		//"associates"
		public EnumLiteralDeclaration getASSOCIATIONEnumLiteralDeclaration_0() { return cASSOCIATIONEnumLiteralDeclaration_0; }

		////A is in assocition with B
		//"associates"
		public Keyword getASSOCIATIONAssociatesKeyword_0_0() { return cASSOCIATIONAssociatesKeyword_0_0; }

		//DEPENCY= // A depends on B
		//"depends"
		public EnumLiteralDeclaration getDEPENCYEnumLiteralDeclaration_1() { return cDEPENCYEnumLiteralDeclaration_1; }

		//// A depends on B
		//"depends"
		public Keyword getDEPENCYDependsKeyword_1_0() { return cDEPENCYDependsKeyword_1_0; }

		//GENERALIZATION= // A extends B
		//"extends"
		public EnumLiteralDeclaration getGENERALIZATIONEnumLiteralDeclaration_2() { return cGENERALIZATIONEnumLiteralDeclaration_2; }

		//// A extends B
		//"extends"
		public Keyword getGENERALIZATIONExtendsKeyword_2_0() { return cGENERALIZATIONExtendsKeyword_2_0; }

		//REALIZATION= // A implements B
		//"implements"
		public EnumLiteralDeclaration getREALIZATIONEnumLiteralDeclaration_3() { return cREALIZATIONEnumLiteralDeclaration_3; }

		//// A implements B
		//"implements"
		public Keyword getREALIZATIONImplementsKeyword_3_0() { return cREALIZATIONImplementsKeyword_3_0; }

		//AGGREGATION= //A aggregates B (A consists of B(s), but A can exist without B)
		//"aggregates"
		public EnumLiteralDeclaration getAGGREGATIONEnumLiteralDeclaration_4() { return cAGGREGATIONEnumLiteralDeclaration_4; }

		////A aggregates B (A consists of B(s), but A can exist without B)
		//"aggregates"
		public Keyword getAGGREGATIONAggregatesKeyword_4_0() { return cAGGREGATIONAggregatesKeyword_4_0; }

		//COMPOSITION= //A x B (A is composed of B(s), but cant exist without B)
		//"composes"
		public EnumLiteralDeclaration getCOMPOSITIONEnumLiteralDeclaration_5() { return cCOMPOSITIONEnumLiteralDeclaration_5; }

		////A x B (A is composed of B(s), but cant exist without B)
		//"composes"
		public Keyword getCOMPOSITIONComposesKeyword_5_0() { return cCOMPOSITIONComposesKeyword_5_0; }
	}

	public class VisibilityElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Visibility");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cPUBLICEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cPUBLICPlusSignKeyword_0_0 = (Keyword)cPUBLICEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPRIVATEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPRIVATEHyphenMinusKeyword_1_0 = (Keyword)cPRIVATEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cPROTECTEDEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cPROTECTEDNumberSignKeyword_2_0 = (Keyword)cPROTECTEDEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cPACKAGE_PRIVATEEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cPACKAGE_PRIVATETildeKeyword_3_0 = (Keyword)cPACKAGE_PRIVATEEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Visibility:
		//	PUBLIC="+" | PRIVATE="-" | PROTECTED="#" | PACKAGE_PRIVATE="~";
		public EnumRule getRule() { return rule; }

		//PUBLIC="+" | PRIVATE="-" | PROTECTED="#" | PACKAGE_PRIVATE="~"
		public Alternatives getAlternatives() { return cAlternatives; }

		//PUBLIC="+"
		public EnumLiteralDeclaration getPUBLICEnumLiteralDeclaration_0() { return cPUBLICEnumLiteralDeclaration_0; }

		//"+"
		public Keyword getPUBLICPlusSignKeyword_0_0() { return cPUBLICPlusSignKeyword_0_0; }

		//PRIVATE="-"
		public EnumLiteralDeclaration getPRIVATEEnumLiteralDeclaration_1() { return cPRIVATEEnumLiteralDeclaration_1; }

		//"-"
		public Keyword getPRIVATEHyphenMinusKeyword_1_0() { return cPRIVATEHyphenMinusKeyword_1_0; }

		//PROTECTED="#"
		public EnumLiteralDeclaration getPROTECTEDEnumLiteralDeclaration_2() { return cPROTECTEDEnumLiteralDeclaration_2; }

		//"#"
		public Keyword getPROTECTEDNumberSignKeyword_2_0() { return cPROTECTEDNumberSignKeyword_2_0; }

		//PACKAGE_PRIVATE="~"
		public EnumLiteralDeclaration getPACKAGE_PRIVATEEnumLiteralDeclaration_3() { return cPACKAGE_PRIVATEEnumLiteralDeclaration_3; }

		//"~"
		public Keyword getPACKAGE_PRIVATETildeKeyword_3_0() { return cPACKAGE_PRIVATETildeKeyword_3_0; }
	}

	public class EntityTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "EntityType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCLASSEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCLASSClassKeyword_0_0 = (Keyword)cCLASSEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cINTERFACEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cINTERFACEInterfaceKeyword_1_0 = (Keyword)cINTERFACEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cABSTRACTEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cABSTRACTAbstractKeyword_2_0 = (Keyword)cABSTRACTEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cENUMEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cENUMEnumKeyword_3_0 = (Keyword)cENUMEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum EntityType:
		//	CLASS="class" | INTERFACE="interface" | ABSTRACT="abstract" | ENUM="enum";
		public EnumRule getRule() { return rule; }

		//CLASS="class" | INTERFACE="interface" | ABSTRACT="abstract" | ENUM="enum"
		public Alternatives getAlternatives() { return cAlternatives; }

		//CLASS="class"
		public EnumLiteralDeclaration getCLASSEnumLiteralDeclaration_0() { return cCLASSEnumLiteralDeclaration_0; }

		//"class"
		public Keyword getCLASSClassKeyword_0_0() { return cCLASSClassKeyword_0_0; }

		//INTERFACE="interface"
		public EnumLiteralDeclaration getINTERFACEEnumLiteralDeclaration_1() { return cINTERFACEEnumLiteralDeclaration_1; }

		//"interface"
		public Keyword getINTERFACEInterfaceKeyword_1_0() { return cINTERFACEInterfaceKeyword_1_0; }

		//ABSTRACT="abstract"
		public EnumLiteralDeclaration getABSTRACTEnumLiteralDeclaration_2() { return cABSTRACTEnumLiteralDeclaration_2; }

		//"abstract"
		public Keyword getABSTRACTAbstractKeyword_2_0() { return cABSTRACTAbstractKeyword_2_0; }

		//ENUM="enum"
		public EnumLiteralDeclaration getENUMEnumLiteralDeclaration_3() { return cENUMEnumLiteralDeclaration_3; }

		//"enum"
		public Keyword getENUMEnumKeyword_3_0() { return cENUMEnumKeyword_3_0; }
	}
	
	private ClassmodelElements pClassmodel;
	private AbstractElementElements pAbstractElement;
	private PackageElements pPackage;
	private ImportElements pImport;
	private EntityElements pEntity;
	private MethodElements pMethod;
	private ParameterElements pParameter;
	private AttributeElements pAttribute;
	private RelationElements pRelation;
	private RelationTypeElements unknownRuleRelationType;
	private VisibilityElements unknownRuleVisibility;
	private EntityTypeElements unknownRuleEntityType;
	private QualifiedNameElements pQualifiedName;
	private QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ClassmodelGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Classmodel:
	//	imports+=Import* elements+=AbstractElement*;
	public ClassmodelElements getClassmodelAccess() {
		return (pClassmodel != null) ? pClassmodel : (pClassmodel = new ClassmodelElements());
	}
	
	public ParserRule getClassmodelRule() {
		return getClassmodelAccess().getRule();
	}

	////TODO: Add short-class declaration?
	//AbstractElement:
	//	Package | Entity | Relation;
	public AbstractElementElements getAbstractElementAccess() {
		return (pAbstractElement != null) ? pAbstractElement : (pAbstractElement = new AbstractElementElements());
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}

	//Package:
	//	"package" name=QualifiedName "{" elements+=AbstractElement* "}";
	public PackageElements getPackageAccess() {
		return (pPackage != null) ? pPackage : (pPackage = new PackageElements());
	}
	
	public ParserRule getPackageRule() {
		return getPackageAccess().getRule();
	}

	////FIXME: importing works without 'import' declaration
	////FIXME: file import
	//Import:
	//	"import" importedNamespace=QualifiedNameWithWildcard;
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	////TODO: add generic types support (class A<T> {} ?)
	//Entity:
	//	type=EntityType name=ID "{" attribute+=Attribute* method+=Method* "}";
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	////TODO: change 'return' so it can handle generic types
	//Method:
	//	modifier=Visibility? name=ID "(" (parameters+=Parameter ("," parameters+=Parameter)*)? ")" ":"
	//	return=[Entity|QualifiedName];
	public MethodElements getMethodAccess() {
		return (pMethod != null) ? pMethod : (pMethod = new MethodElements());
	}
	
	public ParserRule getMethodRule() {
		return getMethodAccess().getRule();
	}

	////TODO: change 'type' so it can handle generic types
	//Parameter:
	//	type=[Entity|QualifiedName] name=ID;
	public ParameterElements getParameterAccess() {
		return (pParameter != null) ? pParameter : (pParameter = new ParameterElements());
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	////TODO: change 'type' so it can handle generic types
	//Attribute:
	//	modifier=Visibility? name=ID ":" type=[Entity|QualifiedName];
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	////FIXME: rename from/to
	//Relation:
	//	from=[Entity|QualifiedName] cardinalityFrom=STRING? type=RelationType cardinalityTo=STRING? to=[Entity|QualifiedName]
	//	(":" label=STRING)?;
	public RelationElements getRelationAccess() {
		return (pRelation != null) ? pRelation : (pRelation = new RelationElements());
	}
	
	public ParserRule getRelationRule() {
		return getRelationAccess().getRule();
	}

	////A in relationship with B
	//enum RelationType:
	//	ASSOCIATION= //A is in assocition with B
	//	"associates" | DEPENCY= // A depends on B
	//	"depends" | GENERALIZATION= // A extends B
	//	"extends" | REALIZATION= // A implements B
	//	"implements" | AGGREGATION= //A aggregates B (A consists of B(s), but A can exist without B)
	//	"aggregates" | COMPOSITION= //A x B (A is composed of B(s), but cant exist without B)
	//	"composes";
	public RelationTypeElements getRelationTypeAccess() {
		return (unknownRuleRelationType != null) ? unknownRuleRelationType : (unknownRuleRelationType = new RelationTypeElements());
	}
	
	public EnumRule getRelationTypeRule() {
		return getRelationTypeAccess().getRule();
	}

	//enum Visibility:
	//	PUBLIC="+" | PRIVATE="-" | PROTECTED="#" | PACKAGE_PRIVATE="~";
	public VisibilityElements getVisibilityAccess() {
		return (unknownRuleVisibility != null) ? unknownRuleVisibility : (unknownRuleVisibility = new VisibilityElements());
	}
	
	public EnumRule getVisibilityRule() {
		return getVisibilityAccess().getRule();
	}

	//enum EntityType:
	//	CLASS="class" | INTERFACE="interface" | ABSTRACT="abstract" | ENUM="enum";
	public EntityTypeElements getEntityTypeAccess() {
		return (unknownRuleEntityType != null) ? unknownRuleEntityType : (unknownRuleEntityType = new EntityTypeElements());
	}
	
	public EnumRule getEntityTypeRule() {
		return getEntityTypeAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//QualifiedNameWithWildcard:
	//	QualifiedName ".*"?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return (pQualifiedNameWithWildcard != null) ? pQualifiedNameWithWildcard : (pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements());
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}

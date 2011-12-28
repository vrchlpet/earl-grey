/*
* generated by Xtext
*/

package cz.cvut.earlgrey.statemodel.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class StatemodelGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class StatemodelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Statemodel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cStatemachineAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatemachineStatemachineParserRuleCall_1_0 = (RuleCall)cStatemachineAssignment_1.eContents().get(0);
		
		/// **
		// * Defines root node of a model.
		// * Resource imports must be defined before other elements.
		// * / Statemodel:
		//	imports+=Import* statemachine+=Statemachine*;
		public ParserRule getRule() { return rule; }

		//imports+=Import* statemachine+=Statemachine*
		public Group getGroup() { return cGroup; }

		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }

		//statemachine+=Statemachine*
		public Assignment getStatemachineAssignment_1() { return cStatemachineAssignment_1; }

		//Statemachine
		public RuleCall getStatemachineStatemachineParserRuleCall_1_0() { return cStatemachineStatemachineParserRuleCall_1_0; }
	}

	public class StatemachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Statemachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStatemachineKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIdentifierParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cColonKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMappedAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cMappedEntityCrossReference_2_1_0 = (CrossReference)cMappedAssignment_2_1.eContents().get(0);
		private final RuleCall cMappedEntityQualifiedNameParserRuleCall_2_1_0_1 = (RuleCall)cMappedEntityCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cStateStateParserRuleCall_4_0 = (RuleCall)cStateAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		/// **
		// * statemachine "Abc" : package.ClassName
		// * / Statemachine:
		//	"statemachine" name=Identifier (":" mapped=[cls::Entity|QualifiedName])? "{" state+=State* "}";
		public ParserRule getRule() { return rule; }

		//"statemachine" name=Identifier (":" mapped=[cls::Entity|QualifiedName])? "{" state+=State* "}"
		public Group getGroup() { return cGroup; }

		//"statemachine"
		public Keyword getStatemachineKeyword_0() { return cStatemachineKeyword_0; }

		//name=Identifier
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_1_0() { return cNameIdentifierParserRuleCall_1_0; }

		//(=> ":" mapped=[cls::Entity|QualifiedName])?
		public Group getGroup_2() { return cGroup_2; }

		//=> ":"
		public Keyword getColonKeyword_2_0() { return cColonKeyword_2_0; }

		//mapped=[cls::Entity|QualifiedName]
		public Assignment getMappedAssignment_2_1() { return cMappedAssignment_2_1; }

		//[cls::Entity|QualifiedName]
		public CrossReference getMappedEntityCrossReference_2_1_0() { return cMappedEntityCrossReference_2_1_0; }

		//QualifiedName
		public RuleCall getMappedEntityQualifiedNameParserRuleCall_2_1_0_1() { return cMappedEntityQualifiedNameParserRuleCall_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//state+=State*
		public Assignment getStateAssignment_4() { return cStateAssignment_4; }

		//State
		public RuleCall getStateStateParserRuleCall_4_0() { return cStateStateParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeStateTypeEnumRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIdentifierParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementElementParserRuleCall_3_0 = (RuleCall)cElementAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//State:
		//	type=StateType name=Identifier "{" element+=Element* "}";
		public ParserRule getRule() { return rule; }

		//type=StateType name=Identifier "{" element+=Element* "}"
		public Group getGroup() { return cGroup; }

		//type=StateType
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//StateType
		public RuleCall getTypeStateTypeEnumRuleCall_0_0() { return cTypeStateTypeEnumRuleCall_0_0; }

		//name=Identifier
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//Identifier
		public RuleCall getNameIdentifierParserRuleCall_1_0() { return cNameIdentifierParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//element+=Element*
		public Assignment getElementAssignment_3() { return cElementAssignment_3; }

		//Element
		public RuleCall getElementElementParserRuleCall_3_0() { return cElementElementParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTransitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStateParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Element:
		//	Transition | State;
		public ParserRule getRule() { return rule; }

		//Transition | State
		public Alternatives getAlternatives() { return cAlternatives; }

		//Transition
		public RuleCall getTransitionParserRuleCall_0() { return cTransitionParserRuleCall_0; }

		//State
		public RuleCall getStateParserRuleCall_1() { return cStateParserRuleCall_1; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEventAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEventEventParserRuleCall_0_0 = (RuleCall)cEventAssignment_0.eContents().get(0);
		private final Assignment cGuardAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGuardGuardParserRuleCall_1_0 = (RuleCall)cGuardAssignment_1.eContents().get(0);
		private final Assignment cActionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionActionParserRuleCall_2_0 = (RuleCall)cActionAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Keyword cEqualsSignGreaterThanSignKeyword_3_0 = (Keyword)cAlternatives_3.eContents().get(0);
		private final Keyword cGotoKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		private final Assignment cStateAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cStateStateCrossReference_4_0 = (CrossReference)cStateAssignment_4.eContents().get(0);
		private final RuleCall cStateStateIdentifierParserRuleCall_4_0_1 = (RuleCall)cStateStateCrossReference_4_0.eContents().get(1);
		
		//Transition:
		//	event=Event guard=Guard action=Action ("=>" | "goto") => state=[State|Identifier];
		public ParserRule getRule() { return rule; }

		//event=Event guard=Guard action=Action ("=>" | "goto") => state=[State|Identifier]
		public Group getGroup() { return cGroup; }

		//event=Event
		public Assignment getEventAssignment_0() { return cEventAssignment_0; }

		//Event
		public RuleCall getEventEventParserRuleCall_0_0() { return cEventEventParserRuleCall_0_0; }

		//guard=Guard
		public Assignment getGuardAssignment_1() { return cGuardAssignment_1; }

		//Guard
		public RuleCall getGuardGuardParserRuleCall_1_0() { return cGuardGuardParserRuleCall_1_0; }

		//action=Action
		public Assignment getActionAssignment_2() { return cActionAssignment_2; }

		//Action
		public RuleCall getActionActionParserRuleCall_2_0() { return cActionActionParserRuleCall_2_0; }

		//"=>" | "goto"
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_3_0() { return cEqualsSignGreaterThanSignKeyword_3_0; }

		//"goto"
		public Keyword getGotoKeyword_3_1() { return cGotoKeyword_3_1; }

		//=> state=[State|Identifier]
		public Assignment getStateAssignment_4() { return cStateAssignment_4; }

		//[State|Identifier]
		public CrossReference getStateStateCrossReference_4_0() { return cStateStateCrossReference_4_0; }

		//Identifier
		public RuleCall getStateStateIdentifierParserRuleCall_4_0_1() { return cStateStateIdentifierParserRuleCall_4_0_1; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cIdAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final CrossReference cIdStatemachineCrossReference_0_0_0 = (CrossReference)cIdAssignment_0_0.eContents().get(0);
		private final RuleCall cIdStatemachineIdentifierParserRuleCall_0_0_0_1 = (RuleCall)cIdStatemachineCrossReference_0_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cRefAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final CrossReference cRefOperationCrossReference_0_2_0 = (CrossReference)cRefAssignment_0_2.eContents().get(0);
		private final RuleCall cRefOperationIDTerminalRuleCall_0_2_0_1 = (RuleCall)cRefOperationCrossReference_0_2_0.eContents().get(1);
		private final Assignment cValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValueCompositeStringParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Value:
		//	=> id=[Statemachine|Identifier] "." ref=[cls::Operation] | value=CompositeString;
		public ParserRule getRule() { return rule; }

		//=> id=[Statemachine|Identifier] "." ref=[cls::Operation] | value=CompositeString
		public Alternatives getAlternatives() { return cAlternatives; }

		//=> id=[Statemachine|Identifier] "." ref=[cls::Operation]
		public Group getGroup_0() { return cGroup_0; }

		//=> id=[Statemachine|Identifier]
		public Assignment getIdAssignment_0_0() { return cIdAssignment_0_0; }

		//[Statemachine|Identifier]
		public CrossReference getIdStatemachineCrossReference_0_0_0() { return cIdStatemachineCrossReference_0_0_0; }

		//Identifier
		public RuleCall getIdStatemachineIdentifierParserRuleCall_0_0_0_1() { return cIdStatemachineIdentifierParserRuleCall_0_0_0_1; }

		//"."
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }

		//ref=[cls::Operation]
		public Assignment getRefAssignment_0_2() { return cRefAssignment_0_2; }

		//[cls::Operation]
		public CrossReference getRefOperationCrossReference_0_2_0() { return cRefOperationCrossReference_0_2_0; }

		//ID
		public RuleCall getRefOperationIDTerminalRuleCall_0_2_0_1() { return cRefOperationIDTerminalRuleCall_0_2_0_1; }

		//value=CompositeString
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//CompositeString
		public RuleCall getValueCompositeStringParserRuleCall_1_0() { return cValueCompositeStringParserRuleCall_1_0; }
	}

	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Event");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEventAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cOnKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cEventAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cEventValueParserRuleCall_1_1_0 = (RuleCall)cEventAssignment_1_1.eContents().get(0);
		
		//Event:
		//	{Event} ("on"? event=Value)?;
		public ParserRule getRule() { return rule; }

		//{Event} ("on"? event=Value)?
		public Group getGroup() { return cGroup; }

		//{Event}
		public Action getEventAction_0() { return cEventAction_0; }

		//(=> "on"? event=Value)?
		public Group getGroup_1() { return cGroup_1; }

		//=> "on"?
		public Keyword getOnKeyword_1_0() { return cOnKeyword_1_0; }

		//event=Value
		public Assignment getEventAssignment_1_1() { return cEventAssignment_1_1; }

		//Value
		public RuleCall getEventValueParserRuleCall_1_1_0() { return cEventValueParserRuleCall_1_1_0; }
	}

	public class GuardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Guard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGuardAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cIfKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cGuardAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cGuardValueParserRuleCall_1_1_0 = (RuleCall)cGuardAssignment_1_1.eContents().get(0);
		
		//Guard:
		//	{Guard} ("if" guard=Value)?;
		public ParserRule getRule() { return rule; }

		//{Guard} ("if" guard=Value)?
		public Group getGroup() { return cGroup; }

		//{Guard}
		public Action getGuardAction_0() { return cGuardAction_0; }

		//(=> "if" guard=Value)?
		public Group getGroup_1() { return cGroup_1; }

		//=> "if"
		public Keyword getIfKeyword_1_0() { return cIfKeyword_1_0; }

		//guard=Value
		public Assignment getGuardAssignment_1_1() { return cGuardAssignment_1_1; }

		//Value
		public RuleCall getGuardValueParserRuleCall_1_1_0() { return cGuardValueParserRuleCall_1_1_0; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Action");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cDoKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cActionAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cActionValueParserRuleCall_1_1_0 = (RuleCall)cActionAssignment_1_1.eContents().get(0);
		
		//Action:
		//	{Action} ("do" action=Value)?;
		public ParserRule getRule() { return rule; }

		//{Action} ("do" action=Value)?
		public Group getGroup() { return cGroup; }

		//{Action}
		public Action getActionAction_0() { return cActionAction_0; }

		//(=> "do" action=Value)?
		public Group getGroup_1() { return cGroup_1; }

		//=> "do"
		public Keyword getDoKeyword_1_0() { return cDoKeyword_1_0; }

		//action=Value
		public Assignment getActionAssignment_1_1() { return cActionAssignment_1_1; }

		//Value
		public RuleCall getActionValueParserRuleCall_1_1_0() { return cActionValueParserRuleCall_1_1_0; }
	}

	public class CompositeStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CompositeString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCONDITIONTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//CompositeString returns ecore::EString:
		//	ID | CONDITION;
		public ParserRule getRule() { return rule; }

		//ID | CONDITION
		public Alternatives getAlternatives() { return cAlternatives; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//CONDITION
		public RuleCall getCONDITIONTerminalRuleCall_1() { return cCONDITIONTerminalRuleCall_1; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importURI=STRING;
		public ParserRule getRule() { return rule; }

		//"import" importURI=STRING
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importURI=STRING
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }

		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_1_0() { return cImportURISTRINGTerminalRuleCall_1_0; }
	}

	public class IdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Identifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Identifier returns ecore::EString:
		//	ID | STRING;
		public ParserRule getRule() { return rule; }

		//=> ID | STRING
		public Alternatives getAlternatives() { return cAlternatives; }

		//=> ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
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
	
	
	public class StateTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "StateType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cNONEEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cNONEStateKeyword_0_0 = (Keyword)cNONEEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cINITIALEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cINITIALInitialKeyword_1_0 = (Keyword)cINITIALEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cFINALEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cFINALFinalKeyword_2_0 = (Keyword)cFINALEnumLiteralDeclaration_2.eContents().get(0);
		
		//enum StateType:
		//	NONE="state" | INITIAL="initial" | FINAL="final";
		public EnumRule getRule() { return rule; }

		//NONE="state" | INITIAL="initial" | FINAL="final"
		public Alternatives getAlternatives() { return cAlternatives; }

		//NONE="state"
		public EnumLiteralDeclaration getNONEEnumLiteralDeclaration_0() { return cNONEEnumLiteralDeclaration_0; }

		//"state"
		public Keyword getNONEStateKeyword_0_0() { return cNONEStateKeyword_0_0; }

		//INITIAL="initial"
		public EnumLiteralDeclaration getINITIALEnumLiteralDeclaration_1() { return cINITIALEnumLiteralDeclaration_1; }

		//"initial"
		public Keyword getINITIALInitialKeyword_1_0() { return cINITIALInitialKeyword_1_0; }

		//FINAL="final"
		public EnumLiteralDeclaration getFINALEnumLiteralDeclaration_2() { return cFINALEnumLiteralDeclaration_2; }

		//"final"
		public Keyword getFINALFinalKeyword_2_0() { return cFINALFinalKeyword_2_0; }
	}
	
	private StatemodelElements pStatemodel;
	private StatemachineElements pStatemachine;
	private StateElements pState;
	private ElementElements pElement;
	private TransitionElements pTransition;
	private ValueElements pValue;
	private EventElements pEvent;
	private GuardElements pGuard;
	private ActionElements pAction;
	private CompositeStringElements pCompositeString;
	private ImportElements pImport;
	private IdentifierElements pIdentifier;
	private StateTypeElements unknownRuleStateType;
	private QualifiedNameElements pQualifiedName;
	private TerminalRule tCONDITION;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public StatemodelGrammarAccess(GrammarProvider grammarProvider,
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

	
	/// **
	// * Defines root node of a model.
	// * Resource imports must be defined before other elements.
	// * / Statemodel:
	//	imports+=Import* statemachine+=Statemachine*;
	public StatemodelElements getStatemodelAccess() {
		return (pStatemodel != null) ? pStatemodel : (pStatemodel = new StatemodelElements());
	}
	
	public ParserRule getStatemodelRule() {
		return getStatemodelAccess().getRule();
	}

	/// **
	// * statemachine "Abc" : package.ClassName
	// * / Statemachine:
	//	"statemachine" name=Identifier (":" mapped=[cls::Entity|QualifiedName])? "{" state+=State* "}";
	public StatemachineElements getStatemachineAccess() {
		return (pStatemachine != null) ? pStatemachine : (pStatemachine = new StatemachineElements());
	}
	
	public ParserRule getStatemachineRule() {
		return getStatemachineAccess().getRule();
	}

	//State:
	//	type=StateType name=Identifier "{" element+=Element* "}";
	public StateElements getStateAccess() {
		return (pState != null) ? pState : (pState = new StateElements());
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}

	//Element:
	//	Transition | State;
	public ElementElements getElementAccess() {
		return (pElement != null) ? pElement : (pElement = new ElementElements());
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//Transition:
	//	event=Event guard=Guard action=Action ("=>" | "goto") => state=[State|Identifier];
	public TransitionElements getTransitionAccess() {
		return (pTransition != null) ? pTransition : (pTransition = new TransitionElements());
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//Value:
	//	=> id=[Statemachine|Identifier] "." ref=[cls::Operation] | value=CompositeString;
	public ValueElements getValueAccess() {
		return (pValue != null) ? pValue : (pValue = new ValueElements());
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//Event:
	//	{Event} ("on"? event=Value)?;
	public EventElements getEventAccess() {
		return (pEvent != null) ? pEvent : (pEvent = new EventElements());
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}

	//Guard:
	//	{Guard} ("if" guard=Value)?;
	public GuardElements getGuardAccess() {
		return (pGuard != null) ? pGuard : (pGuard = new GuardElements());
	}
	
	public ParserRule getGuardRule() {
		return getGuardAccess().getRule();
	}

	//Action:
	//	{Action} ("do" action=Value)?;
	public ActionElements getActionAccess() {
		return (pAction != null) ? pAction : (pAction = new ActionElements());
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	//CompositeString returns ecore::EString:
	//	ID | CONDITION;
	public CompositeStringElements getCompositeStringAccess() {
		return (pCompositeString != null) ? pCompositeString : (pCompositeString = new CompositeStringElements());
	}
	
	public ParserRule getCompositeStringRule() {
		return getCompositeStringAccess().getRule();
	}

	//Import:
	//	"import" importURI=STRING;
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Identifier returns ecore::EString:
	//	ID | STRING;
	public IdentifierElements getIdentifierAccess() {
		return (pIdentifier != null) ? pIdentifier : (pIdentifier = new IdentifierElements());
	}
	
	public ParserRule getIdentifierRule() {
		return getIdentifierAccess().getRule();
	}

	//enum StateType:
	//	NONE="state" | INITIAL="initial" | FINAL="final";
	public StateTypeElements getStateTypeAccess() {
		return (unknownRuleStateType != null) ? unknownRuleStateType : (unknownRuleStateType = new StateTypeElements());
	}
	
	public EnumRule getStateTypeRule() {
		return getStateTypeAccess().getRule();
	}

	//QualifiedName:
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return (pQualifiedName != null) ? pQualifiedName : (pQualifiedName = new QualifiedNameElements());
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}

	//terminal CONDITION:
	//	"(" !("(" | ")" | "\n" | "\r" | "\t")* //FIXME: "(a && (abc))" -> cant use ')'
	//	")";
	public TerminalRule getCONDITIONRule() {
		return (tCONDITION != null) ? tCONDITION : (tCONDITION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CONDITION"));
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

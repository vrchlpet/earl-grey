/*
* generated by Xtext
*/

package cz.cvut.earlgrey.sequencemodel.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import cz.cvut.earlgrey.annotation.services.AnnotationGrammarAccess;

@Singleton
public class SequencemodelGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cSequenceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSequenceSequenceParserRuleCall_1_0 = (RuleCall)cSequenceAssignment_1.eContents().get(0);
		
		//Model:
		//	imports+=Import* sequence+=Sequence*;
		public ParserRule getRule() { return rule; }

		//imports+=Import* sequence+=Sequence*
		public Group getGroup() { return cGroup; }

		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }

		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }

		//sequence+=Sequence*
		public Assignment getSequenceAssignment_1() { return cSequenceAssignment_1; }

		//Sequence
		public RuleCall getSequenceSequenceParserRuleCall_1_0() { return cSequenceSequenceParserRuleCall_1_0; }
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

	public class SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAnnotationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAnnotationAnnotationParserRuleCall_0_0 = (RuleCall)cAnnotationAssignment_0.eContents().get(0);
		private final Keyword cSequenceKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cParticipantAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParticipantParticipantParserRuleCall_3_0 = (RuleCall)cParticipantAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Sequence:
		//	annotation+=Annotation* => "sequence" name=ID participant+=Participant* "end";
		public ParserRule getRule() { return rule; }

		//annotation+=Annotation* => "sequence" name=ID participant+=Participant* "end"
		public Group getGroup() { return cGroup; }

		//annotation+=Annotation*
		public Assignment getAnnotationAssignment_0() { return cAnnotationAssignment_0; }

		//Annotation
		public RuleCall getAnnotationAnnotationParserRuleCall_0_0() { return cAnnotationAnnotationParserRuleCall_0_0; }

		//=> "sequence"
		public Keyword getSequenceKeyword_1() { return cSequenceKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//participant+=Participant*
		public Assignment getParticipantAssignment_3() { return cParticipantAssignment_3; }

		//Participant
		public RuleCall getParticipantParticipantParserRuleCall_3_0() { return cParticipantParticipantParserRuleCall_3_0; }

		//"end"
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}

	public class ParticipantElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Participant");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cTransitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTransitionTransitionParserRuleCall_1_0 = (RuleCall)cTransitionAssignment_1.eContents().get(0);
		private final Keyword cEndKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Participant:
		//	name=ID transition+=Transition* "end";
		public ParserRule getRule() { return rule; }

		//name=ID transition+=Transition* "end"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//transition+=Transition*
		public Assignment getTransitionAssignment_1() { return cTransitionAssignment_1; }

		//Transition
		public RuleCall getTransitionTransitionParserRuleCall_1_0() { return cTransitionTransitionParserRuleCall_1_0; }

		//"end"
		public Keyword getEndKeyword_2() { return cEndKeyword_2; }
	}

	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Transition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTransitionBlockParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMessageParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Transition:
		//	TransitionBlock | Message;
		public ParserRule getRule() { return rule; }

		//TransitionBlock | Message
		public Alternatives getAlternatives() { return cAlternatives; }

		//TransitionBlock
		public RuleCall getTransitionBlockParserRuleCall_0() { return cTransitionBlockParserRuleCall_0; }

		//Message
		public RuleCall getMessageParserRuleCall_1() { return cMessageParserRuleCall_1; }
	}

	public class TransitionBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TransitionBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTransitionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTransitionMessageParserRuleCall_2_0 = (RuleCall)cTransitionAssignment_2.eContents().get(0);
		private final Keyword cEndKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//TransitionBlock:
		//	name=ID ":" transition+=Message* "end";
		public ParserRule getRule() { return rule; }

		//name=ID ":" transition+=Message* "end"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//transition+=Message*
		public Assignment getTransitionAssignment_2() { return cTransitionAssignment_2; }

		//Message
		public RuleCall getTransitionMessageParserRuleCall_2_0() { return cTransitionMessageParserRuleCall_2_0; }

		//"end"
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }
	}

	public class FragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Fragment");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cIfElseFragmentParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cForeachFragmentParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAsserFragmentParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Fragment:
		//	IfElseFragment | ForeachFragment | AsserFragment;
		public ParserRule getRule() { return rule; }

		//IfElseFragment | ForeachFragment | AsserFragment
		public Alternatives getAlternatives() { return cAlternatives; }

		//IfElseFragment
		public RuleCall getIfElseFragmentParserRuleCall_0() { return cIfElseFragmentParserRuleCall_0; }

		//ForeachFragment
		public RuleCall getForeachFragmentParserRuleCall_1() { return cForeachFragmentParserRuleCall_1; }

		//AsserFragment
		public RuleCall getAsserFragmentParserRuleCall_2() { return cAsserFragmentParserRuleCall_2; }
	}

	public class IfElseFragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "IfElseFragment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprValueWithSpacesParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		private final Keyword cThenKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTransitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTransitionMessageParserRuleCall_3_0 = (RuleCall)cTransitionAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cElseKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cElseTransitionAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cElseTransitionMessageParserRuleCall_4_1_0 = (RuleCall)cElseTransitionAssignment_4_1.eContents().get(0);
		private final Keyword cEndKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//IfElseFragment:
		//	"if" expr=ValueWithSpaces "then" transition+=Message* ("else" elseTransition+=Message*)? "end";
		public ParserRule getRule() { return rule; }

		//"if" expr=ValueWithSpaces "then" transition+=Message* ("else" elseTransition+=Message*)? "end"
		public Group getGroup() { return cGroup; }

		//"if"
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }

		//expr=ValueWithSpaces
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }

		//ValueWithSpaces
		public RuleCall getExprValueWithSpacesParserRuleCall_1_0() { return cExprValueWithSpacesParserRuleCall_1_0; }

		//"then"
		public Keyword getThenKeyword_2() { return cThenKeyword_2; }

		//transition+=Message*
		public Assignment getTransitionAssignment_3() { return cTransitionAssignment_3; }

		//Message
		public RuleCall getTransitionMessageParserRuleCall_3_0() { return cTransitionMessageParserRuleCall_3_0; }

		//(=> "else" elseTransition+=Message*)?
		public Group getGroup_4() { return cGroup_4; }

		//=> "else"
		public Keyword getElseKeyword_4_0() { return cElseKeyword_4_0; }

		//elseTransition+=Message*
		public Assignment getElseTransitionAssignment_4_1() { return cElseTransitionAssignment_4_1; }

		//Message
		public RuleCall getElseTransitionMessageParserRuleCall_4_1_0() { return cElseTransitionMessageParserRuleCall_4_1_0; }

		//"end"
		public Keyword getEndKeyword_5() { return cEndKeyword_5; }
	}

	public class ForeachFragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ForeachFragment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cForeachKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprValueWithSpacesParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		private final Keyword cDoKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTransitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTransitionMessageParserRuleCall_3_0 = (RuleCall)cTransitionAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//ForeachFragment:
		//	"foreach" expr=ValueWithSpaces "do" transition+=Message* "end";
		public ParserRule getRule() { return rule; }

		//"foreach" expr=ValueWithSpaces "do" transition+=Message* "end"
		public Group getGroup() { return cGroup; }

		//"foreach"
		public Keyword getForeachKeyword_0() { return cForeachKeyword_0; }

		//expr=ValueWithSpaces
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }

		//ValueWithSpaces
		public RuleCall getExprValueWithSpacesParserRuleCall_1_0() { return cExprValueWithSpacesParserRuleCall_1_0; }

		//"do"
		public Keyword getDoKeyword_2() { return cDoKeyword_2; }

		//transition+=Message*
		public Assignment getTransitionAssignment_3() { return cTransitionAssignment_3; }

		//Message
		public RuleCall getTransitionMessageParserRuleCall_3_0() { return cTransitionMessageParserRuleCall_3_0; }

		//"end"
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}

	public class AsserFragmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AsserFragment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAssertKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cExprAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExprValueWithSpacesParserRuleCall_1_0 = (RuleCall)cExprAssignment_1.eContents().get(0);
		private final Keyword cThenKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTransitionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTransitionMessageParserRuleCall_3_0 = (RuleCall)cTransitionAssignment_3.eContents().get(0);
		private final Keyword cEndKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//AsserFragment:
		//	"assert" expr=ValueWithSpaces "then" transition+=Message* "end";
		public ParserRule getRule() { return rule; }

		//"assert" expr=ValueWithSpaces "then" transition+=Message* "end"
		public Group getGroup() { return cGroup; }

		//"assert"
		public Keyword getAssertKeyword_0() { return cAssertKeyword_0; }

		//expr=ValueWithSpaces
		public Assignment getExprAssignment_1() { return cExprAssignment_1; }

		//ValueWithSpaces
		public RuleCall getExprValueWithSpacesParserRuleCall_1_0() { return cExprValueWithSpacesParserRuleCall_1_0; }

		//"then"
		public Keyword getThenKeyword_2() { return cThenKeyword_2; }

		//transition+=Message*
		public Assignment getTransitionAssignment_3() { return cTransitionAssignment_3; }

		//Message
		public RuleCall getTransitionMessageParserRuleCall_3_0() { return cTransitionMessageParserRuleCall_3_0; }

		//"end"
		public Keyword getEndKeyword_4() { return cEndKeyword_4; }
	}

	public class MessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Message");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCallMessageParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNewMessageParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cReturnMessageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Message:
		//	CallMessage | NewMessage | ReturnMessage;
		public ParserRule getRule() { return rule; }

		//CallMessage | NewMessage | ReturnMessage
		public Alternatives getAlternatives() { return cAlternatives; }

		//CallMessage
		public RuleCall getCallMessageParserRuleCall_0() { return cCallMessageParserRuleCall_0; }

		//NewMessage
		public RuleCall getNewMessageParserRuleCall_1() { return cNewMessageParserRuleCall_1; }

		//ReturnMessage
		public RuleCall getReturnMessageParserRuleCall_2() { return cReturnMessageParserRuleCall_2; }
	}

	public class CallMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CallMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Assignment cParamAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cParamIDTerminalRuleCall_1_1_0_0 = (RuleCall)cParamAssignment_1_1_0.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final Keyword cCommaSpaceKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cParamAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cParamIDTerminalRuleCall_1_1_1_1_0 = (RuleCall)cParamAssignment_1_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cParticipantAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cParticipantIDTerminalRuleCall_2_0 = (RuleCall)cParticipantAssignment_2.eContents().get(0);
		
		//CallMessage:
		//	name=ID ("(" (param+=ID (", " param+=ID)*)? ")")? participant=ID?;
		public ParserRule getRule() { return rule; }

		//name=ID ("(" (param+=ID (", " param+=ID)*)? ")")? participant=ID?
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//(=> "(" (param+=ID (", " param+=ID)*)? ")")?
		public Group getGroup_1() { return cGroup_1; }

		//=> "("
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }

		//(param+=ID (", " param+=ID)*)?
		public Group getGroup_1_1() { return cGroup_1_1; }

		//param+=ID
		public Assignment getParamAssignment_1_1_0() { return cParamAssignment_1_1_0; }

		//ID
		public RuleCall getParamIDTerminalRuleCall_1_1_0_0() { return cParamIDTerminalRuleCall_1_1_0_0; }

		//(=> ", " param+=ID)*
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }

		//=> ", "
		public Keyword getCommaSpaceKeyword_1_1_1_0() { return cCommaSpaceKeyword_1_1_1_0; }

		//param+=ID
		public Assignment getParamAssignment_1_1_1_1() { return cParamAssignment_1_1_1_1; }

		//ID
		public RuleCall getParamIDTerminalRuleCall_1_1_1_1_0() { return cParamIDTerminalRuleCall_1_1_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }

		//participant=ID?
		public Assignment getParticipantAssignment_2() { return cParticipantAssignment_2; }

		//ID
		public RuleCall getParticipantIDTerminalRuleCall_2_0() { return cParticipantIDTerminalRuleCall_2_0; }
	}

	public class NewMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NewMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNewKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cParticipantAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParticipantIDTerminalRuleCall_1_0 = (RuleCall)cParticipantAssignment_1.eContents().get(0);
		
		//NewMessage:
		//	"new" participant=ID;
		public ParserRule getRule() { return rule; }

		//"new" participant=ID
		public Group getGroup() { return cGroup; }

		//"new"
		public Keyword getNewKeyword_0() { return cNewKeyword_0; }

		//participant=ID
		public Assignment getParticipantAssignment_1() { return cParticipantAssignment_1; }

		//ID
		public RuleCall getParticipantIDTerminalRuleCall_1_0() { return cParticipantIDTerminalRuleCall_1_0; }
	}

	public class ReturnMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ReturnMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cReturnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cParamAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cParamIDTerminalRuleCall_2_1_0_0 = (RuleCall)cParamAssignment_2_1_0.eContents().get(0);
		private final Group cGroup_2_1_1 = (Group)cGroup_2_1.eContents().get(1);
		private final Keyword cCommaSpaceKeyword_2_1_1_0 = (Keyword)cGroup_2_1_1.eContents().get(0);
		private final Assignment cParamAssignment_2_1_1_1 = (Assignment)cGroup_2_1_1.eContents().get(1);
		private final RuleCall cParamIDTerminalRuleCall_2_1_1_1_0 = (RuleCall)cParamAssignment_2_1_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//ReturnMessage:
		//	"return " name=ID ("(" (param+=ID (", " param+=ID)*)? ")")?;
		public ParserRule getRule() { return rule; }

		//"return " name=ID ("(" (param+=ID (", " param+=ID)*)? ")")?
		public Group getGroup() { return cGroup; }

		//"return "
		public Keyword getReturnKeyword_0() { return cReturnKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//(=> "(" (param+=ID (", " param+=ID)*)? ")")?
		public Group getGroup_2() { return cGroup_2; }

		//=> "("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//(param+=ID (", " param+=ID)*)?
		public Group getGroup_2_1() { return cGroup_2_1; }

		//param+=ID
		public Assignment getParamAssignment_2_1_0() { return cParamAssignment_2_1_0; }

		//ID
		public RuleCall getParamIDTerminalRuleCall_2_1_0_0() { return cParamIDTerminalRuleCall_2_1_0_0; }

		//(=> ", " param+=ID)*
		public Group getGroup_2_1_1() { return cGroup_2_1_1; }

		//=> ", "
		public Keyword getCommaSpaceKeyword_2_1_1_0() { return cCommaSpaceKeyword_2_1_1_0; }

		//param+=ID
		public Assignment getParamAssignment_2_1_1_1() { return cParamAssignment_2_1_1_1; }

		//ID
		public RuleCall getParamIDTerminalRuleCall_2_1_1_1_0() { return cParamIDTerminalRuleCall_2_1_1_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
	}

	public class ValueWithSpacesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ValueWithSpaces");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cOPERATORTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cANY_OTHERTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cWSTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//ValueWithSpaces hidden():
		//	(OPERATOR | Value | ANY_OTHER | WS)*;
		public ParserRule getRule() { return rule; }

		//(OPERATOR | Value | ANY_OTHER | WS)*
		public Alternatives getAlternatives() { return cAlternatives; }

		//OPERATOR
		public RuleCall getOPERATORTerminalRuleCall_0() { return cOPERATORTerminalRuleCall_0; }

		//Value
		public RuleCall getValueParserRuleCall_1() { return cValueParserRuleCall_1; }

		//ANY_OTHER
		public RuleCall getANY_OTHERTerminalRuleCall_2() { return cANY_OTHERTerminalRuleCall_2; }

		//WS
		public RuleCall getWSTerminalRuleCall_3() { return cWSTerminalRuleCall_3; }
	}
	
	
	private ModelElements pModel;
	private ImportElements pImport;
	private SequenceElements pSequence;
	private ParticipantElements pParticipant;
	private TransitionElements pTransition;
	private TransitionBlockElements pTransitionBlock;
	private FragmentElements pFragment;
	private IfElseFragmentElements pIfElseFragment;
	private ForeachFragmentElements pForeachFragment;
	private AsserFragmentElements pAsserFragment;
	private MessageElements pMessage;
	private CallMessageElements pCallMessage;
	private NewMessageElements pNewMessage;
	private ReturnMessageElements pReturnMessage;
	private ValueWithSpacesElements pValueWithSpaces;
	
	private final GrammarProvider grammarProvider;

	private AnnotationGrammarAccess gaAnnotation;

	@Inject
	public SequencemodelGrammarAccess(GrammarProvider grammarProvider,
		AnnotationGrammarAccess gaAnnotation) {
		this.grammarProvider = grammarProvider;
		this.gaAnnotation = gaAnnotation;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public AnnotationGrammarAccess getAnnotationGrammarAccess() {
		return gaAnnotation;
	}

	
	//Model:
	//	imports+=Import* sequence+=Sequence*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Import:
	//	"import" importURI=STRING;
	public ImportElements getImportAccess() {
		return (pImport != null) ? pImport : (pImport = new ImportElements());
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//Sequence:
	//	annotation+=Annotation* => "sequence" name=ID participant+=Participant* "end";
	public SequenceElements getSequenceAccess() {
		return (pSequence != null) ? pSequence : (pSequence = new SequenceElements());
	}
	
	public ParserRule getSequenceRule() {
		return getSequenceAccess().getRule();
	}

	//Participant:
	//	name=ID transition+=Transition* "end";
	public ParticipantElements getParticipantAccess() {
		return (pParticipant != null) ? pParticipant : (pParticipant = new ParticipantElements());
	}
	
	public ParserRule getParticipantRule() {
		return getParticipantAccess().getRule();
	}

	//Transition:
	//	TransitionBlock | Message;
	public TransitionElements getTransitionAccess() {
		return (pTransition != null) ? pTransition : (pTransition = new TransitionElements());
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}

	//TransitionBlock:
	//	name=ID ":" transition+=Message* "end";
	public TransitionBlockElements getTransitionBlockAccess() {
		return (pTransitionBlock != null) ? pTransitionBlock : (pTransitionBlock = new TransitionBlockElements());
	}
	
	public ParserRule getTransitionBlockRule() {
		return getTransitionBlockAccess().getRule();
	}

	//Fragment:
	//	IfElseFragment | ForeachFragment | AsserFragment;
	public FragmentElements getFragmentAccess() {
		return (pFragment != null) ? pFragment : (pFragment = new FragmentElements());
	}
	
	public ParserRule getFragmentRule() {
		return getFragmentAccess().getRule();
	}

	//IfElseFragment:
	//	"if" expr=ValueWithSpaces "then" transition+=Message* ("else" elseTransition+=Message*)? "end";
	public IfElseFragmentElements getIfElseFragmentAccess() {
		return (pIfElseFragment != null) ? pIfElseFragment : (pIfElseFragment = new IfElseFragmentElements());
	}
	
	public ParserRule getIfElseFragmentRule() {
		return getIfElseFragmentAccess().getRule();
	}

	//ForeachFragment:
	//	"foreach" expr=ValueWithSpaces "do" transition+=Message* "end";
	public ForeachFragmentElements getForeachFragmentAccess() {
		return (pForeachFragment != null) ? pForeachFragment : (pForeachFragment = new ForeachFragmentElements());
	}
	
	public ParserRule getForeachFragmentRule() {
		return getForeachFragmentAccess().getRule();
	}

	//AsserFragment:
	//	"assert" expr=ValueWithSpaces "then" transition+=Message* "end";
	public AsserFragmentElements getAsserFragmentAccess() {
		return (pAsserFragment != null) ? pAsserFragment : (pAsserFragment = new AsserFragmentElements());
	}
	
	public ParserRule getAsserFragmentRule() {
		return getAsserFragmentAccess().getRule();
	}

	//Message:
	//	CallMessage | NewMessage | ReturnMessage;
	public MessageElements getMessageAccess() {
		return (pMessage != null) ? pMessage : (pMessage = new MessageElements());
	}
	
	public ParserRule getMessageRule() {
		return getMessageAccess().getRule();
	}

	//CallMessage:
	//	name=ID ("(" (param+=ID (", " param+=ID)*)? ")")? participant=ID?;
	public CallMessageElements getCallMessageAccess() {
		return (pCallMessage != null) ? pCallMessage : (pCallMessage = new CallMessageElements());
	}
	
	public ParserRule getCallMessageRule() {
		return getCallMessageAccess().getRule();
	}

	//NewMessage:
	//	"new" participant=ID;
	public NewMessageElements getNewMessageAccess() {
		return (pNewMessage != null) ? pNewMessage : (pNewMessage = new NewMessageElements());
	}
	
	public ParserRule getNewMessageRule() {
		return getNewMessageAccess().getRule();
	}

	//ReturnMessage:
	//	"return " name=ID ("(" (param+=ID (", " param+=ID)*)? ")")?;
	public ReturnMessageElements getReturnMessageAccess() {
		return (pReturnMessage != null) ? pReturnMessage : (pReturnMessage = new ReturnMessageElements());
	}
	
	public ParserRule getReturnMessageRule() {
		return getReturnMessageAccess().getRule();
	}

	//ValueWithSpaces hidden():
	//	(OPERATOR | Value | ANY_OTHER | WS)*;
	public ValueWithSpacesElements getValueWithSpacesAccess() {
		return (pValueWithSpaces != null) ? pValueWithSpaces : (pValueWithSpaces = new ValueWithSpacesElements());
	}
	
	public ParserRule getValueWithSpacesRule() {
		return getValueWithSpacesAccess().getRule();
	}

	//// e.g.: @Generate(Java)
	//Annotation:
	//	"@" name=ExtendedID ("(" parameter+=Parameter ("," parameter+=Parameter)* ")")?;
	public AnnotationGrammarAccess.AnnotationElements getAnnotationAccess() {
		return gaAnnotation.getAnnotationAccess();
	}
	
	public ParserRule getAnnotationRule() {
		return getAnnotationAccess().getRule();
	}

	//Parameter:
	//	AssignParameter | ValueParameter;
	public AnnotationGrammarAccess.ParameterElements getParameterAccess() {
		return gaAnnotation.getParameterAccess();
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}

	//// e.g.: @Generate(language = Java)
	//AssignParameter returns Parameter:
	//	name=ExtendedID "=" value=Value;
	public AnnotationGrammarAccess.AssignParameterElements getAssignParameterAccess() {
		return gaAnnotation.getAssignParameterAccess();
	}
	
	public ParserRule getAssignParameterRule() {
		return getAssignParameterAccess().getRule();
	}

	//// e.g.: @Generate(Java)
	//ValueParameter returns Parameter:
	//	value=Value;
	public AnnotationGrammarAccess.ValueParameterElements getValueParameterAccess() {
		return gaAnnotation.getValueParameterAccess();
	}
	
	public ParserRule getValueParameterRule() {
		return getValueParameterAccess().getRule();
	}

	//// e.g.: null
	//Value returns ecore::EString:
	//	Integer | STRING | ExtendedID | BOOLEAN | NULL | Real;
	public AnnotationGrammarAccess.ValueElements getValueAccess() {
		return gaAnnotation.getValueAccess();
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//ExtendedID:
	//	ID ("." ID)*;
	public AnnotationGrammarAccess.ExtendedIDElements getExtendedIDAccess() {
		return gaAnnotation.getExtendedIDAccess();
	}
	
	public ParserRule getExtendedIDRule() {
		return getExtendedIDAccess().getRule();
	}

	//CompositeID returns ecore::EString:
	//	ExtendedID | STRING;
	public AnnotationGrammarAccess.CompositeIDElements getCompositeIDAccess() {
		return gaAnnotation.getCompositeIDAccess();
	}
	
	public ParserRule getCompositeIDRule() {
		return getCompositeIDAccess().getRule();
	}

	//Real returns ecore::EDouble:
	//	"-"? NATURAL "." NATURAL (("e" | "E") ("+" | "-") NATURAL)?;
	public AnnotationGrammarAccess.RealElements getRealAccess() {
		return gaAnnotation.getRealAccess();
	}
	
	public ParserRule getRealRule() {
		return getRealAccess().getRule();
	}

	//Integer returns ecore::EInt:
	//	"-"? NATURAL;
	public AnnotationGrammarAccess.IntegerElements getIntegerAccess() {
		return gaAnnotation.getIntegerAccess();
	}
	
	public ParserRule getIntegerRule() {
		return getIntegerAccess().getRule();
	}

	//// FIXME: http://en.wikipedia.org/wiki/Operators_in_C_and_C%2B%2B
	//terminal OPERATOR:
	//	"++" | "--" | "==" | ">=" | "<=" | "!=" | "<>" | "||" | "&&" | "-=" | "+=" | "=" | ">>" | "<<" | "|=";
	public TerminalRule getOPERATORRule() {
		return gaAnnotation.getOPERATORRule();
	} 

	//terminal BOOLEAN:
	//	"true" | "false";
	public TerminalRule getBOOLEANRule() {
		return gaAnnotation.getBOOLEANRule();
	} 

	//terminal NULL:
	//	"null" | "nil" | "NULL";
	public TerminalRule getNULLRule() {
		return gaAnnotation.getNULLRule();
	} 

	//terminal ID:
	//	("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaAnnotation.getIDRule();
	} 

	//terminal NATURAL returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getNATURALRule() {
		return gaAnnotation.getNATURALRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaAnnotation.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaAnnotation.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaAnnotation.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaAnnotation.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaAnnotation.getANY_OTHERRule();
	} 
}

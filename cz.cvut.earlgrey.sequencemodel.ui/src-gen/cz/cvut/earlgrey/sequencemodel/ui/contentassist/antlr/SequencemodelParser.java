/*
* generated by Xtext
*/
package cz.cvut.earlgrey.sequencemodel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import cz.cvut.earlgrey.sequencemodel.services.SequencemodelGrammarAccess;

public class SequencemodelParser extends AbstractContentAssistParser {
	
	@Inject
	private SequencemodelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected cz.cvut.earlgrey.sequencemodel.ui.contentassist.antlr.internal.InternalSequencemodelParser createParser() {
		cz.cvut.earlgrey.sequencemodel.ui.contentassist.antlr.internal.InternalSequencemodelParser result = new cz.cvut.earlgrey.sequencemodel.ui.contentassist.antlr.internal.InternalSequencemodelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTransitionAccess().getAlternatives(), "rule__Transition__Alternatives");
					put(grammarAccess.getFragmentAccess().getAlternatives(), "rule__Fragment__Alternatives");
					put(grammarAccess.getMessageAccess().getAlternatives(), "rule__Message__Alternatives");
					put(grammarAccess.getForeachExpressionAccess().getAlternatives_2(), "rule__ForeachExpression__Alternatives_2");
					put(grammarAccess.getValueWithSpacesAccess().getAlternatives(), "rule__ValueWithSpaces__Alternatives");
					put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getCompositeIDAccess().getAlternatives(), "rule__CompositeID__Alternatives");
					put(grammarAccess.getRealAccess().getAlternatives_4_0(), "rule__Real__Alternatives_4_0");
					put(grammarAccess.getRealAccess().getAlternatives_4_1(), "rule__Real__Alternatives_4_1");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getSequenceAccess().getGroup(), "rule__Sequence__Group__0");
					put(grammarAccess.getSequenceAccess().getGroup_4(), "rule__Sequence__Group_4__0");
					put(grammarAccess.getParticipantAccess().getGroup(), "rule__Participant__Group__0");
					put(grammarAccess.getParticipantAccess().getGroup_1(), "rule__Participant__Group_1__0");
					put(grammarAccess.getIfElseFragmentAccess().getGroup(), "rule__IfElseFragment__Group__0");
					put(grammarAccess.getIfElseFragmentAccess().getGroup_4(), "rule__IfElseFragment__Group_4__0");
					put(grammarAccess.getIfElseFragmentAccess().getGroup_5(), "rule__IfElseFragment__Group_5__0");
					put(grammarAccess.getForeachFragmentAccess().getGroup(), "rule__ForeachFragment__Group__0");
					put(grammarAccess.getLoopFragmentAccess().getGroup(), "rule__LoopFragment__Group__0");
					put(grammarAccess.getAssertFragmentAccess().getGroup(), "rule__AssertFragment__Group__0");
					put(grammarAccess.getBreakFragmentAccess().getGroup(), "rule__BreakFragment__Group__0");
					put(grammarAccess.getBreakFragmentAccess().getGroup_2(), "rule__BreakFragment__Group_2__0");
					put(grammarAccess.getNextFragmentAccess().getGroup(), "rule__NextFragment__Group__0");
					put(grammarAccess.getNextFragmentAccess().getGroup_2(), "rule__NextFragment__Group_2__0");
					put(grammarAccess.getFoundMessageAccess().getGroup(), "rule__FoundMessage__Group__0");
					put(grammarAccess.getFoundMessageAccess().getGroup_4(), "rule__FoundMessage__Group_4__0");
					put(grammarAccess.getFoundMessageAccess().getGroup_4_1(), "rule__FoundMessage__Group_4_1__0");
					put(grammarAccess.getFoundMessageAccess().getGroup_4_1_1(), "rule__FoundMessage__Group_4_1_1__0");
					put(grammarAccess.getCallMessageAccess().getGroup(), "rule__CallMessage__Group__0");
					put(grammarAccess.getCallMessageAccess().getGroup_5(), "rule__CallMessage__Group_5__0");
					put(grammarAccess.getCallMessageAccess().getGroup_5_1(), "rule__CallMessage__Group_5_1__0");
					put(grammarAccess.getCallMessageAccess().getGroup_5_1_1(), "rule__CallMessage__Group_5_1_1__0");
					put(grammarAccess.getNewMessageAccess().getGroup(), "rule__NewMessage__Group__0");
					put(grammarAccess.getNewMessageAccess().getGroup_3(), "rule__NewMessage__Group_3__0");
					put(grammarAccess.getNewMessageAccess().getGroup_4(), "rule__NewMessage__Group_4__0");
					put(grammarAccess.getNewMessageAccess().getGroup_4_1(), "rule__NewMessage__Group_4_1__0");
					put(grammarAccess.getNewMessageAccess().getGroup_4_1_1(), "rule__NewMessage__Group_4_1_1__0");
					put(grammarAccess.getReturnMessageAccess().getGroup(), "rule__ReturnMessage__Group__0");
					put(grammarAccess.getReturnMessageAccess().getGroup_2(), "rule__ReturnMessage__Group_2__0");
					put(grammarAccess.getReturnMessageAccess().getGroup_2_1(), "rule__ReturnMessage__Group_2_1__0");
					put(grammarAccess.getReturnMessageAccess().getGroup_2_1_1(), "rule__ReturnMessage__Group_2_1_1__0");
					put(grammarAccess.getDeleteMessageAccess().getGroup(), "rule__DeleteMessage__Group__0");
					put(grammarAccess.getDeleteMessageAccess().getGroup_3(), "rule__DeleteMessage__Group_3__0");
					put(grammarAccess.getDeleteMessageAccess().getGroup_3_2(), "rule__DeleteMessage__Group_3_2__0");
					put(grammarAccess.getDeleteMessageAccess().getGroup_3_2_1(), "rule__DeleteMessage__Group_3_2_1__0");
					put(grammarAccess.getDeleteMessageAccess().getGroup_3_2_1_1(), "rule__DeleteMessage__Group_3_2_1_1__0");
					put(grammarAccess.getSelfMessageAccess().getGroup(), "rule__SelfMessage__Group__0");
					put(grammarAccess.getSelfMessageAccess().getGroup_4(), "rule__SelfMessage__Group_4__0");
					put(grammarAccess.getSelfMessageAccess().getGroup_4_1(), "rule__SelfMessage__Group_4_1__0");
					put(grammarAccess.getSelfMessageAccess().getGroup_4_1_1(), "rule__SelfMessage__Group_4_1_1__0");
					put(grammarAccess.getSelfMessageAccess().getGroup_6(), "rule__SelfMessage__Group_6__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_1(), "rule__Parameter__Group_1__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
					put(grammarAccess.getForeachExpressionAccess().getGroup(), "rule__ForeachExpression__Group__0");
					put(grammarAccess.getForeachExpressionAccess().getGroup_2_0(), "rule__ForeachExpression__Group_2_0__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2(), "rule__Annotation__Group_2__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2_2(), "rule__Annotation__Group_2_2__0");
					put(grammarAccess.getAssignPropertyAccess().getGroup(), "rule__AssignProperty__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup(), "rule__ExtendedID__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup_1(), "rule__ExtendedID__Group_1__0");
					put(grammarAccess.getRealAccess().getGroup(), "rule__Real__Group__0");
					put(grammarAccess.getRealAccess().getGroup_4(), "rule__Real__Group_4__0");
					put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
					put(grammarAccess.getModelAccess().getImportsAssignment_0(), "rule__Model__ImportsAssignment_0");
					put(grammarAccess.getModelAccess().getSequenceAssignment_1(), "rule__Model__SequenceAssignment_1");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getSequenceAccess().getAnnotationAssignment_0(), "rule__Sequence__AnnotationAssignment_0");
					put(grammarAccess.getSequenceAccess().getNameAssignment_2(), "rule__Sequence__NameAssignment_2");
					put(grammarAccess.getSequenceAccess().getParticipantAssignment_3(), "rule__Sequence__ParticipantAssignment_3");
					put(grammarAccess.getSequenceAccess().getParticipantAssignment_4_1(), "rule__Sequence__ParticipantAssignment_4_1");
					put(grammarAccess.getSequenceAccess().getTransitionAssignment_5(), "rule__Sequence__TransitionAssignment_5");
					put(grammarAccess.getParticipantAccess().getNameAssignment_0(), "rule__Participant__NameAssignment_0");
					put(grammarAccess.getParticipantAccess().getClassifierAssignment_1_1(), "rule__Participant__ClassifierAssignment_1_1");
					put(grammarAccess.getIfElseFragmentAccess().getExprAssignment_1(), "rule__IfElseFragment__ExprAssignment_1");
					put(grammarAccess.getIfElseFragmentAccess().getTransitionAssignment_3(), "rule__IfElseFragment__TransitionAssignment_3");
					put(grammarAccess.getIfElseFragmentAccess().getElseIfExprAssignment_4_1(), "rule__IfElseFragment__ElseIfExprAssignment_4_1");
					put(grammarAccess.getIfElseFragmentAccess().getElseIftransitionAssignment_4_3(), "rule__IfElseFragment__ElseIftransitionAssignment_4_3");
					put(grammarAccess.getIfElseFragmentAccess().getElseTransitionAssignment_5_1(), "rule__IfElseFragment__ElseTransitionAssignment_5_1");
					put(grammarAccess.getForeachFragmentAccess().getExprAssignment_1(), "rule__ForeachFragment__ExprAssignment_1");
					put(grammarAccess.getForeachFragmentAccess().getTransitionAssignment_3(), "rule__ForeachFragment__TransitionAssignment_3");
					put(grammarAccess.getLoopFragmentAccess().getExprAssignment_1(), "rule__LoopFragment__ExprAssignment_1");
					put(grammarAccess.getLoopFragmentAccess().getTransitionAssignment_3(), "rule__LoopFragment__TransitionAssignment_3");
					put(grammarAccess.getAssertFragmentAccess().getExprAssignment_1(), "rule__AssertFragment__ExprAssignment_1");
					put(grammarAccess.getAssertFragmentAccess().getTransitionAssignment_3(), "rule__AssertFragment__TransitionAssignment_3");
					put(grammarAccess.getBreakFragmentAccess().getExprAssignment_2_0(), "rule__BreakFragment__ExprAssignment_2_0");
					put(grammarAccess.getBreakFragmentAccess().getTransitionAssignment_2_2(), "rule__BreakFragment__TransitionAssignment_2_2");
					put(grammarAccess.getNextFragmentAccess().getExprAssignment_2_0(), "rule__NextFragment__ExprAssignment_2_0");
					put(grammarAccess.getNextFragmentAccess().getTransitionAssignment_2_2(), "rule__NextFragment__TransitionAssignment_2_2");
					put(grammarAccess.getFoundMessageAccess().getTargetParticipantAssignment_1(), "rule__FoundMessage__TargetParticipantAssignment_1");
					put(grammarAccess.getFoundMessageAccess().getNameAssignment_3(), "rule__FoundMessage__NameAssignment_3");
					put(grammarAccess.getFoundMessageAccess().getParameterAssignment_4_1_0(), "rule__FoundMessage__ParameterAssignment_4_1_0");
					put(grammarAccess.getFoundMessageAccess().getParameterAssignment_4_1_1_1(), "rule__FoundMessage__ParameterAssignment_4_1_1_1");
					put(grammarAccess.getFoundMessageAccess().getReturnAssignment_5(), "rule__FoundMessage__ReturnAssignment_5");
					put(grammarAccess.getCallMessageAccess().getSourceAssignment_0(), "rule__CallMessage__SourceAssignment_0");
					put(grammarAccess.getCallMessageAccess().getTargetAssignment_2(), "rule__CallMessage__TargetAssignment_2");
					put(grammarAccess.getCallMessageAccess().getNameAssignment_4(), "rule__CallMessage__NameAssignment_4");
					put(grammarAccess.getCallMessageAccess().getParameterAssignment_5_1_0(), "rule__CallMessage__ParameterAssignment_5_1_0");
					put(grammarAccess.getCallMessageAccess().getParameterAssignment_5_1_1_1(), "rule__CallMessage__ParameterAssignment_5_1_1_1");
					put(grammarAccess.getCallMessageAccess().getReturnAssignment_6(), "rule__CallMessage__ReturnAssignment_6");
					put(grammarAccess.getNewMessageAccess().getSourceAssignment_0(), "rule__NewMessage__SourceAssignment_0");
					put(grammarAccess.getNewMessageAccess().getTargetAssignment_2(), "rule__NewMessage__TargetAssignment_2");
					put(grammarAccess.getNewMessageAccess().getNameAssignment_3_1(), "rule__NewMessage__NameAssignment_3_1");
					put(grammarAccess.getNewMessageAccess().getParameterAssignment_4_1_0(), "rule__NewMessage__ParameterAssignment_4_1_0");
					put(grammarAccess.getNewMessageAccess().getParameterAssignment_4_1_1_1(), "rule__NewMessage__ParameterAssignment_4_1_1_1");
					put(grammarAccess.getReturnMessageAccess().getNameAssignment_1(), "rule__ReturnMessage__NameAssignment_1");
					put(grammarAccess.getReturnMessageAccess().getParameterAssignment_2_1_0(), "rule__ReturnMessage__ParameterAssignment_2_1_0");
					put(grammarAccess.getReturnMessageAccess().getParameterAssignment_2_1_1_1(), "rule__ReturnMessage__ParameterAssignment_2_1_1_1");
					put(grammarAccess.getDeleteMessageAccess().getSourceAssignment_0(), "rule__DeleteMessage__SourceAssignment_0");
					put(grammarAccess.getDeleteMessageAccess().getTargetAssignment_2(), "rule__DeleteMessage__TargetAssignment_2");
					put(grammarAccess.getDeleteMessageAccess().getNameAssignment_3_1(), "rule__DeleteMessage__NameAssignment_3_1");
					put(grammarAccess.getDeleteMessageAccess().getParameterAssignment_3_2_1_0(), "rule__DeleteMessage__ParameterAssignment_3_2_1_0");
					put(grammarAccess.getDeleteMessageAccess().getParameterAssignment_3_2_1_1_1(), "rule__DeleteMessage__ParameterAssignment_3_2_1_1_1");
					put(grammarAccess.getSelfMessageAccess().getSourceAssignment_0(), "rule__SelfMessage__SourceAssignment_0");
					put(grammarAccess.getSelfMessageAccess().getNameAssignment_3(), "rule__SelfMessage__NameAssignment_3");
					put(grammarAccess.getSelfMessageAccess().getParameterAssignment_4_1_0(), "rule__SelfMessage__ParameterAssignment_4_1_0");
					put(grammarAccess.getSelfMessageAccess().getParameterAssignment_4_1_1_1(), "rule__SelfMessage__ParameterAssignment_4_1_1_1");
					put(grammarAccess.getSelfMessageAccess().getReturnAssignment_5(), "rule__SelfMessage__ReturnAssignment_5");
					put(grammarAccess.getSelfMessageAccess().getTransitionAssignment_6_1(), "rule__SelfMessage__TransitionAssignment_6_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeAssignment_1_1(), "rule__Parameter__TypeAssignment_1_1");
					put(grammarAccess.getReferenceAccess().getTypeAssignment_0(), "rule__Reference__TypeAssignment_0");
					put(grammarAccess.getReferenceAccess().getArrayAssignment_1(), "rule__Reference__ArrayAssignment_1");
					put(grammarAccess.getArrayAccess().getSizeAssignment_2(), "rule__Array__SizeAssignment_2");
					put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
					put(grammarAccess.getAnnotationAccess().getPropertyAssignment_2_1(), "rule__Annotation__PropertyAssignment_2_1");
					put(grammarAccess.getAnnotationAccess().getPropertyAssignment_2_2_1(), "rule__Annotation__PropertyAssignment_2_2_1");
					put(grammarAccess.getAssignPropertyAccess().getNameAssignment_0(), "rule__AssignProperty__NameAssignment_0");
					put(grammarAccess.getAssignPropertyAccess().getValueAssignment_2(), "rule__AssignProperty__ValueAssignment_2");
					put(grammarAccess.getValuePropertyAccess().getValueAssignment(), "rule__ValueProperty__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			cz.cvut.earlgrey.sequencemodel.ui.contentassist.antlr.internal.InternalSequencemodelParser typedParser = (cz.cvut.earlgrey.sequencemodel.ui.contentassist.antlr.internal.InternalSequencemodelParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SequencemodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SequencemodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

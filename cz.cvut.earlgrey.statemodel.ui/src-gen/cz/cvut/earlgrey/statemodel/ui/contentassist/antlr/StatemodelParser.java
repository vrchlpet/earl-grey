/*
* generated by Xtext
*/
package cz.cvut.earlgrey.statemodel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import cz.cvut.earlgrey.statemodel.services.StatemodelGrammarAccess;

public class StatemodelParser extends AbstractContentAssistParser {
	
	@Inject
	private StatemodelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected cz.cvut.earlgrey.statemodel.ui.contentassist.antlr.internal.InternalStatemodelParser createParser() {
		cz.cvut.earlgrey.statemodel.ui.contentassist.antlr.internal.InternalStatemodelParser result = new cz.cvut.earlgrey.statemodel.ui.contentassist.antlr.internal.InternalStatemodelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getActivityAccess().getAlternatives(), "rule__Activity__Alternatives");
					put(grammarAccess.getValueWithSpacesAccess().getAlternatives(), "rule__ValueWithSpaces__Alternatives");
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getCompositeIDAccess().getAlternatives(), "rule__CompositeID__Alternatives");
					put(grammarAccess.getRealAccess().getAlternatives_4_0(), "rule__Real__Alternatives_4_0");
					put(grammarAccess.getRealAccess().getAlternatives_4_1(), "rule__Real__Alternatives_4_1");
					put(grammarAccess.getStateTypeAccess().getAlternatives(), "rule__StateType__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getStatemachineAccess().getGroup(), "rule__Statemachine__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getTransitionBlockAccess().getGroup(), "rule__TransitionBlock__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_0(), "rule__Transition__Group_0__0");
					put(grammarAccess.getTransitionAccess().getGroup_1(), "rule__Transition__Group_1__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2(), "rule__Annotation__Group_2__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2_2(), "rule__Annotation__Group_2_2__0");
					put(grammarAccess.getAssignParameterAccess().getGroup(), "rule__AssignParameter__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup(), "rule__ExtendedID__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup_1(), "rule__ExtendedID__Group_1__0");
					put(grammarAccess.getRealAccess().getGroup(), "rule__Real__Group__0");
					put(grammarAccess.getRealAccess().getGroup_4(), "rule__Real__Group_4__0");
					put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
					put(grammarAccess.getModelAccess().getImportsAssignment_0(), "rule__Model__ImportsAssignment_0");
					put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getStatemachineAccess().getAnnotationAssignment_0(), "rule__Statemachine__AnnotationAssignment_0");
					put(grammarAccess.getStatemachineAccess().getNameAssignment_2(), "rule__Statemachine__NameAssignment_2");
					put(grammarAccess.getStatemachineAccess().getStateAssignment_3(), "rule__Statemachine__StateAssignment_3");
					put(grammarAccess.getStateAccess().getAnnotationAssignment_0(), "rule__State__AnnotationAssignment_0");
					put(grammarAccess.getStateAccess().getTypeAssignment_1(), "rule__State__TypeAssignment_1");
					put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
					put(grammarAccess.getStateAccess().getElementAssignment_3(), "rule__State__ElementAssignment_3");
					put(grammarAccess.getTransitionBlockAccess().getEventAssignment_0(), "rule__TransitionBlock__EventAssignment_0");
					put(grammarAccess.getTransitionBlockAccess().getTransitionAssignment_2(), "rule__TransitionBlock__TransitionAssignment_2");
					put(grammarAccess.getTransitionAccess().getGuardAssignment_0_1(), "rule__Transition__GuardAssignment_0_1");
					put(grammarAccess.getTransitionAccess().getActionAssignment_1_0(), "rule__Transition__ActionAssignment_1_0");
					put(grammarAccess.getTransitionAccess().getStateAssignment_3(), "rule__Transition__StateAssignment_3");
					put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
					put(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1(), "rule__Annotation__ParameterAssignment_2_1");
					put(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1(), "rule__Annotation__ParameterAssignment_2_2_1");
					put(grammarAccess.getAssignParameterAccess().getNameAssignment_0(), "rule__AssignParameter__NameAssignment_0");
					put(grammarAccess.getAssignParameterAccess().getValueAssignment_2(), "rule__AssignParameter__ValueAssignment_2");
					put(grammarAccess.getValueParameterAccess().getValueAssignment(), "rule__ValueParameter__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			cz.cvut.earlgrey.statemodel.ui.contentassist.antlr.internal.InternalStatemodelParser typedParser = (cz.cvut.earlgrey.statemodel.ui.contentassist.antlr.internal.InternalStatemodelParser) parser;
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
	
	public StatemodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StatemodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

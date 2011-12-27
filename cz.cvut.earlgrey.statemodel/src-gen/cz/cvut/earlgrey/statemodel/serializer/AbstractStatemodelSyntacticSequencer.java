package cz.cvut.earlgrey.statemodel.serializer;

import com.google.inject.Inject;
import cz.cvut.earlgrey.statemodel.services.StatemodelGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractStatemodelSyntacticSequencer extends AbstractSyntacticSequencer {

	protected StatemodelGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Transition_EqualsSignGreaterThanSignKeyword_3_0_or_GotoKeyword_3_1;
	protected AbstractElementAlias match_Transition_OnKeyword_0_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (StatemodelGrammarAccess) access;
		match_Transition_EqualsSignGreaterThanSignKeyword_3_0_or_GotoKeyword_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getTransitionAccess().getGotoKeyword_3_1()));
		match_Transition_OnKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getTransitionAccess().getOnKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Transition_EqualsSignGreaterThanSignKeyword_3_0_or_GotoKeyword_3_1.equals(syntax))
				emit_Transition_EqualsSignGreaterThanSignKeyword_3_0_or_GotoKeyword_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Transition_OnKeyword_0_0_q.equals(syntax))
				emit_Transition_OnKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '=>' | 'goto'
	 */
	protected void emit_Transition_EqualsSignGreaterThanSignKeyword_3_0_or_GotoKeyword_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'on'?
	 */
	protected void emit_Transition_OnKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

package cz.cvut.earlgrey.statemodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cz.cvut.earlgrey.statemodel.services.StatemodelGrammarAccess;
import cz.cvut.earlgrey.statemodel.statemodel.Action;
import cz.cvut.earlgrey.statemodel.statemodel.Event;
import cz.cvut.earlgrey.statemodel.statemodel.Guard;
import cz.cvut.earlgrey.statemodel.statemodel.Import;
import cz.cvut.earlgrey.statemodel.statemodel.State;
import cz.cvut.earlgrey.statemodel.statemodel.Statemachine;
import cz.cvut.earlgrey.statemodel.statemodel.Statemodel;
import cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage;
import cz.cvut.earlgrey.statemodel.statemodel.Transition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractStatemodelSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected StatemodelGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == StatemodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StatemodelPackage.ACTION:
				if(context == grammarAccess.getActionRule()) {
					sequence_Action(context, (Action) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.GUARD:
				if(context == grammarAccess.getGuardRule()) {
					sequence_Guard(context, (Guard) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.STATE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.STATEMACHINE:
				if(context == grammarAccess.getStatemachineRule()) {
					sequence_Statemachine(context, (Statemachine) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.STATEMODEL:
				if(context == grammarAccess.getStatemodelRule()) {
					sequence_Statemodel(context, (Statemodel) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.TRANSITION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=CompositeString
	 */
	protected void sequence_Action(EObject context, Action semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemodelPackage.Literals.ACTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemodelPackage.Literals.ACTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActionAccess().getValueCompositeStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=CompositeString
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemodelPackage.Literals.EVENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemodelPackage.Literals.EVENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getValueCompositeStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=CompositeString
	 */
	protected void sequence_Guard(EObject context, Guard semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemodelPackage.Literals.GUARD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemodelPackage.Literals.GUARD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuardAccess().getValueCompositeStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, StatemodelPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, StatemodelPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=StateType name=ID element+=Element*)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName state+=State*)
	 */
	protected void sequence_Statemachine(EObject context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* statemachine+=Statemachine*)
	 */
	protected void sequence_Statemodel(EObject context, Statemodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=Event? guard=Guard? action=Action? state=[State|ID])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

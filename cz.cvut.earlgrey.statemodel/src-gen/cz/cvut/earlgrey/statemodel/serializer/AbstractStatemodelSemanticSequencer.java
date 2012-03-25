package cz.cvut.earlgrey.statemodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cz.cvut.earlgrey.annotation.annotation.Annotation;
import cz.cvut.earlgrey.annotation.annotation.AnnotationPackage;
import cz.cvut.earlgrey.annotation.annotation.Parameter;
import cz.cvut.earlgrey.annotation.serializer.AnnotationSemanticSequencer;
import cz.cvut.earlgrey.statemodel.services.StatemodelGrammarAccess;
import cz.cvut.earlgrey.statemodel.statemodel.Import;
import cz.cvut.earlgrey.statemodel.statemodel.Model;
import cz.cvut.earlgrey.statemodel.statemodel.State;
import cz.cvut.earlgrey.statemodel.statemodel.Statemachine;
import cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage;
import cz.cvut.earlgrey.statemodel.statemodel.Transition;
import cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock;
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
	
	@Inject
	protected Provider<AnnotationSemanticSequencer> superSequencerProvider;
	 
	protected AnnotationSemanticSequencer superSequencer; 
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.superSequencer = superSequencerProvider.get();
		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnnotationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnnotationPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationPackage.PARAMETER:
				if(context == grammarAccess.getAssignParameterRule()) {
					sequence_AssignParameter(context, (Parameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getValueParameterRule()) {
					sequence_ValueParameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StatemodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StatemodelPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.STATE:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.STATEMACHINE:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getStatemachineRule()) {
					sequence_Statemachine(context, (Statemachine) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case StatemodelPackage.TRANSITION_BLOCK:
				if(context == grammarAccess.getActivityRule() ||
				   context == grammarAccess.getTransitionBlockRule()) {
					sequence_TransitionBlock(context, (TransitionBlock) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ExtendedID (parameter+=Parameter parameter+=Parameter*)?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=Value)
	 */
	protected void sequence_AssignParameter(EObject context, Parameter semanticObject) {
		superSequencer.createSequence(context, semanticObject);
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
	 *     (imports+=Import* elements+=Element*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ExtendedID value=Value) | value=Value)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* type=StateType name=CompositeID element+=Activity*)
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* name=[Entity|ExtendedID] state+=State*)
	 */
	protected void sequence_Statemachine(EObject context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=ValueWithSpaces transition+=Transition+)
	 */
	protected void sequence_TransitionBlock(EObject context, TransitionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (guard=ValueWithSpaces? action=ValueWithSpaces? state=[State|CompositeID])
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Value
	 */
	protected void sequence_ValueParameter(EObject context, Parameter semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}

package cz.cvut.earlgrey.sequencemodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cz.cvut.earlgrey.annotation.annotation.Annotation;
import cz.cvut.earlgrey.annotation.annotation.AnnotationPackage;
import cz.cvut.earlgrey.annotation.annotation.Parameter;
import cz.cvut.earlgrey.annotation.serializer.AnnotationSemanticSequencer;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Import;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.NewMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock;
import cz.cvut.earlgrey.sequencemodel.services.SequencemodelGrammarAccess;
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
public class AbstractSequencemodelSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected SequencemodelGrammarAccess grammarAccess;
	
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
		else if(semanticObject.eClass().getEPackage() == SequencemodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SequencemodelPackage.CALL_MESSAGE:
				if(context == grammarAccess.getCallMessageRule() ||
				   context == grammarAccess.getMessageRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_CallMessage(context, (CallMessage) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.NEW_MESSAGE:
				if(context == grammarAccess.getMessageRule() ||
				   context == grammarAccess.getNewMessageRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_NewMessage(context, (NewMessage) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.PARTICIPANT:
				if(context == grammarAccess.getParticipantRule()) {
					sequence_Participant(context, (Participant) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.RETURN_MESSAGE:
				if(context == grammarAccess.getMessageRule() ||
				   context == grammarAccess.getReturnMessageRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_ReturnMessage(context, (ReturnMessage) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.SEQUENCE:
				if(context == grammarAccess.getSequenceRule()) {
					sequence_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.SEQUENCEMODEL:
				if(context == grammarAccess.getSequencemodelRule()) {
					sequence_Sequencemodel(context, (Sequencemodel) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.TRANSITION_BLOCK:
				if(context == grammarAccess.getTransitionRule() ||
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
	 *     (name=ID (param+=ID param+=ID*)? participant=ID?)
	 */
	protected void sequence_CallMessage(EObject context, CallMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SequencemodelPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencemodelPackage.Literals.IMPORT__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     participant=ID
	 */
	protected void sequence_NewMessage(EObject context, NewMessage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SequencemodelPackage.Literals.NEW_MESSAGE__PARTICIPANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencemodelPackage.Literals.NEW_MESSAGE__PARTICIPANT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNewMessageAccess().getParticipantIDTerminalRuleCall_1_0(), semanticObject.getParticipant());
		feeder.finish();
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
	 *     (name=ID transition+=Transition*)
	 */
	protected void sequence_Participant(EObject context, Participant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (param+=ID param+=ID*)?)
	 */
	protected void sequence_ReturnMessage(EObject context, ReturnMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* name=ID participant+=Participant*)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* sequence+=Sequence*)
	 */
	protected void sequence_Sequencemodel(EObject context, Sequencemodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID transition+=Message*)
	 */
	protected void sequence_TransitionBlock(EObject context, TransitionBlock semanticObject) {
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

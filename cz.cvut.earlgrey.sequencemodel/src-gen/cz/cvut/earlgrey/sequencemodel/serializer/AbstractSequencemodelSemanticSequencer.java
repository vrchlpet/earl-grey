package cz.cvut.earlgrey.sequencemodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cz.cvut.earlgrey.annotation.annotation.Annotation;
import cz.cvut.earlgrey.annotation.annotation.AnnotationPackage;
import cz.cvut.earlgrey.annotation.annotation.Parameter;
import cz.cvut.earlgrey.annotation.serializer.AnnotationSemanticSequencer;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Array;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.AssertFragment;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.BreakFragment;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.DeleteMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.ForeachFragment;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Import;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.LoopFragment;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Model;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.NewMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.NextFragment;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Reference;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence;
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
				else if(context == grammarAccess.getValueParameterRule()) {
					sequence_ValueParameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == SequencemodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SequencemodelPackage.ARRAY:
				if(context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.ASSERT_FRAGMENT:
				if(context == grammarAccess.getAssertFragmentRule() ||
				   context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_AssertFragment(context, (AssertFragment) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.BREAK_FRAGMENT:
				if(context == grammarAccess.getBreakFragmentRule() ||
				   context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_BreakFragment(context, (BreakFragment) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.CALL_MESSAGE:
				if(context == grammarAccess.getCallMessageRule() ||
				   context == grammarAccess.getMessageRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_CallMessage(context, (CallMessage) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.DELETE_MESSAGE:
				if(context == grammarAccess.getDeleteMessageRule() ||
				   context == grammarAccess.getMessageRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_DeleteMessage(context, (DeleteMessage) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.FOREACH_FRAGMENT:
				if(context == grammarAccess.getForeachFragmentRule() ||
				   context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_ForeachFragment(context, (ForeachFragment) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.IF_ELSE_FRAGMENT:
				if(context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getIfElseFragmentRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_IfElseFragment(context, (IfElseFragment) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.LOOP_FRAGMENT:
				if(context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getLoopFragmentRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_LoopFragment(context, (LoopFragment) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
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
			case SequencemodelPackage.NEXT_FRAGMENT:
				if(context == grammarAccess.getFragmentRule() ||
				   context == grammarAccess.getNextFragmentRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_NextFragment(context, (NextFragment) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (cz.cvut.earlgrey.sequencemodel.sequencemodel.Parameter) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.PARTICIPANT:
				if(context == grammarAccess.getParticipantRule()) {
					sequence_Participant(context, (Participant) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.REFERENCE:
				if(context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
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
			case SequencemodelPackage.TRANSITION_BLOCK:
				if(context == grammarAccess.getTransitionBlockRule()) {
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
	 *     (size=NATURAL?)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=ValueWithSpaces transition+=Transition*)
	 */
	protected void sequence_AssertFragment(EObject context, AssertFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ((expr=ValueWithSpaces transition+=Transition*)?)
	 */
	protected void sequence_BreakFragment(EObject context, BreakFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (participant=ID? name=ID (parameter+=Parameter parameter+=Parameter*)?)
	 */
	protected void sequence_CallMessage(EObject context, CallMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameter+=Parameter parameter+=Parameter*)?)
	 */
	protected void sequence_DeleteMessage(EObject context, DeleteMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=ForeachExpression transition+=Transition*)
	 */
	protected void sequence_ForeachFragment(EObject context, ForeachFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=ValueWithSpaces transition+=Transition* (elseIfExpr+=ValueWithSpaces elseIftransition+=Transition*)* elseTransition+=Transition*)
	 */
	protected void sequence_IfElseFragment(EObject context, IfElseFragment semanticObject) {
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
	 *     (expr=ValueWithSpaces transition+=Transition*)
	 */
	protected void sequence_LoopFragment(EObject context, LoopFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* sequence+=Sequence*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (participant=ID (parameter+=Parameter parameter+=Parameter*)?)
	 */
	protected void sequence_NewMessage(EObject context, NewMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expr=ValueWithSpaces transition+=Transition*)?)
	 */
	protected void sequence_NextFragment(EObject context, NextFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Reference?)
	 */
	protected void sequence_Parameter(EObject context, cz.cvut.earlgrey.sequencemodel.sequencemodel.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* name=ID transition+=Transition* block+=TransitionBlock*)
	 */
	protected void sequence_Participant(EObject context, Participant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ID array+=Array*)
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Reference (parameter+=Parameter parameter+=Parameter*)?)
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
	 *     (name=ID (parameter+=Parameter parameter+=Parameter*)? transition+=Transition*)
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

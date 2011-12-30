package cz.cvut.earlgrey.sequencemodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Call;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Create;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Import;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Message;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Self;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition;
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
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SequencemodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SequencemodelPackage.CALL:
				if(context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.CREATE:
				if(context == grammarAccess.getCreateRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Create(context, (Create) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.DESTROY:
				if(context == grammarAccess.getDestroyRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Destroy(context, (Destroy) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.LIFELINE:
				if(context == grammarAccess.getLifelineRule()) {
					sequence_Lifeline(context, (Lifeline) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.MESSAGE:
				if(context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.REPLY:
				if(context == grammarAccess.getReplyRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Reply(context, (Reply) semanticObject); 
					return; 
				}
				else break;
			case SequencemodelPackage.SELF:
				if(context == grammarAccess.getSelfRule() ||
				   context == grammarAccess.getStatementRule()) {
					sequence_Self(context, (Self) semanticObject); 
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
			case SequencemodelPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (called=[Lifeline|LifelineName] message=Message reply=ID?)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     called=[Lifeline|LifelineName]
	 */
	protected void sequence_Create(EObject context, Create semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SequencemodelPackage.Literals.CREATE__CALLED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencemodelPackage.Literals.CREATE__CALLED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCreateAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1(), semanticObject.getCalled());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     called=[Lifeline|LifelineName]
	 */
	protected void sequence_Destroy(EObject context, Destroy semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SequencemodelPackage.Literals.DESTROY__CALLED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SequencemodelPackage.Literals.DESTROY__CALLED));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDestroyAccess().getCalledLifelineLifelineNameParserRuleCall_1_0_1(), semanticObject.getCalled());
		feeder.finish();
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
	 *     (actor?='actor'? name=LifelineName entity=[Entity|QualifiedName])
	 */
	protected void sequence_Lifeline(EObject context, Lifeline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (param+=ID param+=ID*)?)
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (called=[Lifeline|LifelineName] reply=ID?)
	 */
	protected void sequence_Reply(EObject context, Reply semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (message=Message reply=ID?)
	 */
	protected void sequence_Self(EObject context, Self semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier lifeline+=Lifeline+ transition+=Transition*)
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
	 *     (caller=[Lifeline|LifelineName] statement+=Statement+)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

package cz.cvut.earlgrey.classmodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cz.cvut.earlgrey.classmodel.classmodel.Attribute;
import cz.cvut.earlgrey.classmodel.classmodel.Classmodel;
import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Entity;
import cz.cvut.earlgrey.classmodel.classmodel.Import;
import cz.cvut.earlgrey.classmodel.classmodel.Method;
import cz.cvut.earlgrey.classmodel.classmodel.Parameter;
import cz.cvut.earlgrey.classmodel.classmodel.Relation;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;
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
public class AbstractClassmodelSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ClassmodelGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == ClassmodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ClassmodelPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.CLASSMODEL:
				if(context == grammarAccess.getClassmodelRule()) {
					sequence_Classmodel(context, (Classmodel) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.METHOD:
				if(context == grammarAccess.getMethodRule()) {
					sequence_Method(context, (Method) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.PACKAGE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (cz.cvut.earlgrey.classmodel.classmodel.Package) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.RELATION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getRelationRule()) {
					sequence_Relation(context, (Relation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (modifier=Visibility? name=ID type=[Entity|QualifiedName])
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (imports+=Import* elements+=AbstractElement*)
	 */
	protected void sequence_Classmodel(EObject context, Classmodel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=EntityType name=ID attribute+=Attribute* method+=Method*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ClassmodelPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassmodelPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=Visibility? name=ID (parameters+=Parameter parameters+=Parameter*)? return=[Entity|QualifiedName])
	 */
	protected void sequence_Method(EObject context, Method semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName elements+=AbstractElement*)
	 */
	protected void sequence_Package(EObject context, cz.cvut.earlgrey.classmodel.classmodel.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Entity|QualifiedName] name=ID)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ClassmodelPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassmodelPackage.Literals.PARAMETER__TYPE));
			if(transientValues.isValueTransient(semanticObject, ClassmodelPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassmodelPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getTypeEntityQualifiedNameParserRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         origin=[Entity|QualifiedName] 
	 *         cardinalityFrom=STRING? 
	 *         type=RelationType 
	 *         cardinalityTo=STRING? 
	 *         destination=[Entity|QualifiedName] 
	 *         label=STRING?
	 *     )
	 */
	protected void sequence_Relation(EObject context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

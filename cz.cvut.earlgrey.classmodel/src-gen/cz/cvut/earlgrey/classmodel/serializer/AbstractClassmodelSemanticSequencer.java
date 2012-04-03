package cz.cvut.earlgrey.classmodel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import cz.cvut.earlgrey.annotation.annotation.Annotation;
import cz.cvut.earlgrey.annotation.annotation.AnnotationPackage;
import cz.cvut.earlgrey.annotation.annotation.Property;
import cz.cvut.earlgrey.annotation.serializer.AnnotationSemanticSequencer;
import cz.cvut.earlgrey.classmodel.classmodel.Array;
import cz.cvut.earlgrey.classmodel.classmodel.Attribute;
import cz.cvut.earlgrey.classmodel.classmodel.Classifier;
import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Constant;
import cz.cvut.earlgrey.classmodel.classmodel.Datatype;
import cz.cvut.earlgrey.classmodel.classmodel.Enumeration;
import cz.cvut.earlgrey.classmodel.classmodel.Feature;
import cz.cvut.earlgrey.classmodel.classmodel.Import;
import cz.cvut.earlgrey.classmodel.classmodel.Model;
import cz.cvut.earlgrey.classmodel.classmodel.Multiplicity;
import cz.cvut.earlgrey.classmodel.classmodel.Operation;
import cz.cvut.earlgrey.classmodel.classmodel.Parameter;
import cz.cvut.earlgrey.classmodel.classmodel.Reference;
import cz.cvut.earlgrey.classmodel.classmodel.Relationship;
import cz.cvut.earlgrey.classmodel.classmodel.Type;
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
			case AnnotationPackage.PROPERTY:
				if(context == grammarAccess.getAssignPropertyRule()) {
					sequence_AssignProperty(context, (Property) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getValuePropertyRule()) {
					sequence_ValueProperty(context, (Property) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ClassmodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ClassmodelPackage.ARRAY:
				if(context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.CLASSIFIER:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Classifier(context, (Classifier) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.DATATYPE:
				if(context == grammarAccess.getDatatypeRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Datatype(context, (Datatype) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.ENUMERATION:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getEnumerationRule()) {
					sequence_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.FEATURE:
				if(context == grammarAccess.getEnumeratorRule()) {
					sequence_Enumerator(context, (Feature) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.MULTIPLICITY:
				if(context == grammarAccess.getMultiplicityRule()) {
					sequence_Multiplicity(context, (Multiplicity) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.OPERATION:
				if(context == grammarAccess.getFeatureRule()) {
					sequence_Feature(context, (Operation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.PACKAGE:
				if(context == grammarAccess.getElementRule() ||
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
			case ClassmodelPackage.REFERENCE:
				if(context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.RELATIONSHIP:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getRelationshipRule()) {
					sequence_Relationship(context, (Relationship) semanticObject); 
					return; 
				}
				else break;
			case ClassmodelPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ExtendedID (property+=Property property+=Property*)?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (size=Multiplicity?)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=Value)
	 */
	protected void sequence_AssignProperty(EObject context, Property semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=Visibility? static?='static'? name=ID type=Reference (implicit+=ImplicitValue implicit+=ImplicitValue*)?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotation+=Annotation* 
	 *         name=ID 
	 *         (generalization+=Type generalization+=Type*)? 
	 *         upperClass=Type? 
	 *         constraint=CONSTRAINT? 
	 *         feature+=Feature*
	 *     )
	 */
	protected void sequence_Classifier(EObject context, Classifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=Visibility? name=ID value=ImplicitValue)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* name=ID)
	 */
	protected void sequence_Datatype(EObject context, Datatype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* name=ID constraint=CONSTRAINT? enumerator+=Enumerator*)
	 */
	protected void sequence_Enumeration(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ImplicitValue? constraint=CONSTRAINT?)
	 */
	protected void sequence_Enumerator(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         static?='static'? 
	 *         name=ID 
	 *         type=Reference 
	 *         (implicit+=ImplicitValue implicit+=ImplicitValue*)? 
	 *         constraint=CONSTRAINT?
	 *     )
	 */
	protected void sequence_Feature(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=Visibility? name=ID value=ImplicitValue constraint=CONSTRAINT?)
	 */
	protected void sequence_Feature(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         static?='static'? 
	 *         name=ID 
	 *         (parameter+=Parameter parameter+=Parameter*)? 
	 *         return=Reference? 
	 *         body=BODY? 
	 *         constraint=CONSTRAINT?
	 *     )
	 */
	protected void sequence_Feature(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ClassmodelPackage.Literals.IMPORT__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassmodelPackage.Literals.IMPORT__IMPORT_URI));
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
	 *     (lower=MultiplicityValue upper=MultiplicityValue?)
	 */
	protected void sequence_Multiplicity(EObject context, Multiplicity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         visibility=Visibility? 
	 *         static?='static'? 
	 *         name=ID 
	 *         (parameter+=Parameter parameter+=Parameter*)? 
	 *         return=Reference? 
	 *         body=BODY?
	 *     )
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation+=Annotation* name=ID element+=Element*)
	 */
	protected void sequence_Package(EObject context, cz.cvut.earlgrey.classmodel.classmodel.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=Reference (implicit+=ImplicitValue implicit+=ImplicitValue*)?)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ExtendedID value=Value) | value=Value)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Entity|ExtendedID] array+=Array*)
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         annotation+=Annotation* 
	 *         type=RelationshipType 
	 *         label=CompositeID? 
	 *         headNavigable?='unnavigable'? 
	 *         (headVisibility=Visibility? headLabel=CompositeID)? 
	 *         head=[Entity|ExtendedID] 
	 *         headMultiplicity=Multiplicity 
	 *         tailNavigable?='unnavigable'? 
	 *         (tailVisibility=Visibility? tailLabel=CompositeID)? 
	 *         tail=[Entity|ExtendedID] 
	 *         tailMultiplicity=Multiplicity
	 *     )
	 */
	protected void sequence_Relationship(EObject context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (visibility=Visibility? name=[Entity|ExtendedID])
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Value
	 */
	protected void sequence_ValueProperty(EObject context, Property semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
}

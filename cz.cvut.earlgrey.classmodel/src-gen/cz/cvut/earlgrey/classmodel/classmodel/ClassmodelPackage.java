/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelFactory
 * @model kind="package"
 * @generated
 */
public interface ClassmodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "classmodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cvut.cz/earlgrey/classmodel/Classmodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "classmodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ClassmodelPackage eINSTANCE = cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl.init();

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ModelImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ImportImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ElementImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ANNOTATION = 0;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ANNOTATION = ELEMENT__ANNOTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.DatatypeImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 4;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__ANNOTATION = ENTITY__ANNOTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE__NAME = ENTITY__NAME;

  /**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.PackageImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 5;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ANNOTATION = ELEMENT__ANNOTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ELEMENT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassifierImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 6;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__ANNOTATION = ENTITY__ANNOTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__GENERALIZATION = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Upper Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__UPPER_CLASS = ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__CONSTRAINT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Feature</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__FEATURE = ENTITY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.TypeImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getType()
   * @generated
   */
  int TYPE = 7;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__VISIBILITY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.FeatureImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__VALUE = 1;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__CONSTRAINT = 2;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__VISIBILITY = 3;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.EnumerationImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 9;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ANNOTATION = ENTITY__ANNOTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__CONSTRAINT = ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enumerator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ENUMERATOR = ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 10;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__ANNOTATION = ELEMENT__ANNOTATION;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TYPE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__LABEL = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Head Navigable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__HEAD_NAVIGABLE = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Head Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__HEAD_VISIBILITY = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Head Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__HEAD_LABEL = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Head</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__HEAD = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Head Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__HEAD_MULTIPLICITY = ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Tail Navigable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TAIL_NAVIGABLE = ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Tail Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TAIL_VISIBILITY = ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Tail Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TAIL_LABEL = ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Tail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TAIL = ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Tail Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TAIL_MULTIPLICITY = ELEMENT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.MultiplicityImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 11;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__LOWER = 0;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__UPPER = 1;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ConstantImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VALUE = FEATURE__VALUE;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__CONSTRAINT = FEATURE__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__VISIBILITY = FEATURE__VISIBILITY;

  /**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.OperationImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VALUE = FEATURE__VALUE;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__CONSTRAINT = FEATURE__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VISIBILITY = FEATURE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__STATIC = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMETER = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RETURN = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__BODY = FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ParameterImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The feature id for the '<em><b>Implicit</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__IMPLICIT = 2;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.AttributeImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = FEATURE__VALUE;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__CONSTRAINT = FEATURE__CONSTRAINT;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VISIBILITY = FEATURE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__STATIC = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Implicit</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__IMPLICIT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ReferenceImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ARRAY = 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ArrayImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 17;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__SIZE = 0;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.RelationshipType <em>Relationship Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.RelationshipType
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getRelationshipType()
   * @generated
   */
  int RELATIONSHIP_TYPE = 18;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 19;


  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Element#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Element#getAnnotation()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Annotation();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Package#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Package#getElement()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Element();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getGeneralization <em>Generalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generalization</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Classifier#getGeneralization()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Generalization();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getUpperClass <em>Upper Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Upper Class</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Classifier#getUpperClass()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_UpperClass();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Classifier#getConstraint()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_Constraint();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Feature</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Classifier#getFeature()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Feature();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Type#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Type#getVisibility()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Visibility();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Type#getName()
   * @see #getType()
   * @generated
   */
  EReference getType_Name();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Feature#getValue()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Value();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Feature#getConstraint()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Constraint();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Feature#getVisibility()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Visibility();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Constraint</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getConstraint()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Constraint();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getEnumerator <em>Enumerator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumerator</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getEnumerator()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Enumerator();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getType()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Type();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getLabel()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Label();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#isHeadNavigable <em>Head Navigable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Head Navigable</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#isHeadNavigable()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_HeadNavigable();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadVisibility <em>Head Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Head Visibility</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadVisibility()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_HeadVisibility();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadLabel <em>Head Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Head Label</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadLabel()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_HeadLabel();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHead <em>Head</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Head</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHead()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Head();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadMultiplicity <em>Head Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Head Multiplicity</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadMultiplicity()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_HeadMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#isTailNavigable <em>Tail Navigable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tail Navigable</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#isTailNavigable()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_TailNavigable();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailVisibility <em>Tail Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tail Visibility</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailVisibility()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_TailVisibility();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailLabel <em>Tail Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tail Label</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailLabel()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_TailLabel();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTail <em>Tail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Tail</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTail()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Tail();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailMultiplicity <em>Tail Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tail Multiplicity</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailMultiplicity()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_TailMultiplicity();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Multiplicity#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Multiplicity#getLower()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Lower();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Multiplicity#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Multiplicity#getUpper()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Upper();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Operation#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Operation#isStatic()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Static();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Operation#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Operation#getParameter()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Parameter();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Operation#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Operation#getReturn()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Return();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Operation#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Operation#getBody()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Body();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute list '{@link cz.cvut.earlgrey.classmodel.classmodel.Parameter#getImplicit <em>Implicit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Implicit</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Parameter#getImplicit()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Implicit();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Attribute#isStatic()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Static();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute list '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getImplicit <em>Implicit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Implicit</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Attribute#getImplicit()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Implicit();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Reference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Reference#getType()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Type();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Reference#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Reference#getArray()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Array();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Array#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Array#getSize()
   * @see #getArray()
   * @generated
   */
  EReference getArray_Size();

  /**
   * Returns the meta object for enum '{@link cz.cvut.earlgrey.classmodel.classmodel.RelationshipType <em>Relationship Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relationship Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.RelationshipType
   * @generated
   */
  EEnum getRelationshipType();

  /**
   * Returns the meta object for enum '{@link cz.cvut.earlgrey.classmodel.classmodel.Visibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @generated
   */
  EEnum getVisibility();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ClassmodelFactory getClassmodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ModelImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ImportImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ElementImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ANNOTATION = eINSTANCE.getElement_Annotation();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.DatatypeImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.PackageImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ELEMENT = eINSTANCE.getPackage_Element();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassifierImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__GENERALIZATION = eINSTANCE.getClassifier_Generalization();

    /**
     * The meta object literal for the '<em><b>Upper Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__UPPER_CLASS = eINSTANCE.getClassifier_UpperClass();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__CONSTRAINT = eINSTANCE.getClassifier_Constraint();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__FEATURE = eINSTANCE.getClassifier_Feature();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.TypeImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__VISIBILITY = eINSTANCE.getType_Visibility();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.FeatureImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__VALUE = eINSTANCE.getFeature_Value();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__CONSTRAINT = eINSTANCE.getFeature_Constraint();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__VISIBILITY = eINSTANCE.getFeature_Visibility();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.EnumerationImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__CONSTRAINT = eINSTANCE.getEnumeration_Constraint();

    /**
     * The meta object literal for the '<em><b>Enumerator</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__ENUMERATOR = eINSTANCE.getEnumeration_Enumerator();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__LABEL = eINSTANCE.getRelationship_Label();

    /**
     * The meta object literal for the '<em><b>Head Navigable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__HEAD_NAVIGABLE = eINSTANCE.getRelationship_HeadNavigable();

    /**
     * The meta object literal for the '<em><b>Head Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__HEAD_VISIBILITY = eINSTANCE.getRelationship_HeadVisibility();

    /**
     * The meta object literal for the '<em><b>Head Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__HEAD_LABEL = eINSTANCE.getRelationship_HeadLabel();

    /**
     * The meta object literal for the '<em><b>Head</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__HEAD = eINSTANCE.getRelationship_Head();

    /**
     * The meta object literal for the '<em><b>Head Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__HEAD_MULTIPLICITY = eINSTANCE.getRelationship_HeadMultiplicity();

    /**
     * The meta object literal for the '<em><b>Tail Navigable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__TAIL_NAVIGABLE = eINSTANCE.getRelationship_TailNavigable();

    /**
     * The meta object literal for the '<em><b>Tail Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__TAIL_VISIBILITY = eINSTANCE.getRelationship_TailVisibility();

    /**
     * The meta object literal for the '<em><b>Tail Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__TAIL_LABEL = eINSTANCE.getRelationship_TailLabel();

    /**
     * The meta object literal for the '<em><b>Tail</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__TAIL = eINSTANCE.getRelationship_Tail();

    /**
     * The meta object literal for the '<em><b>Tail Multiplicity</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__TAIL_MULTIPLICITY = eINSTANCE.getRelationship_TailMultiplicity();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.MultiplicityImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getMultiplicity()
     * @generated
     */
    EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__LOWER = eINSTANCE.getMultiplicity_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__UPPER = eINSTANCE.getMultiplicity_Upper();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ConstantImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getConstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getConstant();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.OperationImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__STATIC = eINSTANCE.getOperation_Static();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMETER = eINSTANCE.getOperation_Parameter();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__RETURN = eINSTANCE.getOperation_Return();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__BODY = eINSTANCE.getOperation_Body();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ParameterImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Implicit</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__IMPLICIT = eINSTANCE.getParameter_Implicit();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.AttributeImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__STATIC = eINSTANCE.getAttribute_Static();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Implicit</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__IMPLICIT = eINSTANCE.getAttribute_Implicit();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ReferenceImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__ARRAY = eINSTANCE.getReference_Array();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ArrayImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__SIZE = eINSTANCE.getArray_Size();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.RelationshipType <em>Relationship Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.RelationshipType
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getRelationshipType()
     * @generated
     */
    EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

  }

} //ClassmodelPackage

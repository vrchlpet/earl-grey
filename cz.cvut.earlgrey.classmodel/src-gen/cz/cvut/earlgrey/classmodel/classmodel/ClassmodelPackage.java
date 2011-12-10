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
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelImpl <em>Classmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getClassmodel()
   * @generated
   */
  int CLASSMODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSMODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSMODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Classmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSMODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.AbstractElementImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.PackageImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ImportImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

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
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ATTRIBUTE = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__METHOD = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ReferenceImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Generic</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__GENERIC = 1;

  /**
   * The feature id for the '<em><b>Dimension</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__DIMENSION = 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.MethodImpl <em>Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.MethodImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getMethod()
   * @generated
   */
  int METHOD = 6;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__NAME = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD__RETURN = 3;

  /**
   * The number of structural features of the '<em>Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ParameterImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.AttributeImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Modifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__MODIFIER = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl <em>Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getRelation()
   * @generated
   */
  int RELATION = 9;

  /**
   * The feature id for the '<em><b>Origin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__ORIGIN = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cardinality From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__CARDINALITY_FROM = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__TYPE = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cardinality To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__CARDINALITY_TO = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__DESTINATION = ABSTRACT_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION__LABEL = ABSTRACT_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATION_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.RelationType <em>Relation Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.RelationType
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getRelationType()
   * @generated
   */
  int RELATION_TYPE = 10;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.Visibility <em>Visibility</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getVisibility()
   * @generated
   */
  int VISIBILITY = 11;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.classmodel.classmodel.EntityType <em>Entity Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.classmodel.classmodel.EntityType
   * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 12;


  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Classmodel <em>Classmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classmodel</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Classmodel
   * @generated
   */
  EClass getClassmodel();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Classmodel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Classmodel#getImports()
   * @see #getClassmodel()
   * @generated
   */
  EReference getClassmodel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Classmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Classmodel#getElements()
   * @see #getClassmodel()
   * @generated
   */
  EReference getClassmodel_Elements();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

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
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Package#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Package#getElements()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_Elements();

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
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Entity#getType()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Type();

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
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Entity#getAttribute()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Attribute();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Method</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Entity#getMethod()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Method();

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
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Reference#getGeneric <em>Generic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generic</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Reference#getGeneric()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Generic();

  /**
   * Returns the meta object for the attribute list '{@link cz.cvut.earlgrey.classmodel.classmodel.Reference#getDimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Dimension</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Reference#getDimension()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Dimension();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Method
   * @generated
   */
  EClass getMethod();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Method#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Method#getModifier()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Modifier();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Method#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Method#getName()
   * @see #getMethod()
   * @generated
   */
  EAttribute getMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.classmodel.classmodel.Method#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Method#getParameters()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Method#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Method#getReturn()
   * @see #getMethod()
   * @generated
   */
  EReference getMethod_Return();

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
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getModifier <em>Modifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Modifier</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Attribute#getModifier()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Modifier();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

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
   * Returns the meta object for class '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relation</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relation
   * @generated
   */
  EClass getRelation();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getOrigin <em>Origin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Origin</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relation#getOrigin()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Origin();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getCardinalityFrom <em>Cardinality From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality From</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relation#getCardinalityFrom()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_CardinalityFrom();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relation#getType()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Type();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getCardinalityTo <em>Cardinality To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality To</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relation#getCardinalityTo()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_CardinalityTo();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Destination</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relation#getDestination()
   * @see #getRelation()
   * @generated
   */
  EReference getRelation_Destination();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Relation#getLabel()
   * @see #getRelation()
   * @generated
   */
  EAttribute getRelation_Label();

  /**
   * Returns the meta object for enum '{@link cz.cvut.earlgrey.classmodel.classmodel.RelationType <em>Relation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relation Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.RelationType
   * @generated
   */
  EEnum getRelationType();

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
   * Returns the meta object for enum '{@link cz.cvut.earlgrey.classmodel.classmodel.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Entity Type</em>'.
   * @see cz.cvut.earlgrey.classmodel.classmodel.EntityType
   * @generated
   */
  EEnum getEntityType();

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
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelImpl <em>Classmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getClassmodel()
     * @generated
     */
    EClass CLASSMODEL = eINSTANCE.getClassmodel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSMODEL__IMPORTS = eINSTANCE.getClassmodel_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSMODEL__ELEMENTS = eINSTANCE.getClassmodel_Elements();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.AbstractElementImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

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
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__ELEMENTS = eINSTANCE.getPackage_Elements();

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
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__TYPE = eINSTANCE.getEntity_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ATTRIBUTE = eINSTANCE.getEntity_Attribute();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__METHOD = eINSTANCE.getEntity_Method();

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
     * The meta object literal for the '<em><b>Generic</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__GENERIC = eINSTANCE.getReference_Generic();

    /**
     * The meta object literal for the '<em><b>Dimension</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__DIMENSION = eINSTANCE.getReference_Dimension();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.MethodImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getMethod()
     * @generated
     */
    EClass METHOD = eINSTANCE.getMethod();

    /**
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__MODIFIER = eINSTANCE.getMethod_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD__RETURN = eINSTANCE.getMethod_Return();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

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
     * The meta object literal for the '<em><b>Modifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__MODIFIER = eINSTANCE.getAttribute_Modifier();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getRelation()
     * @generated
     */
    EClass RELATION = eINSTANCE.getRelation();

    /**
     * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__ORIGIN = eINSTANCE.getRelation_Origin();

    /**
     * The meta object literal for the '<em><b>Cardinality From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__CARDINALITY_FROM = eINSTANCE.getRelation_CardinalityFrom();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

    /**
     * The meta object literal for the '<em><b>Cardinality To</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__CARDINALITY_TO = eINSTANCE.getRelation_CardinalityTo();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATION__DESTINATION = eINSTANCE.getRelation_Destination();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATION__LABEL = eINSTANCE.getRelation_Label();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.RelationType <em>Relation Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.RelationType
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getRelationType()
     * @generated
     */
    EEnum RELATION_TYPE = eINSTANCE.getRelationType();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.Visibility <em>Visibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getVisibility()
     * @generated
     */
    EEnum VISIBILITY = eINSTANCE.getVisibility();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.classmodel.classmodel.EntityType <em>Entity Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.classmodel.classmodel.EntityType
     * @see cz.cvut.earlgrey.classmodel.classmodel.impl.ClassmodelPackageImpl#getEntityType()
     * @generated
     */
    EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

  }

} //ClassmodelPackage

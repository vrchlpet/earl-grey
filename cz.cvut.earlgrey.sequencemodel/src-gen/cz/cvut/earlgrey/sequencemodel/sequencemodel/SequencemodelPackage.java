/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;

import cz.cvut.earlgrey.annotation.annotation.AnnotationPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelFactory
 * @model kind="package"
 * @generated
 */
public interface SequencemodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sequencemodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cvut.cz/earlgrey/sequencemodel/Sequencemodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sequencemodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SequencemodelPackage eINSTANCE = cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl.init();

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ModelImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getModel()
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
   * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SEQUENCE = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ImportImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getImport()
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
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequenceImpl <em>Sequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequenceImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getSequence()
   * @generated
   */
  int SEQUENCE = 2;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__NAME = 1;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__PARTICIPANT = 2;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ParticipantImpl <em>Participant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ParticipantImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getParticipant()
   * @generated
   */
  int PARTICIPANT = 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__NAME = 1;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__TRANSITION = 2;

  /**
   * The number of structural features of the '<em>Participant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.TransitionImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 4;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.TransitionBlockImpl <em>Transition Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.TransitionBlockImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getTransitionBlock()
   * @generated
   */
  int TRANSITION_BLOCK = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK__NAME = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK__PARAMETER = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK__TRANSITION = TRANSITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Transition Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.FragmentImpl <em>Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.FragmentImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getFragment()
   * @generated
   */
  int FRAGMENT = 6;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__EXPR = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT__TRANSITION = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRAGMENT_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.IfElseFragmentImpl <em>If Else Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.IfElseFragmentImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getIfElseFragment()
   * @generated
   */
  int IF_ELSE_FRAGMENT = 7;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_FRAGMENT__EXPR = FRAGMENT__EXPR;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_FRAGMENT__TRANSITION = FRAGMENT__TRANSITION;

  /**
   * The feature id for the '<em><b>Else If Expr</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_FRAGMENT__ELSE_IF_EXPR = FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Else Iftransition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_FRAGMENT__ELSE_IFTRANSITION = FRAGMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_FRAGMENT__ELSE_TRANSITION = FRAGMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Else Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_ELSE_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ForeachFragmentImpl <em>Foreach Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ForeachFragmentImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getForeachFragment()
   * @generated
   */
  int FOREACH_FRAGMENT = 8;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FRAGMENT__EXPR = FRAGMENT__EXPR;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FRAGMENT__TRANSITION = FRAGMENT__TRANSITION;

  /**
   * The number of structural features of the '<em>Foreach Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREACH_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LoopFragmentImpl <em>Loop Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LoopFragmentImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getLoopFragment()
   * @generated
   */
  int LOOP_FRAGMENT = 9;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FRAGMENT__EXPR = FRAGMENT__EXPR;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FRAGMENT__TRANSITION = FRAGMENT__TRANSITION;

  /**
   * The number of structural features of the '<em>Loop Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.AssertFragmentImpl <em>Assert Fragment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.AssertFragmentImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getAssertFragment()
   * @generated
   */
  int ASSERT_FRAGMENT = 10;

  /**
   * The feature id for the '<em><b>Expr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FRAGMENT__EXPR = FRAGMENT__EXPR;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FRAGMENT__TRANSITION = FRAGMENT__TRANSITION;

  /**
   * The number of structural features of the '<em>Assert Fragment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FRAGMENT_FEATURE_COUNT = FRAGMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.MessageImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 11;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__PARAMETER = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl <em>Call Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getCallMessage()
   * @generated
   */
  int CALL_MESSAGE = 12;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_MESSAGE__PARAMETER = MESSAGE__PARAMETER;

  /**
   * The feature id for the '<em><b>Participant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_MESSAGE__PARTICIPANT = MESSAGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_MESSAGE__NAME = MESSAGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.NewMessageImpl <em>New Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.NewMessageImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getNewMessage()
   * @generated
   */
  int NEW_MESSAGE = 13;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MESSAGE__PARAMETER = MESSAGE__PARAMETER;

  /**
   * The feature id for the '<em><b>Participant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MESSAGE__PARTICIPANT = MESSAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>New Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEW_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReturnMessageImpl <em>Return Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReturnMessageImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getReturnMessage()
   * @generated
   */
  int RETURN_MESSAGE = 14;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_MESSAGE__PARAMETER = MESSAGE__PARAMETER;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_MESSAGE__NAME = MESSAGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ParameterImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = AnnotationPackage.PARAMETER__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = AnnotationPackage.PARAMETER__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = AnnotationPackage.PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = AnnotationPackage.PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReferenceImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 16;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
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
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ArrayImpl <em>Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ArrayImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getArray()
   * @generated
   */
  int ARRAY = 17;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
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
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Model#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Model#getSequence()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Sequence();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequence</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence
   * @generated
   */
  EClass getSequence();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getAnnotation()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Annotation();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getName()
   * @see #getSequence()
   * @generated
   */
  EAttribute getSequence_Name();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getParticipant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Participant</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getParticipant()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Participant();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Participant</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant
   * @generated
   */
  EClass getParticipant();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant#getAnnotation()
   * @see #getParticipant()
   * @generated
   */
  EReference getParticipant_Annotation();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant#getName()
   * @see #getParticipant()
   * @generated
   */
  EAttribute getParticipant_Name();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant#getTransition()
   * @see #getParticipant()
   * @generated
   */
  EReference getParticipant_Transition();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock <em>Transition Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Block</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock
   * @generated
   */
  EClass getTransitionBlock();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getName()
   * @see #getTransitionBlock()
   * @generated
   */
  EAttribute getTransitionBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getParameter()
   * @see #getTransitionBlock()
   * @generated
   */
  EReference getTransitionBlock_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getTransition()
   * @see #getTransitionBlock()
   * @generated
   */
  EReference getTransitionBlock_Transition();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Fragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fragment</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Fragment
   * @generated
   */
  EClass getFragment();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Fragment#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expr</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Fragment#getExpr()
   * @see #getFragment()
   * @generated
   */
  EAttribute getFragment_Expr();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Fragment#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Fragment#getTransition()
   * @see #getFragment()
   * @generated
   */
  EReference getFragment_Transition();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment <em>If Else Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Else Fragment</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment
   * @generated
   */
  EClass getIfElseFragment();

  /**
   * Returns the meta object for the attribute list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseIfExpr <em>Else If Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Else If Expr</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseIfExpr()
   * @see #getIfElseFragment()
   * @generated
   */
  EAttribute getIfElseFragment_ElseIfExpr();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseIftransition <em>Else Iftransition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Iftransition</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseIftransition()
   * @see #getIfElseFragment()
   * @generated
   */
  EReference getIfElseFragment_ElseIftransition();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseTransition <em>Else Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Else Transition</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseTransition()
   * @see #getIfElseFragment()
   * @generated
   */
  EReference getIfElseFragment_ElseTransition();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.ForeachFragment <em>Foreach Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreach Fragment</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.ForeachFragment
   * @generated
   */
  EClass getForeachFragment();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.LoopFragment <em>Loop Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Fragment</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.LoopFragment
   * @generated
   */
  EClass getLoopFragment();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.AssertFragment <em>Assert Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert Fragment</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.AssertFragment
   * @generated
   */
  EClass getAssertFragment();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Message#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Message#getParameter()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Parameter();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage <em>Call Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Message</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage
   * @generated
   */
  EClass getCallMessage();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getParticipant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Participant</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getParticipant()
   * @see #getCallMessage()
   * @generated
   */
  EAttribute getCallMessage_Participant();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getName()
   * @see #getCallMessage()
   * @generated
   */
  EAttribute getCallMessage_Name();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.NewMessage <em>New Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Message</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.NewMessage
   * @generated
   */
  EClass getNewMessage();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.NewMessage#getParticipant <em>Participant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Participant</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.NewMessage#getParticipant()
   * @see #getNewMessage()
   * @generated
   */
  EAttribute getNewMessage_Participant();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage <em>Return Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Message</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage
   * @generated
   */
  EClass getReturnMessage();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage#getName()
   * @see #getReturnMessage()
   * @generated
   */
  EReference getReturnMessage_Name();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Reference#getType()
   * @see #getReference()
   * @generated
   */
  EAttribute getReference_Type();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reference#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Array</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Reference#getArray()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Array();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Array <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Array
   * @generated
   */
  EClass getArray();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Array#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Array#getSize()
   * @see #getArray()
   * @generated
   */
  EAttribute getArray_Size();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SequencemodelFactory getSequencemodelFactory();

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
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ModelImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SEQUENCE = eINSTANCE.getModel_Sequence();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ImportImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getImport()
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
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequenceImpl <em>Sequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequenceImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getSequence()
     * @generated
     */
    EClass SEQUENCE = eINSTANCE.getSequence();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__ANNOTATION = eINSTANCE.getSequence_Annotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

    /**
     * The meta object literal for the '<em><b>Participant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__PARTICIPANT = eINSTANCE.getSequence_Participant();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ParticipantImpl <em>Participant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ParticipantImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getParticipant()
     * @generated
     */
    EClass PARTICIPANT = eINSTANCE.getParticipant();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT__ANNOTATION = eINSTANCE.getParticipant_Annotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARTICIPANT__NAME = eINSTANCE.getParticipant_Name();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARTICIPANT__TRANSITION = eINSTANCE.getParticipant_Transition();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.TransitionImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.TransitionBlockImpl <em>Transition Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.TransitionBlockImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getTransitionBlock()
     * @generated
     */
    EClass TRANSITION_BLOCK = eINSTANCE.getTransitionBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_BLOCK__NAME = eINSTANCE.getTransitionBlock_Name();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_BLOCK__PARAMETER = eINSTANCE.getTransitionBlock_Parameter();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_BLOCK__TRANSITION = eINSTANCE.getTransitionBlock_Transition();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.FragmentImpl <em>Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.FragmentImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getFragment()
     * @generated
     */
    EClass FRAGMENT = eINSTANCE.getFragment();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FRAGMENT__EXPR = eINSTANCE.getFragment_Expr();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FRAGMENT__TRANSITION = eINSTANCE.getFragment_Transition();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.IfElseFragmentImpl <em>If Else Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.IfElseFragmentImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getIfElseFragment()
     * @generated
     */
    EClass IF_ELSE_FRAGMENT = eINSTANCE.getIfElseFragment();

    /**
     * The meta object literal for the '<em><b>Else If Expr</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_ELSE_FRAGMENT__ELSE_IF_EXPR = eINSTANCE.getIfElseFragment_ElseIfExpr();

    /**
     * The meta object literal for the '<em><b>Else Iftransition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_FRAGMENT__ELSE_IFTRANSITION = eINSTANCE.getIfElseFragment_ElseIftransition();

    /**
     * The meta object literal for the '<em><b>Else Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_ELSE_FRAGMENT__ELSE_TRANSITION = eINSTANCE.getIfElseFragment_ElseTransition();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ForeachFragmentImpl <em>Foreach Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ForeachFragmentImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getForeachFragment()
     * @generated
     */
    EClass FOREACH_FRAGMENT = eINSTANCE.getForeachFragment();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LoopFragmentImpl <em>Loop Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LoopFragmentImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getLoopFragment()
     * @generated
     */
    EClass LOOP_FRAGMENT = eINSTANCE.getLoopFragment();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.AssertFragmentImpl <em>Assert Fragment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.AssertFragmentImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getAssertFragment()
     * @generated
     */
    EClass ASSERT_FRAGMENT = eINSTANCE.getAssertFragment();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.MessageImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__PARAMETER = eINSTANCE.getMessage_Parameter();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl <em>Call Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getCallMessage()
     * @generated
     */
    EClass CALL_MESSAGE = eINSTANCE.getCallMessage();

    /**
     * The meta object literal for the '<em><b>Participant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_MESSAGE__PARTICIPANT = eINSTANCE.getCallMessage_Participant();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_MESSAGE__NAME = eINSTANCE.getCallMessage_Name();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.NewMessageImpl <em>New Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.NewMessageImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getNewMessage()
     * @generated
     */
    EClass NEW_MESSAGE = eINSTANCE.getNewMessage();

    /**
     * The meta object literal for the '<em><b>Participant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NEW_MESSAGE__PARTICIPANT = eINSTANCE.getNewMessage_Participant();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReturnMessageImpl <em>Return Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReturnMessageImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getReturnMessage()
     * @generated
     */
    EClass RETURN_MESSAGE = eINSTANCE.getReturnMessage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_MESSAGE__NAME = eINSTANCE.getReturnMessage_Name();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ParameterImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getParameter()
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
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReferenceImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE__TYPE = eINSTANCE.getReference_Type();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__ARRAY = eINSTANCE.getReference_Array();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ArrayImpl <em>Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ArrayImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getArray()
     * @generated
     */
    EClass ARRAY = eINSTANCE.getArray();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY__SIZE = eINSTANCE.getArray_Size();

  }

} //SequencemodelPackage

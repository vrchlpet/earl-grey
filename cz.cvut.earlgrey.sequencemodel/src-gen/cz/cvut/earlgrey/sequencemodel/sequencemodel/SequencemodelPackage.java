/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;

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
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelImpl <em>Sequencemodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getSequencemodel()
   * @generated
   */
  int SEQUENCEMODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCEMODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Sequence</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCEMODEL__SEQUENCE = 1;

  /**
   * The number of structural features of the '<em>Sequencemodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCEMODEL_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Lifeline</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__LIFELINE = 1;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE__TRANSITION = 2;

  /**
   * The number of structural features of the '<em>Sequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEQUENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LifelineImpl <em>Lifeline</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LifelineImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getLifeline()
   * @generated
   */
  int LIFELINE = 3;

  /**
   * The feature id for the '<em><b>Actor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE__ACTOR = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE__NAME = 1;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE__ENTITY = 2;

  /**
   * The number of structural features of the '<em>Lifeline</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIFELINE_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Caller</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__CALLER = 0;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATEMENT = 1;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.StatementImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getCall()
   * @generated
   */
  int CALL = 6;

  /**
   * The feature id for the '<em><b>Called</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__CALLED = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__MESSAGE = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Reply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__REPLY = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReplyImpl <em>Reply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReplyImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getReply()
   * @generated
   */
  int REPLY = 7;

  /**
   * The feature id for the '<em><b>Called</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLY__CALLED = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLY__REPLY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REPLY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SelfImpl <em>Self</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SelfImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getSelf()
   * @generated
   */
  int SELF = 8;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF__MESSAGE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF__REPLY = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Self</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELF_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CreateImpl <em>Create</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CreateImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getCreate()
   * @generated
   */
  int CREATE = 9;

  /**
   * The feature id for the '<em><b>Called</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE__CALLED = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Create</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.DestroyImpl <em>Destroy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.DestroyImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getDestroy()
   * @generated
   */
  int DESTROY = 10;

  /**
   * The feature id for the '<em><b>Called</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTROY__CALLED = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Destroy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESTROY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__PARAM = 1;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel <em>Sequencemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sequencemodel</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel
   * @generated
   */
  EClass getSequencemodel();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel#getImports()
   * @see #getSequencemodel()
   * @generated
   */
  EReference getSequencemodel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel#getSequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sequence</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel#getSequence()
   * @see #getSequencemodel()
   * @generated
   */
  EReference getSequencemodel_Sequence();

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
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getLifeline <em>Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lifeline</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getLifeline()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Lifeline();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence#getTransition()
   * @see #getSequence()
   * @generated
   */
  EReference getSequence_Transition();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline <em>Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lifeline</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline
   * @generated
   */
  EClass getLifeline();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#isActor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Actor</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#isActor()
   * @see #getLifeline()
   * @generated
   */
  EAttribute getLifeline_Actor();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#getName()
   * @see #getLifeline()
   * @generated
   */
  EAttribute getLifeline_Name();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#getEntity()
   * @see #getLifeline()
   * @generated
   */
  EReference getLifeline_Entity();

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
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition#getCaller <em>Caller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Caller</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition#getCaller()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Caller();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statement</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition#getStatement()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Statement();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getCalled <em>Called</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Called</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getCalled()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Called();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getMessage()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Message();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getReply <em>Reply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reply</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getReply()
   * @see #getCall()
   * @generated
   */
  EAttribute getCall_Reply();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply <em>Reply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reply</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply
   * @generated
   */
  EClass getReply();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply#getCalled <em>Called</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Called</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply#getCalled()
   * @see #getReply()
   * @generated
   */
  EReference getReply_Called();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply#getReply <em>Reply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reply</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply#getReply()
   * @see #getReply()
   * @generated
   */
  EAttribute getReply_Reply();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Self <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Self</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Self
   * @generated
   */
  EClass getSelf();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Self#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Message</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Self#getMessage()
   * @see #getSelf()
   * @generated
   */
  EReference getSelf_Message();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Self#getReply <em>Reply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reply</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Self#getReply()
   * @see #getSelf()
   * @generated
   */
  EAttribute getSelf_Reply();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Create <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Create
   * @generated
   */
  EClass getCreate();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Create#getCalled <em>Called</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Called</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Create#getCalled()
   * @see #getCreate()
   * @generated
   */
  EReference getCreate_Called();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy <em>Destroy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Destroy</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy
   * @generated
   */
  EClass getDestroy();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy#getCalled <em>Called</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Called</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy#getCalled()
   * @see #getDestroy()
   * @generated
   */
  EReference getDestroy_Called();

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
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Message#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Message#getName()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Name();

  /**
   * Returns the meta object for the attribute list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Message#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Param</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Message#getParam()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Param();

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
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelImpl <em>Sequencemodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getSequencemodel()
     * @generated
     */
    EClass SEQUENCEMODEL = eINSTANCE.getSequencemodel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCEMODEL__IMPORTS = eINSTANCE.getSequencemodel_Imports();

    /**
     * The meta object literal for the '<em><b>Sequence</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCEMODEL__SEQUENCE = eINSTANCE.getSequencemodel_Sequence();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

    /**
     * The meta object literal for the '<em><b>Lifeline</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__LIFELINE = eINSTANCE.getSequence_Lifeline();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEQUENCE__TRANSITION = eINSTANCE.getSequence_Transition();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LifelineImpl <em>Lifeline</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LifelineImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getLifeline()
     * @generated
     */
    EClass LIFELINE = eINSTANCE.getLifeline();

    /**
     * The meta object literal for the '<em><b>Actor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIFELINE__ACTOR = eINSTANCE.getLifeline_Actor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIFELINE__NAME = eINSTANCE.getLifeline_Name();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIFELINE__ENTITY = eINSTANCE.getLifeline_Entity();

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
     * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__CALLER = eINSTANCE.getTransition_Caller();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATEMENT = eINSTANCE.getTransition_Statement();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.StatementImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Called</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__CALLED = eINSTANCE.getCall_Called();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__MESSAGE = eINSTANCE.getCall_Message();

    /**
     * The meta object literal for the '<em><b>Reply</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL__REPLY = eINSTANCE.getCall_Reply();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReplyImpl <em>Reply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReplyImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getReply()
     * @generated
     */
    EClass REPLY = eINSTANCE.getReply();

    /**
     * The meta object literal for the '<em><b>Called</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REPLY__CALLED = eINSTANCE.getReply_Called();

    /**
     * The meta object literal for the '<em><b>Reply</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REPLY__REPLY = eINSTANCE.getReply_Reply();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SelfImpl <em>Self</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SelfImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getSelf()
     * @generated
     */
    EClass SELF = eINSTANCE.getSelf();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELF__MESSAGE = eINSTANCE.getSelf_Message();

    /**
     * The meta object literal for the '<em><b>Reply</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELF__REPLY = eINSTANCE.getSelf_Reply();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CreateImpl <em>Create</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CreateImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getCreate()
     * @generated
     */
    EClass CREATE = eINSTANCE.getCreate();

    /**
     * The meta object literal for the '<em><b>Called</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATE__CALLED = eINSTANCE.getCreate_Called();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.DestroyImpl <em>Destroy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.DestroyImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getDestroy()
     * @generated
     */
    EClass DESTROY = eINSTANCE.getDestroy();

    /**
     * The meta object literal for the '<em><b>Called</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESTROY__CALLED = eINSTANCE.getDestroy_Called();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__PARAM = eINSTANCE.getMessage_Param();

  }

} //SequencemodelPackage

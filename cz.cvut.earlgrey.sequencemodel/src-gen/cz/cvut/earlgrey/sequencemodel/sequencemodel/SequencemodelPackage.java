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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__NAME = 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT__TRANSITION = 1;

  /**
   * The number of structural features of the '<em>Participant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARTICIPANT_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK__TRANSITION = TRANSITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.MessageImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 6;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl <em>Call Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getCallMessage()
   * @generated
   */
  int CALL_MESSAGE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_MESSAGE__NAME = MESSAGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_MESSAGE__PARAM = MESSAGE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Participant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_MESSAGE__PARTICIPANT = MESSAGE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Call Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.NewMessageImpl <em>New Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.NewMessageImpl
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getNewMessage()
   * @generated
   */
  int NEW_MESSAGE = 8;

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
  int RETURN_MESSAGE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_MESSAGE__NAME = MESSAGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_MESSAGE__PARAM = MESSAGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Return Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_MESSAGE_FEATURE_COUNT = MESSAGE_FEATURE_COUNT + 2;


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
   * Returns the meta object for class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Message
   * @generated
   */
  EClass getMessage();

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
   * Returns the meta object for the attribute list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Param</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getParam()
   * @see #getCallMessage()
   * @generated
   */
  EAttribute getCallMessage_Param();

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
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage#getName()
   * @see #getReturnMessage()
   * @generated
   */
  EAttribute getReturnMessage_Name();

  /**
   * Returns the meta object for the attribute list '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Param</em>'.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage#getParam()
   * @see #getReturnMessage()
   * @generated
   */
  EAttribute getReturnMessage_Param();

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
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_BLOCK__TRANSITION = eINSTANCE.getTransitionBlock_Transition();

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
     * The meta object literal for the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl <em>Call Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl
     * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelPackageImpl#getCallMessage()
     * @generated
     */
    EClass CALL_MESSAGE = eINSTANCE.getCallMessage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_MESSAGE__NAME = eINSTANCE.getCallMessage_Name();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_MESSAGE__PARAM = eINSTANCE.getCallMessage_Param();

    /**
     * The meta object literal for the '<em><b>Participant</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALL_MESSAGE__PARTICIPANT = eINSTANCE.getCallMessage_Participant();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN_MESSAGE__NAME = eINSTANCE.getReturnMessage_Name();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN_MESSAGE__PARAM = eINSTANCE.getReturnMessage_Param();

  }

} //SequencemodelPackage

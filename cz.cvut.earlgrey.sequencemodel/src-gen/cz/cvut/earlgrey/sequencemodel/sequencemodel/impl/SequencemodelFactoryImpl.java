/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequencemodelFactoryImpl extends EFactoryImpl implements SequencemodelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SequencemodelFactory init()
  {
    try
    {
      SequencemodelFactory theSequencemodelFactory = (SequencemodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.cvut.cz/earlgrey/sequencemodel/Sequencemodel"); 
      if (theSequencemodelFactory != null)
      {
        return theSequencemodelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SequencemodelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequencemodelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SequencemodelPackage.SEQUENCEMODEL: return createSequencemodel();
      case SequencemodelPackage.IMPORT: return createImport();
      case SequencemodelPackage.SEQUENCE: return createSequence();
      case SequencemodelPackage.PARTICIPANT: return createParticipant();
      case SequencemodelPackage.TRANSITION: return createTransition();
      case SequencemodelPackage.TRANSITION_BLOCK: return createTransitionBlock();
      case SequencemodelPackage.MESSAGE: return createMessage();
      case SequencemodelPackage.CALL_MESSAGE: return createCallMessage();
      case SequencemodelPackage.NEW_MESSAGE: return createNewMessage();
      case SequencemodelPackage.RETURN_MESSAGE: return createReturnMessage();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequencemodel createSequencemodel()
  {
    SequencemodelImpl sequencemodel = new SequencemodelImpl();
    return sequencemodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sequence createSequence()
  {
    SequenceImpl sequence = new SequenceImpl();
    return sequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant createParticipant()
  {
    ParticipantImpl participant = new ParticipantImpl();
    return participant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TransitionBlock createTransitionBlock()
  {
    TransitionBlockImpl transitionBlock = new TransitionBlockImpl();
    return transitionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CallMessage createCallMessage()
  {
    CallMessageImpl callMessage = new CallMessageImpl();
    return callMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NewMessage createNewMessage()
  {
    NewMessageImpl newMessage = new NewMessageImpl();
    return newMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnMessage createReturnMessage()
  {
    ReturnMessageImpl returnMessage = new ReturnMessageImpl();
    return returnMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequencemodelPackage getSequencemodelPackage()
  {
    return (SequencemodelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SequencemodelPackage getPackage()
  {
    return SequencemodelPackage.eINSTANCE;
  }

} //SequencemodelFactoryImpl

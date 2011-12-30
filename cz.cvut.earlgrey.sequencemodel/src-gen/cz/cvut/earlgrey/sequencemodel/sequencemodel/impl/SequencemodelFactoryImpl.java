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
      case SequencemodelPackage.LIFELINE: return createLifeline();
      case SequencemodelPackage.TRANSITION: return createTransition();
      case SequencemodelPackage.STATEMENT: return createStatement();
      case SequencemodelPackage.CALL: return createCall();
      case SequencemodelPackage.REPLY: return createReply();
      case SequencemodelPackage.SELF: return createSelf();
      case SequencemodelPackage.CREATE: return createCreate();
      case SequencemodelPackage.DESTROY: return createDestroy();
      case SequencemodelPackage.MESSAGE: return createMessage();
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
  public Lifeline createLifeline()
  {
    LifelineImpl lifeline = new LifelineImpl();
    return lifeline;
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
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reply createReply()
  {
    ReplyImpl reply = new ReplyImpl();
    return reply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Self createSelf()
  {
    SelfImpl self = new SelfImpl();
    return self;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Create createCreate()
  {
    CreateImpl create = new CreateImpl();
    return create;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Destroy createDestroy()
  {
    DestroyImpl destroy = new DestroyImpl();
    return destroy;
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

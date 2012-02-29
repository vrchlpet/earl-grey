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
      case SequencemodelPackage.MODEL: return createModel();
      case SequencemodelPackage.IMPORT: return createImport();
      case SequencemodelPackage.SEQUENCE: return createSequence();
      case SequencemodelPackage.PARTICIPANT: return createParticipant();
      case SequencemodelPackage.TRANSITION: return createTransition();
      case SequencemodelPackage.TRANSITION_BLOCK: return createTransitionBlock();
      case SequencemodelPackage.FRAGMENT: return createFragment();
      case SequencemodelPackage.IF_ELSE_FRAGMENT: return createIfElseFragment();
      case SequencemodelPackage.FOREACH_FRAGMENT: return createForeachFragment();
      case SequencemodelPackage.LOOP_FRAGMENT: return createLoopFragment();
      case SequencemodelPackage.ASSERT_FRAGMENT: return createAssertFragment();
      case SequencemodelPackage.MESSAGE: return createMessage();
      case SequencemodelPackage.CALL_MESSAGE: return createCallMessage();
      case SequencemodelPackage.NEW_MESSAGE: return createNewMessage();
      case SequencemodelPackage.RETURN_MESSAGE: return createReturnMessage();
      case SequencemodelPackage.PARAMETER: return createParameter();
      case SequencemodelPackage.REFERENCE: return createReference();
      case SequencemodelPackage.ARRAY: return createArray();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
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
  public Fragment createFragment()
  {
    FragmentImpl fragment = new FragmentImpl();
    return fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfElseFragment createIfElseFragment()
  {
    IfElseFragmentImpl ifElseFragment = new IfElseFragmentImpl();
    return ifElseFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeachFragment createForeachFragment()
  {
    ForeachFragmentImpl foreachFragment = new ForeachFragmentImpl();
    return foreachFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LoopFragment createLoopFragment()
  {
    LoopFragmentImpl loopFragment = new LoopFragmentImpl();
    return loopFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssertFragment createAssertFragment()
  {
    AssertFragmentImpl assertFragment = new AssertFragmentImpl();
    return assertFragment;
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
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
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

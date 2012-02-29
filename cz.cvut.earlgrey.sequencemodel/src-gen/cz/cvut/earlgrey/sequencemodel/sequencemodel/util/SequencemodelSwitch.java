/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.util;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage
 * @generated
 */
public class SequencemodelSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SequencemodelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequencemodelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SequencemodelPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SequencemodelPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.SEQUENCE:
      {
        Sequence sequence = (Sequence)theEObject;
        T result = caseSequence(sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.PARTICIPANT:
      {
        Participant participant = (Participant)theEObject;
        T result = caseParticipant(participant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.TRANSITION_BLOCK:
      {
        TransitionBlock transitionBlock = (TransitionBlock)theEObject;
        T result = caseTransitionBlock(transitionBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.FRAGMENT:
      {
        Fragment fragment = (Fragment)theEObject;
        T result = caseFragment(fragment);
        if (result == null) result = caseTransition(fragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.IF_ELSE_FRAGMENT:
      {
        IfElseFragment ifElseFragment = (IfElseFragment)theEObject;
        T result = caseIfElseFragment(ifElseFragment);
        if (result == null) result = caseFragment(ifElseFragment);
        if (result == null) result = caseTransition(ifElseFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.FOREACH_FRAGMENT:
      {
        ForeachFragment foreachFragment = (ForeachFragment)theEObject;
        T result = caseForeachFragment(foreachFragment);
        if (result == null) result = caseFragment(foreachFragment);
        if (result == null) result = caseTransition(foreachFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.LOOP_FRAGMENT:
      {
        LoopFragment loopFragment = (LoopFragment)theEObject;
        T result = caseLoopFragment(loopFragment);
        if (result == null) result = caseFragment(loopFragment);
        if (result == null) result = caseTransition(loopFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.ASSERT_FRAGMENT:
      {
        AssertFragment assertFragment = (AssertFragment)theEObject;
        T result = caseAssertFragment(assertFragment);
        if (result == null) result = caseFragment(assertFragment);
        if (result == null) result = caseTransition(assertFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.BREAK_FRAGMENT:
      {
        BreakFragment breakFragment = (BreakFragment)theEObject;
        T result = caseBreakFragment(breakFragment);
        if (result == null) result = caseFragment(breakFragment);
        if (result == null) result = caseTransition(breakFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.NEXT_FRAGMENT:
      {
        NextFragment nextFragment = (NextFragment)theEObject;
        T result = caseNextFragment(nextFragment);
        if (result == null) result = caseFragment(nextFragment);
        if (result == null) result = caseTransition(nextFragment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = caseTransition(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.CALL_MESSAGE:
      {
        CallMessage callMessage = (CallMessage)theEObject;
        T result = caseCallMessage(callMessage);
        if (result == null) result = caseMessage(callMessage);
        if (result == null) result = caseTransition(callMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.NEW_MESSAGE:
      {
        NewMessage newMessage = (NewMessage)theEObject;
        T result = caseNewMessage(newMessage);
        if (result == null) result = caseMessage(newMessage);
        if (result == null) result = caseTransition(newMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.RETURN_MESSAGE:
      {
        ReturnMessage returnMessage = (ReturnMessage)theEObject;
        T result = caseReturnMessage(returnMessage);
        if (result == null) result = caseMessage(returnMessage);
        if (result == null) result = caseTransition(returnMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.DELETE_MESSAGE:
      {
        DeleteMessage deleteMessage = (DeleteMessage)theEObject;
        T result = caseDeleteMessage(deleteMessage);
        if (result == null) result = caseMessage(deleteMessage);
        if (result == null) result = caseTransition(deleteMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseAnnotation_Parameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SequencemodelPackage.ARRAY:
      {
        Array array = (Array)theEObject;
        T result = caseArray(array);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequence(Sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Participant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Participant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParticipant(Participant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransitionBlock(TransitionBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFragment(Fragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Else Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Else Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfElseFragment(IfElseFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreach Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreach Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeachFragment(ForeachFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopFragment(LoopFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assert Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assert Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssertFragment(AssertFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Break Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Break Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBreakFragment(BreakFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Next Fragment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Next Fragment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNextFragment(NextFragment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallMessage(CallMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>New Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNewMessage(NewMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnMessage(ReturnMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteMessage(DeleteMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray(Array object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation_Parameter(cz.cvut.earlgrey.annotation.annotation.Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SequencemodelSwitch

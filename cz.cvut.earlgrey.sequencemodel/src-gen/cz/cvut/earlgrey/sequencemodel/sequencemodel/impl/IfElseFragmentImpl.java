/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Else Fragment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.IfElseFragmentImpl#getElseIfExpr <em>Else If Expr</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.IfElseFragmentImpl#getElseIftransition <em>Else Iftransition</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.IfElseFragmentImpl#getElseTransition <em>Else Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfElseFragmentImpl extends FragmentImpl implements IfElseFragment
{
  /**
   * The cached value of the '{@link #getElseIfExpr() <em>Else If Expr</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseIfExpr()
   * @generated
   * @ordered
   */
  protected EList<String> elseIfExpr;

  /**
   * The cached value of the '{@link #getElseIftransition() <em>Else Iftransition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseIftransition()
   * @generated
   * @ordered
   */
  protected EList<Transition> elseIftransition;

  /**
   * The cached value of the '{@link #getElseTransition() <em>Else Transition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseTransition()
   * @generated
   * @ordered
   */
  protected EList<Transition> elseTransition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfElseFragmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SequencemodelPackage.Literals.IF_ELSE_FRAGMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getElseIfExpr()
  {
    if (elseIfExpr == null)
    {
      elseIfExpr = new EDataTypeEList<String>(String.class, this, SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IF_EXPR);
    }
    return elseIfExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getElseIftransition()
  {
    if (elseIftransition == null)
    {
      elseIftransition = new EObjectContainmentEList<Transition>(Transition.class, this, SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IFTRANSITION);
    }
    return elseIftransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getElseTransition()
  {
    if (elseTransition == null)
    {
      elseTransition = new EObjectContainmentEList<Transition>(Transition.class, this, SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_TRANSITION);
    }
    return elseTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IFTRANSITION:
        return ((InternalEList<?>)getElseIftransition()).basicRemove(otherEnd, msgs);
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_TRANSITION:
        return ((InternalEList<?>)getElseTransition()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IF_EXPR:
        return getElseIfExpr();
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IFTRANSITION:
        return getElseIftransition();
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_TRANSITION:
        return getElseTransition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IF_EXPR:
        getElseIfExpr().clear();
        getElseIfExpr().addAll((Collection<? extends String>)newValue);
        return;
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IFTRANSITION:
        getElseIftransition().clear();
        getElseIftransition().addAll((Collection<? extends Transition>)newValue);
        return;
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_TRANSITION:
        getElseTransition().clear();
        getElseTransition().addAll((Collection<? extends Transition>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IF_EXPR:
        getElseIfExpr().clear();
        return;
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IFTRANSITION:
        getElseIftransition().clear();
        return;
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_TRANSITION:
        getElseTransition().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IF_EXPR:
        return elseIfExpr != null && !elseIfExpr.isEmpty();
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_IFTRANSITION:
        return elseIftransition != null && !elseIftransition.isEmpty();
      case SequencemodelPackage.IF_ELSE_FRAGMENT__ELSE_TRANSITION:
        return elseTransition != null && !elseTransition.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (elseIfExpr: ");
    result.append(elseIfExpr);
    result.append(')');
    return result.toString();
  }

} //IfElseFragmentImpl

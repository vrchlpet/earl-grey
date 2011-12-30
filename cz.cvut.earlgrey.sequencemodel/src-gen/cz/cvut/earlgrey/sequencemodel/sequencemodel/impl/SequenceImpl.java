/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequenceImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequenceImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceImpl extends MinimalEObjectImpl.Container implements Sequence
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLifeline()
   * @generated
   * @ordered
   */
  protected EList<Lifeline> lifeline;

  /**
   * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransition()
   * @generated
   * @ordered
   */
  protected EList<Transition> transition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequenceImpl()
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
    return SequencemodelPackage.Literals.SEQUENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.SEQUENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Lifeline> getLifeline()
  {
    if (lifeline == null)
    {
      lifeline = new EObjectContainmentEList<Lifeline>(Lifeline.class, this, SequencemodelPackage.SEQUENCE__LIFELINE);
    }
    return lifeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransition()
  {
    if (transition == null)
    {
      transition = new EObjectContainmentEList<Transition>(Transition.class, this, SequencemodelPackage.SEQUENCE__TRANSITION);
    }
    return transition;
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
      case SequencemodelPackage.SEQUENCE__LIFELINE:
        return ((InternalEList<?>)getLifeline()).basicRemove(otherEnd, msgs);
      case SequencemodelPackage.SEQUENCE__TRANSITION:
        return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
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
      case SequencemodelPackage.SEQUENCE__NAME:
        return getName();
      case SequencemodelPackage.SEQUENCE__LIFELINE:
        return getLifeline();
      case SequencemodelPackage.SEQUENCE__TRANSITION:
        return getTransition();
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
      case SequencemodelPackage.SEQUENCE__NAME:
        setName((String)newValue);
        return;
      case SequencemodelPackage.SEQUENCE__LIFELINE:
        getLifeline().clear();
        getLifeline().addAll((Collection<? extends Lifeline>)newValue);
        return;
      case SequencemodelPackage.SEQUENCE__TRANSITION:
        getTransition().clear();
        getTransition().addAll((Collection<? extends Transition>)newValue);
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
      case SequencemodelPackage.SEQUENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SequencemodelPackage.SEQUENCE__LIFELINE:
        getLifeline().clear();
        return;
      case SequencemodelPackage.SEQUENCE__TRANSITION:
        getTransition().clear();
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
      case SequencemodelPackage.SEQUENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SequencemodelPackage.SEQUENCE__LIFELINE:
        return lifeline != null && !lifeline.isEmpty();
      case SequencemodelPackage.SEQUENCE__TRANSITION:
        return transition != null && !transition.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SequenceImpl

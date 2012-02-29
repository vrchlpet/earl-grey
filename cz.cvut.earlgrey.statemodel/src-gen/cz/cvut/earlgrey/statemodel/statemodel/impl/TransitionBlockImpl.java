/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel.impl;

import cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage;
import cz.cvut.earlgrey.statemodel.statemodel.Transition;
import cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionBlockImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionBlockImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionBlockImpl extends ActivityImpl implements TransitionBlock
{
  /**
   * The default value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected static final String EVENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected String event = EVENT_EDEFAULT;

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
  protected TransitionBlockImpl()
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
    return StatemodelPackage.Literals.TRANSITION_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(String newEvent)
  {
    String oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatemodelPackage.TRANSITION_BLOCK__EVENT, oldEvent, event));
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
      transition = new EObjectContainmentEList<Transition>(Transition.class, this, StatemodelPackage.TRANSITION_BLOCK__TRANSITION);
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
      case StatemodelPackage.TRANSITION_BLOCK__TRANSITION:
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
      case StatemodelPackage.TRANSITION_BLOCK__EVENT:
        return getEvent();
      case StatemodelPackage.TRANSITION_BLOCK__TRANSITION:
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
      case StatemodelPackage.TRANSITION_BLOCK__EVENT:
        setEvent((String)newValue);
        return;
      case StatemodelPackage.TRANSITION_BLOCK__TRANSITION:
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
      case StatemodelPackage.TRANSITION_BLOCK__EVENT:
        setEvent(EVENT_EDEFAULT);
        return;
      case StatemodelPackage.TRANSITION_BLOCK__TRANSITION:
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
      case StatemodelPackage.TRANSITION_BLOCK__EVENT:
        return EVENT_EDEFAULT == null ? event != null : !EVENT_EDEFAULT.equals(event);
      case StatemodelPackage.TRANSITION_BLOCK__TRANSITION:
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
    result.append(" (event: ");
    result.append(event);
    result.append(')');
    return result.toString();
  }

} //TransitionBlockImpl

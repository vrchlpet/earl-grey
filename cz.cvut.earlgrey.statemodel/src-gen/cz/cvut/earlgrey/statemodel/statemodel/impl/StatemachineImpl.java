/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel.impl;

import cz.cvut.earlgrey.classmodel.classmodel.Entity;

import cz.cvut.earlgrey.statemodel.statemodel.State;
import cz.cvut.earlgrey.statemodel.statemodel.Statemachine;
import cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl#getElement <em>Element</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatemachineImpl extends MinimalEObjectImpl.Container implements Statemachine
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected Entity reference;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected EList<Entity> element;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected EList<State> state;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemachineImpl()
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
    return StatemodelPackage.Literals.STATEMACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (Entity)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemodelPackage.STATEMACHINE__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(Entity newReference)
  {
    Entity oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, StatemodelPackage.STATEMACHINE__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Entity> getElement()
  {
    if (element == null)
    {
      element = new EObjectResolvingEList<Entity>(Entity.class, this, StatemodelPackage.STATEMACHINE__ELEMENT);
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getState()
  {
    if (state == null)
    {
      state = new EObjectContainmentEList<State>(State.class, this, StatemodelPackage.STATEMACHINE__STATE);
    }
    return state;
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
      case StatemodelPackage.STATEMACHINE__STATE:
        return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
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
      case StatemodelPackage.STATEMACHINE__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case StatemodelPackage.STATEMACHINE__ELEMENT:
        return getElement();
      case StatemodelPackage.STATEMACHINE__STATE:
        return getState();
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
      case StatemodelPackage.STATEMACHINE__REFERENCE:
        setReference((Entity)newValue);
        return;
      case StatemodelPackage.STATEMACHINE__ELEMENT:
        getElement().clear();
        getElement().addAll((Collection<? extends Entity>)newValue);
        return;
      case StatemodelPackage.STATEMACHINE__STATE:
        getState().clear();
        getState().addAll((Collection<? extends State>)newValue);
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
      case StatemodelPackage.STATEMACHINE__REFERENCE:
        setReference((Entity)null);
        return;
      case StatemodelPackage.STATEMACHINE__ELEMENT:
        getElement().clear();
        return;
      case StatemodelPackage.STATEMACHINE__STATE:
        getState().clear();
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
      case StatemodelPackage.STATEMACHINE__REFERENCE:
        return reference != null;
      case StatemodelPackage.STATEMACHINE__ELEMENT:
        return element != null && !element.isEmpty();
      case StatemodelPackage.STATEMACHINE__STATE:
        return state != null && !state.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatemachineImpl

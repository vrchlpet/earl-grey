/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel.impl;

import cz.cvut.earlgrey.statemodel.statemodel.Import;
import cz.cvut.earlgrey.statemodel.statemodel.Statemachine;
import cz.cvut.earlgrey.statemodel.statemodel.Statemodel;
import cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statemodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelImpl#getStatemachine <em>Statemachine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatemodelImpl extends MinimalEObjectImpl.Container implements Statemodel
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getStatemachine() <em>Statemachine</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatemachine()
   * @generated
   * @ordered
   */
  protected EList<Statemachine> statemachine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemodelImpl()
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
    return StatemodelPackage.Literals.STATEMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, StatemodelPackage.STATEMODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statemachine> getStatemachine()
  {
    if (statemachine == null)
    {
      statemachine = new EObjectContainmentEList<Statemachine>(Statemachine.class, this, StatemodelPackage.STATEMODEL__STATEMACHINE);
    }
    return statemachine;
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
      case StatemodelPackage.STATEMODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case StatemodelPackage.STATEMODEL__STATEMACHINE:
        return ((InternalEList<?>)getStatemachine()).basicRemove(otherEnd, msgs);
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
      case StatemodelPackage.STATEMODEL__IMPORTS:
        return getImports();
      case StatemodelPackage.STATEMODEL__STATEMACHINE:
        return getStatemachine();
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
      case StatemodelPackage.STATEMODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case StatemodelPackage.STATEMODEL__STATEMACHINE:
        getStatemachine().clear();
        getStatemachine().addAll((Collection<? extends Statemachine>)newValue);
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
      case StatemodelPackage.STATEMODEL__IMPORTS:
        getImports().clear();
        return;
      case StatemodelPackage.STATEMODEL__STATEMACHINE:
        getStatemachine().clear();
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
      case StatemodelPackage.STATEMODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case StatemodelPackage.STATEMODEL__STATEMACHINE:
        return statemachine != null && !statemachine.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StatemodelImpl

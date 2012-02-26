/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel.impl;

import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Generalization;
import cz.cvut.earlgrey.classmodel.classmodel.Type;

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
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.GeneralizationImpl#getClassifier <em>Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl extends MinimalEObjectImpl.Container implements Generalization
{
  /**
   * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassifier()
   * @generated
   * @ordered
   */
  protected EList<Type> classifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralizationImpl()
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
    return ClassmodelPackage.Literals.GENERALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getClassifier()
  {
    if (classifier == null)
    {
      classifier = new EObjectContainmentEList<Type>(Type.class, this, ClassmodelPackage.GENERALIZATION__CLASSIFIER);
    }
    return classifier;
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
      case ClassmodelPackage.GENERALIZATION__CLASSIFIER:
        return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
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
      case ClassmodelPackage.GENERALIZATION__CLASSIFIER:
        return getClassifier();
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
      case ClassmodelPackage.GENERALIZATION__CLASSIFIER:
        getClassifier().clear();
        getClassifier().addAll((Collection<? extends Type>)newValue);
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
      case ClassmodelPackage.GENERALIZATION__CLASSIFIER:
        getClassifier().clear();
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
      case ClassmodelPackage.GENERALIZATION__CLASSIFIER:
        return classifier != null && !classifier.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GeneralizationImpl

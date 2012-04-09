/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel.impl;

import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Enumeration;
import cz.cvut.earlgrey.classmodel.classmodel.Feature;
import cz.cvut.earlgrey.classmodel.classmodel.Type;

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
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EnumerationImpl#getUpperClass <em>Upper Class</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EnumerationImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EnumerationImpl#getEnumerator <em>Enumerator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumerationImpl extends EntityImpl implements Enumeration
{
  /**
   * The cached value of the '{@link #getUpperClass() <em>Upper Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperClass()
   * @generated
   * @ordered
   */
  protected Type upperClass;

  /**
   * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected static final String CONSTRAINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected String constraint = CONSTRAINT_EDEFAULT;

  /**
   * The cached value of the '{@link #getEnumerator() <em>Enumerator</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumerator()
   * @generated
   * @ordered
   */
  protected EList<Feature> enumerator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumerationImpl()
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
    return ClassmodelPackage.Literals.ENUMERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getUpperClass()
  {
    return upperClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUpperClass(Type newUpperClass, NotificationChain msgs)
  {
    Type oldUpperClass = upperClass;
    upperClass = newUpperClass;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassmodelPackage.ENUMERATION__UPPER_CLASS, oldUpperClass, newUpperClass);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperClass(Type newUpperClass)
  {
    if (newUpperClass != upperClass)
    {
      NotificationChain msgs = null;
      if (upperClass != null)
        msgs = ((InternalEObject)upperClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.ENUMERATION__UPPER_CLASS, null, msgs);
      if (newUpperClass != null)
        msgs = ((InternalEObject)newUpperClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.ENUMERATION__UPPER_CLASS, null, msgs);
      msgs = basicSetUpperClass(newUpperClass, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.ENUMERATION__UPPER_CLASS, newUpperClass, newUpperClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstraint(String newConstraint)
  {
    String oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.ENUMERATION__CONSTRAINT, oldConstraint, constraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getEnumerator()
  {
    if (enumerator == null)
    {
      enumerator = new EObjectContainmentEList<Feature>(Feature.class, this, ClassmodelPackage.ENUMERATION__ENUMERATOR);
    }
    return enumerator;
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
      case ClassmodelPackage.ENUMERATION__UPPER_CLASS:
        return basicSetUpperClass(null, msgs);
      case ClassmodelPackage.ENUMERATION__ENUMERATOR:
        return ((InternalEList<?>)getEnumerator()).basicRemove(otherEnd, msgs);
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
      case ClassmodelPackage.ENUMERATION__UPPER_CLASS:
        return getUpperClass();
      case ClassmodelPackage.ENUMERATION__CONSTRAINT:
        return getConstraint();
      case ClassmodelPackage.ENUMERATION__ENUMERATOR:
        return getEnumerator();
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
      case ClassmodelPackage.ENUMERATION__UPPER_CLASS:
        setUpperClass((Type)newValue);
        return;
      case ClassmodelPackage.ENUMERATION__CONSTRAINT:
        setConstraint((String)newValue);
        return;
      case ClassmodelPackage.ENUMERATION__ENUMERATOR:
        getEnumerator().clear();
        getEnumerator().addAll((Collection<? extends Feature>)newValue);
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
      case ClassmodelPackage.ENUMERATION__UPPER_CLASS:
        setUpperClass((Type)null);
        return;
      case ClassmodelPackage.ENUMERATION__CONSTRAINT:
        setConstraint(CONSTRAINT_EDEFAULT);
        return;
      case ClassmodelPackage.ENUMERATION__ENUMERATOR:
        getEnumerator().clear();
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
      case ClassmodelPackage.ENUMERATION__UPPER_CLASS:
        return upperClass != null;
      case ClassmodelPackage.ENUMERATION__CONSTRAINT:
        return CONSTRAINT_EDEFAULT == null ? constraint != null : !CONSTRAINT_EDEFAULT.equals(constraint);
      case ClassmodelPackage.ENUMERATION__ENUMERATOR:
        return enumerator != null && !enumerator.isEmpty();
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
    result.append(" (constraint: ");
    result.append(constraint);
    result.append(')');
    return result.toString();
  }

} //EnumerationImpl

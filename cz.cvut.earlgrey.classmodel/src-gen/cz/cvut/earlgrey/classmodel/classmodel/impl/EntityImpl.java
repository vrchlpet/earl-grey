/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel.impl;

import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Entity;
import cz.cvut.earlgrey.classmodel.classmodel.Feature;

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
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl#isClass <em>Class</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.EntityImpl#isEnumeration <em>Enumeration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends AbstractElementImpl implements Entity
{
  /**
   * The default value of the '{@link #isClass() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClass()
   * @generated
   * @ordered
   */
  protected static final boolean CLASS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isClass() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isClass()
   * @generated
   * @ordered
   */
  protected boolean class_ = CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInterface()
   * @generated
   * @ordered
   */
  protected static final boolean INTERFACE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInterface()
   * @generated
   * @ordered
   */
  protected boolean interface_ = INTERFACE_EDEFAULT;

  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

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
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected EList<Feature> feature;

  /**
   * The default value of the '{@link #isEnumeration() <em>Enumeration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnumeration()
   * @generated
   * @ordered
   */
  protected static final boolean ENUMERATION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnumeration() <em>Enumeration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnumeration()
   * @generated
   * @ordered
   */
  protected boolean enumeration = ENUMERATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return ClassmodelPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isClass()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(boolean newClass)
  {
    boolean oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.ENTITY__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInterface()
  {
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterface(boolean newInterface)
  {
    boolean oldInterface = interface_;
    interface_ = newInterface;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.ENTITY__INTERFACE, oldInterface, interface_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.ENTITY__ABSTRACT, oldAbstract, abstract_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeature()
  {
    if (feature == null)
    {
      feature = new EObjectContainmentEList<Feature>(Feature.class, this, ClassmodelPackage.ENTITY__FEATURE);
    }
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnumeration()
  {
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumeration(boolean newEnumeration)
  {
    boolean oldEnumeration = enumeration;
    enumeration = newEnumeration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.ENTITY__ENUMERATION, oldEnumeration, enumeration));
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
      case ClassmodelPackage.ENTITY__FEATURE:
        return ((InternalEList<?>)getFeature()).basicRemove(otherEnd, msgs);
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
      case ClassmodelPackage.ENTITY__CLASS:
        return isClass();
      case ClassmodelPackage.ENTITY__INTERFACE:
        return isInterface();
      case ClassmodelPackage.ENTITY__ABSTRACT:
        return isAbstract();
      case ClassmodelPackage.ENTITY__NAME:
        return getName();
      case ClassmodelPackage.ENTITY__FEATURE:
        return getFeature();
      case ClassmodelPackage.ENTITY__ENUMERATION:
        return isEnumeration();
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
      case ClassmodelPackage.ENTITY__CLASS:
        setClass((Boolean)newValue);
        return;
      case ClassmodelPackage.ENTITY__INTERFACE:
        setInterface((Boolean)newValue);
        return;
      case ClassmodelPackage.ENTITY__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case ClassmodelPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case ClassmodelPackage.ENTITY__FEATURE:
        getFeature().clear();
        getFeature().addAll((Collection<? extends Feature>)newValue);
        return;
      case ClassmodelPackage.ENTITY__ENUMERATION:
        setEnumeration((Boolean)newValue);
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
      case ClassmodelPackage.ENTITY__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case ClassmodelPackage.ENTITY__INTERFACE:
        setInterface(INTERFACE_EDEFAULT);
        return;
      case ClassmodelPackage.ENTITY__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case ClassmodelPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ClassmodelPackage.ENTITY__FEATURE:
        getFeature().clear();
        return;
      case ClassmodelPackage.ENTITY__ENUMERATION:
        setEnumeration(ENUMERATION_EDEFAULT);
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
      case ClassmodelPackage.ENTITY__CLASS:
        return class_ != CLASS_EDEFAULT;
      case ClassmodelPackage.ENTITY__INTERFACE:
        return interface_ != INTERFACE_EDEFAULT;
      case ClassmodelPackage.ENTITY__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case ClassmodelPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ClassmodelPackage.ENTITY__FEATURE:
        return feature != null && !feature.isEmpty();
      case ClassmodelPackage.ENTITY__ENUMERATION:
        return enumeration != ENUMERATION_EDEFAULT;
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
    result.append(" (class: ");
    result.append(class_);
    result.append(", interface: ");
    result.append(interface_);
    result.append(", abstract: ");
    result.append(abstract_);
    result.append(", name: ");
    result.append(name);
    result.append(", enumeration: ");
    result.append(enumeration);
    result.append(')');
    return result.toString();
  }

} //EntityImpl

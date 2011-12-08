/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel.impl;

import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Entity;
import cz.cvut.earlgrey.classmodel.classmodel.Relation;
import cz.cvut.earlgrey.classmodel.classmodel.RelationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl#getFrom <em>From</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl#getCardinalityFrom <em>Cardinality From</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl#getType <em>Type</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl#getCardinalityTo <em>Cardinality To</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl#getTo <em>To</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends AbstractElementImpl implements Relation
{
  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected Entity from;

  /**
   * The default value of the '{@link #getCardinalityFrom() <em>Cardinality From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinalityFrom()
   * @generated
   * @ordered
   */
  protected static final String CARDINALITY_FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCardinalityFrom() <em>Cardinality From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinalityFrom()
   * @generated
   * @ordered
   */
  protected String cardinalityFrom = CARDINALITY_FROM_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final RelationType TYPE_EDEFAULT = RelationType.ASSOCIATION;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RelationType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getCardinalityTo() <em>Cardinality To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinalityTo()
   * @generated
   * @ordered
   */
  protected static final String CARDINALITY_TO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCardinalityTo() <em>Cardinality To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinalityTo()
   * @generated
   * @ordered
   */
  protected String cardinalityTo = CARDINALITY_TO_EDEFAULT;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected Entity to;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationImpl()
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
    return ClassmodelPackage.Literals.RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getFrom()
  {
    if (from != null && from.eIsProxy())
    {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (Entity)eResolveProxy(oldFrom);
      if (from != oldFrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassmodelPackage.RELATION__FROM, oldFrom, from));
      }
    }
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(Entity newFrom)
  {
    Entity oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATION__FROM, oldFrom, from));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCardinalityFrom()
  {
    return cardinalityFrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardinalityFrom(String newCardinalityFrom)
  {
    String oldCardinalityFrom = cardinalityFrom;
    cardinalityFrom = newCardinalityFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATION__CARDINALITY_FROM, oldCardinalityFrom, cardinalityFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RelationType newType)
  {
    RelationType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCardinalityTo()
  {
    return cardinalityTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCardinalityTo(String newCardinalityTo)
  {
    String oldCardinalityTo = cardinalityTo;
    cardinalityTo = newCardinalityTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATION__CARDINALITY_TO, oldCardinalityTo, cardinalityTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getTo()
  {
    if (to != null && to.eIsProxy())
    {
      InternalEObject oldTo = (InternalEObject)to;
      to = (Entity)eResolveProxy(oldTo);
      if (to != oldTo)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassmodelPackage.RELATION__TO, oldTo, to));
      }
    }
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(Entity newTo)
  {
    Entity oldTo = to;
    to = newTo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATION__TO, oldTo, to));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATION__LABEL, oldLabel, label));
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
      case ClassmodelPackage.RELATION__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case ClassmodelPackage.RELATION__CARDINALITY_FROM:
        return getCardinalityFrom();
      case ClassmodelPackage.RELATION__TYPE:
        return getType();
      case ClassmodelPackage.RELATION__CARDINALITY_TO:
        return getCardinalityTo();
      case ClassmodelPackage.RELATION__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case ClassmodelPackage.RELATION__LABEL:
        return getLabel();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ClassmodelPackage.RELATION__FROM:
        setFrom((Entity)newValue);
        return;
      case ClassmodelPackage.RELATION__CARDINALITY_FROM:
        setCardinalityFrom((String)newValue);
        return;
      case ClassmodelPackage.RELATION__TYPE:
        setType((RelationType)newValue);
        return;
      case ClassmodelPackage.RELATION__CARDINALITY_TO:
        setCardinalityTo((String)newValue);
        return;
      case ClassmodelPackage.RELATION__TO:
        setTo((Entity)newValue);
        return;
      case ClassmodelPackage.RELATION__LABEL:
        setLabel((String)newValue);
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
      case ClassmodelPackage.RELATION__FROM:
        setFrom((Entity)null);
        return;
      case ClassmodelPackage.RELATION__CARDINALITY_FROM:
        setCardinalityFrom(CARDINALITY_FROM_EDEFAULT);
        return;
      case ClassmodelPackage.RELATION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ClassmodelPackage.RELATION__CARDINALITY_TO:
        setCardinalityTo(CARDINALITY_TO_EDEFAULT);
        return;
      case ClassmodelPackage.RELATION__TO:
        setTo((Entity)null);
        return;
      case ClassmodelPackage.RELATION__LABEL:
        setLabel(LABEL_EDEFAULT);
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
      case ClassmodelPackage.RELATION__FROM:
        return from != null;
      case ClassmodelPackage.RELATION__CARDINALITY_FROM:
        return CARDINALITY_FROM_EDEFAULT == null ? cardinalityFrom != null : !CARDINALITY_FROM_EDEFAULT.equals(cardinalityFrom);
      case ClassmodelPackage.RELATION__TYPE:
        return type != TYPE_EDEFAULT;
      case ClassmodelPackage.RELATION__CARDINALITY_TO:
        return CARDINALITY_TO_EDEFAULT == null ? cardinalityTo != null : !CARDINALITY_TO_EDEFAULT.equals(cardinalityTo);
      case ClassmodelPackage.RELATION__TO:
        return to != null;
      case ClassmodelPackage.RELATION__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
    result.append(" (cardinalityFrom: ");
    result.append(cardinalityFrom);
    result.append(", type: ");
    result.append(type);
    result.append(", cardinalityTo: ");
    result.append(cardinalityTo);
    result.append(", label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //RelationImpl

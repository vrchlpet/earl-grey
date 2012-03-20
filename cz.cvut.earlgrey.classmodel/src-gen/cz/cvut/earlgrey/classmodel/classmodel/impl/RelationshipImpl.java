/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel.impl;

import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Multiplicity;
import cz.cvut.earlgrey.classmodel.classmodel.Relationship;
import cz.cvut.earlgrey.classmodel.classmodel.RelationshipType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#isHeadNavigable <em>Head Navigable</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#getHeadLabel <em>Head Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#getHeadMultiplicity <em>Head Multiplicity</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#getHead <em>Head</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#isTailNavigable <em>Tail Navigable</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#getTailLabel <em>Tail Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#getTailMultiplicity <em>Tail Multiplicity</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.RelationshipImpl#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends ElementImpl implements Relationship
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final RelationshipType TYPE_EDEFAULT = RelationshipType.ASSOCIATION;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RelationshipType type = TYPE_EDEFAULT;

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
   * The default value of the '{@link #isHeadNavigable() <em>Head Navigable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeadNavigable()
   * @generated
   * @ordered
   */
  protected static final boolean HEAD_NAVIGABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHeadNavigable() <em>Head Navigable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHeadNavigable()
   * @generated
   * @ordered
   */
  protected boolean headNavigable = HEAD_NAVIGABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getHeadLabel() <em>Head Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadLabel()
   * @generated
   * @ordered
   */
  protected static final String HEAD_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeadLabel() <em>Head Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadLabel()
   * @generated
   * @ordered
   */
  protected String headLabel = HEAD_LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeadMultiplicity() <em>Head Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadMultiplicity()
   * @generated
   * @ordered
   */
  protected Multiplicity headMultiplicity;

  /**
   * The default value of the '{@link #getHead() <em>Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected static final String HEAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected String head = HEAD_EDEFAULT;

  /**
   * The default value of the '{@link #isTailNavigable() <em>Tail Navigable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTailNavigable()
   * @generated
   * @ordered
   */
  protected static final boolean TAIL_NAVIGABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isTailNavigable() <em>Tail Navigable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isTailNavigable()
   * @generated
   * @ordered
   */
  protected boolean tailNavigable = TAIL_NAVIGABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getTailLabel() <em>Tail Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTailLabel()
   * @generated
   * @ordered
   */
  protected static final String TAIL_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTailLabel() <em>Tail Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTailLabel()
   * @generated
   * @ordered
   */
  protected String tailLabel = TAIL_LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getTailMultiplicity() <em>Tail Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTailMultiplicity()
   * @generated
   * @ordered
   */
  protected Multiplicity tailMultiplicity;

  /**
   * The default value of the '{@link #getTail() <em>Tail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected static final String TAIL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected String tail = TAIL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl()
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
    return ClassmodelPackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RelationshipType newType)
  {
    RelationshipType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__TYPE, oldType, type));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isHeadNavigable()
  {
    return headNavigable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadNavigable(boolean newHeadNavigable)
  {
    boolean oldHeadNavigable = headNavigable;
    headNavigable = newHeadNavigable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__HEAD_NAVIGABLE, oldHeadNavigable, headNavigable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeadLabel()
  {
    return headLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadLabel(String newHeadLabel)
  {
    String oldHeadLabel = headLabel;
    headLabel = newHeadLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__HEAD_LABEL, oldHeadLabel, headLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity getHeadMultiplicity()
  {
    return headMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeadMultiplicity(Multiplicity newHeadMultiplicity, NotificationChain msgs)
  {
    Multiplicity oldHeadMultiplicity = headMultiplicity;
    headMultiplicity = newHeadMultiplicity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY, oldHeadMultiplicity, newHeadMultiplicity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadMultiplicity(Multiplicity newHeadMultiplicity)
  {
    if (newHeadMultiplicity != headMultiplicity)
    {
      NotificationChain msgs = null;
      if (headMultiplicity != null)
        msgs = ((InternalEObject)headMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY, null, msgs);
      if (newHeadMultiplicity != null)
        msgs = ((InternalEObject)newHeadMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY, null, msgs);
      msgs = basicSetHeadMultiplicity(newHeadMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY, newHeadMultiplicity, newHeadMultiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(String newHead)
  {
    String oldHead = head;
    head = newHead;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__HEAD, oldHead, head));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isTailNavigable()
  {
    return tailNavigable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTailNavigable(boolean newTailNavigable)
  {
    boolean oldTailNavigable = tailNavigable;
    tailNavigable = newTailNavigable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__TAIL_NAVIGABLE, oldTailNavigable, tailNavigable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTailLabel()
  {
    return tailLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTailLabel(String newTailLabel)
  {
    String oldTailLabel = tailLabel;
    tailLabel = newTailLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__TAIL_LABEL, oldTailLabel, tailLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity getTailMultiplicity()
  {
    return tailMultiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTailMultiplicity(Multiplicity newTailMultiplicity, NotificationChain msgs)
  {
    Multiplicity oldTailMultiplicity = tailMultiplicity;
    tailMultiplicity = newTailMultiplicity;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY, oldTailMultiplicity, newTailMultiplicity);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTailMultiplicity(Multiplicity newTailMultiplicity)
  {
    if (newTailMultiplicity != tailMultiplicity)
    {
      NotificationChain msgs = null;
      if (tailMultiplicity != null)
        msgs = ((InternalEObject)tailMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY, null, msgs);
      if (newTailMultiplicity != null)
        msgs = ((InternalEObject)newTailMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY, null, msgs);
      msgs = basicSetTailMultiplicity(newTailMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY, newTailMultiplicity, newTailMultiplicity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTail()
  {
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTail(String newTail)
  {
    String oldTail = tail;
    tail = newTail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.RELATIONSHIP__TAIL, oldTail, tail));
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
      case ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY:
        return basicSetHeadMultiplicity(null, msgs);
      case ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY:
        return basicSetTailMultiplicity(null, msgs);
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
      case ClassmodelPackage.RELATIONSHIP__TYPE:
        return getType();
      case ClassmodelPackage.RELATIONSHIP__LABEL:
        return getLabel();
      case ClassmodelPackage.RELATIONSHIP__HEAD_NAVIGABLE:
        return isHeadNavigable();
      case ClassmodelPackage.RELATIONSHIP__HEAD_LABEL:
        return getHeadLabel();
      case ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY:
        return getHeadMultiplicity();
      case ClassmodelPackage.RELATIONSHIP__HEAD:
        return getHead();
      case ClassmodelPackage.RELATIONSHIP__TAIL_NAVIGABLE:
        return isTailNavigable();
      case ClassmodelPackage.RELATIONSHIP__TAIL_LABEL:
        return getTailLabel();
      case ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY:
        return getTailMultiplicity();
      case ClassmodelPackage.RELATIONSHIP__TAIL:
        return getTail();
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
      case ClassmodelPackage.RELATIONSHIP__TYPE:
        setType((RelationshipType)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__LABEL:
        setLabel((String)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__HEAD_NAVIGABLE:
        setHeadNavigable((Boolean)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__HEAD_LABEL:
        setHeadLabel((String)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY:
        setHeadMultiplicity((Multiplicity)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__HEAD:
        setHead((String)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__TAIL_NAVIGABLE:
        setTailNavigable((Boolean)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__TAIL_LABEL:
        setTailLabel((String)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY:
        setTailMultiplicity((Multiplicity)newValue);
        return;
      case ClassmodelPackage.RELATIONSHIP__TAIL:
        setTail((String)newValue);
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
      case ClassmodelPackage.RELATIONSHIP__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ClassmodelPackage.RELATIONSHIP__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case ClassmodelPackage.RELATIONSHIP__HEAD_NAVIGABLE:
        setHeadNavigable(HEAD_NAVIGABLE_EDEFAULT);
        return;
      case ClassmodelPackage.RELATIONSHIP__HEAD_LABEL:
        setHeadLabel(HEAD_LABEL_EDEFAULT);
        return;
      case ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY:
        setHeadMultiplicity((Multiplicity)null);
        return;
      case ClassmodelPackage.RELATIONSHIP__HEAD:
        setHead(HEAD_EDEFAULT);
        return;
      case ClassmodelPackage.RELATIONSHIP__TAIL_NAVIGABLE:
        setTailNavigable(TAIL_NAVIGABLE_EDEFAULT);
        return;
      case ClassmodelPackage.RELATIONSHIP__TAIL_LABEL:
        setTailLabel(TAIL_LABEL_EDEFAULT);
        return;
      case ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY:
        setTailMultiplicity((Multiplicity)null);
        return;
      case ClassmodelPackage.RELATIONSHIP__TAIL:
        setTail(TAIL_EDEFAULT);
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
      case ClassmodelPackage.RELATIONSHIP__TYPE:
        return type != TYPE_EDEFAULT;
      case ClassmodelPackage.RELATIONSHIP__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case ClassmodelPackage.RELATIONSHIP__HEAD_NAVIGABLE:
        return headNavigable != HEAD_NAVIGABLE_EDEFAULT;
      case ClassmodelPackage.RELATIONSHIP__HEAD_LABEL:
        return HEAD_LABEL_EDEFAULT == null ? headLabel != null : !HEAD_LABEL_EDEFAULT.equals(headLabel);
      case ClassmodelPackage.RELATIONSHIP__HEAD_MULTIPLICITY:
        return headMultiplicity != null;
      case ClassmodelPackage.RELATIONSHIP__HEAD:
        return HEAD_EDEFAULT == null ? head != null : !HEAD_EDEFAULT.equals(head);
      case ClassmodelPackage.RELATIONSHIP__TAIL_NAVIGABLE:
        return tailNavigable != TAIL_NAVIGABLE_EDEFAULT;
      case ClassmodelPackage.RELATIONSHIP__TAIL_LABEL:
        return TAIL_LABEL_EDEFAULT == null ? tailLabel != null : !TAIL_LABEL_EDEFAULT.equals(tailLabel);
      case ClassmodelPackage.RELATIONSHIP__TAIL_MULTIPLICITY:
        return tailMultiplicity != null;
      case ClassmodelPackage.RELATIONSHIP__TAIL:
        return TAIL_EDEFAULT == null ? tail != null : !TAIL_EDEFAULT.equals(tail);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", label: ");
    result.append(label);
    result.append(", headNavigable: ");
    result.append(headNavigable);
    result.append(", headLabel: ");
    result.append(headLabel);
    result.append(", head: ");
    result.append(head);
    result.append(", tailNavigable: ");
    result.append(tailNavigable);
    result.append(", tailLabel: ");
    result.append(tailLabel);
    result.append(", tail: ");
    result.append(tail);
    result.append(')');
    return result.toString();
  }

} //RelationshipImpl

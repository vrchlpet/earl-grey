/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel.impl;

import cz.cvut.earlgrey.classmodel.classmodel.Aggregation;
import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Multiplicity;
import cz.cvut.earlgrey.classmodel.classmodel.Visibility;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aggregation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AggregationImpl#isHeadNavigable <em>Head Navigable</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AggregationImpl#getHeadVisibility <em>Head Visibility</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AggregationImpl#getHeadLabel <em>Head Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AggregationImpl#getHeadMultiplicity <em>Head Multiplicity</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AggregationImpl#isTailNavigable <em>Tail Navigable</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AggregationImpl#getTailVisibility <em>Tail Visibility</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AggregationImpl#getTailLabel <em>Tail Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.impl.AggregationImpl#getTailMultiplicity <em>Tail Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AggregationImpl extends RelationshipImpl implements Aggregation
{
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
   * The default value of the '{@link #getHeadVisibility() <em>Head Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadVisibility()
   * @generated
   * @ordered
   */
  protected static final Visibility HEAD_VISIBILITY_EDEFAULT = Visibility.PUBLIC;

  /**
   * The cached value of the '{@link #getHeadVisibility() <em>Head Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeadVisibility()
   * @generated
   * @ordered
   */
  protected Visibility headVisibility = HEAD_VISIBILITY_EDEFAULT;

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
   * The default value of the '{@link #getTailVisibility() <em>Tail Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTailVisibility()
   * @generated
   * @ordered
   */
  protected static final Visibility TAIL_VISIBILITY_EDEFAULT = Visibility.PUBLIC;

  /**
   * The cached value of the '{@link #getTailVisibility() <em>Tail Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTailVisibility()
   * @generated
   * @ordered
   */
  protected Visibility tailVisibility = TAIL_VISIBILITY_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AggregationImpl()
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
    return ClassmodelPackage.Literals.AGGREGATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__HEAD_NAVIGABLE, oldHeadNavigable, headNavigable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getHeadVisibility()
  {
    return headVisibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeadVisibility(Visibility newHeadVisibility)
  {
    Visibility oldHeadVisibility = headVisibility;
    headVisibility = newHeadVisibility == null ? HEAD_VISIBILITY_EDEFAULT : newHeadVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__HEAD_VISIBILITY, oldHeadVisibility, headVisibility));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__HEAD_LABEL, oldHeadLabel, headLabel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY, oldHeadMultiplicity, newHeadMultiplicity);
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
        msgs = ((InternalEObject)headMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY, null, msgs);
      if (newHeadMultiplicity != null)
        msgs = ((InternalEObject)newHeadMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY, null, msgs);
      msgs = basicSetHeadMultiplicity(newHeadMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY, newHeadMultiplicity, newHeadMultiplicity));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__TAIL_NAVIGABLE, oldTailNavigable, tailNavigable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getTailVisibility()
  {
    return tailVisibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTailVisibility(Visibility newTailVisibility)
  {
    Visibility oldTailVisibility = tailVisibility;
    tailVisibility = newTailVisibility == null ? TAIL_VISIBILITY_EDEFAULT : newTailVisibility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__TAIL_VISIBILITY, oldTailVisibility, tailVisibility));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__TAIL_LABEL, oldTailLabel, tailLabel));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY, oldTailMultiplicity, newTailMultiplicity);
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
        msgs = ((InternalEObject)tailMultiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY, null, msgs);
      if (newTailMultiplicity != null)
        msgs = ((InternalEObject)newTailMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY, null, msgs);
      msgs = basicSetTailMultiplicity(newTailMultiplicity, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY, newTailMultiplicity, newTailMultiplicity));
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
      case ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY:
        return basicSetHeadMultiplicity(null, msgs);
      case ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY:
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
      case ClassmodelPackage.AGGREGATION__HEAD_NAVIGABLE:
        return isHeadNavigable();
      case ClassmodelPackage.AGGREGATION__HEAD_VISIBILITY:
        return getHeadVisibility();
      case ClassmodelPackage.AGGREGATION__HEAD_LABEL:
        return getHeadLabel();
      case ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY:
        return getHeadMultiplicity();
      case ClassmodelPackage.AGGREGATION__TAIL_NAVIGABLE:
        return isTailNavigable();
      case ClassmodelPackage.AGGREGATION__TAIL_VISIBILITY:
        return getTailVisibility();
      case ClassmodelPackage.AGGREGATION__TAIL_LABEL:
        return getTailLabel();
      case ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY:
        return getTailMultiplicity();
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
      case ClassmodelPackage.AGGREGATION__HEAD_NAVIGABLE:
        setHeadNavigable((Boolean)newValue);
        return;
      case ClassmodelPackage.AGGREGATION__HEAD_VISIBILITY:
        setHeadVisibility((Visibility)newValue);
        return;
      case ClassmodelPackage.AGGREGATION__HEAD_LABEL:
        setHeadLabel((String)newValue);
        return;
      case ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY:
        setHeadMultiplicity((Multiplicity)newValue);
        return;
      case ClassmodelPackage.AGGREGATION__TAIL_NAVIGABLE:
        setTailNavigable((Boolean)newValue);
        return;
      case ClassmodelPackage.AGGREGATION__TAIL_VISIBILITY:
        setTailVisibility((Visibility)newValue);
        return;
      case ClassmodelPackage.AGGREGATION__TAIL_LABEL:
        setTailLabel((String)newValue);
        return;
      case ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY:
        setTailMultiplicity((Multiplicity)newValue);
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
      case ClassmodelPackage.AGGREGATION__HEAD_NAVIGABLE:
        setHeadNavigable(HEAD_NAVIGABLE_EDEFAULT);
        return;
      case ClassmodelPackage.AGGREGATION__HEAD_VISIBILITY:
        setHeadVisibility(HEAD_VISIBILITY_EDEFAULT);
        return;
      case ClassmodelPackage.AGGREGATION__HEAD_LABEL:
        setHeadLabel(HEAD_LABEL_EDEFAULT);
        return;
      case ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY:
        setHeadMultiplicity((Multiplicity)null);
        return;
      case ClassmodelPackage.AGGREGATION__TAIL_NAVIGABLE:
        setTailNavigable(TAIL_NAVIGABLE_EDEFAULT);
        return;
      case ClassmodelPackage.AGGREGATION__TAIL_VISIBILITY:
        setTailVisibility(TAIL_VISIBILITY_EDEFAULT);
        return;
      case ClassmodelPackage.AGGREGATION__TAIL_LABEL:
        setTailLabel(TAIL_LABEL_EDEFAULT);
        return;
      case ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY:
        setTailMultiplicity((Multiplicity)null);
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
      case ClassmodelPackage.AGGREGATION__HEAD_NAVIGABLE:
        return headNavigable != HEAD_NAVIGABLE_EDEFAULT;
      case ClassmodelPackage.AGGREGATION__HEAD_VISIBILITY:
        return headVisibility != HEAD_VISIBILITY_EDEFAULT;
      case ClassmodelPackage.AGGREGATION__HEAD_LABEL:
        return HEAD_LABEL_EDEFAULT == null ? headLabel != null : !HEAD_LABEL_EDEFAULT.equals(headLabel);
      case ClassmodelPackage.AGGREGATION__HEAD_MULTIPLICITY:
        return headMultiplicity != null;
      case ClassmodelPackage.AGGREGATION__TAIL_NAVIGABLE:
        return tailNavigable != TAIL_NAVIGABLE_EDEFAULT;
      case ClassmodelPackage.AGGREGATION__TAIL_VISIBILITY:
        return tailVisibility != TAIL_VISIBILITY_EDEFAULT;
      case ClassmodelPackage.AGGREGATION__TAIL_LABEL:
        return TAIL_LABEL_EDEFAULT == null ? tailLabel != null : !TAIL_LABEL_EDEFAULT.equals(tailLabel);
      case ClassmodelPackage.AGGREGATION__TAIL_MULTIPLICITY:
        return tailMultiplicity != null;
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
    result.append(" (headNavigable: ");
    result.append(headNavigable);
    result.append(", headVisibility: ");
    result.append(headVisibility);
    result.append(", headLabel: ");
    result.append(headLabel);
    result.append(", tailNavigable: ");
    result.append(tailNavigable);
    result.append(", tailVisibility: ");
    result.append(tailVisibility);
    result.append(", tailLabel: ");
    result.append(tailLabel);
    result.append(')');
    return result.toString();
  }

} //AggregationImpl

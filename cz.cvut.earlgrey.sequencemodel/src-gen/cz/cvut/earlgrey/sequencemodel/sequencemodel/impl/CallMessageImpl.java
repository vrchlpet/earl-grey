/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.ReturnMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl#getSourceParticipant <em>Source Participant</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl#getTargetParticipant <em>Target Participant</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallMessageImpl#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallMessageImpl extends MessageImpl implements CallMessage
{
  /**
   * The cached value of the '{@link #getSourceParticipant() <em>Source Participant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceParticipant()
   * @generated
   * @ordered
   */
  protected Participant sourceParticipant;

  /**
   * The cached value of the '{@link #getTargetParticipant() <em>Target Participant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetParticipant()
   * @generated
   * @ordered
   */
  protected Participant targetParticipant;

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
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected ReturnMessage return_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallMessageImpl()
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
    return SequencemodelPackage.Literals.CALL_MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant getSourceParticipant()
  {
    if (sourceParticipant != null && sourceParticipant.eIsProxy())
    {
      InternalEObject oldSourceParticipant = (InternalEObject)sourceParticipant;
      sourceParticipant = (Participant)eResolveProxy(oldSourceParticipant);
      if (sourceParticipant != oldSourceParticipant)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencemodelPackage.CALL_MESSAGE__SOURCE_PARTICIPANT, oldSourceParticipant, sourceParticipant));
      }
    }
    return sourceParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant basicGetSourceParticipant()
  {
    return sourceParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceParticipant(Participant newSourceParticipant)
  {
    Participant oldSourceParticipant = sourceParticipant;
    sourceParticipant = newSourceParticipant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL_MESSAGE__SOURCE_PARTICIPANT, oldSourceParticipant, sourceParticipant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant getTargetParticipant()
  {
    if (targetParticipant != null && targetParticipant.eIsProxy())
    {
      InternalEObject oldTargetParticipant = (InternalEObject)targetParticipant;
      targetParticipant = (Participant)eResolveProxy(oldTargetParticipant);
      if (targetParticipant != oldTargetParticipant)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencemodelPackage.CALL_MESSAGE__TARGET_PARTICIPANT, oldTargetParticipant, targetParticipant));
      }
    }
    return targetParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Participant basicGetTargetParticipant()
  {
    return targetParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetParticipant(Participant newTargetParticipant)
  {
    Participant oldTargetParticipant = targetParticipant;
    targetParticipant = newTargetParticipant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL_MESSAGE__TARGET_PARTICIPANT, oldTargetParticipant, targetParticipant));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL_MESSAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnMessage getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(ReturnMessage newReturn, NotificationChain msgs)
  {
    ReturnMessage oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL_MESSAGE__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(ReturnMessage newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencemodelPackage.CALL_MESSAGE__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencemodelPackage.CALL_MESSAGE__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL_MESSAGE__RETURN, newReturn, newReturn));
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
      case SequencemodelPackage.CALL_MESSAGE__RETURN:
        return basicSetReturn(null, msgs);
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
      case SequencemodelPackage.CALL_MESSAGE__SOURCE_PARTICIPANT:
        if (resolve) return getSourceParticipant();
        return basicGetSourceParticipant();
      case SequencemodelPackage.CALL_MESSAGE__TARGET_PARTICIPANT:
        if (resolve) return getTargetParticipant();
        return basicGetTargetParticipant();
      case SequencemodelPackage.CALL_MESSAGE__NAME:
        return getName();
      case SequencemodelPackage.CALL_MESSAGE__RETURN:
        return getReturn();
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
      case SequencemodelPackage.CALL_MESSAGE__SOURCE_PARTICIPANT:
        setSourceParticipant((Participant)newValue);
        return;
      case SequencemodelPackage.CALL_MESSAGE__TARGET_PARTICIPANT:
        setTargetParticipant((Participant)newValue);
        return;
      case SequencemodelPackage.CALL_MESSAGE__NAME:
        setName((String)newValue);
        return;
      case SequencemodelPackage.CALL_MESSAGE__RETURN:
        setReturn((ReturnMessage)newValue);
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
      case SequencemodelPackage.CALL_MESSAGE__SOURCE_PARTICIPANT:
        setSourceParticipant((Participant)null);
        return;
      case SequencemodelPackage.CALL_MESSAGE__TARGET_PARTICIPANT:
        setTargetParticipant((Participant)null);
        return;
      case SequencemodelPackage.CALL_MESSAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SequencemodelPackage.CALL_MESSAGE__RETURN:
        setReturn((ReturnMessage)null);
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
      case SequencemodelPackage.CALL_MESSAGE__SOURCE_PARTICIPANT:
        return sourceParticipant != null;
      case SequencemodelPackage.CALL_MESSAGE__TARGET_PARTICIPANT:
        return targetParticipant != null;
      case SequencemodelPackage.CALL_MESSAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SequencemodelPackage.CALL_MESSAGE__RETURN:
        return return_ != null;
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

} //CallMessageImpl

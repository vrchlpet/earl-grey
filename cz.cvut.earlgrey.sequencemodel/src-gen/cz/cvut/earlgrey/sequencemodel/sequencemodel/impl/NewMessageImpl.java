/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.NewMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Participant;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.NewMessageImpl#getSourceParticipant <em>Source Participant</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.NewMessageImpl#getTargetParticipant <em>Target Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewMessageImpl extends MessageImpl implements NewMessage
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NewMessageImpl()
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
    return SequencemodelPackage.Literals.NEW_MESSAGE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencemodelPackage.NEW_MESSAGE__SOURCE_PARTICIPANT, oldSourceParticipant, sourceParticipant));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.NEW_MESSAGE__SOURCE_PARTICIPANT, oldSourceParticipant, sourceParticipant));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT, oldTargetParticipant, targetParticipant));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT, oldTargetParticipant, targetParticipant));
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
      case SequencemodelPackage.NEW_MESSAGE__SOURCE_PARTICIPANT:
        if (resolve) return getSourceParticipant();
        return basicGetSourceParticipant();
      case SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT:
        if (resolve) return getTargetParticipant();
        return basicGetTargetParticipant();
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
      case SequencemodelPackage.NEW_MESSAGE__SOURCE_PARTICIPANT:
        setSourceParticipant((Participant)newValue);
        return;
      case SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT:
        setTargetParticipant((Participant)newValue);
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
      case SequencemodelPackage.NEW_MESSAGE__SOURCE_PARTICIPANT:
        setSourceParticipant((Participant)null);
        return;
      case SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT:
        setTargetParticipant((Participant)null);
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
      case SequencemodelPackage.NEW_MESSAGE__SOURCE_PARTICIPANT:
        return sourceParticipant != null;
      case SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT:
        return targetParticipant != null;
    }
    return super.eIsSet(featureID);
  }

} //NewMessageImpl

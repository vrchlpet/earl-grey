/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.NewMessage;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

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
   * The default value of the '{@link #getSourceParticipant() <em>Source Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceParticipant()
   * @generated
   * @ordered
   */
  protected static final String SOURCE_PARTICIPANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSourceParticipant() <em>Source Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceParticipant()
   * @generated
   * @ordered
   */
  protected String sourceParticipant = SOURCE_PARTICIPANT_EDEFAULT;

  /**
   * The default value of the '{@link #getTargetParticipant() <em>Target Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetParticipant()
   * @generated
   * @ordered
   */
  protected static final String TARGET_PARTICIPANT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTargetParticipant() <em>Target Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetParticipant()
   * @generated
   * @ordered
   */
  protected String targetParticipant = TARGET_PARTICIPANT_EDEFAULT;

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
  public String getSourceParticipant()
  {
    return sourceParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSourceParticipant(String newSourceParticipant)
  {
    String oldSourceParticipant = sourceParticipant;
    sourceParticipant = newSourceParticipant;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.NEW_MESSAGE__SOURCE_PARTICIPANT, oldSourceParticipant, sourceParticipant));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTargetParticipant()
  {
    return targetParticipant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetParticipant(String newTargetParticipant)
  {
    String oldTargetParticipant = targetParticipant;
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
        return getSourceParticipant();
      case SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT:
        return getTargetParticipant();
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
        setSourceParticipant((String)newValue);
        return;
      case SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT:
        setTargetParticipant((String)newValue);
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
        setSourceParticipant(SOURCE_PARTICIPANT_EDEFAULT);
        return;
      case SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT:
        setTargetParticipant(TARGET_PARTICIPANT_EDEFAULT);
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
        return SOURCE_PARTICIPANT_EDEFAULT == null ? sourceParticipant != null : !SOURCE_PARTICIPANT_EDEFAULT.equals(sourceParticipant);
      case SequencemodelPackage.NEW_MESSAGE__TARGET_PARTICIPANT:
        return TARGET_PARTICIPANT_EDEFAULT == null ? targetParticipant != null : !TARGET_PARTICIPANT_EDEFAULT.equals(targetParticipant);
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
    result.append(" (sourceParticipant: ");
    result.append(sourceParticipant);
    result.append(", targetParticipant: ");
    result.append(targetParticipant);
    result.append(')');
    return result.toString();
  }

} //NewMessageImpl

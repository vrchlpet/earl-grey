/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.Message;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Self;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Self</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SelfImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SelfImpl#getReply <em>Reply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfImpl extends StatementImpl implements Self
{
  /**
   * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessage()
   * @generated
   * @ordered
   */
  protected Message message;

  /**
   * The default value of the '{@link #getReply() <em>Reply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReply()
   * @generated
   * @ordered
   */
  protected static final String REPLY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReply() <em>Reply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReply()
   * @generated
   * @ordered
   */
  protected String reply = REPLY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelfImpl()
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
    return SequencemodelPackage.Literals.SELF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message getMessage()
  {
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs)
  {
    Message oldMessage = message;
    message = newMessage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencemodelPackage.SELF__MESSAGE, oldMessage, newMessage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMessage(Message newMessage)
  {
    if (newMessage != message)
    {
      NotificationChain msgs = null;
      if (message != null)
        msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencemodelPackage.SELF__MESSAGE, null, msgs);
      if (newMessage != null)
        msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencemodelPackage.SELF__MESSAGE, null, msgs);
      msgs = basicSetMessage(newMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.SELF__MESSAGE, newMessage, newMessage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReply()
  {
    return reply;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReply(String newReply)
  {
    String oldReply = reply;
    reply = newReply;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.SELF__REPLY, oldReply, reply));
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
      case SequencemodelPackage.SELF__MESSAGE:
        return basicSetMessage(null, msgs);
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
      case SequencemodelPackage.SELF__MESSAGE:
        return getMessage();
      case SequencemodelPackage.SELF__REPLY:
        return getReply();
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
      case SequencemodelPackage.SELF__MESSAGE:
        setMessage((Message)newValue);
        return;
      case SequencemodelPackage.SELF__REPLY:
        setReply((String)newValue);
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
      case SequencemodelPackage.SELF__MESSAGE:
        setMessage((Message)null);
        return;
      case SequencemodelPackage.SELF__REPLY:
        setReply(REPLY_EDEFAULT);
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
      case SequencemodelPackage.SELF__MESSAGE:
        return message != null;
      case SequencemodelPackage.SELF__REPLY:
        return REPLY_EDEFAULT == null ? reply != null : !REPLY_EDEFAULT.equals(reply);
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
    result.append(" (reply: ");
    result.append(reply);
    result.append(')');
    return result.toString();
  }

} //SelfImpl

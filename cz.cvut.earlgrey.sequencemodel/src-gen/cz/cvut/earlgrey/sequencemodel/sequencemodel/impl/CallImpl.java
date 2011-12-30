/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.Call;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Message;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallImpl#getCalled <em>Called</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.CallImpl#getReply <em>Reply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends StatementImpl implements Call
{
  /**
   * The cached value of the '{@link #getCalled() <em>Called</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCalled()
   * @generated
   * @ordered
   */
  protected Lifeline called;

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
  protected CallImpl()
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
    return SequencemodelPackage.Literals.CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lifeline getCalled()
  {
    if (called != null && called.eIsProxy())
    {
      InternalEObject oldCalled = (InternalEObject)called;
      called = (Lifeline)eResolveProxy(oldCalled);
      if (called != oldCalled)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencemodelPackage.CALL__CALLED, oldCalled, called));
      }
    }
    return called;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lifeline basicGetCalled()
  {
    return called;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCalled(Lifeline newCalled)
  {
    Lifeline oldCalled = called;
    called = newCalled;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL__CALLED, oldCalled, called));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL__MESSAGE, oldMessage, newMessage);
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
        msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SequencemodelPackage.CALL__MESSAGE, null, msgs);
      if (newMessage != null)
        msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SequencemodelPackage.CALL__MESSAGE, null, msgs);
      msgs = basicSetMessage(newMessage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL__MESSAGE, newMessage, newMessage));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.CALL__REPLY, oldReply, reply));
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
      case SequencemodelPackage.CALL__MESSAGE:
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
      case SequencemodelPackage.CALL__CALLED:
        if (resolve) return getCalled();
        return basicGetCalled();
      case SequencemodelPackage.CALL__MESSAGE:
        return getMessage();
      case SequencemodelPackage.CALL__REPLY:
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
      case SequencemodelPackage.CALL__CALLED:
        setCalled((Lifeline)newValue);
        return;
      case SequencemodelPackage.CALL__MESSAGE:
        setMessage((Message)newValue);
        return;
      case SequencemodelPackage.CALL__REPLY:
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
      case SequencemodelPackage.CALL__CALLED:
        setCalled((Lifeline)null);
        return;
      case SequencemodelPackage.CALL__MESSAGE:
        setMessage((Message)null);
        return;
      case SequencemodelPackage.CALL__REPLY:
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
      case SequencemodelPackage.CALL__CALLED:
        return called != null;
      case SequencemodelPackage.CALL__MESSAGE:
        return message != null;
      case SequencemodelPackage.CALL__REPLY:
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

} //CallImpl

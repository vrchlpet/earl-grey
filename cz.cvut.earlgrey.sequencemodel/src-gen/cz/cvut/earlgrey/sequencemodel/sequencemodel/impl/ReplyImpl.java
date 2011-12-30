/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReplyImpl#getCalled <em>Called</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.ReplyImpl#getReply <em>Reply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplyImpl extends StatementImpl implements Reply
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
  protected ReplyImpl()
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
    return SequencemodelPackage.Literals.REPLY;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencemodelPackage.REPLY__CALLED, oldCalled, called));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.REPLY__CALLED, oldCalled, called));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.REPLY__REPLY, oldReply, reply));
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
      case SequencemodelPackage.REPLY__CALLED:
        if (resolve) return getCalled();
        return basicGetCalled();
      case SequencemodelPackage.REPLY__REPLY:
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
      case SequencemodelPackage.REPLY__CALLED:
        setCalled((Lifeline)newValue);
        return;
      case SequencemodelPackage.REPLY__REPLY:
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
      case SequencemodelPackage.REPLY__CALLED:
        setCalled((Lifeline)null);
        return;
      case SequencemodelPackage.REPLY__REPLY:
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
      case SequencemodelPackage.REPLY__CALLED:
        return called != null;
      case SequencemodelPackage.REPLY__REPLY:
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

} //ReplyImpl

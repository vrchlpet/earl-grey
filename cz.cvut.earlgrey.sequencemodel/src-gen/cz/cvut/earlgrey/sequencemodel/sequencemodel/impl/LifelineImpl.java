/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.classmodel.classmodel.Entity;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LifelineImpl#isActor <em>Actor</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LifelineImpl#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.LifelineImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LifelineImpl extends MinimalEObjectImpl.Container implements Lifeline
{
  /**
   * The default value of the '{@link #isActor() <em>Actor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isActor()
   * @generated
   * @ordered
   */
  protected static final boolean ACTOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isActor() <em>Actor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isActor()
   * @generated
   * @ordered
   */
  protected boolean actor = ACTOR_EDEFAULT;

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
   * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity()
   * @generated
   * @ordered
   */
  protected Entity entity;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LifelineImpl()
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
    return SequencemodelPackage.Literals.LIFELINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isActor()
  {
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActor(boolean newActor)
  {
    boolean oldActor = actor;
    actor = newActor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.LIFELINE__ACTOR, oldActor, actor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.LIFELINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getEntity()
  {
    if (entity != null && entity.eIsProxy())
    {
      InternalEObject oldEntity = (InternalEObject)entity;
      entity = (Entity)eResolveProxy(oldEntity);
      if (entity != oldEntity)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SequencemodelPackage.LIFELINE__ENTITY, oldEntity, entity));
      }
    }
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetEntity()
  {
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntity(Entity newEntity)
  {
    Entity oldEntity = entity;
    entity = newEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SequencemodelPackage.LIFELINE__ENTITY, oldEntity, entity));
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
      case SequencemodelPackage.LIFELINE__ACTOR:
        return isActor();
      case SequencemodelPackage.LIFELINE__NAME:
        return getName();
      case SequencemodelPackage.LIFELINE__ENTITY:
        if (resolve) return getEntity();
        return basicGetEntity();
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
      case SequencemodelPackage.LIFELINE__ACTOR:
        setActor((Boolean)newValue);
        return;
      case SequencemodelPackage.LIFELINE__NAME:
        setName((String)newValue);
        return;
      case SequencemodelPackage.LIFELINE__ENTITY:
        setEntity((Entity)newValue);
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
      case SequencemodelPackage.LIFELINE__ACTOR:
        setActor(ACTOR_EDEFAULT);
        return;
      case SequencemodelPackage.LIFELINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SequencemodelPackage.LIFELINE__ENTITY:
        setEntity((Entity)null);
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
      case SequencemodelPackage.LIFELINE__ACTOR:
        return actor != ACTOR_EDEFAULT;
      case SequencemodelPackage.LIFELINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SequencemodelPackage.LIFELINE__ENTITY:
        return entity != null;
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
    result.append(" (actor: ");
    result.append(actor);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LifelineImpl

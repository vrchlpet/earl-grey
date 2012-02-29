/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.impl;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.Import;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel;
import cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequencemodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.impl.SequencemodelImpl#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequencemodelImpl extends MinimalEObjectImpl.Container implements Sequencemodel
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSequence()
   * @generated
   * @ordered
   */
  protected EList<Sequence> sequence;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequencemodelImpl()
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
    return SequencemodelPackage.Literals.SEQUENCEMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, SequencemodelPackage.SEQUENCEMODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Sequence> getSequence()
  {
    if (sequence == null)
    {
      sequence = new EObjectContainmentEList<Sequence>(Sequence.class, this, SequencemodelPackage.SEQUENCEMODEL__SEQUENCE);
    }
    return sequence;
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
      case SequencemodelPackage.SEQUENCEMODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case SequencemodelPackage.SEQUENCEMODEL__SEQUENCE:
        return ((InternalEList<?>)getSequence()).basicRemove(otherEnd, msgs);
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
      case SequencemodelPackage.SEQUENCEMODEL__IMPORTS:
        return getImports();
      case SequencemodelPackage.SEQUENCEMODEL__SEQUENCE:
        return getSequence();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SequencemodelPackage.SEQUENCEMODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case SequencemodelPackage.SEQUENCEMODEL__SEQUENCE:
        getSequence().clear();
        getSequence().addAll((Collection<? extends Sequence>)newValue);
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
      case SequencemodelPackage.SEQUENCEMODEL__IMPORTS:
        getImports().clear();
        return;
      case SequencemodelPackage.SEQUENCEMODEL__SEQUENCE:
        getSequence().clear();
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
      case SequencemodelPackage.SEQUENCEMODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case SequencemodelPackage.SEQUENCEMODEL__SEQUENCE:
        return sequence != null && !sequence.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SequencemodelImpl

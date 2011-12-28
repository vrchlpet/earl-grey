/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel;

import cz.cvut.earlgrey.classmodel.classmodel.Entity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getMapped <em>Mapped</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getStatemachine()
 * @model
 * @generated
 */
public interface Statemachine extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getStatemachine_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Mapped</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapped</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapped</em>' reference.
   * @see #setMapped(Entity)
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getStatemachine_Mapped()
   * @model
   * @generated
   */
  Entity getMapped();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getMapped <em>Mapped</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapped</em>' reference.
   * @see #getMapped()
   * @generated
   */
  void setMapped(Entity value);

  /**
   * Returns the value of the '<em><b>State</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.statemodel.statemodel.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' containment reference list.
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getStatemachine_State()
   * @model containment="true"
   * @generated
   */
  EList<State> getState();

} // Statemachine

/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.State#getType <em>Type</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.State#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.State#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getState()
 * @model
 * @generated
 */
public interface State extends Element
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link cz.cvut.earlgrey.statemodel.statemodel.StateType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see cz.cvut.earlgrey.statemodel.statemodel.StateType
   * @see #setType(StateType)
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getState_Type()
   * @model
   * @generated
   */
  StateType getType();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.statemodel.statemodel.State#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see cz.cvut.earlgrey.statemodel.statemodel.StateType
   * @see #getType()
   * @generated
   */
  void setType(StateType value);

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
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.statemodel.statemodel.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.statemodel.statemodel.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getState_Element()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElement();

} // State

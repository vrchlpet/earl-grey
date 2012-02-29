/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getStatemachine()
 * @model
 * @generated
 */
public interface Statemachine extends Element
{
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

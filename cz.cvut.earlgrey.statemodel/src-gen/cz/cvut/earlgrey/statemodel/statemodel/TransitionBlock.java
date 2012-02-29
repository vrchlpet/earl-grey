/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock#getEvent <em>Event</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getTransitionBlock()
 * @model
 * @generated
 */
public interface TransitionBlock extends Activity
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' attribute.
   * @see #setEvent(String)
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getTransitionBlock_Event()
   * @model
   * @generated
   */
  String getEvent();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock#getEvent <em>Event</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' attribute.
   * @see #getEvent()
   * @generated
   */
  void setEvent(String value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.statemodel.statemodel.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference list.
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getTransitionBlock_Transition()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransition();

} // TransitionBlock

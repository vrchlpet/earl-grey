/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.SelfMessage#getSource <em>Source</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.SelfMessage#getReturn <em>Return</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.SelfMessage#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getSelfMessage()
 * @model
 * @generated
 */
public interface SelfMessage extends Message
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Participant)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getSelfMessage_Source()
   * @model
   * @generated
   */
  Participant getSource();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.SelfMessage#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Participant value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(Return)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getSelfMessage_Return()
   * @model containment="true"
   * @generated
   */
  Return getReturn();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.SelfMessage#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(Return value);

  /**
   * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transition</em>' containment reference list.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getSelfMessage_Transition()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransition();

} // SelfMessage

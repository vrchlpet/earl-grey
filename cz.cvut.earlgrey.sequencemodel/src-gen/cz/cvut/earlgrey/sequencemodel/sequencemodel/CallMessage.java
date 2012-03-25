/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getSourceParticipant <em>Source Participant</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getTargetParticipant <em>Target Participant</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getReturn <em>Return</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCallMessage()
 * @model
 * @generated
 */
public interface CallMessage extends Message
{
  /**
   * Returns the value of the '<em><b>Source Participant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Participant</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Participant</em>' reference.
   * @see #setSourceParticipant(Participant)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCallMessage_SourceParticipant()
   * @model
   * @generated
   */
  Participant getSourceParticipant();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getSourceParticipant <em>Source Participant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Participant</em>' reference.
   * @see #getSourceParticipant()
   * @generated
   */
  void setSourceParticipant(Participant value);

  /**
   * Returns the value of the '<em><b>Target Participant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Participant</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Participant</em>' reference.
   * @see #setTargetParticipant(Participant)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCallMessage_TargetParticipant()
   * @model
   * @generated
   */
  Participant getTargetParticipant();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getTargetParticipant <em>Target Participant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Participant</em>' reference.
   * @see #getTargetParticipant()
   * @generated
   */
  void setTargetParticipant(Participant value);

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
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCallMessage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(ReturnMessage)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCallMessage_Return()
   * @model containment="true"
   * @generated
   */
  ReturnMessage getReturn();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.CallMessage#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(ReturnMessage value);

} // CallMessage

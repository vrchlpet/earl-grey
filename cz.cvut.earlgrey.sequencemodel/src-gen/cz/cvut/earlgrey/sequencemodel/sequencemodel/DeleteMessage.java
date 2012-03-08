/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.DeleteMessage#getSourceParticipant <em>Source Participant</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.DeleteMessage#getTargetParticipant <em>Target Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getDeleteMessage()
 * @model
 * @generated
 */
public interface DeleteMessage extends Message
{
  /**
   * Returns the value of the '<em><b>Source Participant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source Participant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Participant</em>' attribute.
   * @see #setSourceParticipant(String)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getDeleteMessage_SourceParticipant()
   * @model
   * @generated
   */
  String getSourceParticipant();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.DeleteMessage#getSourceParticipant <em>Source Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Participant</em>' attribute.
   * @see #getSourceParticipant()
   * @generated
   */
  void setSourceParticipant(String value);

  /**
   * Returns the value of the '<em><b>Target Participant</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target Participant</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Participant</em>' attribute.
   * @see #setTargetParticipant(String)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getDeleteMessage_TargetParticipant()
   * @model
   * @generated
   */
  String getTargetParticipant();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.DeleteMessage#getTargetParticipant <em>Target Participant</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Participant</em>' attribute.
   * @see #getTargetParticipant()
   * @generated
   */
  void setTargetParticipant(String value);

} // DeleteMessage

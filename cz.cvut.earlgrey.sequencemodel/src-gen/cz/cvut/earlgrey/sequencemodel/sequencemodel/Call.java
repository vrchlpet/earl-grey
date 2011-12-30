/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getCalled <em>Called</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getMessage <em>Message</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getReply <em>Reply</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Statement
{
  /**
   * Returns the value of the '<em><b>Called</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Called</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Called</em>' reference.
   * @see #setCalled(Lifeline)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCall_Called()
   * @model
   * @generated
   */
  Lifeline getCalled();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getCalled <em>Called</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called</em>' reference.
   * @see #getCalled()
   * @generated
   */
  void setCalled(Lifeline value);

  /**
   * Returns the value of the '<em><b>Message</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Message</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Message</em>' containment reference.
   * @see #setMessage(Message)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCall_Message()
   * @model containment="true"
   * @generated
   */
  Message getMessage();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getMessage <em>Message</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Message</em>' containment reference.
   * @see #getMessage()
   * @generated
   */
  void setMessage(Message value);

  /**
   * Returns the value of the '<em><b>Reply</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reply</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reply</em>' attribute.
   * @see #setReply(String)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getCall_Reply()
   * @model
   * @generated
   */
  String getReply();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call#getReply <em>Reply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reply</em>' attribute.
   * @see #getReply()
   * @generated
   */
  void setReply(String value);

} // Call

/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply#getCalled <em>Called</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply#getReply <em>Reply</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getReply()
 * @model
 * @generated
 */
public interface Reply extends Statement
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
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getReply_Called()
   * @model
   * @generated
   */
  Lifeline getCalled();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply#getCalled <em>Called</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called</em>' reference.
   * @see #getCalled()
   * @generated
   */
  void setCalled(Lifeline value);

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
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getReply_Reply()
   * @model
   * @generated
   */
  String getReply();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply#getReply <em>Reply</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reply</em>' attribute.
   * @see #getReply()
   * @generated
   */
  void setReply(String value);

} // Reply

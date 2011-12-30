/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy#getCalled <em>Called</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getDestroy()
 * @model
 * @generated
 */
public interface Destroy extends Statement
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
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getDestroy_Called()
   * @model
   * @generated
   */
  Lifeline getCalled();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy#getCalled <em>Called</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Called</em>' reference.
   * @see #getCalled()
   * @generated
   */
  void setCalled(Lifeline value);

} // Destroy

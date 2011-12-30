/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition#getCaller <em>Caller</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Caller</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Caller</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Caller</em>' reference.
   * @see #setCaller(Lifeline)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getTransition_Caller()
   * @model
   * @generated
   */
  Lifeline getCaller();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition#getCaller <em>Caller</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Caller</em>' reference.
   * @see #getCaller()
   * @generated
   */
  void setCaller(Lifeline value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getTransition_Statement()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatement();

} // Transition

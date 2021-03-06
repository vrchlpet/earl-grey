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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Model#getImports <em>Imports</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Model#getSequence <em>Sequence</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' containment reference list.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getModel_Sequence()
   * @model containment="true"
   * @generated
   */
  EList<Sequence> getSequence();

} // Model

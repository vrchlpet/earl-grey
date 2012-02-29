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
 * A representation of the model object '<em><b>Transition Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getParameter <em>Parameter</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getTransitionBlock()
 * @model
 * @generated
 */
public interface TransitionBlock extends EObject
{
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
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getTransitionBlock_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.TransitionBlock#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference list.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getTransitionBlock_Parameter()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameter();

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
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getTransitionBlock_Transition()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransition();

} // TransitionBlock

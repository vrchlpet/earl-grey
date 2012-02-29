/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseIfExpr <em>Else If Expr</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseIftransition <em>Else Iftransition</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.IfElseFragment#getElseTransition <em>Else Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getIfElseFragment()
 * @model
 * @generated
 */
public interface IfElseFragment extends Fragment
{
  /**
   * Returns the value of the '<em><b>Else If Expr</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else If Expr</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else If Expr</em>' attribute list.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getIfElseFragment_ElseIfExpr()
   * @model unique="false"
   * @generated
   */
  EList<String> getElseIfExpr();

  /**
   * Returns the value of the '<em><b>Else Iftransition</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Iftransition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Iftransition</em>' containment reference list.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getIfElseFragment_ElseIftransition()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getElseIftransition();

  /**
   * Returns the value of the '<em><b>Else Transition</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Transition</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Transition</em>' containment reference list.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getIfElseFragment_ElseTransition()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getElseTransition();

} // IfElseFragment

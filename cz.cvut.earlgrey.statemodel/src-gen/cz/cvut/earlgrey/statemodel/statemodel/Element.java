/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel;

import cz.cvut.earlgrey.annotation.annotation.Annotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.Element#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.statemodel.statemodel.Element#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.annotation.annotation.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference list.
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getElement_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

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
   * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage#getElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.statemodel.statemodel.Element#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Element

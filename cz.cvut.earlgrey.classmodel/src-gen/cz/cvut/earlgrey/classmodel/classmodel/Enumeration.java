/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getUpperClass <em>Upper Class</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getEnumerator <em>Enumerator</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Entity
{
  /**
   * Returns the value of the '<em><b>Upper Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Class</em>' containment reference.
   * @see #setUpperClass(Type)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEnumeration_UpperClass()
   * @model containment="true"
   * @generated
   */
  Type getUpperClass();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getUpperClass <em>Upper Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Class</em>' containment reference.
   * @see #getUpperClass()
   * @generated
   */
  void setUpperClass(Type value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEnumeration_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Enumeration#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

  /**
   * Returns the value of the '<em><b>Enumerator</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.classmodel.classmodel.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerator</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerator</em>' containment reference list.
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEnumeration_Enumerator()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getEnumerator();

} // Enumeration

/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getImplicit <em>Implicit</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends Feature
{
  /**
   * Returns the value of the '<em><b>Implicit</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Implicit</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implicit</em>' attribute list.
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getAttribute_Implicit()
   * @model unique="false"
   * @generated
   */
  EList<String> getImplicit();

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Reference)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  Reference getType();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Reference value);

} // Attribute

/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Multiplicity#getLower <em>Lower</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Multiplicity#getUpper <em>Upper</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject
{
  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lower</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getMultiplicity_Lower()
   * @model
   * @generated
   */
  String getLower();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Multiplicity#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(String value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getMultiplicity_Upper()
   * @model
   * @generated
   */
  String getUpper();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Multiplicity#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(String value);

} // Multiplicity

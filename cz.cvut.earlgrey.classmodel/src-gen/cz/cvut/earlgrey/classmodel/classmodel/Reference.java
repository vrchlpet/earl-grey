/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Reference#getType <em>Type</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Reference#getGeneric <em>Generic</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Reference#getDimension <em>Dimension</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Entity)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getReference_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Reference#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

  /**
   * Returns the value of the '<em><b>Generic</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.classmodel.classmodel.Reference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic</em>' containment reference list.
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getReference_Generic()
   * @model containment="true"
   * @generated
   */
  EList<Reference> getGeneric();

  /**
   * Returns the value of the '<em><b>Dimension</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimension</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimension</em>' attribute list.
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getReference_Dimension()
   * @model unique="false"
   * @generated
   */
  EList<String> getDimension();

} // Reference

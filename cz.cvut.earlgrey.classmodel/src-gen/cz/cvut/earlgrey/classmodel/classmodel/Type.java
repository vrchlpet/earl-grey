/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Type#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Type#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link cz.cvut.earlgrey.classmodel.classmodel.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #setVisibility(Visibility)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getType_Visibility()
   * @model
   * @generated
   */
  Visibility getVisibility();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Type#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(Visibility value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Type#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Type

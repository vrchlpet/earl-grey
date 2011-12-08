/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getModifier <em>Modifier</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link cz.cvut.earlgrey.classmodel.classmodel.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #setModifier(Visibility)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getAttribute_Modifier()
   * @model
   * @generated
   */
  Visibility getModifier();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #getModifier()
   * @generated
   */
  void setModifier(Visibility value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getAttribute_Type()
   * @model
   * @generated
   */
  Entity getType();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Attribute#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Entity value);

} // Attribute

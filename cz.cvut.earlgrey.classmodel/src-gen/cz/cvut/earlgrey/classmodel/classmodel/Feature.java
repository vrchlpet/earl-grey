/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#getModifier <em>Modifier</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#isStatic <em>Static</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends EObject
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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getFeature_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getFeature_Modifier()
   * @model
   * @generated
   */
  Visibility getModifier();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #getModifier()
   * @generated
   */
  void setModifier(Visibility value);

  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getFeature_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Feature#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

} // Feature

/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.annotation.annotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.annotation.annotation.Annotation#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.annotation.annotation.Annotation#getProperty <em>Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.annotation.annotation.AnnotationPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject
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
   * @see cz.cvut.earlgrey.annotation.annotation.AnnotationPackage#getAnnotation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.annotation.annotation.Annotation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.annotation.annotation.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see cz.cvut.earlgrey.annotation.annotation.AnnotationPackage#getAnnotation_Property()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperty();

} // Annotation

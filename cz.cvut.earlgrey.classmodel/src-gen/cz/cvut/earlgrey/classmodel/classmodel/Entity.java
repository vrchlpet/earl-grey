/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getType <em>Type</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link cz.cvut.earlgrey.classmodel.classmodel.EntityType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.EntityType
   * @see #setType(EntityType)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Type()
   * @model
   * @generated
   */
  EntityType getType();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.EntityType
   * @see #getType()
   * @generated
   */
  void setType(EntityType value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.classmodel.classmodel.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

  /**
   * Returns the value of the '<em><b>Method</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.classmodel.classmodel.Method}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' containment reference list.
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Method()
   * @model containment="true"
   * @generated
   */
  EList<Method> getMethod();

} // Entity

/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getLabel <em>Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHead <em>Head</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTail <em>Tail</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends Element
{
  /**
   * Returns the value of the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Label</em>' attribute.
   * @see #setLabel(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

  /**
   * Returns the value of the '<em><b>Head</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' reference.
   * @see #setHead(Entity)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_Head()
   * @model
   * @generated
   */
  Entity getHead();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHead <em>Head</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Entity value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' reference.
   * @see #setTail(Entity)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_Tail()
   * @model
   * @generated
   */
  Entity getTail();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTail <em>Tail</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' reference.
   * @see #getTail()
   * @generated
   */
  void setTail(Entity value);

} // Relationship

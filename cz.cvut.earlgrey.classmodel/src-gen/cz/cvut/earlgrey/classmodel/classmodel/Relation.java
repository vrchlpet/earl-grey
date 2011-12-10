/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getOrigin <em>Origin</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getCardinalityFrom <em>Cardinality From</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getType <em>Type</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getCardinalityTo <em>Cardinality To</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getDestination <em>Destination</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Origin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Origin</em>' reference.
   * @see #setOrigin(Entity)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelation_Origin()
   * @model
   * @generated
   */
  Entity getOrigin();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getOrigin <em>Origin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Origin</em>' reference.
   * @see #getOrigin()
   * @generated
   */
  void setOrigin(Entity value);

  /**
   * Returns the value of the '<em><b>Cardinality From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality From</em>' attribute.
   * @see #setCardinalityFrom(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelation_CardinalityFrom()
   * @model
   * @generated
   */
  String getCardinalityFrom();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getCardinalityFrom <em>Cardinality From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality From</em>' attribute.
   * @see #getCardinalityFrom()
   * @generated
   */
  void setCardinalityFrom(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link cz.cvut.earlgrey.classmodel.classmodel.RelationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.RelationType
   * @see #setType(RelationType)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelation_Type()
   * @model
   * @generated
   */
  RelationType getType();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.RelationType
   * @see #getType()
   * @generated
   */
  void setType(RelationType value);

  /**
   * Returns the value of the '<em><b>Cardinality To</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality To</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality To</em>' attribute.
   * @see #setCardinalityTo(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelation_CardinalityTo()
   * @model
   * @generated
   */
  String getCardinalityTo();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getCardinalityTo <em>Cardinality To</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality To</em>' attribute.
   * @see #getCardinalityTo()
   * @generated
   */
  void setCardinalityTo(String value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' reference.
   * @see #setDestination(Entity)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelation_Destination()
   * @model
   * @generated
   */
  Entity getDestination();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getDestination <em>Destination</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(Entity value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelation_Label()
   * @model
   * @generated
   */
  String getLabel();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relation#getLabel <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Label</em>' attribute.
   * @see #getLabel()
   * @generated
   */
  void setLabel(String value);

} // Relation

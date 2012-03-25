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
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getType <em>Type</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getLabel <em>Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#isHeadNavigable <em>Head Navigable</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadVisibility <em>Head Visibility</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadLabel <em>Head Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHead <em>Head</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadMultiplicity <em>Head Multiplicity</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#isTailNavigable <em>Tail Navigable</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailVisibility <em>Tail Visibility</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailLabel <em>Tail Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTail <em>Tail</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailMultiplicity <em>Tail Multiplicity</em>}</li>
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
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link cz.cvut.earlgrey.classmodel.classmodel.RelationshipType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.RelationshipType
   * @see #setType(RelationshipType)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_Type()
   * @model
   * @generated
   */
  RelationshipType getType();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.RelationshipType
   * @see #getType()
   * @generated
   */
  void setType(RelationshipType value);

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
   * Returns the value of the '<em><b>Head Navigable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head Navigable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head Navigable</em>' attribute.
   * @see #setHeadNavigable(boolean)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_HeadNavigable()
   * @model
   * @generated
   */
  boolean isHeadNavigable();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#isHeadNavigable <em>Head Navigable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head Navigable</em>' attribute.
   * @see #isHeadNavigable()
   * @generated
   */
  void setHeadNavigable(boolean value);

  /**
   * Returns the value of the '<em><b>Head Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link cz.cvut.earlgrey.classmodel.classmodel.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head Visibility</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #setHeadVisibility(Visibility)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_HeadVisibility()
   * @model
   * @generated
   */
  Visibility getHeadVisibility();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadVisibility <em>Head Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head Visibility</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #getHeadVisibility()
   * @generated
   */
  void setHeadVisibility(Visibility value);

  /**
   * Returns the value of the '<em><b>Head Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head Label</em>' attribute.
   * @see #setHeadLabel(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_HeadLabel()
   * @model
   * @generated
   */
  String getHeadLabel();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadLabel <em>Head Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head Label</em>' attribute.
   * @see #getHeadLabel()
   * @generated
   */
  void setHeadLabel(String value);

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
   * Returns the value of the '<em><b>Head Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Head Multiplicity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head Multiplicity</em>' containment reference.
   * @see #setHeadMultiplicity(Multiplicity)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_HeadMultiplicity()
   * @model containment="true"
   * @generated
   */
  Multiplicity getHeadMultiplicity();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getHeadMultiplicity <em>Head Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head Multiplicity</em>' containment reference.
   * @see #getHeadMultiplicity()
   * @generated
   */
  void setHeadMultiplicity(Multiplicity value);

  /**
   * Returns the value of the '<em><b>Tail Navigable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail Navigable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail Navigable</em>' attribute.
   * @see #setTailNavigable(boolean)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_TailNavigable()
   * @model
   * @generated
   */
  boolean isTailNavigable();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#isTailNavigable <em>Tail Navigable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail Navigable</em>' attribute.
   * @see #isTailNavigable()
   * @generated
   */
  void setTailNavigable(boolean value);

  /**
   * Returns the value of the '<em><b>Tail Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link cz.cvut.earlgrey.classmodel.classmodel.Visibility}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail Visibility</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail Visibility</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #setTailVisibility(Visibility)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_TailVisibility()
   * @model
   * @generated
   */
  Visibility getTailVisibility();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailVisibility <em>Tail Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail Visibility</em>' attribute.
   * @see cz.cvut.earlgrey.classmodel.classmodel.Visibility
   * @see #getTailVisibility()
   * @generated
   */
  void setTailVisibility(Visibility value);

  /**
   * Returns the value of the '<em><b>Tail Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail Label</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail Label</em>' attribute.
   * @see #setTailLabel(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_TailLabel()
   * @model
   * @generated
   */
  String getTailLabel();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailLabel <em>Tail Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail Label</em>' attribute.
   * @see #getTailLabel()
   * @generated
   */
  void setTailLabel(String value);

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

  /**
   * Returns the value of the '<em><b>Tail Multiplicity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tail Multiplicity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail Multiplicity</em>' containment reference.
   * @see #setTailMultiplicity(Multiplicity)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getRelationship_TailMultiplicity()
   * @model containment="true"
   * @generated
   */
  Multiplicity getTailMultiplicity();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Relationship#getTailMultiplicity <em>Tail Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail Multiplicity</em>' containment reference.
   * @see #getTailMultiplicity()
   * @generated
   */
  void setTailMultiplicity(Multiplicity value);

} // Relationship

/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#isHeadNavigable <em>Head Navigable</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getHeadVisibility <em>Head Visibility</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getHeadLabel <em>Head Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getHeadMultiplicity <em>Head Multiplicity</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#isTailNavigable <em>Tail Navigable</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getTailVisibility <em>Tail Visibility</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getTailLabel <em>Tail Label</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getTailMultiplicity <em>Tail Multiplicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Relationship
{
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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition_HeadNavigable()
   * @model
   * @generated
   */
  boolean isHeadNavigable();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#isHeadNavigable <em>Head Navigable</em>}' attribute.
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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition_HeadVisibility()
   * @model
   * @generated
   */
  Visibility getHeadVisibility();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getHeadVisibility <em>Head Visibility</em>}' attribute.
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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition_HeadLabel()
   * @model
   * @generated
   */
  String getHeadLabel();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getHeadLabel <em>Head Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head Label</em>' attribute.
   * @see #getHeadLabel()
   * @generated
   */
  void setHeadLabel(String value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition_HeadMultiplicity()
   * @model containment="true"
   * @generated
   */
  Multiplicity getHeadMultiplicity();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getHeadMultiplicity <em>Head Multiplicity</em>}' containment reference.
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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition_TailNavigable()
   * @model
   * @generated
   */
  boolean isTailNavigable();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#isTailNavigable <em>Tail Navigable</em>}' attribute.
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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition_TailVisibility()
   * @model
   * @generated
   */
  Visibility getTailVisibility();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getTailVisibility <em>Tail Visibility</em>}' attribute.
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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition_TailLabel()
   * @model
   * @generated
   */
  String getTailLabel();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getTailLabel <em>Tail Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail Label</em>' attribute.
   * @see #getTailLabel()
   * @generated
   */
  void setTailLabel(String value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getComposition_TailMultiplicity()
   * @model containment="true"
   * @generated
   */
  Multiplicity getTailMultiplicity();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Composition#getTailMultiplicity <em>Tail Multiplicity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail Multiplicity</em>' containment reference.
   * @see #getTailMultiplicity()
   * @generated
   */
  void setTailMultiplicity(Multiplicity value);

} // Composition

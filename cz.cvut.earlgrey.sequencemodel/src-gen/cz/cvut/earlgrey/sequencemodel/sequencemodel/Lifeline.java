/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel;

import cz.cvut.earlgrey.classmodel.classmodel.Entity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#isActor <em>Actor</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getLifeline()
 * @model
 * @generated
 */
public interface Lifeline extends EObject
{
  /**
   * Returns the value of the '<em><b>Actor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' attribute.
   * @see #setActor(boolean)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getLifeline_Actor()
   * @model
   * @generated
   */
  boolean isActor();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#isActor <em>Actor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor</em>' attribute.
   * @see #isActor()
   * @generated
   */
  void setActor(boolean value);

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
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getLifeline_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(Entity)
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage#getLifeline_Entity()
   * @model
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

} // Lifeline

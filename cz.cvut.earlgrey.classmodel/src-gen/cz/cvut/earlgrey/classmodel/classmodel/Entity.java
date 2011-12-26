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
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#isClass <em>Class</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#isInterface <em>Interface</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getName <em>Name</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#getFeature <em>Feature</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#isEnumeration <em>Enumeration</em>}</li>
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
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(boolean)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Class()
   * @model
   * @generated
   */
  boolean isClass();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#isClass <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #isClass()
   * @generated
   */
  void setClass(boolean value);

  /**
   * Returns the value of the '<em><b>Interface</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface</em>' attribute.
   * @see #setInterface(boolean)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Interface()
   * @model
   * @generated
   */
  boolean isInterface();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#isInterface <em>Interface</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface</em>' attribute.
   * @see #isInterface()
   * @generated
   */
  void setInterface(boolean value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.classmodel.classmodel.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' containment reference list.
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeature();

  /**
   * Returns the value of the '<em><b>Enumeration</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumeration</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumeration</em>' attribute.
   * @see #setEnumeration(boolean)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getEntity_Enumeration()
   * @model
   * @generated
   */
  boolean isEnumeration();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Entity#isEnumeration <em>Enumeration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumeration</em>' attribute.
   * @see #isEnumeration()
   * @generated
   */
  void setEnumeration(boolean value);

} // Entity

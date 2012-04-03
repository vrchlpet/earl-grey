/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.classmodel.classmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getUpperClass <em>Upper Class</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends Entity
{
  /**
   * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
   * The list contents are of type {@link cz.cvut.earlgrey.classmodel.classmodel.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generalization</em>' containment reference list.
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getClassifier_Generalization()
   * @model containment="true"
   * @generated
   */
  EList<Type> getGeneralization();

  /**
   * Returns the value of the '<em><b>Upper Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upper Class</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upper Class</em>' containment reference.
   * @see #setUpperClass(Type)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getClassifier_UpperClass()
   * @model containment="true"
   * @generated
   */
  Type getUpperClass();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getUpperClass <em>Upper Class</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper Class</em>' containment reference.
   * @see #getUpperClass()
   * @generated
   */
  void setUpperClass(Type value);

  /**
   * Returns the value of the '<em><b>Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' attribute.
   * @see #setConstraint(String)
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getClassifier_Constraint()
   * @model
   * @generated
   */
  String getConstraint();

  /**
   * Sets the value of the '{@link cz.cvut.earlgrey.classmodel.classmodel.Classifier#getConstraint <em>Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' attribute.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(String value);

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
   * @see cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage#getClassifier_Feature()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeature();

} // Classifier

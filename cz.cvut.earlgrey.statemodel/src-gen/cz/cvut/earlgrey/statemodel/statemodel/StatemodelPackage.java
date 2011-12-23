/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cz.cvut.earlgrey.statemodel.statemodel.StatemodelFactory
 * @model kind="package"
 * @generated
 */
public interface StatemodelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "statemodel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cvut.cz/earlgrey/statemodel/Statemodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "statemodel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  StatemodelPackage eINSTANCE = cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl.init();

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelImpl <em>Statemodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStatemodel()
   * @generated
   */
  int STATEMODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Statemachine</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMODEL__STATEMACHINE = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMODEL__STATE = 2;

  /**
   * The number of structural features of the '<em>Statemodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 1;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__ELEMENT = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATE = 2;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StateImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getState()
   * @generated
   */
  int STATE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ImportImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 3;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemodel <em>Statemodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemodel</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemodel
   * @generated
   */
  EClass getStatemodel();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemodel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemodel#getImports()
   * @see #getStatemodel()
   * @generated
   */
  EReference getStatemodel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemodel#getStatemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statemachine</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemodel#getStatemachine()
   * @see #getStatemodel()
   * @generated
   */
  EReference getStatemodel_Statemachine();

  /**
   * Returns the meta object for the reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemodel#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>State</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemodel#getState()
   * @see #getStatemodel()
   * @generated
   */
  EReference getStatemodel_State();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getReference()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Reference();

  /**
   * Returns the meta object for the reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Element</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getElement()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_Element();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>State</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getState()
   * @see #getStatemachine()
   * @generated
   */
  EReference getStatemachine_State();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  StatemodelFactory getStatemodelFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelImpl <em>Statemodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStatemodel()
     * @generated
     */
    EClass STATEMODEL = eINSTANCE.getStatemodel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMODEL__IMPORTS = eINSTANCE.getStatemodel_Imports();

    /**
     * The meta object literal for the '<em><b>Statemachine</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMODEL__STATEMACHINE = eINSTANCE.getStatemodel_Statemachine();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMODEL__STATE = eINSTANCE.getStatemodel_State();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__REFERENCE = eINSTANCE.getStatemachine_Reference();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__ELEMENT = eINSTANCE.getStatemachine_Element();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMACHINE__STATE = eINSTANCE.getStatemachine_State();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StateImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ImportImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

  }

} //StatemodelPackage

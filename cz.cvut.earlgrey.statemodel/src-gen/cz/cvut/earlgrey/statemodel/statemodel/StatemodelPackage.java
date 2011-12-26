/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.statemodel.statemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
   * The number of structural features of the '<em>Statemodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMODEL_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__NAME = 0;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATE = 1;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 3;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__STATE = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.EventImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.GuardImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 5;

  /**
   * The feature id for the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__COND = 0;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ImportImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 6;

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
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.StateType <em>State Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.StateType
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 7;


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
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine <em>Statemachine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statemachine</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemachine
   * @generated
   */
  EClass getStatemachine();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Statemachine#getName()
   * @see #getStatemachine()
   * @generated
   */
  EAttribute getStatemachine_Name();

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
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.State#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.State#getType()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Type();

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
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.State#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.State#getTransitions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transitions();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.statemodel.statemodel.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Guard();

  /**
   * Returns the meta object for the containment reference '{@link cz.cvut.earlgrey.statemodel.statemodel.Transition#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Transition#getEvent()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Event();

  /**
   * Returns the meta object for the reference '{@link cz.cvut.earlgrey.statemodel.statemodel.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_State();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.Guard#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cond</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Guard#getCond()
   * @see #getGuard()
   * @generated
   */
  EAttribute getGuard_Cond();

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
   * Returns the meta object for enum '{@link cz.cvut.earlgrey.statemodel.statemodel.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State Type</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.StateType
   * @generated
   */
  EEnum getStateType();

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
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStatemachine()
     * @generated
     */
    EClass STATEMACHINE = eINSTANCE.getStatemachine();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMACHINE__NAME = eINSTANCE.getStatemachine_Name();

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
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__TYPE = eINSTANCE.getState_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSITIONS = eINSTANCE.getState_Transitions();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__EVENT = eINSTANCE.getTransition_Event();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__STATE = eINSTANCE.getTransition_State();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.EventImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.GuardImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD__COND = eINSTANCE.getGuard_Cond();

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

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.StateType <em>State Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.StateType
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStateType()
     * @generated
     */
    EEnum STATE_TYPE = eINSTANCE.getStateType();

  }

} //StatemodelPackage

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
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ModelImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ImportImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

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
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ElementImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__ANNOTATION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__NAME = 1;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl <em>Statemachine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemachineImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStatemachine()
   * @generated
   */
  int STATEMACHINE = 3;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__ANNOTATION = ELEMENT__ANNOTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE__STATE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Statemachine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMACHINE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StateImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getState()
   * @generated
   */
  int STATE = 4;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ANNOTATION = ELEMENT__ANNOTATION;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TYPE = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ELEMENT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ActivityImpl <em>Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ActivityImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getActivity()
   * @generated
   */
  int ACTIVITY = 5;

  /**
   * The number of structural features of the '<em>Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIVITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionBlockImpl <em>Transition Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionBlockImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getTransitionBlock()
   * @generated
   */
  int TRANSITION_BLOCK = 6;

  /**
   * The feature id for the '<em><b>Event</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK__EVENT = ACTIVITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Transition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK__TRANSITION = ACTIVITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Transition Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_BLOCK_FEATURE_COUNT = ACTIVITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionImpl
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 7;

  /**
   * The feature id for the '<em><b>Guard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ACTION = 1;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
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
   * The meta object id for the '{@link cz.cvut.earlgrey.statemodel.statemodel.StateType <em>State Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see cz.cvut.earlgrey.statemodel.statemodel.StateType
   * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 8;


  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.Model#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Model#getImports()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

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
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.Element#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotation</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Element#getAnnotation()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Annotation();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.Element#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Element#getName()
   * @see #getElement()
   * @generated
   */
  EAttribute getElement_Name();

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
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.State#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.State#getElement()
   * @see #getState()
   * @generated
   */
  EReference getState_Element();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Activity</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Activity
   * @generated
   */
  EClass getActivity();

  /**
   * Returns the meta object for class '{@link cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock <em>Transition Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition Block</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock
   * @generated
   */
  EClass getTransitionBlock();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock#getEvent()
   * @see #getTransitionBlock()
   * @generated
   */
  EAttribute getTransitionBlock_Event();

  /**
   * Returns the meta object for the containment reference list '{@link cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock#getTransition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transition</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.TransitionBlock#getTransition()
   * @see #getTransitionBlock()
   * @generated
   */
  EReference getTransitionBlock_Transition();

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
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Guard</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Guard();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.Transition#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Transition#getAction()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Action();

  /**
   * Returns the meta object for the attribute '{@link cz.cvut.earlgrey.statemodel.statemodel.Transition#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see cz.cvut.earlgrey.statemodel.statemodel.Transition#getState()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_State();

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
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ModelImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__IMPORTS = eINSTANCE.getModel_Imports();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

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
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ElementImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__ANNOTATION = eINSTANCE.getElement_Annotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

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
     * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ELEMENT = eINSTANCE.getState_Element();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.ActivityImpl <em>Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.ActivityImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getActivity()
     * @generated
     */
    EClass ACTIVITY = eINSTANCE.getActivity();

    /**
     * The meta object literal for the '{@link cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionBlockImpl <em>Transition Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.TransitionBlockImpl
     * @see cz.cvut.earlgrey.statemodel.statemodel.impl.StatemodelPackageImpl#getTransitionBlock()
     * @generated
     */
    EClass TRANSITION_BLOCK = eINSTANCE.getTransitionBlock();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION_BLOCK__EVENT = eINSTANCE.getTransitionBlock_Event();

    /**
     * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION_BLOCK__TRANSITION = eINSTANCE.getTransitionBlock_Transition();

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
     * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__ACTION = eINSTANCE.getTransition_Action();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__STATE = eINSTANCE.getTransition_State();

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

/**
 * <copyright>
 * </copyright>
 *

 */
package cz.cvut.earlgrey.sequencemodel.sequencemodel.util;

import cz.cvut.earlgrey.sequencemodel.sequencemodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage
 * @generated
 */
public class SequencemodelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SequencemodelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SequencemodelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SequencemodelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SequencemodelSwitch<Adapter> modelSwitch =
    new SequencemodelSwitch<Adapter>()
    {
      @Override
      public Adapter caseSequencemodel(Sequencemodel object)
      {
        return createSequencemodelAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseSequence(Sequence object)
      {
        return createSequenceAdapter();
      }
      @Override
      public Adapter caseLifeline(Lifeline object)
      {
        return createLifelineAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseCall(Call object)
      {
        return createCallAdapter();
      }
      @Override
      public Adapter caseReply(Reply object)
      {
        return createReplyAdapter();
      }
      @Override
      public Adapter caseSelf(Self object)
      {
        return createSelfAdapter();
      }
      @Override
      public Adapter caseCreate(Create object)
      {
        return createCreateAdapter();
      }
      @Override
      public Adapter caseDestroy(Destroy object)
      {
        return createDestroyAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel <em>Sequencemodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequencemodel
   * @generated
   */
  public Adapter createSequencemodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence <em>Sequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Sequence
   * @generated
   */
  public Adapter createSequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline <em>Lifeline</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Lifeline
   * @generated
   */
  public Adapter createLifelineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Call
   * @generated
   */
  public Adapter createCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply <em>Reply</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Reply
   * @generated
   */
  public Adapter createReplyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Self <em>Self</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Self
   * @generated
   */
  public Adapter createSelfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Create <em>Create</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Create
   * @generated
   */
  public Adapter createCreateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy <em>Destroy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Destroy
   * @generated
   */
  public Adapter createDestroyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link cz.cvut.earlgrey.sequencemodel.sequencemodel.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see cz.cvut.earlgrey.sequencemodel.sequencemodel.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SequencemodelAdapterFactory

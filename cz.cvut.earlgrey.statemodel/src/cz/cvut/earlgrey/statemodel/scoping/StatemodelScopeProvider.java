package cz.cvut.earlgrey.statemodel.scoping;

//import java.util.ArrayList;
//import java.util.List;
//import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.EReference;
//import org.eclipse.xtext.scoping.IScope;
//import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
//import cz.cvut.earlgrey.statemodel.statemodel.State;
//import cz.cvut.earlgrey.statemodel.statemodel.Statemachine;
//import cz.cvut.earlgrey.statemodel.statemodel.Transition;

/**
 * This class contains custom scoping description.
 */
public class StatemodelScopeProvider extends AbstractDeclarativeScopeProvider {

//	/**
//	 * Tries to get states from a Statemachine, which containts this Transition.
//	 * 
//	 * @param call Transition object contains States
//	 * @param ref EReference
//	 * @return IScope
//	 */
//	IScope scope_Transition_state(Transition call, EReference ref) {
//		Statemachine machine = findMachine(call);
//		if (machine != null) {
//			return Scopes.scopeFor(findAllStates(machine));
//		}
//		return IScope.NULLSCOPE;
//	}
//
//	/**
//	 * Walks throught given EObject and finds parent of Statemachine type. If
//	 * there is no parent of Statemachine type, it returns null;
//	 * 
//	 * <pre>
//	 *       Statemachine
//	 *            /
//	 *        EObject1
//	 *          /\
//	 *         /  \
//	 *  EObject2   \
//	 *            EObject3
//	 * </pre>
//	 * 
//	 * i.e.: If we want to find EObject3 parent, we have to walk through to a
//	 * tree to find parent of type Statemachine.
//	 * 
//	 * @param e EObject which is to be found Statemachine parent
//	 * @return null / Statemachine parent
//	 */
//	private Statemachine findMachine(final EObject e) {
//		if (e != null) {
//			if (e instanceof Statemachine) {
//				return (Statemachine) e;
//			}
//			return findMachine(e.eContainer());
//		}
//		return null;
//	}
//
//	/**
//	 * Finds the Statemachine all its descendants of type State.
//	 * 
//	 * @param sm Statemachine
//	 * @return List<State> - can be empty, but not null
//	 */
//	private List<State> findAllStates(final Statemachine sm) {
//		List<State> states = new ArrayList<State>();
//		if (sm != null) {
//			for (State state : sm.getState()) {
//				states.addAll(findStates(state));
//			}
//		}
//		return states;
//	}
//
//	/**
//	 * Finds the State all its descendants of type State.
//	 * 
//	 * <pre>
//	 *            State
//	 *            /  \
//	 *        State1  State2
//	 * </pre>
//	 * 
//	 * @param state State to be walked through
//	 * @return List<State> - can be empty, but not null
//	 */
//	private List<State> findStates(final State state) {
//		List<State> walk = new ArrayList<State>();
//		if (state != null) {
//			walk.add(state);
//			EList<EObject> content = state.eContents();
//			for (EObject eObject : content) {
//				if (eObject instanceof State) {
//					walk.addAll(findStates(((State) eObject)));
//				}
//			}
//		}
//		return walk;
//	}
//
//	// /**
//	// * Tries to get operation from used Entity in Statemachine. i.e.:
//	// * Statemachine Test : package.Class, then this method tries to get all
//	// * operations of the package.Class.
//	// *
//	// * @param call Event object which contains reference to a Operation
//	// * @param ref EReference to Operation
//	// * @return IScope
//	// */
//	// IScope scope_Value_ref(Value call, EReference ref) {
//	// Statemachine machine = findMachine(call);
//	// if (machine != null) {
//	// Entity mapped = machine.getMapped();
//	// if (mapped != null) {
//	// return Scopes.scopeFor(EcoreUtil2.getAllContentsOfType(mapped,
//	// Operation.class));
//	// }
//	// }
//	// return IScope.NULLSCOPE;
//	// }
//
//	// @Override
//	// public IScope getScope(EObject context, EReference reference) {
//	// // System.out.println("con >>> " + context + " \nref >>>" + reference);
//	// String methodName = "scope_"
//	// + reference.getEContainingClass().getName() + "_"
//	// + reference.getName();
//	// System.out.println(methodName);
//	//
//	// return super.getScope(context, reference);
//	// }
}

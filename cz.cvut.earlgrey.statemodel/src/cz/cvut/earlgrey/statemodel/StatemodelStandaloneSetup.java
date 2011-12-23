
package cz.cvut.earlgrey.statemodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StatemodelStandaloneSetup extends StatemodelStandaloneSetupGenerated{

	public static void doSetup() {
		new StatemodelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


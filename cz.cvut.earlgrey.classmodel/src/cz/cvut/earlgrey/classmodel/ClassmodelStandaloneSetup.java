
package cz.cvut.earlgrey.classmodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ClassmodelStandaloneSetup extends ClassmodelStandaloneSetupGenerated{

	public static void doSetup() {
		new ClassmodelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}



package cz.cvut.earlgrey.sequencemodel;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SequencemodelStandaloneSetup extends SequencemodelStandaloneSetupGenerated{

	public static void doSetup() {
		new SequencemodelStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


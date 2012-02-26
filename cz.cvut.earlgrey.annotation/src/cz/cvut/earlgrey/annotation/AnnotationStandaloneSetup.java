
package cz.cvut.earlgrey.annotation;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AnnotationStandaloneSetup extends AnnotationStandaloneSetupGenerated{

	public static void doSetup() {
		new AnnotationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}


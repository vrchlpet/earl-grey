package cz.cvut.earlgrey.classmodel.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.examples.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.EValidatorRegistrar;

import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Import;

public class ClassmodelJavaValidator extends AbstractClassmodelJavaValidator {

	private static final String OCL_PATH = "/cz.cvut.earlgrey.classmodel.ocl/model/Classmodel.ocl";

	/**
	 * Checks the import URI is not null or empty.
	 * 
	 * @param importResource
	 *            the import URI.
	 */
	@Check
	public void checkImportUri(Import importResource) {
		String uri = importResource.getImportURI();
		if (uri == null || uri.length() == 0) {
			error("Imported resource could not be found.",
					ClassmodelPackage.Literals.IMPORT__IMPORT_URI);
			return;
		}
	}

	@Override
	public void register(EValidatorRegistrar registrar) {
		super.register(registrar);
		ClassmodelPackage ePackage = ClassmodelPackage.eINSTANCE;
		try {
			URI oclURI = URI.createPlatformResourceURI(OCL_PATH, true);
			registrar.register(ePackage, new CompleteOCLEObjectValidator(
					ePackage, oclURI));
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}

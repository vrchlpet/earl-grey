package cz.cvut.earlgrey.classmodel.validation;

import org.eclipse.xtext.validation.Check;

import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Import;

public class ClassmodelJavaValidator extends AbstractClassmodelJavaValidator {

	/**
	 * Checks the import URI is not null or empty.
	 * 
	 * @param importResource
	 *            the import URI.
	 */
	@Check
	public void checkImportUri(Import importResource) {
		String uri = importResource.getImportURI();
		if (uri == null || uri.trim().length() < 1) {
			error("Imported resource couldn't be resolved",
					ClassmodelPackage.Literals.IMPORT__IMPORT_URI);
			return;
		}
	}

}

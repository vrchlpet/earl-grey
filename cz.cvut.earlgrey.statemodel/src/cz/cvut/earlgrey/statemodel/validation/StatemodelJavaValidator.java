package cz.cvut.earlgrey.statemodel.validation;

import org.eclipse.xtext.validation.Check;

import cz.cvut.earlgrey.statemodel.statemodel.Import;
import cz.cvut.earlgrey.statemodel.statemodel.StatemodelPackage;


public class StatemodelJavaValidator extends AbstractStatemodelJavaValidator {

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
					StatemodelPackage.Literals.IMPORT__IMPORT_URI);
			return;
		}
	}

}

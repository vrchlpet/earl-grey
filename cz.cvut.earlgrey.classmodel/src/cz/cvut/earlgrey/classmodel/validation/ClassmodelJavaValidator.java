package cz.cvut.earlgrey.classmodel.validation;

import org.eclipse.xtext.validation.Check;
import cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage;
import cz.cvut.earlgrey.classmodel.classmodel.Import;
import cz.cvut.earlgrey.classmodel.classmodel.Relation;

public class ClassmodelJavaValidator extends AbstractClassmodelJavaValidator {

	public static final String MSG_IMPORT_ERROR = "Imported resource could not be found.";
	public static final String MSG_CARDINALITY_SIMPLIFIED = "Used cardinality can be simplified.";
	public static final String DOTS_REGEX = "\\.\\.";
	public static final String INVALID_CARDINALITY = "INVALID_CARDINALITY";

	/**
	 * Checks if the import URI is not null or empty.
	 * 
	 * @param importResource the import URI.
	 */
	@Check
	public void checkImportUri(Import importResource) {
		String uri = importResource.getImportURI();
		if (uri == null || uri.length() == 0) {
			error(MSG_IMPORT_ERROR,
					ClassmodelPackage.Literals.IMPORT__IMPORT_URI);
			return;
		}
	}

	/**
	 * Checks if a cardinality can be simplified (i.e.: 5..5 -> 5)
	 * 
	 * @param relation Relation which contains a cardinality to be checked.
	 */
	@Check
	public void checkCardinality(Relation relation) {
		if (!validateCardinality(relation.getCardinalityFrom())) {
			warning(MSG_CARDINALITY_SIMPLIFIED,
					ClassmodelPackage.Literals.RELATION__CARDINALITY_FROM,
					INVALID_CARDINALITY, relation.getCardinalityFrom());
		}
		if (!validateCardinality(relation.getCardinalityTo())) {
			warning(MSG_CARDINALITY_SIMPLIFIED,
					ClassmodelPackage.Literals.RELATION__CARDINALITY_TO,
					INVALID_CARDINALITY, relation.getCardinalityTo());
		}
	}

	/**
	 * "Algorithm" to validate given cardinality as String.
	 * 
	 * @param from a cardinality as String
	 * @return true - if given cardinality can't be simplified (i.e.: 5..*)
	 */
	private boolean validateCardinality(String from) {
		boolean output = true;
		if (from != null) {
			String[] found = from.split(DOTS_REGEX);
			if (found.length > 1) {
				String prev = "";
				for (String string : found) {
					if (prev.equals(string)) {
						return false;
					}
					if (string != null) {
						prev = string;
					}
				}
			}
		}
		return output;
	}

}

/**
 * @(#)ImportUriGlobalScopeProvider.java
 */
package cz.cvut.earlgrey.classmodel.imports;

import java.util.LinkedHashSet;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import cz.cvut.earlgrey.xtext.scoping.ImportUriGlobalScope;

/**
 * Explicit import file containing Classmodel defaults.
 */
public class ImportUriGlobalScopeProvider extends ImportUriGlobalScope {

	public static final String DATA_TYPES = "/cz.cvut.earlgrey.classmodel/model/primitiveDataTypes.cm";

	@Override
	protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
		LinkedHashSet<URI> temp = super.getImportedUris(resource);
		temp.add(URI.createPlatformResourceURI(DATA_TYPES, true));
		return temp;
	}

}

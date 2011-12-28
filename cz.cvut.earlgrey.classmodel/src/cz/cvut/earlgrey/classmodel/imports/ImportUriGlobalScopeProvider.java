/**
 * @(#)ImportUriGlobalScopeProvider.java
 */
package cz.cvut.earlgrey.classmodel.imports;

import java.util.LinkedHashSet;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import cz.cvut.earlgrey.xtext.scoping.ImportUriGlobalScope;

/**
 * Explicit import file containing Classmodel defaults.
 */
public class ImportUriGlobalScopeProvider extends ImportUriGlobalScope {

	public static final String DATA_TYPES = "/cz.cvut.earlgrey.classmodel/model/primitiveDataTypes.cm";
	private static Logger log = Logger
			.getLogger(ImportUriGlobalScopeProvider.class);

	@Override
	protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
		LinkedHashSet<URI> temp = super.getImportedUris(resource);
		URI plugin = URI.createPlatformPluginURI(DATA_TYPES, true);
		if (!validURI(plugin)) {
			URI local = URI.createPlatformResourceURI(DATA_TYPES, true);
			if (validURI(local)) {
				System.out.println("lol?");
				temp.add(local);
			}
			return temp;
		}
		temp.add(plugin);
		return temp;
	}

	/**
	 * Validates given URI which contains primitiveDataTypes.cm.
	 * 
	 * @param uri
	 * @return
	 */
	private boolean validURI(URI uri) {
		ResourceSet set = new ResourceSetImpl();
		try {
			Resource resource = set.getResource(uri, true);
			if (resource == null) {
				return false;
			}
		} catch (Exception ex) {
			log.error("Could not load primitiveDataTypes with URI " + uri);
			return false;
		}
		return true;
	}

}

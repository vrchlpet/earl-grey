/**
 * @(#)ImportUriGlobalScopeProvider.java
 */
package cz.cvut.earlgrey.classmodel.imports;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;

import com.google.common.base.Predicate;

/**
 * Explicit import file containing Classmodel defaults.
 */
public class ImportUriGlobalScopeProvider extends
		org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider {

	@Override
	protected IScope createLazyResourceScope(IScope parent, URI uri,
			IResourceDescriptions descriptions, EClass type,
			Predicate<IEObjectDescription> filter, boolean ignoreCase) {
		try {
			return super.createLazyResourceScope(parent, uri, descriptions,
					type, filter, ignoreCase);
		} catch (Exception e) {
		}
		return IScope.NULLSCOPE;
	}

	// @Override
	// protected LinkedHashSet<URI> getImportedUris(final Resource resource) {
	// LinkedHashSet<URI> temp = super.getImportedUris(resource);
	// System.out.println(resource);
	// System.out
	// .println("resource exists: "
	// + (getClass().getClassLoader().getResource(
	// "dataType.cm") != null));
	//
	// temp.add(URI.createURI("dataType.cm"));
	// return temp;
	// }

}

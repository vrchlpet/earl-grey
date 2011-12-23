package cz.cvut.earlgrey.xtext.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import com.google.common.base.Predicate;

/**
 * Explicit import file containing Classmodel defaults.
 */
public class ImportUriGlobalScope extends ImportUriGlobalScopeProvider {

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
}

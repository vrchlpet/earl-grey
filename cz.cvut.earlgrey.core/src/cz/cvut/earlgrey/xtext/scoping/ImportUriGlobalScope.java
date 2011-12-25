package cz.cvut.earlgrey.xtext.scoping;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

import com.google.common.base.Predicate;

/**
 * This class fixes the bug which occurs when importing invalid file. For more
 * information see https://github.com/tea-pot/earl-grey/issues/3
 * 
 * Use this class in a XXXRuntimeModule as in following example:
 * 
 * <pre>
 * public class StatemodelRuntimeModule extends AbstractStatemodelRuntimeModule {
 * 	public Class&lt;? extends org.eclipse.xtext.scoping.IGlobalScopeProvider&gt; bindIGlobalScopeProvider() {
 * 		return ImportUriGlobalScope.class;
 * 	}
 * }
 * </pre>
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
			// log ?!
		}
		return IScope.NULLSCOPE;
	}
}

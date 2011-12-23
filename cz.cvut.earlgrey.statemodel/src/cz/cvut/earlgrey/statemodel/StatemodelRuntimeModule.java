package cz.cvut.earlgrey.statemodel;

import cz.cvut.earlgrey.xtext.scoping.ImportUriGlobalScope;

public class StatemodelRuntimeModule extends cz.cvut.earlgrey.statemodel.AbstractStatemodelRuntimeModule {

	@Override
	public Class<? extends org.eclipse.xtext.scoping.IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return ImportUriGlobalScope.class;
	}
}

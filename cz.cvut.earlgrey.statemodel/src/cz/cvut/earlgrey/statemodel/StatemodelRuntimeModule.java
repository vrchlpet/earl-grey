package cz.cvut.earlgrey.statemodel;

import org.eclipse.xtext.naming.IQualifiedNameProvider;

import cz.cvut.earlgrey.statemodel.naming.StatemodelNameProvider;

public class StatemodelRuntimeModule extends cz.cvut.earlgrey.statemodel.AbstractStatemodelRuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return StatemodelNameProvider.class;
	}

}

/*
 * generated by Xtext
 */
package cz.cvut.earlgrey.classmodel;

import org.eclipse.xtext.naming.IQualifiedNameProvider;

import cz.cvut.earlgrey.classmodel.naming.ClassmodelNameProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class ClassmodelRuntimeModule extends
		cz.cvut.earlgrey.classmodel.AbstractClassmodelRuntimeModule {

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return ClassmodelNameProvider.class;
	}
}

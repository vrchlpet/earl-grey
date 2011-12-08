package cz.cvut.earlgrey.classmodel.ui.labeling;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

import cz.cvut.earlgrey.classmodel.classmodel.Attribute;
import cz.cvut.earlgrey.classmodel.classmodel.Classmodel;
import cz.cvut.earlgrey.classmodel.classmodel.Entity;
import cz.cvut.earlgrey.classmodel.classmodel.EntityType;
import cz.cvut.earlgrey.classmodel.classmodel.Import;
import cz.cvut.earlgrey.classmodel.classmodel.Method;
import cz.cvut.earlgrey.classmodel.classmodel.Relation;
import cz.cvut.earlgrey.classmodel.classmodel.Visibility;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class ClassmodelLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public ClassmodelLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	/**
	 * Returns Relation's image used in Outline View.
	 * 
	 * @param ele
	 *            Instance of an Relation
	 * @return image's filename as String
	 */
	String image(Relation ele) {
		return "html_tag_obj.gif";
	}

	/**
	 * Returns Attribute's image used in Outline View.
	 * 
	 * @param ele
	 *            Instance of an Attribute
	 * @return image's filename as String
	 */
	String image(Method ele) {
		switch (ele.getModifier().getValue()) {
		case Visibility.PUBLIC_VALUE:
			return "methpub_obj.gif";
		case Visibility.PRIVATE_VALUE:
			return "methpri_obj.gif";
		case Visibility.PROTECTED_VALUE:
			return "methpro_obj.gif";
		}
		return "methdef_obj.gif";
	}

	/**
	 * Returns Attribute's image used in Outline View.
	 * 
	 * @param ele
	 *            Instance of an Attribute
	 * @return image's filename as String
	 */
	String image(Attribute ele) {
		switch (ele.getModifier().getValue()) {
		case Visibility.PUBLIC_VALUE:
			return "field_public_obj.gif";
		case Visibility.PRIVATE_VALUE:
			return "field_private_obj.gif";
		case Visibility.PROTECTED_VALUE:
			return "field_protected_obj.gif";
		}
		return "field_default_obj.gif";
	}

	/**
	 * Returns Import's image used in Outline View.
	 * 
	 * @param ele
	 *            Instance of an Import
	 * @return image's filename as String
	 */
	String image(Import ele) {
		return "impc_obj.gif";
	}

	/**
	 * Returns Package's image used in Outline View.
	 * 
	 * @param ele
	 *            Instance of a Package
	 * @return image's filename as String
	 */
	String image(cz.cvut.earlgrey.classmodel.classmodel.Package ele) {
		return "package_obj.gif";
	}

	/**
	 * Returns Classmodel's image used in Outline View.
	 * 
	 * @param ele
	 *            Instance of a Classmodel
	 * @return image's filename as String
	 */
	String image(Classmodel ele) {
		return "model_obj.gif";
	}

	/**
	 * Returns Entity's image used in Outline View.
	 * 
	 * @param ele
	 *            Instance of an Entity
	 * @return image's filename as String
	 */
	String image(Entity ele) {
		switch (ele.getType().getValue()) {
		case EntityType.INTERFACE_VALUE:
			return "int_obj.gif";
		case EntityType.ENUM_VALUE:
			return "enum_obj.gif";
		}
		return "class_obj.gif";
	}
}

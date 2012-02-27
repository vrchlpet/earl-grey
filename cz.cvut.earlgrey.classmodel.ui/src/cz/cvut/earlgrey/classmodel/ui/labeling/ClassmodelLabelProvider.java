package cz.cvut.earlgrey.classmodel.ui.labeling;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import com.google.inject.Inject;
import cz.cvut.earlgrey.classmodel.classmodel.Attribute;
import cz.cvut.earlgrey.classmodel.classmodel.Classifier;
import cz.cvut.earlgrey.classmodel.classmodel.Enumeration;
import cz.cvut.earlgrey.classmodel.classmodel.Feature;
import cz.cvut.earlgrey.classmodel.classmodel.Import;
import cz.cvut.earlgrey.classmodel.classmodel.Interface;
import cz.cvut.earlgrey.classmodel.classmodel.Model;
import cz.cvut.earlgrey.classmodel.classmodel.Operation;
import cz.cvut.earlgrey.classmodel.classmodel.Relationship;
import cz.cvut.earlgrey.classmodel.classmodel.RelationshipType;
import cz.cvut.earlgrey.classmodel.classmodel.Visibility;

/**
 * Provides labels for a EObjects.
 * 
 * see
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#labelProvider
 */
public class ClassmodelLabelProvider extends DefaultEObjectLabelProvider {

	private static final String IMPORT = "impc_obj.gif";
	private static final String CLASS = "class_obj.gif";
	private static final String INTERFACE = "int_obj.gif";
	private static final String ENUM = "enum_obj.gif";
	private static final String CLASSMODEL = "model_obj.gif";
	private static final String PACKAGE = "package_obj.gif";
	private static final String METHOD_PREFIX = "method_";
	private static final String ATTRIBUTE_PREFIX = "field_";
	private static Map<RelationshipType, String> relation = new HashMap<RelationshipType, String>();
	private static Map<Visibility, String> visibility = new HashMap<Visibility, String>();
	static {
		relation.put(RelationshipType.AGGREGATION, "Aggregation.gif");
		relation.put(RelationshipType.ASSOCIATION, "Association.gif");
		relation.put(RelationshipType.COMPOSITION, "Composition.gif");
		relation.put(RelationshipType.DEPENCY, "Dependency.gif");
		relation.put(RelationshipType.GENERALIZATION, "Generalization.gif");
		relation.put(RelationshipType.REALIZATION, "Realization.gif");

		visibility.put(Visibility.PUBLIC, "public_obj.gif");
		visibility.put(Visibility.PRIVATE, "private_obj.gif");
		visibility.put(Visibility.PROTECTED, "protected_obj.gif");
	}

	@Inject
	public ClassmodelLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	/**
	 * Returns Relation's image used in Outline View.
	 * 
	 * @param ele Instance of an Relation
	 * @return image's filename as String
	 */
	String image(Relationship ele) {
		if (ele != null) {
			return relation.get(ele.getType());
		}
		return relation.get(RelationshipType.ASSOCIATION);
	}

	/**
	 * Returns Operation's image used in Outline View.
	 * 
	 * @param ele Instance of an Operation
	 * @return image's filename as String
	 */
	String image(Operation ele) {
		return getVisibility(ele, METHOD_PREFIX);
	}

	/**
	 * Returns Attribute's image used in Outline View.
	 * 
	 * @param ele Instance of an Attribute
	 * @return image's filename as String
	 */
	String image(Attribute ele) {
		return getVisibility(ele, ATTRIBUTE_PREFIX);
	}

	/**
	 * Gets Feature's image.
	 * 
	 * @param ele Instance of an Feature
	 * @param prefix Image prefix ("field_")
	 * @return String
	 */
	private String getVisibility(Feature ele, String prefix) {
		if (ele != null) {
			return prefix + visibility.get(ele.getVisibility());
		}
		return prefix + visibility.get(Visibility.PUBLIC);
	}

	/**
	 * Returns Import's image used in Outline View.
	 * 
	 * @param ele Instance of an Import
	 * @return image's filename as String
	 */
	String image(Import ele) {
		return IMPORT;
	}

	/**
	 * Returns Package's image used in Outline View.
	 * 
	 * @param ele Instance of a Package
	 * @return image's filename as String
	 */
	String image(cz.cvut.earlgrey.classmodel.classmodel.Package ele) {
		return PACKAGE;
	}

	/**
	 * Returns Classmodel's image used in Outline View.
	 * 
	 * @param ele Instance of a Classmodel
	 * @return image's filename as String
	 */
	String image(Model ele) {
		return CLASSMODEL;
	}

	/**
	 * Returns Enumeration's image used in Outline View.
	 * 
	 * @param ele Instance of an Enumeration
	 * @return image's filename
	 */
	String image(Enumeration ele) {
		return ENUM;
	}

	/**
	 * Returns Classifier's image used in Outline View.
	 * 
	 * @param ele Instance of an Classifier
	 * @return image's filename
	 */
	String image(Classifier ele) {
		return CLASS;
	}

	/**
	 * Returns Interface's image used in Outline View.
	 * 
	 * @param ele Instance of an Interface
	 * @return image's filename
	 */
	String image(Interface ele) {
		return INTERFACE;
	}
}

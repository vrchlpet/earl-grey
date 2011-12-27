package cz.cvut.earlgrey.classmodel.ui.outline;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import cz.cvut.earlgrey.classmodel.classmodel.Array;
import cz.cvut.earlgrey.classmodel.classmodel.Attribute;
import cz.cvut.earlgrey.classmodel.classmodel.Entity;
import cz.cvut.earlgrey.classmodel.classmodel.Operation;
import cz.cvut.earlgrey.classmodel.classmodel.Parameter;
import cz.cvut.earlgrey.classmodel.classmodel.Reference;
import cz.cvut.earlgrey.classmodel.classmodel.Relation;
import cz.cvut.earlgrey.xtext.formatting.Styles;

/**
 * customization of the default outline structure
 * 
 */
public class ClassmodelOutlineTreeProvider extends DefaultOutlineTreeProvider {

	private static final String ARRAY_LEFT = "[";
	private static final String ARRAY_RIGHT = "]";
	private static final String COLON = " : ";
	private static final String COMMA = ", ";
	private static final String ROUND_BRACKET_RIGHT = ")";
	private static final String ROUND_BRACKET_LEFT = "(";
	private static final String EMPTY_STRING = " ";

	/**
	 * Defines Operation node in Outline View tree as a leaf.
	 * 
	 * @param method Instance
	 * @return true - to make Operation node as a leaf
	 */
	protected boolean _isLeaf(Operation method) {
		return true;
	}

	/**
	 * Defines Attribute node in Outline View tree as a leaf.
	 * 
	 * @param node Instance
	 * @return true - to make Attribute node as a leaf
	 */
	protected boolean _isLeaf(Attribute node) {
		return true;
	}

	/**
	 * Returns styled Attribute's label used in Outline View.
	 * 
	 * @param ele Instance of an Attribute
	 * @return label as StyledString
	 */
	public Object _text(Attribute ele) {
		return styleType(ele.getName(), ele.getType());
	}

	/**
	 * Returns styled Method's label used in Outline View.
	 * 
	 * @param ele Instance of a Method
	 * @return label as StyledString
	 */
	public Object _text(Operation ele) {
		StringBuffer out = new StringBuffer();
		String name = ele.getName();
		if (name == null) {
			return null;
		}
		out.append(ele.getName());
		out.append(ROUND_BRACKET_LEFT);

		int counter = 0;
		for (Parameter params : ele.getParameters()) {
			if (counter++ > 0) {
				out.append(COMMA + EMPTY_STRING);
			}
			out.append(traverseReference(params.getType()));
		}

		out.append(ROUND_BRACKET_RIGHT);
		return styleType(out.toString(), ele.getReturn());
	}

	/**
	 * Returns styled Relation's label used in Outline View.
	 * 
	 * @param ele Instance of a Relation
	 * @return label as StyledString
	 */
	public Object _text(Relation element) {
		if (element.getOrigin().getName() == null) {
			return null;
		}
		StyledString styled = new StyledString(element.getOrigin().getName()
				+ EMPTY_STRING);
		styled.append(Styles.getStyledString(element.getType().getLiteral()));
		Entity ret = element.getDestination();
		if (ret != null) {
			styled.append(EMPTY_STRING + ret.getName());
		}
		return styled;
	}

	/**
	 * Factory method used to create styled label with given prefix and postfix.
	 * Postfix value is colored as RGB(149, 125, 71).
	 * 
	 * @param prefix
	 * @param postfix Colored postfix
	 * @return colored label
	 */
	private StyledString styleType(String prefix, Reference postfix) {
		StyledString styled = new StyledString(prefix);
		if (postfix != null) {
			String post = traverseReference(postfix);
			styled.append(Styles.getStyledString(COLON + post));
		}
		return styled;
	}

	/**
	 * Traverses Reference object and saves its type name and its child's names
	 * as a String object.
	 * 
	 * @param ref Reference to traverse.
	 * @return Reference's type name as String
	 */
	private String traverseReference(Reference ref) {
		StringBuffer buffer = new StringBuffer();
		if (ref != null) {
			Entity type = ref.getType();
			if (type != null) {
				buffer.append(type.getName());
				for (Array array : ref.getArray()) {
					buffer.append(arrayAsString(array));
				}
			}
		}
		return buffer.toString();
	}

	/**
	 * Converts an '<em>Array</em>' to a '<em>String</em>'.
	 * 
	 * @param array Instance of an Array.
	 * @return Converted an Array as a String.
	 */
	private String arrayAsString(Array array) {
		String output = "";
		if (array != null) {
			output += ARRAY_LEFT;
			if (array.getSize() > 0) {
				output += Integer.toString(array.getSize());
			}
			output += ARRAY_RIGHT;
		}
		return output;
	}
}

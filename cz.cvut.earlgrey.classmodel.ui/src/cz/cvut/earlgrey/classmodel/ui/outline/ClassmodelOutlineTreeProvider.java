package cz.cvut.earlgrey.classmodel.ui.outline;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;

import com.google.inject.Inject;

import cz.cvut.earlgrey.classmodel.classmodel.Attribute;
import cz.cvut.earlgrey.classmodel.classmodel.Entity;
import cz.cvut.earlgrey.classmodel.classmodel.Method;
import cz.cvut.earlgrey.classmodel.classmodel.Parameter;
import cz.cvut.earlgrey.classmodel.classmodel.Reference;
import cz.cvut.earlgrey.classmodel.classmodel.Relation;

/**
 * customization of the default outline structure
 * 
 */
public class ClassmodelOutlineTreeProvider extends DefaultOutlineTreeProvider {

	private static final String ARRAY = "[]";
	private static final int COLOR_B = 71;
	private static final int COLOR_G = 125;
	private static final int COLOR_R = 149;
	private static final String COLON = " : ";
	private static final String COMMA = ", ";
	private static final String ROUND_BRACKET_RIGHT = ")";
	private static final String ROUND_BRACKET_LEFT = "(";
	private static final String EMPTY_STRING = " ";
	@Inject
	private StylerFactory stylerFactory;

	/**
	 * Defines Method node in Outline View tree as a leaf.
	 * 
	 * @param method
	 *            Instance
	 * @return true - to make Method node as a leaf
	 */
	protected boolean _isLeaf(Method method) {
		return true;
	}

	/**
	 * Defines Attribute node in Outline View tree as a leaf.
	 * 
	 * @param node
	 *            Instance
	 * @return true - to make Attribute node as a leaf
	 */
	protected boolean _isLeaf(Attribute node) {
		return true;
	}

	/**
	 * Returns styled Attribute's label used in Outline View.
	 * 
	 * @param ele
	 *            Instance of an Attribute
	 * @return label as StyledString
	 */
	public Object _text(Attribute ele) {
		return styleType(ele.getName(), ele.getType());
	}

	/**
	 * Returns styled Method's label used in Outline View.
	 * 
	 * @param ele
	 *            Instance of a Method
	 * @return label as StyledString
	 */
	public Object _text(Method ele) {
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
	 * @param ele
	 *            Instance of a Relation
	 * @return label as StyledString
	 */
	public Object _text(Relation element) {
		if (element.getOrigin().getName() == null) {
			return null;
		}
		StyledString styled = new StyledString(element.getOrigin().getName()
				+ EMPTY_STRING);
		styled.append(new StyledString(element.getType().getLiteral(),
				stylerFactory.createXtextStyleAdapterStyler(getTypeTextStyle())));
		Entity ret = element.getDestination();
		if (ret != null) {
			styled.append(EMPTY_STRING + ret.getName());
		}
		return styled;
	}

	/**
	 * Creates TextStyle object with specified color.
	 * 
	 * @return
	 */
	private TextStyle getTypeTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(COLOR_R, COLOR_G, COLOR_B));
		return textStyle;
	}

	/**
	 * Factory method used to create styled label with given prefix and postfix.
	 * Postfix value is colored as RGB(149, 125, 71).
	 * 
	 * @param prefix
	 * @param postfix
	 *            Colored postfix
	 * @return colored label
	 */
	private StyledString styleType(String prefix, Reference postfix) {
		StyledString styled = new StyledString(prefix);
		if (postfix != null) {
			String post = traverseReference(postfix);
			styled.append(new StyledString(COLON + post, stylerFactory
					.createXtextStyleAdapterStyler(getTypeTextStyle())));
		}
		return styled;
	}

	/**
	 * Traverses Reference object and saves its type name and its child's names
	 * as String object.
	 * 
	 * @param ref
	 *            Reference to traverse.
	 * @return Reference's type name as String
	 */
	private String traverseReference(Reference ref) {
		StringBuffer buffer = new StringBuffer();
		if (ref != null) {
			Entity type = ref.getType();
			if (type != null) {
				buffer.append(type.getName());
				for (int i = 0; i < ref.getDimension().size(); ++i) {
					buffer.append(ARRAY);
				}
			}
		}
		return buffer.toString();
	}
}

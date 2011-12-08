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
import cz.cvut.earlgrey.classmodel.classmodel.Relation;

/**
 * customization of the default outline structure
 * 
 */
public class ClassmodelOutlineTreeProvider extends DefaultOutlineTreeProvider {

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
		String out = ele.getName();
		out += "(";
		int count = 0;
		for (Parameter params : ele.getParameters()) {
			if (count > 0) {
				out += ", ";
			}
			out += params.getType().getName();
			++count;
		}
		out += ")";
		return styleType(out, ele.getReturn());
	}

	/**
	 * Returns styled Relation's label used in Outline View.
	 * 
	 * @param ele
	 *            Instance of a Relation
	 * @return label as StyledString
	 */
	public Object _text(Relation element) {
		StyledString styled = new StyledString(element.getOrigin().getName()
				+ " ");
		styled.append(new StyledString(element.getType().getLiteral(),
				stylerFactory.createXtextStyleAdapterStyler(getTypeTextStyle())));
		Entity ret = element.getDestination();
		if (ret != null) {
			styled.append(" " + ret.getName());
		}
		return styled;
	}

	private TextStyle getTypeTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(149, 125, 71));
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
	private StyledString styleType(String prefix, Entity postfix) {
		StyledString styled = new StyledString(prefix);
		if (postfix != null) {
			styled.append(new StyledString(" : " + postfix.getName(),
					stylerFactory
							.createXtextStyleAdapterStyler(getTypeTextStyle())));
		}
		return styled;
	}
}

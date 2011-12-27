package cz.cvut.earlgrey.xtext.formatting;

import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;

public class Styles {

	public static final int COLOR_B = 71;
	public static final int COLOR_G = 125;
	public static final int COLOR_R = 149;
	private static StylerFactory stylerFactory = new StylerFactory();

	/**
	 * Creates default TextStyle object with color RGB(71, 125, 149).
	 * 
	 * @return styled TextStyle object
	 */
	public static TextStyle getTypeTextStyle() {
		return getTypeTextStyle(COLOR_R, COLOR_G, COLOR_B);
	}

	/**
	 * Creates TextStyle object with specified color.
	 * 
	 * @param red value of red color (0-255)
	 * @param green value of green color (0-255)
	 * @param blue value of blue color (0-255)
	 * @return styled TextStyle object
	 */
	public static TextStyle getTypeTextStyle(int red, int green, int blue) {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(red, green, blue));
		return textStyle;
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static StyledString getStyledString(String str) {
		return getStyledString(str, getTypeTextStyle());
	}

	/**
	 * 
	 * @param str
	 * @param style
	 * @return
	 */
	public static StyledString getStyledString(String str, TextStyle style) {
		return new StyledString(str,
				stylerFactory.createXtextStyleAdapterStyler(style));
	}
}

package cz.cvut.earlgrey.classmodel.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Use this class to register components to be used within the IDE.
 * 
 * Highligths recognized a token.
 */
public class HighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String VISIBILITY_ID = "visibility";
	public final static String CROSSREFERENCE_ID = "crossref";
	public static final String CONSTRAINT_ID = "constraint";
	public static final String ANNOTATION_ID = "annotation";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(VISIBILITY_ID, "Visibility",
				visibilityTextStyle());
		acceptor.acceptDefaultHighlighting(CROSSREFERENCE_ID, "Reference",
				crossReferenceTextStyle());
		acceptor.acceptDefaultHighlighting(CONSTRAINT_ID, "Constraint",
				constraintTextStyle());
		acceptor.acceptDefaultHighlighting(ANNOTATION_ID, "Annotation",
				annotationTextStyle());
	}

	public TextStyle visibilityTextStyle() {
		return createTextStyle(255, 0, 255);
	}

	public TextStyle crossReferenceTextStyle() {
		TextStyle textStyle = createTextStyle(127, 0, 85);
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	public TextStyle constraintTextStyle() {
		return createTextStyle(192, 192, 192);
	}

	public TextStyle annotationTextStyle() {
		return createTextStyle(100, 100, 100);
	}

	private TextStyle createTextStyle(int red, int green, int blue) {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(red, green, blue));
		return textStyle;
	}
}

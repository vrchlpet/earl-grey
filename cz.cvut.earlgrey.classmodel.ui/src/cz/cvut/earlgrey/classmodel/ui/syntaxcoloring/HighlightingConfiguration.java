package cz.cvut.earlgrey.classmodel.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Use this class to register components to be used within the IDE.
 */
public class HighlightingConfiguration extends DefaultHighlightingConfiguration {

	public static final String VISIBILITY_ID = "visibility";
	public final static String CROSSREFERENCE_ID = "crossref";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(VISIBILITY_ID, "Visibility",
				visibilityTextStyle());
		acceptor.acceptDefaultHighlighting(CROSSREFERENCE_ID, "Reference",
				crossReferenceTextStyle());
	}

	public TextStyle visibilityTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(255, 0, 255));
		return textStyle;
	}

	public TextStyle crossReferenceTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setStyle(SWT.BOLD);
		textStyle.setColor(new RGB(127, 0, 85));
		return textStyle;
	}
}

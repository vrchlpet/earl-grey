package cz.cvut.earlgrey.classmodel.ui.syntaxcoloring;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import cz.cvut.earlgrey.annotation.annotation.Annotation;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SemanticHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null || resource.getParseResult() == null) {
			return;
		}

		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			if (node.getSemanticElement() instanceof Annotation) {
				acceptor.addPosition(node.getOffset(), node.getLength(),
						HighlightingConfiguration.ANNOTATION_ID);
			}
		}
	}
}

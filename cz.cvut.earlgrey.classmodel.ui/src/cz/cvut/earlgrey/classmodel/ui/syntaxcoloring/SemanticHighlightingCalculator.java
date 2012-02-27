package cz.cvut.earlgrey.classmodel.ui.syntaxcoloring;

import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

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

		// Iterator<EObject> iter = EcoreUtil2.getAllContents(resource, true);
		// while (iter.hasNext()) {
		// EObject current = iter.next();
		// if (current instanceof Annotation) {
		// highlightFirstFeature(current,
		// AnnotationPackage.Literals.ANNOTATION,
		// HighlightingConfiguration.ANNOTATION_ID, acceptor);
		// }
		// }

		INode root = resource.getParseResult().getRootNode();
		for (INode node : root.getAsTreeIterable()) {
			if (node.getGrammarElement() instanceof CrossReference) {
				acceptor.addPosition(node.getOffset(), node.getLength(),
						HighlightingConfiguration.CROSSREFERENCE_ID);
			}
		}
	}

	// // helper method that takes care of highlighting the first feature
	// element
	// // of a semantic object using a given text style ID
	// private void highlightFirstFeature(EObject semobject, String featurename,
	// String highlightID, IHighlightedPositionAcceptor acceptor) {
	// // fetch the parse node for the entity
	// ILeafNode nodetohighlight = getFirstFeatureNode(semobject, featurename);
	// if (nodetohighlight != null) {
	// acceptor.addPosition(nodetohighlight.getOffset(),
	// nodetohighlight.getLength(), highlightID);
	// }
	// }
	//
	// /**
	// * Taken from {@link http://blogs.itemis.de/stundzig/archives/467}.
	// *
	// * Adapted from Sebastian Zarnekow's semantic highlighting implementation
	// * navigate to the parse node corresponding to the semantic object and
	// fetch
	// * the leaf node that corresponds to the first feature with the given
	// name.
	// *
	// * @param semantic
	// * @param feature
	// * @return
	// */
	// public ILeafNode getFirstFeatureNode(EObject semantic, String feature) {
	// ICompositeNode node = NodeModelUtils.getNode(semantic);
	// if (node != null) {
	// if (feature == null) {
	// return null;
	// }
	// for (INode child : node.getChildren()) {
	// if (child instanceof ILeafNode) {
	// System.out.println(((ILeafNode) child).getText()
	// + "         " + feature);
	// if (feature.equals(((ILeafNode) child).getText())) {
	// return (ILeafNode) child;
	// }
	// }
	// }
	// }
	// return null;
	// }

}

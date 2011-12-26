package cz.cvut.earlgrey.classmodel.ui.quickfix;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import cz.cvut.earlgrey.classmodel.validation.ClassmodelJavaValidator;

/**
 * Quickfixes for a given issue.
 */
public class ClassmodelQuickfixProvider extends DefaultQuickfixProvider {

	private static final String IMAGE_UPCASE = "upcase.png";
	private static final String SIMPLIFY_CARDINALITY_LONG = "Simplify the cardinality";
	private static final String MSG_SIMPLIFY_CARDINALITY = "Simplify cardinality";
	private static final String DOTS = "..";

	/**
	 * Quickfix: Simplifies a cardinality.
	 * 
	 * @param issue
	 * @param acceptor
	 */
	@Fix(ClassmodelJavaValidator.INVALID_CARDINALITY)
	public void simplifyCardinality(final Issue issue,
			IssueResolutionAcceptor acceptor) {
		final String data = readCardinality(issue);
		if (data != null) {
			acceptor.accept(issue, MSG_SIMPLIFY_CARDINALITY,
					SIMPLIFY_CARDINALITY_LONG, IMAGE_UPCASE,
					new IModification() {
				@Override
				public void apply(IModificationContext context)
						throws BadLocationException {
					IXtextDocument xtextDocument = context
							.getXtextDocument();
					String simplif = simplifyCardinality(data);
					if (simplif != null) {
						xtextDocument.replace(issue.getOffset(),
								data.length(), simplif);
					}
				}
			});
		}
	}

	/**
	 * Simplifies the cardinality.
	 * 
	 * @param card the Cardinality to be simplified.
	 * @return null or simplified cardinality.
	 */
	private String simplifyCardinality(String card) {
		if (card != null) {
			int index = card.indexOf(DOTS);
			if (index > 0) {
				return card.substring(0, index);
			}
		}
		return null;
	}

	/**
	 * Reads the cardinality from Issue and returns null if something goes wrong
	 * or returns String containing a cardinality.
	 * 
	 * @param issue Instance of Issue from which a cardinality should be read.
	 * @return null / cardinality as String
	 */
	private String readCardinality(Issue issue) {
		String out = null;
		if (issue != null) {
			String[] data = issue.getData();

			if (data != null && data.length > 0) {
				String card = data[0];
				int index = card.indexOf(DOTS);
				if (index > 0) {
					out = card;
				}
			}
		}
		return out;
	}

}

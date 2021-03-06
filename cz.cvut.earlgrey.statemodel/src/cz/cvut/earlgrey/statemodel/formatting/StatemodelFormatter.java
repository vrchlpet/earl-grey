/*
 * generated by Xtext
 */
package cz.cvut.earlgrey.statemodel.formatting;

import org.eclipse.xtext.formatting.impl.FormattingConfig;
import cz.cvut.earlgrey.statemodel.services.StatemodelGrammarAccess;
import cz.cvut.earlgrey.statemodel.services.StatemodelGrammarAccess.StateElements;
import cz.cvut.earlgrey.xtext.formatting.AbstractDefaultFormatter;

/**
 * This class contains custom formatting description.
 */
public class StatemodelFormatter extends AbstractDefaultFormatter {

	private static final String END = "end";

	@Override
	protected void configureFormatting(FormattingConfig c) {
		StatemodelGrammarAccess f = (StatemodelGrammarAccess) getGrammarAccess();

		initDefault(c, f); // loads default format config

		formatElement(c, f);
		formatState(c, f.getStateAccess());
		setIndentAndWrapKeywords(f, c, "statemachine", END);
		formatComment(c, f);
	}

	/**
	 * Formats comment rule.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of the StatemodelGrammarAccess.
	 */
	private void formatComment(FormattingConfig c, StatemodelGrammarAccess f) {
		setLineWrap(c, f.getSL_COMMENTRule(), Style.BEFORE, 0, 1, 2);
		setLineWrap(c, f.getML_COMMENTRule(), Style.BEFORE, 0, 1, 2);
		setLineWrap(c, f.getML_COMMENTRule(), Style.AFTER, 0, 1, 1);
	}

	/**
	 * 
	 * @param c
	 * @param ele
	 */
	private void formatState(FormattingConfig c, StateElements ele) {
		setLineWrapBig(c, ele.getTypeAssignment_1(), Style.BEFORE);// state type
		setLineWrap(c, ele.getTypeAssignment_1(), Style.AFTER); // state type

		setNoLineWrap(c, ele.getNameAssignment_2(), Style.BEFORE); // name
		setLineWrap(c, ele.getNameAssignment_2(), Style.AFTER); // name

		c.setIndentation(ele.getTypeAssignment_1(), ele.getEndKeyword_4()); // stateType
		// ...
		// end
	}

	/**
	 * Formats subclass of an Element.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of the ClassmodelGrammarAccess.
	 */
	private void formatElement(FormattingConfig c, StatemodelGrammarAccess f) {
		setLineWrapBig(c, f.getImportRule(), Style.AFTER);
		setLineWrapBig(c, f.getElementRule(), Style.AROUND);

		setLineWrapSmall(c, f.getActivityRule(), Style.AROUND);
		setLineWrapSmall(c, f.getAnnotationRule(), Style.AROUND);
	}
}

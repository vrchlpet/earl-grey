package cz.cvut.earlgrey.classmodel.formatting;

import org.eclipse.xtext.formatting.impl.FormattingConfig;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess.RelationshipElements;
import cz.cvut.earlgrey.xtext.formatting.AbstractDefaultFormatter;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class ClassmodelFormatter extends AbstractDefaultFormatter {

	private static final String END = "end";
	private static final String ENUM = "enum";
	private static final String PACKAGE = "package";
	private static final String CLASS = "class";

	@Override
	protected void configureFormatting(FormattingConfig c) {
		ClassmodelGrammarAccess f = (ClassmodelGrammarAccess) getGrammarAccess();
		initDefault(c, f); // loads default format config

		formatElement(c, f);
		formatPairs(c, f);
		formatComment(c, f);
	}

	/**
	 * Formats pairs: CLASS-END, PACKAGE-END, ENUM-END, relation-END.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of the ClassmodelGrammarAccess.
	 */
	private void formatPairs(FormattingConfig c, ClassmodelGrammarAccess f) {
		setIndentAndWrapKeywords(f, c, CLASS, END);
		setIndentAndWrapKeywords(f, c, PACKAGE, END);
		setIndentAndWrapKeywords(f, c, ENUM, END);

		formatRelationship(c, f.getRelationshipAccess());
	}

	/**
	 * Formats comment rule.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of the ClassmodelGrammarAccess.
	 */
	private void formatComment(FormattingConfig c, ClassmodelGrammarAccess f) {
		setLineWrap(c, f.getSL_COMMENTRule(), Style.BEFORE, 0, 1, 2);
		setLineWrap(c, f.getML_COMMENTRule(), Style.BEFORE, 0, 1, 2);
		setLineWrap(c, f.getML_COMMENTRule(), Style.AFTER, 0, 1, 1);
	}

	/**
	 * Formats subclass of an Element.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of the ClassmodelGrammarAccess.
	 */
	private void formatElement(FormattingConfig c, ClassmodelGrammarAccess f) {
		setLineWrapBig(c, f.getImportRule(), Style.AFTER);
		setLineWrapBig(c, f.getPackageRule(), Style.AROUND);
		setLineWrapBig(c, f.getElementRule(), Style.AROUND);
		setLineWrapBig(c, f.getDatatypeRule(), Style.AFTER);
		setLineWrapBig(c, f.getRelationshipRule(), Style.AFTER);

		setLineWrapSmall(c, f.getFeatureRule(), Style.AROUND);
		setLineWrapSmall(c, f.getEnumeratorRule(), Style.AROUND);
		setLineWrapSmall(c, f.getAnnotationRule(), Style.AROUND);

		setNoSpace(c, f.getVisibilityRule(), Style.AFTER);
	}

	/**
	 * Formats relationship rule.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of RelationshipElement access rule.
	 */
	private void formatRelationship(FormattingConfig c, RelationshipElements rel) {
		setLineWrapBig(c, rel.getTypeAssignment_1(), Style.BEFORE);// type=RelationshipType
		setLineWrap(c, rel.getTypeAssignment_1(), Style.AFTER); // type=RelationshipType
		setNoLineWrap(c, rel.getLabelCompositeIDParserRuleCall_2_0(),
				Style.BEFORE); // label=CompositeID
		setLineWrap(c, rel.getLabelCompositeIDParserRuleCall_2_0(), Style.AFTER);
		c.setIndentation(rel.getTypeAssignment_1(), rel.getEndKeyword_15());
		setLineWrap(c, rel.getRightSquareBracketKeyword_8(), Style.AFTER); // ]
		setLineWrap(c, rel.getRightSquareBracketKeyword_14(), Style.AFTER); // ]
	}
}

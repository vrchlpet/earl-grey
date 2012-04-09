package cz.cvut.earlgrey.classmodel.formatting;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess.AggregationElements;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess.AssociationElements;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess.CompositionElements;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess.DependencyElements;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess.GeneralizationElements;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess.RealizationElements;
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

		formatAssociation(c, f.getAssociationAccess());
		formatAggregation(c, f.getAggregationAccess());
		formatComposition(c, f.getCompositionAccess());
		formatGeneralization(c, f.getGeneralizationAccess());
		formatDependency(c, f.getDependencyAccess());
		formatRealization(c, f.getRealizationAccess());
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

	}

	/**
	 * Formats generalization relationship.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param r An instance of the GeneralizationElements.
	 */
	private void formatGeneralization(FormattingConfig c,
			GeneralizationElements r) {
		formatRelationship(c, r.getGeneralizationKeyword_1(),
				r.getLabelAssignment_2(), r.getEndKeyword_5(),
				r.getHeadAssignment_3(), r.getTailAssignment_4());
	}

	/**
	 * Formats dependency relationship.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param r An instance of the GeneralizationElements.
	 */
	private void formatDependency(FormattingConfig c, DependencyElements r) {
		formatRelationship(c, r.getDependencyKeyword_1(),
				r.getLabelAssignment_2(), r.getEndKeyword_5(),
				r.getHeadAssignment_3(), r.getTailAssignment_4());
	}

	/**
	 * Formats realization relationship.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param r An instance of the GeneralizationElements.
	 */
	private void formatRealization(FormattingConfig c, RealizationElements r) {
		formatRelationship(c, r.getRealizationKeyword_1(),
				r.getLabelAssignment_2(), r.getEndKeyword_5(),
				r.getHeadAssignment_3(), r.getTailAssignment_4());
	}

	/**
	 * Formats association relationship.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param r An instance of the GeneralizationElements.
	 */
	private void formatAssociation(FormattingConfig c, AssociationElements r) {
		formatRelationship(c, r.getAssociationKeyword_1(),
				r.getLabelAssignment_2(), r.getEndKeyword_15(),
				r.getRightSquareBracketKeyword_14(),
				r.getRightSquareBracketKeyword_8());
	}

	/**
	 * Formats composition relationship.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param r An instance of the GeneralizationElements.
	 */
	private void formatComposition(FormattingConfig c, CompositionElements r) {
		formatRelationship(c, r.getCompositionKeyword_1(),
				r.getLabelAssignment_2(), r.getEndKeyword_15(),
				r.getRightSquareBracketKeyword_14(),
				r.getRightSquareBracketKeyword_8());
	}

	/**
	 * Formats aggregation relationship.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param r An instance of the GeneralizationElements.
	 */
	private void formatAggregation(FormattingConfig c, AggregationElements r) {
		formatRelationship(c, r.getAggregationKeyword_1(),
				r.getLabelAssignment_2(), r.getEndKeyword_15(),
				r.getRightSquareBracketKeyword_14(),
				r.getRightSquareBracketKeyword_8());
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
	 * @param relation Relationship assigment 'composition'
	 * @param label Relationship labeling, 'composition "name"'
	 * @param end Name of the 'end' element.
	 * @param bracket
	 * @param bracket2
	 */
	private void formatRelationship(FormattingConfig c,
			AbstractElement relation, AbstractElement label,
			AbstractElement end, AbstractElement bracket,
			AbstractElement bracket2) {
		setLineWrapBig(c, relation, Style.BEFORE);// relationshipType
		setLineWrap(c, relation, Style.AFTER); // relationshipType

		setNoLineWrap(c, label, Style.BEFORE); // label=CompositeID
		setLineWrap(c, label, Style.AFTER); // label=CompositeID

		c.setIndentation(relation, end); // relationshipType ... end
		setLineWrap(c, bracket, Style.AFTER); // ]
		setLineWrap(c, bracket2, Style.AFTER); // ]
	}
}

package cz.cvut.earlgrey.classmodel.formatting;

import java.util.List;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess.RelationshipElements;
import cz.cvut.earlgrey.xtext.formatting.AbstractDefaultFormatter;

/**
 * FIXME: doesnt work properly.
 * 
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

		c.setLinewrap(1, 2, 3).after(f.getImportRule());
		c.setLinewrap(1, 2, 3).around(f.getPackageRule());
		c.setLinewrap(1, 2, 3).around(f.getElementRule());
		c.setLinewrap(1, 1, 2).around(f.getFeatureRule());
		c.setLinewrap(1, 1, 2).around(f.getEnumeratorRule());
		c.setLinewrap(1, 2, 3).after(f.getDatatypeRule());
		c.setLinewrap(1, 2, 3).after(f.getRelationshipRule());
		c.setNoSpace().after(f.getVisibilityRule());

		initDefault(c, f); // loads default format config

		// TODO: refactor
		setIndent(f, c, CLASS, END);
		setIndent(f, c, PACKAGE, END);
		setIndent(f, c, ENUM, END);

		formatRelationship(c, f.getRelationshipAccess());

		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());

		for (Keyword dot : f.findKeywords("..")) {
			c.setNoSpace().around(dot);
		}
	}

	/**
	 * Formats relationship rule.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param f An instance of RelationshipElement access rule.
	 */
	private void formatRelationship(FormattingConfig c, RelationshipElements rel) {
		c.setLinewrap().after(rel.getTypeAssignment_1()); // type=RelationshipType
		c.setNoLinewrap().before(rel.getLabelCompositeIDParserRuleCall_2_0()); // label=CompositeID
		c.setLinewrap().after(rel.getLabelCompositeIDParserRuleCall_2_0());
		c.setIndentation(rel.getTypeAssignment_1(), rel.getEndKeyword_15());
		c.setLinewrap().after(rel.getRightSquareBracketKeyword_8()); // ]
		c.setLinewrap().after(rel.getRightSquareBracketKeyword_14()); // ]
	}

	/**
	 * Sets an idention between the "start" and the "end" element given by
	 * string name.
	 * 
	 * @param f An instance of ClassmodelGrammarAccess.
	 * @param c An instance of the FormattingConfig.
	 * @param start String name of the start element.
	 * @param end String name of the end element.
	 */
	private void setIndent(ClassmodelGrammarAccess f, FormattingConfig c,
			String start, String end) {
		List<Pair<Keyword, Keyword>> pairs = f.findKeywordPairs(start, end);
		for (Pair<Keyword, Keyword> pair : pairs) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			c.setLinewrap().after(pair.getSecond());
		}
	}
}

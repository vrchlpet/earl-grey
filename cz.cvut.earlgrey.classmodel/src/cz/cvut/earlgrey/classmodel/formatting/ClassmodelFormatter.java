package cz.cvut.earlgrey.classmodel.formatting;

import java.util.List;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class ClassmodelFormatter extends AbstractDeclarativeFormatter {

	@Override
	protected void configureFormatting(FormattingConfig c) {
		ClassmodelGrammarAccess f = (ClassmodelGrammarAccess) getGrammarAccess();

		c.setAutoLinewrap(120);

		c.setLinewrap(1, 2, 3).after(f.getPackageRule());
		c.setLinewrap(1, 2, 3).after(f.getImportRule());
		c.setLinewrap(1, 2, 3).after(f.getEntityRule());
		c.setLinewrap(1, 2, 3).after(f.getRelationRule());
		c.setLinewrap(1, 1, 2).after(f.getAttributeRule());
		c.setLinewrap(1, 1, 2).after(f.getMethodRule());
		c.setNoSpace().after(f.getVisibilityRule());

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setNoSpace().around(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("<", ">")) {
			c.setNoSpace().around(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}

		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("[", "]")) {
			c.setNoSpace().around(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}

		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma);
		}

		List<Pair<Keyword, Keyword>> pairs = f.findKeywordPairs("{", "}");
		for (Pair<Keyword, Keyword> pair : pairs) {
			c.setLinewrap().after(pair.getFirst());
			c.setIndentation(pair.getFirst(), pair.getSecond());
		}

		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}

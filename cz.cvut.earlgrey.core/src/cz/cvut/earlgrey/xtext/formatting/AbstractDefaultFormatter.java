package cz.cvut.earlgrey.xtext.formatting;

import java.util.List;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.util.Pair;

/**
 * This class contains default formatting for EarlGrey language(s).
 * 
 * Each language should extends this class and then call initDefault method in
 * method configureFormatting.
 * 
 */
public abstract class AbstractDefaultFormatter extends
AbstractDeclarativeFormatter {

	@Override
	protected abstract void configureFormatting(FormattingConfig c);

	/**
	 * Inits default formatting configuration. It formats "() <> {} [] ,".
	 * 
	 * @param c
	 *            FormattingConfig instance
	 * @param f
	 *            AbstractGrammarElementFinder instance
	 */
	protected void initDefault(FormattingConfig c,
			AbstractGrammarElementFinder f) {
		if (c == null || f == null) {
			return;
		}

		c.setAutoLinewrap(120);

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
	}
}

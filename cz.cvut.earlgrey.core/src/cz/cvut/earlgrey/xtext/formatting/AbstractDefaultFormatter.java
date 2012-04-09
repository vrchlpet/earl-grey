package cz.cvut.earlgrey.xtext.formatting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfig.LinewrapLocator;
import org.eclipse.xtext.formatting.impl.FormattingConfig.NoSpaceLocator;
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

	public static final String CURLY_BRACKET_RIGHT = "}";
	public static final String CURLY_BRACKET_LEFT = "{";
	public static final String SQUARE_BRACKET_RIGHT = "]";
	public static final String SQUARE_BRACKET_LEFT = "[";
	public static final String GREATER_THAN = "<";
	public static final String LOWER_THAN = ">";
	public static final String ROUND_BRACKET_RIGHT = ")";
	public static final String ROUND_BRACKET_LEFT = "(";
	public static final String COMMA = ",";
	public static final String AT = "@";
	public static final String DOTS = "..";

	public static enum Style {
		BEFORE, AROUND, AFTER
	}

	/**
	 * Method called by Xtext to format a text.
	 * 
	 * @param c An instance of the FormattingConfig.
	 */
	@Override
	protected abstract void configureFormatting(FormattingConfig c);

	/**
	 * Inits default formatting configuration. It formats "() <> {} [] ,".
	 * 
	 * @param c FormattingConfig instance
	 * @param f AbstractGrammarElementFinder instance
	 */
	protected void initDefault(FormattingConfig c,
			AbstractGrammarElementFinder f) {
		if (c == null || f == null) {
			return;
		}
		c.setAutoLinewrap(120);

		setNoSpaceAroundKeywords(f, c, ROUND_BRACKET_LEFT, ROUND_BRACKET_RIGHT);
		setNoSpaceAroundKeywords(f, c, GREATER_THAN, LOWER_THAN);
		setNoSpaceAroundKeywords(f, c, SQUARE_BRACKET_LEFT,
				SQUARE_BRACKET_RIGHT);

		setNoSpace(f, c, COMMA, Style.BEFORE);
		setNoSpace(f, c, AT, Style.AFTER);
		setNoSpace(f, c, DOTS, Style.AROUND);
		setIndentAndWrapKeywords(f, c, CURLY_BRACKET_LEFT, CURLY_BRACKET_RIGHT);
	}

	/**
	 * Finds element by given string name and formats it with no space.
	 * 
	 * @param f An instance of the AbstractGrammarElementFinder.
	 * @param c An instance of the FormattingConfig.
	 * @param keyword String keyword to be formated.
	 * @param style Style of a formatting.
	 */
	protected void setNoSpace(AbstractGrammarElementFinder f,
			FormattingConfig c, String keyword, Style style) {
		for (Keyword key : f.findKeywords(keyword)) {
			setNoSpace(c, key, style);
		}
	}

	/**
	 * Formats given EObject with no space.
	 * 
	 * @param f An instance of the AbstractGrammarElementFinder.
	 * @param c An instance of the FormattingConfig.
	 * @param keyword String keyword to be formated.
	 * @param style Style of a formatting.
	 */
	protected void setNoSpace(FormattingConfig c, EObject key, Style style) {
		NoSpaceLocator nospace = c.setNoSpace();
		if (style == Style.AFTER) {
			nospace.after(key);
		} else if (style == Style.BEFORE) {
			nospace.before(key);
		} else {
			nospace.around(key);
		}
	}

	/**
	 * Sets no space around given keywords.
	 * 
	 * @param f An instance of the AbstractGrammarElementFinder.
	 * @param c An instance of the FormattingConfig.
	 * @param start Start keyword.
	 * @param end End keyword.
	 */
	protected void setNoSpaceAroundKeywords(AbstractGrammarElementFinder f,
			FormattingConfig c, String start, String end) {
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs(start, end)) {
			setNoSpace(c, pair.getFirst(), Style.AROUND);
			setNoSpace(c, pair.getSecond(), Style.BEFORE);
		}
	}

	/**
	 * Sets an idention between the "start" and the "end" element given by
	 * string name.
	 * 
	 * @param f An instance of AbstractGrammarElementFinder.
	 * @param c An instance of the FormattingConfig.
	 * @param start String name of the start element.
	 * @param end String name of the end element.
	 */
	protected void setIndentAndWrapKeywords(AbstractGrammarElementFinder f,
			FormattingConfig c, String start, String end) {
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs(start, end)) {
			c.setIndentation(pair.getFirst(), pair.getSecond());
			setLineWrapBig(c, pair.getSecond(), Style.AFTER);
		}
	}

	/**
	 * Linewraps an EObject by given values.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param key An instance of the EObject to be formatted.
	 * @param style Style of a formatting.
	 * @param minWraps Mininum value of wraps.
	 * @param defaultWraps Default value of wraps.
	 * @param maxWraps Maximum value of wraps.
	 */
	protected void setLineWrap(FormattingConfig c, EObject key, Style style,
			int minWraps, int defaultWraps, int maxWraps) {
		LinewrapLocator sett = c.setLinewrap(minWraps, defaultWraps, maxWraps);
		if (style == Style.AFTER) {
			sett.after(key);
		} else if (style == Style.BEFORE) {
			sett.before(key);
		} else {
			sett.around(key);
		}
	}

	/**
	 * Linewraps an EObject using big spaces (1 linewraps after an EObject, max.
	 * 3).
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param key An instance of the EObject to be formatted.
	 * @param style Style of a formatting.
	 */
	protected void setLineWrapBig(FormattingConfig c, EObject key, Style style) {
		setLineWrap(c, key, style, 1, 2, 2);
	}

	/**
	 * Linewraps an EObject using small spaces (1 linewraps after an EObject,
	 * max. 2).
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param key An instance of the EObject to be formatted.
	 * @param style Style of a formatting.
	 */
	protected void setLineWrapSmall(FormattingConfig c, EObject key, Style style) {
		setLineWrap(c, key, style, 1, 1, 2);
	}

	/**
	 * Linewraps an EObject using small spaces (1 linewraps after an EObject,
	 * max. 1).
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param key An instance of the EObject to be formatted.
	 * @param style Style of a formatting.
	 */
	protected void setLineWrap(FormattingConfig c, EObject key, Style style) {
		setLineWrap(c, key, style, 1, 1, 1);
	}

	/**
	 * Sets no linewrap on an EObject.
	 * 
	 * @param c An instance of the FormattingConfig.
	 * @param key An instance of the EObject to be formatted.
	 * @param style Style of a formatting.
	 */
	protected void setNoLineWrap(FormattingConfig c, EObject key, Style style) {
		setLineWrap(c, key, style, 0, 0, 0);
	}
}

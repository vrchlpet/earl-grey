package cz.cvut.earlgrey.classmodel.ui.syntaxcoloring;

import java.util.regex.Pattern;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 * 
 * Recognizes a token in a Tree and return its value.
 */
public class TokenToIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	private static final String SINGLE_COMMENT_TOKEN = "RULE_SL_COMMENT";
	private static final String MULTI_COMMENT_TOKEN = "RULE_ML_COMMENT";
	private static final String CONSTRAINT_TOKEN = "RULE_CONSTRAINT";
	private static final String INT_TOKEN = "RULE_INT";
	private static final String STRING_TOKEN = "RULE_STRING";
	private static final String PACKAGE_PRIVATE = "'~'";
	private static final String PROTECTED = "'#'";
	private static final String PRIVATE = "'-'";
	private static final String PUBLIC = "'+'";
	private static final String ANNOTATITION = "'@'";
	private static final Pattern QUOTED = Pattern.compile(
			"(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);

	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (PUNCTUATION.matcher(tokenName).matches()) {
			if (PUBLIC.equals(tokenName) || PRIVATE.equals(tokenName)
					|| PROTECTED.equals(tokenName)
					|| PACKAGE_PRIVATE.equals(tokenName)) {
				return HighlightingConfiguration.VISIBILITY_ID;
			}
			if (ANNOTATITION.equals(tokenName)) {
				return HighlightingConfiguration.ANNOTATION_ID;
			}
			return DefaultHighlightingConfiguration.PUNCTUATION_ID;
		}
		if (QUOTED.matcher(tokenName).matches()) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if (CONSTRAINT_TOKEN.equals(tokenName)) {
			return HighlightingConfiguration.CONSTRAINT_ID;
		}
		if (STRING_TOKEN.equals(tokenName)) {
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		if (INT_TOKEN.equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		if (MULTI_COMMENT_TOKEN.equals(tokenName)
				|| SINGLE_COMMENT_TOKEN.equals(tokenName)) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}
}

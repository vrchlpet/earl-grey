package cz.cvut.earlgrey.classmodel.ui.syntaxcoloring;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

/**
 * Use this class to register components to be used within the IDE.
 */
public class TokenToIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	private static final String PACKAGE_PRIVATE = "'~'";
	private static final String PROTECTED = "'#'";
	private static final String PRIVATE = "'-'";
	private static final String PUBLIC = "'+'";
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
			return DefaultHighlightingConfiguration.PUNCTUATION_ID;
		}
		if (QUOTED.matcher(tokenName).matches()) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if ("RULE_STRING".equals(tokenName)) {
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		if ("RULE_INT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		if ("RULE_ML_COMMENT".equals(tokenName)
				|| "RULE_SL_COMMENT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}
}

package cz.cvut.earlgrey.classmodel.formatting;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;
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

	@Override
	protected void configureFormatting(FormattingConfig c) {
		ClassmodelGrammarAccess f = (ClassmodelGrammarAccess) getGrammarAccess();

		// c.setLinewrap(1, 2, 3).after(f.getPackageRule());
		c.setLinewrap(1, 2, 3).around(f.getElementRule());
		c.setLinewrap(1, 1, 2).around(f.getFeatureRule());
		// c.setLinewrap(1, 1, 2).around(f.getEnumeratorRule());

		c.setNoSpace().after(f.getVisibilityRule());

		initDefault(c, f); // loads default format config

		for (Keyword keys : f.findKeywords("end")) {
			c.setLinewrap(1, 2, 3).after(keys);
		}

		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}

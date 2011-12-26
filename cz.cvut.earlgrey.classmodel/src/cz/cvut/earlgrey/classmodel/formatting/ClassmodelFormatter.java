package cz.cvut.earlgrey.classmodel.formatting;

import org.eclipse.xtext.formatting.impl.FormattingConfig;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;
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

	@Override
	protected void configureFormatting(FormattingConfig c) {
		ClassmodelGrammarAccess f = (ClassmodelGrammarAccess) getGrammarAccess();

		c.setLinewrap(1, 2, 3).after(f.getPackageRule());
		c.setLinewrap(1, 2, 3).after(f.getImportRule());
		c.setLinewrap(1, 2, 3).after(f.getClassRule());
		c.setLinewrap(1, 2, 3).after(f.getEnumRule());
		c.setLinewrap(1, 2, 3).after(f.getRelationRule());
		c.setLinewrap(1, 1, 2).after(f.getAttributeRule());
		c.setLinewrap(1, 1, 2).after(f.getOperationRule());
		c.setLinewrap(1, 1, 2).after(f.getEnumConstantRule());
		c.setNoSpace().after(f.getVisibilityRule());

		initDefault(c, f); // loads default format config

		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}
}

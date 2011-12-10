package cz.cvut.earlgrey.classmodel.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import cz.cvut.earlgrey.classmodel.ui.syntaxcoloring.HighlightingConfiguration;
import cz.cvut.earlgrey.classmodel.ui.syntaxcoloring.SemanticHighlightingCalculator;
import cz.cvut.earlgrey.classmodel.ui.syntaxcoloring.TokenToIdMapper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ClassmodelUiModule extends
		cz.cvut.earlgrey.classmodel.ui.AbstractClassmodelUiModule {
	public ClassmodelUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return SemanticHighlightingCalculator.class;
	}

	public Class<? extends IHighlightingConfiguration> bindISemanticHighlightingConfiguration() {
		return HighlightingConfiguration.class;
	}

	public Class<? extends DefaultAntlrTokenToAttributeIdMapper> bindDefaultAntlrTokenToAttributeIdMapper() {
		return TokenToIdMapper.class;
	}
}

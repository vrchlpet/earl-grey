package cz.cvut.earlgrey.statemodel.ui.wizards;

import cz.cvut.earlgrey.jface.wizard.DefaultNewWizard;

/**
 * This is a sample new wizard. Its role is to create a new file resource in the
 * provided container. If the container resource (a folder or a project) is
 * selected in the workspace when the wizard is opened, it will accept it as the
 * target container. The wizard creates one file with the extension "cm". If a
 * sample multi-page editor (also available as a template) is registered for the
 * same extension, it will be able to open it.
 */
public class NewWizard extends DefaultNewWizard {

	@Override
	public String extension() {
		return "stm";
	}

	@Override
	public String title() {
		return "State Model";
	}

	@Override
	public String pluginId() {
		return "cz.cvut.earlgrey.statemodel.ui";
	}
}
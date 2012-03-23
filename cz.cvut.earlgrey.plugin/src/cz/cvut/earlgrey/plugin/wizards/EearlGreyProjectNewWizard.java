package cz.cvut.earlgrey.plugin.wizards;

import java.net.URI;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import cz.cvut.earlgrey.plugin.project.ProjectSupport;

public class EearlGreyProjectNewWizard extends Wizard implements INewWizard {

	private static final String WIZARD_TITLE = "New Earl Grey Project"; //$NON-NLS-1$
	private static final String WIZARD_DESCRIPTION = "Create new Earl Grey Project"; //$NON-NLS-1$

	private WizardNewProjectCreationPage page1;

	public EearlGreyProjectNewWizard() {
		setWindowTitle(WIZARD_TITLE);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPages() {
		page1 = new WizardNewProjectCreationPage(WIZARD_TITLE);
		page1.setTitle(WIZARD_TITLE);
		page1.setDescription(WIZARD_DESCRIPTION);
		addPage(page1);
	}

	@Override
	public boolean performFinish() {
		String projectName = page1.getProjectName();
		URI location = null;
		if (!page1.useDefaults()) {
			location = page1.getLocationURI();
		}
		
		ProjectSupport.createProject(projectName, location);
		
		return true;
	}

}

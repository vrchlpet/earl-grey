package cz.cvut.earlgrey.plugin.project;

import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;

import cz.cvut.earlgrey.plugin.natures.ProjectNature;

public class ProjectSupport {

	public static IProject createProject(String name, URI location) {
		Assert.isNotNull(name);
		Assert.isTrue(name.trim().length() > 0);

		IProject project = createBaseProject(name, location);

		try {
			addNature(project);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		return project;
	}

	private static IProject createBaseProject(String name, URI location) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(name);

		if (!project.exists()) {
			IProjectDescription description = project.getWorkspace()
					.newProjectDescription(project.getName());
			if (location != null && root.getLocationURI().equals(location)) {
				location = null;
			}
			description.setLocationURI(location);

			try {
				project.create(description, null);
				if (!project.isOpen()) {
					project.open(null);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		return project;
	}

	private static void addNature(IProject project) throws CoreException {
		if (!project.hasNature(ProjectNature.NATURE_ID)) {
			IProjectDescription description = project.getDescription();

			String[] oldNatures = description.getNatureIds();
			String[] newNatures = new String[oldNatures.length + 1];

			System.arraycopy(oldNatures, 0, newNatures, 0, oldNatures.length);

			newNatures[oldNatures.length] = ProjectNature.NATURE_ID;

			description.setNatureIds(newNatures);
			project.setDescription(description, null);
		}
	}

}

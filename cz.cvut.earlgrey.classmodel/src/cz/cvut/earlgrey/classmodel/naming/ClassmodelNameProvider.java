package cz.cvut.earlgrey.classmodel.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.naming.SimpleNameProvider;

public class ClassmodelNameProvider extends SimpleNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		// if (obj instanceof Entity) {
		// Entity entity = ((Entity) obj);
		// EObject container = entity.eContainer();
		// if (container instanceof
		// cz.cvut.earlgrey.classmodel.classmodel.Package) {
		// cz.cvut.earlgrey.classmodel.classmodel.Package pckg =
		// (cz.cvut.earlgrey.classmodel.classmodel.Package) container;
		// return QualifiedName.create(pckg.getName(), entity.getName());
		// }
		// // return QualifiedName.create(((Image) obj).getFileName());
		// }
		return super.getFullyQualifiedName(obj);
	}
}

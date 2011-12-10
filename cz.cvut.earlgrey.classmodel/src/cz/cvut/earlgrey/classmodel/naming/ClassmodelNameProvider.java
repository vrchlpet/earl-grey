package cz.cvut.earlgrey.classmodel.naming;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class ClassmodelNameProvider extends
		DefaultDeclarativeQualifiedNameProvider {

	@Override
	public QualifiedName getFullyQualifiedName(EObject obj) {
		// if (obj instanceof Entity) {
		// Entity entity = ((Entity) obj);
		// List<String> str = new ArrayList<String>();
		// traversePackage(entity.eContainer(), str);
		// str.add(entity.getName());
		//
		// String[] array = str.toArray(new String[str.size()]);
		// return QualifiedName.create(array);
		// }
		return super.getFullyQualifiedName(obj);
	}

	// /**
	// * Traverses Package object and saves its type name and its child's name
	// as
	// * String to List.
	// *
	// * @param obj
	// * Package
	// * @param str
	// * List where package name is saved
	// */
	// private void traversePackage(EObject obj, List<String> str) {
	// if (obj != null
	// && str != null
	// && obj instanceof cz.cvut.earlgrey.classmodel.classmodel.Package) {
	// cz.cvut.earlgrey.classmodel.classmodel.Package pack = (Package) obj;
	// if (pack.getName() != null) {
	// str.add(pack.getName());
	// traversePackage(pack.eContainer(), str);
	// }
	// }
	// }
}

package cz.cvut.earlgrey.classmodel.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import cz.cvut.earlgrey.annotation.validation.AnnotationJavaValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class})
public class AbstractClassmodelJavaValidator extends AnnotationJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(cz.cvut.earlgrey.classmodel.classmodel.ClassmodelPackage.eINSTANCE);
		return result;
	}

}

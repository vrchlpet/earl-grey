package cz.cvut.earlgrey.annotation.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public class AbstractAnnotationJavaValidator extends AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(cz.cvut.earlgrey.annotation.annotation.AnnotationPackage.eINSTANCE);
		return result;
	}

}

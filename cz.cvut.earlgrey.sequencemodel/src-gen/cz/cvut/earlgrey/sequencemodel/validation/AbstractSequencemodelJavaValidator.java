package cz.cvut.earlgrey.sequencemodel.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import cz.cvut.earlgrey.annotation.validation.AnnotationJavaValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {org.eclipse.xtext.validation.ImportUriValidator.class})
public class AbstractSequencemodelJavaValidator extends AnnotationJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(cz.cvut.earlgrey.sequencemodel.sequencemodel.SequencemodelPackage.eINSTANCE);
		return result;
	}

}

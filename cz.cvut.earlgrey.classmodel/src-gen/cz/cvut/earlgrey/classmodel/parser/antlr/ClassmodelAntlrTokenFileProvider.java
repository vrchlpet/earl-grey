/*
* generated by Xtext
*/
package cz.cvut.earlgrey.classmodel.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ClassmodelAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.tokens");
	}
}
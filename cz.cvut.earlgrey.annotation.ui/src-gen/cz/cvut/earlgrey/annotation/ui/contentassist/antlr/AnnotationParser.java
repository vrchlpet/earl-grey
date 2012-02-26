/*
* generated by Xtext
*/
package cz.cvut.earlgrey.annotation.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import cz.cvut.earlgrey.annotation.services.AnnotationGrammarAccess;

public class AnnotationParser extends AbstractContentAssistParser {
	
	@Inject
	private AnnotationGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected cz.cvut.earlgrey.annotation.ui.contentassist.antlr.internal.InternalAnnotationParser createParser() {
		cz.cvut.earlgrey.annotation.ui.contentassist.antlr.internal.InternalAnnotationParser result = new cz.cvut.earlgrey.annotation.ui.contentassist.antlr.internal.InternalAnnotationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2(), "rule__Annotation__Group_2__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2_2(), "rule__Annotation__Group_2_2__0");
					put(grammarAccess.getAssignParameterAccess().getGroup(), "rule__AssignParameter__Group__0");
					put(grammarAccess.getDoubleAccess().getGroup(), "rule__Double__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup(), "rule__ExtendedID__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup_1(), "rule__ExtendedID__Group_1__0");
					put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
					put(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1(), "rule__Annotation__ParameterAssignment_2_1");
					put(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1(), "rule__Annotation__ParameterAssignment_2_2_1");
					put(grammarAccess.getAssignParameterAccess().getNameAssignment_0(), "rule__AssignParameter__NameAssignment_0");
					put(grammarAccess.getAssignParameterAccess().getValueAssignment_2(), "rule__AssignParameter__ValueAssignment_2");
					put(grammarAccess.getValueParameterAccess().getValueAssignment(), "rule__ValueParameter__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			cz.cvut.earlgrey.annotation.ui.contentassist.antlr.internal.InternalAnnotationParser typedParser = (cz.cvut.earlgrey.annotation.ui.contentassist.antlr.internal.InternalAnnotationParser) parser;
			typedParser.entryRuleAnnotation();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AnnotationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AnnotationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
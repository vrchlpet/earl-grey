/*
* generated by Xtext
*/
package cz.cvut.earlgrey.classmodel.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;

public class ClassmodelParser extends AbstractContentAssistParser {
	
	@Inject
	private ClassmodelGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected cz.cvut.earlgrey.classmodel.ui.contentassist.antlr.internal.InternalClassmodelParser createParser() {
		cz.cvut.earlgrey.classmodel.ui.contentassist.antlr.internal.InternalClassmodelParser result = new cz.cvut.earlgrey.classmodel.ui.contentassist.antlr.internal.InternalClassmodelParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
					put(grammarAccess.getRelationTypeAccess().getAlternatives(), "rule__RelationType__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getEntityTypeAccess().getAlternatives(), "rule__EntityType__Alternatives");
					put(grammarAccess.getClassmodelAccess().getGroup(), "rule__Classmodel__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup_1(), "rule__Reference__Group_1__0");
					put(grammarAccess.getReferenceAccess().getGroup_1_2(), "rule__Reference__Group_1_2__0");
					put(grammarAccess.getReferenceAccess().getGroup_2(), "rule__Reference__Group_2__0");
					put(grammarAccess.getReferenceAccess().getGroup_2_0(), "rule__Reference__Group_2_0__0");
					put(grammarAccess.getMethodAccess().getGroup(), "rule__Method__Group__0");
					put(grammarAccess.getMethodAccess().getGroup_3(), "rule__Method__Group_3__0");
					put(grammarAccess.getMethodAccess().getGroup_3_1(), "rule__Method__Group_3_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
					put(grammarAccess.getRelationAccess().getGroup_5(), "rule__Relation__Group_5__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
					put(grammarAccess.getClassmodelAccess().getImportsAssignment_0(), "rule__Classmodel__ImportsAssignment_0");
					put(grammarAccess.getClassmodelAccess().getElementsAssignment_1(), "rule__Classmodel__ElementsAssignment_1");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getPackageAccess().getElementsAssignment_3(), "rule__Package__ElementsAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getEntityAccess().getTypeAssignment_0(), "rule__Entity__TypeAssignment_0");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getAttributeAssignment_3(), "rule__Entity__AttributeAssignment_3");
					put(grammarAccess.getEntityAccess().getMethodAssignment_4(), "rule__Entity__MethodAssignment_4");
					put(grammarAccess.getReferenceAccess().getTypeAssignment_0(), "rule__Reference__TypeAssignment_0");
					put(grammarAccess.getReferenceAccess().getGenericAssignment_1_1(), "rule__Reference__GenericAssignment_1_1");
					put(grammarAccess.getReferenceAccess().getGenericAssignment_1_2_1(), "rule__Reference__GenericAssignment_1_2_1");
					put(grammarAccess.getReferenceAccess().getDimensionAssignment_2_0_0(), "rule__Reference__DimensionAssignment_2_0_0");
					put(grammarAccess.getMethodAccess().getModifierAssignment_0(), "rule__Method__ModifierAssignment_0");
					put(grammarAccess.getMethodAccess().getNameAssignment_1(), "rule__Method__NameAssignment_1");
					put(grammarAccess.getMethodAccess().getParametersAssignment_3_0(), "rule__Method__ParametersAssignment_3_0");
					put(grammarAccess.getMethodAccess().getParametersAssignment_3_1_1(), "rule__Method__ParametersAssignment_3_1_1");
					put(grammarAccess.getMethodAccess().getReturnAssignment_6(), "rule__Method__ReturnAssignment_6");
					put(grammarAccess.getParameterAccess().getTypeAssignment_0(), "rule__Parameter__TypeAssignment_0");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getModifierAssignment_0(), "rule__Attribute__ModifierAssignment_0");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
					put(grammarAccess.getRelationAccess().getOriginAssignment_0(), "rule__Relation__OriginAssignment_0");
					put(grammarAccess.getRelationAccess().getCardinalityFromAssignment_1(), "rule__Relation__CardinalityFromAssignment_1");
					put(grammarAccess.getRelationAccess().getTypeAssignment_2(), "rule__Relation__TypeAssignment_2");
					put(grammarAccess.getRelationAccess().getCardinalityToAssignment_3(), "rule__Relation__CardinalityToAssignment_3");
					put(grammarAccess.getRelationAccess().getDestinationAssignment_4(), "rule__Relation__DestinationAssignment_4");
					put(grammarAccess.getRelationAccess().getLabelAssignment_5_1(), "rule__Relation__LabelAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			cz.cvut.earlgrey.classmodel.ui.contentassist.antlr.internal.InternalClassmodelParser typedParser = (cz.cvut.earlgrey.classmodel.ui.contentassist.antlr.internal.InternalClassmodelParser) parser;
			typedParser.entryRuleClassmodel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ClassmodelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ClassmodelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

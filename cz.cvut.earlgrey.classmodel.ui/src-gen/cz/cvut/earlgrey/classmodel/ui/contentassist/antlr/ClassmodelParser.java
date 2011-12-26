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
					put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
					put(grammarAccess.getClassAccess().getAlternatives_0_0(), "rule__Class__Alternatives_0_0");
					put(grammarAccess.getFeatureAccess().getAlternatives(), "rule__Feature__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getRelationTypeAccess().getAlternatives(), "rule__RelationType__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getEntityTypeAccess().getAlternatives(), "rule__EntityType__Alternatives");
					put(grammarAccess.getClassmodelAccess().getGroup(), "rule__Classmodel__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_0(), "rule__Class__Group_0__0");
					put(grammarAccess.getEnumAccess().getGroup(), "rule__Enum__Group__0");
					put(grammarAccess.getEnumConstantAccess().getGroup(), "rule__EnumConstant__Group__0");
					put(grammarAccess.getEnumConstantAccess().getGroup_1(), "rule__EnumConstant__Group_1__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
					put(grammarAccess.getOperationAccess().getGroup_3_1(), "rule__Operation__Group_3_1__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
					put(grammarAccess.getParameterAccess().getGroup_3_2(), "rule__Parameter__Group_3_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getAttributeAccess().getGroup_4_2(), "rule__Attribute__Group_4_2__0");
					put(grammarAccess.getRelationAccess().getGroup(), "rule__Relation__Group__0");
					put(grammarAccess.getRelationAccess().getGroup_5(), "rule__Relation__Group_5__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getClassmodelAccess().getImportsAssignment_0(), "rule__Classmodel__ImportsAssignment_0");
					put(grammarAccess.getClassmodelAccess().getElementsAssignment_1(), "rule__Classmodel__ElementsAssignment_1");
					put(grammarAccess.getPackageAccess().getNameAssignment_1(), "rule__Package__NameAssignment_1");
					put(grammarAccess.getPackageAccess().getElementsAssignment_3(), "rule__Package__ElementsAssignment_3");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getClassAccess().getClassAssignment_0_0_0(), "rule__Class__ClassAssignment_0_0_0");
					put(grammarAccess.getClassAccess().getInterfaceAssignment_0_0_1(), "rule__Class__InterfaceAssignment_0_0_1");
					put(grammarAccess.getClassAccess().getAbstractAssignment_0_0_2(), "rule__Class__AbstractAssignment_0_0_2");
					put(grammarAccess.getClassAccess().getNameAssignment_1(), "rule__Class__NameAssignment_1");
					put(grammarAccess.getClassAccess().getFeatureAssignment_3(), "rule__Class__FeatureAssignment_3");
					put(grammarAccess.getEnumAccess().getEnumerationAssignment_0(), "rule__Enum__EnumerationAssignment_0");
					put(grammarAccess.getEnumAccess().getNameAssignment_1(), "rule__Enum__NameAssignment_1");
					put(grammarAccess.getEnumAccess().getFeatureAssignment_3(), "rule__Enum__FeatureAssignment_3");
					put(grammarAccess.getEnumConstantAccess().getNameAssignment_0(), "rule__EnumConstant__NameAssignment_0");
					put(grammarAccess.getEnumConstantAccess().getImplicitAssignment_1_1(), "rule__EnumConstant__ImplicitAssignment_1_1");
					put(grammarAccess.getReferenceAccess().getTypeAssignment_0(), "rule__Reference__TypeAssignment_0");
					put(grammarAccess.getReferenceAccess().getArrayAssignment_1(), "rule__Reference__ArrayAssignment_1");
					put(grammarAccess.getArrayAccess().getSizeAssignment_2(), "rule__Array__SizeAssignment_2");
					put(grammarAccess.getOperationAccess().getModifierAssignment_0_0(), "rule__Operation__ModifierAssignment_0_0");
					put(grammarAccess.getOperationAccess().getStaticAssignment_0_1(), "rule__Operation__StaticAssignment_0_1");
					put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
					put(grammarAccess.getOperationAccess().getParametersAssignment_3_0(), "rule__Operation__ParametersAssignment_3_0");
					put(grammarAccess.getOperationAccess().getParametersAssignment_3_1_1(), "rule__Operation__ParametersAssignment_3_1_1");
					put(grammarAccess.getOperationAccess().getReturnAssignment_6(), "rule__Operation__ReturnAssignment_6");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
					put(grammarAccess.getParameterAccess().getImplicitAssignment_3_1(), "rule__Parameter__ImplicitAssignment_3_1");
					put(grammarAccess.getParameterAccess().getImplicitAssignment_3_2_1(), "rule__Parameter__ImplicitAssignment_3_2_1");
					put(grammarAccess.getAttributeAccess().getModifierAssignment_0_0(), "rule__Attribute__ModifierAssignment_0_0");
					put(grammarAccess.getAttributeAccess().getStaticAssignment_0_1(), "rule__Attribute__StaticAssignment_0_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
					put(grammarAccess.getAttributeAccess().getImplicitAssignment_4_1(), "rule__Attribute__ImplicitAssignment_4_1");
					put(grammarAccess.getAttributeAccess().getImplicitAssignment_4_2_1(), "rule__Attribute__ImplicitAssignment_4_2_1");
					put(grammarAccess.getRelationAccess().getOriginAssignment_0(), "rule__Relation__OriginAssignment_0");
					put(grammarAccess.getRelationAccess().getCardinalityFromAssignment_1(), "rule__Relation__CardinalityFromAssignment_1");
					put(grammarAccess.getRelationAccess().getTypeAssignment_2(), "rule__Relation__TypeAssignment_2");
					put(grammarAccess.getRelationAccess().getCardinalityToAssignment_3(), "rule__Relation__CardinalityToAssignment_3");
					put(grammarAccess.getRelationAccess().getDestinationAssignment_4(), "rule__Relation__DestinationAssignment_4");
					put(grammarAccess.getRelationAccess().getLabelAssignment_5_1(), "rule__Relation__LabelAssignment_5_1");
					put(grammarAccess.getOperationAccess().getUnorderedGroup_0(), "rule__Operation__UnorderedGroup_0");
					put(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), "rule__Attribute__UnorderedGroup_0");
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

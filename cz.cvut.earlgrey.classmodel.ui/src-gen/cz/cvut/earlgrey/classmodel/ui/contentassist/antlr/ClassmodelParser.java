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
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getEntityAccess().getAlternatives(), "rule__Entity__Alternatives");
					put(grammarAccess.getFeatureAccess().getAlternatives_0(), "rule__Feature__Alternatives_0");
					put(grammarAccess.getMultiplicityValueAccess().getAlternatives(), "rule__MultiplicityValue__Alternatives");
					put(grammarAccess.getImplicitValueAccess().getAlternatives(), "rule__ImplicitValue__Alternatives");
					put(grammarAccess.getPropertyAccess().getAlternatives(), "rule__Property__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getValueWithSpacesAccess().getAlternatives(), "rule__ValueWithSpaces__Alternatives");
					put(grammarAccess.getCompositeIDAccess().getAlternatives(), "rule__CompositeID__Alternatives");
					put(grammarAccess.getRealAccess().getAlternatives_4_0(), "rule__Real__Alternatives_4_0");
					put(grammarAccess.getRealAccess().getAlternatives_4_1(), "rule__Real__Alternatives_4_1");
					put(grammarAccess.getRelationshipTypeAccess().getAlternatives(), "rule__RelationshipType__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getDatatypeAccess().getGroup(), "rule__Datatype__Group__0");
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getClassifierAccess().getGroup(), "rule__Classifier__Group__0");
					put(grammarAccess.getClassifierAccess().getGroup_3(), "rule__Classifier__Group_3__0");
					put(grammarAccess.getClassifierAccess().getGroup_3_2(), "rule__Classifier__Group_3_2__0");
					put(grammarAccess.getClassifierAccess().getGroup_4(), "rule__Classifier__Group_4__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getFeatureAccess().getGroup(), "rule__Feature__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumeratorAccess().getGroup(), "rule__Enumerator__Group__0");
					put(grammarAccess.getEnumeratorAccess().getGroup_1(), "rule__Enumerator__Group_1__0");
					put(grammarAccess.getRelationshipAccess().getGroup(), "rule__Relationship__Group__0");
					put(grammarAccess.getRelationshipAccess().getGroup_4(), "rule__Relationship__Group_4__0");
					put(grammarAccess.getRelationshipAccess().getGroup_10(), "rule__Relationship__Group_10__0");
					put(grammarAccess.getMultiplicityAccess().getGroup(), "rule__Multiplicity__Group__0");
					put(grammarAccess.getMultiplicityAccess().getGroup_1(), "rule__Multiplicity__Group_1__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
					put(grammarAccess.getOperationAccess().getGroup_3_1(), "rule__Operation__Group_3_1__0");
					put(grammarAccess.getOperationAccess().getGroup_5(), "rule__Operation__Group_5__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getParameterAccess().getGroup_3(), "rule__Parameter__Group_3__0");
					put(grammarAccess.getParameterAccess().getGroup_3_2(), "rule__Parameter__Group_3_2__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup_4(), "rule__Attribute__Group_4__0");
					put(grammarAccess.getAttributeAccess().getGroup_4_2(), "rule__Attribute__Group_4_2__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getArrayAccess().getGroup(), "rule__Array__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2(), "rule__Annotation__Group_2__0");
					put(grammarAccess.getAnnotationAccess().getGroup_2_2(), "rule__Annotation__Group_2_2__0");
					put(grammarAccess.getAssignPropertyAccess().getGroup(), "rule__AssignProperty__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup(), "rule__ExtendedID__Group__0");
					put(grammarAccess.getExtendedIDAccess().getGroup_1(), "rule__ExtendedID__Group_1__0");
					put(grammarAccess.getRealAccess().getGroup(), "rule__Real__Group__0");
					put(grammarAccess.getRealAccess().getGroup_4(), "rule__Real__Group_4__0");
					put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
					put(grammarAccess.getModelAccess().getImportsAssignment_0(), "rule__Model__ImportsAssignment_0");
					put(grammarAccess.getModelAccess().getElementsAssignment_1(), "rule__Model__ElementsAssignment_1");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getDatatypeAccess().getAnnotationAssignment_0(), "rule__Datatype__AnnotationAssignment_0");
					put(grammarAccess.getDatatypeAccess().getNameAssignment_2(), "rule__Datatype__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getAnnotationAssignment_0(), "rule__Package__AnnotationAssignment_0");
					put(grammarAccess.getPackageAccess().getNameAssignment_2(), "rule__Package__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getElementAssignment_3(), "rule__Package__ElementAssignment_3");
					put(grammarAccess.getClassifierAccess().getAnnotationAssignment_0(), "rule__Classifier__AnnotationAssignment_0");
					put(grammarAccess.getClassifierAccess().getNameAssignment_2(), "rule__Classifier__NameAssignment_2");
					put(grammarAccess.getClassifierAccess().getGeneralizationAssignment_3_1(), "rule__Classifier__GeneralizationAssignment_3_1");
					put(grammarAccess.getClassifierAccess().getGeneralizationAssignment_3_2_1(), "rule__Classifier__GeneralizationAssignment_3_2_1");
					put(grammarAccess.getClassifierAccess().getUpperClassAssignment_4_1(), "rule__Classifier__UpperClassAssignment_4_1");
					put(grammarAccess.getClassifierAccess().getConstraintAssignment_5(), "rule__Classifier__ConstraintAssignment_5");
					put(grammarAccess.getClassifierAccess().getFeatureAssignment_6(), "rule__Classifier__FeatureAssignment_6");
					put(grammarAccess.getTypeAccess().getVisibilityAssignment_0(), "rule__Type__VisibilityAssignment_0");
					put(grammarAccess.getTypeAccess().getNameAssignment_1(), "rule__Type__NameAssignment_1");
					put(grammarAccess.getFeatureAccess().getConstraintAssignment_1(), "rule__Feature__ConstraintAssignment_1");
					put(grammarAccess.getEnumerationAccess().getAnnotationAssignment_0(), "rule__Enumeration__AnnotationAssignment_0");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_2(), "rule__Enumeration__NameAssignment_2");
					put(grammarAccess.getEnumerationAccess().getConstraintAssignment_3(), "rule__Enumeration__ConstraintAssignment_3");
					put(grammarAccess.getEnumerationAccess().getEnumeratorAssignment_4(), "rule__Enumeration__EnumeratorAssignment_4");
					put(grammarAccess.getEnumeratorAccess().getNameAssignment_0(), "rule__Enumerator__NameAssignment_0");
					put(grammarAccess.getEnumeratorAccess().getValueAssignment_1_1(), "rule__Enumerator__ValueAssignment_1_1");
					put(grammarAccess.getEnumeratorAccess().getConstraintAssignment_2(), "rule__Enumerator__ConstraintAssignment_2");
					put(grammarAccess.getRelationshipAccess().getAnnotationAssignment_0(), "rule__Relationship__AnnotationAssignment_0");
					put(grammarAccess.getRelationshipAccess().getTypeAssignment_1(), "rule__Relationship__TypeAssignment_1");
					put(grammarAccess.getRelationshipAccess().getLabelAssignment_2(), "rule__Relationship__LabelAssignment_2");
					put(grammarAccess.getRelationshipAccess().getHeadNavigableAssignment_3(), "rule__Relationship__HeadNavigableAssignment_3");
					put(grammarAccess.getRelationshipAccess().getHeadVisibilityAssignment_4_0(), "rule__Relationship__HeadVisibilityAssignment_4_0");
					put(grammarAccess.getRelationshipAccess().getHeadLabelAssignment_4_1(), "rule__Relationship__HeadLabelAssignment_4_1");
					put(grammarAccess.getRelationshipAccess().getHeadAssignment_5(), "rule__Relationship__HeadAssignment_5");
					put(grammarAccess.getRelationshipAccess().getHeadMultiplicityAssignment_7(), "rule__Relationship__HeadMultiplicityAssignment_7");
					put(grammarAccess.getRelationshipAccess().getTailNavigableAssignment_9(), "rule__Relationship__TailNavigableAssignment_9");
					put(grammarAccess.getRelationshipAccess().getTailVisibilityAssignment_10_0(), "rule__Relationship__TailVisibilityAssignment_10_0");
					put(grammarAccess.getRelationshipAccess().getTailLabelAssignment_10_1(), "rule__Relationship__TailLabelAssignment_10_1");
					put(grammarAccess.getRelationshipAccess().getTailAssignment_11(), "rule__Relationship__TailAssignment_11");
					put(grammarAccess.getRelationshipAccess().getTailMultiplicityAssignment_13(), "rule__Relationship__TailMultiplicityAssignment_13");
					put(grammarAccess.getMultiplicityAccess().getLowerAssignment_0(), "rule__Multiplicity__LowerAssignment_0");
					put(grammarAccess.getMultiplicityAccess().getUpperAssignment_1_1(), "rule__Multiplicity__UpperAssignment_1_1");
					put(grammarAccess.getConstantAccess().getVisibilityAssignment_0(), "rule__Constant__VisibilityAssignment_0");
					put(grammarAccess.getConstantAccess().getNameAssignment_1(), "rule__Constant__NameAssignment_1");
					put(grammarAccess.getConstantAccess().getValueAssignment_3(), "rule__Constant__ValueAssignment_3");
					put(grammarAccess.getOperationAccess().getVisibilityAssignment_0_0(), "rule__Operation__VisibilityAssignment_0_0");
					put(grammarAccess.getOperationAccess().getStaticAssignment_0_1(), "rule__Operation__StaticAssignment_0_1");
					put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
					put(grammarAccess.getOperationAccess().getParameterAssignment_3_0(), "rule__Operation__ParameterAssignment_3_0");
					put(grammarAccess.getOperationAccess().getParameterAssignment_3_1_1(), "rule__Operation__ParameterAssignment_3_1_1");
					put(grammarAccess.getOperationAccess().getReturnAssignment_5_1(), "rule__Operation__ReturnAssignment_5_1");
					put(grammarAccess.getOperationAccess().getBodyAssignment_6(), "rule__Operation__BodyAssignment_6");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
					put(grammarAccess.getParameterAccess().getImplicitAssignment_3_1(), "rule__Parameter__ImplicitAssignment_3_1");
					put(grammarAccess.getParameterAccess().getImplicitAssignment_3_2_1(), "rule__Parameter__ImplicitAssignment_3_2_1");
					put(grammarAccess.getAttributeAccess().getVisibilityAssignment_0_0(), "rule__Attribute__VisibilityAssignment_0_0");
					put(grammarAccess.getAttributeAccess().getStaticAssignment_0_1(), "rule__Attribute__StaticAssignment_0_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
					put(grammarAccess.getAttributeAccess().getImplicitAssignment_4_1(), "rule__Attribute__ImplicitAssignment_4_1");
					put(grammarAccess.getAttributeAccess().getImplicitAssignment_4_2_1(), "rule__Attribute__ImplicitAssignment_4_2_1");
					put(grammarAccess.getReferenceAccess().getTypeAssignment_0(), "rule__Reference__TypeAssignment_0");
					put(grammarAccess.getReferenceAccess().getArrayAssignment_1(), "rule__Reference__ArrayAssignment_1");
					put(grammarAccess.getArrayAccess().getSizeAssignment_2(), "rule__Array__SizeAssignment_2");
					put(grammarAccess.getAnnotationAccess().getNameAssignment_1(), "rule__Annotation__NameAssignment_1");
					put(grammarAccess.getAnnotationAccess().getPropertyAssignment_2_1(), "rule__Annotation__PropertyAssignment_2_1");
					put(grammarAccess.getAnnotationAccess().getPropertyAssignment_2_2_1(), "rule__Annotation__PropertyAssignment_2_2_1");
					put(grammarAccess.getAssignPropertyAccess().getNameAssignment_0(), "rule__AssignProperty__NameAssignment_0");
					put(grammarAccess.getAssignPropertyAccess().getValueAssignment_2(), "rule__AssignProperty__ValueAssignment_2");
					put(grammarAccess.getValuePropertyAccess().getValueAssignment(), "rule__ValueProperty__ValueAssignment");
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
			typedParser.entryRuleModel();
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

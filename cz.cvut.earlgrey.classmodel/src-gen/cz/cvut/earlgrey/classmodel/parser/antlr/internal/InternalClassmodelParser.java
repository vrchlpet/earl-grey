package cz.cvut.earlgrey.classmodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cz.cvut.earlgrey.classmodel.services.ClassmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalClassmodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CONSTRAINT", "RULE_NATURAL", "RULE_BODY", "RULE_NULL", "RULE_BOOLEAN", "RULE_OPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'datatype'", "'package'", "'end'", "'class'", "'isA'", "','", "'enum'", "'='", "'role'", "':'", "'..'", "'*'", "'static'", "'('", "')'", "'['", "']'", "'@'", "'.'", "'-'", "'e'", "'E'", "'+'", "'association'", "'depency'", "'generalization'", "'realization'", "'aggregation'", "'composition'", "'#'", "'~'"
    };
    public static final int RULE_BOOLEAN=10;
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_CONSTRAINT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_NULL=9;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_BODY=8;
    public static final int RULE_OPERATOR=11;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalClassmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalClassmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalClassmodelParser.tokenNames; }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g"; }



     	private ClassmodelGrammarAccess grammarAccess;
     	
        public InternalClassmodelParser(TokenStream input, ClassmodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected ClassmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:70:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:77:1: ruleModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleElement ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleModel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:99:3: ( (lv_elements_1_0= ruleElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=18)||LA2_0==20||LA2_0==23||LA2_0==34||(LA2_0>=40 && LA2_0<=45)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:100:1: (lv_elements_1_0= ruleElement )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:100:1: (lv_elements_1_0= ruleElement )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:101:3: lv_elements_1_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getElementsElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleModel153);
            	    lv_elements_1_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:125:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:126:2: (iv_ruleImport= ruleImport EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:127:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport190);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:134:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:137:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:138:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:138:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:138:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:142:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:143:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:143:1: (lv_importURI_1_0= RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:144:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport254); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getImportRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"importURI",
                      		lv_importURI_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleElement"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:168:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:169:2: (iv_ruleElement= ruleElement EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:170:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement295);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement305); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:177:1: ruleElement returns [EObject current=null] : (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Relationship_0 = null;

        EObject this_Classifier_1 = null;

        EObject this_Package_2 = null;

        EObject this_Datatype_3 = null;

        EObject this_Enumeration_4 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:180:28: ( (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:181:1: (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:181:1: (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration )
            int alt3=5;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:182:5: this_Relationship_0= ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getRelationshipParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationship_in_ruleElement352);
                    this_Relationship_0=ruleRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Relationship_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:192:5: this_Classifier_1= ruleClassifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getClassifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassifier_in_ruleElement379);
                    this_Classifier_1=ruleClassifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Classifier_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:202:5: this_Package_2= rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getPackageParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleElement406);
                    this_Package_2=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Package_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:212:5: this_Datatype_3= ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getDatatypeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_ruleElement433);
                    this_Datatype_3=ruleDatatype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Datatype_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:222:5: this_Enumeration_4= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getEnumerationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleElement460);
                    this_Enumeration_4=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enumeration_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleDatatype"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:238:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:239:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:240:2: iv_ruleDatatype= ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype495);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatatype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype505); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:247:1: ruleDatatype returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_annotation_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:250:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:251:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:251:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:251:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:251:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:252:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:252:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:253:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDatatypeAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDatatype551);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDatatypeRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotation",
            	              		lv_annotation_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:269:3: ( ( 'datatype' )=>otherlv_1= 'datatype' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:269:4: ( 'datatype' )=>otherlv_1= 'datatype'
            {
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDatatype572); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDatatypeAccess().getDatatypeKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:274:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:275:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:275:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:276:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatatype590); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDatatypeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRulePackage"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:301:2: (iv_rulePackage= rulePackage EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:302:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage631);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage641); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:309:1: rulePackage returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:312:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:313:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:313:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:313:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:313:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:314:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:314:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:315:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePackage687);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotation",
            	              		lv_annotation_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:331:3: ( ( 'package' )=>otherlv_1= 'package' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:331:4: ( 'package' )=>otherlv_1= 'package'
            {
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePackage708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:336:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:337:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:337:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:338:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:354:2: ( (lv_element_3_0= ruleElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=17 && LA6_0<=18)||LA6_0==20||LA6_0==23||LA6_0==34||(LA6_0>=40 && LA6_0<=45)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:355:1: (lv_element_3_0= ruleElement )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:355:1: (lv_element_3_0= ruleElement )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:356:3: lv_element_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_rulePackage752);
            	    lv_element_3_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"element",
            	              		lv_element_3_0, 
            	              		"Element");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePackage765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleClassifier"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:384:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:385:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:386:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier801);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier811); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:393:1: ruleClassifier returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end' ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_constraint_4_0=null;
        Token otherlv_6=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_generalization_3_0 = null;

        EObject lv_feature_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:396:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:397:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:397:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:397:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:397:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:398:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:398:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:399:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleClassifier857);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotation",
            	              		lv_annotation_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:415:3: ( ( 'class' )=>otherlv_1= 'class' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:415:4: ( 'class' )=>otherlv_1= 'class'
            {
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClassifier878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassifierAccess().getClassKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:420:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:421:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:421:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:422:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getClassifierAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassifierRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:438:2: ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) && (synpred4_InternalClassmodel())) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:438:3: ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:443:1: (lv_generalization_3_0= ruleGeneralization )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:444:3: lv_generalization_3_0= ruleGeneralization
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassifierAccess().getGeneralizationGeneralizationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGeneralization_in_ruleClassifier932);
                    lv_generalization_3_0=ruleGeneralization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
                      	        }
                             		set(
                             			current, 
                             			"generalization",
                              		lv_generalization_3_0, 
                              		"Generalization");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:460:3: ( (lv_constraint_4_0= RULE_CONSTRAINT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CONSTRAINT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:461:1: (lv_constraint_4_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:461:1: (lv_constraint_4_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:462:3: lv_constraint_4_0= RULE_CONSTRAINT
                    {
                    lv_constraint_4_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleClassifier950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_4_0, grammarAccess.getClassifierAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassifierRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"constraint",
                              		lv_constraint_4_0, 
                              		"CONSTRAINT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:478:3: ( (lv_feature_5_0= ruleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==29||LA10_0==36||LA10_0==39||(LA10_0>=46 && LA10_0<=47)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:479:1: (lv_feature_5_0= ruleFeature )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:479:1: (lv_feature_5_0= ruleFeature )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:480:3: lv_feature_5_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getFeatureFeatureParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleClassifier977);
            	    lv_feature_5_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"feature",
            	              		lv_feature_5_0, 
            	              		"Feature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleClassifier990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClassifierAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleGeneralization"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:508:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:509:2: (iv_ruleGeneralization= ruleGeneralization EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:510:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneralizationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneralization_in_entryRuleGeneralization1026);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneralization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralization1036); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralization"


    // $ANTLR start "ruleGeneralization"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:517:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )* ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_classifier_1_0 = null;

        EObject lv_classifier_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:520:28: ( (otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:521:1: (otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:521:1: (otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:521:3: otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleGeneralization1073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsAKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:525:1: ( (lv_classifier_1_0= ruleType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:526:1: (lv_classifier_1_0= ruleType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:526:1: (lv_classifier_1_0= ruleType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:527:3: lv_classifier_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleGeneralization1094);
            lv_classifier_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
              	        }
                     		add(
                     			current, 
                     			"classifier",
                      		lv_classifier_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:543:2: (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:543:4: otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleGeneralization1107); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:547:1: ( (lv_classifier_3_0= ruleType ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:548:1: (lv_classifier_3_0= ruleType )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:548:1: (lv_classifier_3_0= ruleType )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:549:3: lv_classifier_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleGeneralization1128);
            	    lv_classifier_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"classifier",
            	              		lv_classifier_3_0, 
            	              		"Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleType"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:573:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:574:2: (iv_ruleType= ruleType EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:575:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1166);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1176); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:582:1: ruleType returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:585:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:586:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:586:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:586:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:586:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36||LA12_0==39||(LA12_0>=46 && LA12_0<=47)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:587:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:587:1: (lv_visibility_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:588:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleType1222);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"visibility",
                              		lv_visibility_0_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:604:3: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:605:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:605:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:606:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleType1244);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleFeature"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:630:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:631:2: (iv_ruleFeature= ruleFeature EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:632:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1280);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1290); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:639:1: ruleFeature returns [EObject current=null] : ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_3_0=null;
        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Constant_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:642:28: ( ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:643:1: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:643:1: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:643:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:643:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:644:5: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleFeature1338);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Attribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:654:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleFeature1365);
                    this_Operation_1=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:664:5: this_Constant_2= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getConstantParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleFeature1392);
                    this_Constant_2=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constant_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:672:2: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_CONSTRAINT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:673:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:673:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:674:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleFeature1409); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_3_0, grammarAccess.getFeatureAccess().getConstraintCONSTRAINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFeatureRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"constraint",
                              		lv_constraint_3_0, 
                              		"CONSTRAINT");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEnumeration"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:698:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:699:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:700:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1451);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1461); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:707:1: ruleEnumeration returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_constraint_3_0=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_enumerator_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:710:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:711:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:711:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:711:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:711:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:712:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:712:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:713:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEnumeration1507);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotation",
            	              		lv_annotation_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:729:3: ( ( 'enum' )=>otherlv_1= 'enum' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:729:4: ( 'enum' )=>otherlv_1= 'enum'
            {
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleEnumeration1528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:734:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:735:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:735:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:736:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:752:2: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CONSTRAINT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:753:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:753:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:754:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleEnumeration1568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_3_0, grammarAccess.getEnumerationAccess().getConstraintCONSTRAINTTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEnumerationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"constraint",
                              		lv_constraint_3_0, 
                              		"CONSTRAINT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:770:3: ( (lv_enumerator_4_0= ruleEnumerator ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:771:1: (lv_enumerator_4_0= ruleEnumerator )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:771:1: (lv_enumerator_4_0= ruleEnumerator )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:772:3: lv_enumerator_4_0= ruleEnumerator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumeratorEnumeratorParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumerator_in_ruleEnumeration1595);
            	    lv_enumerator_4_0=ruleEnumerator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"enumerator",
            	              		lv_enumerator_4_0, 
            	              		"Enumerator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEnumeration1608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getEndKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerator"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:800:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:801:2: (iv_ruleEnumerator= ruleEnumerator EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:802:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratorRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerator_in_entryRuleEnumerator1644);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerator1654); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerator"


    // $ANTLR start "ruleEnumerator"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:809:1: ruleEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_constraint_3_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:812:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:813:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:813:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:813:2: ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:813:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:814:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:814:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:815:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerator1696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumeratorAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumeratorRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:831:2: ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) && (synpred6_InternalClassmodel())) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:831:3: ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:831:3: ( ( '=' )=>otherlv_1= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:831:4: ( '=' )=>otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEnumerator1722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:836:2: ( (lv_value_2_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:837:1: (lv_value_2_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:837:1: (lv_value_2_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:838:3: lv_value_2_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumeratorAccess().getValueImplicitValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleEnumerator1744);
                    lv_value_2_0=ruleImplicitValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumeratorRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"ImplicitValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:854:4: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_CONSTRAINT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:855:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:855:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:856:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleEnumerator1763); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_3_0, grammarAccess.getEnumeratorAccess().getConstraintCONSTRAINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEnumeratorRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"constraint",
                              		lv_constraint_3_0, 
                              		"CONSTRAINT");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerator"


    // $ANTLR start "entryRuleRelationship"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:880:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:881:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:882:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship1805);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship1815); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:889:1: ruleRelationship returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'role' ) )? ( ( (lv_headLabel_4_0= ruleCompositeID ) ) otherlv_5= ':' )? ( (lv_headMultiplicity_6_0= ruleMultiplicity ) ) ( (lv_head_7_0= ruleExtendedID ) ) ( (lv_tailNavigable_8_0= 'role' ) )? ( ( (lv_tailLabel_9_0= ruleCompositeID ) ) otherlv_10= ':' )? ( (lv_tailMultiplicity_11_0= ruleMultiplicity ) ) ( (lv_tail_12_0= ruleExtendedID ) ) otherlv_13= 'end' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_headNavigable_3_0=null;
        Token otherlv_5=null;
        Token lv_tailNavigable_8_0=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_annotation_0_0 = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        AntlrDatatypeRuleToken lv_headLabel_4_0 = null;

        EObject lv_headMultiplicity_6_0 = null;

        AntlrDatatypeRuleToken lv_head_7_0 = null;

        AntlrDatatypeRuleToken lv_tailLabel_9_0 = null;

        EObject lv_tailMultiplicity_11_0 = null;

        AntlrDatatypeRuleToken lv_tail_12_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:892:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'role' ) )? ( ( (lv_headLabel_4_0= ruleCompositeID ) ) otherlv_5= ':' )? ( (lv_headMultiplicity_6_0= ruleMultiplicity ) ) ( (lv_head_7_0= ruleExtendedID ) ) ( (lv_tailNavigable_8_0= 'role' ) )? ( ( (lv_tailLabel_9_0= ruleCompositeID ) ) otherlv_10= ':' )? ( (lv_tailMultiplicity_11_0= ruleMultiplicity ) ) ( (lv_tail_12_0= ruleExtendedID ) ) otherlv_13= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:893:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'role' ) )? ( ( (lv_headLabel_4_0= ruleCompositeID ) ) otherlv_5= ':' )? ( (lv_headMultiplicity_6_0= ruleMultiplicity ) ) ( (lv_head_7_0= ruleExtendedID ) ) ( (lv_tailNavigable_8_0= 'role' ) )? ( ( (lv_tailLabel_9_0= ruleCompositeID ) ) otherlv_10= ':' )? ( (lv_tailMultiplicity_11_0= ruleMultiplicity ) ) ( (lv_tail_12_0= ruleExtendedID ) ) otherlv_13= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:893:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'role' ) )? ( ( (lv_headLabel_4_0= ruleCompositeID ) ) otherlv_5= ':' )? ( (lv_headMultiplicity_6_0= ruleMultiplicity ) ) ( (lv_head_7_0= ruleExtendedID ) ) ( (lv_tailNavigable_8_0= 'role' ) )? ( ( (lv_tailLabel_9_0= ruleCompositeID ) ) otherlv_10= ':' )? ( (lv_tailMultiplicity_11_0= ruleMultiplicity ) ) ( (lv_tail_12_0= ruleExtendedID ) ) otherlv_13= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:893:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'role' ) )? ( ( (lv_headLabel_4_0= ruleCompositeID ) ) otherlv_5= ':' )? ( (lv_headMultiplicity_6_0= ruleMultiplicity ) ) ( (lv_head_7_0= ruleExtendedID ) ) ( (lv_tailNavigable_8_0= 'role' ) )? ( ( (lv_tailLabel_9_0= ruleCompositeID ) ) otherlv_10= ':' )? ( (lv_tailMultiplicity_11_0= ruleMultiplicity ) ) ( (lv_tail_12_0= ruleExtendedID ) ) otherlv_13= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:893:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:894:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:894:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:895:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationshipAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleRelationship1861);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotation",
            	              		lv_annotation_0_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:911:3: ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:911:4: ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:916:1: (lv_type_1_0= ruleRelationshipType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:917:3: lv_type_1_0= ruleRelationshipType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRelationshipType_in_ruleRelationship1893);
            lv_type_1_0=ruleRelationshipType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"RelationshipType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:933:2: ( (lv_label_2_0= ruleCompositeID ) )?
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:934:1: (lv_label_2_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:934:1: (lv_label_2_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:935:3: lv_label_2_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getLabelCompositeIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleRelationship1914);
                    lv_label_2_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                      	        }
                             		set(
                             			current, 
                             			"label",
                              		lv_label_2_0, 
                              		"CompositeID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:951:3: ( (lv_headNavigable_3_0= 'role' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:952:1: (lv_headNavigable_3_0= 'role' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:952:1: (lv_headNavigable_3_0= 'role' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:953:3: lv_headNavigable_3_0= 'role'
                    {
                    lv_headNavigable_3_0=(Token)match(input,25,FOLLOW_25_in_ruleRelationship1933); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_headNavigable_3_0, grammarAccess.getRelationshipAccess().getHeadNavigableRoleKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(current, "headNavigable", true, "role");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:966:3: ( ( (lv_headLabel_4_0= ruleCompositeID ) ) otherlv_5= ':' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_ID)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:966:4: ( (lv_headLabel_4_0= ruleCompositeID ) ) otherlv_5= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:966:4: ( (lv_headLabel_4_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:967:1: (lv_headLabel_4_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:967:1: (lv_headLabel_4_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:968:3: lv_headLabel_4_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadLabelCompositeIDParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleRelationship1969);
                    lv_headLabel_4_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                      	        }
                             		set(
                             			current, 
                             			"headLabel",
                              		lv_headLabel_4_0, 
                              		"CompositeID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleRelationship1981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRelationshipAccess().getColonKeyword_4_1());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:988:3: ( (lv_headMultiplicity_6_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:989:1: (lv_headMultiplicity_6_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:989:1: (lv_headMultiplicity_6_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:990:3: lv_headMultiplicity_6_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadMultiplicityMultiplicityParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleRelationship2004);
            lv_headMultiplicity_6_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"headMultiplicity",
                      		lv_headMultiplicity_6_0, 
                      		"Multiplicity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1006:2: ( (lv_head_7_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:1: (lv_head_7_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:1: (lv_head_7_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1008:3: lv_head_7_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadExtendedIDParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleRelationship2025);
            lv_head_7_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_7_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1024:2: ( (lv_tailNavigable_8_0= 'role' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1025:1: (lv_tailNavigable_8_0= 'role' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1025:1: (lv_tailNavigable_8_0= 'role' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1026:3: lv_tailNavigable_8_0= 'role'
                    {
                    lv_tailNavigable_8_0=(Token)match(input,25,FOLLOW_25_in_ruleRelationship2043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_tailNavigable_8_0, grammarAccess.getRelationshipAccess().getTailNavigableRoleKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(current, "tailNavigable", true, "role");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1039:3: ( ( (lv_tailLabel_9_0= ruleCompositeID ) ) otherlv_10= ':' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_ID)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1039:4: ( (lv_tailLabel_9_0= ruleCompositeID ) ) otherlv_10= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1039:4: ( (lv_tailLabel_9_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1040:1: (lv_tailLabel_9_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1040:1: (lv_tailLabel_9_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1041:3: lv_tailLabel_9_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailLabelCompositeIDParserRuleCall_8_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleRelationship2079);
                    lv_tailLabel_9_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                      	        }
                             		set(
                             			current, 
                             			"tailLabel",
                              		lv_tailLabel_9_0, 
                              		"CompositeID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleRelationship2091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getRelationshipAccess().getColonKeyword_8_1());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1061:3: ( (lv_tailMultiplicity_11_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1062:1: (lv_tailMultiplicity_11_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1062:1: (lv_tailMultiplicity_11_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1063:3: lv_tailMultiplicity_11_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailMultiplicityMultiplicityParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleRelationship2114);
            lv_tailMultiplicity_11_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"tailMultiplicity",
                      		lv_tailMultiplicity_11_0, 
                      		"Multiplicity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1079:2: ( (lv_tail_12_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1080:1: (lv_tail_12_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1080:1: (lv_tail_12_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1081:3: lv_tail_12_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailExtendedIDParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleRelationship2135);
            lv_tail_12_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"tail",
                      		lv_tail_12_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleRelationship2147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getRelationshipAccess().getEndKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleMultiplicity"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1109:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1110:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1111:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity2183);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity2193); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1118:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_upper_0_0 = null;

        AntlrDatatypeRuleToken lv_lower_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1121:28: ( ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1122:1: ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1122:1: ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1122:2: ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1122:2: ( (lv_upper_0_0= ruleMultiplicityValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1123:1: (lv_upper_0_0= ruleMultiplicityValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1123:1: (lv_upper_0_0= ruleMultiplicityValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1124:3: lv_upper_0_0= ruleMultiplicityValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperMultiplicityValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2239);
            lv_upper_0_0=ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicityRule());
              	        }
                     		set(
                     			current, 
                     			"upper",
                      		lv_upper_0_0, 
                      		"MultiplicityValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1140:2: ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) && (synpred8_InternalClassmodel())) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1140:3: ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1140:3: ( ( '..' )=>otherlv_1= '..' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1140:4: ( '..' )=>otherlv_1= '..'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMultiplicity2260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1145:2: ( (lv_lower_2_0= ruleMultiplicityValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1146:1: (lv_lower_2_0= ruleMultiplicityValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1146:1: (lv_lower_2_0= ruleMultiplicityValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1147:3: lv_lower_2_0= ruleMultiplicityValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerMultiplicityValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2282);
                    lv_lower_2_0=ruleMultiplicityValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                      	        }
                             		set(
                             			current, 
                             			"lower",
                              		lv_lower_2_0, 
                              		"MultiplicityValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleMultiplicityValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1171:1: entryRuleMultiplicityValue returns [String current=null] : iv_ruleMultiplicityValue= ruleMultiplicityValue EOF ;
    public final String entryRuleMultiplicityValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicityValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1172:2: (iv_ruleMultiplicityValue= ruleMultiplicityValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1173:2: iv_ruleMultiplicityValue= ruleMultiplicityValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue2321);
            iv_ruleMultiplicityValue=ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityValue2332); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicityValue"


    // $ANTLR start "ruleMultiplicityValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1180:1: ruleMultiplicityValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicityValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1183:28: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1184:1: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1184:1: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_NATURAL) ) {
                alt27=1;
            }
            else if ( (LA27_0==28) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1184:6: this_NATURAL_0= RULE_NATURAL
                    {
                    this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleMultiplicityValue2372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_0, grammarAccess.getMultiplicityValueAccess().getNATURALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1193:2: kw= '*'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleMultiplicityValue2396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultiplicityValueAccess().getAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicityValue"


    // $ANTLR start "entryRuleConstant"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1206:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1207:2: (iv_ruleConstant= ruleConstant EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1208:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2436);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2446); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1215:1: ruleConstant returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1218:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1219:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1219:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1219:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1219:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36||LA28_0==39||(LA28_0>=46 && LA28_0<=47)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1220:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1220:1: (lv_visibility_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1221:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleConstant2492);
                    lv_visibility_0_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"visibility",
                              		lv_visibility_0_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1237:3: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1238:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1238:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1239:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConstant2527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1259:1: ( (lv_value_3_0= ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1260:1: (lv_value_3_0= ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1260:1: (lv_value_3_0= ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1261:3: lv_value_3_0= ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getValueImplicitValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_ruleConstant2548);
            lv_value_3_0=ruleImplicitValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"ImplicitValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleOperation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1285:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1286:2: (iv_ruleOperation= ruleOperation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1287:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation2584);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation2594); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1294:1: ruleOperation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_body_11_0=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_parameter_5_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_return_10_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1297:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1298:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1298:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1298:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1298:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1300:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1300:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1301:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1304:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1305:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1305:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==36||LA29_0==39|| LA29_0 >=46 && LA29_0<=47) && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1307:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1307:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1308:5: {...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1308:106: ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1309:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1312:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1312:7: {...}? => ( (lv_visibility_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1312:16: ( (lv_visibility_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1313:1: (lv_visibility_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1313:1: (lv_visibility_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1314:3: lv_visibility_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleOperation2685);
            	    lv_visibility_1_0=ruleVisibility();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"visibility",
            	              		lv_visibility_1_0, 
            	              		"Visibility");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1337:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1337:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1338:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1338:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1339:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1342:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1342:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1342:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1343:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1343:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1344:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,29,FOLLOW_29_in_ruleOperation2757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_static_2_0, grammarAccess.getOperationAccess().getStaticStaticKeyword_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOperationRule());
            	      	        }
            	             		setWithLastConsumed(current, "static", true, "static");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOperationAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1371:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1372:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1372:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1373:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation2827); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOperationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleOperation2844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1393:1: ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) && (synpred9_InternalClassmodel())) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1393:2: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1393:2: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1393:3: ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1398:1: (lv_parameter_5_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1399:3: lv_parameter_5_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperation2876);
                    lv_parameter_5_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameter",
                              		lv_parameter_5_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1415:2: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==22) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1415:4: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleOperation2889); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1419:1: ( (lv_parameter_7_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1420:1: (lv_parameter_7_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1420:1: (lv_parameter_7_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1421:3: lv_parameter_7_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperation2910);
                    	    lv_parameter_7_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameter",
                    	              		lv_parameter_7_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_31_in_ruleOperation2926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1441:1: (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1441:3: otherlv_9= ':' ( (lv_return_10_0= ruleReference ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleOperation2939); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_5_0());
                          
                    }
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1445:1: ( (lv_return_10_0= ruleReference ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1446:1: (lv_return_10_0= ruleReference )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1446:1: (lv_return_10_0= ruleReference )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1447:3: lv_return_10_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleOperation2960);
                    lv_return_10_0=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"return",
                              		lv_return_10_0, 
                              		"Reference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1463:4: ( (lv_body_11_0= RULE_BODY ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_BODY) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1464:1: (lv_body_11_0= RULE_BODY )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1464:1: (lv_body_11_0= RULE_BODY )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1465:3: lv_body_11_0= RULE_BODY
                    {
                    lv_body_11_0=(Token)match(input,RULE_BODY,FOLLOW_RULE_BODY_in_ruleOperation2979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_body_11_0, grammarAccess.getOperationAccess().getBodyBODYTerminalRuleCall_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getOperationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"body",
                              		lv_body_11_0, 
                              		"BODY");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1489:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1490:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1491:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3021);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3031); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1498:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_implicit_4_0 = null;

        AntlrDatatypeRuleToken lv_implicit_6_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1501:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1502:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1502:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1502:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1502:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1503:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1503:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1504:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleParameter3090); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1524:1: ( (lv_type_2_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1525:1: (lv_type_2_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1525:1: (lv_type_2_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1526:3: lv_type_2_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleParameter3111);
            lv_type_2_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"Reference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1542:2: ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==24) && (synpred10_InternalClassmodel())) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1542:3: ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1542:3: ( ( '=' )=>otherlv_3= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1542:4: ( '=' )=>otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParameter3132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1547:2: ( (lv_implicit_4_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1548:1: (lv_implicit_4_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1548:1: (lv_implicit_4_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1549:3: lv_implicit_4_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleParameter3154);
                    lv_implicit_4_0=ruleImplicitValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                      	        }
                             		add(
                             			current, 
                             			"implicit",
                              		lv_implicit_4_0, 
                              		"ImplicitValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1565:2: (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==22) ) {
                            int LA34_1 = input.LA(2);

                            if ( (LA34_1==RULE_ID) ) {
                                int LA34_3 = input.LA(3);

                                if ( (LA34_3==EOF||LA34_3==22||LA34_3==31) ) {
                                    alt34=1;
                                }


                            }
                            else if ( (LA34_1==RULE_STRING||LA34_1==RULE_NATURAL||(LA34_1>=RULE_NULL && LA34_1<=RULE_BOOLEAN)||LA34_1==36) ) {
                                alt34=1;
                            }


                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1565:4: otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleParameter3167); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1569:1: ( (lv_implicit_6_0= ruleImplicitValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1570:1: (lv_implicit_6_0= ruleImplicitValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1570:1: (lv_implicit_6_0= ruleImplicitValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1571:3: lv_implicit_6_0= ruleImplicitValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImplicitValue_in_ruleParameter3188);
                    	    lv_implicit_6_0=ruleImplicitValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"implicit",
                    	              		lv_implicit_6_0, 
                    	              		"ImplicitValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAttribute"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1595:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1596:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1597:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3228);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3238); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1604:1: ruleAttribute returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_implicit_7_0 = null;

        AntlrDatatypeRuleToken lv_implicit_9_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1607:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1608:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1608:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1608:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1608:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1610:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1610:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1611:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1614:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1615:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1615:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==36||LA36_0==39|| LA36_0 >=46 && LA36_0<=47) && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1617:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1617:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1618:5: {...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1618:106: ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1619:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1622:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1622:7: {...}? => ( (lv_visibility_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1622:16: ( (lv_visibility_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1623:1: (lv_visibility_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1623:1: (lv_visibility_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1624:3: lv_visibility_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleAttribute3329);
            	    lv_visibility_1_0=ruleVisibility();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"visibility",
            	              		lv_visibility_1_0, 
            	              		"Visibility");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1647:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1647:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1648:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1648:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1649:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1652:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1652:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1652:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1653:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1653:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1654:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,29,FOLLOW_29_in_ruleAttribute3401); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_static_2_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAttributeRule());
            	      	        }
            	             		setWithLastConsumed(current, "static", true, "static");
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAttributeAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1681:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1682:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1682:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1683:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute3471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleAttribute3488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1703:1: ( (lv_type_5_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1704:1: (lv_type_5_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1704:1: (lv_type_5_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1705:3: lv_type_5_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleAttribute3509);
            lv_type_5_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_5_0, 
                      		"Reference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1721:2: ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) && (synpred11_InternalClassmodel())) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1721:3: ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1721:3: ( ( '=' )=>otherlv_6= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1721:4: ( '=' )=>otherlv_6= '='
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleAttribute3530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1726:2: ( (lv_implicit_7_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1727:1: (lv_implicit_7_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1727:1: (lv_implicit_7_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1728:3: lv_implicit_7_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleAttribute3552);
                    lv_implicit_7_0=ruleImplicitValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                      	        }
                             		add(
                             			current, 
                             			"implicit",
                              		lv_implicit_7_0, 
                              		"ImplicitValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1744:2: (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==22) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1744:4: otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleAttribute3565); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1748:1: ( (lv_implicit_9_0= ruleImplicitValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1749:1: (lv_implicit_9_0= ruleImplicitValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1749:1: (lv_implicit_9_0= ruleImplicitValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1750:3: lv_implicit_9_0= ruleImplicitValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImplicitValue_in_ruleAttribute3586);
                    	    lv_implicit_9_0=ruleImplicitValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"implicit",
                    	              		lv_implicit_9_0, 
                    	              		"ImplicitValue");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleReference"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1774:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1775:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1776:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference3626);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference3636); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1783:1: ruleReference returns [EObject current=null] : ( ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1786:28: ( ( ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1787:1: ( ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1787:1: ( ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1787:2: ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1787:2: ( (lv_type_0_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1788:1: (lv_type_0_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1788:1: (lv_type_0_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1789:3: lv_type_0_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeExtendedIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleReference3682);
            lv_type_0_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1805:2: ( (lv_array_1_0= ruleArray ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==32) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1806:1: (lv_array_1_0= ruleArray )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1806:1: (lv_array_1_0= ruleArray )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1807:3: lv_array_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleReference3703);
            	    lv_array_1_0=ruleArray();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReferenceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"array",
            	              		lv_array_1_0, 
            	              		"Array");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleArray"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1831:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1832:2: (iv_ruleArray= ruleArray EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1833:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3740);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3750); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1840:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1843:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1844:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1844:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1844:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1844:2: ()
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1845:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayAccess().getArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleArray3796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1854:1: ( (lv_size_2_0= RULE_NATURAL ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_NATURAL) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1855:1: (lv_size_2_0= RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1855:1: (lv_size_2_0= RULE_NATURAL )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1856:3: lv_size_2_0= RULE_NATURAL
                    {
                    lv_size_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleArray3813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_size_2_0, grammarAccess.getArrayAccess().getSizeNATURALTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"size",
                              		lv_size_2_0, 
                              		"NATURAL");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleArray3831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleImplicitValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1884:1: entryRuleImplicitValue returns [String current=null] : iv_ruleImplicitValue= ruleImplicitValue EOF ;
    public final String entryRuleImplicitValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImplicitValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1885:2: (iv_ruleImplicitValue= ruleImplicitValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1886:2: iv_ruleImplicitValue= ruleImplicitValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicitValueRule()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue3868);
            iv_ruleImplicitValue=ruleImplicitValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicitValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitValue3879); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplicitValue"


    // $ANTLR start "ruleImplicitValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1893:1: ruleImplicitValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleImplicitValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NULL_0=null;
        Token this_BOOLEAN_1=null;
        Token this_STRING_2=null;
        Token this_ID_5=null;
        AntlrDatatypeRuleToken this_Integer_3 = null;

        AntlrDatatypeRuleToken this_Real_4 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1896:28: ( (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1897:1: (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1897:1: (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID )
            int alt41=6;
            switch ( input.LA(1) ) {
            case RULE_NULL:
                {
                alt41=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt41=2;
                }
                break;
            case RULE_STRING:
                {
                alt41=3;
                }
                break;
            case 36:
                {
                int LA41_4 = input.LA(2);

                if ( (LA41_4==RULE_NATURAL) ) {
                    int LA41_5 = input.LA(3);

                    if ( (LA41_5==EOF||(LA41_5>=RULE_ID && LA41_5<=RULE_CONSTRAINT)||LA41_5==19||LA41_5==22||LA41_5==29||LA41_5==31||LA41_5==36||LA41_5==39||(LA41_5>=46 && LA41_5<=47)) ) {
                        alt41=4;
                    }
                    else if ( (LA41_5==35) ) {
                        alt41=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA41_5 = input.LA(2);

                if ( (LA41_5==EOF||(LA41_5>=RULE_ID && LA41_5<=RULE_CONSTRAINT)||LA41_5==19||LA41_5==22||LA41_5==29||LA41_5==31||LA41_5==36||LA41_5==39||(LA41_5>=46 && LA41_5<=47)) ) {
                    alt41=4;
                }
                else if ( (LA41_5==35) ) {
                    alt41=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt41=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1897:6: this_NULL_0= RULE_NULL
                    {
                    this_NULL_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleImplicitValue3919); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_0, grammarAccess.getImplicitValueAccess().getNULLTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1905:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleImplicitValue3945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_1, grammarAccess.getImplicitValueAccess().getBOOLEANTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1913:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitValue3971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_2, grammarAccess.getImplicitValueAccess().getSTRINGTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1922:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImplicitValueAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleImplicitValue4004);
                    this_Integer_3=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Integer_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1934:5: this_Real_4= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImplicitValueAccess().getRealParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleImplicitValue4037);
                    this_Real_4=ruleReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Real_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1945:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplicitValue4063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_5, grammarAccess.getImplicitValueAccess().getIDTerminalRuleCall_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicitValue"


    // $ANTLR start "entryRuleAnnotation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1960:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1961:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1962:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4108);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation4118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1969:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1972:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1973:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1973:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1973:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleAnnotation4155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1977:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1978:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1978:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1979:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation4176);
            lv_name_1_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1995:2: ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==30) && (synpred12_InternalClassmodel())) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1995:3: ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1995:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1995:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleAnnotation4197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2000:2: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2001:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2001:1: (lv_parameter_3_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2002:3: lv_parameter_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4219);
                    lv_parameter_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"parameter",
                              		lv_parameter_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2018:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==22) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2018:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAnnotation4232); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2022:1: ( (lv_parameter_5_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2023:1: (lv_parameter_5_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2023:1: (lv_parameter_5_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2024:3: lv_parameter_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4253);
                    	    lv_parameter_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameter",
                    	              		lv_parameter_5_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAnnotation4267); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2056:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2057:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2058:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4310);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4321); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2065:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        Token this_BOOLEAN_3=null;
        Token this_NULL_4=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;

        AntlrDatatypeRuleToken this_ExtendedID_2 = null;

        AntlrDatatypeRuleToken this_Real_5 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2068:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2069:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2069:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt44=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_NATURAL) ) {
                    int LA44_2 = input.LA(3);

                    if ( (LA44_2==35) ) {
                        alt44=6;
                    }
                    else if ( (LA44_2==EOF) ) {
                        alt44=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA44_2 = input.LA(2);

                if ( (LA44_2==35) ) {
                    alt44=6;
                }
                else if ( (LA44_2==EOF) ) {
                    alt44=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt44=2;
                }
                break;
            case RULE_ID:
                {
                alt44=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt44=4;
                }
                break;
            case RULE_NULL:
                {
                alt44=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2070:5: this_Integer_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue4368);
                    this_Integer_0=ruleInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Integer_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2081:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2090:5: this_ExtendedID_2= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue4427);
                    this_ExtendedID_2=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2101:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue4453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2109:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue4479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2118:5: this_Real_5= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleValue4512);
                    this_Real_5=ruleReal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Real_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleExtendedID"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2136:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2137:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2138:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID4558);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID4569); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2145:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2148:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2149:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2149:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2149:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID4609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2156:1: (kw= '.' this_ID_2= RULE_ID )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==35) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2157:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleExtendedID4628); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID4643); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleCompositeID"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2179:1: entryRuleCompositeID returns [String current=null] : iv_ruleCompositeID= ruleCompositeID EOF ;
    public final String entryRuleCompositeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompositeID = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2180:2: (iv_ruleCompositeID= ruleCompositeID EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2181:2: iv_ruleCompositeID= ruleCompositeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeIDRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeID_in_entryRuleCompositeID4693);
            iv_ruleCompositeID=ruleCompositeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeID4704); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeID"


    // $ANTLR start "ruleCompositeID"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2188:1: ruleCompositeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleCompositeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_ExtendedID_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2191:28: ( (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2192:1: (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2192:1: (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_STRING) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2193:5: this_ExtendedID_0= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeIDAccess().getExtendedIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleCompositeID4751);
                    this_ExtendedID_0=ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExtendedID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2204:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompositeID4777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getCompositeIDAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeID"


    // $ANTLR start "entryRuleReal"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2219:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2220:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2221:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal4823);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal4834); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2228:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2231:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2232:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2232:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2232:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2232:2: (kw= '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==36) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2233:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleReal4873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal4890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,35,FOLLOW_35_in_ruleReal4908); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                  
            }
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal4923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2258:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=37 && LA50_0<=38)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2258:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2258:2: (kw= 'e' | kw= 'E' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==37) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==38) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2259:2: kw= 'e'
                            {
                            kw=(Token)match(input,37,FOLLOW_37_in_ruleReal4943); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2266:2: kw= 'E'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleReal4962); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2271:2: (kw= '+' | kw= '-' )
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==39) ) {
                        alt49=1;
                    }
                    else if ( (LA49_0==36) ) {
                        alt49=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 49, 0, input);

                        throw nvae;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2272:2: kw= '+'
                            {
                            kw=(Token)match(input,39,FOLLOW_39_in_ruleReal4977); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2279:2: kw= '-'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleReal4996); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_8);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_8, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2299:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2300:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2301:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger5060);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger5071); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2308:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2311:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2312:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2312:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2312:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2312:2: (kw= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==36) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2313:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleInteger5110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger5127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "ruleRelationshipType"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2333:1: ruleRelationshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) ) ;
    public final Enumerator ruleRelationshipType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2335:28: ( ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2336:1: ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2336:1: ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) )
            int alt52=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt52=1;
                }
                break;
            case 41:
                {
                alt52=2;
                }
                break;
            case 42:
                {
                alt52=3;
                }
                break;
            case 43:
                {
                alt52=4;
                }
                break;
            case 44:
                {
                alt52=5;
                }
                break;
            case 45:
                {
                alt52=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2336:2: (enumLiteral_0= 'association' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2336:2: (enumLiteral_0= 'association' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2336:4: enumLiteral_0= 'association'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleRelationshipType5186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2342:6: (enumLiteral_1= 'depency' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2342:6: (enumLiteral_1= 'depency' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2342:8: enumLiteral_1= 'depency'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleRelationshipType5203); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2348:6: (enumLiteral_2= 'generalization' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2348:6: (enumLiteral_2= 'generalization' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2348:8: enumLiteral_2= 'generalization'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleRelationshipType5220); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2354:6: (enumLiteral_3= 'realization' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2354:6: (enumLiteral_3= 'realization' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2354:8: enumLiteral_3= 'realization'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleRelationshipType5237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2360:6: (enumLiteral_4= 'aggregation' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2360:6: (enumLiteral_4= 'aggregation' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2360:8: enumLiteral_4= 'aggregation'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_44_in_ruleRelationshipType5254); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2366:6: (enumLiteral_5= 'composition' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2366:6: (enumLiteral_5= 'composition' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2366:8: enumLiteral_5= 'composition'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_45_in_ruleRelationshipType5271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getRelationshipTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationshipType"


    // $ANTLR start "ruleVisibility"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2376:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2378:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2379:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2379:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt53=1;
                }
                break;
            case 36:
                {
                alt53=2;
                }
                break;
            case 46:
                {
                alt53=3;
                }
                break;
            case 47:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2379:2: (enumLiteral_0= '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2379:2: (enumLiteral_0= '+' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2379:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleVisibility5316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2385:6: (enumLiteral_1= '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2385:6: (enumLiteral_1= '-' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2385:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_36_in_ruleVisibility5333); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2391:6: (enumLiteral_2= '#' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2391:6: (enumLiteral_2= '#' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2391:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleVisibility5350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2397:6: (enumLiteral_3= '~' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2397:6: (enumLiteral_3= '~' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2397:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleVisibility5367); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPACKAGE_PRIVATEEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibility"

    // $ANTLR start synpred1_InternalClassmodel
    public final void synpred1_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:269:4: ( 'datatype' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:269:6: 'datatype'
        {
        match(input,17,FOLLOW_17_in_synpred1_InternalClassmodel564); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalClassmodel

    // $ANTLR start synpred2_InternalClassmodel
    public final void synpred2_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:331:4: ( 'package' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:331:6: 'package'
        {
        match(input,18,FOLLOW_18_in_synpred2_InternalClassmodel700); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalClassmodel

    // $ANTLR start synpred3_InternalClassmodel
    public final void synpred3_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:415:4: ( 'class' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:415:6: 'class'
        {
        match(input,20,FOLLOW_20_in_synpred3_InternalClassmodel870); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalClassmodel

    // $ANTLR start synpred4_InternalClassmodel
    public final void synpred4_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:438:3: ( ( ruleGeneralization ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:439:1: ( ruleGeneralization )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:439:1: ( ruleGeneralization )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:440:1: ruleGeneralization
        {
        pushFollow(FOLLOW_ruleGeneralization_in_synpred4_InternalClassmodel915);
        ruleGeneralization();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalClassmodel

    // $ANTLR start synpred5_InternalClassmodel
    public final void synpred5_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:729:4: ( 'enum' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:729:6: 'enum'
        {
        match(input,23,FOLLOW_23_in_synpred5_InternalClassmodel1520); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalClassmodel

    // $ANTLR start synpred6_InternalClassmodel
    public final void synpred6_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:831:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:831:6: '='
        {
        match(input,24,FOLLOW_24_in_synpred6_InternalClassmodel1714); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalClassmodel

    // $ANTLR start synpred7_InternalClassmodel
    public final void synpred7_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:911:4: ( ( ruleRelationshipType ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:912:1: ( ruleRelationshipType )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:912:1: ( ruleRelationshipType )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:913:1: ruleRelationshipType
        {
        pushFollow(FOLLOW_ruleRelationshipType_in_synpred7_InternalClassmodel1876);
        ruleRelationshipType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalClassmodel

    // $ANTLR start synpred8_InternalClassmodel
    public final void synpred8_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1140:4: ( '..' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1140:6: '..'
        {
        match(input,27,FOLLOW_27_in_synpred8_InternalClassmodel2252); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalClassmodel

    // $ANTLR start synpred9_InternalClassmodel
    public final void synpred9_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1393:3: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1394:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1394:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1395:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred9_InternalClassmodel2859);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalClassmodel

    // $ANTLR start synpred10_InternalClassmodel
    public final void synpred10_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1542:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1542:6: '='
        {
        match(input,24,FOLLOW_24_in_synpred10_InternalClassmodel3124); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalClassmodel

    // $ANTLR start synpred11_InternalClassmodel
    public final void synpred11_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1721:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1721:6: '='
        {
        match(input,24,FOLLOW_24_in_synpred11_InternalClassmodel3522); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalClassmodel

    // $ANTLR start synpred12_InternalClassmodel
    public final void synpred12_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1995:4: ( '(' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1995:6: '('
        {
        match(input,30,FOLLOW_30_in_synpred12_InternalClassmodel4189); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalClassmodel

    // Delegated rules

    public final boolean synpred10_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalClassmodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA3_eotS =
        "\125\uffff";
    static final String DFA3_eofS =
        "\125\uffff";
    static final String DFA3_minS =
        "\1\21\1\5\5\uffff\1\21\2\5\1\21\1\32\1\5\1\26\1\5\1\7\1\4\1\5\1"+
        "\21\1\26\1\41\4\26\1\7\2\26\1\32\1\4\1\7\1\5\3\26\1\7\4\26\1\7\2"+
        "\44\1\5\1\7\1\4\1\26\2\7\1\26\1\41\4\26\1\7\2\26\2\44\1\26\1\4\3"+
        "\7\3\26\1\7\4\26\1\7\2\44\1\26\2\7\2\44\1\26\2\7\1\26";
    static final String DFA3_maxS =
        "\1\55\1\5\5\uffff\1\55\2\5\1\55\1\32\1\5\1\43\1\5\1\41\1\44\1\5"+
        "\1\55\1\43\1\41\1\40\3\37\1\7\1\43\1\37\1\32\1\44\1\7\1\5\3\37\1"+
        "\7\1\43\1\37\1\46\1\43\1\7\2\47\1\5\1\41\1\44\1\46\2\7\1\43\1\41"+
        "\1\40\3\37\1\7\1\43\1\37\2\47\1\37\1\44\3\7\3\37\1\7\1\43\1\37\1"+
        "\46\1\37\1\7\2\47\1\46\2\7\2\47\1\37\2\7\1\37";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\116\uffff";
    static final String DFA3_specialS =
        "\125\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\6\12\uffff\1\1\5\uffff\6\2",
            "\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\6\6\uffff\1\11\3\uffff\1\1"+
            "\1\10\4\uffff\6\2",
            "\1\12",
            "\1\13",
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\6\6\uffff\1\11\3\uffff\1\1"+
            "\1\10\4\uffff\6\2",
            "\1\14",
            "\1\15",
            "\1\21\1\uffff\1\20\6\uffff\1\22\1\17\2\uffff\1\16",
            "\1\23",
            "\1\24\31\uffff\1\25",
            "\1\30\1\33\1\uffff\1\32\1\uffff\1\26\1\27\31\uffff\1\31",
            "\1\34",
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\6\12\uffff\1\1\5\uffff\6\2",
            "\1\21\1\uffff\1\20\6\uffff\1\22\1\17\2\uffff\1\16",
            "\1\25",
            "\1\21\1\uffff\1\20\6\uffff\1\22\1\17",
            "\1\35\10\uffff\1\22",
            "\1\35\10\uffff\1\22",
            "\1\35\10\uffff\1\22",
            "\1\32",
            "\1\35\10\uffff\1\22\3\uffff\1\36",
            "\1\35\10\uffff\1\22",
            "\1\37",
            "\1\42\1\45\1\uffff\1\44\1\uffff\1\40\1\41\31\uffff\1\43",
            "\1\46",
            "\1\47",
            "\1\35\10\uffff\1\22",
            "\1\35\10\uffff\1\22",
            "\1\35\10\uffff\1\22",
            "\1\44",
            "\1\35\10\uffff\1\22\3\uffff\1\50",
            "\1\35\3\uffff\1\37\4\uffff\1\22",
            "\1\35\10\uffff\1\22\5\uffff\1\51\1\52",
            "\1\21\1\uffff\1\55\6\uffff\1\22\1\54\2\uffff\1\53",
            "\1\56",
            "\1\60\2\uffff\1\57",
            "\1\60\2\uffff\1\57",
            "\1\61",
            "\1\62\31\uffff\1\63",
            "\1\66\1\71\1\uffff\1\70\1\uffff\1\64\1\65\31\uffff\1\67",
            "\1\35\10\uffff\1\22\5\uffff\1\72\1\73",
            "\1\74",
            "\1\74",
            "\1\21\1\uffff\1\55\6\uffff\1\22\1\54\2\uffff\1\53",
            "\1\63",
            "\1\21\1\uffff\1\55\6\uffff\1\22\1\54",
            "\1\75\10\uffff\1\22",
            "\1\75\10\uffff\1\22",
            "\1\75\10\uffff\1\22",
            "\1\70",
            "\1\75\10\uffff\1\22\3\uffff\1\76",
            "\1\75\10\uffff\1\22",
            "\1\100\2\uffff\1\77",
            "\1\100\2\uffff\1\77",
            "\1\35\10\uffff\1\22",
            "\1\103\1\106\1\uffff\1\105\1\uffff\1\101\1\102\31\uffff\1"+
            "\104",
            "\1\107",
            "\1\110",
            "\1\110",
            "\1\75\10\uffff\1\22",
            "\1\75\10\uffff\1\22",
            "\1\75\10\uffff\1\22",
            "\1\105",
            "\1\75\10\uffff\1\22\3\uffff\1\111",
            "\1\75\3\uffff\1\37\4\uffff\1\22",
            "\1\75\10\uffff\1\22\5\uffff\1\112\1\113",
            "\1\35\10\uffff\1\22",
            "\1\114",
            "\1\116\2\uffff\1\115",
            "\1\116\2\uffff\1\115",
            "\1\75\10\uffff\1\22\5\uffff\1\117\1\120",
            "\1\121",
            "\1\121",
            "\1\123\2\uffff\1\122",
            "\1\123\2\uffff\1\122",
            "\1\75\10\uffff\1\22",
            "\1\124",
            "\1\124",
            "\1\75\10\uffff\1\22"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "181:1: (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration )";
        }
    }
    static final String DFA13_eotS =
        "\17\uffff";
    static final String DFA13_eofS =
        "\17\uffff";
    static final String DFA13_minS =
        "\6\5\1\30\4\5\1\32\3\uffff";
    static final String DFA13_maxS =
        "\6\57\1\36\4\57\1\36\3\uffff";
    static final String DFA13_acceptS =
        "\14\uffff\1\2\1\3\1\1";
    static final String DFA13_specialS =
        "\17\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\6\27\uffff\1\5\6\uffff\1\2\2\uffff\1\1\6\uffff\1\3\1\4",
            "\1\6\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\15\1\uffff\1\16\3\uffff\1\14",
            "\1\13\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\27\uffff\1\5\6\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\16\3\uffff\1\14",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "643:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant )";
        }
    }
    static final String DFA21_eotS =
        "\7\uffff";
    static final String DFA21_eofS =
        "\7\uffff";
    static final String DFA21_minS =
        "\3\4\1\uffff\1\5\1\uffff\1\4";
    static final String DFA21_maxS =
        "\1\34\1\43\1\34\1\uffff\1\5\1\uffff\1\43";
    static final String DFA21_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA21_specialS =
        "\7\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\1\1\uffff\1\3\21\uffff\1\3\2\uffff\1\3",
            "\2\5\1\uffff\1\5\21\uffff\1\5\1\3\1\uffff\1\5\6\uffff\1\4",
            "\2\5\1\uffff\1\5\21\uffff\1\5\1\3\1\uffff\1\5",
            "",
            "\1\6",
            "",
            "\2\5\1\uffff\1\5\21\uffff\1\5\1\3\1\uffff\1\5\6\uffff\1\4"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "933:2: ( (lv_label_2_0= ruleCompositeID ) )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x00003F0400970002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel153 = new BitSet(new long[]{0x00003F0400960002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleElement352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleElement379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleElement406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleElement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleElement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDatatype551 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleDatatype572 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePackage687 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_rulePackage708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage726 = new BitSet(new long[]{0x00003F04009E0000L});
    public static final BitSet FOLLOW_ruleElement_in_rulePackage752 = new BitSet(new long[]{0x00003F04009E0000L});
    public static final BitSet FOLLOW_19_in_rulePackage765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleClassifier857 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleClassifier878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier896 = new BitSet(new long[]{0x0000C09020280060L});
    public static final BitSet FOLLOW_ruleGeneralization_in_ruleClassifier932 = new BitSet(new long[]{0x0000C09020080060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleClassifier950 = new BitSet(new long[]{0x0000C09020080020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleClassifier977 = new BitSet(new long[]{0x0000C09020080020L});
    public static final BitSet FOLLOW_19_in_ruleClassifier990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_entryRuleGeneralization1026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralization1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleGeneralization1073 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleGeneralization1094 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleGeneralization1107 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleGeneralization1128 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleType1222 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleType1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleFeature1338 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFeature1365 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleFeature1392 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleFeature1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEnumeration1507 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumeration1528 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1546 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleEnumeration1568 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleEnumerator_in_ruleEnumeration1595 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleEnumeration1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_entryRuleEnumerator1644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerator1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerator1696 = new BitSet(new long[]{0x0000000001000042L});
    public static final BitSet FOLLOW_24_in_ruleEnumerator1722 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleEnumerator1744 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleEnumerator1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleRelationship1861 = new BitSet(new long[]{0x00003F0400000000L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_ruleRelationship1893 = new BitSet(new long[]{0x0000C090120000B0L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleRelationship1914 = new BitSet(new long[]{0x0000C090120000B0L});
    public static final BitSet FOLLOW_25_in_ruleRelationship1933 = new BitSet(new long[]{0x0000C090120000B0L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleRelationship1969 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRelationship1981 = new BitSet(new long[]{0x0000C090120000B0L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleRelationship2004 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleRelationship2025 = new BitSet(new long[]{0x0000C090120000B0L});
    public static final BitSet FOLLOW_25_in_ruleRelationship2043 = new BitSet(new long[]{0x0000C090120000B0L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleRelationship2079 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRelationship2091 = new BitSet(new long[]{0x0000C090120000B0L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleRelationship2114 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleRelationship2135 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRelationship2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity2183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2239 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleMultiplicity2260 = new BitSet(new long[]{0x0000C090120000B0L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue2321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityValue2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleMultiplicityValue2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMultiplicityValue2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2436 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleConstant2492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2510 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstant2527 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleConstant2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2584 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleOperation2685 = new BitSet(new long[]{0x0000C09020000020L});
    public static final BitSet FOLLOW_29_in_ruleOperation2757 = new BitSet(new long[]{0x0000C09020000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation2827 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleOperation2844 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation2876 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleOperation2889 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation2910 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleOperation2926 = new BitSet(new long[]{0x0000000004000102L});
    public static final BitSet FOLLOW_26_in_ruleOperation2939 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOperation2960 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_BODY_in_ruleOperation2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3073 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleParameter3090 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter3111 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleParameter3132 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleParameter3154 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleParameter3167 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleParameter3188 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAttribute3329 = new BitSet(new long[]{0x0000C09020000020L});
    public static final BitSet FOLLOW_29_in_ruleAttribute3401 = new BitSet(new long[]{0x0000C09020000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute3471 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAttribute3488 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttribute3509 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute3530 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleAttribute3552 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAttribute3565 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleAttribute3586 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference3626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleReference3682 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleReference3703 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArray3796 = new BitSet(new long[]{0x0000000200000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleArray3813 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArray3831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue3868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitValue3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleImplicitValue3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleImplicitValue3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitValue3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleImplicitValue4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleImplicitValue4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplicitValue4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAnnotation4155 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation4176 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleAnnotation4197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4219 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation4232 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4253 = new BitSet(new long[]{0x0000000080400000L});
    public static final BitSet FOLLOW_31_in_ruleAnnotation4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue4512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID4558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID4569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID4609 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleExtendedID4628 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID4643 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleCompositeID_in_entryRuleCompositeID4693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeID4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleCompositeID4751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompositeID4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal4823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleReal4873 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal4890 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleReal4908 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal4923 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleReal4943 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_38_in_ruleReal4962 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_39_in_ruleReal4977 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_36_in_ruleReal4996 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger5060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteger5110 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRelationshipType5186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRelationshipType5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationshipType5220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRelationshipType5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRelationshipType5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRelationshipType5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVisibility5316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVisibility5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVisibility5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVisibility5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalClassmodel564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred2_InternalClassmodel700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred3_InternalClassmodel870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_synpred4_InternalClassmodel915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalClassmodel1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred6_InternalClassmodel1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_synpred7_InternalClassmodel1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred8_InternalClassmodel2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred9_InternalClassmodel2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred10_InternalClassmodel3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred11_InternalClassmodel3522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred12_InternalClassmodel4189 = new BitSet(new long[]{0x0000000000000002L});

}

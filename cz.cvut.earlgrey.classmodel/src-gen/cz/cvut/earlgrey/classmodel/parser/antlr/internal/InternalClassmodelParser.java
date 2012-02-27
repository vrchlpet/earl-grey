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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CONSTRAINT", "RULE_NATURAL", "RULE_NULL", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'datatype'", "'package'", "'end'", "'class'", "'isA'", "','", "'enum'", "'='", "'interface'", "'navigable'", "'..'", "'*'", "'static'", "'('", "')'", "':'", "'['", "']'", "'@'", "'.'", "'-'", "'e'", "'E'", "'+'", "'association'", "'depency'", "'generalization'", "'realization'", "'aggregation'", "'composition'", "'#'", "'~'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=7;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_CONSTRAINT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_NULL=8;
    public static final int RULE_ML_COMMENT=10;
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
    public static final int RULE_WS=12;

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

                if ( (LA1_0==14) ) {
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

                if ( ((LA2_0>=15 && LA2_0<=16)||LA2_0==18||LA2_0==21||LA2_0==23||LA2_0==33||(LA2_0>=39 && LA2_0<=44)) ) {
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
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport237); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:177:1: ruleElement returns [EObject current=null] : (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration | this_Interface_5= ruleInterface ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Relationship_0 = null;

        EObject this_Classifier_1 = null;

        EObject this_Package_2 = null;

        EObject this_Datatype_3 = null;

        EObject this_Enumeration_4 = null;

        EObject this_Interface_5 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:180:28: ( (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration | this_Interface_5= ruleInterface ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:181:1: (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration | this_Interface_5= ruleInterface )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:181:1: (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration | this_Interface_5= ruleInterface )
            int alt3=6;
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
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:232:5: this_Interface_5= ruleInterface
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getInterfaceParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInterface_in_ruleElement487);
                    this_Interface_5=ruleInterface();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Interface_5; 
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:248:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:249:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:250:2: iv_ruleDatatype= ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype522);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatatype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype532); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:257:1: ruleDatatype returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_annotation_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:260:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:261:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:261:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:261:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:261:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:262:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:262:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:263:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDatatypeAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDatatype578);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:279:3: ( ( 'datatype' )=>otherlv_1= 'datatype' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:279:4: ( 'datatype' )=>otherlv_1= 'datatype'
            {
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleDatatype599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDatatypeAccess().getDatatypeKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:284:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:285:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:285:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:286:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatatype617); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:310:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:311:2: (iv_rulePackage= rulePackage EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:312:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage658);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage668); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:319:1: rulePackage returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:322:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:323:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:323:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:323:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:323:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:324:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:324:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:325:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePackage714);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:341:3: ( ( 'package' )=>otherlv_1= 'package' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:341:4: ( 'package' )=>otherlv_1= 'package'
            {
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePackage735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:346:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:347:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:347:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:348:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage753); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:364:2: ( (lv_element_3_0= ruleElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)||LA6_0==18||LA6_0==21||LA6_0==23||LA6_0==33||(LA6_0>=39 && LA6_0<=44)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:365:1: (lv_element_3_0= ruleElement )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:365:1: (lv_element_3_0= ruleElement )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:366:3: lv_element_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_rulePackage779);
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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePackage792); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:394:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:395:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:396:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier828);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier838); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:403:1: ruleClassifier returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end' ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:406:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:407:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:407:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:407:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:407:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:408:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:408:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:409:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleClassifier884);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:425:3: ( ( 'class' )=>otherlv_1= 'class' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:425:4: ( 'class' )=>otherlv_1= 'class'
            {
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleClassifier905); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassifierAccess().getClassKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:430:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:431:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:431:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:432:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier923); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:448:2: ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) && (synpred4_InternalClassmodel())) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:448:3: ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:453:1: (lv_generalization_3_0= ruleGeneralization )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:454:3: lv_generalization_3_0= ruleGeneralization
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassifierAccess().getGeneralizationGeneralizationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGeneralization_in_ruleClassifier959);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:470:3: ( (lv_constraint_4_0= RULE_CONSTRAINT ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_CONSTRAINT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:471:1: (lv_constraint_4_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:471:1: (lv_constraint_4_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:472:3: lv_constraint_4_0= RULE_CONSTRAINT
                    {
                    lv_constraint_4_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleClassifier977); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:488:3: ( (lv_feature_5_0= ruleFeature ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==27||LA10_0==35||LA10_0==38||(LA10_0>=45 && LA10_0<=46)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:489:1: (lv_feature_5_0= ruleFeature )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:489:1: (lv_feature_5_0= ruleFeature )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:490:3: lv_feature_5_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getFeatureFeatureParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleClassifier1004);
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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleClassifier1017); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:518:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:519:2: (iv_ruleGeneralization= ruleGeneralization EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:520:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneralizationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneralization_in_entryRuleGeneralization1053);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneralization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralization1063); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:527:1: ruleGeneralization returns [EObject current=null] : (otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )* ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_classifier_1_0 = null;

        EObject lv_classifier_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:530:28: ( (otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:531:1: (otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:531:1: (otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:531:3: otherlv_0= 'isA' ( (lv_classifier_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleGeneralization1100); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGeneralizationAccess().getIsAKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:535:1: ( (lv_classifier_1_0= ruleType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:536:1: (lv_classifier_1_0= ruleType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:536:1: (lv_classifier_1_0= ruleType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:537:3: lv_classifier_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleGeneralization1121);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:553:2: (otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:553:4: otherlv_2= ',' ( (lv_classifier_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleGeneralization1134); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getGeneralizationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:557:1: ( (lv_classifier_3_0= ruleType ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:558:1: (lv_classifier_3_0= ruleType )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:558:1: (lv_classifier_3_0= ruleType )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:559:3: lv_classifier_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGeneralizationAccess().getClassifierTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleGeneralization1155);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:583:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:584:2: (iv_ruleType= ruleType EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:585:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1193);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1203); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:592:1: ruleType returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:595:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:596:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:596:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:596:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= ruleExtendedID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:596:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35||LA12_0==38||(LA12_0>=45 && LA12_0<=46)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:597:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:597:1: (lv_visibility_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:598:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleType1249);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:614:3: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:615:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:615:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:616:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleType1271);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:640:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:641:2: (iv_ruleFeature= ruleFeature EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:642:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1307);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1317); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:649:1: ruleFeature returns [EObject current=null] : ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_3_0=null;
        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Constant_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:652:28: ( ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:653:1: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:653:1: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:653:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:653:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:654:5: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleFeature1365);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:664:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleFeature1392);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:674:5: this_Constant_2= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getConstantParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleFeature1419);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:682:2: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_CONSTRAINT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:683:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:683:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:684:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleFeature1436); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:708:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:709:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:710:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1478);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1488); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:717:1: ruleEnumeration returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:720:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:721:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:721:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:721:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:721:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:722:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:722:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:723:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEnumeration1534);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:739:3: ( ( 'enum' )=>otherlv_1= 'enum' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:739:4: ( 'enum' )=>otherlv_1= 'enum'
            {
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleEnumeration1555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:744:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:745:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:745:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:746:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1573); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:762:2: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CONSTRAINT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:763:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:763:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:764:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleEnumeration1595); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:780:3: ( (lv_enumerator_4_0= ruleEnumerator ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:781:1: (lv_enumerator_4_0= ruleEnumerator )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:781:1: (lv_enumerator_4_0= ruleEnumerator )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:782:3: lv_enumerator_4_0= ruleEnumerator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumeratorEnumeratorParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumerator_in_ruleEnumeration1622);
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

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleEnumeration1635); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:810:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:811:2: (iv_ruleEnumerator= ruleEnumerator EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:812:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratorRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerator_in_entryRuleEnumerator1671);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerator1681); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:819:1: ruleEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_constraint_3_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:822:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:823:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:823:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:823:2: ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:823:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:824:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:824:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:825:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerator1723); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:841:2: ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) && (synpred6_InternalClassmodel())) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:841:3: ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:841:3: ( ( '=' )=>otherlv_1= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:841:4: ( '=' )=>otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleEnumerator1749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:846:2: ( (lv_value_2_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:847:1: (lv_value_2_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:847:1: (lv_value_2_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:848:3: lv_value_2_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumeratorAccess().getValueImplicitValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleEnumerator1771);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:864:4: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_CONSTRAINT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:865:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:865:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:866:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleEnumerator1790); if (state.failed) return current;
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


    // $ANTLR start "entryRuleInterface"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:890:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:891:2: (iv_ruleInterface= ruleInterface EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:892:2: iv_ruleInterface= ruleInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceRule()); 
            }
            pushFollow(FOLLOW_ruleInterface_in_entryRuleInterface1832);
            iv_ruleInterface=ruleInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterface; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterface1842); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:899:1: ruleInterface returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'interface' )=>otherlv_1= 'interface' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleInterfaceFeature ) )* otherlv_6= 'end' ) ;
    public final EObject ruleInterface() throws RecognitionException {
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:902:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'interface' )=>otherlv_1= 'interface' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleInterfaceFeature ) )* otherlv_6= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:903:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'interface' )=>otherlv_1= 'interface' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleInterfaceFeature ) )* otherlv_6= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:903:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'interface' )=>otherlv_1= 'interface' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleInterfaceFeature ) )* otherlv_6= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:903:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'interface' )=>otherlv_1= 'interface' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )? ( (lv_constraint_4_0= RULE_CONSTRAINT ) )? ( (lv_feature_5_0= ruleInterfaceFeature ) )* otherlv_6= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:903:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:904:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:904:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:905:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleInterface1888);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:921:3: ( ( 'interface' )=>otherlv_1= 'interface' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:921:4: ( 'interface' )=>otherlv_1= 'interface'
            {
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleInterface1909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceAccess().getInterfaceKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:926:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:927:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:927:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:928:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInterface1927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInterfaceAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInterfaceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:944:2: ( ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) && (synpred8_InternalClassmodel())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:944:3: ( ( ruleGeneralization ) )=> (lv_generalization_3_0= ruleGeneralization )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:949:1: (lv_generalization_3_0= ruleGeneralization )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:950:3: lv_generalization_3_0= ruleGeneralization
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceAccess().getGeneralizationGeneralizationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGeneralization_in_ruleInterface1963);
                    lv_generalization_3_0=ruleGeneralization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:966:3: ( (lv_constraint_4_0= RULE_CONSTRAINT ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_CONSTRAINT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:967:1: (lv_constraint_4_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:967:1: (lv_constraint_4_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:968:3: lv_constraint_4_0= RULE_CONSTRAINT
                    {
                    lv_constraint_4_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleInterface1981); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_4_0, grammarAccess.getInterfaceAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:984:3: ( (lv_feature_5_0= ruleInterfaceFeature ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||LA23_0==27||LA23_0==35||LA23_0==38||(LA23_0>=45 && LA23_0<=46)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:985:1: (lv_feature_5_0= ruleInterfaceFeature )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:985:1: (lv_feature_5_0= ruleInterfaceFeature )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:986:3: lv_feature_5_0= ruleInterfaceFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceAccess().getFeatureInterfaceFeatureParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleInterfaceFeature_in_ruleInterface2008);
            	    lv_feature_5_0=ruleInterfaceFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"feature",
            	              		lv_feature_5_0, 
            	              		"InterfaceFeature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleInterface2021); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getEndKeyword_6());
                  
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
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleInterfaceFeature"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1014:1: entryRuleInterfaceFeature returns [EObject current=null] : iv_ruleInterfaceFeature= ruleInterfaceFeature EOF ;
    public final EObject entryRuleInterfaceFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceFeature = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1015:2: (iv_ruleInterfaceFeature= ruleInterfaceFeature EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1016:2: iv_ruleInterfaceFeature= ruleInterfaceFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleInterfaceFeature_in_entryRuleInterfaceFeature2057);
            iv_ruleInterfaceFeature=ruleInterfaceFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInterfaceFeature2067); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceFeature"


    // $ANTLR start "ruleInterfaceFeature"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1023:1: ruleInterfaceFeature returns [EObject current=null] : ( (this_Operation_0= ruleOperation | this_Constant_1= ruleConstant ) ( (lv_constraint_2_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleInterfaceFeature() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_2_0=null;
        EObject this_Operation_0 = null;

        EObject this_Constant_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1026:28: ( ( (this_Operation_0= ruleOperation | this_Constant_1= ruleConstant ) ( (lv_constraint_2_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1027:1: ( (this_Operation_0= ruleOperation | this_Constant_1= ruleConstant ) ( (lv_constraint_2_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1027:1: ( (this_Operation_0= ruleOperation | this_Constant_1= ruleConstant ) ( (lv_constraint_2_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1027:2: (this_Operation_0= ruleOperation | this_Constant_1= ruleConstant ) ( (lv_constraint_2_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1027:2: (this_Operation_0= ruleOperation | this_Constant_1= ruleConstant )
            int alt24=2;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_ID) ) {
                    int LA24_6 = input.LA(3);

                    if ( (LA24_6==28) ) {
                        alt24=1;
                    }
                    else if ( (LA24_6==22) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_1==27||LA24_1==35||LA24_1==38||(LA24_1>=45 && LA24_1<=46)) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==RULE_ID) ) {
                    int LA24_6 = input.LA(3);

                    if ( (LA24_6==28) ) {
                        alt24=1;
                    }
                    else if ( (LA24_6==22) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_2==27||LA24_2==35||LA24_2==38||(LA24_2>=45 && LA24_2<=46)) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                int LA24_3 = input.LA(2);

                if ( (LA24_3==RULE_ID) ) {
                    int LA24_6 = input.LA(3);

                    if ( (LA24_6==28) ) {
                        alt24=1;
                    }
                    else if ( (LA24_6==22) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_3==27||LA24_3==35||LA24_3==38||(LA24_3>=45 && LA24_3<=46)) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 3, input);

                    throw nvae;
                }
                }
                break;
            case 46:
                {
                int LA24_4 = input.LA(2);

                if ( (LA24_4==RULE_ID) ) {
                    int LA24_6 = input.LA(3);

                    if ( (LA24_6==28) ) {
                        alt24=1;
                    }
                    else if ( (LA24_6==22) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_4==27||LA24_4==35||LA24_4==38||(LA24_4>=45 && LA24_4<=46)) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 4, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                alt24=1;
                }
                break;
            case RULE_ID:
                {
                int LA24_6 = input.LA(2);

                if ( (LA24_6==28) ) {
                    alt24=1;
                }
                else if ( (LA24_6==22) ) {
                    alt24=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1028:5: this_Operation_0= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceFeatureAccess().getOperationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleInterfaceFeature2115);
                    this_Operation_0=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1038:5: this_Constant_1= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getInterfaceFeatureAccess().getConstantParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleInterfaceFeature2142);
                    this_Constant_1=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Constant_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1046:2: ( (lv_constraint_2_0= RULE_CONSTRAINT ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_CONSTRAINT) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1047:1: (lv_constraint_2_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1047:1: (lv_constraint_2_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1048:3: lv_constraint_2_0= RULE_CONSTRAINT
                    {
                    lv_constraint_2_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleInterfaceFeature2159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_2_0, grammarAccess.getInterfaceFeatureAccess().getConstraintCONSTRAINTTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInterfaceFeatureRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"constraint",
                              		lv_constraint_2_0, 
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
    // $ANTLR end "ruleInterfaceFeature"


    // $ANTLR start "entryRuleRelationship"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1072:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1073:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1074:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship2201);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship2211); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1081:1: ruleRelationship returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_headNavigable_3_0= 'navigable' ) )? ( (lv_headMultiplicity_4_0= ruleMultiplicity ) )? ( (lv_head_5_0= ruleExtendedID ) ) ( (lv_headLabel_6_0= RULE_STRING ) )? ( (lv_tailNavigable_7_0= 'navigable' ) )? ( (lv_tailMultiplicity_8_0= ruleMultiplicity ) )? ( (lv_tail_9_0= ruleExtendedID ) ) ( (lv_tailLabel_10_0= RULE_STRING ) )? otherlv_11= 'end' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_label_2_0=null;
        Token lv_headNavigable_3_0=null;
        Token lv_headLabel_6_0=null;
        Token lv_tailNavigable_7_0=null;
        Token lv_tailLabel_10_0=null;
        Token otherlv_11=null;
        EObject lv_annotation_0_0 = null;

        Enumerator lv_type_1_0 = null;

        EObject lv_headMultiplicity_4_0 = null;

        AntlrDatatypeRuleToken lv_head_5_0 = null;

        EObject lv_tailMultiplicity_8_0 = null;

        AntlrDatatypeRuleToken lv_tail_9_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1084:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_headNavigable_3_0= 'navigable' ) )? ( (lv_headMultiplicity_4_0= ruleMultiplicity ) )? ( (lv_head_5_0= ruleExtendedID ) ) ( (lv_headLabel_6_0= RULE_STRING ) )? ( (lv_tailNavigable_7_0= 'navigable' ) )? ( (lv_tailMultiplicity_8_0= ruleMultiplicity ) )? ( (lv_tail_9_0= ruleExtendedID ) ) ( (lv_tailLabel_10_0= RULE_STRING ) )? otherlv_11= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1085:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_headNavigable_3_0= 'navigable' ) )? ( (lv_headMultiplicity_4_0= ruleMultiplicity ) )? ( (lv_head_5_0= ruleExtendedID ) ) ( (lv_headLabel_6_0= RULE_STRING ) )? ( (lv_tailNavigable_7_0= 'navigable' ) )? ( (lv_tailMultiplicity_8_0= ruleMultiplicity ) )? ( (lv_tail_9_0= ruleExtendedID ) ) ( (lv_tailLabel_10_0= RULE_STRING ) )? otherlv_11= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1085:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_headNavigable_3_0= 'navigable' ) )? ( (lv_headMultiplicity_4_0= ruleMultiplicity ) )? ( (lv_head_5_0= ruleExtendedID ) ) ( (lv_headLabel_6_0= RULE_STRING ) )? ( (lv_tailNavigable_7_0= 'navigable' ) )? ( (lv_tailMultiplicity_8_0= ruleMultiplicity ) )? ( (lv_tail_9_0= ruleExtendedID ) ) ( (lv_tailLabel_10_0= RULE_STRING ) )? otherlv_11= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1085:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= RULE_STRING ) )? ( (lv_headNavigable_3_0= 'navigable' ) )? ( (lv_headMultiplicity_4_0= ruleMultiplicity ) )? ( (lv_head_5_0= ruleExtendedID ) ) ( (lv_headLabel_6_0= RULE_STRING ) )? ( (lv_tailNavigable_7_0= 'navigable' ) )? ( (lv_tailMultiplicity_8_0= ruleMultiplicity ) )? ( (lv_tail_9_0= ruleExtendedID ) ) ( (lv_tailLabel_10_0= RULE_STRING ) )? otherlv_11= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1085:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==33) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1086:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1086:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1087:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationshipAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleRelationship2257);
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
            	    break loop26;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1103:3: ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1103:4: ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1108:1: (lv_type_1_0= ruleRelationshipType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1109:3: lv_type_1_0= ruleRelationshipType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRelationshipType_in_ruleRelationship2289);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1125:2: ( (lv_label_2_0= RULE_STRING ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_STRING) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1126:1: (lv_label_2_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1126:1: (lv_label_2_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1127:3: lv_label_2_0= RULE_STRING
                    {
                    lv_label_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelationship2306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_2_0, grammarAccess.getRelationshipAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_2_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1143:3: ( (lv_headNavigable_3_0= 'navigable' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==24) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1144:1: (lv_headNavigable_3_0= 'navigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1144:1: (lv_headNavigable_3_0= 'navigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1145:3: lv_headNavigable_3_0= 'navigable'
                    {
                    lv_headNavigable_3_0=(Token)match(input,24,FOLLOW_24_in_ruleRelationship2330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_headNavigable_3_0, grammarAccess.getRelationshipAccess().getHeadNavigableNavigableKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(current, "headNavigable", true, "navigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1158:3: ( (lv_headMultiplicity_4_0= ruleMultiplicity ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NATURAL||LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1159:1: (lv_headMultiplicity_4_0= ruleMultiplicity )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1159:1: (lv_headMultiplicity_4_0= ruleMultiplicity )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1160:3: lv_headMultiplicity_4_0= ruleMultiplicity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadMultiplicityMultiplicityParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleRelationship2365);
                    lv_headMultiplicity_4_0=ruleMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                      	        }
                             		set(
                             			current, 
                             			"headMultiplicity",
                              		lv_headMultiplicity_4_0, 
                              		"Multiplicity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1176:3: ( (lv_head_5_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1177:1: (lv_head_5_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1177:1: (lv_head_5_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1178:3: lv_head_5_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadExtendedIDParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleRelationship2387);
            lv_head_5_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_5_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1194:2: ( (lv_headLabel_6_0= RULE_STRING ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1195:1: (lv_headLabel_6_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1195:1: (lv_headLabel_6_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1196:3: lv_headLabel_6_0= RULE_STRING
                    {
                    lv_headLabel_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelationship2404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_headLabel_6_0, grammarAccess.getRelationshipAccess().getHeadLabelSTRINGTerminalRuleCall_6_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"headLabel",
                              		lv_headLabel_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1212:3: ( (lv_tailNavigable_7_0= 'navigable' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1213:1: (lv_tailNavigable_7_0= 'navigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1213:1: (lv_tailNavigable_7_0= 'navigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1214:3: lv_tailNavigable_7_0= 'navigable'
                    {
                    lv_tailNavigable_7_0=(Token)match(input,24,FOLLOW_24_in_ruleRelationship2428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_tailNavigable_7_0, grammarAccess.getRelationshipAccess().getTailNavigableNavigableKeyword_7_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(current, "tailNavigable", true, "navigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1227:3: ( (lv_tailMultiplicity_8_0= ruleMultiplicity ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_NATURAL||LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1228:1: (lv_tailMultiplicity_8_0= ruleMultiplicity )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1228:1: (lv_tailMultiplicity_8_0= ruleMultiplicity )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1229:3: lv_tailMultiplicity_8_0= ruleMultiplicity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailMultiplicityMultiplicityParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleRelationship2463);
                    lv_tailMultiplicity_8_0=ruleMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                      	        }
                             		set(
                             			current, 
                             			"tailMultiplicity",
                              		lv_tailMultiplicity_8_0, 
                              		"Multiplicity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1245:3: ( (lv_tail_9_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1246:1: (lv_tail_9_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1246:1: (lv_tail_9_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1247:3: lv_tail_9_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailExtendedIDParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleRelationship2485);
            lv_tail_9_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"tail",
                      		lv_tail_9_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1263:2: ( (lv_tailLabel_10_0= RULE_STRING ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1264:1: (lv_tailLabel_10_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1264:1: (lv_tailLabel_10_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1265:3: lv_tailLabel_10_0= RULE_STRING
                    {
                    lv_tailLabel_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelationship2502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_tailLabel_10_0, grammarAccess.getRelationshipAccess().getTailLabelSTRINGTerminalRuleCall_10_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"tailLabel",
                              		lv_tailLabel_10_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleRelationship2520); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getRelationshipAccess().getEndKeyword_11());
                  
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1293:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1294:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1295:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity2556);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity2566); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1302:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_upper_0_0 = null;

        AntlrDatatypeRuleToken lv_lower_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1305:28: ( ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1306:1: ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1306:1: ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1306:2: ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1306:2: ( (lv_upper_0_0= ruleMultiplicityValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1307:1: (lv_upper_0_0= ruleMultiplicityValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1307:1: (lv_upper_0_0= ruleMultiplicityValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1308:3: lv_upper_0_0= ruleMultiplicityValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperMultiplicityValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2612);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1324:2: ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==25) && (synpred10_InternalClassmodel())) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1324:3: ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1324:3: ( ( '..' )=>otherlv_1= '..' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1324:4: ( '..' )=>otherlv_1= '..'
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleMultiplicity2633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1329:2: ( (lv_lower_2_0= ruleMultiplicityValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1330:1: (lv_lower_2_0= ruleMultiplicityValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1330:1: (lv_lower_2_0= ruleMultiplicityValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1331:3: lv_lower_2_0= ruleMultiplicityValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerMultiplicityValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2655);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1355:1: entryRuleMultiplicityValue returns [String current=null] : iv_ruleMultiplicityValue= ruleMultiplicityValue EOF ;
    public final String entryRuleMultiplicityValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicityValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1356:2: (iv_ruleMultiplicityValue= ruleMultiplicityValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1357:2: iv_ruleMultiplicityValue= ruleMultiplicityValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue2694);
            iv_ruleMultiplicityValue=ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityValue2705); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1364:1: ruleMultiplicityValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicityValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1367:28: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1368:1: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1368:1: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_NATURAL) ) {
                alt35=1;
            }
            else if ( (LA35_0==26) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1368:6: this_NATURAL_0= RULE_NATURAL
                    {
                    this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleMultiplicityValue2745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_0, grammarAccess.getMultiplicityValueAccess().getNATURALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1377:2: kw= '*'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleMultiplicityValue2769); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1390:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1391:2: (iv_ruleConstant= ruleConstant EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1392:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2809);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2819); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1399:1: ruleConstant returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1402:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1403:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1403:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1403:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1403:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==35||LA36_0==38||(LA36_0>=45 && LA36_0<=46)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1404:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1404:1: (lv_visibility_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1405:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleConstant2865);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1421:3: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1422:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1422:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1423:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2883); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleConstant2900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1443:1: ( (lv_value_3_0= ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1444:1: (lv_value_3_0= ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1444:1: (lv_value_3_0= ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1445:3: lv_value_3_0= ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getValueImplicitValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_ruleConstant2921);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1469:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1470:2: (iv_ruleOperation= ruleOperation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1471:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation2957);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation2967); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1478:1: ruleOperation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_visibility_1_0 = null;

        EObject lv_parameter_5_0 = null;

        EObject lv_parameter_7_0 = null;

        EObject lv_return_10_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1481:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1482:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1482:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1482:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1482:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1484:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1484:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1485:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1488:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1489:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1489:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==35||LA37_0==38|| LA37_0 >=45 && LA37_0<=46) && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1491:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1491:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1492:5: {...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1492:106: ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1493:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1496:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1496:7: {...}? => ( (lv_visibility_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1496:16: ( (lv_visibility_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1497:1: (lv_visibility_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1497:1: (lv_visibility_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1498:3: lv_visibility_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleOperation3058);
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
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1521:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1521:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1522:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1522:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1523:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1526:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1526:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1526:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1527:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1527:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1528:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,27,FOLLOW_27_in_ruleOperation3130); if (state.failed) return current;
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
            	    break loop37;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1555:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1556:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1556:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1557:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation3200); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleOperation3217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1577:1: ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) && (synpred11_InternalClassmodel())) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1577:2: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1577:2: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1577:3: ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1582:1: (lv_parameter_5_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1583:3: lv_parameter_5_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperation3249);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1599:2: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==20) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1599:4: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleOperation3262); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1603:1: ( (lv_parameter_7_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1604:1: (lv_parameter_7_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1604:1: (lv_parameter_7_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1605:3: lv_parameter_7_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperation3283);
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
                    	    break loop38;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleOperation3299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1625:1: (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1625:3: otherlv_9= ':' ( (lv_return_10_0= ruleReference ) )
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleOperation3312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_5_0());
                          
                    }
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1629:1: ( (lv_return_10_0= ruleReference ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1630:1: (lv_return_10_0= ruleReference )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1630:1: (lv_return_10_0= ruleReference )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1631:3: lv_return_10_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleOperation3333);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1655:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1656:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1657:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3371);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3381); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1664:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1667:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1668:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1668:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1668:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1668:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1669:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1669:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1670:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3423); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleParameter3440); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1690:1: ( (lv_type_2_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1691:1: (lv_type_2_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1691:1: (lv_type_2_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1692:3: lv_type_2_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleParameter3461);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1708:2: ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==22) && (synpred12_InternalClassmodel())) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1708:3: ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1708:3: ( ( '=' )=>otherlv_3= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1708:4: ( '=' )=>otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleParameter3482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1713:2: ( (lv_implicit_4_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1714:1: (lv_implicit_4_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1714:1: (lv_implicit_4_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1715:3: lv_implicit_4_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleParameter3504);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1731:2: (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==20) ) {
                            int LA41_1 = input.LA(2);

                            if ( (LA41_1==RULE_STRING||(LA41_1>=RULE_NATURAL && LA41_1<=RULE_BOOLEAN)||LA41_1==35) ) {
                                alt41=1;
                            }
                            else if ( (LA41_1==RULE_ID) ) {
                                int LA41_4 = input.LA(3);

                                if ( (LA41_4==EOF||LA41_4==20||LA41_4==29) ) {
                                    alt41=1;
                                }


                            }


                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1731:4: otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleParameter3517); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1735:1: ( (lv_implicit_6_0= ruleImplicitValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1736:1: (lv_implicit_6_0= ruleImplicitValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1736:1: (lv_implicit_6_0= ruleImplicitValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1737:3: lv_implicit_6_0= ruleImplicitValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImplicitValue_in_ruleParameter3538);
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
                    	    break loop41;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1761:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1762:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1763:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3578);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3588); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1770:1: ruleAttribute returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1773:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1774:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1774:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1774:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1774:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1776:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1776:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1777:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1780:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1781:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1781:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop43:
            do {
                int alt43=3;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==35||LA43_0==38|| LA43_0 >=45 && LA43_0<=46) && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 ==27 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                    alt43=2;
                }


                switch (alt43) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1783:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1783:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1784:5: {...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1784:106: ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1785:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1788:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1788:7: {...}? => ( (lv_visibility_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1788:16: ( (lv_visibility_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1789:1: (lv_visibility_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1789:1: (lv_visibility_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1790:3: lv_visibility_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleAttribute3679);
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
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1813:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1813:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1814:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1814:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1815:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1818:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1818:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1818:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1819:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1819:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1820:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,27,FOLLOW_27_in_ruleAttribute3751); if (state.failed) return current;
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
            	    break loop43;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1847:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1848:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1848:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1849:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute3821); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleAttribute3838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1869:1: ( (lv_type_5_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1870:1: (lv_type_5_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1870:1: (lv_type_5_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1871:3: lv_type_5_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleAttribute3859);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1887:2: ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==22) && (synpred13_InternalClassmodel())) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1887:3: ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1887:3: ( ( '=' )=>otherlv_6= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1887:4: ( '=' )=>otherlv_6= '='
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleAttribute3880); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1892:2: ( (lv_implicit_7_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1893:1: (lv_implicit_7_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1893:1: (lv_implicit_7_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1894:3: lv_implicit_7_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleAttribute3902);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1910:2: (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==20) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1910:4: otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleAttribute3915); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1914:1: ( (lv_implicit_9_0= ruleImplicitValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1915:1: (lv_implicit_9_0= ruleImplicitValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1915:1: (lv_implicit_9_0= ruleImplicitValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1916:3: lv_implicit_9_0= ruleImplicitValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImplicitValue_in_ruleAttribute3936);
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
                    	    break loop44;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1940:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1941:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1942:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference3976);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference3986); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1949:1: ruleReference returns [EObject current=null] : ( ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1952:28: ( ( ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1953:1: ( ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1953:1: ( ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1953:2: ( (lv_type_0_0= ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1953:2: ( (lv_type_0_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1954:1: (lv_type_0_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1954:1: (lv_type_0_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1955:3: lv_type_0_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeExtendedIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleReference4032);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1971:2: ( (lv_array_1_0= ruleArray ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==31) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1972:1: (lv_array_1_0= ruleArray )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1972:1: (lv_array_1_0= ruleArray )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1973:3: lv_array_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleReference4053);
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
            	    break loop46;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1997:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1998:2: (iv_ruleArray= ruleArray EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1999:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray4090);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray4100); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2006:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2009:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2010:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2010:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2010:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_NATURAL ) )? otherlv_3= ']'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2010:2: ()
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2011:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayAccess().getArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleArray4146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2020:1: ( (lv_size_2_0= RULE_NATURAL ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_NATURAL) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2021:1: (lv_size_2_0= RULE_NATURAL )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2021:1: (lv_size_2_0= RULE_NATURAL )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2022:3: lv_size_2_0= RULE_NATURAL
                    {
                    lv_size_2_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleArray4163); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,32,FOLLOW_32_in_ruleArray4181); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2050:1: entryRuleImplicitValue returns [String current=null] : iv_ruleImplicitValue= ruleImplicitValue EOF ;
    public final String entryRuleImplicitValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImplicitValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2051:2: (iv_ruleImplicitValue= ruleImplicitValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2052:2: iv_ruleImplicitValue= ruleImplicitValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicitValueRule()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue4218);
            iv_ruleImplicitValue=ruleImplicitValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicitValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitValue4229); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2059:1: ruleImplicitValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2062:28: ( (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2063:1: (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2063:1: (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID )
            int alt48=6;
            switch ( input.LA(1) ) {
            case RULE_NULL:
                {
                alt48=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt48=2;
                }
                break;
            case RULE_STRING:
                {
                alt48=3;
                }
                break;
            case 35:
                {
                int LA48_4 = input.LA(2);

                if ( (LA48_4==RULE_NATURAL) ) {
                    int LA48_5 = input.LA(3);

                    if ( (LA48_5==EOF||(LA48_5>=RULE_ID && LA48_5<=RULE_CONSTRAINT)||LA48_5==17||LA48_5==20||LA48_5==27||LA48_5==29||LA48_5==35||LA48_5==38||(LA48_5>=45 && LA48_5<=46)) ) {
                        alt48=4;
                    }
                    else if ( (LA48_5==34) ) {
                        alt48=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA48_5 = input.LA(2);

                if ( (LA48_5==EOF||(LA48_5>=RULE_ID && LA48_5<=RULE_CONSTRAINT)||LA48_5==17||LA48_5==20||LA48_5==27||LA48_5==29||LA48_5==35||LA48_5==38||(LA48_5>=45 && LA48_5<=46)) ) {
                    alt48=4;
                }
                else if ( (LA48_5==34) ) {
                    alt48=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt48=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2063:6: this_NULL_0= RULE_NULL
                    {
                    this_NULL_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleImplicitValue4269); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_0, grammarAccess.getImplicitValueAccess().getNULLTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2071:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleImplicitValue4295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_1, grammarAccess.getImplicitValueAccess().getBOOLEANTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2079:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitValue4321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_2, grammarAccess.getImplicitValueAccess().getSTRINGTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2088:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImplicitValueAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleImplicitValue4354);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2100:5: this_Real_4= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImplicitValueAccess().getRealParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleImplicitValue4387);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2111:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplicitValue4413); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2126:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2127:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2128:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4458);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation4468); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2135:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2138:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2139:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2139:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2139:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleAnnotation4505); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2143:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2144:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2144:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2145:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation4526);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2161:2: ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==28) && (synpred14_InternalClassmodel())) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2161:3: ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2161:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2161:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleAnnotation4547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2166:2: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2167:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2167:1: (lv_parameter_3_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2168:3: lv_parameter_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4569);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2184:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==20) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2184:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleAnnotation4582); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2188:1: ( (lv_parameter_5_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2189:1: (lv_parameter_5_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2189:1: (lv_parameter_5_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2190:3: lv_parameter_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4603);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleAnnotation4617); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2222:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2223:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2224:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4660);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4671); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2231:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2234:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2235:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2235:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt51=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==RULE_NATURAL) ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2==EOF) ) {
                        alt51=1;
                    }
                    else if ( (LA51_2==34) ) {
                        alt51=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA51_2 = input.LA(2);

                if ( (LA51_2==EOF) ) {
                    alt51=1;
                }
                else if ( (LA51_2==34) ) {
                    alt51=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt51=2;
                }
                break;
            case RULE_ID:
                {
                alt51=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt51=4;
                }
                break;
            case RULE_NULL:
                {
                alt51=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2236:5: this_Integer_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue4718);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2247:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2256:5: this_ExtendedID_2= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue4777);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2267:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue4803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2275:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue4829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2284:5: this_Real_5= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleValue4862);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2302:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2303:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2304:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID4908);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID4919); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2311:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2314:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2315:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2315:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2315:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID4959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2322:1: (kw= '.' this_ID_2= RULE_ID )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==34) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2323:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleExtendedID4978); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID4993); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop52;
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


    // $ANTLR start "entryRuleReal"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2343:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2344:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2345:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal5041);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal5052); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2352:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2355:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2356:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2356:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2356:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2356:2: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==35) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2357:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleReal5091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5108); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,34,FOLLOW_34_in_ruleReal5126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                  
            }
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2382:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=36 && LA56_0<=37)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2382:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2382:2: (kw= 'e' | kw= 'E' )
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==36) ) {
                        alt54=1;
                    }
                    else if ( (LA54_0==37) ) {
                        alt54=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 0, input);

                        throw nvae;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2383:2: kw= 'e'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleReal5161); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2390:2: kw= 'E'
                            {
                            kw=(Token)match(input,37,FOLLOW_37_in_ruleReal5180); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2395:2: (kw= '+' | kw= '-' )
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==38) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==35) ) {
                        alt55=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 0, input);

                        throw nvae;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2396:2: kw= '+'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleReal5195); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2403:2: kw= '-'
                            {
                            kw=(Token)match(input,35,FOLLOW_35_in_ruleReal5214); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5230); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2423:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2424:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2425:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger5278);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger5289); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2432:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2435:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2436:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2436:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2436:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2436:2: (kw= '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==35) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2437:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleInteger5328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger5345); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2457:1: ruleRelationshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2459:28: ( ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2460:1: ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2460:1: ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) )
            int alt58=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt58=1;
                }
                break;
            case 40:
                {
                alt58=2;
                }
                break;
            case 41:
                {
                alt58=3;
                }
                break;
            case 42:
                {
                alt58=4;
                }
                break;
            case 43:
                {
                alt58=5;
                }
                break;
            case 44:
                {
                alt58=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2460:2: (enumLiteral_0= 'association' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2460:2: (enumLiteral_0= 'association' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2460:4: enumLiteral_0= 'association'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleRelationshipType5404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2466:6: (enumLiteral_1= 'depency' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2466:6: (enumLiteral_1= 'depency' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2466:8: enumLiteral_1= 'depency'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleRelationshipType5421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2472:6: (enumLiteral_2= 'generalization' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2472:6: (enumLiteral_2= 'generalization' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2472:8: enumLiteral_2= 'generalization'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_41_in_ruleRelationshipType5438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2478:6: (enumLiteral_3= 'realization' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2478:6: (enumLiteral_3= 'realization' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2478:8: enumLiteral_3= 'realization'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_42_in_ruleRelationshipType5455); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2484:6: (enumLiteral_4= 'aggregation' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2484:6: (enumLiteral_4= 'aggregation' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2484:8: enumLiteral_4= 'aggregation'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_43_in_ruleRelationshipType5472); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2490:6: (enumLiteral_5= 'composition' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2490:6: (enumLiteral_5= 'composition' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2490:8: enumLiteral_5= 'composition'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_44_in_ruleRelationshipType5489); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2500:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2502:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2503:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2503:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt59=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt59=1;
                }
                break;
            case 35:
                {
                alt59=2;
                }
                break;
            case 45:
                {
                alt59=3;
                }
                break;
            case 46:
                {
                alt59=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2503:2: (enumLiteral_0= '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2503:2: (enumLiteral_0= '+' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2503:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_38_in_ruleVisibility5534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2509:6: (enumLiteral_1= '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2509:6: (enumLiteral_1= '-' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2509:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleVisibility5551); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2515:6: (enumLiteral_2= '#' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2515:6: (enumLiteral_2= '#' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2515:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_45_in_ruleVisibility5568); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2521:6: (enumLiteral_3= '~' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2521:6: (enumLiteral_3= '~' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2521:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_46_in_ruleVisibility5585); if (state.failed) return current;
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
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:279:4: ( 'datatype' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:279:6: 'datatype'
        {
        match(input,15,FOLLOW_15_in_synpred1_InternalClassmodel591); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalClassmodel

    // $ANTLR start synpred2_InternalClassmodel
    public final void synpred2_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:341:4: ( 'package' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:341:6: 'package'
        {
        match(input,16,FOLLOW_16_in_synpred2_InternalClassmodel727); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalClassmodel

    // $ANTLR start synpred3_InternalClassmodel
    public final void synpred3_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:425:4: ( 'class' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:425:6: 'class'
        {
        match(input,18,FOLLOW_18_in_synpred3_InternalClassmodel897); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalClassmodel

    // $ANTLR start synpred4_InternalClassmodel
    public final void synpred4_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:448:3: ( ( ruleGeneralization ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:449:1: ( ruleGeneralization )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:449:1: ( ruleGeneralization )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:450:1: ruleGeneralization
        {
        pushFollow(FOLLOW_ruleGeneralization_in_synpred4_InternalClassmodel942);
        ruleGeneralization();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalClassmodel

    // $ANTLR start synpred5_InternalClassmodel
    public final void synpred5_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:739:4: ( 'enum' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:739:6: 'enum'
        {
        match(input,21,FOLLOW_21_in_synpred5_InternalClassmodel1547); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalClassmodel

    // $ANTLR start synpred6_InternalClassmodel
    public final void synpred6_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:841:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:841:6: '='
        {
        match(input,22,FOLLOW_22_in_synpred6_InternalClassmodel1741); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalClassmodel

    // $ANTLR start synpred7_InternalClassmodel
    public final void synpred7_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:921:4: ( 'interface' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:921:6: 'interface'
        {
        match(input,23,FOLLOW_23_in_synpred7_InternalClassmodel1901); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalClassmodel

    // $ANTLR start synpred8_InternalClassmodel
    public final void synpred8_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:944:3: ( ( ruleGeneralization ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:945:1: ( ruleGeneralization )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:945:1: ( ruleGeneralization )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:946:1: ruleGeneralization
        {
        pushFollow(FOLLOW_ruleGeneralization_in_synpred8_InternalClassmodel1946);
        ruleGeneralization();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalClassmodel

    // $ANTLR start synpred9_InternalClassmodel
    public final void synpred9_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1103:4: ( ( ruleRelationshipType ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1104:1: ( ruleRelationshipType )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1104:1: ( ruleRelationshipType )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1105:1: ruleRelationshipType
        {
        pushFollow(FOLLOW_ruleRelationshipType_in_synpred9_InternalClassmodel2272);
        ruleRelationshipType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalClassmodel

    // $ANTLR start synpred10_InternalClassmodel
    public final void synpred10_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1324:4: ( '..' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1324:6: '..'
        {
        match(input,25,FOLLOW_25_in_synpred10_InternalClassmodel2625); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalClassmodel

    // $ANTLR start synpred11_InternalClassmodel
    public final void synpred11_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1577:3: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1578:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1578:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1579:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred11_InternalClassmodel3232);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalClassmodel

    // $ANTLR start synpred12_InternalClassmodel
    public final void synpred12_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1708:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1708:6: '='
        {
        match(input,22,FOLLOW_22_in_synpred12_InternalClassmodel3474); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalClassmodel

    // $ANTLR start synpred13_InternalClassmodel
    public final void synpred13_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1887:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1887:6: '='
        {
        match(input,22,FOLLOW_22_in_synpred13_InternalClassmodel3872); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalClassmodel

    // $ANTLR start synpred14_InternalClassmodel
    public final void synpred14_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2161:4: ( '(' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2161:6: '('
        {
        match(input,28,FOLLOW_28_in_synpred14_InternalClassmodel4539); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalClassmodel

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
    public final boolean synpred13_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalClassmodel_fragment(); // can never throw exception
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
    public final boolean synpred14_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalClassmodel_fragment(); // can never throw exception
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
    static final String DFA3_eotS =
        "\126\uffff";
    static final String DFA3_eofS =
        "\126\uffff";
    static final String DFA3_minS =
        "\1\17\1\5\6\uffff\1\17\2\5\1\17\1\36\1\5\1\24\1\5\1\7\1\4\1\5\1"+
        "\17\1\24\1\40\4\24\1\7\2\24\1\36\1\4\1\7\1\5\4\24\1\7\3\24\1\7\2"+
        "\43\1\5\1\7\1\4\1\24\2\7\1\24\1\40\4\24\1\7\2\24\2\43\1\24\1\4\3"+
        "\7\4\24\1\7\3\24\1\7\2\43\1\24\2\7\2\43\1\24\2\7\1\24";
    static final String DFA3_maxS =
        "\1\54\1\5\6\uffff\1\54\2\5\1\54\1\36\1\5\1\42\1\5\1\40\1\43\1\5"+
        "\1\54\1\42\1\40\1\37\3\35\1\7\1\42\1\35\1\36\1\43\1\7\1\5\1\36\3"+
        "\35\1\7\1\42\1\45\1\42\1\7\2\46\1\5\1\40\1\43\1\45\2\7\1\42\1\40"+
        "\1\37\3\35\1\7\1\42\1\35\2\46\1\35\1\43\3\7\1\36\3\35\1\7\1\42\1"+
        "\45\1\35\1\7\2\46\1\45\2\7\2\46\1\35\2\7\1\35";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\116\uffff";
    static final String DFA3_specialS =
        "\126\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\6\1\uffff\1\7\11\uffff\1\1\5"+
            "\uffff\6\2",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\6\1\uffff\1\7\4\uffff\1\12"+
            "\4\uffff\1\1\1\11\4\uffff\6\2",
            "\1\13",
            "\1\14",
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\6\1\uffff\1\7\4\uffff\1\12"+
            "\4\uffff\1\1\1\11\4\uffff\6\2",
            "\1\15",
            "\1\16",
            "\1\22\1\uffff\1\21\6\uffff\1\23\1\uffff\1\20\2\uffff\1\17",
            "\1\24",
            "\1\25\30\uffff\1\26",
            "\1\31\1\34\1\uffff\1\33\1\27\1\30\31\uffff\1\32",
            "\1\35",
            "\1\5\1\4\1\uffff\1\3\2\uffff\1\6\1\uffff\1\7\11\uffff\1\1"+
            "\5\uffff\6\2",
            "\1\22\1\uffff\1\21\6\uffff\1\23\1\uffff\1\20\2\uffff\1\17",
            "\1\26",
            "\1\22\1\uffff\1\21\6\uffff\1\23\1\uffff\1\20",
            "\1\36\10\uffff\1\23",
            "\1\36\10\uffff\1\23",
            "\1\36\10\uffff\1\23",
            "\1\33",
            "\1\36\10\uffff\1\23\4\uffff\1\37",
            "\1\36\10\uffff\1\23",
            "\1\40",
            "\1\44\1\41\1\uffff\1\46\1\42\1\43\31\uffff\1\45",
            "\1\47",
            "\1\50",
            "\1\36\10\uffff\1\23\1\40",
            "\1\36\10\uffff\1\23",
            "\1\36\10\uffff\1\23",
            "\1\36\10\uffff\1\23",
            "\1\46",
            "\1\36\10\uffff\1\23\4\uffff\1\51",
            "\1\36\10\uffff\1\23\6\uffff\1\52\1\53",
            "\1\22\1\uffff\1\56\6\uffff\1\23\1\uffff\1\55\2\uffff\1\54",
            "\1\57",
            "\1\61\2\uffff\1\60",
            "\1\61\2\uffff\1\60",
            "\1\62",
            "\1\63\30\uffff\1\64",
            "\1\67\1\72\1\uffff\1\71\1\65\1\66\31\uffff\1\70",
            "\1\36\10\uffff\1\23\6\uffff\1\73\1\74",
            "\1\75",
            "\1\75",
            "\1\22\1\uffff\1\56\6\uffff\1\23\1\uffff\1\55\2\uffff\1\54",
            "\1\64",
            "\1\22\1\uffff\1\56\6\uffff\1\23\1\uffff\1\55",
            "\1\76\10\uffff\1\23",
            "\1\76\10\uffff\1\23",
            "\1\76\10\uffff\1\23",
            "\1\71",
            "\1\76\10\uffff\1\23\4\uffff\1\77",
            "\1\76\10\uffff\1\23",
            "\1\101\2\uffff\1\100",
            "\1\101\2\uffff\1\100",
            "\1\36\10\uffff\1\23",
            "\1\105\1\102\1\uffff\1\107\1\103\1\104\31\uffff\1\106",
            "\1\110",
            "\1\111",
            "\1\111",
            "\1\76\10\uffff\1\23\1\40",
            "\1\76\10\uffff\1\23",
            "\1\76\10\uffff\1\23",
            "\1\76\10\uffff\1\23",
            "\1\107",
            "\1\76\10\uffff\1\23\4\uffff\1\112",
            "\1\76\10\uffff\1\23\6\uffff\1\113\1\114",
            "\1\36\10\uffff\1\23",
            "\1\115",
            "\1\117\2\uffff\1\116",
            "\1\117\2\uffff\1\116",
            "\1\76\10\uffff\1\23\6\uffff\1\120\1\121",
            "\1\122",
            "\1\122",
            "\1\124\2\uffff\1\123",
            "\1\124\2\uffff\1\123",
            "\1\76\10\uffff\1\23",
            "\1\125",
            "\1\125",
            "\1\76\10\uffff\1\23"
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
            return "181:1: (this_Relationship_0= ruleRelationship | this_Classifier_1= ruleClassifier | this_Package_2= rulePackage | this_Datatype_3= ruleDatatype | this_Enumeration_4= ruleEnumeration | this_Interface_5= ruleInterface )";
        }
    }
    static final String DFA13_eotS =
        "\17\uffff";
    static final String DFA13_eofS =
        "\17\uffff";
    static final String DFA13_minS =
        "\6\5\1\26\4\5\1\34\3\uffff";
    static final String DFA13_maxS =
        "\6\56\1\36\4\56\1\36\3\uffff";
    static final String DFA13_acceptS =
        "\14\uffff\1\2\1\1\1\3";
    static final String DFA13_specialS =
        "\17\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\6\25\uffff\1\5\7\uffff\1\2\2\uffff\1\1\6\uffff\1\3\1\4",
            "\1\6\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\16\5\uffff\1\14\1\uffff\1\15",
            "\1\13\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\25\uffff\1\5\7\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\14\1\uffff\1\15",
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
            return "653:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x00001F8200A5C002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel153 = new BitSet(new long[]{0x00001F8200A58002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_ruleElement352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleElement379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleElement406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleElement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleElement460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_ruleElement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDatatype578 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_15_in_ruleDatatype599 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePackage714 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_16_in_rulePackage735 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage753 = new BitSet(new long[]{0x00001F8200A78000L});
    public static final BitSet FOLLOW_ruleElement_in_rulePackage779 = new BitSet(new long[]{0x00001F8200A78000L});
    public static final BitSet FOLLOW_17_in_rulePackage792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleClassifier884 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_18_in_ruleClassifier905 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier923 = new BitSet(new long[]{0x00006048080A0060L});
    public static final BitSet FOLLOW_ruleGeneralization_in_ruleClassifier959 = new BitSet(new long[]{0x0000604808020060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleClassifier977 = new BitSet(new long[]{0x0000604808020020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleClassifier1004 = new BitSet(new long[]{0x0000604808020020L});
    public static final BitSet FOLLOW_17_in_ruleClassifier1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_entryRuleGeneralization1053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralization1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGeneralization1100 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleGeneralization1121 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleGeneralization1134 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleGeneralization1155 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleType1249 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleType1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleFeature1365 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFeature1392 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleFeature1419 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleFeature1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEnumeration1534 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_21_in_ruleEnumeration1555 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1573 = new BitSet(new long[]{0x0000000000020060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleEnumeration1595 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_ruleEnumerator_in_ruleEnumeration1622 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_17_in_ruleEnumeration1635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_entryRuleEnumerator1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerator1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerator1723 = new BitSet(new long[]{0x0000000000400042L});
    public static final BitSet FOLLOW_22_in_ruleEnumerator1749 = new BitSet(new long[]{0x00000008000003B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleEnumerator1771 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleEnumerator1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterface_in_entryRuleInterface1832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterface1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleInterface1888 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_23_in_ruleInterface1909 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInterface1927 = new BitSet(new long[]{0x00006048080A0060L});
    public static final BitSet FOLLOW_ruleGeneralization_in_ruleInterface1963 = new BitSet(new long[]{0x0000604808020060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleInterface1981 = new BitSet(new long[]{0x0000604808020020L});
    public static final BitSet FOLLOW_ruleInterfaceFeature_in_ruleInterface2008 = new BitSet(new long[]{0x0000604808020020L});
    public static final BitSet FOLLOW_17_in_ruleInterface2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInterfaceFeature_in_entryRuleInterfaceFeature2057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceFeature2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleInterfaceFeature2115 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleInterfaceFeature2142 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleInterfaceFeature2159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship2201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleRelationship2257 = new BitSet(new long[]{0x00001F8200000000L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_ruleRelationship2289 = new BitSet(new long[]{0x00006048050000B0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelationship2306 = new BitSet(new long[]{0x00006048050000A0L});
    public static final BitSet FOLLOW_24_in_ruleRelationship2330 = new BitSet(new long[]{0x00006048040000A0L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleRelationship2365 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleRelationship2387 = new BitSet(new long[]{0x00006048050000B0L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelationship2404 = new BitSet(new long[]{0x00006048050000A0L});
    public static final BitSet FOLLOW_24_in_ruleRelationship2428 = new BitSet(new long[]{0x00006048040000A0L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleRelationship2463 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleRelationship2485 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelationship2502 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRelationship2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity2556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2612 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleMultiplicity2633 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue2694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityValue2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleMultiplicityValue2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMultiplicityValue2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleConstant2865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2883 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleConstant2900 = new BitSet(new long[]{0x00000008000003B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleConstant2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleOperation3058 = new BitSet(new long[]{0x0000604808000020L});
    public static final BitSet FOLLOW_27_in_ruleOperation3130 = new BitSet(new long[]{0x0000604808000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation3200 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleOperation3217 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation3249 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleOperation3262 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation3283 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleOperation3299 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleOperation3312 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOperation3333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3423 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleParameter3440 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter3461 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleParameter3482 = new BitSet(new long[]{0x00000008000003B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleParameter3504 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleParameter3517 = new BitSet(new long[]{0x00000008000003B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleParameter3538 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAttribute3679 = new BitSet(new long[]{0x0000604808000020L});
    public static final BitSet FOLLOW_27_in_ruleAttribute3751 = new BitSet(new long[]{0x0000604808000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute3821 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAttribute3838 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttribute3859 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAttribute3880 = new BitSet(new long[]{0x00000008000003B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleAttribute3902 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAttribute3915 = new BitSet(new long[]{0x00000008000003B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleAttribute3936 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference3976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleReference4032 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleReference4053 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray4090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleArray4146 = new BitSet(new long[]{0x0000000100000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleArray4163 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleArray4181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue4218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitValue4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleImplicitValue4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleImplicitValue4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitValue4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleImplicitValue4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleImplicitValue4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplicitValue4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAnnotation4505 = new BitSet(new long[]{0x0000604800000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation4526 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleAnnotation4547 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4569 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleAnnotation4582 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4603 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleAnnotation4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID4908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID4959 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleExtendedID4978 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID4993 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal5041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal5052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleReal5091 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5108 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleReal5126 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5141 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_36_in_ruleReal5161 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_37_in_ruleReal5180 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_38_in_ruleReal5195 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_35_in_ruleReal5214 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger5278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInteger5328 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger5345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRelationshipType5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRelationshipType5421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRelationshipType5438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationshipType5455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRelationshipType5472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRelationshipType5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVisibility5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVisibility5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVisibility5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVisibility5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalClassmodel591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred2_InternalClassmodel727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred3_InternalClassmodel897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_synpred4_InternalClassmodel942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred5_InternalClassmodel1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred6_InternalClassmodel1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred7_InternalClassmodel1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_synpred8_InternalClassmodel1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_synpred9_InternalClassmodel2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred10_InternalClassmodel2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred11_InternalClassmodel3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred12_InternalClassmodel3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred13_InternalClassmodel3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_synpred14_InternalClassmodel4539 = new BitSet(new long[]{0x0000000000000002L});

}

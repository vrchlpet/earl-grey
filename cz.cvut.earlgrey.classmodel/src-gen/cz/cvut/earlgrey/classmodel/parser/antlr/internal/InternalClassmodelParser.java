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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CONSTRAINT", "RULE_NATURAL", "RULE_BODY", "RULE_NULL", "RULE_BOOLEAN", "RULE_OPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'datatype'", "'package'", "'end'", "'class'", "'isA'", "','", "'enum'", "'='", "'unnavigable'", "':'", "'['", "']'", "'..'", "'*'", "'static'", "'('", "')'", "'@'", "'.'", "'-'", "'e'", "'E'", "'+'", "'association'", "'depency'", "'generalization'", "'realization'", "'aggregation'", "'composition'", "'#'", "'~'"
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:177:1: ruleElement returns [EObject current=null] : (this_Relationship_0= ruleRelationship | this_Package_1= rulePackage | this_Entity_2= ruleEntity ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Relationship_0 = null;

        EObject this_Package_1 = null;

        EObject this_Entity_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:180:28: ( (this_Relationship_0= ruleRelationship | this_Package_1= rulePackage | this_Entity_2= ruleEntity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:181:1: (this_Relationship_0= ruleRelationship | this_Package_1= rulePackage | this_Entity_2= ruleEntity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:181:1: (this_Relationship_0= ruleRelationship | this_Package_1= rulePackage | this_Entity_2= ruleEntity )
            int alt3=3;
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:192:5: this_Package_1= rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getPackageParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleElement379);
                    this_Package_1=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Package_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:202:5: this_Entity_2= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getEntityParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntity_in_ruleElement406);
                    this_Entity_2=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Entity_2; 
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


    // $ANTLR start "entryRuleEntity"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:218:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:219:2: (iv_ruleEntity= ruleEntity EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:220:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity441);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity451); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:227:1: ruleEntity returns [EObject current=null] : (this_Datatype_0= ruleDatatype | this_Classifier_1= ruleClassifier | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Datatype_0 = null;

        EObject this_Classifier_1 = null;

        EObject this_Enumeration_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:230:28: ( (this_Datatype_0= ruleDatatype | this_Classifier_1= ruleClassifier | this_Enumeration_2= ruleEnumeration ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:231:1: (this_Datatype_0= ruleDatatype | this_Classifier_1= ruleClassifier | this_Enumeration_2= ruleEnumeration )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:231:1: (this_Datatype_0= ruleDatatype | this_Classifier_1= ruleClassifier | this_Enumeration_2= ruleEnumeration )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:232:5: this_Datatype_0= ruleDatatype
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getDatatypeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDatatype_in_ruleEntity498);
                    this_Datatype_0=ruleDatatype();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Datatype_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:242:5: this_Classifier_1= ruleClassifier
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getClassifierParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassifier_in_ruleEntity525);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:252:5: this_Enumeration_2= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getEnumerationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumeration_in_ruleEntity552);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enumeration_2; 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleDatatype"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:268:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:269:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:270:2: iv_ruleDatatype= ruleDatatype EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDatatypeRule()); 
            }
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype587);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDatatype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype597); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:277:1: ruleDatatype returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        EObject lv_annotation_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:280:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:281:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:281:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:281:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'datatype' )=>otherlv_1= 'datatype' ) ( (lv_name_2_0= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:281:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==34) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:282:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:282:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:283:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDatatypeAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDatatype643);
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
            	    break loop5;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:299:3: ( ( 'datatype' )=>otherlv_1= 'datatype' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:299:4: ( 'datatype' )=>otherlv_1= 'datatype'
            {
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleDatatype664); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDatatypeAccess().getDatatypeKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:304:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:305:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:305:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:306:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatatype682); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:330:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:331:2: (iv_rulePackage= rulePackage EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:332:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage723);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage733); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:339:1: rulePackage returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:342:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:343:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:343:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:343:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'package' )=>otherlv_1= 'package' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_element_3_0= ruleElement ) )* otherlv_4= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:343:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:344:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:344:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:345:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_rulePackage779);
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
            	    break loop6;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:361:3: ( ( 'package' )=>otherlv_1= 'package' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:361:4: ( 'package' )=>otherlv_1= 'package'
            {
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_rulePackage800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:366:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:367:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:367:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:368:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage818); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:384:2: ( (lv_element_3_0= ruleElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=18)||LA7_0==20||LA7_0==23||LA7_0==34||(LA7_0>=40 && LA7_0<=45)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:385:1: (lv_element_3_0= ruleElement )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:385:1: (lv_element_3_0= ruleElement )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:386:3: lv_element_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getElementElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_rulePackage844);
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
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_rulePackage857); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:414:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:415:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:416:2: iv_ruleClassifier= ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier893);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier903); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:423:1: ruleClassifier returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( (lv_constraint_7_0= RULE_CONSTRAINT ) )? ( (lv_feature_8_0= ruleFeature ) )* otherlv_9= 'end' ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_constraint_7_0=null;
        Token otherlv_9=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;

        EObject lv_feature_8_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:426:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( (lv_constraint_7_0= RULE_CONSTRAINT ) )? ( (lv_feature_8_0= ruleFeature ) )* otherlv_9= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( (lv_constraint_7_0= RULE_CONSTRAINT ) )? ( (lv_feature_8_0= ruleFeature ) )* otherlv_9= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( (lv_constraint_7_0= RULE_CONSTRAINT ) )? ( (lv_feature_8_0= ruleFeature ) )* otherlv_9= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( (lv_constraint_7_0= RULE_CONSTRAINT ) )? ( (lv_feature_8_0= ruleFeature ) )* otherlv_9= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:428:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:428:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:429:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleClassifier949);
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
            	    break loop8;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:445:3: ( ( 'class' )=>otherlv_1= 'class' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:445:4: ( 'class' )=>otherlv_1= 'class'
            {
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleClassifier970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassifierAccess().getClassKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:450:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:451:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:451:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:452:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClassifier988); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:468:2: ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) && (synpred4_InternalClassmodel())) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:468:3: ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:468:3: ( ( 'isA' )=>otherlv_3= 'isA' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:468:4: ( 'isA' )=>otherlv_3= 'isA'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleClassifier1014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getClassifierAccess().getIsAKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:473:2: ( (lv_generalization_4_0= ruleType ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:474:1: (lv_generalization_4_0= ruleType )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:474:1: (lv_generalization_4_0= ruleType )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:475:3: lv_generalization_4_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassifierAccess().getGeneralizationTypeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleClassifier1036);
                    lv_generalization_4_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
                      	        }
                             		add(
                             			current, 
                             			"generalization",
                              		lv_generalization_4_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:491:2: (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:491:4: otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleClassifier1049); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getClassifierAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:495:1: ( (lv_generalization_6_0= ruleType ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:496:1: (lv_generalization_6_0= ruleType )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:496:1: (lv_generalization_6_0= ruleType )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:497:3: lv_generalization_6_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassifierAccess().getGeneralizationTypeParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleType_in_ruleClassifier1070);
                    	    lv_generalization_6_0=ruleType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"generalization",
                    	              		lv_generalization_6_0, 
                    	              		"Type");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:6: ( (lv_constraint_7_0= RULE_CONSTRAINT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_CONSTRAINT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:514:1: (lv_constraint_7_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:514:1: (lv_constraint_7_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:515:3: lv_constraint_7_0= RULE_CONSTRAINT
                    {
                    lv_constraint_7_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleClassifier1091); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_7_0, grammarAccess.getClassifierAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassifierRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"constraint",
                              		lv_constraint_7_0, 
                              		"CONSTRAINT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:531:3: ( (lv_feature_8_0= ruleFeature ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==31||LA12_0==36||LA12_0==39||(LA12_0>=46 && LA12_0<=47)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:532:1: (lv_feature_8_0= ruleFeature )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:532:1: (lv_feature_8_0= ruleFeature )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:533:3: lv_feature_8_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getFeatureFeatureParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleClassifier1118);
            	    lv_feature_8_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"feature",
            	              		lv_feature_8_0, 
            	              		"Feature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleClassifier1131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getClassifierAccess().getEndKeyword_6());
                  
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


    // $ANTLR start "entryRuleType"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:561:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:562:2: (iv_ruleType= ruleType EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:563:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1167);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1177); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:570:1: ruleType returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:573:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:574:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:574:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:574:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:574:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36||LA13_0==39||(LA13_0>=46 && LA13_0<=47)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:575:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:575:1: (lv_visibility_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:576:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleType1223);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:592:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:593:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:593:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:594:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameEntityCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleType1247);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:615:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:616:2: (iv_ruleFeature= ruleFeature EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:617:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1283);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1293); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:624:1: ruleFeature returns [EObject current=null] : ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_3_0=null;
        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Constant_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:627:28: ( ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:628:1: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:628:1: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:628:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:628:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:629:5: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleFeature1341);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:639:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleFeature1368);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:649:5: this_Constant_2= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getConstantParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleFeature1395);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:657:2: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_CONSTRAINT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:658:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:658:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:659:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleFeature1412); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:683:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:684:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:685:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1454);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1464); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:692:1: ruleEnumeration returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:695:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:696:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:696:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:696:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_4_0= ruleEnumerator ) )* otherlv_5= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:696:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:697:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:697:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:698:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEnumeration1510);
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
            	    break loop16;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:714:3: ( ( 'enum' )=>otherlv_1= 'enum' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:714:4: ( 'enum' )=>otherlv_1= 'enum'
            {
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleEnumeration1531); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:719:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:720:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:720:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:721:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1549); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:737:2: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_CONSTRAINT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:738:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:738:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:739:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleEnumeration1571); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:755:3: ( (lv_enumerator_4_0= ruleEnumerator ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:756:1: (lv_enumerator_4_0= ruleEnumerator )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:756:1: (lv_enumerator_4_0= ruleEnumerator )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:757:3: lv_enumerator_4_0= ruleEnumerator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumeratorEnumeratorParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumerator_in_ruleEnumeration1598);
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
            	    break loop18;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEnumeration1611); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:785:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:786:2: (iv_ruleEnumerator= ruleEnumerator EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:787:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratorRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerator_in_entryRuleEnumerator1647);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerator1657); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:794:1: ruleEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_constraint_3_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:797:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:798:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:798:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:798:2: ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:798:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:799:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:799:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:800:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerator1699); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:816:2: ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) && (synpred6_InternalClassmodel())) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:816:3: ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:816:3: ( ( '=' )=>otherlv_1= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:816:4: ( '=' )=>otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEnumerator1725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:821:2: ( (lv_value_2_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:822:1: (lv_value_2_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:822:1: (lv_value_2_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:823:3: lv_value_2_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumeratorAccess().getValueImplicitValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleEnumerator1747);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:839:4: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_CONSTRAINT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:840:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:840:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:841:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleEnumerator1766); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:865:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:866:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:867:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship1808);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship1818); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:874:1: ruleRelationship returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token lv_headNavigable_3_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_tailNavigable_11_0=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_annotation_0_0 = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        Enumerator lv_headVisibility_4_0 = null;

        AntlrDatatypeRuleToken lv_headLabel_5_0 = null;

        EObject lv_headMultiplicity_9_0 = null;

        Enumerator lv_tailVisibility_12_0 = null;

        AntlrDatatypeRuleToken lv_tailLabel_13_0 = null;

        EObject lv_tailMultiplicity_17_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:877:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:878:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:878:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:878:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:878:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:879:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:879:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:880:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationshipAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleRelationship1864);
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
            	    break loop21;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:896:3: ( ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:896:4: ( ( ruleRelationshipType ) )=> (lv_type_1_0= ruleRelationshipType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:901:1: (lv_type_1_0= ruleRelationshipType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:902:3: lv_type_1_0= ruleRelationshipType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRelationshipType_in_ruleRelationship1896);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:918:2: ( (lv_label_2_0= ruleCompositeID ) )?
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:919:1: (lv_label_2_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:919:1: (lv_label_2_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:920:3: lv_label_2_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getLabelCompositeIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleRelationship1917);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:936:3: ( (lv_headNavigable_3_0= 'unnavigable' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==25) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:937:1: (lv_headNavigable_3_0= 'unnavigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:937:1: (lv_headNavigable_3_0= 'unnavigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:938:3: lv_headNavigable_3_0= 'unnavigable'
                    {
                    lv_headNavigable_3_0=(Token)match(input,25,FOLLOW_25_in_ruleRelationship1936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_headNavigable_3_0, grammarAccess.getRelationshipAccess().getHeadNavigableUnnavigableKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(current, "headNavigable", true, "unnavigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:951:3: ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:951:4: ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:951:4: ( (lv_headVisibility_4_0= ruleVisibility ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==36||LA24_0==39||(LA24_0>=46 && LA24_0<=47)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:952:1: (lv_headVisibility_4_0= ruleVisibility )
                            {
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:952:1: (lv_headVisibility_4_0= ruleVisibility )
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:953:3: lv_headVisibility_4_0= ruleVisibility
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadVisibilityVisibilityEnumRuleCall_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisibility_in_ruleRelationship1972);
                            lv_headVisibility_4_0=ruleVisibility();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"headVisibility",
                                      		lv_headVisibility_4_0, 
                                      		"Visibility");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:969:3: ( (lv_headLabel_5_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:970:1: (lv_headLabel_5_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:970:1: (lv_headLabel_5_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:971:3: lv_headLabel_5_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadLabelCompositeIDParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleRelationship1994);
                    lv_headLabel_5_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                      	        }
                             		set(
                             			current, 
                             			"headLabel",
                              		lv_headLabel_5_0, 
                              		"CompositeID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleRelationship2006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getColonKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:991:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:992:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:992:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:993:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadEntityCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleRelationship2031);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleRelationship2043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_6());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1010:1: ( (lv_headMultiplicity_9_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1011:1: (lv_headMultiplicity_9_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1011:1: (lv_headMultiplicity_9_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1012:3: lv_headMultiplicity_9_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getHeadMultiplicityMultiplicityParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleRelationship2064);
            lv_headMultiplicity_9_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"headMultiplicity",
                      		lv_headMultiplicity_9_0, 
                      		"Multiplicity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleRelationship2076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_8());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1032:1: ( (lv_tailNavigable_11_0= 'unnavigable' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1033:1: (lv_tailNavigable_11_0= 'unnavigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1033:1: (lv_tailNavigable_11_0= 'unnavigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1034:3: lv_tailNavigable_11_0= 'unnavigable'
                    {
                    lv_tailNavigable_11_0=(Token)match(input,25,FOLLOW_25_in_ruleRelationship2094); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_tailNavigable_11_0, grammarAccess.getRelationshipAccess().getTailNavigableUnnavigableKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                             		setWithLastConsumed(current, "tailNavigable", true, "unnavigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1047:3: ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1047:4: ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1047:4: ( (lv_tailVisibility_12_0= ruleVisibility ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==36||LA27_0==39||(LA27_0>=46 && LA27_0<=47)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1048:1: (lv_tailVisibility_12_0= ruleVisibility )
                            {
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1048:1: (lv_tailVisibility_12_0= ruleVisibility )
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1049:3: lv_tailVisibility_12_0= ruleVisibility
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailVisibilityVisibilityEnumRuleCall_10_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisibility_in_ruleRelationship2130);
                            lv_tailVisibility_12_0=ruleVisibility();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"tailVisibility",
                                      		lv_tailVisibility_12_0, 
                                      		"Visibility");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1065:3: ( (lv_tailLabel_13_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1066:1: (lv_tailLabel_13_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1066:1: (lv_tailLabel_13_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1067:3: lv_tailLabel_13_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailLabelCompositeIDParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleRelationship2152);
                    lv_tailLabel_13_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
                      	        }
                             		set(
                             			current, 
                             			"tailLabel",
                              		lv_tailLabel_13_0, 
                              		"CompositeID");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleRelationship2164); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getRelationshipAccess().getColonKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1087:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1088:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1088:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1089:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailEntityCrossReference_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleRelationship2189);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_16=(Token)match(input,27,FOLLOW_27_in_ruleRelationship2201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_12());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1106:1: ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1107:1: (lv_tailMultiplicity_17_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1107:1: (lv_tailMultiplicity_17_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1108:3: lv_tailMultiplicity_17_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTailMultiplicityMultiplicityParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleRelationship2222);
            lv_tailMultiplicity_17_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"tailMultiplicity",
                      		lv_tailMultiplicity_17_0, 
                      		"Multiplicity");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_18=(Token)match(input,28,FOLLOW_28_in_ruleRelationship2234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_14());
                  
            }
            otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleRelationship2246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_19, grammarAccess.getRelationshipAccess().getEndKeyword_15());
                  
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1140:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1141:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1142:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity2282);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity2292); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1149:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_upper_0_0 = null;

        AntlrDatatypeRuleToken lv_lower_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1152:28: ( ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1153:1: ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1153:1: ( ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1153:2: ( (lv_upper_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1153:2: ( (lv_upper_0_0= ruleMultiplicityValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1154:1: (lv_upper_0_0= ruleMultiplicityValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1154:1: (lv_upper_0_0= ruleMultiplicityValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1155:3: lv_upper_0_0= ruleMultiplicityValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperMultiplicityValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2338);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1171:2: ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) && (synpred8_InternalClassmodel())) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1171:3: ( ( '..' )=>otherlv_1= '..' ) ( (lv_lower_2_0= ruleMultiplicityValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1171:3: ( ( '..' )=>otherlv_1= '..' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1171:4: ( '..' )=>otherlv_1= '..'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleMultiplicity2359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1176:2: ( (lv_lower_2_0= ruleMultiplicityValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1177:1: (lv_lower_2_0= ruleMultiplicityValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1177:1: (lv_lower_2_0= ruleMultiplicityValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1178:3: lv_lower_2_0= ruleMultiplicityValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerMultiplicityValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2381);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1202:1: entryRuleMultiplicityValue returns [String current=null] : iv_ruleMultiplicityValue= ruleMultiplicityValue EOF ;
    public final String entryRuleMultiplicityValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicityValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1203:2: (iv_ruleMultiplicityValue= ruleMultiplicityValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1204:2: iv_ruleMultiplicityValue= ruleMultiplicityValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue2420);
            iv_ruleMultiplicityValue=ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityValue2431); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1211:1: ruleMultiplicityValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicityValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1214:28: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1215:1: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1215:1: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_NATURAL) ) {
                alt30=1;
            }
            else if ( (LA30_0==30) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1215:6: this_NATURAL_0= RULE_NATURAL
                    {
                    this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleMultiplicityValue2471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_0, grammarAccess.getMultiplicityValueAccess().getNATURALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1224:2: kw= '*'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleMultiplicityValue2495); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1237:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1238:2: (iv_ruleConstant= ruleConstant EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1239:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2535);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2545); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1246:1: ruleConstant returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1249:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1250:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1250:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1250:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1250:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36||LA31_0==39||(LA31_0>=46 && LA31_0<=47)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1251:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1251:1: (lv_visibility_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1252:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleConstant2591);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1268:3: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1269:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1269:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1270:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant2609); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleConstant2626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1290:1: ( (lv_value_3_0= ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1291:1: (lv_value_3_0= ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1291:1: (lv_value_3_0= ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1292:3: lv_value_3_0= ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getValueImplicitValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_ruleConstant2647);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1316:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1317:2: (iv_ruleOperation= ruleOperation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1318:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation2683);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation2693); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1325:1: ruleOperation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1328:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1329:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1329:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1329:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1329:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1331:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1331:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1332:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1335:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1336:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1336:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop32:
            do {
                int alt32=3;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==36||LA32_0==39|| LA32_0 >=46 && LA32_0<=47) && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                    alt32=2;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1338:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1338:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1339:5: {...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1339:106: ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1340:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1343:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1343:7: {...}? => ( (lv_visibility_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1343:16: ( (lv_visibility_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1344:1: (lv_visibility_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1344:1: (lv_visibility_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1345:3: lv_visibility_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleOperation2784);
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
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1368:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1368:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1369:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1369:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1370:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1373:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1373:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1373:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1374:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1374:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1375:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,31,FOLLOW_31_in_ruleOperation2856); if (state.failed) return current;
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
            	    break loop32;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1402:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1403:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1403:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1404:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation2926); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,32,FOLLOW_32_in_ruleOperation2943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1424:1: ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) && (synpred9_InternalClassmodel())) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1424:2: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1424:2: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1424:3: ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1429:1: (lv_parameter_5_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1430:3: lv_parameter_5_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperation2975);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1446:2: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==22) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1446:4: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleOperation2988); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1450:1: ( (lv_parameter_7_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1451:1: (lv_parameter_7_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1451:1: (lv_parameter_7_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1452:3: lv_parameter_7_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperation3009);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleOperation3025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1472:1: (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1472:3: otherlv_9= ':' ( (lv_return_10_0= ruleReference ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleOperation3038); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_5_0());
                          
                    }
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1476:1: ( (lv_return_10_0= ruleReference ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1477:1: (lv_return_10_0= ruleReference )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1477:1: (lv_return_10_0= ruleReference )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1478:3: lv_return_10_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleOperation3059);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1494:4: ( (lv_body_11_0= RULE_BODY ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_BODY) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1495:1: (lv_body_11_0= RULE_BODY )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1495:1: (lv_body_11_0= RULE_BODY )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1496:3: lv_body_11_0= RULE_BODY
                    {
                    lv_body_11_0=(Token)match(input,RULE_BODY,FOLLOW_RULE_BODY_in_ruleOperation3078); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1520:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1521:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1522:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter3120);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter3130); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1529:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1532:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1533:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1533:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1533:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1533:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1534:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1534:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1535:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter3172); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleParameter3189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1555:1: ( (lv_type_2_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1556:1: (lv_type_2_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1556:1: (lv_type_2_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1557:3: lv_type_2_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleParameter3210);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1573:2: ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) && (synpred10_InternalClassmodel())) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1573:3: ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1573:3: ( ( '=' )=>otherlv_3= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1573:4: ( '=' )=>otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleParameter3231); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1578:2: ( (lv_implicit_4_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1579:1: (lv_implicit_4_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1579:1: (lv_implicit_4_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1580:3: lv_implicit_4_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleParameter3253);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1596:2: (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==22) ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1==RULE_ID) ) {
                                int LA37_3 = input.LA(3);

                                if ( (LA37_3==EOF||LA37_3==22||LA37_3==33) ) {
                                    alt37=1;
                                }


                            }
                            else if ( (LA37_1==RULE_STRING||LA37_1==RULE_NATURAL||(LA37_1>=RULE_NULL && LA37_1<=RULE_BOOLEAN)||LA37_1==36) ) {
                                alt37=1;
                            }


                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1596:4: otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleParameter3266); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1600:1: ( (lv_implicit_6_0= ruleImplicitValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1601:1: (lv_implicit_6_0= ruleImplicitValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1601:1: (lv_implicit_6_0= ruleImplicitValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1602:3: lv_implicit_6_0= ruleImplicitValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImplicitValue_in_ruleParameter3287);
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAttribute"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1626:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1627:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1628:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute3327);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute3337); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1635:1: ruleAttribute returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1638:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1639:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1639:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1639:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1639:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1641:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1641:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1642:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1645:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1646:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1646:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==36||LA39_0==39|| LA39_0 >=46 && LA39_0<=47) && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1648:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1648:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1649:5: {...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1649:106: ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1650:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1653:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1653:7: {...}? => ( (lv_visibility_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1653:16: ( (lv_visibility_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1654:1: (lv_visibility_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1654:1: (lv_visibility_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1655:3: lv_visibility_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleAttribute3428);
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
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1678:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1678:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1679:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1679:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1680:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1683:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1683:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1683:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1684:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1684:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1685:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,31,FOLLOW_31_in_ruleAttribute3500); if (state.failed) return current;
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
            	    break loop39;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1712:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1713:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1713:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1714:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute3570); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleAttribute3587); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1734:1: ( (lv_type_5_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1735:1: (lv_type_5_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1735:1: (lv_type_5_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1736:3: lv_type_5_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleAttribute3608);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1752:2: ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) && (synpred11_InternalClassmodel())) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1752:3: ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1752:3: ( ( '=' )=>otherlv_6= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1752:4: ( '=' )=>otherlv_6= '='
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleAttribute3629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1757:2: ( (lv_implicit_7_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1758:1: (lv_implicit_7_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1758:1: (lv_implicit_7_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1759:3: lv_implicit_7_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleAttribute3651);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1775:2: (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==22) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1775:4: otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleAttribute3664); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1779:1: ( (lv_implicit_9_0= ruleImplicitValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1780:1: (lv_implicit_9_0= ruleImplicitValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1780:1: (lv_implicit_9_0= ruleImplicitValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1781:3: lv_implicit_9_0= ruleImplicitValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImplicitValue_in_ruleAttribute3685);
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
                    	    break loop40;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1805:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1806:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1807:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference3725);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference3735); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1814:1: ruleReference returns [EObject current=null] : ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1817:28: ( ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1818:1: ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1818:1: ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1818:2: ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1818:2: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1819:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1819:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1820:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleReference3783);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1833:2: ( (lv_array_1_0= ruleArray ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==27) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1834:1: (lv_array_1_0= ruleArray )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1834:1: (lv_array_1_0= ruleArray )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1835:3: lv_array_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleReference3804);
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
            	    break loop42;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1859:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1860:2: (iv_ruleArray= ruleArray EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1861:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3841);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3851); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1868:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_size_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1871:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1872:1: ( () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1872:1: ( () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1872:2: () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1872:2: ()
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1873:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayAccess().getArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleArray3897); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1882:1: ( (lv_size_2_0= ruleMultiplicity ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_NATURAL||LA43_0==30) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1883:1: (lv_size_2_0= ruleMultiplicity )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1883:1: (lv_size_2_0= ruleMultiplicity )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1884:3: lv_size_2_0= ruleMultiplicity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayAccess().getSizeMultiplicityParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleArray3918);
                    lv_size_2_0=ruleMultiplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayRule());
                      	        }
                             		set(
                             			current, 
                             			"size",
                              		lv_size_2_0, 
                              		"Multiplicity");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleArray3931); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1912:1: entryRuleImplicitValue returns [String current=null] : iv_ruleImplicitValue= ruleImplicitValue EOF ;
    public final String entryRuleImplicitValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImplicitValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1913:2: (iv_ruleImplicitValue= ruleImplicitValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1914:2: iv_ruleImplicitValue= ruleImplicitValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicitValueRule()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue3968);
            iv_ruleImplicitValue=ruleImplicitValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicitValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitValue3979); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1921:1: ruleImplicitValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1924:28: ( (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1925:1: (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1925:1: (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID )
            int alt44=6;
            switch ( input.LA(1) ) {
            case RULE_NULL:
                {
                alt44=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt44=2;
                }
                break;
            case RULE_STRING:
                {
                alt44=3;
                }
                break;
            case 36:
                {
                int LA44_4 = input.LA(2);

                if ( (LA44_4==RULE_NATURAL) ) {
                    int LA44_5 = input.LA(3);

                    if ( (LA44_5==35) ) {
                        alt44=5;
                    }
                    else if ( (LA44_5==EOF||(LA44_5>=RULE_ID && LA44_5<=RULE_CONSTRAINT)||LA44_5==19||LA44_5==22||LA44_5==31||LA44_5==33||LA44_5==36||LA44_5==39||(LA44_5>=46 && LA44_5<=47)) ) {
                        alt44=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA44_5 = input.LA(2);

                if ( (LA44_5==35) ) {
                    alt44=5;
                }
                else if ( (LA44_5==EOF||(LA44_5>=RULE_ID && LA44_5<=RULE_CONSTRAINT)||LA44_5==19||LA44_5==22||LA44_5==31||LA44_5==33||LA44_5==36||LA44_5==39||(LA44_5>=46 && LA44_5<=47)) ) {
                    alt44=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt44=6;
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1925:6: this_NULL_0= RULE_NULL
                    {
                    this_NULL_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleImplicitValue4019); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_0, grammarAccess.getImplicitValueAccess().getNULLTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1933:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleImplicitValue4045); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_1, grammarAccess.getImplicitValueAccess().getBOOLEANTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1941:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitValue4071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_2, grammarAccess.getImplicitValueAccess().getSTRINGTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1950:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImplicitValueAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleImplicitValue4104);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1962:5: this_Real_4= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImplicitValueAccess().getRealParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleImplicitValue4137);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1973:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplicitValue4163); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1988:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1989:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1990:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation4208);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation4218); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1997:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2000:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2001:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2001:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2001:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleAnnotation4255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2005:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2006:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2006:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2007:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation4276);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2023:2: ( ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==32) && (synpred12_InternalClassmodel())) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2023:3: ( ( '(' )=>otherlv_2= '(' ) ( (lv_parameter_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2023:3: ( ( '(' )=>otherlv_2= '(' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2023:4: ( '(' )=>otherlv_2= '('
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleAnnotation4297); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2028:2: ( (lv_parameter_3_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2029:1: (lv_parameter_3_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2029:1: (lv_parameter_3_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2030:3: lv_parameter_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4319);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2046:2: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==22) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2046:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAnnotation4332); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2050:1: ( (lv_parameter_5_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2051:1: (lv_parameter_5_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2051:1: (lv_parameter_5_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2052:3: lv_parameter_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleAnnotation4353);
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
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleAnnotation4367); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2084:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2085:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2086:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4410);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4421); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2093:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2096:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2097:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2097:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt47=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_NATURAL) ) {
                    int LA47_2 = input.LA(3);

                    if ( (LA47_2==EOF) ) {
                        alt47=1;
                    }
                    else if ( (LA47_2==35) ) {
                        alt47=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA47_2 = input.LA(2);

                if ( (LA47_2==EOF) ) {
                    alt47=1;
                }
                else if ( (LA47_2==35) ) {
                    alt47=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt47=2;
                }
                break;
            case RULE_ID:
                {
                alt47=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt47=4;
                }
                break;
            case RULE_NULL:
                {
                alt47=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2098:5: this_Integer_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue4468);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2109:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4494); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2118:5: this_ExtendedID_2= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue4527);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2129:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue4553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2137:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue4579); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2146:5: this_Real_5= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleValue4612);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2164:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2165:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2166:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID4658);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID4669); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2173:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2176:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2177:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2177:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2177:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID4709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2184:1: (kw= '.' this_ID_2= RULE_ID )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==35) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2185:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleExtendedID4728); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID4743); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2207:1: entryRuleCompositeID returns [String current=null] : iv_ruleCompositeID= ruleCompositeID EOF ;
    public final String entryRuleCompositeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompositeID = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2208:2: (iv_ruleCompositeID= ruleCompositeID EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2209:2: iv_ruleCompositeID= ruleCompositeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeIDRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeID_in_entryRuleCompositeID4793);
            iv_ruleCompositeID=ruleCompositeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeID4804); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2216:1: ruleCompositeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleCompositeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_ExtendedID_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2219:28: ( (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2220:1: (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2220:1: (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_STRING) ) {
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2221:5: this_ExtendedID_0= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeIDAccess().getExtendedIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleCompositeID4851);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2232:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompositeID4877); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2247:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2248:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2249:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal4923);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal4934); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2256:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2259:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2260:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2260:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2260:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2260:2: (kw= '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==36) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2261:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleReal4973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal4990); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,35,FOLLOW_35_in_ruleReal5008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                  
            }
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2286:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=37 && LA53_0<=38)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2286:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2286:2: (kw= 'e' | kw= 'E' )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==37) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==38) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2287:2: kw= 'e'
                            {
                            kw=(Token)match(input,37,FOLLOW_37_in_ruleReal5043); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2294:2: kw= 'E'
                            {
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleReal5062); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2299:2: (kw= '+' | kw= '-' )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==39) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==36) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2300:2: kw= '+'
                            {
                            kw=(Token)match(input,39,FOLLOW_39_in_ruleReal5077); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2307:2: kw= '-'
                            {
                            kw=(Token)match(input,36,FOLLOW_36_in_ruleReal5096); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal5112); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2327:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2328:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2329:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger5160);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger5171); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2336:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2339:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2340:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2340:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2340:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2340:2: (kw= '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==36) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2341:2: kw= '-'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleInteger5210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger5227); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2361:1: ruleRelationshipType returns [Enumerator current=null] : ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2363:28: ( ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2364:1: ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2364:1: ( (enumLiteral_0= 'association' ) | (enumLiteral_1= 'depency' ) | (enumLiteral_2= 'generalization' ) | (enumLiteral_3= 'realization' ) | (enumLiteral_4= 'aggregation' ) | (enumLiteral_5= 'composition' ) )
            int alt55=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt55=1;
                }
                break;
            case 41:
                {
                alt55=2;
                }
                break;
            case 42:
                {
                alt55=3;
                }
                break;
            case 43:
                {
                alt55=4;
                }
                break;
            case 44:
                {
                alt55=5;
                }
                break;
            case 45:
                {
                alt55=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2364:2: (enumLiteral_0= 'association' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2364:2: (enumLiteral_0= 'association' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2364:4: enumLiteral_0= 'association'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_40_in_ruleRelationshipType5286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationshipTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2370:6: (enumLiteral_1= 'depency' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2370:6: (enumLiteral_1= 'depency' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2370:8: enumLiteral_1= 'depency'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_41_in_ruleRelationshipType5303); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationshipTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2376:6: (enumLiteral_2= 'generalization' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2376:6: (enumLiteral_2= 'generalization' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2376:8: enumLiteral_2= 'generalization'
                    {
                    enumLiteral_2=(Token)match(input,42,FOLLOW_42_in_ruleRelationshipType5320); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationshipTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2382:6: (enumLiteral_3= 'realization' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2382:6: (enumLiteral_3= 'realization' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2382:8: enumLiteral_3= 'realization'
                    {
                    enumLiteral_3=(Token)match(input,43,FOLLOW_43_in_ruleRelationshipType5337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationshipTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2388:6: (enumLiteral_4= 'aggregation' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2388:6: (enumLiteral_4= 'aggregation' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2388:8: enumLiteral_4= 'aggregation'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_44_in_ruleRelationshipType5354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationshipTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2394:6: (enumLiteral_5= 'composition' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2394:6: (enumLiteral_5= 'composition' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2394:8: enumLiteral_5= 'composition'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_45_in_ruleRelationshipType5371); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2404:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2406:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2407:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2407:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt56=1;
                }
                break;
            case 36:
                {
                alt56=2;
                }
                break;
            case 46:
                {
                alt56=3;
                }
                break;
            case 47:
                {
                alt56=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2407:2: (enumLiteral_0= '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2407:2: (enumLiteral_0= '+' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2407:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleVisibility5416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2413:6: (enumLiteral_1= '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2413:6: (enumLiteral_1= '-' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2413:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_36_in_ruleVisibility5433); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2419:6: (enumLiteral_2= '#' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2419:6: (enumLiteral_2= '#' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2419:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_46_in_ruleVisibility5450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2425:6: (enumLiteral_3= '~' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2425:6: (enumLiteral_3= '~' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2425:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,47,FOLLOW_47_in_ruleVisibility5467); if (state.failed) return current;
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
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:299:4: ( 'datatype' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:299:6: 'datatype'
        {
        match(input,17,FOLLOW_17_in_synpred1_InternalClassmodel656); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalClassmodel

    // $ANTLR start synpred2_InternalClassmodel
    public final void synpred2_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:361:4: ( 'package' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:361:6: 'package'
        {
        match(input,18,FOLLOW_18_in_synpred2_InternalClassmodel792); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalClassmodel

    // $ANTLR start synpred3_InternalClassmodel
    public final void synpred3_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:445:4: ( 'class' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:445:6: 'class'
        {
        match(input,20,FOLLOW_20_in_synpred3_InternalClassmodel962); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalClassmodel

    // $ANTLR start synpred4_InternalClassmodel
    public final void synpred4_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:468:4: ( 'isA' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:468:6: 'isA'
        {
        match(input,21,FOLLOW_21_in_synpred4_InternalClassmodel1006); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalClassmodel

    // $ANTLR start synpred5_InternalClassmodel
    public final void synpred5_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:714:4: ( 'enum' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:714:6: 'enum'
        {
        match(input,23,FOLLOW_23_in_synpred5_InternalClassmodel1523); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalClassmodel

    // $ANTLR start synpred6_InternalClassmodel
    public final void synpred6_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:816:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:816:6: '='
        {
        match(input,24,FOLLOW_24_in_synpred6_InternalClassmodel1717); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalClassmodel

    // $ANTLR start synpred7_InternalClassmodel
    public final void synpred7_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:896:4: ( ( ruleRelationshipType ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:897:1: ( ruleRelationshipType )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:897:1: ( ruleRelationshipType )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:898:1: ruleRelationshipType
        {
        pushFollow(FOLLOW_ruleRelationshipType_in_synpred7_InternalClassmodel1879);
        ruleRelationshipType();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalClassmodel

    // $ANTLR start synpred8_InternalClassmodel
    public final void synpred8_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1171:4: ( '..' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1171:6: '..'
        {
        match(input,29,FOLLOW_29_in_synpred8_InternalClassmodel2351); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalClassmodel

    // $ANTLR start synpred9_InternalClassmodel
    public final void synpred9_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1424:3: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1425:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1425:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1426:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred9_InternalClassmodel2958);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalClassmodel

    // $ANTLR start synpred10_InternalClassmodel
    public final void synpred10_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1573:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1573:6: '='
        {
        match(input,24,FOLLOW_24_in_synpred10_InternalClassmodel3223); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalClassmodel

    // $ANTLR start synpred11_InternalClassmodel
    public final void synpred11_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1752:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1752:6: '='
        {
        match(input,24,FOLLOW_24_in_synpred11_InternalClassmodel3621); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalClassmodel

    // $ANTLR start synpred12_InternalClassmodel
    public final void synpred12_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2023:4: ( '(' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2023:6: '('
        {
        match(input,32,FOLLOW_32_in_synpred12_InternalClassmodel4289); if (state.failed) return ;

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
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA3_eotS =
        "\133\uffff";
    static final String DFA3_eofS =
        "\133\uffff";
    static final String DFA3_minS =
        "\1\21\1\5\3\uffff\1\21\2\5\1\21\1\32\1\5\1\26\1\5\1\7\1\4\1\5\1"+
        "\21\1\26\2\34\4\26\1\7\2\26\1\32\1\7\1\4\1\7\1\5\2\34\4\26\1\7\3"+
        "\26\1\7\2\44\1\5\1\7\1\4\1\26\2\7\1\26\2\34\4\26\1\7\2\26\2\44\1"+
        "\26\1\7\1\4\3\7\2\34\3\26\1\7\4\26\1\7\2\44\1\26\2\7\2\44\1\26\2"+
        "\7\1\26";
    static final String DFA3_maxS =
        "\1\55\1\5\3\uffff\1\55\2\5\1\55\1\32\1\5\1\43\1\5\1\36\1\44\1\5"+
        "\1\55\1\43\2\35\4\41\1\7\1\43\1\41\1\32\1\36\1\44\1\7\1\5\2\34\4"+
        "\41\1\7\1\43\1\46\1\43\1\7\2\47\1\5\1\36\1\44\1\46\2\7\1\43\2\35"+
        "\4\41\1\7\1\43\1\41\2\47\1\41\1\36\1\44\3\7\2\34\3\41\1\7\1\43\1"+
        "\41\1\46\1\41\1\7\2\47\1\46\2\7\2\47\1\41\2\7\1\41";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\126\uffff";
    static final String DFA3_specialS =
        "\133\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\1\3\1\uffff\1\4\2\uffff\1\4\12\uffff\1\1\5\uffff\6\2",
            "\1\5",
            "",
            "",
            "",
            "\1\4\1\3\1\uffff\1\4\2\uffff\1\4\10\uffff\1\7\1\uffff\1\1"+
            "\1\6\4\uffff\6\2",
            "\1\10",
            "\1\11",
            "\1\4\1\3\1\uffff\1\4\2\uffff\1\4\10\uffff\1\7\1\uffff\1\1"+
            "\1\6\4\uffff\6\2",
            "\1\12",
            "\1\13",
            "\1\17\1\uffff\1\16\2\uffff\1\15\5\uffff\1\20\1\uffff\1\14",
            "\1\21",
            "\1\22\24\uffff\1\24\1\uffff\1\23",
            "\1\27\1\32\1\uffff\1\31\1\uffff\1\25\1\26\31\uffff\1\30",
            "\1\33",
            "\1\4\1\3\1\uffff\1\4\2\uffff\1\4\12\uffff\1\1\5\uffff\6\2",
            "\1\17\1\uffff\1\16\2\uffff\1\15\5\uffff\1\20\1\uffff\1\14",
            "\1\24\1\34",
            "\1\24\1\34",
            "\1\17\1\uffff\1\16\2\uffff\1\15\5\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\31",
            "\1\35\12\uffff\1\20\1\uffff\1\36",
            "\1\35\12\uffff\1\20",
            "\1\37",
            "\1\40\26\uffff\1\41",
            "\1\45\1\42\1\uffff\1\47\1\uffff\1\43\1\44\31\uffff\1\46",
            "\1\50",
            "\1\51",
            "\1\24",
            "\1\24",
            "\1\35\3\uffff\1\37\6\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\47",
            "\1\35\12\uffff\1\20\1\uffff\1\52",
            "\1\35\12\uffff\1\20\3\uffff\1\53\1\54",
            "\1\17\1\uffff\1\57\2\uffff\1\56\5\uffff\1\20\1\uffff\1\55",
            "\1\60",
            "\1\62\2\uffff\1\61",
            "\1\62\2\uffff\1\61",
            "\1\63",
            "\1\64\24\uffff\1\66\1\uffff\1\65",
            "\1\71\1\74\1\uffff\1\73\1\uffff\1\67\1\70\31\uffff\1\72",
            "\1\35\12\uffff\1\20\3\uffff\1\75\1\76",
            "\1\77",
            "\1\77",
            "\1\17\1\uffff\1\57\2\uffff\1\56\5\uffff\1\20\1\uffff\1\55",
            "\1\66\1\100",
            "\1\66\1\100",
            "\1\17\1\uffff\1\57\2\uffff\1\56\5\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\73",
            "\1\101\12\uffff\1\20\1\uffff\1\102",
            "\1\101\12\uffff\1\20",
            "\1\104\2\uffff\1\103",
            "\1\104\2\uffff\1\103",
            "\1\35\12\uffff\1\20",
            "\1\105\26\uffff\1\106",
            "\1\111\1\114\1\uffff\1\113\1\uffff\1\107\1\110\31\uffff\1"+
            "\112",
            "\1\115",
            "\1\116",
            "\1\116",
            "\1\66",
            "\1\66",
            "\1\101\12\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\113",
            "\1\101\12\uffff\1\20\1\uffff\1\117",
            "\1\101\3\uffff\1\37\6\uffff\1\20",
            "\1\101\12\uffff\1\20\3\uffff\1\120\1\121",
            "\1\35\12\uffff\1\20",
            "\1\122",
            "\1\124\2\uffff\1\123",
            "\1\124\2\uffff\1\123",
            "\1\101\12\uffff\1\20\3\uffff\1\125\1\126",
            "\1\127",
            "\1\127",
            "\1\131\2\uffff\1\130",
            "\1\131\2\uffff\1\130",
            "\1\101\12\uffff\1\20",
            "\1\132",
            "\1\132",
            "\1\101\12\uffff\1\20"
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
            return "181:1: (this_Relationship_0= ruleRelationship | this_Package_1= rulePackage | this_Entity_2= ruleEntity )";
        }
    }
    static final String DFA4_eotS =
        "\133\uffff";
    static final String DFA4_eofS =
        "\133\uffff";
    static final String DFA4_minS =
        "\1\21\1\5\3\uffff\1\21\2\5\1\21\1\32\1\5\1\26\1\5\1\7\1\4\1\5\1"+
        "\21\1\26\2\34\4\26\1\7\2\26\1\32\1\7\1\4\1\7\1\5\2\34\3\26\1\7\4"+
        "\26\1\7\2\44\1\5\1\7\1\4\1\26\2\7\1\26\2\34\4\26\1\7\2\26\2\44\1"+
        "\26\1\7\1\4\3\7\2\34\3\26\1\7\4\26\1\7\2\44\1\26\2\7\2\44\1\26\2"+
        "\7\1\26";
    static final String DFA4_maxS =
        "\1\42\1\5\3\uffff\1\43\2\5\1\43\1\32\1\5\1\43\1\5\1\36\1\44\1\5"+
        "\1\42\1\43\2\35\4\41\1\7\1\43\1\41\1\32\1\36\1\44\1\7\1\5\2\34\3"+
        "\41\1\7\1\43\1\41\1\46\1\43\1\7\2\47\1\5\1\36\1\44\1\46\2\7\1\43"+
        "\2\35\4\41\1\7\1\43\1\41\2\47\1\41\1\36\1\44\3\7\2\34\3\41\1\7\1"+
        "\43\1\41\1\46\1\41\1\7\2\47\1\46\2\7\2\47\1\41\2\7\1\41";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2\1\3\126\uffff";
    static final String DFA4_specialS =
        "\133\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\2\uffff\1\3\2\uffff\1\4\12\uffff\1\1",
            "\1\5",
            "",
            "",
            "",
            "\1\2\2\uffff\1\3\2\uffff\1\4\10\uffff\1\7\1\uffff\1\1\1\6",
            "\1\10",
            "\1\11",
            "\1\2\2\uffff\1\3\2\uffff\1\4\10\uffff\1\7\1\uffff\1\1\1\6",
            "\1\12",
            "\1\13",
            "\1\17\1\uffff\1\16\2\uffff\1\15\5\uffff\1\20\1\uffff\1\14",
            "\1\21",
            "\1\22\24\uffff\1\24\1\uffff\1\23",
            "\1\27\1\32\1\uffff\1\31\1\uffff\1\25\1\26\31\uffff\1\30",
            "\1\33",
            "\1\2\2\uffff\1\3\2\uffff\1\4\12\uffff\1\1",
            "\1\17\1\uffff\1\16\2\uffff\1\15\5\uffff\1\20\1\uffff\1\14",
            "\1\24\1\34",
            "\1\24\1\34",
            "\1\17\1\uffff\1\16\2\uffff\1\15\5\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\31",
            "\1\35\12\uffff\1\20\1\uffff\1\36",
            "\1\35\12\uffff\1\20",
            "\1\37",
            "\1\40\26\uffff\1\41",
            "\1\44\1\47\1\uffff\1\46\1\uffff\1\42\1\43\31\uffff\1\45",
            "\1\50",
            "\1\51",
            "\1\24",
            "\1\24",
            "\1\35\12\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\35\12\uffff\1\20",
            "\1\46",
            "\1\35\12\uffff\1\20\1\uffff\1\52",
            "\1\35\3\uffff\1\37\6\uffff\1\20",
            "\1\35\12\uffff\1\20\3\uffff\1\53\1\54",
            "\1\17\1\uffff\1\57\2\uffff\1\56\5\uffff\1\20\1\uffff\1\55",
            "\1\60",
            "\1\62\2\uffff\1\61",
            "\1\62\2\uffff\1\61",
            "\1\63",
            "\1\64\24\uffff\1\66\1\uffff\1\65",
            "\1\71\1\74\1\uffff\1\73\1\uffff\1\67\1\70\31\uffff\1\72",
            "\1\35\12\uffff\1\20\3\uffff\1\75\1\76",
            "\1\77",
            "\1\77",
            "\1\17\1\uffff\1\57\2\uffff\1\56\5\uffff\1\20\1\uffff\1\55",
            "\1\66\1\100",
            "\1\66\1\100",
            "\1\17\1\uffff\1\57\2\uffff\1\56\5\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\73",
            "\1\101\12\uffff\1\20\1\uffff\1\102",
            "\1\101\12\uffff\1\20",
            "\1\104\2\uffff\1\103",
            "\1\104\2\uffff\1\103",
            "\1\35\12\uffff\1\20",
            "\1\105\26\uffff\1\106",
            "\1\111\1\114\1\uffff\1\113\1\uffff\1\107\1\110\31\uffff\1"+
            "\112",
            "\1\115",
            "\1\116",
            "\1\116",
            "\1\66",
            "\1\66",
            "\1\101\12\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\101\12\uffff\1\20",
            "\1\113",
            "\1\101\12\uffff\1\20\1\uffff\1\117",
            "\1\101\3\uffff\1\37\6\uffff\1\20",
            "\1\101\12\uffff\1\20\3\uffff\1\120\1\121",
            "\1\35\12\uffff\1\20",
            "\1\122",
            "\1\124\2\uffff\1\123",
            "\1\124\2\uffff\1\123",
            "\1\101\12\uffff\1\20\3\uffff\1\125\1\126",
            "\1\127",
            "\1\127",
            "\1\131\2\uffff\1\130",
            "\1\131\2\uffff\1\130",
            "\1\101\12\uffff\1\20",
            "\1\132",
            "\1\132",
            "\1\101\12\uffff\1\20"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "231:1: (this_Datatype_0= ruleDatatype | this_Classifier_1= ruleClassifier | this_Enumeration_2= ruleEnumeration )";
        }
    }
    static final String DFA14_eotS =
        "\17\uffff";
    static final String DFA14_eofS =
        "\17\uffff";
    static final String DFA14_minS =
        "\6\5\1\30\4\5\1\32\3\uffff";
    static final String DFA14_maxS =
        "\6\57\1\40\4\57\1\40\3\uffff";
    static final String DFA14_acceptS =
        "\14\uffff\1\3\1\1\1\2";
    static final String DFA14_specialS =
        "\17\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\6\31\uffff\1\5\4\uffff\1\2\2\uffff\1\1\6\uffff\1\3\1\4",
            "\1\6\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\6\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\14\1\uffff\1\15\5\uffff\1\16",
            "\1\13\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\13\31\uffff\1\5\4\uffff\1\10\2\uffff\1\7\6\uffff\1\11\1"+
            "\12",
            "\1\15\5\uffff\1\16",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "628:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant )";
        }
    }
    static final String DFA22_eotS =
        "\7\uffff";
    static final String DFA22_eofS =
        "\7\uffff";
    static final String DFA22_minS =
        "\3\4\1\uffff\1\5\1\uffff\1\4";
    static final String DFA22_maxS =
        "\3\57\1\uffff\1\5\1\uffff\1\57";
    static final String DFA22_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA22_specialS =
        "\7\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\1\1\23\uffff\1\3\12\uffff\1\3\2\uffff\1\3\6\uffff\2\3",
            "\2\5\23\uffff\1\5\2\3\7\uffff\1\4\1\5\2\uffff\1\5\6\uffff"+
            "\2\5",
            "\2\5\23\uffff\1\5\1\3\11\uffff\1\5\2\uffff\1\5\6\uffff\2\5",
            "",
            "\1\6",
            "",
            "\2\5\23\uffff\1\5\2\3\7\uffff\1\4\1\5\2\uffff\1\5\6\uffff"+
            "\2\5"
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "918:2: ( (lv_label_2_0= ruleCompositeID ) )?";
        }
    }
    static final String DFA25_eotS =
        "\6\uffff";
    static final String DFA25_eofS =
        "\6\uffff";
    static final String DFA25_minS =
        "\1\4\1\uffff\1\32\1\5\1\uffff\1\32";
    static final String DFA25_maxS =
        "\1\57\1\uffff\1\43\1\5\1\uffff\1\43";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA25_specialS =
        "\6\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1\1\2\36\uffff\1\1\2\uffff\1\1\6\uffff\2\1",
            "",
            "\1\1\1\4\7\uffff\1\3",
            "\1\5",
            "",
            "\1\1\1\4\7\uffff\1\3"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "951:3: ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )?";
        }
    }
    static final String DFA28_eotS =
        "\6\uffff";
    static final String DFA28_eofS =
        "\6\uffff";
    static final String DFA28_minS =
        "\1\4\1\uffff\1\32\1\5\1\uffff\1\32";
    static final String DFA28_maxS =
        "\1\57\1\uffff\1\43\1\5\1\uffff\1\43";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA28_specialS =
        "\6\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\1\2\36\uffff\1\1\2\uffff\1\1\6\uffff\2\1",
            "",
            "\1\1\1\4\7\uffff\1\3",
            "\1\5",
            "",
            "\1\1\1\4\7\uffff\1\3"
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1047:3: ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )?";
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
    public static final BitSet FOLLOW_rulePackage_in_ruleElement379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleElement406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleEntity498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleEntity525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_ruleEntity552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDatatype643 = new BitSet(new long[]{0x0000000400020000L});
    public static final BitSet FOLLOW_17_in_ruleDatatype664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePackage779 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_rulePackage800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage818 = new BitSet(new long[]{0x00003F04009E0000L});
    public static final BitSet FOLLOW_ruleElement_in_rulePackage844 = new BitSet(new long[]{0x00003F04009E0000L});
    public static final BitSet FOLLOW_19_in_rulePackage857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleClassifier949 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_20_in_ruleClassifier970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier988 = new BitSet(new long[]{0x0000C09080280060L});
    public static final BitSet FOLLOW_21_in_ruleClassifier1014 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleClassifier1036 = new BitSet(new long[]{0x0000C09080480060L});
    public static final BitSet FOLLOW_22_in_ruleClassifier1049 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleClassifier1070 = new BitSet(new long[]{0x0000C09080480060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleClassifier1091 = new BitSet(new long[]{0x0000C09080080020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleClassifier1118 = new BitSet(new long[]{0x0000C09080080020L});
    public static final BitSet FOLLOW_19_in_ruleClassifier1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleType1223 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleType1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleFeature1341 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFeature1368 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleFeature1395 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleFeature1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEnumeration1510 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_23_in_ruleEnumeration1531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1549 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleEnumeration1571 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleEnumerator_in_ruleEnumeration1598 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleEnumeration1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_entryRuleEnumerator1647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerator1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerator1699 = new BitSet(new long[]{0x0000000001000042L});
    public static final BitSet FOLLOW_24_in_ruleEnumerator1725 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleEnumerator1747 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleEnumerator1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleRelationship1864 = new BitSet(new long[]{0x00003F0400000000L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_ruleRelationship1896 = new BitSet(new long[]{0x0000C09002000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleRelationship1917 = new BitSet(new long[]{0x0000C09002000030L});
    public static final BitSet FOLLOW_25_in_ruleRelationship1936 = new BitSet(new long[]{0x0000C09000000030L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleRelationship1972 = new BitSet(new long[]{0x0000C09000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleRelationship1994 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRelationship2006 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleRelationship2031 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRelationship2043 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleRelationship2064 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRelationship2076 = new BitSet(new long[]{0x0000C09002000030L});
    public static final BitSet FOLLOW_25_in_ruleRelationship2094 = new BitSet(new long[]{0x0000C09000000030L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleRelationship2130 = new BitSet(new long[]{0x0000C09000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleRelationship2152 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleRelationship2164 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleRelationship2189 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRelationship2201 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleRelationship2222 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleRelationship2234 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRelationship2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity2282 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2338 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleMultiplicity2359 = new BitSet(new long[]{0x0000000040000080L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue2420 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityValue2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleMultiplicityValue2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMultiplicityValue2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleConstant2591 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant2609 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConstant2626 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleConstant2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation2683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleOperation2784 = new BitSet(new long[]{0x0000C09080000020L});
    public static final BitSet FOLLOW_31_in_ruleOperation2856 = new BitSet(new long[]{0x0000C09080000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation2926 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleOperation2943 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation2975 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_22_in_ruleOperation2988 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation3009 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_33_in_ruleOperation3025 = new BitSet(new long[]{0x0000000004000102L});
    public static final BitSet FOLLOW_26_in_ruleOperation3038 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOperation3059 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_BODY_in_ruleOperation3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter3172 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleParameter3189 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter3210 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleParameter3231 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleParameter3253 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleParameter3266 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleParameter3287 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute3327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAttribute3428 = new BitSet(new long[]{0x0000C09080000020L});
    public static final BitSet FOLLOW_31_in_ruleAttribute3500 = new BitSet(new long[]{0x0000C09080000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute3570 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAttribute3587 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttribute3608 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute3629 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleAttribute3651 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAttribute3664 = new BitSet(new long[]{0x00000010000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleAttribute3685 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference3725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleReference3783 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleReference3804 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleArray3897 = new BitSet(new long[]{0x0000000050000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleArray3918 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArray3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue3968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitValue3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleImplicitValue4019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleImplicitValue4045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitValue4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleImplicitValue4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleImplicitValue4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplicitValue4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAnnotation4255 = new BitSet(new long[]{0x0000C09000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation4276 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleAnnotation4297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4319 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation4332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAnnotation4353 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_33_in_ruleAnnotation4367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue4553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID4658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID4709 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleExtendedID4728 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID4743 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleCompositeID_in_entryRuleCompositeID4793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeID4804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleCompositeID4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompositeID4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal4923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleReal4973 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal4990 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleReal5008 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5023 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleReal5043 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_38_in_ruleReal5062 = new BitSet(new long[]{0x0000009000000000L});
    public static final BitSet FOLLOW_39_in_ruleReal5077 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_36_in_ruleReal5096 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger5160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInteger5210 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRelationshipType5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRelationshipType5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRelationshipType5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRelationshipType5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRelationshipType5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRelationshipType5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVisibility5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVisibility5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVisibility5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVisibility5467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalClassmodel656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred2_InternalClassmodel792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred3_InternalClassmodel962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred4_InternalClassmodel1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalClassmodel1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred6_InternalClassmodel1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_synpred7_InternalClassmodel1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_synpred8_InternalClassmodel2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred9_InternalClassmodel2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred10_InternalClassmodel3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred11_InternalClassmodel3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred12_InternalClassmodel4289 = new BitSet(new long[]{0x0000000000000002L});

}

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CONSTRAINT", "RULE_NATURAL", "RULE_BODY", "RULE_NULL", "RULE_BOOLEAN", "RULE_OPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'datatype'", "'package'", "'end'", "'class'", "'isA'", "','", "'in'", "'enum'", "'='", "'association'", "'unnavigable'", "':'", "'['", "']'", "'aggregation'", "'composition'", "'generalization'", "'dependency'", "'realization'", "'..'", "'*'", "'static'", "'('", "')'", "'@'", "'.'", "'-'", "'e'", "'E'", "'+'", "'#'", "'~'"
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
    public static final int T__48=48;
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

                if ( ((LA2_0>=17 && LA2_0<=18)||LA2_0==20||LA2_0==24||LA2_0==26||(LA2_0>=31 && LA2_0<=35)||LA2_0==41) ) {
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

                if ( (LA5_0==41) ) {
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

                if ( (LA6_0==41) ) {
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

                if ( ((LA7_0>=17 && LA7_0<=18)||LA7_0==20||LA7_0==24||LA7_0==26||(LA7_0>=31 && LA7_0<=35)||LA7_0==41) ) {
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:423:1: ruleClassifier returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( ( ( 'in' )=>otherlv_7= 'in' ) ( (lv_upperClass_8_0= ruleType ) ) )? ( (lv_constraint_9_0= RULE_CONSTRAINT ) )? ( (lv_feature_10_0= ruleFeature ) )* otherlv_11= 'end' ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_constraint_9_0=null;
        Token otherlv_11=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_generalization_4_0 = null;

        EObject lv_generalization_6_0 = null;

        EObject lv_upperClass_8_0 = null;

        EObject lv_feature_10_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:426:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( ( ( 'in' )=>otherlv_7= 'in' ) ( (lv_upperClass_8_0= ruleType ) ) )? ( (lv_constraint_9_0= RULE_CONSTRAINT ) )? ( (lv_feature_10_0= ruleFeature ) )* otherlv_11= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( ( ( 'in' )=>otherlv_7= 'in' ) ( (lv_upperClass_8_0= ruleType ) ) )? ( (lv_constraint_9_0= RULE_CONSTRAINT ) )? ( (lv_feature_10_0= ruleFeature ) )* otherlv_11= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( ( ( 'in' )=>otherlv_7= 'in' ) ( (lv_upperClass_8_0= ruleType ) ) )? ( (lv_constraint_9_0= RULE_CONSTRAINT ) )? ( (lv_feature_10_0= ruleFeature ) )* otherlv_11= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'class' )=>otherlv_1= 'class' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'isA' )=>otherlv_3= 'isA' ) ( (lv_generalization_4_0= ruleType ) ) (otherlv_5= ',' ( (lv_generalization_6_0= ruleType ) ) )* )? ( ( ( 'in' )=>otherlv_7= 'in' ) ( (lv_upperClass_8_0= ruleType ) ) )? ( (lv_constraint_9_0= RULE_CONSTRAINT ) )? ( (lv_feature_10_0= ruleFeature ) )* otherlv_11= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==41) ) {
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:6: ( ( ( 'in' )=>otherlv_7= 'in' ) ( (lv_upperClass_8_0= ruleType ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) && (synpred5_InternalClassmodel())) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:7: ( ( 'in' )=>otherlv_7= 'in' ) ( (lv_upperClass_8_0= ruleType ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:7: ( ( 'in' )=>otherlv_7= 'in' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:8: ( 'in' )=>otherlv_7= 'in'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleClassifier1095); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getClassifierAccess().getInKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:518:2: ( (lv_upperClass_8_0= ruleType ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:519:1: (lv_upperClass_8_0= ruleType )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:519:1: (lv_upperClass_8_0= ruleType )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:520:3: lv_upperClass_8_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassifierAccess().getUpperClassTypeParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleClassifier1117);
                    lv_upperClass_8_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
                      	        }
                             		set(
                             			current, 
                             			"upperClass",
                              		lv_upperClass_8_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:536:4: ( (lv_constraint_9_0= RULE_CONSTRAINT ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_CONSTRAINT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:537:1: (lv_constraint_9_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:537:1: (lv_constraint_9_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:538:3: lv_constraint_9_0= RULE_CONSTRAINT
                    {
                    lv_constraint_9_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleClassifier1136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_9_0, grammarAccess.getClassifierAccess().getConstraintCONSTRAINTTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassifierRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"constraint",
                              		lv_constraint_9_0, 
                              		"CONSTRAINT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:554:3: ( (lv_feature_10_0= ruleFeature ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==38||LA13_0==43||(LA13_0>=46 && LA13_0<=48)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:555:1: (lv_feature_10_0= ruleFeature )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:555:1: (lv_feature_10_0= ruleFeature )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:556:3: lv_feature_10_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassifierAccess().getFeatureFeatureParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleClassifier1163);
            	    lv_feature_10_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassifierRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"feature",
            	              		lv_feature_10_0, 
            	              		"Feature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleClassifier1176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getClassifierAccess().getEndKeyword_7());
                  
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:584:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:585:2: (iv_ruleType= ruleType EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:586:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType1212);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1222); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:593:1: ruleType returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_visibility_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:596:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:597:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:597:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:597:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( ( ruleExtendedID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:597:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43||(LA14_0>=46 && LA14_0<=48)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:598:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:598:1: (lv_visibility_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:599:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleType1268);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:615:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:616:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:616:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:617:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeAccess().getNameEntityCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleType1292);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:638:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:639:2: (iv_ruleFeature= ruleFeature EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:640:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1328);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1338); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:647:1: ruleFeature returns [EObject current=null] : ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_constraint_3_0=null;
        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;

        EObject this_Constant_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:650:28: ( ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:651:1: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:651:1: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:651:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant ) ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:651:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:652:5: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleFeature1386);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:662:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleFeature1413);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:672:5: this_Constant_2= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getConstantParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstant_in_ruleFeature1440);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:680:2: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_CONSTRAINT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:681:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:681:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:682:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleFeature1457); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:706:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:707:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:708:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FOLLOW_ruleEnumeration_in_entryRuleEnumeration1499);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumeration1509); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:715:1: ruleEnumeration returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'in' )=>otherlv_3= 'in' ) ( (lv_upperClass_4_0= ruleType ) ) )? ( (lv_constraint_5_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_6_0= ruleEnumerator ) )* otherlv_7= 'end' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_constraint_5_0=null;
        Token otherlv_7=null;
        EObject lv_annotation_0_0 = null;

        EObject lv_upperClass_4_0 = null;

        EObject lv_enumerator_6_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:718:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'in' )=>otherlv_3= 'in' ) ( (lv_upperClass_4_0= ruleType ) ) )? ( (lv_constraint_5_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_6_0= ruleEnumerator ) )* otherlv_7= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:719:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'in' )=>otherlv_3= 'in' ) ( (lv_upperClass_4_0= ruleType ) ) )? ( (lv_constraint_5_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_6_0= ruleEnumerator ) )* otherlv_7= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:719:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'in' )=>otherlv_3= 'in' ) ( (lv_upperClass_4_0= ruleType ) ) )? ( (lv_constraint_5_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_6_0= ruleEnumerator ) )* otherlv_7= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:719:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'enum' )=>otherlv_1= 'enum' ) ( (lv_name_2_0= RULE_ID ) ) ( ( ( 'in' )=>otherlv_3= 'in' ) ( (lv_upperClass_4_0= ruleType ) ) )? ( (lv_constraint_5_0= RULE_CONSTRAINT ) )? ( (lv_enumerator_6_0= ruleEnumerator ) )* otherlv_7= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:719:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==41) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:720:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:720:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:721:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleEnumeration1555);
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
            	    break loop17;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:737:3: ( ( 'enum' )=>otherlv_1= 'enum' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:737:4: ( 'enum' )=>otherlv_1= 'enum'
            {
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleEnumeration1576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:742:2: ( (lv_name_2_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:743:1: (lv_name_2_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:743:1: (lv_name_2_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:744:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumeration1594); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:760:2: ( ( ( 'in' )=>otherlv_3= 'in' ) ( (lv_upperClass_4_0= ruleType ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) && (synpred7_InternalClassmodel())) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:760:3: ( ( 'in' )=>otherlv_3= 'in' ) ( (lv_upperClass_4_0= ruleType ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:760:3: ( ( 'in' )=>otherlv_3= 'in' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:760:4: ( 'in' )=>otherlv_3= 'in'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleEnumeration1620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getInKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:765:2: ( (lv_upperClass_4_0= ruleType ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:766:1: (lv_upperClass_4_0= ruleType )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:766:1: (lv_upperClass_4_0= ruleType )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:767:3: lv_upperClass_4_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumerationAccess().getUpperClassTypeParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleEnumeration1642);
                    lv_upperClass_4_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
                      	        }
                             		set(
                             			current, 
                             			"upperClass",
                              		lv_upperClass_4_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:783:4: ( (lv_constraint_5_0= RULE_CONSTRAINT ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_CONSTRAINT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:784:1: (lv_constraint_5_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:784:1: (lv_constraint_5_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:785:3: lv_constraint_5_0= RULE_CONSTRAINT
                    {
                    lv_constraint_5_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleEnumeration1661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_constraint_5_0, grammarAccess.getEnumerationAccess().getConstraintCONSTRAINTTerminalRuleCall_4_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEnumerationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"constraint",
                              		lv_constraint_5_0, 
                              		"CONSTRAINT");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:801:3: ( (lv_enumerator_6_0= ruleEnumerator ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:802:1: (lv_enumerator_6_0= ruleEnumerator )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:802:1: (lv_enumerator_6_0= ruleEnumerator )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:803:3: lv_enumerator_6_0= ruleEnumerator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getEnumeratorEnumeratorParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumerator_in_ruleEnumeration1688);
            	    lv_enumerator_6_0=ruleEnumerator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"enumerator",
            	              		lv_enumerator_6_0, 
            	              		"Enumerator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleEnumeration1701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getEndKeyword_6());
                  
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:831:1: entryRuleEnumerator returns [EObject current=null] : iv_ruleEnumerator= ruleEnumerator EOF ;
    public final EObject entryRuleEnumerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerator = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:832:2: (iv_ruleEnumerator= ruleEnumerator EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:833:2: iv_ruleEnumerator= ruleEnumerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumeratorRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerator_in_entryRuleEnumerator1737);
            iv_ruleEnumerator=ruleEnumerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerator1747); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:840:1: ruleEnumerator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) ;
    public final EObject ruleEnumerator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_constraint_3_0=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:843:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:844:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:844:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:844:2: ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )? ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:844:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:845:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:845:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:846:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerator1789); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:862:2: ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) && (synpred8_InternalClassmodel())) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:862:3: ( ( '=' )=>otherlv_1= '=' ) ( (lv_value_2_0= ruleImplicitValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:862:3: ( ( '=' )=>otherlv_1= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:862:4: ( '=' )=>otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleEnumerator1815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumeratorAccess().getEqualsSignKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:867:2: ( (lv_value_2_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:868:1: (lv_value_2_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:868:1: (lv_value_2_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:869:3: lv_value_2_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumeratorAccess().getValueImplicitValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleEnumerator1837);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:885:4: ( (lv_constraint_3_0= RULE_CONSTRAINT ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_CONSTRAINT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:886:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:886:1: (lv_constraint_3_0= RULE_CONSTRAINT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:887:3: lv_constraint_3_0= RULE_CONSTRAINT
                    {
                    lv_constraint_3_0=(Token)match(input,RULE_CONSTRAINT,FOLLOW_RULE_CONSTRAINT_in_ruleEnumerator1856); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:911:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:912:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:913:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship1898);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship1908); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:920:1: ruleRelationship returns [EObject current=null] : (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition | this_Generalization_3= ruleGeneralization | this_Dependency_4= ruleDependency | this_Realization_5= ruleRealization ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        EObject this_Association_0 = null;

        EObject this_Aggregation_1 = null;

        EObject this_Composition_2 = null;

        EObject this_Generalization_3 = null;

        EObject this_Dependency_4 = null;

        EObject this_Realization_5 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:923:28: ( (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition | this_Generalization_3= ruleGeneralization | this_Dependency_4= ruleDependency | this_Realization_5= ruleRealization ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:924:1: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition | this_Generalization_3= ruleGeneralization | this_Dependency_4= ruleDependency | this_Realization_5= ruleRealization )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:924:1: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition | this_Generalization_3= ruleGeneralization | this_Dependency_4= ruleDependency | this_Realization_5= ruleRealization )
            int alt23=6;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:925:5: this_Association_0= ruleAssociation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getAssociationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssociation_in_ruleRelationship1955);
                    this_Association_0=ruleAssociation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Association_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:935:5: this_Aggregation_1= ruleAggregation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getAggregationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAggregation_in_ruleRelationship1982);
                    this_Aggregation_1=ruleAggregation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Aggregation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:945:5: this_Composition_2= ruleComposition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getCompositionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComposition_in_ruleRelationship2009);
                    this_Composition_2=ruleComposition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Composition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:955:5: this_Generalization_3= ruleGeneralization
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getGeneralizationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGeneralization_in_ruleRelationship2036);
                    this_Generalization_3=ruleGeneralization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Generalization_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:965:5: this_Dependency_4= ruleDependency
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getDependencyParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDependency_in_ruleRelationship2063);
                    this_Dependency_4=ruleDependency();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Dependency_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:975:5: this_Realization_5= ruleRealization
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipAccess().getRealizationParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealization_in_ruleRelationship2090);
                    this_Realization_5=ruleRealization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Realization_5; 
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleAssociation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:991:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:992:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:993:2: iv_ruleAssociation= ruleAssociation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssociationRule()); 
            }
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation2125);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssociation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation2135); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1000:1: ruleAssociation returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'association' )=>otherlv_1= 'association' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        Enumerator lv_headVisibility_4_0 = null;

        AntlrDatatypeRuleToken lv_headLabel_5_0 = null;

        EObject lv_headMultiplicity_9_0 = null;

        Enumerator lv_tailVisibility_12_0 = null;

        AntlrDatatypeRuleToken lv_tailLabel_13_0 = null;

        EObject lv_tailMultiplicity_17_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1003:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'association' )=>otherlv_1= 'association' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1004:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'association' )=>otherlv_1= 'association' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1004:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'association' )=>otherlv_1= 'association' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1004:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'association' )=>otherlv_1= 'association' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1004:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1005:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1005:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1006:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssociationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAssociation2181);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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
            	    break loop24;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1022:3: ( ( 'association' )=>otherlv_1= 'association' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1022:4: ( 'association' )=>otherlv_1= 'association'
            {
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleAssociation2202); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssociationAccess().getAssociationKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1027:2: ( (lv_label_2_0= ruleCompositeID ) )?
            int alt25=2;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1028:1: (lv_label_2_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1028:1: (lv_label_2_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1029:3: lv_label_2_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssociationAccess().getLabelCompositeIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleAssociation2224);
                    lv_label_2_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1045:3: ( (lv_headNavigable_3_0= 'unnavigable' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==27) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1046:1: (lv_headNavigable_3_0= 'unnavigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1046:1: (lv_headNavigable_3_0= 'unnavigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1047:3: lv_headNavigable_3_0= 'unnavigable'
                    {
                    lv_headNavigable_3_0=(Token)match(input,27,FOLLOW_27_in_ruleAssociation2243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_headNavigable_3_0, grammarAccess.getAssociationAccess().getHeadNavigableUnnavigableKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "headNavigable", true, "unnavigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1060:3: ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )?
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1060:4: ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1060:4: ( (lv_headVisibility_4_0= ruleVisibility ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==43||(LA27_0>=46 && LA27_0<=48)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1061:1: (lv_headVisibility_4_0= ruleVisibility )
                            {
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1061:1: (lv_headVisibility_4_0= ruleVisibility )
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1062:3: lv_headVisibility_4_0= ruleVisibility
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssociationAccess().getHeadVisibilityVisibilityEnumRuleCall_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisibility_in_ruleAssociation2279);
                            lv_headVisibility_4_0=ruleVisibility();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1078:3: ( (lv_headLabel_5_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1079:1: (lv_headLabel_5_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1079:1: (lv_headLabel_5_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1080:3: lv_headLabel_5_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssociationAccess().getHeadLabelCompositeIDParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleAssociation2301);
                    lv_headLabel_5_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleAssociation2313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getColonKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1100:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1101:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1101:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1102:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssociationAccess().getHeadEntityCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAssociation2338);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleAssociation2350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_6());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1119:1: ( (lv_headMultiplicity_9_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1120:1: (lv_headMultiplicity_9_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1120:1: (lv_headMultiplicity_9_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1121:3: lv_headMultiplicity_9_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssociationAccess().getHeadMultiplicityMultiplicityParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation2371);
            lv_headMultiplicity_9_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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

            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleAssociation2383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_8());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1141:1: ( (lv_tailNavigable_11_0= 'unnavigable' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1142:1: (lv_tailNavigable_11_0= 'unnavigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1142:1: (lv_tailNavigable_11_0= 'unnavigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1143:3: lv_tailNavigable_11_0= 'unnavigable'
                    {
                    lv_tailNavigable_11_0=(Token)match(input,27,FOLLOW_27_in_ruleAssociation2401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_tailNavigable_11_0, grammarAccess.getAssociationAccess().getTailNavigableUnnavigableKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssociationRule());
                      	        }
                             		setWithLastConsumed(current, "tailNavigable", true, "unnavigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1156:3: ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1156:4: ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1156:4: ( (lv_tailVisibility_12_0= ruleVisibility ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==43||(LA30_0>=46 && LA30_0<=48)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1157:1: (lv_tailVisibility_12_0= ruleVisibility )
                            {
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1157:1: (lv_tailVisibility_12_0= ruleVisibility )
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1158:3: lv_tailVisibility_12_0= ruleVisibility
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssociationAccess().getTailVisibilityVisibilityEnumRuleCall_10_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisibility_in_ruleAssociation2437);
                            lv_tailVisibility_12_0=ruleVisibility();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1174:3: ( (lv_tailLabel_13_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1175:1: (lv_tailLabel_13_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1175:1: (lv_tailLabel_13_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1176:3: lv_tailLabel_13_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssociationAccess().getTailLabelCompositeIDParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleAssociation2459);
                    lv_tailLabel_13_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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

                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleAssociation2471); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getAssociationAccess().getColonKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1196:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1197:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1197:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1198:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssociationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssociationAccess().getTailEntityCrossReference_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAssociation2496);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleAssociation2508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getAssociationAccess().getLeftSquareBracketKeyword_12());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1215:1: ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1216:1: (lv_tailMultiplicity_17_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1216:1: (lv_tailMultiplicity_17_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1217:3: lv_tailMultiplicity_17_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssociationAccess().getTailMultiplicityMultiplicityParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAssociation2529);
            lv_tailMultiplicity_17_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssociationRule());
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

            otherlv_18=(Token)match(input,30,FOLLOW_30_in_ruleAssociation2541); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getAssociationAccess().getRightSquareBracketKeyword_14());
                  
            }
            otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleAssociation2553); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_19, grammarAccess.getAssociationAccess().getEndKeyword_15());
                  
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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleAggregation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1249:1: entryRuleAggregation returns [EObject current=null] : iv_ruleAggregation= ruleAggregation EOF ;
    public final EObject entryRuleAggregation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1250:2: (iv_ruleAggregation= ruleAggregation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1251:2: iv_ruleAggregation= ruleAggregation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAggregationRule()); 
            }
            pushFollow(FOLLOW_ruleAggregation_in_entryRuleAggregation2589);
            iv_ruleAggregation=ruleAggregation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAggregation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregation2599); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAggregation"


    // $ANTLR start "ruleAggregation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1258:1: ruleAggregation returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'aggregation' )=>otherlv_1= 'aggregation' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' ) ;
    public final EObject ruleAggregation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        Enumerator lv_headVisibility_4_0 = null;

        AntlrDatatypeRuleToken lv_headLabel_5_0 = null;

        EObject lv_headMultiplicity_9_0 = null;

        Enumerator lv_tailVisibility_12_0 = null;

        AntlrDatatypeRuleToken lv_tailLabel_13_0 = null;

        EObject lv_tailMultiplicity_17_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1261:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'aggregation' )=>otherlv_1= 'aggregation' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1262:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'aggregation' )=>otherlv_1= 'aggregation' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1262:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'aggregation' )=>otherlv_1= 'aggregation' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1262:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'aggregation' )=>otherlv_1= 'aggregation' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1262:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==41) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1263:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1263:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1264:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAggregationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAggregation2645);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAggregationRule());
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
            	    break loop32;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1280:3: ( ( 'aggregation' )=>otherlv_1= 'aggregation' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1280:4: ( 'aggregation' )=>otherlv_1= 'aggregation'
            {
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleAggregation2666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAggregationAccess().getAggregationKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1285:2: ( (lv_label_2_0= ruleCompositeID ) )?
            int alt33=2;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1286:1: (lv_label_2_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1286:1: (lv_label_2_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1287:3: lv_label_2_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAggregationAccess().getLabelCompositeIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleAggregation2688);
                    lv_label_2_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAggregationRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1303:3: ( (lv_headNavigable_3_0= 'unnavigable' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==27) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1304:1: (lv_headNavigable_3_0= 'unnavigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1304:1: (lv_headNavigable_3_0= 'unnavigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1305:3: lv_headNavigable_3_0= 'unnavigable'
                    {
                    lv_headNavigable_3_0=(Token)match(input,27,FOLLOW_27_in_ruleAggregation2707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_headNavigable_3_0, grammarAccess.getAggregationAccess().getHeadNavigableUnnavigableKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAggregationRule());
                      	        }
                             		setWithLastConsumed(current, "headNavigable", true, "unnavigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1318:3: ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )?
            int alt36=2;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1318:4: ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1318:4: ( (lv_headVisibility_4_0= ruleVisibility ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==43||(LA35_0>=46 && LA35_0<=48)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1319:1: (lv_headVisibility_4_0= ruleVisibility )
                            {
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1319:1: (lv_headVisibility_4_0= ruleVisibility )
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1320:3: lv_headVisibility_4_0= ruleVisibility
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAggregationAccess().getHeadVisibilityVisibilityEnumRuleCall_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisibility_in_ruleAggregation2743);
                            lv_headVisibility_4_0=ruleVisibility();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAggregationRule());
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1336:3: ( (lv_headLabel_5_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1337:1: (lv_headLabel_5_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1337:1: (lv_headLabel_5_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1338:3: lv_headLabel_5_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAggregationAccess().getHeadLabelCompositeIDParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleAggregation2765);
                    lv_headLabel_5_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAggregationRule());
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

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleAggregation2777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAggregationAccess().getColonKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1358:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1359:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1359:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1360:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAggregationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAggregationAccess().getHeadEntityCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAggregation2802);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleAggregation2814); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_6());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1377:1: ( (lv_headMultiplicity_9_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1378:1: (lv_headMultiplicity_9_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1378:1: (lv_headMultiplicity_9_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1379:3: lv_headMultiplicity_9_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAggregationAccess().getHeadMultiplicityMultiplicityParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAggregation2835);
            lv_headMultiplicity_9_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAggregationRule());
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

            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleAggregation2847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_8());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1399:1: ( (lv_tailNavigable_11_0= 'unnavigable' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==27) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1400:1: (lv_tailNavigable_11_0= 'unnavigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1400:1: (lv_tailNavigable_11_0= 'unnavigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1401:3: lv_tailNavigable_11_0= 'unnavigable'
                    {
                    lv_tailNavigable_11_0=(Token)match(input,27,FOLLOW_27_in_ruleAggregation2865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_tailNavigable_11_0, grammarAccess.getAggregationAccess().getTailNavigableUnnavigableKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAggregationRule());
                      	        }
                             		setWithLastConsumed(current, "tailNavigable", true, "unnavigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1414:3: ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1414:4: ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1414:4: ( (lv_tailVisibility_12_0= ruleVisibility ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==43||(LA38_0>=46 && LA38_0<=48)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1415:1: (lv_tailVisibility_12_0= ruleVisibility )
                            {
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1415:1: (lv_tailVisibility_12_0= ruleVisibility )
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1416:3: lv_tailVisibility_12_0= ruleVisibility
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAggregationAccess().getTailVisibilityVisibilityEnumRuleCall_10_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisibility_in_ruleAggregation2901);
                            lv_tailVisibility_12_0=ruleVisibility();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAggregationRule());
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1432:3: ( (lv_tailLabel_13_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1433:1: (lv_tailLabel_13_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1433:1: (lv_tailLabel_13_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1434:3: lv_tailLabel_13_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAggregationAccess().getTailLabelCompositeIDParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleAggregation2923);
                    lv_tailLabel_13_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAggregationRule());
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

                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleAggregation2935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getAggregationAccess().getColonKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1454:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1455:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1455:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1456:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAggregationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAggregationAccess().getTailEntityCrossReference_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAggregation2960);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleAggregation2972); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getAggregationAccess().getLeftSquareBracketKeyword_12());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1473:1: ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1474:1: (lv_tailMultiplicity_17_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1474:1: (lv_tailMultiplicity_17_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1475:3: lv_tailMultiplicity_17_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAggregationAccess().getTailMultiplicityMultiplicityParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleAggregation2993);
            lv_tailMultiplicity_17_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAggregationRule());
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

            otherlv_18=(Token)match(input,30,FOLLOW_30_in_ruleAggregation3005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getAggregationAccess().getRightSquareBracketKeyword_14());
                  
            }
            otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleAggregation3017); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_19, grammarAccess.getAggregationAccess().getEndKeyword_15());
                  
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
    // $ANTLR end "ruleAggregation"


    // $ANTLR start "entryRuleComposition"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1507:1: entryRuleComposition returns [EObject current=null] : iv_ruleComposition= ruleComposition EOF ;
    public final EObject entryRuleComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposition = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1508:2: (iv_ruleComposition= ruleComposition EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1509:2: iv_ruleComposition= ruleComposition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositionRule()); 
            }
            pushFollow(FOLLOW_ruleComposition_in_entryRuleComposition3053);
            iv_ruleComposition=ruleComposition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComposition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComposition3063); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComposition"


    // $ANTLR start "ruleComposition"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1516:1: ruleComposition returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'composition' )=>otherlv_1= 'composition' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' ) ;
    public final EObject ruleComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
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

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        Enumerator lv_headVisibility_4_0 = null;

        AntlrDatatypeRuleToken lv_headLabel_5_0 = null;

        EObject lv_headMultiplicity_9_0 = null;

        Enumerator lv_tailVisibility_12_0 = null;

        AntlrDatatypeRuleToken lv_tailLabel_13_0 = null;

        EObject lv_tailMultiplicity_17_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1519:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'composition' )=>otherlv_1= 'composition' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1520:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'composition' )=>otherlv_1= 'composition' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1520:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'composition' )=>otherlv_1= 'composition' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1520:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'composition' )=>otherlv_1= 'composition' ) ( (lv_label_2_0= ruleCompositeID ) )? ( (lv_headNavigable_3_0= 'unnavigable' ) )? ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )? ( ( ruleExtendedID ) ) otherlv_8= '[' ( (lv_headMultiplicity_9_0= ruleMultiplicity ) ) otherlv_10= ']' ( (lv_tailNavigable_11_0= 'unnavigable' ) )? ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )? ( ( ruleExtendedID ) ) otherlv_16= '[' ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) ) otherlv_18= ']' otherlv_19= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1520:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==41) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1521:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1521:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1522:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompositionAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleComposition3109);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompositionRule());
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
            	    break loop40;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1538:3: ( ( 'composition' )=>otherlv_1= 'composition' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1538:4: ( 'composition' )=>otherlv_1= 'composition'
            {
            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleComposition3130); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompositionAccess().getCompositionKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1543:2: ( (lv_label_2_0= ruleCompositeID ) )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1544:1: (lv_label_2_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1544:1: (lv_label_2_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1545:3: lv_label_2_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionAccess().getLabelCompositeIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleComposition3152);
                    lv_label_2_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositionRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1561:3: ( (lv_headNavigable_3_0= 'unnavigable' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1562:1: (lv_headNavigable_3_0= 'unnavigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1562:1: (lv_headNavigable_3_0= 'unnavigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1563:3: lv_headNavigable_3_0= 'unnavigable'
                    {
                    lv_headNavigable_3_0=(Token)match(input,27,FOLLOW_27_in_ruleComposition3171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_headNavigable_3_0, grammarAccess.getCompositionAccess().getHeadNavigableUnnavigableKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCompositionRule());
                      	        }
                             		setWithLastConsumed(current, "headNavigable", true, "unnavigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1576:3: ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )?
            int alt44=2;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1576:4: ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1576:4: ( (lv_headVisibility_4_0= ruleVisibility ) )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==43||(LA43_0>=46 && LA43_0<=48)) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1577:1: (lv_headVisibility_4_0= ruleVisibility )
                            {
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1577:1: (lv_headVisibility_4_0= ruleVisibility )
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1578:3: lv_headVisibility_4_0= ruleVisibility
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCompositionAccess().getHeadVisibilityVisibilityEnumRuleCall_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisibility_in_ruleComposition3207);
                            lv_headVisibility_4_0=ruleVisibility();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCompositionRule());
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1594:3: ( (lv_headLabel_5_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1595:1: (lv_headLabel_5_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1595:1: (lv_headLabel_5_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1596:3: lv_headLabel_5_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionAccess().getHeadLabelCompositeIDParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleComposition3229);
                    lv_headLabel_5_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositionRule());
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

                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleComposition3241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompositionAccess().getColonKeyword_4_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1616:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1617:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1617:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1618:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositionAccess().getHeadEntityCrossReference_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleComposition3266);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleComposition3278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_6());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1635:1: ( (lv_headMultiplicity_9_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1636:1: (lv_headMultiplicity_9_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1636:1: (lv_headMultiplicity_9_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1637:3: lv_headMultiplicity_9_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositionAccess().getHeadMultiplicityMultiplicityParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleComposition3299);
            lv_headMultiplicity_9_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositionRule());
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

            otherlv_10=(Token)match(input,30,FOLLOW_30_in_ruleComposition3311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_8());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1657:1: ( (lv_tailNavigable_11_0= 'unnavigable' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==27) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1658:1: (lv_tailNavigable_11_0= 'unnavigable' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1658:1: (lv_tailNavigable_11_0= 'unnavigable' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1659:3: lv_tailNavigable_11_0= 'unnavigable'
                    {
                    lv_tailNavigable_11_0=(Token)match(input,27,FOLLOW_27_in_ruleComposition3329); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_tailNavigable_11_0, grammarAccess.getCompositionAccess().getTailNavigableUnnavigableKeyword_9_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCompositionRule());
                      	        }
                             		setWithLastConsumed(current, "tailNavigable", true, "unnavigable");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1672:3: ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )?
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1672:4: ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1672:4: ( (lv_tailVisibility_12_0= ruleVisibility ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==43||(LA46_0>=46 && LA46_0<=48)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1673:1: (lv_tailVisibility_12_0= ruleVisibility )
                            {
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1673:1: (lv_tailVisibility_12_0= ruleVisibility )
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1674:3: lv_tailVisibility_12_0= ruleVisibility
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCompositionAccess().getTailVisibilityVisibilityEnumRuleCall_10_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleVisibility_in_ruleComposition3365);
                            lv_tailVisibility_12_0=ruleVisibility();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCompositionRule());
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1690:3: ( (lv_tailLabel_13_0= ruleCompositeID ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1691:1: (lv_tailLabel_13_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1691:1: (lv_tailLabel_13_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1692:3: lv_tailLabel_13_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositionAccess().getTailLabelCompositeIDParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleComposition3387);
                    lv_tailLabel_13_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositionRule());
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

                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleComposition3399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCompositionAccess().getColonKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1712:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1713:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1713:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1714:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositionAccess().getTailEntityCrossReference_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleComposition3424);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleComposition3436); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getCompositionAccess().getLeftSquareBracketKeyword_12());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1731:1: ( (lv_tailMultiplicity_17_0= ruleMultiplicity ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1732:1: (lv_tailMultiplicity_17_0= ruleMultiplicity )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1732:1: (lv_tailMultiplicity_17_0= ruleMultiplicity )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1733:3: lv_tailMultiplicity_17_0= ruleMultiplicity
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositionAccess().getTailMultiplicityMultiplicityParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_ruleComposition3457);
            lv_tailMultiplicity_17_0=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositionRule());
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

            otherlv_18=(Token)match(input,30,FOLLOW_30_in_ruleComposition3469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getCompositionAccess().getRightSquareBracketKeyword_14());
                  
            }
            otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleComposition3481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_19, grammarAccess.getCompositionAccess().getEndKeyword_15());
                  
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
    // $ANTLR end "ruleComposition"


    // $ANTLR start "entryRuleGeneralization"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1765:1: entryRuleGeneralization returns [EObject current=null] : iv_ruleGeneralization= ruleGeneralization EOF ;
    public final EObject entryRuleGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralization = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1766:2: (iv_ruleGeneralization= ruleGeneralization EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1767:2: iv_ruleGeneralization= ruleGeneralization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGeneralizationRule()); 
            }
            pushFollow(FOLLOW_ruleGeneralization_in_entryRuleGeneralization3517);
            iv_ruleGeneralization=ruleGeneralization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGeneralization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneralization3527); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1774:1: ruleGeneralization returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'generalization' )=>otherlv_1= 'generalization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' ) ;
    public final EObject ruleGeneralization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1777:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'generalization' )=>otherlv_1= 'generalization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1778:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'generalization' )=>otherlv_1= 'generalization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1778:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'generalization' )=>otherlv_1= 'generalization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1778:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'generalization' )=>otherlv_1= 'generalization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1778:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==41) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1779:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1779:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1780:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGeneralizationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleGeneralization3573);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
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
            	    break loop48;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1796:3: ( ( 'generalization' )=>otherlv_1= 'generalization' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1796:4: ( 'generalization' )=>otherlv_1= 'generalization'
            {
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleGeneralization3594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGeneralizationAccess().getGeneralizationKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1801:2: ( (lv_label_2_0= ruleCompositeID ) )?
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1802:1: (lv_label_2_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1802:1: (lv_label_2_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1803:3: lv_label_2_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGeneralizationAccess().getLabelCompositeIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleGeneralization3616);
                    lv_label_2_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGeneralizationRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1819:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1820:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1820:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1821:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGeneralizationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneralizationAccess().getHeadEntityCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleGeneralization3640);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1834:2: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1835:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1835:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1836:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGeneralizationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGeneralizationAccess().getTailEntityCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleGeneralization3663);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleGeneralization3675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGeneralizationAccess().getEndKeyword_5());
                  
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
    // $ANTLR end "ruleGeneralization"


    // $ANTLR start "entryRuleDependency"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1861:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1862:2: (iv_ruleDependency= ruleDependency EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1863:2: iv_ruleDependency= ruleDependency EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDependencyRule()); 
            }
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency3711);
            iv_ruleDependency=ruleDependency();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDependency; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency3721); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1870:1: ruleDependency returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'dependency' )=>otherlv_1= 'dependency' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1873:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'dependency' )=>otherlv_1= 'dependency' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1874:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'dependency' )=>otherlv_1= 'dependency' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1874:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'dependency' )=>otherlv_1= 'dependency' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1874:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'dependency' )=>otherlv_1= 'dependency' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1874:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==41) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1875:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1875:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1876:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDependencyAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleDependency3767);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDependencyRule());
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
            	    break loop50;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1892:3: ( ( 'dependency' )=>otherlv_1= 'dependency' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1892:4: ( 'dependency' )=>otherlv_1= 'dependency'
            {
            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDependency3788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getDependencyKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1897:2: ( (lv_label_2_0= ruleCompositeID ) )?
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1898:1: (lv_label_2_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1898:1: (lv_label_2_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1899:3: lv_label_2_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDependencyAccess().getLabelCompositeIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleDependency3810);
                    lv_label_2_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDependencyRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1915:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1916:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1916:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1917:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDependencyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDependencyAccess().getHeadEntityCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleDependency3834);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1930:2: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1931:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1931:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1932:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDependencyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDependencyAccess().getTailEntityCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleDependency3857);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDependency3869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getEndKeyword_5());
                  
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleRealization"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1957:1: entryRuleRealization returns [EObject current=null] : iv_ruleRealization= ruleRealization EOF ;
    public final EObject entryRuleRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealization = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1958:2: (iv_ruleRealization= ruleRealization EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1959:2: iv_ruleRealization= ruleRealization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealizationRule()); 
            }
            pushFollow(FOLLOW_ruleRealization_in_entryRuleRealization3905);
            iv_ruleRealization=ruleRealization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealization3915); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRealization"


    // $ANTLR start "ruleRealization"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1966:1: ruleRealization returns [EObject current=null] : ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'realization' )=>otherlv_1= 'realization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' ) ;
    public final EObject ruleRealization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_annotation_0_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1969:28: ( ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'realization' )=>otherlv_1= 'realization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1970:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'realization' )=>otherlv_1= 'realization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1970:1: ( ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'realization' )=>otherlv_1= 'realization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1970:2: ( (lv_annotation_0_0= ruleAnnotation ) )* ( ( 'realization' )=>otherlv_1= 'realization' ) ( (lv_label_2_0= ruleCompositeID ) )? ( ( ruleExtendedID ) ) ( ( ruleExtendedID ) ) otherlv_5= 'end'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1970:2: ( (lv_annotation_0_0= ruleAnnotation ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==41) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1971:1: (lv_annotation_0_0= ruleAnnotation )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1971:1: (lv_annotation_0_0= ruleAnnotation )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1972:3: lv_annotation_0_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRealizationAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleRealization3961);
            	    lv_annotation_0_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRealizationRule());
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
            	    break loop52;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1988:3: ( ( 'realization' )=>otherlv_1= 'realization' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1988:4: ( 'realization' )=>otherlv_1= 'realization'
            {
            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleRealization3982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRealizationAccess().getRealizationKeyword_1());
                  
            }

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1993:2: ( (lv_label_2_0= ruleCompositeID ) )?
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1994:1: (lv_label_2_0= ruleCompositeID )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1994:1: (lv_label_2_0= ruleCompositeID )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1995:3: lv_label_2_0= ruleCompositeID
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRealizationAccess().getLabelCompositeIDParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeID_in_ruleRealization4004);
                    lv_label_2_0=ruleCompositeID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRealizationRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2011:3: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2012:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2012:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2013:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRealizationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRealizationAccess().getHeadEntityCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleRealization4028);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2026:2: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2027:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2027:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2028:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRealizationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRealizationAccess().getTailEntityCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleRealization4051);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleRealization4063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRealizationAccess().getEndKeyword_5());
                  
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
    // $ANTLR end "ruleRealization"


    // $ANTLR start "entryRuleMultiplicity"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2053:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2054:2: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2055:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity4099);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicity4109); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2062:1: ruleMultiplicity returns [EObject current=null] : ( ( (lv_lower_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_upper_2_0= ruleMultiplicityValue ) ) )? ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_lower_0_0 = null;

        AntlrDatatypeRuleToken lv_upper_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2065:28: ( ( ( (lv_lower_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_upper_2_0= ruleMultiplicityValue ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2066:1: ( ( (lv_lower_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_upper_2_0= ruleMultiplicityValue ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2066:1: ( ( (lv_lower_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_upper_2_0= ruleMultiplicityValue ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2066:2: ( (lv_lower_0_0= ruleMultiplicityValue ) ) ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_upper_2_0= ruleMultiplicityValue ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2066:2: ( (lv_lower_0_0= ruleMultiplicityValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2067:1: (lv_lower_0_0= ruleMultiplicityValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2067:1: (lv_lower_0_0= ruleMultiplicityValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2068:3: lv_lower_0_0= ruleMultiplicityValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicityAccess().getLowerMultiplicityValueParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity4155);
            lv_lower_0_0=ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicityRule());
              	        }
                     		set(
                     			current, 
                     			"lower",
                      		lv_lower_0_0, 
                      		"MultiplicityValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2084:2: ( ( ( '..' )=>otherlv_1= '..' ) ( (lv_upper_2_0= ruleMultiplicityValue ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==36) && (synpred15_InternalClassmodel())) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2084:3: ( ( '..' )=>otherlv_1= '..' ) ( (lv_upper_2_0= ruleMultiplicityValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2084:3: ( ( '..' )=>otherlv_1= '..' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2084:4: ( '..' )=>otherlv_1= '..'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleMultiplicity4176); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getMultiplicityAccess().getFullStopFullStopKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2089:2: ( (lv_upper_2_0= ruleMultiplicityValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2090:1: (lv_upper_2_0= ruleMultiplicityValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2090:1: (lv_upper_2_0= ruleMultiplicityValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2091:3: lv_upper_2_0= ruleMultiplicityValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicityAccess().getUpperMultiplicityValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity4198);
                    lv_upper_2_0=ruleMultiplicityValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicityRule());
                      	        }
                             		set(
                             			current, 
                             			"upper",
                              		lv_upper_2_0, 
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2115:1: entryRuleMultiplicityValue returns [String current=null] : iv_ruleMultiplicityValue= ruleMultiplicityValue EOF ;
    public final String entryRuleMultiplicityValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicityValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2116:2: (iv_ruleMultiplicityValue= ruleMultiplicityValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2117:2: iv_ruleMultiplicityValue= ruleMultiplicityValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicityValueRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue4237);
            iv_ruleMultiplicityValue=ruleMultiplicityValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicityValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicityValue4248); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2124:1: ruleMultiplicityValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NATURAL_0= RULE_NATURAL | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicityValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NATURAL_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2127:28: ( (this_NATURAL_0= RULE_NATURAL | kw= '*' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2128:1: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2128:1: (this_NATURAL_0= RULE_NATURAL | kw= '*' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_NATURAL) ) {
                alt55=1;
            }
            else if ( (LA55_0==37) ) {
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2128:6: this_NATURAL_0= RULE_NATURAL
                    {
                    this_NATURAL_0=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleMultiplicityValue4288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NATURAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NATURAL_0, grammarAccess.getMultiplicityValueAccess().getNATURALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2137:2: kw= '*'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleMultiplicityValue4312); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2150:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2151:2: (iv_ruleConstant= ruleConstant EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2152:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant4352);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant4362); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2159:1: ruleConstant returns [EObject current=null] : ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_visibility_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2162:28: ( ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2163:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2163:1: ( ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2163:2: ( (lv_visibility_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= ruleImplicitValue ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2163:2: ( (lv_visibility_0_0= ruleVisibility ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==43||(LA56_0>=46 && LA56_0<=48)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2164:1: (lv_visibility_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2164:1: (lv_visibility_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2165:3: lv_visibility_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getVisibilityVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleConstant4408);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2181:3: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2182:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2182:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2183:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstant4426); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleConstant4443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantAccess().getEqualsSignKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2203:1: ( (lv_value_3_0= ruleImplicitValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2204:1: (lv_value_3_0= ruleImplicitValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2204:1: (lv_value_3_0= ruleImplicitValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2205:3: lv_value_3_0= ruleImplicitValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantAccess().getValueImplicitValueParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_ruleConstant4464);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2229:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2230:2: (iv_ruleOperation= ruleOperation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2231:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation4500);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation4510); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2238:1: ruleOperation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2241:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2242:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2242:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2242:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )? otherlv_8= ')' (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )? ( (lv_body_11_0= RULE_BODY ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2242:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2244:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2244:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2245:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2248:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2249:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2249:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop57:
            do {
                int alt57=3;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==43|| LA57_0 >=46 && LA57_0<=48) && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                    alt57=1;
                }
                else if ( LA57_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                    alt57=2;
                }


                switch (alt57) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2251:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2251:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2252:5: {...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2252:106: ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2253:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2256:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2256:7: {...}? => ( (lv_visibility_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2256:16: ( (lv_visibility_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2257:1: (lv_visibility_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2257:1: (lv_visibility_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2258:3: lv_visibility_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleOperation4601);
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
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2281:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2281:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2282:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2282:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2283:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2286:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2286:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2286:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2287:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2287:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2288:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,38,FOLLOW_38_in_ruleOperation4673); if (state.failed) return current;
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
            	    break loop57;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2315:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2316:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2316:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2317:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation4743); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleOperation4760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2337:1: ( ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) && (synpred16_InternalClassmodel())) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2337:2: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2337:2: ( ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2337:3: ( ( ruleParameter ) )=> (lv_parameter_5_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2342:1: (lv_parameter_5_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2343:3: lv_parameter_5_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperation4792);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2359:2: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==22) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2359:4: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleOperation4805); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2363:1: ( (lv_parameter_7_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2364:1: (lv_parameter_7_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2364:1: (lv_parameter_7_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2365:3: lv_parameter_7_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParameterParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperation4826);
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
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleOperation4842); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2385:1: (otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==28) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2385:3: otherlv_9= ':' ( (lv_return_10_0= ruleReference ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleOperation4855); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_5_0());
                          
                    }
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2389:1: ( (lv_return_10_0= ruleReference ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2390:1: (lv_return_10_0= ruleReference )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2390:1: (lv_return_10_0= ruleReference )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2391:3: lv_return_10_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleOperation4876);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2407:4: ( (lv_body_11_0= RULE_BODY ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_BODY) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2408:1: (lv_body_11_0= RULE_BODY )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2408:1: (lv_body_11_0= RULE_BODY )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2409:3: lv_body_11_0= RULE_BODY
                    {
                    lv_body_11_0=(Token)match(input,RULE_BODY,FOLLOW_RULE_BODY_in_ruleOperation4895); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2433:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2434:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2435:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter4937);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter4947); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2442:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2445:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2446:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2446:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2446:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2446:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2447:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2447:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2448:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter4989); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleParameter5006); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2468:1: ( (lv_type_2_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2469:1: (lv_type_2_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2469:1: (lv_type_2_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2470:3: lv_type_2_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleParameter5027);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2486:2: ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==25) && (synpred17_InternalClassmodel())) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2486:3: ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleImplicitValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2486:3: ( ( '=' )=>otherlv_3= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2486:4: ( '=' )=>otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleParameter5048); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2491:2: ( (lv_implicit_4_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2492:1: (lv_implicit_4_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2492:1: (lv_implicit_4_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2493:3: lv_implicit_4_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleParameter5070);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2509:2: (otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==22) ) {
                            int LA62_1 = input.LA(2);

                            if ( (LA62_1==RULE_ID) ) {
                                int LA62_3 = input.LA(3);

                                if ( (LA62_3==EOF||LA62_3==22||LA62_3==40) ) {
                                    alt62=1;
                                }


                            }
                            else if ( (LA62_1==RULE_STRING||LA62_1==RULE_NATURAL||(LA62_1>=RULE_NULL && LA62_1<=RULE_BOOLEAN)||LA62_1==43) ) {
                                alt62=1;
                            }


                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2509:4: otherlv_5= ',' ( (lv_implicit_6_0= ruleImplicitValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleParameter5083); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2513:1: ( (lv_implicit_6_0= ruleImplicitValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2514:1: (lv_implicit_6_0= ruleImplicitValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2514:1: (lv_implicit_6_0= ruleImplicitValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2515:3: lv_implicit_6_0= ruleImplicitValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitImplicitValueParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImplicitValue_in_ruleParameter5104);
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
                    	    break loop62;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2539:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2540:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2541:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute5144);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute5154); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2548:1: ruleAttribute returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2551:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2552:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2552:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2552:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2552:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2554:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2554:1: ( ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2555:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2558:2: ( ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2559:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2559:3: ( ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop64:
            do {
                int alt64=3;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==43|| LA64_0 >=46 && LA64_0<=48) && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                    alt64=1;
                }
                else if ( LA64_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                    alt64=2;
                }


                switch (alt64) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2561:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2561:4: ({...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2562:5: {...}? => ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2562:106: ( ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2563:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2566:6: ({...}? => ( (lv_visibility_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2566:7: {...}? => ( (lv_visibility_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2566:16: ( (lv_visibility_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2567:1: (lv_visibility_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2567:1: (lv_visibility_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2568:3: lv_visibility_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getVisibilityVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleAttribute5245);
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
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2591:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2591:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2592:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2592:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2593:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2596:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2596:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2596:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2597:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2597:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2598:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,38,FOLLOW_38_in_ruleAttribute5317); if (state.failed) return current;
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
            	    break loop64;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2625:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2626:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2626:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2627:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute5387); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAttribute5404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2647:1: ( (lv_type_5_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2648:1: (lv_type_5_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2648:1: (lv_type_5_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2649:3: lv_type_5_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleAttribute5425);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2665:2: ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==25) && (synpred18_InternalClassmodel())) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2665:3: ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleImplicitValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2665:3: ( ( '=' )=>otherlv_6= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2665:4: ( '=' )=>otherlv_6= '='
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleAttribute5446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2670:2: ( (lv_implicit_7_0= ruleImplicitValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2671:1: (lv_implicit_7_0= ruleImplicitValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2671:1: (lv_implicit_7_0= ruleImplicitValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2672:3: lv_implicit_7_0= ruleImplicitValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplicitValue_in_ruleAttribute5468);
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2688:2: (otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==22) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2688:4: otherlv_8= ',' ( (lv_implicit_9_0= ruleImplicitValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleAttribute5481); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2692:1: ( (lv_implicit_9_0= ruleImplicitValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2693:1: (lv_implicit_9_0= ruleImplicitValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2693:1: (lv_implicit_9_0= ruleImplicitValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2694:3: lv_implicit_9_0= ruleImplicitValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitImplicitValueParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleImplicitValue_in_ruleAttribute5502);
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
                    	    break loop65;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2718:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2719:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2720:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference5542);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference5552); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2727:1: ruleReference returns [EObject current=null] : ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2730:28: ( ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2731:1: ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2731:1: ( ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2731:2: ( ( ruleExtendedID ) ) ( (lv_array_1_0= ruleArray ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2731:2: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2732:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2732:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2733:3: ruleExtendedID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleReference5600);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2746:2: ( (lv_array_1_0= ruleArray ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==29) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2747:1: (lv_array_1_0= ruleArray )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2747:1: (lv_array_1_0= ruleArray )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2748:3: lv_array_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleReference5621);
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
            	    break loop67;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2772:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2773:2: (iv_ruleArray= ruleArray EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2774:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray5658);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray5668); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2781:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_size_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2784:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2785:1: ( () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2785:1: ( () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2785:2: () otherlv_1= '[' ( (lv_size_2_0= ruleMultiplicity ) )? otherlv_3= ']'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2785:2: ()
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2786:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayAccess().getArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleArray5714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2795:1: ( (lv_size_2_0= ruleMultiplicity ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_NATURAL||LA68_0==37) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2796:1: (lv_size_2_0= ruleMultiplicity )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2796:1: (lv_size_2_0= ruleMultiplicity )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2797:3: lv_size_2_0= ruleMultiplicity
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayAccess().getSizeMultiplicityParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMultiplicity_in_ruleArray5735);
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleArray5748); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2825:1: entryRuleImplicitValue returns [String current=null] : iv_ruleImplicitValue= ruleImplicitValue EOF ;
    public final String entryRuleImplicitValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImplicitValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2826:2: (iv_ruleImplicitValue= ruleImplicitValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2827:2: iv_ruleImplicitValue= ruleImplicitValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicitValueRule()); 
            }
            pushFollow(FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue5785);
            iv_ruleImplicitValue=ruleImplicitValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicitValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitValue5796); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2834:1: ruleImplicitValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2837:28: ( (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2838:1: (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2838:1: (this_NULL_0= RULE_NULL | this_BOOLEAN_1= RULE_BOOLEAN | this_STRING_2= RULE_STRING | this_Integer_3= ruleInteger | this_Real_4= ruleReal | this_ID_5= RULE_ID )
            int alt69=6;
            switch ( input.LA(1) ) {
            case RULE_NULL:
                {
                alt69=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt69=2;
                }
                break;
            case RULE_STRING:
                {
                alt69=3;
                }
                break;
            case 43:
                {
                int LA69_4 = input.LA(2);

                if ( (LA69_4==RULE_NATURAL) ) {
                    int LA69_5 = input.LA(3);

                    if ( (LA69_5==EOF||(LA69_5>=RULE_ID && LA69_5<=RULE_CONSTRAINT)||LA69_5==19||LA69_5==22||LA69_5==38||LA69_5==40||LA69_5==43||(LA69_5>=46 && LA69_5<=48)) ) {
                        alt69=4;
                    }
                    else if ( (LA69_5==42) ) {
                        alt69=5;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 5, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA69_5 = input.LA(2);

                if ( (LA69_5==EOF||(LA69_5>=RULE_ID && LA69_5<=RULE_CONSTRAINT)||LA69_5==19||LA69_5==22||LA69_5==38||LA69_5==40||LA69_5==43||(LA69_5>=46 && LA69_5<=48)) ) {
                    alt69=4;
                }
                else if ( (LA69_5==42) ) {
                    alt69=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt69=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2838:6: this_NULL_0= RULE_NULL
                    {
                    this_NULL_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleImplicitValue5836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_0, grammarAccess.getImplicitValueAccess().getNULLTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2846:10: this_BOOLEAN_1= RULE_BOOLEAN
                    {
                    this_BOOLEAN_1=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleImplicitValue5862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_1, grammarAccess.getImplicitValueAccess().getBOOLEANTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2854:10: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImplicitValue5888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_2, grammarAccess.getImplicitValueAccess().getSTRINGTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2863:5: this_Integer_3= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImplicitValueAccess().getIntegerParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleImplicitValue5921);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2875:5: this_Real_4= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getImplicitValueAccess().getRealParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleImplicitValue5954);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2886:10: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImplicitValue5980); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2901:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2902:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2903:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6025);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6035); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2910:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_property_3_0 = null;

        EObject lv_property_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2913:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2914:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2914:1: (otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2914:3: otherlv_0= '@' ( (lv_name_1_0= ruleExtendedID ) ) (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleAnnotation6072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2918:1: ( (lv_name_1_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2919:1: (lv_name_1_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2919:1: (lv_name_1_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2920:3: lv_name_1_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAnnotation6093);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2936:2: (otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==39) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2936:4: otherlv_2= '(' ( (lv_property_3_0= ruleProperty ) ) (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleAnnotation6106); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2940:1: ( (lv_property_3_0= ruleProperty ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2941:1: (lv_property_3_0= ruleProperty )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2941:1: (lv_property_3_0= ruleProperty )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2942:3: lv_property_3_0= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleAnnotation6127);
                    lv_property_3_0=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"property",
                              		lv_property_3_0, 
                              		"Property");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2958:2: (otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==22) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2958:4: otherlv_4= ',' ( (lv_property_5_0= ruleProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAnnotation6140); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2962:1: ( (lv_property_5_0= ruleProperty ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2963:1: (lv_property_5_0= ruleProperty )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2963:1: (lv_property_5_0= ruleProperty )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2964:3: lv_property_5_0= ruleProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getPropertyPropertyParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleProperty_in_ruleAnnotation6161);
                    	    lv_property_5_0=ruleProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"property",
                    	              		lv_property_5_0, 
                    	              		"Property");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,40,FOLLOW_40_in_ruleAnnotation6175); if (state.failed) return current;
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


    // $ANTLR start "entryRuleProperty"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2992:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2993:2: (iv_ruleProperty= ruleProperty EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2994:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty6213);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty6223); if (state.failed) return current;

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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3001:1: ruleProperty returns [EObject current=null] : (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_AssignProperty_0 = null;

        EObject this_ValueProperty_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3004:28: ( (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3005:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3005:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3006:5: this_AssignProperty_0= ruleAssignProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getAssignPropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignProperty_in_ruleProperty6270);
                    this_AssignProperty_0=ruleAssignProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssignProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3016:5: this_ValueProperty_1= ruleValueProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueProperty_in_ruleProperty6297);
                    this_ValueProperty_1=ruleValueProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueProperty_1; 
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleAssignProperty"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3032:1: entryRuleAssignProperty returns [EObject current=null] : iv_ruleAssignProperty= ruleAssignProperty EOF ;
    public final EObject entryRuleAssignProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignProperty = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3033:2: (iv_ruleAssignProperty= ruleAssignProperty EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3034:2: iv_ruleAssignProperty= ruleAssignProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAssignProperty_in_entryRuleAssignProperty6332);
            iv_ruleAssignProperty=ruleAssignProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignProperty6342); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignProperty"


    // $ANTLR start "ruleAssignProperty"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3041:1: ruleAssignProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleAssignProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3044:28: ( ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3045:1: ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3045:1: ( ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3045:2: ( (lv_name_0_0= ruleExtendedID ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3045:2: ( (lv_name_0_0= ruleExtendedID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3046:1: (lv_name_0_0= ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3046:1: (lv_name_0_0= ruleExtendedID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3047:3: lv_name_0_0= ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignPropertyAccess().getNameExtendedIDParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExtendedID_in_ruleAssignProperty6388);
            lv_name_0_0=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ExtendedID");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAssignProperty6400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignPropertyAccess().getEqualsSignKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3067:1: ( (lv_value_2_0= ruleValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3068:1: (lv_value_2_0= ruleValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3068:1: (lv_value_2_0= ruleValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3069:3: lv_value_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignPropertyAccess().getValueValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleAssignProperty6421);
            lv_value_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignPropertyRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Value");
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
    // $ANTLR end "ruleAssignProperty"


    // $ANTLR start "entryRuleValueProperty"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3093:1: entryRuleValueProperty returns [EObject current=null] : iv_ruleValueProperty= ruleValueProperty EOF ;
    public final EObject entryRuleValueProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueProperty = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3094:2: (iv_ruleValueProperty= ruleValueProperty EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3095:2: iv_ruleValueProperty= ruleValueProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValuePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleValueProperty_in_entryRuleValueProperty6457);
            iv_ruleValueProperty=ruleValueProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueProperty6467); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueProperty"


    // $ANTLR start "ruleValueProperty"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3102:1: ruleValueProperty returns [EObject current=null] : ( (lv_value_0_0= ruleValue ) ) ;
    public final EObject ruleValueProperty() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3105:28: ( ( (lv_value_0_0= ruleValue ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3106:1: ( (lv_value_0_0= ruleValue ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3106:1: ( (lv_value_0_0= ruleValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3107:1: (lv_value_0_0= ruleValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3107:1: (lv_value_0_0= ruleValue )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3108:3: lv_value_0_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getValuePropertyAccess().getValueValueParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleValueProperty6512);
            lv_value_0_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getValuePropertyRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleValueProperty"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3132:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3133:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3134:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue6548);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue6559); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3141:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3144:28: ( (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3145:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3145:1: (this_Integer_0= ruleInteger | this_STRING_1= RULE_STRING | this_ExtendedID_2= ruleExtendedID | this_BOOLEAN_3= RULE_BOOLEAN | this_NULL_4= RULE_NULL | this_Real_5= ruleReal )
            int alt73=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==RULE_NATURAL) ) {
                    int LA73_2 = input.LA(3);

                    if ( (LA73_2==42) ) {
                        alt73=6;
                    }
                    else if ( (LA73_2==EOF||LA73_2==22||LA73_2==40) ) {
                        alt73=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==42) ) {
                    alt73=6;
                }
                else if ( (LA73_2==EOF||LA73_2==22||LA73_2==40) ) {
                    alt73=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt73=2;
                }
                break;
            case RULE_ID:
                {
                alt73=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt73=4;
                }
                break;
            case RULE_NULL:
                {
                alt73=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3146:5: this_Integer_0= ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInteger_in_ruleValue6606);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3157:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue6632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3166:5: this_ExtendedID_2= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleValue6665);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3177:10: this_BOOLEAN_3= RULE_BOOLEAN
                    {
                    this_BOOLEAN_3=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleValue6691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_3, grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3185:10: this_NULL_4= RULE_NULL
                    {
                    this_NULL_4=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleValue6717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_NULL_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_NULL_4, grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3194:5: this_Real_5= ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReal_in_ruleValue6750);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3212:1: entryRuleExtendedID returns [String current=null] : iv_ruleExtendedID= ruleExtendedID EOF ;
    public final String entryRuleExtendedID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExtendedID = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3213:2: (iv_ruleExtendedID= ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3214:2: iv_ruleExtendedID= ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID6796);
            iv_ruleExtendedID=ruleExtendedID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtendedID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID6807); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3221:1: ruleExtendedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleExtendedID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3224:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3225:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3225:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3225:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID6847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3232:1: (kw= '.' this_ID_2= RULE_ID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==42) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3233:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_42_in_ruleExtendedID6866); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExtendedID6881); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3255:1: entryRuleCompositeID returns [String current=null] : iv_ruleCompositeID= ruleCompositeID EOF ;
    public final String entryRuleCompositeID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompositeID = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3256:2: (iv_ruleCompositeID= ruleCompositeID EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3257:2: iv_ruleCompositeID= ruleCompositeID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeIDRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeID_in_entryRuleCompositeID6931);
            iv_ruleCompositeID=ruleCompositeID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeID.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeID6942); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3264:1: ruleCompositeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleCompositeID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_ExtendedID_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3267:28: ( (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3268:1: (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3268:1: (this_ExtendedID_0= ruleExtendedID | this_STRING_1= RULE_STRING )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ID) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_STRING) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3269:5: this_ExtendedID_0= ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeIDAccess().getExtendedIDParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_ruleCompositeID6989);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3280:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompositeID7015); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3295:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3296:2: (iv_ruleReal= ruleReal EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3297:2: iv_ruleReal= ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal7061);
            iv_ruleReal=ruleReal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReal.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal7072); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3304:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;
        Token this_NATURAL_3=null;
        Token this_NATURAL_8=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3307:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3308:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3308:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3308:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL kw= '.' this_NATURAL_3= RULE_NATURAL ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3308:2: (kw= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==43) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3309:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleReal7111); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal7128); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_1, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,42,FOLLOW_42_in_ruleReal7146); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_2()); 
                  
            }
            this_NATURAL_3=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal7161); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_NATURAL_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NATURAL_3, grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3334:1: ( (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=44 && LA79_0<=45)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3334:2: (kw= 'e' | kw= 'E' ) (kw= '+' | kw= '-' ) this_NATURAL_8= RULE_NATURAL
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3334:2: (kw= 'e' | kw= 'E' )
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==44) ) {
                        alt77=1;
                    }
                    else if ( (LA77_0==45) ) {
                        alt77=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 77, 0, input);

                        throw nvae;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3335:2: kw= 'e'
                            {
                            kw=(Token)match(input,44,FOLLOW_44_in_ruleReal7181); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3342:2: kw= 'E'
                            {
                            kw=(Token)match(input,45,FOLLOW_45_in_ruleReal7200); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3347:2: (kw= '+' | kw= '-' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==46) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==43) ) {
                        alt78=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3348:2: kw= '+'
                            {
                            kw=(Token)match(input,46,FOLLOW_46_in_ruleReal7215); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3355:2: kw= '-'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleReal7234); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_NATURAL_8=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleReal7250); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3375:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3376:2: (iv_ruleInteger= ruleInteger EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3377:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger7298);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger7309); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3384:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_NATURAL_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3387:28: ( ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3388:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3388:1: ( (kw= '-' )? this_NATURAL_1= RULE_NATURAL )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3388:2: (kw= '-' )? this_NATURAL_1= RULE_NATURAL
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3388:2: (kw= '-' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==43) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3389:2: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleInteger7348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_NATURAL_1=(Token)match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_ruleInteger7365); if (state.failed) return current;
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


    // $ANTLR start "ruleVisibility"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3409:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3411:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3412:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3412:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt81=1;
                }
                break;
            case 43:
                {
                alt81=2;
                }
                break;
            case 47:
                {
                alt81=3;
                }
                break;
            case 48:
                {
                alt81=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3412:2: (enumLiteral_0= '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3412:2: (enumLiteral_0= '+' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3412:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_46_in_ruleVisibility7424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3418:6: (enumLiteral_1= '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3418:6: (enumLiteral_1= '-' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3418:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_43_in_ruleVisibility7441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3424:6: (enumLiteral_2= '#' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3424:6: (enumLiteral_2= '#' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3424:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleVisibility7458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3430:6: (enumLiteral_3= '~' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3430:6: (enumLiteral_3= '~' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:3430:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleVisibility7475); if (state.failed) return current;
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
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:8: ( 'in' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:10: 'in'
        {
        match(input,23,FOLLOW_23_in_synpred5_InternalClassmodel1087); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalClassmodel

    // $ANTLR start synpred6_InternalClassmodel
    public final void synpred6_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:737:4: ( 'enum' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:737:6: 'enum'
        {
        match(input,24,FOLLOW_24_in_synpred6_InternalClassmodel1568); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalClassmodel

    // $ANTLR start synpred7_InternalClassmodel
    public final void synpred7_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:760:4: ( 'in' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:760:6: 'in'
        {
        match(input,23,FOLLOW_23_in_synpred7_InternalClassmodel1612); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalClassmodel

    // $ANTLR start synpred8_InternalClassmodel
    public final void synpred8_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:862:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:862:6: '='
        {
        match(input,25,FOLLOW_25_in_synpred8_InternalClassmodel1807); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalClassmodel

    // $ANTLR start synpred9_InternalClassmodel
    public final void synpred9_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1022:4: ( 'association' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1022:6: 'association'
        {
        match(input,26,FOLLOW_26_in_synpred9_InternalClassmodel2194); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalClassmodel

    // $ANTLR start synpred10_InternalClassmodel
    public final void synpred10_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1280:4: ( 'aggregation' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1280:6: 'aggregation'
        {
        match(input,31,FOLLOW_31_in_synpred10_InternalClassmodel2658); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalClassmodel

    // $ANTLR start synpred11_InternalClassmodel
    public final void synpred11_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1538:4: ( 'composition' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1538:6: 'composition'
        {
        match(input,32,FOLLOW_32_in_synpred11_InternalClassmodel3122); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalClassmodel

    // $ANTLR start synpred12_InternalClassmodel
    public final void synpred12_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1796:4: ( 'generalization' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1796:6: 'generalization'
        {
        match(input,33,FOLLOW_33_in_synpred12_InternalClassmodel3586); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalClassmodel

    // $ANTLR start synpred13_InternalClassmodel
    public final void synpred13_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1892:4: ( 'dependency' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1892:6: 'dependency'
        {
        match(input,34,FOLLOW_34_in_synpred13_InternalClassmodel3780); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalClassmodel

    // $ANTLR start synpred14_InternalClassmodel
    public final void synpred14_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1988:4: ( 'realization' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1988:6: 'realization'
        {
        match(input,35,FOLLOW_35_in_synpred14_InternalClassmodel3974); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalClassmodel

    // $ANTLR start synpred15_InternalClassmodel
    public final void synpred15_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2084:4: ( '..' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2084:6: '..'
        {
        match(input,36,FOLLOW_36_in_synpred15_InternalClassmodel4168); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalClassmodel

    // $ANTLR start synpred16_InternalClassmodel
    public final void synpred16_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2337:3: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2338:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2338:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2339:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred16_InternalClassmodel4775);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalClassmodel

    // $ANTLR start synpred17_InternalClassmodel
    public final void synpred17_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2486:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2486:6: '='
        {
        match(input,25,FOLLOW_25_in_synpred17_InternalClassmodel5040); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalClassmodel

    // $ANTLR start synpred18_InternalClassmodel
    public final void synpred18_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2665:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:2665:6: '='
        {
        match(input,25,FOLLOW_25_in_synpred18_InternalClassmodel5438); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalClassmodel

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
    public final boolean synpred18_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalClassmodel_fragment(); // can never throw exception
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
    public final boolean synpred15_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalClassmodel_fragment(); // can never throw exception
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
    public final boolean synpred16_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalClassmodel_fragment(); // can never throw exception
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
    public final boolean synpred17_InternalClassmodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalClassmodel_fragment(); // can never throw exception
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
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String DFA3_eotS =
        "\111\uffff";
    static final String DFA3_eofS =
        "\111\uffff";
    static final String DFA3_minS =
        "\1\21\1\5\3\uffff\1\21\1\5\1\4\1\21\1\26\1\7\4\26\1\5\1\4\1\21"+
        "\1\4\1\7\2\26\1\7\4\26\1\7\6\26\1\5\1\4\2\7\1\5\2\53\1\26\1\7\10"+
        "\26\3\7\1\5\4\53\3\26\4\7\2\53\2\26\2\7\1\26";
    static final String DFA3_maxS =
        "\1\51\1\5\3\uffff\1\52\1\5\1\53\2\52\1\7\1\52\3\50\1\5\1\53\1\51"+
        "\1\53\1\7\2\52\1\7\1\52\3\50\1\7\1\52\1\50\1\52\2\50\1\55\1\5\1"+
        "\53\2\7\1\5\2\56\1\52\1\7\1\52\1\50\1\52\2\50\2\55\1\52\3\7\1\5"+
        "\4\56\1\50\1\55\1\52\4\7\2\56\2\50\2\7\1\50";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\104\uffff";
    static final String DFA3_specialS =
        "\111\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\4\1\3\1\uffff\1\4\3\uffff\1\4\1\uffff\1\2\4\uffff\5\2\5"+
            "\uffff\1\1",
            "\1\5",
            "",
            "",
            "",
            "\1\4\1\3\1\uffff\1\4\3\uffff\1\4\1\uffff\1\2\4\uffff\5\2\3"+
            "\uffff\1\7\1\uffff\1\1\1\6",
            "\1\10",
            "\1\14\1\11\1\uffff\1\13\1\uffff\1\16\1\15\40\uffff\1\12",
            "\1\4\1\3\1\uffff\1\4\3\uffff\1\4\1\uffff\1\2\4\uffff\5\2\3"+
            "\uffff\1\7\1\uffff\1\1\1\6",
            "\1\20\2\uffff\1\22\16\uffff\1\21\1\uffff\1\17",
            "\1\13",
            "\1\20\21\uffff\1\21\1\uffff\1\23",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21",
            "\1\24",
            "\1\30\1\25\1\uffff\1\27\1\uffff\1\32\1\31\40\uffff\1\26",
            "\1\4\1\3\1\uffff\1\4\3\uffff\1\4\1\uffff\1\2\4\uffff\5\2\5"+
            "\uffff\1\1",
            "\1\35\1\36\1\uffff\1\34\1\uffff\1\40\1\37\40\uffff\1\33",
            "\1\41",
            "\1\20\2\uffff\1\22\16\uffff\1\21\1\uffff\1\17",
            "\1\20\2\uffff\1\43\16\uffff\1\21\1\uffff\1\42",
            "\1\27",
            "\1\20\21\uffff\1\21\1\uffff\1\44",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21",
            "\1\34",
            "\1\20\21\uffff\1\21\1\uffff\1\45",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21\1\uffff\1\46",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21\3\uffff\1\47\1\50",
            "\1\51",
            "\1\54\1\55\1\uffff\1\53\1\uffff\1\57\1\56\40\uffff\1\52",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\64\2\uffff\1\63",
            "\1\64\2\uffff\1\63",
            "\1\20\2\uffff\1\43\16\uffff\1\21\1\uffff\1\42",
            "\1\53",
            "\1\20\21\uffff\1\21\1\uffff\1\65",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21\1\uffff\1\66",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21\3\uffff\1\67\1\70",
            "\1\20\21\uffff\1\21\3\uffff\1\71\1\72",
            "\1\20\21\uffff\1\21\1\uffff\1\46",
            "\1\73",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\77\2\uffff\1\76",
            "\1\77\2\uffff\1\76",
            "\1\101\2\uffff\1\100",
            "\1\101\2\uffff\1\100",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21\3\uffff\1\102\1\103",
            "\1\20\21\uffff\1\21\1\uffff\1\66",
            "\1\104",
            "\1\104",
            "\1\105",
            "\1\105",
            "\1\107\2\uffff\1\106",
            "\1\107\2\uffff\1\106",
            "\1\20\21\uffff\1\21",
            "\1\20\21\uffff\1\21",
            "\1\110",
            "\1\110",
            "\1\20\21\uffff\1\21"
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
        "\111\uffff";
    static final String DFA4_eofS =
        "\111\uffff";
    static final String DFA4_minS =
        "\1\21\1\5\3\uffff\1\21\1\5\1\4\1\21\1\26\1\7\4\26\1\5\2\4\1\21"+
        "\1\7\1\26\1\7\6\26\1\7\5\26\1\7\2\5\1\4\1\7\2\53\3\26\1\7\6\26\2"+
        "\7\2\53\1\7\1\5\2\53\1\26\2\7\2\26\2\7\1\26\2\53\1\26\2\7\1\26";
    static final String DFA4_maxS =
        "\1\51\1\5\3\uffff\1\52\1\5\1\53\2\52\1\7\1\52\3\50\1\5\2\53\1\51"+
        "\1\7\1\52\1\7\1\52\1\50\1\52\2\50\1\52\1\7\1\52\3\50\1\55\1\7\2"+
        "\5\1\53\1\7\2\56\1\55\2\52\1\7\1\52\1\50\1\52\2\50\1\55\2\7\2\56"+
        "\1\7\1\5\2\56\1\50\2\7\1\55\1\52\2\7\1\50\2\56\1\50\2\7\1\50";
    static final String DFA4_acceptS =
        "\2\uffff\1\1\1\2\1\3\104\uffff";
    static final String DFA4_specialS =
        "\111\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\2\uffff\1\3\3\uffff\1\4\20\uffff\1\1",
            "\1\5",
            "",
            "",
            "",
            "\1\2\2\uffff\1\3\3\uffff\1\4\16\uffff\1\7\1\uffff\1\1\1\6",
            "\1\10",
            "\1\14\1\11\1\uffff\1\13\1\uffff\1\16\1\15\40\uffff\1\12",
            "\1\2\2\uffff\1\3\3\uffff\1\4\16\uffff\1\7\1\uffff\1\1\1\6",
            "\1\21\2\uffff\1\20\16\uffff\1\22\1\uffff\1\17",
            "\1\13",
            "\1\21\21\uffff\1\22\1\uffff\1\23",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22",
            "\1\24",
            "\1\27\1\30\1\uffff\1\26\1\uffff\1\32\1\31\40\uffff\1\25",
            "\1\36\1\33\1\uffff\1\35\1\uffff\1\40\1\37\40\uffff\1\34",
            "\1\2\2\uffff\1\3\3\uffff\1\4\20\uffff\1\1",
            "\1\41",
            "\1\21\2\uffff\1\20\16\uffff\1\22\1\uffff\1\17",
            "\1\26",
            "\1\21\21\uffff\1\22\1\uffff\1\42",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22\1\uffff\1\43",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22",
            "\1\21\2\uffff\1\45\16\uffff\1\22\1\uffff\1\44",
            "\1\35",
            "\1\21\21\uffff\1\22\1\uffff\1\46",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22\3\uffff\1\47\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\56\1\57\1\uffff\1\55\1\uffff\1\61\1\60\40\uffff\1\54",
            "\1\62",
            "\1\64\2\uffff\1\63",
            "\1\64\2\uffff\1\63",
            "\1\21\21\uffff\1\22\3\uffff\1\65\1\66",
            "\1\21\21\uffff\1\22\1\uffff\1\43",
            "\1\21\2\uffff\1\45\16\uffff\1\22\1\uffff\1\44",
            "\1\55",
            "\1\21\21\uffff\1\22\1\uffff\1\67",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22\1\uffff\1\70",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22",
            "\1\21\21\uffff\1\22\3\uffff\1\71\1\72",
            "\1\73",
            "\1\73",
            "\1\75\2\uffff\1\74",
            "\1\75\2\uffff\1\74",
            "\1\76",
            "\1\77",
            "\1\101\2\uffff\1\100",
            "\1\101\2\uffff\1\100",
            "\1\21\21\uffff\1\22",
            "\1\102",
            "\1\102",
            "\1\21\21\uffff\1\22\3\uffff\1\103\1\104",
            "\1\21\21\uffff\1\22\1\uffff\1\70",
            "\1\105",
            "\1\105",
            "\1\21\21\uffff\1\22",
            "\1\107\2\uffff\1\106",
            "\1\107\2\uffff\1\106",
            "\1\21\21\uffff\1\22",
            "\1\110",
            "\1\110",
            "\1\21\21\uffff\1\22"
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
    static final String DFA15_eotS =
        "\17\uffff";
    static final String DFA15_eofS =
        "\17\uffff";
    static final String DFA15_minS =
        "\6\5\1\31\4\5\1\34\3\uffff";
    static final String DFA15_maxS =
        "\6\60\1\47\4\60\1\47\3\uffff";
    static final String DFA15_acceptS =
        "\14\uffff\1\3\1\1\1\2";
    static final String DFA15_specialS =
        "\17\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\6\40\uffff\1\5\4\uffff\1\2\2\uffff\1\1\1\3\1\4",
            "\1\6\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\6\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\6\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\6\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\13\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\14\2\uffff\1\15\12\uffff\1\16",
            "\1\13\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\13\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\13\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\13\40\uffff\1\5\4\uffff\1\10\2\uffff\1\7\1\11\1\12",
            "\1\15\12\uffff\1\16",
            "",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "651:2: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation | this_Constant_2= ruleConstant )";
        }
    }
    static final String DFA23_eotS =
        "\114\uffff";
    static final String DFA23_eofS =
        "\114\uffff";
    static final String DFA23_minS =
        "\1\32\1\5\6\uffff\1\32\1\5\1\4\1\32\1\26\1\7\4\26\1\5\1\4\1\32"+
        "\1\4\1\7\2\26\1\7\4\26\1\7\6\26\1\5\1\4\2\7\1\5\2\53\1\26\1\7\10"+
        "\26\3\7\1\5\4\53\3\26\4\7\2\53\2\26\2\7\1\26";
    static final String DFA23_maxS =
        "\1\51\1\5\6\uffff\1\52\1\5\1\53\2\52\1\7\1\52\3\50\1\5\1\53\1\51"+
        "\1\53\1\7\2\52\1\7\1\52\3\50\1\7\1\52\1\50\1\52\2\50\1\55\1\5\1"+
        "\53\2\7\1\5\2\56\1\52\1\7\1\52\1\50\1\52\2\50\2\55\1\52\3\7\1\5"+
        "\4\56\1\50\1\55\1\52\4\7\2\56\2\50\2\7\1\50";
    static final String DFA23_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\104\uffff";
    static final String DFA23_specialS =
        "\114\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7\5\uffff\1\1",
            "\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7\3\uffff\1\12\1\uffff\1\1"+
            "\1\11",
            "\1\13",
            "\1\17\1\14\1\uffff\1\16\1\uffff\1\21\1\20\40\uffff\1\15",
            "\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7\3\uffff\1\12\1\uffff\1\1"+
            "\1\11",
            "\1\23\2\uffff\1\25\16\uffff\1\24\1\uffff\1\22",
            "\1\16",
            "\1\23\21\uffff\1\24\1\uffff\1\26",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\27",
            "\1\33\1\30\1\uffff\1\32\1\uffff\1\35\1\34\40\uffff\1\31",
            "\1\2\4\uffff\1\3\1\4\1\5\1\6\1\7\5\uffff\1\1",
            "\1\40\1\41\1\uffff\1\37\1\uffff\1\43\1\42\40\uffff\1\36",
            "\1\44",
            "\1\23\2\uffff\1\25\16\uffff\1\24\1\uffff\1\22",
            "\1\23\2\uffff\1\46\16\uffff\1\24\1\uffff\1\45",
            "\1\32",
            "\1\23\21\uffff\1\24\1\uffff\1\47",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\37",
            "\1\23\21\uffff\1\24\1\uffff\1\50",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24\1\uffff\1\51",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24\3\uffff\1\52\1\53",
            "\1\54",
            "\1\57\1\60\1\uffff\1\56\1\uffff\1\62\1\61\40\uffff\1\55",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\67\2\uffff\1\66",
            "\1\67\2\uffff\1\66",
            "\1\23\2\uffff\1\46\16\uffff\1\24\1\uffff\1\45",
            "\1\56",
            "\1\23\21\uffff\1\24\1\uffff\1\70",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24\1\uffff\1\71",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24\3\uffff\1\72\1\73",
            "\1\23\21\uffff\1\24\3\uffff\1\74\1\75",
            "\1\23\21\uffff\1\24\1\uffff\1\51",
            "\1\76",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102\2\uffff\1\101",
            "\1\102\2\uffff\1\101",
            "\1\104\2\uffff\1\103",
            "\1\104\2\uffff\1\103",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24\3\uffff\1\105\1\106",
            "\1\23\21\uffff\1\24\1\uffff\1\71",
            "\1\107",
            "\1\107",
            "\1\110",
            "\1\110",
            "\1\112\2\uffff\1\111",
            "\1\112\2\uffff\1\111",
            "\1\23\21\uffff\1\24",
            "\1\23\21\uffff\1\24",
            "\1\113",
            "\1\113",
            "\1\23\21\uffff\1\24"
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "924:1: (this_Association_0= ruleAssociation | this_Aggregation_1= ruleAggregation | this_Composition_2= ruleComposition | this_Generalization_3= ruleGeneralization | this_Dependency_4= ruleDependency | this_Realization_5= ruleRealization )";
        }
    }
    static final String DFA25_eotS =
        "\7\uffff";
    static final String DFA25_eofS =
        "\7\uffff";
    static final String DFA25_minS =
        "\3\4\1\uffff\1\5\1\uffff\1\4";
    static final String DFA25_maxS =
        "\3\60\1\uffff\1\5\1\uffff\1\60";
    static final String DFA25_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA25_specialS =
        "\7\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\1\1\25\uffff\1\3\17\uffff\1\3\2\uffff\3\3",
            "\2\5\25\uffff\1\5\2\3\14\uffff\1\4\1\5\2\uffff\3\5",
            "\2\5\25\uffff\1\5\1\3\16\uffff\1\5\2\uffff\3\5",
            "",
            "\1\6",
            "",
            "\2\5\25\uffff\1\5\2\3\14\uffff\1\4\1\5\2\uffff\3\5"
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
            return "1027:2: ( (lv_label_2_0= ruleCompositeID ) )?";
        }
    }
    static final String DFA28_eotS =
        "\6\uffff";
    static final String DFA28_eofS =
        "\6\uffff";
    static final String DFA28_minS =
        "\1\4\1\uffff\1\34\1\5\1\uffff\1\34";
    static final String DFA28_maxS =
        "\1\60\1\uffff\1\52\1\5\1\uffff\1\52";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA28_specialS =
        "\6\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\1\1\2\45\uffff\1\1\2\uffff\3\1",
            "",
            "\1\1\1\4\14\uffff\1\3",
            "\1\5",
            "",
            "\1\1\1\4\14\uffff\1\3"
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
            return "1060:3: ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )?";
        }
    }
    static final String DFA31_eotS =
        "\6\uffff";
    static final String DFA31_eofS =
        "\6\uffff";
    static final String DFA31_minS =
        "\1\4\1\uffff\1\34\1\5\1\uffff\1\34";
    static final String DFA31_maxS =
        "\1\60\1\uffff\1\52\1\5\1\uffff\1\52";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA31_specialS =
        "\6\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\1\1\2\45\uffff\1\1\2\uffff\3\1",
            "",
            "\1\1\1\4\14\uffff\1\3",
            "\1\5",
            "",
            "\1\1\1\4\14\uffff\1\3"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1156:3: ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )?";
        }
    }
    static final String DFA33_eotS =
        "\7\uffff";
    static final String DFA33_eofS =
        "\7\uffff";
    static final String DFA33_minS =
        "\3\4\1\uffff\1\5\1\uffff\1\4";
    static final String DFA33_maxS =
        "\3\60\1\uffff\1\5\1\uffff\1\60";
    static final String DFA33_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA33_specialS =
        "\7\uffff}>";
    static final String[] DFA33_transitionS = {
            "\1\2\1\1\25\uffff\1\3\17\uffff\1\3\2\uffff\3\3",
            "\2\5\25\uffff\1\5\2\3\14\uffff\1\4\1\5\2\uffff\3\5",
            "\2\5\25\uffff\1\5\1\3\16\uffff\1\5\2\uffff\3\5",
            "",
            "\1\6",
            "",
            "\2\5\25\uffff\1\5\2\3\14\uffff\1\4\1\5\2\uffff\3\5"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1285:2: ( (lv_label_2_0= ruleCompositeID ) )?";
        }
    }
    static final String DFA36_eotS =
        "\6\uffff";
    static final String DFA36_eofS =
        "\6\uffff";
    static final String DFA36_minS =
        "\1\4\1\uffff\1\34\1\5\1\uffff\1\34";
    static final String DFA36_maxS =
        "\1\60\1\uffff\1\52\1\5\1\uffff\1\52";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA36_specialS =
        "\6\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\1\1\2\45\uffff\1\1\2\uffff\3\1",
            "",
            "\1\1\1\4\14\uffff\1\3",
            "\1\5",
            "",
            "\1\1\1\4\14\uffff\1\3"
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1318:3: ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )?";
        }
    }
    static final String DFA39_eotS =
        "\6\uffff";
    static final String DFA39_eofS =
        "\6\uffff";
    static final String DFA39_minS =
        "\1\4\1\uffff\1\34\1\5\1\uffff\1\34";
    static final String DFA39_maxS =
        "\1\60\1\uffff\1\52\1\5\1\uffff\1\52";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA39_specialS =
        "\6\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\1\2\45\uffff\1\1\2\uffff\3\1",
            "",
            "\1\1\1\4\14\uffff\1\3",
            "\1\5",
            "",
            "\1\1\1\4\14\uffff\1\3"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "1414:3: ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )?";
        }
    }
    static final String DFA41_eotS =
        "\7\uffff";
    static final String DFA41_eofS =
        "\7\uffff";
    static final String DFA41_minS =
        "\3\4\1\uffff\1\5\1\uffff\1\4";
    static final String DFA41_maxS =
        "\3\60\1\uffff\1\5\1\uffff\1\60";
    static final String DFA41_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA41_specialS =
        "\7\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\2\1\1\25\uffff\1\3\17\uffff\1\3\2\uffff\3\3",
            "\2\5\25\uffff\1\5\2\3\14\uffff\1\4\1\5\2\uffff\3\5",
            "\2\5\25\uffff\1\5\1\3\16\uffff\1\5\2\uffff\3\5",
            "",
            "\1\6",
            "",
            "\2\5\25\uffff\1\5\2\3\14\uffff\1\4\1\5\2\uffff\3\5"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1543:2: ( (lv_label_2_0= ruleCompositeID ) )?";
        }
    }
    static final String DFA44_eotS =
        "\6\uffff";
    static final String DFA44_eofS =
        "\6\uffff";
    static final String DFA44_minS =
        "\1\4\1\uffff\1\34\1\5\1\uffff\1\34";
    static final String DFA44_maxS =
        "\1\60\1\uffff\1\52\1\5\1\uffff\1\52";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA44_specialS =
        "\6\uffff}>";
    static final String[] DFA44_transitionS = {
            "\1\1\1\2\45\uffff\1\1\2\uffff\3\1",
            "",
            "\1\1\1\4\14\uffff\1\3",
            "\1\5",
            "",
            "\1\1\1\4\14\uffff\1\3"
    };

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "1576:3: ( ( (lv_headVisibility_4_0= ruleVisibility ) )? ( (lv_headLabel_5_0= ruleCompositeID ) ) otherlv_6= ':' )?";
        }
    }
    static final String DFA47_eotS =
        "\6\uffff";
    static final String DFA47_eofS =
        "\6\uffff";
    static final String DFA47_minS =
        "\1\4\1\uffff\1\34\1\5\1\uffff\1\34";
    static final String DFA47_maxS =
        "\1\60\1\uffff\1\52\1\5\1\uffff\1\52";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\uffff";
    static final String DFA47_specialS =
        "\6\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1\1\2\45\uffff\1\1\2\uffff\3\1",
            "",
            "\1\1\1\4\14\uffff\1\3",
            "\1\5",
            "",
            "\1\1\1\4\14\uffff\1\3"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "1672:3: ( ( (lv_tailVisibility_12_0= ruleVisibility ) )? ( (lv_tailLabel_13_0= ruleCompositeID ) ) otherlv_14= ':' )?";
        }
    }
    static final String DFA49_eotS =
        "\11\uffff";
    static final String DFA49_eofS =
        "\11\uffff";
    static final String DFA49_minS =
        "\1\4\1\5\1\uffff\4\5\1\uffff\1\5";
    static final String DFA49_maxS =
        "\1\5\1\52\1\uffff\1\5\2\52\1\5\1\uffff\1\52";
    static final String DFA49_acceptS =
        "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String DFA49_specialS =
        "\11\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\2\1\1",
            "\1\4\44\uffff\1\3",
            "",
            "\1\5",
            "\1\2\15\uffff\1\7\26\uffff\1\6",
            "\1\4\44\uffff\1\3",
            "\1\10",
            "",
            "\1\2\15\uffff\1\7\26\uffff\1\6"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "1801:2: ( (lv_label_2_0= ruleCompositeID ) )?";
        }
    }
    static final String DFA51_eotS =
        "\11\uffff";
    static final String DFA51_eofS =
        "\11\uffff";
    static final String DFA51_minS =
        "\1\4\1\5\1\uffff\4\5\1\uffff\1\5";
    static final String DFA51_maxS =
        "\1\5\1\52\1\uffff\1\5\2\52\1\5\1\uffff\1\52";
    static final String DFA51_acceptS =
        "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String DFA51_specialS =
        "\11\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\2\1\1",
            "\1\4\44\uffff\1\3",
            "",
            "\1\5",
            "\1\2\15\uffff\1\7\26\uffff\1\6",
            "\1\4\44\uffff\1\3",
            "\1\10",
            "",
            "\1\2\15\uffff\1\7\26\uffff\1\6"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "1897:2: ( (lv_label_2_0= ruleCompositeID ) )?";
        }
    }
    static final String DFA53_eotS =
        "\11\uffff";
    static final String DFA53_eofS =
        "\11\uffff";
    static final String DFA53_minS =
        "\1\4\1\5\1\uffff\4\5\1\uffff\1\5";
    static final String DFA53_maxS =
        "\1\5\1\52\1\uffff\1\5\2\52\1\5\1\uffff\1\52";
    static final String DFA53_acceptS =
        "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String DFA53_specialS =
        "\11\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\2\1\1",
            "\1\4\44\uffff\1\3",
            "",
            "\1\5",
            "\1\2\15\uffff\1\7\26\uffff\1\6",
            "\1\4\44\uffff\1\3",
            "\1\10",
            "",
            "\1\2\15\uffff\1\7\26\uffff\1\6"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "1993:2: ( (lv_label_2_0= ruleCompositeID ) )?";
        }
    }
    static final String DFA72_eotS =
        "\6\uffff";
    static final String DFA72_eofS =
        "\1\uffff\1\2\3\uffff\1\2";
    static final String DFA72_minS =
        "\1\4\1\26\1\uffff\1\5\1\uffff\1\26";
    static final String DFA72_maxS =
        "\1\53\1\52\1\uffff\1\5\1\uffff\1\52";
    static final String DFA72_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA72_specialS =
        "\6\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\2\1\1\1\uffff\1\2\1\uffff\2\2\40\uffff\1\2",
            "\1\2\2\uffff\1\4\16\uffff\1\2\1\uffff\1\3",
            "",
            "\1\5",
            "",
            "\1\2\2\uffff\1\4\16\uffff\1\2\1\uffff\1\3"
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "3005:1: (this_AssignProperty_0= ruleAssignProperty | this_ValueProperty_1= ruleValueProperty )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleModel131 = new BitSet(new long[]{0x0000020F85170002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleModel153 = new BitSet(new long[]{0x0000020F85160002L});
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
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDatatype643 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_17_in_ruleDatatype664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rulePackage779 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_18_in_rulePackage800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage818 = new BitSet(new long[]{0x0000020F851E0000L});
    public static final BitSet FOLLOW_ruleElement_in_rulePackage844 = new BitSet(new long[]{0x0000020F851E0000L});
    public static final BitSet FOLLOW_19_in_rulePackage857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleClassifier949 = new BitSet(new long[]{0x0000020000100000L});
    public static final BitSet FOLLOW_20_in_ruleClassifier970 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClassifier988 = new BitSet(new long[]{0x0001C84000A80060L});
    public static final BitSet FOLLOW_21_in_ruleClassifier1014 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleClassifier1036 = new BitSet(new long[]{0x0001C84000C80060L});
    public static final BitSet FOLLOW_22_in_ruleClassifier1049 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleClassifier1070 = new BitSet(new long[]{0x0001C84000C80060L});
    public static final BitSet FOLLOW_23_in_ruleClassifier1095 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleClassifier1117 = new BitSet(new long[]{0x0001C84000080060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleClassifier1136 = new BitSet(new long[]{0x0001C84000080020L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleClassifier1163 = new BitSet(new long[]{0x0001C84000080020L});
    public static final BitSet FOLLOW_19_in_ruleClassifier1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleType1268 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleType1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1328 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleFeature1386 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFeature1413 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleFeature1440 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleFeature1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleEnumeration1555 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_24_in_ruleEnumeration1576 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1594 = new BitSet(new long[]{0x0000000000880060L});
    public static final BitSet FOLLOW_23_in_ruleEnumeration1620 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleEnumeration1642 = new BitSet(new long[]{0x0000000000080060L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleEnumeration1661 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleEnumerator_in_ruleEnumeration1688 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_19_in_ruleEnumeration1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerator_in_entryRuleEnumerator1737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerator1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerator1789 = new BitSet(new long[]{0x0000000002000042L});
    public static final BitSet FOLLOW_25_in_ruleEnumerator1815 = new BitSet(new long[]{0x00000800000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleEnumerator1837 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_CONSTRAINT_in_ruleEnumerator1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_ruleRelationship1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregation_in_ruleRelationship1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComposition_in_ruleRelationship2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_ruleRelationship2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleRelationship2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealization_in_ruleRelationship2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation2125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAssociation2181 = new BitSet(new long[]{0x0000020004000000L});
    public static final BitSet FOLLOW_26_in_ruleAssociation2202 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleAssociation2224 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_27_in_ruleAssociation2243 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAssociation2279 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleAssociation2301 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAssociation2313 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAssociation2338 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAssociation2350 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation2371 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAssociation2383 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_27_in_ruleAssociation2401 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAssociation2437 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleAssociation2459 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAssociation2471 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAssociation2496 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAssociation2508 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAssociation2529 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAssociation2541 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAssociation2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregation_in_entryRuleAggregation2589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregation2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAggregation2645 = new BitSet(new long[]{0x0000020080000000L});
    public static final BitSet FOLLOW_31_in_ruleAggregation2666 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleAggregation2688 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_27_in_ruleAggregation2707 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAggregation2743 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleAggregation2765 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAggregation2777 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAggregation2802 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAggregation2814 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAggregation2835 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAggregation2847 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_27_in_ruleAggregation2865 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAggregation2901 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleAggregation2923 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAggregation2935 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAggregation2960 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAggregation2972 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleAggregation2993 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAggregation3005 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAggregation3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComposition_in_entryRuleComposition3053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComposition3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleComposition3109 = new BitSet(new long[]{0x0000020100000000L});
    public static final BitSet FOLLOW_32_in_ruleComposition3130 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleComposition3152 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_27_in_ruleComposition3171 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleComposition3207 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleComposition3229 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleComposition3241 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleComposition3266 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleComposition3278 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleComposition3299 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleComposition3311 = new BitSet(new long[]{0x0001C80008000030L});
    public static final BitSet FOLLOW_27_in_ruleComposition3329 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleComposition3365 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleComposition3387 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleComposition3399 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleComposition3424 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleComposition3436 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleComposition3457 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleComposition3469 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComposition3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneralization_in_entryRuleGeneralization3517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneralization3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleGeneralization3573 = new BitSet(new long[]{0x0000020200000000L});
    public static final BitSet FOLLOW_33_in_ruleGeneralization3594 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleGeneralization3616 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleGeneralization3640 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleGeneralization3663 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGeneralization3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency3711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleDependency3767 = new BitSet(new long[]{0x0000020400000000L});
    public static final BitSet FOLLOW_34_in_ruleDependency3788 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleDependency3810 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleDependency3834 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleDependency3857 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDependency3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealization_in_entryRuleRealization3905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealization3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleRealization3961 = new BitSet(new long[]{0x0000020800000000L});
    public static final BitSet FOLLOW_35_in_ruleRealization3982 = new BitSet(new long[]{0x0001C80000000030L});
    public static final BitSet FOLLOW_ruleCompositeID_in_ruleRealization4004 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleRealization4028 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleRealization4051 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRealization4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_entryRuleMultiplicity4099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicity4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity4155 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleMultiplicity4176 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_ruleMultiplicity4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicityValue_in_entryRuleMultiplicityValue4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicityValue4248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleMultiplicityValue4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleMultiplicityValue4312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant4352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleConstant4408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstant4426 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleConstant4443 = new BitSet(new long[]{0x00000800000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleConstant4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation4500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleOperation4601 = new BitSet(new long[]{0x0001C84000000020L});
    public static final BitSet FOLLOW_38_in_ruleOperation4673 = new BitSet(new long[]{0x0001C84000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation4743 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleOperation4760 = new BitSet(new long[]{0x0000010000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation4792 = new BitSet(new long[]{0x0000010000400000L});
    public static final BitSet FOLLOW_22_in_ruleOperation4805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation4826 = new BitSet(new long[]{0x0000010000400000L});
    public static final BitSet FOLLOW_40_in_ruleOperation4842 = new BitSet(new long[]{0x0000000010000102L});
    public static final BitSet FOLLOW_28_in_ruleOperation4855 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOperation4876 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_BODY_in_ruleOperation4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter4989 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleParameter5006 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter5027 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleParameter5048 = new BitSet(new long[]{0x00000800000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleParameter5070 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleParameter5083 = new BitSet(new long[]{0x00000800000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleParameter5104 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute5144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAttribute5245 = new BitSet(new long[]{0x0001C84000000020L});
    public static final BitSet FOLLOW_38_in_ruleAttribute5317 = new BitSet(new long[]{0x0001C84000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute5387 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttribute5404 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttribute5425 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAttribute5446 = new BitSet(new long[]{0x00000800000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleAttribute5468 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAttribute5481 = new BitSet(new long[]{0x00000800000006B0L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_ruleAttribute5502 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference5542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference5552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleReference5600 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleReference5621 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray5658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray5668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleArray5714 = new BitSet(new long[]{0x0000002040000080L});
    public static final BitSet FOLLOW_ruleMultiplicity_in_ruleArray5735 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleArray5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitValue_in_entryRuleImplicitValue5785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitValue5796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleImplicitValue5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleImplicitValue5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImplicitValue5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleImplicitValue5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleImplicitValue5954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImplicitValue5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAnnotation6072 = new BitSet(new long[]{0x0001C80000000020L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAnnotation6093 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleAnnotation6106 = new BitSet(new long[]{0x0001C800000006B0L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAnnotation6127 = new BitSet(new long[]{0x0000010000400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation6140 = new BitSet(new long[]{0x0001C800000006B0L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAnnotation6161 = new BitSet(new long[]{0x0000010000400000L});
    public static final BitSet FOLLOW_40_in_ruleAnnotation6175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty6213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignProperty_in_ruleProperty6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_ruleProperty6297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignProperty_in_entryRuleAssignProperty6332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignProperty6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleAssignProperty6388 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignProperty6400 = new BitSet(new long[]{0x0001C800000006B0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAssignProperty6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueProperty_in_entryRuleValueProperty6457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueProperty6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleValueProperty6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue6548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleValue6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleValue6665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleValue6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleValue6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_ruleValue6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID6796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6847 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleExtendedID6866 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExtendedID6881 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleCompositeID_in_entryRuleCompositeID6931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeID6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_ruleCompositeID6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompositeID7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal7061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleReal7111 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal7128 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleReal7146 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal7161 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_ruleReal7181 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_45_in_ruleReal7200 = new BitSet(new long[]{0x0000480000000000L});
    public static final BitSet FOLLOW_46_in_ruleReal7215 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_43_in_ruleReal7234 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleReal7250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger7298 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleInteger7348 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_ruleInteger7365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVisibility7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVisibility7441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVisibility7458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVisibility7475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalClassmodel656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred2_InternalClassmodel792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred3_InternalClassmodel962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred4_InternalClassmodel1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred5_InternalClassmodel1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred6_InternalClassmodel1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred7_InternalClassmodel1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred8_InternalClassmodel1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred9_InternalClassmodel2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_synpred10_InternalClassmodel2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_synpred11_InternalClassmodel3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred12_InternalClassmodel3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_synpred13_InternalClassmodel3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred14_InternalClassmodel3974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred15_InternalClassmodel4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred16_InternalClassmodel4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred17_InternalClassmodel5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred18_InternalClassmodel5438 = new BitSet(new long[]{0x0000000000000002L});

}

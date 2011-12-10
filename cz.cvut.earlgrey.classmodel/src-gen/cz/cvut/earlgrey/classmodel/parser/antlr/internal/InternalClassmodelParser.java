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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "'<'", "','", "'>'", "'['", "']'", "'('", "')'", "':'", "'.'", "'associates'", "'depends'", "'extends'", "'implements'", "'aggregates'", "'composedOf'", "'+'", "'-'", "'#'", "'~'", "'class'", "'interface'", "'abstract'", "'enum'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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
        	return "Classmodel";	
       	}
       	
       	@Override
       	protected ClassmodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleClassmodel"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:68:1: entryRuleClassmodel returns [EObject current=null] : iv_ruleClassmodel= ruleClassmodel EOF ;
    public final EObject entryRuleClassmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassmodel = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:69:2: (iv_ruleClassmodel= ruleClassmodel EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:70:2: iv_ruleClassmodel= ruleClassmodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassmodelRule()); 
            }
            pushFollow(FOLLOW_ruleClassmodel_in_entryRuleClassmodel75);
            iv_ruleClassmodel=ruleClassmodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassmodel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassmodel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClassmodel"


    // $ANTLR start "ruleClassmodel"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:77:1: ruleClassmodel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )* ) ;
    public final EObject ruleClassmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_elements_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_elements_1_0= ruleAbstractElement ) )*
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
            	       
            	      	        newCompositeNode(grammarAccess.getClassmodelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleClassmodel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassmodelRule());
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:99:3: ( (lv_elements_1_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==11||(LA2_0>=34 && LA2_0<=37)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:100:1: (lv_elements_1_0= ruleAbstractElement )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:100:1: (lv_elements_1_0= ruleAbstractElement )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:101:3: lv_elements_1_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassmodelAccess().getElementsAbstractElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleClassmodel153);
            	    lv_elements_1_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassmodelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"AbstractElement");
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
    // $ANTLR end "ruleClassmodel"


    // $ANTLR start "entryRuleAbstractElement"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:125:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:126:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:127:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement190);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement200); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:134:1: ruleAbstractElement returns [EObject current=null] : (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Relation_2= ruleRelation ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Package_0 = null;

        EObject this_Entity_1 = null;

        EObject this_Relation_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:137:28: ( (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Relation_2= ruleRelation ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:138:1: (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Relation_2= ruleRelation )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:138:1: (this_Package_0= rulePackage | this_Entity_1= ruleEntity | this_Relation_2= ruleRelation )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:139:5: this_Package_0= rulePackage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getPackageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePackage_in_ruleAbstractElement247);
                    this_Package_0=rulePackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Package_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:149:5: this_Entity_1= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getEntityParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEntity_in_ruleAbstractElement274);
                    this_Entity_1=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Entity_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:159:5: this_Relation_2= ruleRelation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getRelationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelation_in_ruleAbstractElement301);
                    this_Relation_2=ruleRelation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Relation_2; 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRulePackage"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:175:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:176:2: (iv_rulePackage= rulePackage EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:177:2: iv_rulePackage= rulePackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPackageRule()); 
            }
            pushFollow(FOLLOW_rulePackage_in_entryRulePackage336);
            iv_rulePackage=rulePackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePackage346); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:184:1: rulePackage returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:187:28: ( (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:188:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:188:1: (otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:188:3: otherlv_0= 'package' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePackage383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPackageAccess().getPackageKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:192:1: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:193:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:193:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:194:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePackage400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPackageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePackage417); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:214:1: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==11||(LA4_0>=34 && LA4_0<=37)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:215:1: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:215:1: (lv_elements_3_0= ruleAbstractElement )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:216:3: lv_elements_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPackageAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_rulePackage438);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPackageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"AbstractElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePackage451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
                  
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


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:244:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:245:2: (iv_ruleImport= ruleImport EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:246:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport487);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport497); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:253:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:256:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:257:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:257:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:257:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleImport534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:261:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:262:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:262:1: (lv_importURI_1_0= RULE_STRING )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:263:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport551); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEntity"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:287:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:288:2: (iv_ruleEntity= ruleEntity EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:289:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity592);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity602); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:296:1: ruleEntity returns [EObject current=null] : ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_attribute_3_0 = null;

        EObject lv_method_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:299:28: ( ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:1: ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:1: ( ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:2: ( (lv_type_0_0= ruleEntityType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attribute_3_0= ruleAttribute ) )* ( (lv_method_4_0= ruleMethod ) )* otherlv_5= '}'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:2: ( (lv_type_0_0= ruleEntityType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:301:1: (lv_type_0_0= ruleEntityType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:301:1: (lv_type_0_0= ruleEntityType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:302:3: lv_type_0_0= ruleEntityType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntityAccess().getTypeEntityTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEntityType_in_ruleEntity648);
            lv_type_0_0=ruleEntityType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEntityRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"EntityType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:318:2: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:319:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:319:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:320:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEntity682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:340:1: ( (lv_attribute_3_0= ruleAttribute ) )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case 30:
                    {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_ID) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==22) ) {
                            alt5=1;
                        }


                    }


                    }
                    break;
                case 31:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_ID) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==22) ) {
                            alt5=1;
                        }


                    }


                    }
                    break;
                case 32:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (LA5_3==RULE_ID) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==22) ) {
                            alt5=1;
                        }


                    }


                    }
                    break;
                case 33:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (LA5_4==RULE_ID) ) {
                        int LA5_5 = input.LA(3);

                        if ( (LA5_5==22) ) {
                            alt5=1;
                        }


                    }


                    }
                    break;
                case RULE_ID:
                    {
                    int LA5_5 = input.LA(2);

                    if ( (LA5_5==22) ) {
                        alt5=1;
                    }


                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:341:1: (lv_attribute_3_0= ruleAttribute )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:341:1: (lv_attribute_3_0= ruleAttribute )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:342:3: lv_attribute_3_0= ruleAttribute
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getAttributeAttributeParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleEntity703);
            	    lv_attribute_3_0=ruleAttribute();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"attribute",
            	              		lv_attribute_3_0, 
            	              		"Attribute");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:358:3: ( (lv_method_4_0= ruleMethod ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=30 && LA6_0<=33)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:359:1: (lv_method_4_0= ruleMethod )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:359:1: (lv_method_4_0= ruleMethod )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:360:3: lv_method_4_0= ruleMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getMethodMethodParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMethod_in_ruleEntity725);
            	    lv_method_4_0=ruleMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"method",
            	              		lv_method_4_0, 
            	              		"Method");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleEntity738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleReference"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:388:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:389:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:390:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference774);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference784); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:397:1: ruleReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_generic_2_0= ruleReference ) ) (otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) ) )* otherlv_5= '>' )? ( ( ( ( ( '[' ) ) ']' ) )=> ( ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']' ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_dimension_6_0=null;
        Token otherlv_7=null;
        EObject lv_generic_2_0 = null;

        EObject lv_generic_4_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:400:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_generic_2_0= ruleReference ) ) (otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) ) )* otherlv_5= '>' )? ( ( ( ( ( '[' ) ) ']' ) )=> ( ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']' ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:401:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_generic_2_0= ruleReference ) ) (otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) ) )* otherlv_5= '>' )? ( ( ( ( ( '[' ) ) ']' ) )=> ( ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']' ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:401:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_generic_2_0= ruleReference ) ) (otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) ) )* otherlv_5= '>' )? ( ( ( ( ( '[' ) ) ']' ) )=> ( ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']' ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:401:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_generic_2_0= ruleReference ) ) (otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) ) )* otherlv_5= '>' )? ( ( ( ( ( '[' ) ) ']' ) )=> ( ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']' ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:401:2: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:402:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:402:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:403:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReference832);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:416:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_generic_2_0= ruleReference ) ) (otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) ) )* otherlv_5= '>' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) && (synpred1_InternalClassmodel())) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:416:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_generic_2_0= ruleReference ) ) (otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) ) )* otherlv_5= '>'
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:416:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:416:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleReference853); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:421:2: ( (lv_generic_2_0= ruleReference ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:422:1: (lv_generic_2_0= ruleReference )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:422:1: (lv_generic_2_0= ruleReference )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:423:3: lv_generic_2_0= ruleReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReferenceAccess().getGenericReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleReference_in_ruleReference875);
                    lv_generic_2_0=ruleReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"generic",
                              		lv_generic_2_0, 
                              		"Reference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:439:2: (otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:439:4: otherlv_3= ',' ( (lv_generic_4_0= ruleReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleReference888); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:443:1: ( (lv_generic_4_0= ruleReference ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:444:1: (lv_generic_4_0= ruleReference )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:444:1: (lv_generic_4_0= ruleReference )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:445:3: lv_generic_4_0= ruleReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReferenceAccess().getGenericReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReference_in_ruleReference909);
                    	    lv_generic_4_0=ruleReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"generic",
                    	              		lv_generic_4_0, 
                    	              		"Reference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleReference923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:465:3: ( ( ( ( ( '[' ) ) ']' ) )=> ( ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) && (synpred2_InternalClassmodel())) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:465:4: ( ( ( ( '[' ) ) ']' ) )=> ( ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:472:5: ( ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:472:6: ( (lv_dimension_6_0= '[' ) ) otherlv_7= ']'
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:472:6: ( (lv_dimension_6_0= '[' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:473:1: (lv_dimension_6_0= '[' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:473:1: (lv_dimension_6_0= '[' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:474:3: lv_dimension_6_0= '['
            	    {
            	    lv_dimension_6_0=(Token)match(input,18,FOLLOW_18_in_ruleReference968); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_dimension_6_0, grammarAccess.getReferenceAccess().getDimensionLeftSquareBracketKeyword_2_0_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getReferenceRule());
            	      	        }
            	             		addWithLastConsumed(current, "dimension", lv_dimension_6_0, "[");
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleReference993); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_2_0_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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


    // $ANTLR start "entryRuleMethod"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:499:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:500:2: (iv_ruleMethod= ruleMethod EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:501:2: iv_ruleMethod= ruleMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodRule()); 
            }
            pushFollow(FOLLOW_ruleMethod_in_entryRuleMethod1032);
            iv_ruleMethod=ruleMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMethod1042); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:508:1: ruleMethod returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_return_8_0= ruleReference ) ) ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_return_8_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:511:28: ( ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_return_8_0= ruleReference ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:512:1: ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_return_8_0= ruleReference ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:512:1: ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_return_8_0= ruleReference ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:512:2: ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_return_8_0= ruleReference ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:512:2: ( (lv_modifier_0_0= ruleVisibility ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=30 && LA10_0<=33)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:1: (lv_modifier_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:513:1: (lv_modifier_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:514:3: lv_modifier_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getModifierVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleMethod1088);
                    lv_modifier_0_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		set(
                             			current, 
                             			"modifier",
                              		lv_modifier_0_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:530:3: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:531:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:531:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:532:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMethod1106); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleMethod1123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getMethodAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:552:1: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:552:2: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:552:2: ( (lv_parameters_3_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:553:1: (lv_parameters_3_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:553:1: (lv_parameters_3_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:554:3: lv_parameters_3_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1145);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                      	        }
                             		add(
                             			current, 
                             			"parameters",
                              		lv_parameters_3_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:570:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:570:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleMethod1158); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getMethodAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:574:1: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:575:1: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:575:1: (lv_parameters_5_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:576:3: lv_parameters_5_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getMethodAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleMethod1179);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getMethodRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_5_0, 
                    	              		"Parameter");
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
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleMethod1195); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMethodAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleMethod1207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMethodAccess().getColonKeyword_5());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:600:1: ( (lv_return_8_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:601:1: (lv_return_8_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:601:1: (lv_return_8_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:602:3: lv_return_8_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodAccess().getReturnReferenceParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleMethod1228);
            lv_return_8_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodRule());
              	        }
                     		set(
                     			current, 
                     			"return",
                      		lv_return_8_0, 
                      		"Reference");
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:626:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:627:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:628:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1264);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1274); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:635:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:638:28: ( ( ( (lv_type_0_0= ruleReference ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:639:1: ( ( (lv_type_0_0= ruleReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:639:1: ( ( (lv_type_0_0= ruleReference ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:639:2: ( (lv_type_0_0= ruleReference ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:639:2: ( (lv_type_0_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:640:1: (lv_type_0_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:640:1: (lv_type_0_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:641:3: lv_type_0_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleParameter1320);
            lv_type_0_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"Reference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:657:2: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:658:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:658:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:659:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter1337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAttribute"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:683:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:684:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:685:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1378);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1388); if (state.failed) return current;

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:692:1: ruleAttribute returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleReference ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_modifier_0_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:695:28: ( ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleReference ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:696:1: ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleReference ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:696:1: ( ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleReference ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:696:2: ( (lv_modifier_0_0= ruleVisibility ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleReference ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:696:2: ( (lv_modifier_0_0= ruleVisibility ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=30 && LA13_0<=33)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:697:1: (lv_modifier_0_0= ruleVisibility )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:697:1: (lv_modifier_0_0= ruleVisibility )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:698:3: lv_modifier_0_0= ruleVisibility
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getModifierVisibilityEnumRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVisibility_in_ruleAttribute1434);
                    lv_modifier_0_0=ruleVisibility();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                      	        }
                             		set(
                             			current, 
                             			"modifier",
                              		lv_modifier_0_0, 
                              		"Visibility");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:714:3: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:715:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:715:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:716:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAttribute1469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:736:1: ( (lv_type_3_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:737:1: (lv_type_3_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:737:1: (lv_type_3_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:738:3: lv_type_3_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleAttribute1490);
            lv_type_3_0=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"Reference");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:762:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:763:2: (iv_ruleRelation= ruleRelation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:764:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation1526);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation1536); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:771:1: ruleRelation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token lv_cardinalityFrom_1_0=null;
        Token lv_cardinalityTo_3_0=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:774:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:775:1: ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:775:1: ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:775:2: ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= RULE_STRING ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= RULE_STRING ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:775:2: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:776:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:776:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:777:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationAccess().getOriginEntityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelation1584);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:790:2: ( (lv_cardinalityFrom_1_0= RULE_STRING ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:791:1: (lv_cardinalityFrom_1_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:791:1: (lv_cardinalityFrom_1_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:792:3: lv_cardinalityFrom_1_0= RULE_STRING
                    {
                    lv_cardinalityFrom_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelation1601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_cardinalityFrom_1_0, grammarAccess.getRelationAccess().getCardinalityFromSTRINGTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"cardinalityFrom",
                              		lv_cardinalityFrom_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:808:3: ( (lv_type_2_0= ruleRelationType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:809:1: (lv_type_2_0= ruleRelationType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:809:1: (lv_type_2_0= ruleRelationType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:810:3: lv_type_2_0= ruleRelationType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRelationType_in_ruleRelation1628);
            lv_type_2_0=ruleRelationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"RelationType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:826:2: ( (lv_cardinalityTo_3_0= RULE_STRING ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:827:1: (lv_cardinalityTo_3_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:827:1: (lv_cardinalityTo_3_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:828:3: lv_cardinalityTo_3_0= RULE_STRING
                    {
                    lv_cardinalityTo_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelation1645); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_cardinalityTo_3_0, grammarAccess.getRelationAccess().getCardinalityToSTRINGTerminalRuleCall_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"cardinalityTo",
                              		lv_cardinalityTo_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:844:3: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:845:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:845:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:846:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationAccess().getDestinationEntityCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelation1674);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:859:2: (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:859:4: otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleRelation1687); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getColonKeyword_5_0());
                          
                    }
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:863:1: ( (lv_label_6_0= RULE_STRING ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:864:1: (lv_label_6_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:864:1: (lv_label_6_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:865:3: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelation1704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_label_6_0, grammarAccess.getRelationAccess().getLabelSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"label",
                              		lv_label_6_0, 
                              		"STRING");
                      	    
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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:889:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:890:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:891:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1748);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:898:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:901:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:902:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:902:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:902:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1799); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:909:1: (kw= '.' this_ID_2= RULE_ID )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:910:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleQualifiedName1818); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1833); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleRelationType"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:930:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composedOf' ) ) ;
    public final Enumerator ruleRelationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:932:28: ( ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composedOf' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:933:1: ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composedOf' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:933:1: ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composedOf' ) )
            int alt18=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt18=1;
                }
                break;
            case 25:
                {
                alt18=2;
                }
                break;
            case 26:
                {
                alt18=3;
                }
                break;
            case 27:
                {
                alt18=4;
                }
                break;
            case 28:
                {
                alt18=5;
                }
                break;
            case 29:
                {
                alt18=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:933:2: (enumLiteral_0= 'associates' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:933:2: (enumLiteral_0= 'associates' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:933:4: enumLiteral_0= 'associates'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleRelationType1894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:939:6: (enumLiteral_1= 'depends' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:939:6: (enumLiteral_1= 'depends' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:939:8: enumLiteral_1= 'depends'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleRelationType1911); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:945:6: (enumLiteral_2= 'extends' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:945:6: (enumLiteral_2= 'extends' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:945:8: enumLiteral_2= 'extends'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_ruleRelationType1928); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:951:6: (enumLiteral_3= 'implements' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:951:6: (enumLiteral_3= 'implements' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:951:8: enumLiteral_3= 'implements'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_27_in_ruleRelationType1945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:957:6: (enumLiteral_4= 'aggregates' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:957:6: (enumLiteral_4= 'aggregates' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:957:8: enumLiteral_4= 'aggregates'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_28_in_ruleRelationType1962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:963:6: (enumLiteral_5= 'composedOf' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:963:6: (enumLiteral_5= 'composedOf' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:963:8: enumLiteral_5= 'composedOf'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_29_in_ruleRelationType1979); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getRelationTypeAccess().getCOMPOSITIONEnumLiteralDeclaration_5()); 
                          
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
    // $ANTLR end "ruleRelationType"


    // $ANTLR start "ruleVisibility"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:973:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:975:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:976:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:976:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt19=1;
                }
                break;
            case 31:
                {
                alt19=2;
                }
                break;
            case 32:
                {
                alt19=3;
                }
                break;
            case 33:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:976:2: (enumLiteral_0= '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:976:2: (enumLiteral_0= '+' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:976:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_30_in_ruleVisibility2024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:982:6: (enumLiteral_1= '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:982:6: (enumLiteral_1= '-' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:982:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_31_in_ruleVisibility2041); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:988:6: (enumLiteral_2= '#' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:988:6: (enumLiteral_2= '#' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:988:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_32_in_ruleVisibility2058); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:994:6: (enumLiteral_3= '~' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:994:6: (enumLiteral_3= '~' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:994:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_33_in_ruleVisibility2075); if (state.failed) return current;
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


    // $ANTLR start "ruleEntityType"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1004:1: ruleEntityType returns [Enumerator current=null] : ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'abstract' ) | (enumLiteral_3= 'enum' ) ) ;
    public final Enumerator ruleEntityType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1006:28: ( ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'abstract' ) | (enumLiteral_3= 'enum' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:1: ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'abstract' ) | (enumLiteral_3= 'enum' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:1: ( (enumLiteral_0= 'class' ) | (enumLiteral_1= 'interface' ) | (enumLiteral_2= 'abstract' ) | (enumLiteral_3= 'enum' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            case 37:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:2: (enumLiteral_0= 'class' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:2: (enumLiteral_0= 'class' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:4: enumLiteral_0= 'class'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_34_in_ruleEntityType2120); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEntityTypeAccess().getCLASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEntityTypeAccess().getCLASSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1013:6: (enumLiteral_1= 'interface' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1013:6: (enumLiteral_1= 'interface' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1013:8: enumLiteral_1= 'interface'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_35_in_ruleEntityType2137); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEntityTypeAccess().getINTERFACEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEntityTypeAccess().getINTERFACEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1019:6: (enumLiteral_2= 'abstract' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1019:6: (enumLiteral_2= 'abstract' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1019:8: enumLiteral_2= 'abstract'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_36_in_ruleEntityType2154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEntityTypeAccess().getABSTRACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getEntityTypeAccess().getABSTRACTEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1025:6: (enumLiteral_3= 'enum' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1025:6: (enumLiteral_3= 'enum' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1025:8: enumLiteral_3= 'enum'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_37_in_ruleEntityType2171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEntityTypeAccess().getENUMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getEntityTypeAccess().getENUMEnumLiteralDeclaration_3()); 
                          
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
    // $ANTLR end "ruleEntityType"

    // $ANTLR start synpred1_InternalClassmodel
    public final void synpred1_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:416:4: ( '<' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:416:6: '<'
        {
        match(input,15,FOLLOW_15_in_synpred1_InternalClassmodel845); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalClassmodel

    // $ANTLR start synpred2_InternalClassmodel
    public final void synpred2_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:465:4: ( ( ( ( '[' ) ) ']' ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:465:5: ( ( ( '[' ) ) ']' )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:465:5: ( ( ( '[' ) ) ']' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:465:6: ( ( '[' ) ) ']'
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:465:6: ( ( '[' ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:466:1: ( '[' )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:466:1: ( '[' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:467:2: '['
        {
        match(input,18,FOLLOW_18_in_synpred2_InternalClassmodel942); if (state.failed) return ;

        }


        }

        match(input,19,FOLLOW_19_in_synpred2_InternalClassmodel952); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalClassmodel

    // Delegated rules

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


 

    public static final BitSet FOLLOW_ruleClassmodel_in_entryRuleClassmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleClassmodel131 = new BitSet(new long[]{0x0000003C00004812L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleClassmodel153 = new BitSet(new long[]{0x0000003C00000812L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleAbstractElement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleAbstractElement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage400 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage417 = new BitSet(new long[]{0x0000003C00002810L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackage438 = new BitSet(new long[]{0x0000003C00002810L});
    public static final BitSet FOLLOW_13_in_rulePackage451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_ruleEntity648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity665 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEntity682 = new BitSet(new long[]{0x00000003C0002010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleEntity703 = new BitSet(new long[]{0x00000003C0002010L});
    public static final BitSet FOLLOW_ruleMethod_in_ruleEntity725 = new BitSet(new long[]{0x00000003C0002010L});
    public static final BitSet FOLLOW_13_in_ruleEntity738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReference832 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_15_in_ruleReference853 = new BitSet(new long[]{0x0000003C00000810L});
    public static final BitSet FOLLOW_ruleReference_in_ruleReference875 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleReference888 = new BitSet(new long[]{0x0000003C00000810L});
    public static final BitSet FOLLOW_ruleReference_in_ruleReference909 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleReference923 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleReference968 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleReference993 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleMethod_in_entryRuleMethod1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMethod1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleMethod1088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMethod1106 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMethod1123 = new BitSet(new long[]{0x0000003C00200810L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1145 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16_in_ruleMethod1158 = new BitSet(new long[]{0x0000003C00000810L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleMethod1179 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_21_in_ruleMethod1195 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMethod1207 = new BitSet(new long[]{0x0000003C00000810L});
    public static final BitSet FOLLOW_ruleReference_in_ruleMethod1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter1320 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAttribute1434 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1452 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAttribute1469 = new BitSet(new long[]{0x0000003C00000810L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttribute1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation1526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelation1584 = new BitSet(new long[]{0x000000003F000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelation1601 = new BitSet(new long[]{0x000000003F000020L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleRelation1628 = new BitSet(new long[]{0x0000003C00000830L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelation1645 = new BitSet(new long[]{0x0000003C00000810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelation1674 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleRelation1687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelation1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1799 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleQualifiedName1818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1833 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_24_in_ruleRelationType1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRelationType1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRelationType1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRelationType1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRelationType1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRelationType1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleVisibility2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleVisibility2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVisibility2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleVisibility2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleEntityType2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEntityType2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEntityType2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEntityType2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalClassmodel845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred2_InternalClassmodel942 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred2_InternalClassmodel952 = new BitSet(new long[]{0x0000000000000002L});

}
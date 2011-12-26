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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'import'", "'class'", "'interface'", "'abstract'", "'enum'", "'='", "'['", "']'", "'static'", "'('", "','", "')'", "':'", "'null'", "'..'", "'*'", "'.'", "'associates'", "'depends'", "'extends'", "'implements'", "'aggregates'", "'composedOf'", "'+'", "'-'", "'#'", "'~'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
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

                if ( (LA2_0==RULE_ID||LA2_0==11||(LA2_0>=15 && LA2_0<=18)) ) {
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
            case 15:
            case 16:
            case 17:
            case 18:
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

                if ( (LA4_0==RULE_ID||LA4_0==11||(LA4_0>=15 && LA4_0<=18)) ) {
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:296:1: ruleEntity returns [EObject current=null] : ( ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=>this_Class_0= ruleClass ) | this_Enum_1= ruleEnum ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Enum_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:299:28: ( ( ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=>this_Class_0= ruleClass ) | this_Enum_1= ruleEnum ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:1: ( ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=>this_Class_0= ruleClass ) | this_Enum_1= ruleEnum )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:1: ( ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=>this_Class_0= ruleClass ) | this_Enum_1= ruleEnum )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) && (synpred1_InternalClassmodel())) {
                alt5=1;
            }
            else if ( (LA5_0==16) && (synpred1_InternalClassmodel())) {
                alt5=1;
            }
            else if ( (LA5_0==17) && (synpred1_InternalClassmodel())) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:2: ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=>this_Class_0= ruleClass )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:2: ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=>this_Class_0= ruleClass )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:3: ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=>this_Class_0= ruleClass
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getClassParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClass_in_ruleEntity709);
                    this_Class_0=ruleClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Class_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:331:5: this_Enum_1= ruleEnum
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityAccess().getEnumParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnum_in_ruleEntity737);
                    this_Enum_1=ruleEnum();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enum_1; 
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


    // $ANTLR start "entryRuleClass"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:347:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:348:2: (iv_ruleClass= ruleClass EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:349:2: iv_ruleClass= ruleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassRule()); 
            }
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass772);
            iv_ruleClass=ruleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass782); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:356:1: ruleClass returns [EObject current=null] : ( ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=> ( ( (lv_class_0_0= 'class' ) ) | ( (lv_interface_1_0= 'interface' ) ) | ( (lv_abstract_2_0= 'abstract' ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_class_0_0=null;
        Token lv_interface_1_0=null;
        Token lv_abstract_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_feature_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:359:28: ( ( ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=> ( ( (lv_class_0_0= 'class' ) ) | ( (lv_interface_1_0= 'interface' ) ) | ( (lv_abstract_2_0= 'abstract' ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:360:1: ( ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=> ( ( (lv_class_0_0= 'class' ) ) | ( (lv_interface_1_0= 'interface' ) ) | ( (lv_abstract_2_0= 'abstract' ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:360:1: ( ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=> ( ( (lv_class_0_0= 'class' ) ) | ( (lv_interface_1_0= 'interface' ) ) | ( (lv_abstract_2_0= 'abstract' ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= '}' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:360:2: ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=> ( ( (lv_class_0_0= 'class' ) ) | ( (lv_interface_1_0= 'interface' ) ) | ( (lv_abstract_2_0= 'abstract' ) ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '{' ( (lv_feature_5_0= ruleFeature ) )* otherlv_6= '}'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:360:2: ( ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=> ( ( (lv_class_0_0= 'class' ) ) | ( (lv_interface_1_0= 'interface' ) ) | ( (lv_abstract_2_0= 'abstract' ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:360:3: ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )=> ( ( (lv_class_0_0= 'class' ) ) | ( (lv_interface_1_0= 'interface' ) ) | ( (lv_abstract_2_0= 'abstract' ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:380:6: ( ( (lv_class_0_0= 'class' ) ) | ( (lv_interface_1_0= 'interface' ) ) | ( (lv_abstract_2_0= 'abstract' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:380:7: ( (lv_class_0_0= 'class' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:380:7: ( (lv_class_0_0= 'class' ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:381:1: (lv_class_0_0= 'class' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:381:1: (lv_class_0_0= 'class' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:382:3: lv_class_0_0= 'class'
                    {
                    lv_class_0_0=(Token)match(input,15,FOLLOW_15_in_ruleClass886); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_class_0_0, grammarAccess.getClassAccess().getClassClassKeyword_0_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                             		setWithLastConsumed(current, "class", true, "class");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:396:6: ( (lv_interface_1_0= 'interface' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:396:6: ( (lv_interface_1_0= 'interface' ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:397:1: (lv_interface_1_0= 'interface' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:397:1: (lv_interface_1_0= 'interface' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:398:3: lv_interface_1_0= 'interface'
                    {
                    lv_interface_1_0=(Token)match(input,16,FOLLOW_16_in_ruleClass923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_interface_1_0, grammarAccess.getClassAccess().getInterfaceInterfaceKeyword_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                             		setWithLastConsumed(current, "interface", true, "interface");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:412:6: ( (lv_abstract_2_0= 'abstract' ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:412:6: ( (lv_abstract_2_0= 'abstract' ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:413:1: (lv_abstract_2_0= 'abstract' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:413:1: (lv_abstract_2_0= 'abstract' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:414:3: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)match(input,17,FOLLOW_17_in_ruleClass960); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_2_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_0_0_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassRule());
                      	        }
                             		setWithLastConsumed(current, "abstract", true, "abstract");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:427:4: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:428:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:428:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:429:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleClass992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleClass1009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:449:1: ( (lv_feature_5_0= ruleFeature ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==22||(LA7_0>=37 && LA7_0<=40)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:450:1: (lv_feature_5_0= ruleFeature )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:450:1: (lv_feature_5_0= ruleFeature )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:451:3: lv_feature_5_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getClassAccess().getFeatureFeatureParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFeature_in_ruleClass1030);
            	    lv_feature_5_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getClassRule());
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
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleClass1043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleEnum"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:479:1: entryRuleEnum returns [EObject current=null] : iv_ruleEnum= ruleEnum EOF ;
    public final EObject entryRuleEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnum = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:480:2: (iv_ruleEnum= ruleEnum EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:481:2: iv_ruleEnum= ruleEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRule()); 
            }
            pushFollow(FOLLOW_ruleEnum_in_entryRuleEnum1079);
            iv_ruleEnum=ruleEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnum; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnum1089); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnum"


    // $ANTLR start "ruleEnum"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:488:1: ruleEnum returns [EObject current=null] : ( ( (lv_enumeration_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_feature_3_0= ruleEnumConstant ) )* otherlv_4= '}' ) ;
    public final EObject ruleEnum() throws RecognitionException {
        EObject current = null;

        Token lv_enumeration_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_feature_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:491:28: ( ( ( (lv_enumeration_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_feature_3_0= ruleEnumConstant ) )* otherlv_4= '}' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:492:1: ( ( (lv_enumeration_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_feature_3_0= ruleEnumConstant ) )* otherlv_4= '}' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:492:1: ( ( (lv_enumeration_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_feature_3_0= ruleEnumConstant ) )* otherlv_4= '}' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:492:2: ( (lv_enumeration_0_0= 'enum' ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_feature_3_0= ruleEnumConstant ) )* otherlv_4= '}'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:492:2: ( (lv_enumeration_0_0= 'enum' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:493:1: (lv_enumeration_0_0= 'enum' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:493:1: (lv_enumeration_0_0= 'enum' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:494:3: lv_enumeration_0_0= 'enum'
            {
            lv_enumeration_0_0=(Token)match(input,18,FOLLOW_18_in_ruleEnum1132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_enumeration_0_0, grammarAccess.getEnumAccess().getEnumerationEnumKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumRule());
              	        }
                     		setWithLastConsumed(current, "enumeration", true, "enum");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:507:2: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:508:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:508:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:509:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnum1162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEnumAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEnum1179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:529:1: ( (lv_feature_3_0= ruleEnumConstant ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:530:1: (lv_feature_3_0= ruleEnumConstant )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:530:1: (lv_feature_3_0= ruleEnumConstant )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:531:3: lv_feature_3_0= ruleEnumConstant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumAccess().getFeatureEnumConstantParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumConstant_in_ruleEnum1200);
            	    lv_feature_3_0=ruleEnumConstant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"feature",
            	              		lv_feature_3_0, 
            	              		"EnumConstant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleEnum1213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleEnum"


    // $ANTLR start "entryRuleEnumConstant"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:559:1: entryRuleEnumConstant returns [EObject current=null] : iv_ruleEnumConstant= ruleEnumConstant EOF ;
    public final EObject entryRuleEnumConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumConstant = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:560:2: (iv_ruleEnumConstant= ruleEnumConstant EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:561:2: iv_ruleEnumConstant= ruleEnumConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumConstantRule()); 
            }
            pushFollow(FOLLOW_ruleEnumConstant_in_entryRuleEnumConstant1249);
            iv_ruleEnumConstant=ruleEnumConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumConstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumConstant1259); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumConstant"


    // $ANTLR start "ruleEnumConstant"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:568:1: ruleEnumConstant returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_implicit_2_0= ruleIntValue ) ) )? ) ;
    public final EObject ruleEnumConstant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_implicit_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:571:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_implicit_2_0= ruleIntValue ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:572:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_implicit_2_0= ruleIntValue ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:572:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_implicit_2_0= ruleIntValue ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:572:2: ( (lv_name_0_0= RULE_ID ) ) ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_implicit_2_0= ruleIntValue ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:572:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:573:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:573:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:574:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumConstant1301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumConstantAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumConstantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:590:2: ( ( ( '=' )=>otherlv_1= '=' ) ( (lv_implicit_2_0= ruleIntValue ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) && (synpred3_InternalClassmodel())) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:590:3: ( ( '=' )=>otherlv_1= '=' ) ( (lv_implicit_2_0= ruleIntValue ) )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:590:3: ( ( '=' )=>otherlv_1= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:590:4: ( '=' )=>otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEnumConstant1327); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumConstantAccess().getEqualsSignKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:595:2: ( (lv_implicit_2_0= ruleIntValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:596:1: (lv_implicit_2_0= ruleIntValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:596:1: (lv_implicit_2_0= ruleIntValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:597:3: lv_implicit_2_0= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumConstantAccess().getImplicitIntValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleEnumConstant1349);
                    lv_implicit_2_0=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumConstantRule());
                      	        }
                             		add(
                             			current, 
                             			"implicit",
                              		lv_implicit_2_0, 
                              		"IntValue");
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
    // $ANTLR end "ruleEnumConstant"


    // $ANTLR start "entryRuleReference"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:621:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:622:2: (iv_ruleReference= ruleReference EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:623:2: iv_ruleReference= ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1387);
            iv_ruleReference=ruleReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1397); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:630:1: ruleReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_array_1_0= ruleArray ) )* ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:633:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_array_1_0= ruleArray ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:634:1: ( ( ( ruleQualifiedName ) ) ( (lv_array_1_0= ruleArray ) )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:634:1: ( ( ( ruleQualifiedName ) ) ( (lv_array_1_0= ruleArray ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:634:2: ( ( ruleQualifiedName ) ) ( (lv_array_1_0= ruleArray ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:634:2: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:635:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:635:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:636:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeEntityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleReference1445);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:649:2: ( (lv_array_1_0= ruleArray ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:650:1: (lv_array_1_0= ruleArray )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:650:1: (lv_array_1_0= ruleArray )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:651:3: lv_array_1_0= ruleArray
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArray_in_ruleReference1466);
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
            	    break loop10;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:675:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:676:2: (iv_ruleArray= ruleArray EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:677:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1503);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1513); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:684:1: ruleArray returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_size_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:687:28: ( ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:688:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:688:1: ( () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']' )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:688:2: () otherlv_1= '[' ( (lv_size_2_0= RULE_INT ) )? otherlv_3= ']'
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:688:2: ()
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:689:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArrayAccess().getArrayAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleArray1559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:698:1: ( (lv_size_2_0= RULE_INT ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:699:1: (lv_size_2_0= RULE_INT )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:699:1: (lv_size_2_0= RULE_INT )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:700:3: lv_size_2_0= RULE_INT
                    {
                    lv_size_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArray1576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_size_2_0, grammarAccess.getArrayAccess().getSizeINTTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArrayRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"size",
                              		lv_size_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleArray1594); if (state.failed) return current;
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


    // $ANTLR start "entryRuleFeature"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:728:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:729:2: (iv_ruleFeature= ruleFeature EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:730:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature1630);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature1640); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:737:1: ruleFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Operation_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:740:28: ( (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:741:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:741:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:742:5: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttribute_in_ruleFeature1687);
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
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:752:5: this_Operation_1= ruleOperation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getOperationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOperation_in_ruleFeature1714);
                    this_Operation_1=ruleOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Operation_1; 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleOperation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:768:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:769:2: (iv_ruleOperation= ruleOperation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:770:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_ruleOperation_in_entryRuleOperation1749);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperation1759); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:777:1: ruleOperation returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Enumerator lv_modifier_1_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_7_0 = null;

        EObject lv_return_10_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:780:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:781:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:781:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_return_10_0= ruleReference ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:781:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( ( ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )? otherlv_8= ')' otherlv_9= ':' ( (lv_return_10_0= ruleReference ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:781:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:783:1: ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:783:1: ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:784:2: ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getOperationAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:787:2: ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:788:3: ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:788:3: ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 >=37 && LA13_0<=40 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:790:4: ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:790:4: ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:791:5: {...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:791:106: ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:792:6: ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:795:6: ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:795:7: {...}? => ( (lv_modifier_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:795:16: ( (lv_modifier_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:796:1: (lv_modifier_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:796:1: (lv_modifier_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:797:3: lv_modifier_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOperationAccess().getModifierVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleOperation1850);
            	    lv_modifier_1_0=ruleVisibility();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"modifier",
            	              		lv_modifier_1_0, 
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
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:820:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:820:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:821:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "getUnorderedGroupHelper().canSelect(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:821:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:822:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getOperationAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:825:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:825:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleOperation", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:825:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:826:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:826:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:827:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,22,FOLLOW_22_in_ruleOperation1922); if (state.failed) return current;
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
            	    break loop13;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getOperationAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:854:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:855:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:855:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:856:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOperation1992); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleOperation2009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:876:1: ( ( ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) && (synpred4_InternalClassmodel())) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:876:2: ( ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:876:2: ( ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:876:3: ( ( ruleParameter ) )=> (lv_parameters_5_0= ruleParameter )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:881:1: (lv_parameters_5_0= ruleParameter )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:882:3: lv_parameters_5_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleOperation2041);
                    lv_parameters_5_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOperationRule());
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

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:898:2: (otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:898:4: otherlv_6= ',' ( (lv_parameters_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleOperation2054); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:902:1: ( (lv_parameters_7_0= ruleParameter ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:903:1: (lv_parameters_7_0= ruleParameter )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:903:1: (lv_parameters_7_0= ruleParameter )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:904:3: lv_parameters_7_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameter_in_ruleOperation2075);
                    	    lv_parameters_7_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_7_0, 
                    	              		"Parameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleOperation2091); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_9=(Token)match(input,26,FOLLOW_26_in_ruleOperation2103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getColonKeyword_5());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:928:1: ( (lv_return_10_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:929:1: (lv_return_10_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:929:1: (lv_return_10_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:930:3: lv_return_10_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOperationAccess().getReturnReferenceParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleOperation2124);
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:954:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:955:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:956:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter2160);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter2170); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:963:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) ) )* )? ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:966:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:967:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:967:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:967:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleReference ) ) ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:967:2: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:968:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:968:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:969:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameter2212); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleParameter2229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:989:1: ( (lv_type_2_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:990:1: (lv_type_2_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:990:1: (lv_type_2_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:991:3: lv_type_2_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleParameter2250);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:2: ( ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) && (synpred5_InternalClassmodel())) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:3: ( ( '=' )=>otherlv_3= '=' ) ( (lv_implicit_4_0= ruleValue ) ) (otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:3: ( ( '=' )=>otherlv_3= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:4: ( '=' )=>otherlv_3= '='
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleParameter2271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1012:2: ( (lv_implicit_4_0= ruleValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1013:1: (lv_implicit_4_0= ruleValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1013:1: (lv_implicit_4_0= ruleValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1014:3: lv_implicit_4_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitValueParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleParameter2293);
                    lv_implicit_4_0=ruleValue();

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
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1030:2: (otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==24) ) {
                            int LA16_1 = input.LA(2);

                            if ( ((LA16_1>=RULE_STRING && LA16_1<=RULE_INT)||LA16_1==27) ) {
                                alt16=1;
                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1030:4: otherlv_5= ',' ( (lv_implicit_6_0= ruleValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleParameter2306); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1034:1: ( (lv_implicit_6_0= ruleValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1035:1: (lv_implicit_6_0= ruleValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1035:1: (lv_implicit_6_0= ruleValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1036:3: lv_implicit_6_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getParameterAccess().getImplicitValueParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValue_in_ruleParameter2327);
                    	    lv_implicit_6_0=ruleValue();

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
                    	              		"Value");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1060:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1061:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1062:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2367);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2377); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1069:1: ruleAttribute returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) ) )* )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_2_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_modifier_1_0 = null;

        EObject lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_implicit_7_0 = null;

        AntlrDatatypeRuleToken lv_implicit_9_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1072:28: ( ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) ) )* )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1073:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) ) )* )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1073:1: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) ) )* )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1073:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_type_5_0= ruleReference ) ) ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) ) )* )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1073:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1075:1: ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1075:1: ( ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1076:2: ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getAttributeAccess().getUnorderedGroup_0());
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1079:2: ( ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1080:3: ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1080:3: ( ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( LA18_0 >=37 && LA18_0<=40 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1082:4: ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1082:4: ({...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1083:5: {...}? => ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1083:106: ( ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1084:6: ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 0);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1087:6: ({...}? => ( (lv_modifier_1_0= ruleVisibility ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1087:7: {...}? => ( (lv_modifier_1_0= ruleVisibility ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1087:16: ( (lv_modifier_1_0= ruleVisibility ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1088:1: (lv_modifier_1_0= ruleVisibility )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1088:1: (lv_modifier_1_0= ruleVisibility )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1089:3: lv_modifier_1_0= ruleVisibility
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAttributeAccess().getModifierVisibilityEnumRuleCall_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVisibility_in_ruleAttribute2468);
            	    lv_modifier_1_0=ruleVisibility();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"modifier",
            	              		lv_modifier_1_0, 
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
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1112:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1112:4: ({...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1113:5: {...}? => ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1113:106: ( ({...}? => ( (lv_static_2_0= 'static' ) ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1114:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getAttributeAccess().getUnorderedGroup_0(), 1);
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1117:6: ({...}? => ( (lv_static_2_0= 'static' ) ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1117:7: {...}? => ( (lv_static_2_0= 'static' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleAttribute", "true");
            	    }
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1117:16: ( (lv_static_2_0= 'static' ) )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1118:1: (lv_static_2_0= 'static' )
            	    {
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1118:1: (lv_static_2_0= 'static' )
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1119:3: lv_static_2_0= 'static'
            	    {
            	    lv_static_2_0=(Token)match(input,22,FOLLOW_22_in_ruleAttribute2540); if (state.failed) return current;
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
            	    break loop18;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getAttributeAccess().getUnorderedGroup_0());

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1146:2: ( (lv_name_3_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1147:1: (lv_name_3_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1147:1: (lv_name_3_0= RULE_ID )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1148:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute2610); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleAttribute2627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getColonKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1168:1: ( (lv_type_5_0= ruleReference ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1169:1: (lv_type_5_0= ruleReference )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1169:1: (lv_type_5_0= ruleReference )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1170:3: lv_type_5_0= ruleReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeReferenceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleReference_in_ruleAttribute2648);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1186:2: ( ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) && (synpred6_InternalClassmodel())) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1186:3: ( ( '=' )=>otherlv_6= '=' ) ( (lv_implicit_7_0= ruleValue ) ) (otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) ) )*
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1186:3: ( ( '=' )=>otherlv_6= '=' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1186:4: ( '=' )=>otherlv_6= '='
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleAttribute2669); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getEqualsSignKeyword_4_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1191:2: ( (lv_implicit_7_0= ruleValue ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1192:1: (lv_implicit_7_0= ruleValue )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1192:1: (lv_implicit_7_0= ruleValue )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1193:3: lv_implicit_7_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttribute2691);
                    lv_implicit_7_0=ruleValue();

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
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1209:2: (otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==24) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1209:4: otherlv_8= ',' ( (lv_implicit_9_0= ruleValue ) )
                    	    {
                    	    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleAttribute2704); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getAttributeAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1213:1: ( (lv_implicit_9_0= ruleValue ) )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1214:1: (lv_implicit_9_0= ruleValue )
                    	    {
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1214:1: (lv_implicit_9_0= ruleValue )
                    	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1215:3: lv_implicit_9_0= ruleValue
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAttributeAccess().getImplicitValueParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValue_in_ruleAttribute2725);
                    	    lv_implicit_9_0=ruleValue();

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
                    	              		"Value");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1239:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1240:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1241:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue2766);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue2777); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1248:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'null' | this_STRING_1= RULE_STRING | this_IntValue_2= ruleIntValue ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_IntValue_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1251:28: ( (kw= 'null' | this_STRING_1= RULE_STRING | this_IntValue_2= ruleIntValue ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1252:1: (kw= 'null' | this_STRING_1= RULE_STRING | this_IntValue_2= ruleIntValue )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1252:1: (kw= 'null' | this_STRING_1= RULE_STRING | this_IntValue_2= ruleIntValue )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt21=1;
                }
                break;
            case RULE_STRING:
                {
                alt21=2;
                }
                break;
            case RULE_INT:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1253:2: kw= 'null'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleValue2815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValueAccess().getNullKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1259:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue2836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1268:5: this_IntValue_2= ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getIntValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_ruleValue2869);
                    this_IntValue_2=ruleIntValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_IntValue_2);
                          
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


    // $ANTLR start "entryRuleIntValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1286:1: entryRuleIntValue returns [String current=null] : iv_ruleIntValue= ruleIntValue EOF ;
    public final String entryRuleIntValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1287:2: (iv_ruleIntValue= ruleIntValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1288:2: iv_ruleIntValue= ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue2915);
            iv_ruleIntValue=ruleIntValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue2926); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntValue"


    // $ANTLR start "ruleIntValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1295:1: ruleIntValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleIntValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1298:28: (this_INT_0= RULE_INT )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1299:5: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntValue2965); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getIntValueAccess().getINTTerminalRuleCall()); 
                  
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
    // $ANTLR end "ruleIntValue"


    // $ANTLR start "entryRuleRelation"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1314:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1315:2: (iv_ruleRelation= ruleRelation EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1316:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationRule()); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation3009);
            iv_ruleRelation=ruleRelation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation3019); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1323:1: ruleRelation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= ruleCardinality ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= ruleCardinality ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token lv_label_6_0=null;
        AntlrDatatypeRuleToken lv_cardinalityFrom_1_0 = null;

        Enumerator lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_cardinalityTo_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1326:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= ruleCardinality ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= ruleCardinality ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1327:1: ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= ruleCardinality ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= ruleCardinality ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1327:1: ( ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= ruleCardinality ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= ruleCardinality ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1327:2: ( ( ruleQualifiedName ) ) ( (lv_cardinalityFrom_1_0= ruleCardinality ) )? ( (lv_type_2_0= ruleRelationType ) ) ( (lv_cardinalityTo_3_0= ruleCardinality ) )? ( ( ruleQualifiedName ) ) (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )?
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1327:2: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1328:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1328:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1329:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationAccess().getOriginEntityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelation3067);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1342:2: ( (lv_cardinalityFrom_1_0= ruleCardinality ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT||LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1343:1: (lv_cardinalityFrom_1_0= ruleCardinality )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1343:1: (lv_cardinalityFrom_1_0= ruleCardinality )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1344:3: lv_cardinalityFrom_1_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationAccess().getCardinalityFromCardinalityParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCardinality_in_ruleRelation3088);
                    lv_cardinalityFrom_1_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"cardinalityFrom",
                              		lv_cardinalityFrom_1_0, 
                              		"Cardinality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1360:3: ( (lv_type_2_0= ruleRelationType ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1361:1: (lv_type_2_0= ruleRelationType )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1361:1: (lv_type_2_0= ruleRelationType )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1362:3: lv_type_2_0= ruleRelationType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationAccess().getTypeRelationTypeEnumRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRelationType_in_ruleRelation3110);
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

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1378:2: ( (lv_cardinalityTo_3_0= ruleCardinality ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1379:1: (lv_cardinalityTo_3_0= ruleCardinality )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1379:1: (lv_cardinalityTo_3_0= ruleCardinality )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1380:3: lv_cardinalityTo_3_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationAccess().getCardinalityToCardinalityParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCardinality_in_ruleRelation3131);
                    lv_cardinalityTo_3_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationRule());
                      	        }
                             		set(
                             			current, 
                             			"cardinalityTo",
                              		lv_cardinalityTo_3_0, 
                              		"Cardinality");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1396:3: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1397:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1397:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1398:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationAccess().getDestinationEntityCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRelation3155);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1411:2: (otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1411:4: otherlv_5= ':' ( (lv_label_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleRelation3168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getColonKeyword_5_0());
                          
                    }
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1415:1: ( (lv_label_6_0= RULE_STRING ) )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1416:1: (lv_label_6_0= RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1416:1: (lv_label_6_0= RULE_STRING )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1417:3: lv_label_6_0= RULE_STRING
                    {
                    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRelation3185); if (state.failed) return current;
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


    // $ANTLR start "entryRuleCardinality"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1441:1: entryRuleCardinality returns [String current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final String entryRuleCardinality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinality = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1442:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1443:2: iv_ruleCardinality= ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality3229);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality3240); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1450:1: ruleCardinality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CardinalityValue_0= ruleCardinalityValue (kw= '..' this_CardinalityValue_2= ruleCardinalityValue )? ) ;
    public final AntlrDatatypeRuleToken ruleCardinality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_CardinalityValue_0 = null;

        AntlrDatatypeRuleToken this_CardinalityValue_2 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1453:28: ( (this_CardinalityValue_0= ruleCardinalityValue (kw= '..' this_CardinalityValue_2= ruleCardinalityValue )? ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1454:1: (this_CardinalityValue_0= ruleCardinalityValue (kw= '..' this_CardinalityValue_2= ruleCardinalityValue )? )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1454:1: (this_CardinalityValue_0= ruleCardinalityValue (kw= '..' this_CardinalityValue_2= ruleCardinalityValue )? )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1455:5: this_CardinalityValue_0= ruleCardinalityValue (kw= '..' this_CardinalityValue_2= ruleCardinalityValue )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCardinalityAccess().getCardinalityValueParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCardinalityValue_in_ruleCardinality3287);
            this_CardinalityValue_0=ruleCardinalityValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_CardinalityValue_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1465:1: (kw= '..' this_CardinalityValue_2= ruleCardinalityValue )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1466:2: kw= '..' this_CardinalityValue_2= ruleCardinalityValue
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleCardinality3306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCardinalityAccess().getFullStopFullStopKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCardinalityAccess().getCardinalityValueParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCardinalityValue_in_ruleCardinality3328);
                    this_CardinalityValue_2=ruleCardinalityValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CardinalityValue_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleCardinalityValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1490:1: entryRuleCardinalityValue returns [String current=null] : iv_ruleCardinalityValue= ruleCardinalityValue EOF ;
    public final String entryRuleCardinalityValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCardinalityValue = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1491:2: (iv_ruleCardinalityValue= ruleCardinalityValue EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1492:2: iv_ruleCardinalityValue= ruleCardinalityValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityValueRule()); 
            }
            pushFollow(FOLLOW_ruleCardinalityValue_in_entryRuleCardinalityValue3376);
            iv_ruleCardinalityValue=ruleCardinalityValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinalityValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinalityValue3387); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinalityValue"


    // $ANTLR start "ruleCardinalityValue"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1499:1: ruleCardinalityValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleCardinalityValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1502:28: ( (this_INT_0= RULE_INT | kw= '*' ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1503:1: (this_INT_0= RULE_INT | kw= '*' )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1503:1: (this_INT_0= RULE_INT | kw= '*' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_INT) ) {
                alt26=1;
            }
            else if ( (LA26_0==29) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1503:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCardinalityValue3427); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getCardinalityValueAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1512:2: kw= '*'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleCardinalityValue3451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCardinalityValueAccess().getAsteriskKeyword_1()); 
                          
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
    // $ANTLR end "ruleCardinalityValue"


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1525:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1526:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1527:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3492);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3503); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1534:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1537:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1538:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1538:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1538:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3543); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1545:1: (kw= '.' this_ID_2= RULE_ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1546:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleQualifiedName3562); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName3577); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1566:1: ruleRelationType returns [Enumerator current=null] : ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composedOf' ) ) ;
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
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1568:28: ( ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composedOf' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1569:1: ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composedOf' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1569:1: ( (enumLiteral_0= 'associates' ) | (enumLiteral_1= 'depends' ) | (enumLiteral_2= 'extends' ) | (enumLiteral_3= 'implements' ) | (enumLiteral_4= 'aggregates' ) | (enumLiteral_5= 'composedOf' ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt28=1;
                }
                break;
            case 32:
                {
                alt28=2;
                }
                break;
            case 33:
                {
                alt28=3;
                }
                break;
            case 34:
                {
                alt28=4;
                }
                break;
            case 35:
                {
                alt28=5;
                }
                break;
            case 36:
                {
                alt28=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1569:2: (enumLiteral_0= 'associates' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1569:2: (enumLiteral_0= 'associates' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1569:4: enumLiteral_0= 'associates'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleRelationType3638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRelationTypeAccess().getASSOCIATIONEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1575:6: (enumLiteral_1= 'depends' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1575:6: (enumLiteral_1= 'depends' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1575:8: enumLiteral_1= 'depends'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_32_in_ruleRelationType3655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRelationTypeAccess().getDEPENCYEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1581:6: (enumLiteral_2= 'extends' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1581:6: (enumLiteral_2= 'extends' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1581:8: enumLiteral_2= 'extends'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_33_in_ruleRelationType3672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRelationTypeAccess().getGENERALIZATIONEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1587:6: (enumLiteral_3= 'implements' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1587:6: (enumLiteral_3= 'implements' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1587:8: enumLiteral_3= 'implements'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_34_in_ruleRelationType3689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getRelationTypeAccess().getREALIZATIONEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1593:6: (enumLiteral_4= 'aggregates' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1593:6: (enumLiteral_4= 'aggregates' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1593:8: enumLiteral_4= 'aggregates'
                    {
                    enumLiteral_4=(Token)match(input,35,FOLLOW_35_in_ruleRelationType3706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getRelationTypeAccess().getAGGREGATIONEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1599:6: (enumLiteral_5= 'composedOf' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1599:6: (enumLiteral_5= 'composedOf' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1599:8: enumLiteral_5= 'composedOf'
                    {
                    enumLiteral_5=(Token)match(input,36,FOLLOW_36_in_ruleRelationType3723); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1609:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1611:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1612:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1612:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt29=1;
                }
                break;
            case 38:
                {
                alt29=2;
                }
                break;
            case 39:
                {
                alt29=3;
                }
                break;
            case 40:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1612:2: (enumLiteral_0= '+' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1612:2: (enumLiteral_0= '+' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1612:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_37_in_ruleVisibility3768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPUBLICEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1618:6: (enumLiteral_1= '-' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1618:6: (enumLiteral_1= '-' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1618:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_38_in_ruleVisibility3785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1624:6: (enumLiteral_2= '#' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1624:6: (enumLiteral_2= '#' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1624:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_39_in_ruleVisibility3802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1630:6: (enumLiteral_3= '~' )
                    {
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1630:6: (enumLiteral_3= '~' )
                    // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1630:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,40,FOLLOW_40_in_ruleVisibility3819); if (state.failed) return current;
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
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:3: ( ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:4: ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:4: ( ( ( 'class' ) ) | ( ( 'interface' ) ) | ( ( 'abstract' ) ) )
        int alt30=3;
        switch ( input.LA(1) ) {
        case 15:
            {
            alt30=1;
            }
            break;
        case 16:
            {
            alt30=2;
            }
            break;
        case 17:
            {
            alt30=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 30, 0, input);

            throw nvae;
        }

        switch (alt30) {
            case 1 :
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:5: ( ( 'class' ) )
                {
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:300:5: ( ( 'class' ) )
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:301:1: ( 'class' )
                {
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:301:1: ( 'class' )
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:302:2: 'class'
                {
                match(input,15,FOLLOW_15_in_synpred1_InternalClassmodel644); if (state.failed) return ;

                }


                }


                }
                break;
            case 2 :
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:307:6: ( ( 'interface' ) )
                {
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:307:6: ( ( 'interface' ) )
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:308:1: ( 'interface' )
                {
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:308:1: ( 'interface' )
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:309:2: 'interface'
                {
                match(input,16,FOLLOW_16_in_synpred1_InternalClassmodel664); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:314:6: ( ( 'abstract' ) )
                {
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:314:6: ( ( 'abstract' ) )
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:315:1: ( 'abstract' )
                {
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:315:1: ( 'abstract' )
                // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:316:2: 'abstract'
                {
                match(input,17,FOLLOW_17_in_synpred1_InternalClassmodel684); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }
    }
    // $ANTLR end synpred1_InternalClassmodel

    // $ANTLR start synpred3_InternalClassmodel
    public final void synpred3_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:590:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:590:6: '='
        {
        match(input,19,FOLLOW_19_in_synpred3_InternalClassmodel1319); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalClassmodel

    // $ANTLR start synpred4_InternalClassmodel
    public final void synpred4_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:876:3: ( ( ruleParameter ) )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:877:1: ( ruleParameter )
        {
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:877:1: ( ruleParameter )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:878:1: ruleParameter
        {
        pushFollow(FOLLOW_ruleParameter_in_synpred4_InternalClassmodel2024);
        ruleParameter();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalClassmodel

    // $ANTLR start synpred5_InternalClassmodel
    public final void synpred5_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1007:6: '='
        {
        match(input,19,FOLLOW_19_in_synpred5_InternalClassmodel2263); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalClassmodel

    // $ANTLR start synpred6_InternalClassmodel
    public final void synpred6_InternalClassmodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1186:4: ( '=' )
        // ../cz.cvut.earlgrey.classmodel/src-gen/cz/cvut/earlgrey/classmodel/parser/antlr/internal/InternalClassmodel.g:1186:6: '='
        {
        match(input,19,FOLLOW_19_in_synpred6_InternalClassmodel2661); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalClassmodel

    // Delegated rules

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


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\11\uffff";
    static final String DFA12_eofS =
        "\11\uffff";
    static final String DFA12_minS =
        "\6\4\1\27\2\uffff";
    static final String DFA12_maxS =
        "\6\50\1\32\2\uffff";
    static final String DFA12_acceptS =
        "\7\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\11\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\6\21\uffff\1\5\16\uffff\1\1\1\2\1\3\1\4",
            "\1\6\21\uffff\1\5\16\uffff\1\1\1\2\1\3\1\4",
            "\1\6\21\uffff\1\5\16\uffff\1\1\1\2\1\3\1\4",
            "\1\6\21\uffff\1\5\16\uffff\1\1\1\2\1\3\1\4",
            "\1\6\21\uffff\1\5\16\uffff\1\1\1\2\1\3\1\4",
            "\1\6\21\uffff\1\5\16\uffff\1\1\1\2\1\3\1\4",
            "\1\7\2\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "741:1: (this_Attribute_0= ruleAttribute | this_Operation_1= ruleOperation )";
        }
    }
 

    public static final BitSet FOLLOW_ruleClassmodel_in_entryRuleClassmodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassmodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleClassmodel131 = new BitSet(new long[]{0x000000000007C812L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleClassmodel153 = new BitSet(new long[]{0x0000000000078812L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_ruleAbstractElement247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleAbstractElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleAbstractElement301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_entryRulePackage336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePackage346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePackage383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePackage400 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePackage417 = new BitSet(new long[]{0x000000000007A810L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_rulePackage438 = new BitSet(new long[]{0x000000000007A810L});
    public static final BitSet FOLLOW_13_in_rulePackage451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleImport534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleEntity709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_ruleEntity737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleClass886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_16_in_ruleClass923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17_in_ruleClass960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleClass992 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClass1009 = new BitSet(new long[]{0x000001E000402010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleClass1030 = new BitSet(new long[]{0x000001E000402010L});
    public static final BitSet FOLLOW_13_in_ruleClass1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnum_in_entryRuleEnum1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnum1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEnum1132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnum1162 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleEnum1179 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_ruleEnumConstant_in_ruleEnum1200 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_ruleEnum1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumConstant_in_entryRuleEnumConstant1249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumConstant1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumConstant1301 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleEnumConstant1327 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleEnumConstant1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReference1445 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleReference1466 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleArray1559 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArray1576 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleArray1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleFeature1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_ruleFeature1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperation1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleOperation1850 = new BitSet(new long[]{0x000001E000400010L});
    public static final BitSet FOLLOW_22_in_ruleOperation1922 = new BitSet(new long[]{0x000001E000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOperation1992 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleOperation2009 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation2041 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleOperation2054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleOperation2075 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleOperation2091 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleOperation2103 = new BitSet(new long[]{0x0000000000078810L});
    public static final BitSet FOLLOW_ruleReference_in_ruleOperation2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameter2212 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleParameter2229 = new BitSet(new long[]{0x0000000000078810L});
    public static final BitSet FOLLOW_ruleReference_in_ruleParameter2250 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleParameter2271 = new BitSet(new long[]{0x0000000008000060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter2293 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleParameter2306 = new BitSet(new long[]{0x0000000008000060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter2327 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleAttribute2468 = new BitSet(new long[]{0x000001E000400010L});
    public static final BitSet FOLLOW_22_in_ruleAttribute2540 = new BitSet(new long[]{0x000001E000400010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute2610 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleAttribute2627 = new BitSet(new long[]{0x0000000000078810L});
    public static final BitSet FOLLOW_ruleReference_in_ruleAttribute2648 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleAttribute2669 = new BitSet(new long[]{0x0000000008000060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttribute2691 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAttribute2704 = new BitSet(new long[]{0x0000000008000060L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttribute2725 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleValue2815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_ruleValue2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue2915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntValue2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation3009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation3019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelation3067 = new BitSet(new long[]{0x0000001FA0000040L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleRelation3088 = new BitSet(new long[]{0x0000001FA0000040L});
    public static final BitSet FOLLOW_ruleRelationType_in_ruleRelation3110 = new BitSet(new long[]{0x0000000020078850L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleRelation3131 = new BitSet(new long[]{0x0000000000078810L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelation3155 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleRelation3168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRelation3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality3229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityValue_in_ruleCardinality3287 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleCardinality3306 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_ruleCardinalityValue_in_ruleCardinality3328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinalityValue_in_entryRuleCardinalityValue3376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinalityValue3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCardinalityValue3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCardinalityValue3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3543 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleQualifiedName3562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3577 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_31_in_ruleRelationType3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRelationType3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRelationType3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRelationType3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRelationType3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRelationType3723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleVisibility3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVisibility3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVisibility3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleVisibility3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalClassmodel644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred1_InternalClassmodel664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred1_InternalClassmodel684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred3_InternalClassmodel1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_synpred4_InternalClassmodel2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred5_InternalClassmodel2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred6_InternalClassmodel2661 = new BitSet(new long[]{0x0000000000000002L});

}

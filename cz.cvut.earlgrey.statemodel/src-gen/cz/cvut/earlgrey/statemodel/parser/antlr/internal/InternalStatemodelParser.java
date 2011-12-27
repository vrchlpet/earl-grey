package cz.cvut.earlgrey.statemodel.parser.antlr.internal; 

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
import cz.cvut.earlgrey.statemodel.services.StatemodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStatemodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CONDITION", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'statemachine'", "'{'", "'}'", "'on'", "'if'", "'do'", "'=>'", "'goto'", "'import'", "'.'", "'state'", "'initial'", "'final'"
    };
    public static final int RULE_ID=4;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_CONDITION=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalStatemodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStatemodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStatemodelParser.tokenNames; }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g"; }



     	private StatemodelGrammarAccess grammarAccess;
     	
        public InternalStatemodelParser(TokenStream input, StatemodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Statemodel";	
       	}
       	
       	@Override
       	protected StatemodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStatemodel"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:68:1: entryRuleStatemodel returns [EObject current=null] : iv_ruleStatemodel= ruleStatemodel EOF ;
    public final EObject entryRuleStatemodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemodel = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:69:2: (iv_ruleStatemodel= ruleStatemodel EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:70:2: iv_ruleStatemodel= ruleStatemodel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatemodelRule()); 
            }
            pushFollow(FOLLOW_ruleStatemodel_in_entryRuleStatemodel75);
            iv_ruleStatemodel=ruleStatemodel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatemodel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemodel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatemodel"


    // $ANTLR start "ruleStatemodel"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:77:1: ruleStatemodel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_statemachine_1_0= ruleStatemachine ) )* ) ;
    public final EObject ruleStatemodel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_statemachine_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:80:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_statemachine_1_0= ruleStatemachine ) )* ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_statemachine_1_0= ruleStatemachine ) )* )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:81:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_statemachine_1_0= ruleStatemachine ) )* )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:81:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_statemachine_1_0= ruleStatemachine ) )*
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:81:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:82:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:82:1: (lv_imports_0_0= ruleImport )
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:83:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatemodelAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleStatemodel131);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatemodelRule());
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

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:99:3: ( (lv_statemachine_1_0= ruleStatemachine ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:100:1: (lv_statemachine_1_0= ruleStatemachine )
            	    {
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:100:1: (lv_statemachine_1_0= ruleStatemachine )
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:101:3: lv_statemachine_1_0= ruleStatemachine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatemodelAccess().getStatemachineStatemachineParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatemachine_in_ruleStatemodel153);
            	    lv_statemachine_1_0=ruleStatemachine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatemodelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statemachine",
            	              		lv_statemachine_1_0, 
            	              		"Statemachine");
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
    // $ANTLR end "ruleStatemodel"


    // $ANTLR start "entryRuleStatemachine"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:125:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:126:2: (iv_ruleStatemachine= ruleStatemachine EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:127:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatemachineRule()); 
            }
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine190);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatemachine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:134:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}' ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_state_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:137:28: ( (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:3: otherlv_0= 'statemachine' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getStatemachineKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:142:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:143:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:143:1: (lv_name_1_0= ruleQualifiedName )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:144:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatemachineAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStatemachine258);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStatemachine270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:164:1: ( (lv_state_3_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=22 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:165:1: (lv_state_3_0= ruleState )
            	    {
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:165:1: (lv_state_3_0= ruleState )
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:166:3: lv_state_3_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine291);
            	    lv_state_3_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"state",
            	              		lv_state_3_0, 
            	              		"State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStatemachine304); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleState"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:194:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:195:2: (iv_ruleState= ruleState EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:196:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState340);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState350); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:203:1: ruleState returns [EObject current=null] : ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:206:28: ( ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:207:1: ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:207:1: ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:207:2: ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}'
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:207:2: ( (lv_type_0_0= ruleStateType ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:208:1: (lv_type_0_0= ruleStateType )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:208:1: (lv_type_0_0= ruleStateType )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:209:3: lv_type_0_0= ruleStateType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateType_in_ruleState396);
            lv_type_0_0=ruleStateType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"StateType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:225:2: ( (lv_name_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:226:1: (lv_name_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:226:1: (lv_name_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:227:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleState430); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:247:1: ( (lv_element_3_0= ruleElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_CONDITION)||(LA4_0>=15 && LA4_0<=19)||(LA4_0>=22 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:248:1: (lv_element_3_0= ruleElement )
            	    {
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:248:1: (lv_element_3_0= ruleElement )
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:249:3: lv_element_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getElementElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleState451);
            	    lv_element_3_0=ruleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleState464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleElement"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:277:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:278:2: (iv_ruleElement= ruleElement EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:279:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement500);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement510); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:286:1: ruleElement returns [EObject current=null] : (this_Transition_0= ruleTransition | this_State_1= ruleState ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Transition_0 = null;

        EObject this_State_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:289:28: ( (this_Transition_0= ruleTransition | this_State_1= ruleState ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:290:1: (this_Transition_0= ruleTransition | this_State_1= ruleState )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:290:1: (this_Transition_0= ruleTransition | this_State_1= ruleState )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_CONDITION)||(LA5_0>=15 && LA5_0<=19)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=22 && LA5_0<=24)) ) {
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
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:291:5: this_Transition_0= ruleTransition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getTransitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransition_in_ruleElement557);
                    this_Transition_0=ruleTransition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Transition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:301:5: this_State_1= ruleState
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getStateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleState_in_ruleElement584);
                    this_State_1=ruleState();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_State_1; 
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


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:317:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:318:2: (iv_ruleTransition= ruleTransition EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:319:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition619);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition629); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:326:1: ruleTransition returns [EObject current=null] : ( ( ( ( 'on' )=>otherlv_0= 'on' )? ( (lv_event_1_0= ruleEvent ) ) )? ( ( ( 'if' )=>otherlv_2= 'if' ) ( (lv_guard_3_0= ruleGuard ) ) )? ( ( ( 'do' )=>otherlv_4= 'do' ) ( (lv_action_5_0= ruleAction ) ) )? (otherlv_6= '=>' | otherlv_7= 'goto' ) ( ( ( RULE_ID ) )=> (otherlv_8= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_event_1_0 = null;

        EObject lv_guard_3_0 = null;

        EObject lv_action_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:329:28: ( ( ( ( ( 'on' )=>otherlv_0= 'on' )? ( (lv_event_1_0= ruleEvent ) ) )? ( ( ( 'if' )=>otherlv_2= 'if' ) ( (lv_guard_3_0= ruleGuard ) ) )? ( ( ( 'do' )=>otherlv_4= 'do' ) ( (lv_action_5_0= ruleAction ) ) )? (otherlv_6= '=>' | otherlv_7= 'goto' ) ( ( ( RULE_ID ) )=> (otherlv_8= RULE_ID ) ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:1: ( ( ( ( 'on' )=>otherlv_0= 'on' )? ( (lv_event_1_0= ruleEvent ) ) )? ( ( ( 'if' )=>otherlv_2= 'if' ) ( (lv_guard_3_0= ruleGuard ) ) )? ( ( ( 'do' )=>otherlv_4= 'do' ) ( (lv_action_5_0= ruleAction ) ) )? (otherlv_6= '=>' | otherlv_7= 'goto' ) ( ( ( RULE_ID ) )=> (otherlv_8= RULE_ID ) ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:1: ( ( ( ( 'on' )=>otherlv_0= 'on' )? ( (lv_event_1_0= ruleEvent ) ) )? ( ( ( 'if' )=>otherlv_2= 'if' ) ( (lv_guard_3_0= ruleGuard ) ) )? ( ( ( 'do' )=>otherlv_4= 'do' ) ( (lv_action_5_0= ruleAction ) ) )? (otherlv_6= '=>' | otherlv_7= 'goto' ) ( ( ( RULE_ID ) )=> (otherlv_8= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:2: ( ( ( 'on' )=>otherlv_0= 'on' )? ( (lv_event_1_0= ruleEvent ) ) )? ( ( ( 'if' )=>otherlv_2= 'if' ) ( (lv_guard_3_0= ruleGuard ) ) )? ( ( ( 'do' )=>otherlv_4= 'do' ) ( (lv_action_5_0= ruleAction ) ) )? (otherlv_6= '=>' | otherlv_7= 'goto' ) ( ( ( RULE_ID ) )=> (otherlv_8= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:2: ( ( ( 'on' )=>otherlv_0= 'on' )? ( (lv_event_1_0= ruleEvent ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_CONDITION)||LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:3: ( ( 'on' )=>otherlv_0= 'on' )? ( (lv_event_1_0= ruleEvent ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:3: ( ( 'on' )=>otherlv_0= 'on' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) && (synpred1_InternalStatemodel())) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:4: ( 'on' )=>otherlv_0= 'on'
                            {
                            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTransition675); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getOnKeyword_0_0());
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:335:3: ( (lv_event_1_0= ruleEvent ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:336:1: (lv_event_1_0= ruleEvent )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:336:1: (lv_event_1_0= ruleEvent )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:337:3: lv_event_1_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEvent_in_ruleTransition698);
                    lv_event_1_0=ruleEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_1_0, 
                              		"Event");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:353:4: ( ( ( 'if' )=>otherlv_2= 'if' ) ( (lv_guard_3_0= ruleGuard ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) && (synpred2_InternalStatemodel())) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:353:5: ( ( 'if' )=>otherlv_2= 'if' ) ( (lv_guard_3_0= ruleGuard ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:353:5: ( ( 'if' )=>otherlv_2= 'if' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:353:6: ( 'if' )=>otherlv_2= 'if'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleTransition721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getIfKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:358:2: ( (lv_guard_3_0= ruleGuard ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:359:1: (lv_guard_3_0= ruleGuard )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:359:1: (lv_guard_3_0= ruleGuard )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:360:3: lv_guard_3_0= ruleGuard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGuard_in_ruleTransition743);
                    lv_guard_3_0=ruleGuard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"guard",
                              		lv_guard_3_0, 
                              		"Guard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:376:4: ( ( ( 'do' )=>otherlv_4= 'do' ) ( (lv_action_5_0= ruleAction ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) && (synpred3_InternalStatemodel())) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:376:5: ( ( 'do' )=>otherlv_4= 'do' ) ( (lv_action_5_0= ruleAction ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:376:5: ( ( 'do' )=>otherlv_4= 'do' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:376:6: ( 'do' )=>otherlv_4= 'do'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTransition766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getDoKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:381:2: ( (lv_action_5_0= ruleAction ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:382:1: (lv_action_5_0= ruleAction )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:382:1: (lv_action_5_0= ruleAction )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:383:3: lv_action_5_0= ruleAction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAction_in_ruleTransition788);
                    lv_action_5_0=ruleAction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"action",
                              		lv_action_5_0, 
                              		"Action");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:399:4: (otherlv_6= '=>' | otherlv_7= 'goto' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:399:6: otherlv_6= '=>'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleTransition803); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:404:7: otherlv_7= 'goto'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleTransition821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getGotoKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:408:2: ( ( ( RULE_ID ) )=> (otherlv_8= RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:408:3: ( ( RULE_ID ) )=> (otherlv_8= RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:414:1: (otherlv_8= RULE_ID )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:415:3: otherlv_8= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition854); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getStateStateCrossReference_4_0()); 
              	
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:434:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:435:2: (iv_ruleEvent= ruleEvent EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:436:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent890);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent900); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:443:1: ruleEvent returns [EObject current=null] : ( (lv_value_0_0= ruleCompositeString ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:446:28: ( ( (lv_value_0_0= ruleCompositeString ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:447:1: ( (lv_value_0_0= ruleCompositeString ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:447:1: ( (lv_value_0_0= ruleCompositeString ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:448:1: (lv_value_0_0= ruleCompositeString )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:448:1: (lv_value_0_0= ruleCompositeString )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:449:3: lv_value_0_0= ruleCompositeString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEventAccess().getValueCompositeStringParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeString_in_ruleEvent945);
            lv_value_0_0=ruleCompositeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEventRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"CompositeString");
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGuard"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:473:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:474:2: (iv_ruleGuard= ruleGuard EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:475:2: iv_ruleGuard= ruleGuard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGuardRule()); 
            }
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard980);
            iv_ruleGuard=ruleGuard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGuard; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:482:1: ruleGuard returns [EObject current=null] : ( (lv_value_0_0= ruleCompositeString ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:485:28: ( ( (lv_value_0_0= ruleCompositeString ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:486:1: ( (lv_value_0_0= ruleCompositeString ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:486:1: ( (lv_value_0_0= ruleCompositeString ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:487:1: (lv_value_0_0= ruleCompositeString )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:487:1: (lv_value_0_0= ruleCompositeString )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:488:3: lv_value_0_0= ruleCompositeString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGuardAccess().getValueCompositeStringParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeString_in_ruleGuard1035);
            lv_value_0_0=ruleCompositeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGuardRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"CompositeString");
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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleAction"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:512:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:513:2: (iv_ruleAction= ruleAction EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:514:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1070);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1080); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:521:1: ruleAction returns [EObject current=null] : ( (lv_value_0_0= ruleCompositeString ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:524:28: ( ( (lv_value_0_0= ruleCompositeString ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:525:1: ( (lv_value_0_0= ruleCompositeString ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:525:1: ( (lv_value_0_0= ruleCompositeString ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:526:1: (lv_value_0_0= ruleCompositeString )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:526:1: (lv_value_0_0= ruleCompositeString )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:527:3: lv_value_0_0= ruleCompositeString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getActionAccess().getValueCompositeStringParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCompositeString_in_ruleAction1125);
            lv_value_0_0=ruleCompositeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getActionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"CompositeString");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCompositeString"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:551:1: entryRuleCompositeString returns [String current=null] : iv_ruleCompositeString= ruleCompositeString EOF ;
    public final String entryRuleCompositeString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompositeString = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:552:2: (iv_ruleCompositeString= ruleCompositeString EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:553:2: iv_ruleCompositeString= ruleCompositeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeStringRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeString_in_entryRuleCompositeString1161);
            iv_ruleCompositeString=ruleCompositeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeString1172); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeString"


    // $ANTLR start "ruleCompositeString"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:560:1: ruleCompositeString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_CONDITION_1= RULE_CONDITION ) ;
    public final AntlrDatatypeRuleToken ruleCompositeString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_CONDITION_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:563:28: ( (this_ID_0= RULE_ID | this_CONDITION_1= RULE_CONDITION ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:564:1: (this_ID_0= RULE_ID | this_CONDITION_1= RULE_CONDITION )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:564:1: (this_ID_0= RULE_ID | this_CONDITION_1= RULE_CONDITION )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_CONDITION) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:564:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeString1212); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getCompositeStringAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:572:10: this_CONDITION_1= RULE_CONDITION
                    {
                    this_CONDITION_1=(Token)match(input,RULE_CONDITION,FOLLOW_RULE_CONDITION_in_ruleCompositeString1238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CONDITION_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_CONDITION_1, grammarAccess.getCompositeStringAccess().getCONDITIONTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleCompositeString"


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:587:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:588:2: (iv_ruleImport= ruleImport EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:589:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1283);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1293); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:596:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:599:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:600:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:600:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:600:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleImport1330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:604:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:605:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:605:1: (lv_importURI_1_0= RULE_STRING )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:606:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport1347); if (state.failed) return current;
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:632:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:633:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:634:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1391);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1402); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:641:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:644:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:645:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:645:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:645:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:652:1: (kw= '.' this_ID_2= RULE_ID )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==21) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:653:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,21,FOLLOW_21_in_ruleQualifiedName1461); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1476); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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


    // $ANTLR start "ruleStateType"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:673:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:675:28: ( ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:676:1: ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:676:1: ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:676:2: (enumLiteral_0= 'state' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:676:2: (enumLiteral_0= 'state' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:676:4: enumLiteral_0= 'state'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_22_in_ruleStateType1537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:682:6: (enumLiteral_1= 'initial' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:682:6: (enumLiteral_1= 'initial' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:682:8: enumLiteral_1= 'initial'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_23_in_ruleStateType1554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:688:6: (enumLiteral_2= 'final' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:688:6: (enumLiteral_2= 'final' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:688:8: enumLiteral_2= 'final'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_24_in_ruleStateType1571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getFINALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getStateTypeAccess().getFINALEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleStateType"

    // $ANTLR start synpred1_InternalStatemodel
    public final void synpred1_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:4: ( 'on' )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:330:6: 'on'
        {
        match(input,15,FOLLOW_15_in_synpred1_InternalStatemodel667); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalStatemodel

    // $ANTLR start synpred2_InternalStatemodel
    public final void synpred2_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:353:6: ( 'if' )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:353:8: 'if'
        {
        match(input,16,FOLLOW_16_in_synpred2_InternalStatemodel713); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalStatemodel

    // $ANTLR start synpred3_InternalStatemodel
    public final void synpred3_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:376:6: ( 'do' )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:376:8: 'do'
        {
        match(input,17,FOLLOW_17_in_synpred3_InternalStatemodel758); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalStatemodel

    // Delegated rules

    public final boolean synpred1_InternalStatemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalStatemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalStatemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalStatemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalStatemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalStatemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleStatemodel_in_entryRuleStatemodel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemodel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleStatemodel131 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_ruleStatemodel153 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStatemachine258 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStatemachine270 = new BitSet(new long[]{0x0000000001C04000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine291 = new BitSet(new long[]{0x0000000001C04000L});
    public static final BitSet FOLLOW_14_in_ruleStatemachine304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState413 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState430 = new BitSet(new long[]{0x0000000001CFC030L});
    public static final BitSet FOLLOW_ruleElement_in_ruleState451 = new BitSet(new long[]{0x0000000001CFC030L});
    public static final BitSet FOLLOW_14_in_ruleState464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleElement557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleElement584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTransition675 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleTransition698 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_16_in_ruleTransition721 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleTransition743 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleTransition766 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTransition788 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleTransition803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19_in_ruleTransition821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_ruleEvent945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_ruleGuard1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1070 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_ruleAction1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_entryRuleCompositeString1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeString1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeString1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONDITION_in_ruleCompositeString1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleImport1330 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1442 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleQualifiedName1461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1476 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_22_in_ruleStateType1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleStateType1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStateType1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_synpred1_InternalStatemodel667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_synpred2_InternalStatemodel713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_synpred3_InternalStatemodel758 = new BitSet(new long[]{0x0000000000000002L});

}
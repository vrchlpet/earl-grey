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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'statemachine'", "'{'", "'}'", "'=>'", "'on'", "'import'", "'state'", "'initial'", "'final'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

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

                if ( (LA1_0==16) ) {
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

                if ( (LA2_0==11) ) {
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:134:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}' ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_state_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:137:28: ( (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:3: otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_state_3_0= ruleState ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStatemachine237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getStatemachineKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:142:1: ( (lv_name_1_0= ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:143:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:143:1: (lv_name_1_0= ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:144:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatemachineAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleStatemachine258);
            lv_name_1_0=ruleIdentifier();

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
                      		"Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:164:1: ( (lv_state_3_0= ruleState ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=19)) ) {
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStatemachine304); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:203:1: ruleState returns [EObject current=null] : ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( ( ( ruleGuard ) )=> (lv_transitions_3_0= ruleTransition ) )* otherlv_4= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_transitions_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:206:28: ( ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( ( ( ruleGuard ) )=> (lv_transitions_3_0= ruleTransition ) )* otherlv_4= '}' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:207:1: ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( ( ( ruleGuard ) )=> (lv_transitions_3_0= ruleTransition ) )* otherlv_4= '}' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:207:1: ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( ( ( ruleGuard ) )=> (lv_transitions_3_0= ruleTransition ) )* otherlv_4= '}' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:207:2: ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( ( ( ruleGuard ) )=> (lv_transitions_3_0= ruleTransition ) )* otherlv_4= '}'
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

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:225:2: ( (lv_name_1_0= ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:226:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:226:1: (lv_name_1_0= ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:227:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleState417);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStateRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleState429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:247:1: ( ( ( ruleGuard ) )=> (lv_transitions_3_0= ruleTransition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) && (synpred1_InternalStatemodel())) {
                    alt4=1;
                }
                else if ( (LA4_0==RULE_ID) && (synpred1_InternalStatemodel())) {
                    alt4=1;
                }
                else if ( (LA4_0==14) && (synpred1_InternalStatemodel())) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:247:2: ( ( ruleGuard ) )=> (lv_transitions_3_0= ruleTransition )
            	    {
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:252:1: (lv_transitions_3_0= ruleTransition )
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:253:3: lv_transitions_3_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState460);
            	    lv_transitions_3_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transitions",
            	              		lv_transitions_3_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleState473); if (state.failed) return current;
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


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:281:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:282:2: (iv_ruleTransition= ruleTransition EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:283:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition509);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition519); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:290:1: ruleTransition returns [EObject current=null] : ( ( ( ( ruleGuard ) )=> (lv_guard_0_0= ruleGuard ) )? ( ( ( ruleEvent ) )=> (lv_event_1_0= ruleEvent ) )? otherlv_2= '=>' ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_guard_0_0 = null;

        EObject lv_event_1_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:293:28: ( ( ( ( ( ruleGuard ) )=> (lv_guard_0_0= ruleGuard ) )? ( ( ( ruleEvent ) )=> (lv_event_1_0= ruleEvent ) )? otherlv_2= '=>' ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:294:1: ( ( ( ( ruleGuard ) )=> (lv_guard_0_0= ruleGuard ) )? ( ( ( ruleEvent ) )=> (lv_event_1_0= ruleEvent ) )? otherlv_2= '=>' ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:294:1: ( ( ( ( ruleGuard ) )=> (lv_guard_0_0= ruleGuard ) )? ( ( ( ruleEvent ) )=> (lv_event_1_0= ruleEvent ) )? otherlv_2= '=>' ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:294:2: ( ( ( ruleGuard ) )=> (lv_guard_0_0= ruleGuard ) )? ( ( ( ruleEvent ) )=> (lv_event_1_0= ruleEvent ) )? otherlv_2= '=>' ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:294:2: ( ( ( ruleGuard ) )=> (lv_guard_0_0= ruleGuard ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) && (synpred2_InternalStatemodel())) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:294:3: ( ( ruleGuard ) )=> (lv_guard_0_0= ruleGuard )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:299:1: (lv_guard_0_0= ruleGuard )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:300:3: lv_guard_0_0= ruleGuard
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGuard_in_ruleTransition575);
                    lv_guard_0_0=ruleGuard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		set(
                             			current, 
                             			"guard",
                              		lv_guard_0_0, 
                              		"Guard");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:316:3: ( ( ( ruleEvent ) )=> (lv_event_1_0= ruleEvent ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) && (synpred3_InternalStatemodel())) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:316:4: ( ( ruleEvent ) )=> (lv_event_1_0= ruleEvent )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:321:1: (lv_event_1_0= ruleEvent )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:322:3: lv_event_1_0= ruleEvent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEvent_in_ruleTransition607);
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
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTransition620); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:342:1: ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:342:2: ( ( ruleIdentifier ) )=> ( ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:347:1: ( ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:348:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getStateStateCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleTransition655);
            ruleIdentifier();

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:369:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:370:2: (iv_ruleEvent= ruleEvent EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:371:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent691);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent701); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:378:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:381:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:382:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:382:1: ( (lv_name_0_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:383:1: (lv_name_0_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:383:1: (lv_name_0_0= RULE_ID )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:384:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvent742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:408:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:409:2: (iv_ruleGuard= ruleGuard EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:410:2: iv_ruleGuard= ruleGuard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGuardRule()); 
            }
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard782);
            iv_ruleGuard=ruleGuard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGuard; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard792); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:417:1: ruleGuard returns [EObject current=null] : (otherlv_0= 'on' ( (lv_cond_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cond_1_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:420:28: ( (otherlv_0= 'on' ( (lv_cond_1_0= RULE_ID ) ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:421:1: (otherlv_0= 'on' ( (lv_cond_1_0= RULE_ID ) ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:421:1: (otherlv_0= 'on' ( (lv_cond_1_0= RULE_ID ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:421:3: otherlv_0= 'on' ( (lv_cond_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGuard829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGuardAccess().getOnKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:425:1: ( (lv_cond_1_0= RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:426:1: (lv_cond_1_0= RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:426:1: (lv_cond_1_0= RULE_ID )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:427:3: lv_cond_1_0= RULE_ID
            {
            lv_cond_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuard846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_cond_1_0, grammarAccess.getGuardAccess().getCondIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGuardRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"cond",
                      		lv_cond_1_0, 
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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:451:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:452:2: (iv_ruleImport= ruleImport EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport887);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport897); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:460:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:463:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:464:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:464:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:464:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleImport934); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:468:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:469:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:469:1: (lv_importURI_1_0= RULE_STRING )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:470:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport951); if (state.failed) return current;
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


    // $ANTLR start "entryRuleIdentifier"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:494:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:495:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:496:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier993);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier1004); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:503:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( RULE_ID )=>this_ID_0= RULE_ID ) | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:506:28: ( ( ( ( RULE_ID )=>this_ID_0= RULE_ID ) | this_STRING_1= RULE_STRING ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:507:1: ( ( ( RULE_ID )=>this_ID_0= RULE_ID ) | this_STRING_1= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:507:1: ( ( ( RULE_ID )=>this_ID_0= RULE_ID ) | this_STRING_1= RULE_STRING )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) && (synpred5_InternalStatemodel())) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:507:2: ( ( RULE_ID )=>this_ID_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:507:2: ( ( RULE_ID )=>this_ID_0= RULE_ID )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:507:3: ( RULE_ID )=>this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier1050); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:515:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentifier1077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "ruleStateType"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:532:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:534:28: ( ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:1: ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:1: ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:2: (enumLiteral_0= 'state' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:2: (enumLiteral_0= 'state' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:4: enumLiteral_0= 'state'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_17_in_ruleStateType1138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:541:6: (enumLiteral_1= 'initial' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:541:6: (enumLiteral_1= 'initial' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:541:8: enumLiteral_1= 'initial'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_18_in_ruleStateType1155); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:547:6: (enumLiteral_2= 'final' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:547:6: (enumLiteral_2= 'final' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:547:8: enumLiteral_2= 'final'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_19_in_ruleStateType1172); if (state.failed) return current;
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
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:247:2: ( ( ruleGuard ) )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:248:1: ( ruleGuard )
        {
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:248:1: ( ruleGuard )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:249:1: ruleGuard
        {
        pushFollow(FOLLOW_ruleGuard_in_synpred1_InternalStatemodel443);
        ruleGuard();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalStatemodel

    // $ANTLR start synpred2_InternalStatemodel
    public final void synpred2_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:294:3: ( ( ruleGuard ) )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:295:1: ( ruleGuard )
        {
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:295:1: ( ruleGuard )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:296:1: ruleGuard
        {
        pushFollow(FOLLOW_ruleGuard_in_synpred2_InternalStatemodel558);
        ruleGuard();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalStatemodel

    // $ANTLR start synpred3_InternalStatemodel
    public final void synpred3_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:316:4: ( ( ruleEvent ) )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:317:1: ( ruleEvent )
        {
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:317:1: ( ruleEvent )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:318:1: ruleEvent
        {
        pushFollow(FOLLOW_ruleEvent_in_synpred3_InternalStatemodel590);
        ruleEvent();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalStatemodel

    // $ANTLR start synpred5_InternalStatemodel
    public final void synpred5_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:507:3: ( RULE_ID )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:507:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred5_InternalStatemodel1041); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalStatemodel

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
    public final boolean synpred5_InternalStatemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalStatemodel_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleImport_in_ruleStatemodel131 = new BitSet(new long[]{0x0000000000010802L});
    public static final BitSet FOLLOW_ruleStatemachine_in_ruleStatemodel153 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStatemachine237 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleStatemachine258 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine270 = new BitSet(new long[]{0x00000000000E2000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine291 = new BitSet(new long[]{0x00000000000E2000L});
    public static final BitSet FOLLOW_13_in_ruleStatemachine304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState396 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleState417 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState429 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState460 = new BitSet(new long[]{0x000000000000E010L});
    public static final BitSet FOLLOW_13_in_ruleState473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleTransition575 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleTransition607 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransition620 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleTransition655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvent742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGuard829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuard846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleImport934 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentifier1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStateType1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleStateType1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStateType1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_synpred1_InternalStatemodel443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_synpred2_InternalStatemodel558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_synpred3_InternalStatemodel590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred5_InternalStatemodel1041 = new BitSet(new long[]{0x0000000000000002L});

}
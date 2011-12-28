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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CONDITION", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'statemachine'", "':'", "'{'", "'}'", "'=>'", "'goto'", "'.'", "'on'", "'if'", "'do'", "'import'", "'state'", "'initial'", "'final'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
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

                if ( (LA1_0==22) ) {
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:134:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_state_5_0= ruleState ) )* otherlv_6= '}' ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_state_5_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:137:28: ( (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_state_5_0= ruleState ) )* otherlv_6= '}' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_state_5_0= ruleState ) )* otherlv_6= '}' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:1: (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_state_5_0= ruleState ) )* otherlv_6= '}' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:138:3: otherlv_0= 'statemachine' ( (lv_name_1_0= ruleIdentifier ) ) ( ( ( ':' )=>otherlv_2= ':' ) ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_state_5_0= ruleState ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStatemachine237); if (state.failed) return current;
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

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:160:2: ( ( ( ':' )=>otherlv_2= ':' ) ( ( ruleQualifiedName ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) && (synpred1_InternalStatemodel())) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:160:3: ( ( ':' )=>otherlv_2= ':' ) ( ( ruleQualifiedName ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:160:3: ( ( ':' )=>otherlv_2= ':' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:160:4: ( ':' )=>otherlv_2= ':'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStatemachine279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStatemachineAccess().getColonKeyword_2_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:165:2: ( ( ruleQualifiedName ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:166:1: ( ruleQualifiedName )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:166:1: ( ruleQualifiedName )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:167:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatemachineRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatemachineAccess().getMappedEntityCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStatemachine303);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStatemachine317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:184:1: ( (lv_state_5_0= ruleState ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=23 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:185:1: (lv_state_5_0= ruleState )
            	    {
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:185:1: (lv_state_5_0= ruleState )
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:186:3: lv_state_5_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleStatemachine338);
            	    lv_state_5_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"state",
            	              		lv_state_5_0, 
            	              		"State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleStatemachine351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:214:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:215:2: (iv_ruleState= ruleState EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:216:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState387);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState397); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:223:1: ruleState returns [EObject current=null] : ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_element_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:226:28: ( ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:227:1: ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:227:1: ( ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:227:2: ( (lv_type_0_0= ruleStateType ) ) ( (lv_name_1_0= ruleIdentifier ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}'
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:227:2: ( (lv_type_0_0= ruleStateType ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:228:1: (lv_type_0_0= ruleStateType )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:228:1: (lv_type_0_0= ruleStateType )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:229:3: lv_type_0_0= ruleStateType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStateType_in_ruleState443);
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

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:245:2: ( (lv_name_1_0= ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:246:1: (lv_name_1_0= ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:246:1: (lv_name_1_0= ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:247:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStateAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleState464);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleState476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:267:1: ( (lv_element_3_0= ruleElement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_STRING)||(LA5_0>=16 && LA5_0<=17)||(LA5_0>=19 && LA5_0<=21)||(LA5_0>=23 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:268:1: (lv_element_3_0= ruleElement )
            	    {
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:268:1: (lv_element_3_0= ruleElement )
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:269:3: lv_element_3_0= ruleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getElementElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElement_in_ruleState497);
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
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleState510); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:297:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:298:2: (iv_ruleElement= ruleElement EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:299:2: iv_ruleElement= ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement546);
            iv_ruleElement=ruleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement556); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:306:1: ruleElement returns [EObject current=null] : (this_Transition_0= ruleTransition | this_State_1= ruleState ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Transition_0 = null;

        EObject this_State_1 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:309:28: ( (this_Transition_0= ruleTransition | this_State_1= ruleState ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:310:1: (this_Transition_0= ruleTransition | this_State_1= ruleState )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:310:1: (this_Transition_0= ruleTransition | this_State_1= ruleState )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)||(LA6_0>=16 && LA6_0<=17)||(LA6_0>=19 && LA6_0<=21)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=23 && LA6_0<=25)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:311:5: this_Transition_0= ruleTransition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getTransitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTransition_in_ruleElement603);
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
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:321:5: this_State_1= ruleState
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementAccess().getStateParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleState_in_ruleElement630);
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:337:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:338:2: (iv_ruleTransition= ruleTransition EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:339:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition665);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition675); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:346:1: ruleTransition returns [EObject current=null] : ( ( (lv_event_0_0= ruleEvent ) ) ( (lv_guard_1_0= ruleGuard ) ) ( (lv_action_2_0= ruleAction ) ) (otherlv_3= '=>' | otherlv_4= 'goto' ) ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_event_0_0 = null;

        EObject lv_guard_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:349:28: ( ( ( (lv_event_0_0= ruleEvent ) ) ( (lv_guard_1_0= ruleGuard ) ) ( (lv_action_2_0= ruleAction ) ) (otherlv_3= '=>' | otherlv_4= 'goto' ) ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:350:1: ( ( (lv_event_0_0= ruleEvent ) ) ( (lv_guard_1_0= ruleGuard ) ) ( (lv_action_2_0= ruleAction ) ) (otherlv_3= '=>' | otherlv_4= 'goto' ) ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:350:1: ( ( (lv_event_0_0= ruleEvent ) ) ( (lv_guard_1_0= ruleGuard ) ) ( (lv_action_2_0= ruleAction ) ) (otherlv_3= '=>' | otherlv_4= 'goto' ) ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:350:2: ( (lv_event_0_0= ruleEvent ) ) ( (lv_guard_1_0= ruleGuard ) ) ( (lv_action_2_0= ruleAction ) ) (otherlv_3= '=>' | otherlv_4= 'goto' ) ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:350:2: ( (lv_event_0_0= ruleEvent ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:351:1: (lv_event_0_0= ruleEvent )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:351:1: (lv_event_0_0= ruleEvent )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:352:3: lv_event_0_0= ruleEvent
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEvent_in_ruleTransition721);
            lv_event_0_0=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"event",
                      		lv_event_0_0, 
                      		"Event");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:368:2: ( (lv_guard_1_0= ruleGuard ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:369:1: (lv_guard_1_0= ruleGuard )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:369:1: (lv_guard_1_0= ruleGuard )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:370:3: lv_guard_1_0= ruleGuard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGuard_in_ruleTransition742);
            lv_guard_1_0=ruleGuard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"guard",
                      		lv_guard_1_0, 
                      		"Guard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:386:2: ( (lv_action_2_0= ruleAction ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:387:1: (lv_action_2_0= ruleAction )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:387:1: (lv_action_2_0= ruleAction )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:388:3: lv_action_2_0= ruleAction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAction_in_ruleTransition763);
            lv_action_2_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionRule());
              	        }
                     		set(
                     			current, 
                     			"action",
                      		lv_action_2_0, 
                      		"Action");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:404:2: (otherlv_3= '=>' | otherlv_4= 'goto' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
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
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:404:4: otherlv_3= '=>'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTransition776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:409:7: otherlv_4= 'goto'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTransition794); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getGotoKeyword_3_1());
                          
                    }

                    }
                    break;

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:413:2: ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:413:3: ( ( ruleIdentifier ) )=> ( ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:418:1: ( ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:419:3: ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionAccess().getStateStateCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdentifier_in_ruleTransition830);
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


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:440:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:441:2: (iv_ruleValue= ruleValue EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:442:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue866);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue876); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:449:1: ruleValue returns [EObject current=null] : ( ( ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= ruleCompositeString ) ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:452:28: ( ( ( ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= ruleCompositeString ) ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:1: ( ( ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= ruleCompositeString ) ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:1: ( ( ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) | ( (lv_value_3_0= ruleCompositeString ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==EOF||(LA8_1>=16 && LA8_1<=17)||(LA8_1>=20 && LA8_1<=21)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==18) && (synpred3_InternalStatemodel())) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_STRING) && (synpred3_InternalStatemodel())) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_CONDITION) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:2: ( ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:2: ( ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:3: ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:3: ( ( ( ruleIdentifier ) )=> ( ruleIdentifier ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:4: ( ( ruleIdentifier ) )=> ( ruleIdentifier )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:458:1: ( ruleIdentifier )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:459:3: ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getValueRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueAccess().getIdStatemachineCrossReference_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIdentifier_in_ruleValue937);
                    ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleValue949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getValueAccess().getFullStopKeyword_0_1());
                          
                    }
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:476:1: ( (otherlv_2= RULE_ID ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:477:1: (otherlv_2= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:477:1: (otherlv_2= RULE_ID )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:478:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getValueRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getValueAccess().getRefOperationCrossReference_0_2_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:490:6: ( (lv_value_3_0= ruleCompositeString ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:490:6: ( (lv_value_3_0= ruleCompositeString ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:491:1: (lv_value_3_0= ruleCompositeString )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:491:1: (lv_value_3_0= ruleCompositeString )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:492:3: lv_value_3_0= ruleCompositeString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueAccess().getValueCompositeStringParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCompositeString_in_ruleValue997);
                    lv_value_3_0=ruleCompositeString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValueRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"CompositeString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEvent"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:516:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:517:2: (iv_ruleEvent= ruleEvent EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:518:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1033);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1043); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:525:1: ruleEvent returns [EObject current=null] : ( () ( ( ( 'on' )=>otherlv_1= 'on' )? ( (lv_event_2_0= ruleValue ) ) )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_event_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:528:28: ( ( () ( ( ( 'on' )=>otherlv_1= 'on' )? ( (lv_event_2_0= ruleValue ) ) )? ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:529:1: ( () ( ( ( 'on' )=>otherlv_1= 'on' )? ( (lv_event_2_0= ruleValue ) ) )? )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:529:1: ( () ( ( ( 'on' )=>otherlv_1= 'on' )? ( (lv_event_2_0= ruleValue ) ) )? )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:529:2: () ( ( ( 'on' )=>otherlv_1= 'on' )? ( (lv_event_2_0= ruleValue ) ) )?
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:529:2: ()
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:530:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEventAccess().getEventAction_0(),
                          current);
                  
            }

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:2: ( ( ( 'on' )=>otherlv_1= 'on' )? ( (lv_event_2_0= ruleValue ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)||LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:3: ( ( 'on' )=>otherlv_1= 'on' )? ( (lv_event_2_0= ruleValue ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:3: ( ( 'on' )=>otherlv_1= 'on' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==19) && (synpred4_InternalStatemodel())) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:4: ( 'on' )=>otherlv_1= 'on'
                            {
                            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEvent1098); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getEventAccess().getOnKeyword_1_0());
                                  
                            }

                            }
                            break;

                    }

                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:540:3: ( (lv_event_2_0= ruleValue ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:541:1: (lv_event_2_0= ruleValue )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:541:1: (lv_event_2_0= ruleValue )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:542:3: lv_event_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEventAccess().getEventValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleEvent1121);
                    lv_event_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEventRule());
                      	        }
                             		set(
                             			current, 
                             			"event",
                              		lv_event_2_0, 
                              		"Value");
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGuard"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:566:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:567:2: (iv_ruleGuard= ruleGuard EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:568:2: iv_ruleGuard= ruleGuard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGuardRule()); 
            }
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard1159);
            iv_ruleGuard=ruleGuard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGuard; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard1169); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:575:1: ruleGuard returns [EObject current=null] : ( () ( ( ( 'if' )=>otherlv_1= 'if' ) ( (lv_guard_2_0= ruleValue ) ) )? ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_guard_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:578:28: ( ( () ( ( ( 'if' )=>otherlv_1= 'if' ) ( (lv_guard_2_0= ruleValue ) ) )? ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:579:1: ( () ( ( ( 'if' )=>otherlv_1= 'if' ) ( (lv_guard_2_0= ruleValue ) ) )? )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:579:1: ( () ( ( ( 'if' )=>otherlv_1= 'if' ) ( (lv_guard_2_0= ruleValue ) ) )? )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:579:2: () ( ( ( 'if' )=>otherlv_1= 'if' ) ( (lv_guard_2_0= ruleValue ) ) )?
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:579:2: ()
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:580:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGuardAccess().getGuardAction_0(),
                          current);
                  
            }

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:585:2: ( ( ( 'if' )=>otherlv_1= 'if' ) ( (lv_guard_2_0= ruleValue ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) && (synpred5_InternalStatemodel())) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:585:3: ( ( 'if' )=>otherlv_1= 'if' ) ( (lv_guard_2_0= ruleValue ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:585:3: ( ( 'if' )=>otherlv_1= 'if' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:585:4: ( 'if' )=>otherlv_1= 'if'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleGuard1224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getGuardAccess().getIfKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:590:2: ( (lv_guard_2_0= ruleValue ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:591:1: (lv_guard_2_0= ruleValue )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:591:1: (lv_guard_2_0= ruleValue )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:592:3: lv_guard_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGuardAccess().getGuardValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleGuard1246);
                    lv_guard_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGuardRule());
                      	        }
                             		set(
                             			current, 
                             			"guard",
                              		lv_guard_2_0, 
                              		"Value");
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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleAction"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:616:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:617:2: (iv_ruleAction= ruleAction EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:618:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1284);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1294); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:625:1: ruleAction returns [EObject current=null] : ( () ( ( ( 'do' )=>otherlv_1= 'do' ) ( (lv_action_2_0= ruleValue ) ) )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:628:28: ( ( () ( ( ( 'do' )=>otherlv_1= 'do' ) ( (lv_action_2_0= ruleValue ) ) )? ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:629:1: ( () ( ( ( 'do' )=>otherlv_1= 'do' ) ( (lv_action_2_0= ruleValue ) ) )? )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:629:1: ( () ( ( ( 'do' )=>otherlv_1= 'do' ) ( (lv_action_2_0= ruleValue ) ) )? )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:629:2: () ( ( ( 'do' )=>otherlv_1= 'do' ) ( (lv_action_2_0= ruleValue ) ) )?
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:629:2: ()
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:630:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getActionAccess().getActionAction_0(),
                          current);
                  
            }

            }

            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:635:2: ( ( ( 'do' )=>otherlv_1= 'do' ) ( (lv_action_2_0= ruleValue ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) && (synpred6_InternalStatemodel())) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:635:3: ( ( 'do' )=>otherlv_1= 'do' ) ( (lv_action_2_0= ruleValue ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:635:3: ( ( 'do' )=>otherlv_1= 'do' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:635:4: ( 'do' )=>otherlv_1= 'do'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleAction1349); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getActionAccess().getDoKeyword_1_0());
                          
                    }

                    }

                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:640:2: ( (lv_action_2_0= ruleValue ) )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:641:1: (lv_action_2_0= ruleValue )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:641:1: (lv_action_2_0= ruleValue )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:642:3: lv_action_2_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getActionAccess().getActionValueParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAction1371);
                    lv_action_2_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getActionRule());
                      	        }
                             		set(
                             			current, 
                             			"action",
                              		lv_action_2_0, 
                              		"Value");
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCompositeString"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:666:1: entryRuleCompositeString returns [String current=null] : iv_ruleCompositeString= ruleCompositeString EOF ;
    public final String entryRuleCompositeString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompositeString = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:667:2: (iv_ruleCompositeString= ruleCompositeString EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:668:2: iv_ruleCompositeString= ruleCompositeString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeStringRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeString_in_entryRuleCompositeString1410);
            iv_ruleCompositeString=ruleCompositeString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeString1421); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:675:1: ruleCompositeString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_CONDITION_1= RULE_CONDITION ) ;
    public final AntlrDatatypeRuleToken ruleCompositeString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_CONDITION_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:678:28: ( (this_ID_0= RULE_ID | this_CONDITION_1= RULE_CONDITION ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:679:1: (this_ID_0= RULE_ID | this_CONDITION_1= RULE_CONDITION )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:679:1: (this_ID_0= RULE_ID | this_CONDITION_1= RULE_CONDITION )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_CONDITION) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:679:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeString1461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getCompositeStringAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:687:10: this_CONDITION_1= RULE_CONDITION
                    {
                    this_CONDITION_1=(Token)match(input,RULE_CONDITION,FOLLOW_RULE_CONDITION_in_ruleCompositeString1487); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:702:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:703:2: (iv_ruleImport= ruleImport EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:704:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport1532);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport1542); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:711:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:714:28: ( (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:715:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:715:1: (otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:715:3: otherlv_0= 'import' ( (lv_importURI_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleImport1579); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:719:1: ( (lv_importURI_1_0= RULE_STRING ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:720:1: (lv_importURI_1_0= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:720:1: (lv_importURI_1_0= RULE_STRING )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:721:3: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImport1596); if (state.failed) return current;
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:745:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:746:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:747:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier1638);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier1649); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:754:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( ( RULE_ID )=>this_ID_0= RULE_ID ) | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:757:28: ( ( ( ( RULE_ID )=>this_ID_0= RULE_ID ) | this_STRING_1= RULE_STRING ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:758:1: ( ( ( RULE_ID )=>this_ID_0= RULE_ID ) | this_STRING_1= RULE_STRING )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:758:1: ( ( ( RULE_ID )=>this_ID_0= RULE_ID ) | this_STRING_1= RULE_STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) && (synpred7_InternalStatemodel())) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:758:2: ( ( RULE_ID )=>this_ID_0= RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:758:2: ( ( RULE_ID )=>this_ID_0= RULE_ID )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:758:3: ( RULE_ID )=>this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdentifier1695); if (state.failed) return current;
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
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:766:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIdentifier1722); if (state.failed) return current;
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:781:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:782:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:783:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1768);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1779); if (state.failed) return current;

            }

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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:790:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:793:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:794:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:794:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:794:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1819); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:801:1: (kw= '.' this_ID_2= RULE_ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:802:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_18_in_ruleQualifiedName1838); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1853); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:822:1: ruleStateType returns [Enumerator current=null] : ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) ) ;
    public final Enumerator ruleStateType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:824:28: ( ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) ) )
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:825:1: ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) )
            {
            // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:825:1: ( (enumLiteral_0= 'state' ) | (enumLiteral_1= 'initial' ) | (enumLiteral_2= 'final' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt16=1;
                }
                break;
            case 24:
                {
                alt16=2;
                }
                break;
            case 25:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:825:2: (enumLiteral_0= 'state' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:825:2: (enumLiteral_0= 'state' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:825:4: enumLiteral_0= 'state'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_23_in_ruleStateType1914); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:831:6: (enumLiteral_1= 'initial' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:831:6: (enumLiteral_1= 'initial' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:831:8: enumLiteral_1= 'initial'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_24_in_ruleStateType1931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:837:6: (enumLiteral_2= 'final' )
                    {
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:837:6: (enumLiteral_2= 'final' )
                    // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:837:8: enumLiteral_2= 'final'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_25_in_ruleStateType1948); if (state.failed) return current;
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
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:160:4: ( ':' )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:160:6: ':'
        {
        match(input,13,FOLLOW_13_in_synpred1_InternalStatemodel271); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalStatemodel

    // $ANTLR start synpred3_InternalStatemodel
    public final void synpred3_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:453:4: ( ( ruleIdentifier ) )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:454:1: ( ruleIdentifier )
        {
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:454:1: ( ruleIdentifier )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:455:3: ruleIdentifier
        {
        pushFollow(FOLLOW_ruleIdentifier_in_synpred3_InternalStatemodel918);
        ruleIdentifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalStatemodel

    // $ANTLR start synpred4_InternalStatemodel
    public final void synpred4_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:4: ( 'on' )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:535:6: 'on'
        {
        match(input,19,FOLLOW_19_in_synpred4_InternalStatemodel1090); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalStatemodel

    // $ANTLR start synpred5_InternalStatemodel
    public final void synpred5_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:585:4: ( 'if' )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:585:6: 'if'
        {
        match(input,20,FOLLOW_20_in_synpred5_InternalStatemodel1216); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalStatemodel

    // $ANTLR start synpred6_InternalStatemodel
    public final void synpred6_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:635:4: ( 'do' )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:635:6: 'do'
        {
        match(input,21,FOLLOW_21_in_synpred6_InternalStatemodel1341); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalStatemodel

    // $ANTLR start synpred7_InternalStatemodel
    public final void synpred7_InternalStatemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:758:3: ( RULE_ID )
        // ../cz.cvut.earlgrey.statemodel/src-gen/cz/cvut/earlgrey/statemodel/parser/antlr/internal/InternalStatemodel.g:758:5: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred7_InternalStatemodel1686); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalStatemodel

    // Delegated rules

    public final boolean synpred7_InternalStatemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalStatemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalStatemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalStatemodel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred4_InternalStatemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalStatemodel_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleImport_in_ruleStatemodel131 = new BitSet(new long[]{0x0000000000401002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_ruleStatemodel153 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStatemachine237 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleStatemachine258 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleStatemachine279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStatemachine303 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStatemachine317 = new BitSet(new long[]{0x0000000003808000L});
    public static final BitSet FOLLOW_ruleState_in_ruleStatemachine338 = new BitSet(new long[]{0x0000000003808000L});
    public static final BitSet FOLLOW_15_in_ruleStatemachine351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_ruleState443 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleState464 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState476 = new BitSet(new long[]{0x0000000003BB8070L});
    public static final BitSet FOLLOW_ruleElement_in_ruleState497 = new BitSet(new long[]{0x0000000003BB8070L});
    public static final BitSet FOLLOW_15_in_ruleState510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleElement603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_ruleElement630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleTransition721 = new BitSet(new long[]{0x0000000000330000L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleTransition742 = new BitSet(new long[]{0x0000000000230000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleTransition763 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleTransition776 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_17_in_ruleTransition794 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleTransition830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_ruleValue937 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleValue949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_ruleValue997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEvent1098 = new BitSet(new long[]{0x0000000000080070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleEvent1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard1159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleGuard1224 = new BitSet(new long[]{0x0000000000080070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleGuard1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1284 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAction1349 = new BitSet(new long[]{0x0000000000080070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAction1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_entryRuleCompositeString1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeString1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeString1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONDITION_in_ruleCompositeString1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleImport1579 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImport1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdentifier1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIdentifier1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1819 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_ruleQualifiedName1838 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1853 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_23_in_ruleStateType1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStateType1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleStateType1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred1_InternalStatemodel271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_synpred3_InternalStatemodel918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred4_InternalStatemodel1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_synpred5_InternalStatemodel1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_synpred6_InternalStatemodel1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred7_InternalStatemodel1686 = new BitSet(new long[]{0x0000000000000002L});

}
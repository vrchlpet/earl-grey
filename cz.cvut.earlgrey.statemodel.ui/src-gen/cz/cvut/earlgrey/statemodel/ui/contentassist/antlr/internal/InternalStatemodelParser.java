package cz.cvut.earlgrey.statemodel.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import cz.cvut.earlgrey.statemodel.services.StatemodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalStatemodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CONDITION", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=>'", "'goto'", "'state'", "'initial'", "'final'", "'statemachine'", "'{'", "'}'", "':'", "'.'", "'on'", "'if'", "'do'", "'import'"
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
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g"; }


     
     	private StatemodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(StatemodelGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStatemodel"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:61:1: entryRuleStatemodel : ruleStatemodel EOF ;
    public final void entryRuleStatemodel() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:62:1: ( ruleStatemodel EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:63:1: ruleStatemodel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelRule()); 
            }
            pushFollow(FOLLOW_ruleStatemodel_in_entryRuleStatemodel67);
            ruleStatemodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemodelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemodel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatemodel"


    // $ANTLR start "ruleStatemodel"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:70:1: ruleStatemodel : ( ( rule__Statemodel__Group__0 ) ) ;
    public final void ruleStatemodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:74:2: ( ( ( rule__Statemodel__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:75:1: ( ( rule__Statemodel__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:75:1: ( ( rule__Statemodel__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:76:1: ( rule__Statemodel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:77:1: ( rule__Statemodel__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:77:2: rule__Statemodel__Group__0
            {
            pushFollow(FOLLOW_rule__Statemodel__Group__0_in_ruleStatemodel100);
            rule__Statemodel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemodelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemodel"


    // $ANTLR start "entryRuleStatemachine"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:89:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:90:1: ( ruleStatemachine EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:91:1: ruleStatemachine EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineRule()); 
            }
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine127);
            ruleStatemachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:98:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:102:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:103:1: ( ( rule__Statemachine__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:103:1: ( ( rule__Statemachine__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:104:1: ( rule__Statemachine__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:105:1: ( rule__Statemachine__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:105:2: rule__Statemachine__Group__0
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine160);
            rule__Statemachine__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleState"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:117:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:118:1: ( ruleState EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:119:1: ruleState EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState187);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:126:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:130:2: ( ( ( rule__State__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:131:1: ( ( rule__State__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:131:1: ( ( rule__State__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:132:1: ( rule__State__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:133:1: ( rule__State__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:133:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState220);
            rule__State__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleElement"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:145:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:146:1: ( ruleElement EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:147:1: ruleElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementRule()); 
            }
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement247);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:154:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:158:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:159:1: ( ( rule__Element__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:159:1: ( ( rule__Element__Alternatives ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:160:1: ( rule__Element__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getElementAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:161:1: ( rule__Element__Alternatives )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:161:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement280);
            rule__Element__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:173:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:174:1: ( ruleTransition EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:175:1: ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition307);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:182:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:186:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:187:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:187:1: ( ( rule__Transition__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:188:1: ( rule__Transition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:189:1: ( rule__Transition__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:189:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition340);
            rule__Transition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:201:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:202:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:203:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue367);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:210:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:214:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:215:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:215:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:216:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:217:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:217:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue400);
            rule__Value__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleEvent"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:229:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:230:1: ( ruleEvent EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:231:1: ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent427);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:238:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:242:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:243:1: ( ( rule__Event__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:243:1: ( ( rule__Event__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:244:1: ( rule__Event__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:245:1: ( rule__Event__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:245:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent460);
            rule__Event__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleGuard"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:257:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:258:1: ( ruleGuard EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:259:1: ruleGuard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardRule()); 
            }
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard487);
            ruleGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:266:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:270:2: ( ( ( rule__Guard__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:271:1: ( ( rule__Guard__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:271:1: ( ( rule__Guard__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:272:1: ( rule__Guard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:273:1: ( rule__Guard__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:273:2: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_rule__Guard__Group__0_in_ruleGuard520);
            rule__Guard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleAction"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:285:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:286:1: ( ruleAction EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:287:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction547);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:294:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:298:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:299:1: ( ( rule__Action__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:299:1: ( ( rule__Action__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:300:1: ( rule__Action__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:301:1: ( rule__Action__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:301:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction580);
            rule__Action__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCompositeString"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:313:1: entryRuleCompositeString : ruleCompositeString EOF ;
    public final void entryRuleCompositeString() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:314:1: ( ruleCompositeString EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:315:1: ruleCompositeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeStringRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeString_in_entryRuleCompositeString607);
            ruleCompositeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeString614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeString"


    // $ANTLR start "ruleCompositeString"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:322:1: ruleCompositeString : ( ( rule__CompositeString__Alternatives ) ) ;
    public final void ruleCompositeString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:326:2: ( ( ( rule__CompositeString__Alternatives ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:327:1: ( ( rule__CompositeString__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:327:1: ( ( rule__CompositeString__Alternatives ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:328:1: ( rule__CompositeString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeStringAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:329:1: ( rule__CompositeString__Alternatives )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:329:2: rule__CompositeString__Alternatives
            {
            pushFollow(FOLLOW_rule__CompositeString__Alternatives_in_ruleCompositeString640);
            rule__CompositeString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeString"


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:341:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:342:1: ( ruleImport EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:343:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport667);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:350:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:354:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:355:1: ( ( rule__Import__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:355:1: ( ( rule__Import__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:356:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:357:1: ( rule__Import__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:357:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport700);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleIdentifier"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:369:1: entryRuleIdentifier : ruleIdentifier EOF ;
    public final void entryRuleIdentifier() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:370:1: ( ruleIdentifier EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:371:1: ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_entryRuleIdentifier727);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdentifier734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:378:1: ruleIdentifier : ( ( rule__Identifier__Alternatives ) ) ;
    public final void ruleIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:382:2: ( ( ( rule__Identifier__Alternatives ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:383:1: ( ( rule__Identifier__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:383:1: ( ( rule__Identifier__Alternatives ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:384:1: ( rule__Identifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIdentifierAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:385:1: ( rule__Identifier__Alternatives )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:385:2: rule__Identifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier760);
            rule__Identifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIdentifierAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:397:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:398:1: ( ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:399:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName787);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:406:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:410:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:411:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:411:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:412:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:413:1: ( rule__QualifiedName__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:413:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName820);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleStateType"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:426:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:430:1: ( ( ( rule__StateType__Alternatives ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:431:1: ( ( rule__StateType__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:431:1: ( ( rule__StateType__Alternatives ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:432:1: ( rule__StateType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:433:1: ( rule__StateType__Alternatives )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:433:2: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_rule__StateType__Alternatives_in_ruleStateType857);
            rule__StateType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateType"


    // $ANTLR start "rule__Element__Alternatives"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:444:1: rule__Element__Alternatives : ( ( ruleTransition ) | ( ruleState ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:448:1: ( ( ruleTransition ) | ( ruleState ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EOF||(LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||(LA1_0>=12 && LA1_0<=13)||(LA1_0>=22 && LA1_0<=24)) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:449:1: ( ruleTransition )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:449:1: ( ruleTransition )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:450:1: ruleTransition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTransitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTransition_in_rule__Element__Alternatives892);
                    ruleTransition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getTransitionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:455:6: ( ruleState )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:455:6: ( ruleState )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:456:1: ruleState
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getStateParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleState_in_rule__Element__Alternatives909);
                    ruleState();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getElementAccess().getStateParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Transition__Alternatives_3"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:466:1: rule__Transition__Alternatives_3 : ( ( '=>' ) | ( 'goto' ) );
    public final void rule__Transition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:470:1: ( ( '=>' ) | ( 'goto' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:471:1: ( '=>' )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:471:1: ( '=>' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:472:1: '=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Transition__Alternatives_3942); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:479:6: ( 'goto' )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:479:6: ( 'goto' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:480:1: 'goto'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getGotoKeyword_3_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Transition__Alternatives_3962); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getGotoKeyword_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Alternatives_3"


    // $ANTLR start "rule__Value__Alternatives"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:492:1: rule__Value__Alternatives : ( ( ( rule__Value__Group_0__0 ) ) | ( ( rule__Value__ValueAssignment_1 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:496:1: ( ( ( rule__Value__Group_0__0 ) ) | ( ( rule__Value__ValueAssignment_1 ) ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EOF||(LA3_1>=12 && LA3_1<=13)||(LA3_1>=23 && LA3_1<=24)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==21) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt3=1;
                }
                break;
            case RULE_CONDITION:
                {
                alt3=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:497:1: ( ( rule__Value__Group_0__0 ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:497:1: ( ( rule__Value__Group_0__0 ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:498:1: ( rule__Value__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getGroup_0()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:499:1: ( rule__Value__Group_0__0 )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:499:2: rule__Value__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Value__Group_0__0_in_rule__Value__Alternatives996);
                    rule__Value__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:503:6: ( ( rule__Value__ValueAssignment_1 ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:503:6: ( ( rule__Value__ValueAssignment_1 ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:504:1: ( rule__Value__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getValueAssignment_1()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:505:1: ( rule__Value__ValueAssignment_1 )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:505:2: rule__Value__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Value__ValueAssignment_1_in_rule__Value__Alternatives1014);
                    rule__Value__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getValueAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__CompositeString__Alternatives"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:514:1: rule__CompositeString__Alternatives : ( ( RULE_ID ) | ( RULE_CONDITION ) );
    public final void rule__CompositeString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:518:1: ( ( RULE_ID ) | ( RULE_CONDITION ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_CONDITION) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:519:1: ( RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:519:1: ( RULE_ID )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:520:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeStringAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompositeString__Alternatives1047); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompositeStringAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:525:6: ( RULE_CONDITION )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:525:6: ( RULE_CONDITION )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:526:1: RULE_CONDITION
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeStringAccess().getCONDITIONTerminalRuleCall_1()); 
                    }
                    match(input,RULE_CONDITION,FOLLOW_RULE_CONDITION_in_rule__CompositeString__Alternatives1064); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompositeStringAccess().getCONDITIONTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeString__Alternatives"


    // $ANTLR start "rule__Identifier__Alternatives"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:536:1: rule__Identifier__Alternatives : ( ( ( RULE_ID ) ) | ( RULE_STRING ) );
    public final void rule__Identifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:540:1: ( ( ( RULE_ID ) ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:541:1: ( ( RULE_ID ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:541:1: ( ( RULE_ID ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:542:1: ( RULE_ID )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:543:1: ( RULE_ID )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:543:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Identifier__Alternatives1097); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:547:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:547:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:548:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives1115); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIdentifierAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Identifier__Alternatives"


    // $ANTLR start "rule__StateType__Alternatives"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:558:1: rule__StateType__Alternatives : ( ( ( 'state' ) ) | ( ( 'initial' ) ) | ( ( 'final' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:562:1: ( ( ( 'state' ) ) | ( ( 'initial' ) ) | ( ( 'final' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:563:1: ( ( 'state' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:563:1: ( ( 'state' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:564:1: ( 'state' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:565:1: ( 'state' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:565:3: 'state'
                    {
                    match(input,14,FOLLOW_14_in_rule__StateType__Alternatives1148); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:570:6: ( ( 'initial' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:570:6: ( ( 'initial' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:571:1: ( 'initial' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:572:1: ( 'initial' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:572:3: 'initial'
                    {
                    match(input,15,FOLLOW_15_in_rule__StateType__Alternatives1169); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:577:6: ( ( 'final' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:577:6: ( ( 'final' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:578:1: ( 'final' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getFINALEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:579:1: ( 'final' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:579:3: 'final'
                    {
                    match(input,16,FOLLOW_16_in_rule__StateType__Alternatives1190); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getFINALEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateType__Alternatives"


    // $ANTLR start "rule__Statemodel__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:591:1: rule__Statemodel__Group__0 : rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1 ;
    public final void rule__Statemodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:595:1: ( rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:596:2: rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1
            {
            pushFollow(FOLLOW_rule__Statemodel__Group__0__Impl_in_rule__Statemodel__Group__01223);
            rule__Statemodel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemodel__Group__1_in_rule__Statemodel__Group__01226);
            rule__Statemodel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemodel__Group__0"


    // $ANTLR start "rule__Statemodel__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:603:1: rule__Statemodel__Group__0__Impl : ( ( rule__Statemodel__ImportsAssignment_0 )* ) ;
    public final void rule__Statemodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:607:1: ( ( ( rule__Statemodel__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:608:1: ( ( rule__Statemodel__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:608:1: ( ( rule__Statemodel__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:609:1: ( rule__Statemodel__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:610:1: ( rule__Statemodel__ImportsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:610:2: rule__Statemodel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Statemodel__ImportsAssignment_0_in_rule__Statemodel__Group__0__Impl1253);
            	    rule__Statemodel__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemodelAccess().getImportsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemodel__Group__0__Impl"


    // $ANTLR start "rule__Statemodel__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:620:1: rule__Statemodel__Group__1 : rule__Statemodel__Group__1__Impl ;
    public final void rule__Statemodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:624:1: ( rule__Statemodel__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:625:2: rule__Statemodel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statemodel__Group__1__Impl_in_rule__Statemodel__Group__11284);
            rule__Statemodel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemodel__Group__1"


    // $ANTLR start "rule__Statemodel__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:631:1: rule__Statemodel__Group__1__Impl : ( ( rule__Statemodel__StatemachineAssignment_1 )* ) ;
    public final void rule__Statemodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:635:1: ( ( ( rule__Statemodel__StatemachineAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:636:1: ( ( rule__Statemodel__StatemachineAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:636:1: ( ( rule__Statemodel__StatemachineAssignment_1 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:637:1: ( rule__Statemodel__StatemachineAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getStatemachineAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:638:1: ( rule__Statemodel__StatemachineAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:638:2: rule__Statemodel__StatemachineAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemodel__StatemachineAssignment_1_in_rule__Statemodel__Group__1__Impl1311);
            	    rule__Statemodel__StatemachineAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemodelAccess().getStatemachineAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemodel__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:652:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:656:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:657:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__01346);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__01349);
            rule__Statemachine__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0"


    // $ANTLR start "rule__Statemachine__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:664:1: rule__Statemachine__Group__0__Impl : ( 'statemachine' ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:668:1: ( ( 'statemachine' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:669:1: ( 'statemachine' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:669:1: ( 'statemachine' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:670:1: 'statemachine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Statemachine__Group__0__Impl1377); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0__Impl"


    // $ANTLR start "rule__Statemachine__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:683:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:687:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:688:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__11408);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__11411);
            rule__Statemachine__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1"


    // $ANTLR start "rule__Statemachine__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:695:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__NameAssignment_1 ) ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:699:1: ( ( ( rule__Statemachine__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:700:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:700:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:701:1: ( rule__Statemachine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:702:1: ( rule__Statemachine__NameAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:702:2: rule__Statemachine__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl1438);
            rule__Statemachine__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__2"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:712:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:716:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:717:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21468);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21471);
            rule__Statemachine__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2"


    // $ANTLR start "rule__Statemachine__Group__2__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:724:1: rule__Statemachine__Group__2__Impl : ( ( rule__Statemachine__Group_2__0 )? ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:728:1: ( ( ( rule__Statemachine__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:729:1: ( ( rule__Statemachine__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:729:1: ( ( rule__Statemachine__Group_2__0 )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:730:1: ( rule__Statemachine__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:731:1: ( rule__Statemachine__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:731:2: rule__Statemachine__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl1498);
                    rule__Statemachine__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__Group__3"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:741:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:745:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:746:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31529);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31532);
            rule__Statemachine__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3"


    // $ANTLR start "rule__Statemachine__Group__3__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:753:1: rule__Statemachine__Group__3__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:757:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:758:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:758:1: ( '{' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:759:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,18,FOLLOW_18_in_rule__Statemachine__Group__3__Impl1560); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3__Impl"


    // $ANTLR start "rule__Statemachine__Group__4"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:772:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:776:1: ( rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:777:2: rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41591);
            rule__Statemachine__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41594);
            rule__Statemachine__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4"


    // $ANTLR start "rule__Statemachine__Group__4__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:784:1: rule__Statemachine__Group__4__Impl : ( ( rule__Statemachine__StateAssignment_4 )* ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:788:1: ( ( ( rule__Statemachine__StateAssignment_4 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:789:1: ( ( rule__Statemachine__StateAssignment_4 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:789:1: ( ( rule__Statemachine__StateAssignment_4 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:790:1: ( rule__Statemachine__StateAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getStateAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:791:1: ( rule__Statemachine__StateAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=14 && LA10_0<=16)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:791:2: rule__Statemachine__StateAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__StateAssignment_4_in_rule__Statemachine__Group__4__Impl1621);
            	    rule__Statemachine__StateAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getStateAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4__Impl"


    // $ANTLR start "rule__Statemachine__Group__5"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:801:1: rule__Statemachine__Group__5 : rule__Statemachine__Group__5__Impl ;
    public final void rule__Statemachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:805:1: ( rule__Statemachine__Group__5__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:806:2: rule__Statemachine__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51652);
            rule__Statemachine__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5"


    // $ANTLR start "rule__Statemachine__Group__5__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:812:1: rule__Statemachine__Group__5__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:816:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:817:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:817:1: ( '}' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:818:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,19,FOLLOW_19_in_rule__Statemachine__Group__5__Impl1680); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:843:1: rule__Statemachine__Group_2__0 : rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 ;
    public final void rule__Statemachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:847:1: ( rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:848:2: rule__Statemachine__Group_2__0__Impl rule__Statemachine__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__01723);
            rule__Statemachine__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__01726);
            rule__Statemachine__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__0"


    // $ANTLR start "rule__Statemachine__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:855:1: rule__Statemachine__Group_2__0__Impl : ( ( ':' ) ) ;
    public final void rule__Statemachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:859:1: ( ( ( ':' ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:860:1: ( ( ':' ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:860:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:861:1: ( ':' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getColonKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:862:1: ( ':' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:863:2: ':'
            {
            match(input,20,FOLLOW_20_in_rule__Statemachine__Group_2__0__Impl1755); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getColonKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_2__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:874:1: rule__Statemachine__Group_2__1 : rule__Statemachine__Group_2__1__Impl ;
    public final void rule__Statemachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:878:1: ( rule__Statemachine__Group_2__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:879:2: rule__Statemachine__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11787);
            rule__Statemachine__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__1"


    // $ANTLR start "rule__Statemachine__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:885:1: rule__Statemachine__Group_2__1__Impl : ( ( rule__Statemachine__MappedAssignment_2_1 ) ) ;
    public final void rule__Statemachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:889:1: ( ( ( rule__Statemachine__MappedAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:890:1: ( ( rule__Statemachine__MappedAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:890:1: ( ( rule__Statemachine__MappedAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:891:1: ( rule__Statemachine__MappedAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getMappedAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:892:1: ( rule__Statemachine__MappedAssignment_2_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:892:2: rule__Statemachine__MappedAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Statemachine__MappedAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1814);
            rule__Statemachine__MappedAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getMappedAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_2__1__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:906:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:910:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:911:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01848);
            rule__State__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01851);
            rule__State__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:918:1: rule__State__Group__0__Impl : ( ( rule__State__TypeAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:922:1: ( ( ( rule__State__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:923:1: ( ( rule__State__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:923:1: ( ( rule__State__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:924:1: ( rule__State__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:925:1: ( rule__State__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:925:2: rule__State__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__State__TypeAssignment_0_in_rule__State__Group__0__Impl1878);
            rule__State__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:935:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:939:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:940:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11908);
            rule__State__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11911);
            rule__State__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:947:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:951:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:952:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:952:1: ( ( rule__State__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:953:1: ( rule__State__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:954:1: ( rule__State__NameAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:954:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1938);
            rule__State__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:964:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:968:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:969:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21968);
            rule__State__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21971);
            rule__State__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:976:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:980:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:981:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:981:1: ( '{' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:982:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__State__Group__2__Impl1999); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:995:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:999:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1000:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__32030);
            rule__State__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__32033);
            rule__State__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1007:1: rule__State__Group__3__Impl : ( ( rule__State__ElementAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1011:1: ( ( ( rule__State__ElementAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1012:1: ( ( rule__State__ElementAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1012:1: ( ( rule__State__ElementAssignment_3 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1013:1: ( rule__State__ElementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getElementAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1014:1: ( rule__State__ElementAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==EOF||(LA11_0>=RULE_ID && LA11_0<=RULE_STRING)||(LA11_0>=12 && LA11_0<=16)||(LA11_0>=22 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1014:2: rule__State__ElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__ElementAssignment_3_in_rule__State__Group__3__Impl2060);
            	    rule__State__ElementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getElementAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__State__Group__4"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1024:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1028:1: ( rule__State__Group__4__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1029:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__42091);
            rule__State__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4"


    // $ANTLR start "rule__State__Group__4__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1035:1: rule__State__Group__4__Impl : ( '}' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1039:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1040:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1040:1: ( '}' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1041:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_19_in_rule__State__Group__4__Impl2119); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1064:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1068:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1069:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02160);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02163);
            rule__Transition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1076:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__EventAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1080:1: ( ( ( rule__Transition__EventAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1081:1: ( ( rule__Transition__EventAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1081:1: ( ( rule__Transition__EventAssignment_0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1082:1: ( rule__Transition__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEventAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1083:1: ( rule__Transition__EventAssignment_0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1083:2: rule__Transition__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl2190);
            rule__Transition__EventAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEventAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1093:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1097:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1098:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12220);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12223);
            rule__Transition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1105:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__GuardAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1109:1: ( ( ( rule__Transition__GuardAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1110:1: ( ( rule__Transition__GuardAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1110:1: ( ( rule__Transition__GuardAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1111:1: ( rule__Transition__GuardAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1112:1: ( rule__Transition__GuardAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1112:2: rule__Transition__GuardAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__GuardAssignment_1_in_rule__Transition__Group__1__Impl2250);
            rule__Transition__GuardAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGuardAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1122:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1126:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1127:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22280);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22283);
            rule__Transition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1134:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__ActionAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1138:1: ( ( ( rule__Transition__ActionAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1139:1: ( ( rule__Transition__ActionAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1139:1: ( ( rule__Transition__ActionAssignment_2 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1140:1: ( rule__Transition__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1141:1: ( rule__Transition__ActionAssignment_2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1141:2: rule__Transition__ActionAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__ActionAssignment_2_in_rule__Transition__Group__2__Impl2310);
            rule__Transition__ActionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getActionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1151:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1155:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1156:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32340);
            rule__Transition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32343);
            rule__Transition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1163:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Alternatives_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1167:1: ( ( ( rule__Transition__Alternatives_3 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1168:1: ( ( rule__Transition__Alternatives_3 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1168:1: ( ( rule__Transition__Alternatives_3 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1169:1: ( rule__Transition__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getAlternatives_3()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1170:1: ( rule__Transition__Alternatives_3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1170:2: rule__Transition__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_3_in_rule__Transition__Group__3__Impl2370);
            rule__Transition__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1180:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1184:1: ( rule__Transition__Group__4__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1185:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42400);
            rule__Transition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1191:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__StateAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1195:1: ( ( ( rule__Transition__StateAssignment_4 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1196:1: ( ( rule__Transition__StateAssignment_4 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1196:1: ( ( rule__Transition__StateAssignment_4 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1197:1: ( rule__Transition__StateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStateAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1198:1: ( rule__Transition__StateAssignment_4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1198:2: rule__Transition__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_4_in_rule__Transition__Group__4__Impl2427);
            rule__Transition__StateAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getStateAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Value__Group_0__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1218:1: rule__Value__Group_0__0 : rule__Value__Group_0__0__Impl rule__Value__Group_0__1 ;
    public final void rule__Value__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1222:1: ( rule__Value__Group_0__0__Impl rule__Value__Group_0__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1223:2: rule__Value__Group_0__0__Impl rule__Value__Group_0__1
            {
            pushFollow(FOLLOW_rule__Value__Group_0__0__Impl_in_rule__Value__Group_0__02467);
            rule__Value__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Value__Group_0__1_in_rule__Value__Group_0__02470);
            rule__Value__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__0"


    // $ANTLR start "rule__Value__Group_0__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1230:1: rule__Value__Group_0__0__Impl : ( ( rule__Value__IdAssignment_0_0 ) ) ;
    public final void rule__Value__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1234:1: ( ( ( rule__Value__IdAssignment_0_0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1235:1: ( ( rule__Value__IdAssignment_0_0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1235:1: ( ( rule__Value__IdAssignment_0_0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1236:1: ( rule__Value__IdAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getIdAssignment_0_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1237:1: ( rule__Value__IdAssignment_0_0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1237:2: rule__Value__IdAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Value__IdAssignment_0_0_in_rule__Value__Group_0__0__Impl2497);
            rule__Value__IdAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getIdAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__0__Impl"


    // $ANTLR start "rule__Value__Group_0__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1247:1: rule__Value__Group_0__1 : rule__Value__Group_0__1__Impl rule__Value__Group_0__2 ;
    public final void rule__Value__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1251:1: ( rule__Value__Group_0__1__Impl rule__Value__Group_0__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1252:2: rule__Value__Group_0__1__Impl rule__Value__Group_0__2
            {
            pushFollow(FOLLOW_rule__Value__Group_0__1__Impl_in_rule__Value__Group_0__12527);
            rule__Value__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Value__Group_0__2_in_rule__Value__Group_0__12530);
            rule__Value__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__1"


    // $ANTLR start "rule__Value__Group_0__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1259:1: rule__Value__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Value__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1263:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1264:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1264:1: ( '.' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1265:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getFullStopKeyword_0_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Value__Group_0__1__Impl2558); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getFullStopKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__1__Impl"


    // $ANTLR start "rule__Value__Group_0__2"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1278:1: rule__Value__Group_0__2 : rule__Value__Group_0__2__Impl ;
    public final void rule__Value__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1282:1: ( rule__Value__Group_0__2__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1283:2: rule__Value__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Value__Group_0__2__Impl_in_rule__Value__Group_0__22589);
            rule__Value__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__2"


    // $ANTLR start "rule__Value__Group_0__2__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1289:1: rule__Value__Group_0__2__Impl : ( ( rule__Value__RefAssignment_0_2 ) ) ;
    public final void rule__Value__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1293:1: ( ( ( rule__Value__RefAssignment_0_2 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1294:1: ( ( rule__Value__RefAssignment_0_2 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1294:1: ( ( rule__Value__RefAssignment_0_2 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1295:1: ( rule__Value__RefAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getRefAssignment_0_2()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1296:1: ( rule__Value__RefAssignment_0_2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1296:2: rule__Value__RefAssignment_0_2
            {
            pushFollow(FOLLOW_rule__Value__RefAssignment_0_2_in_rule__Value__Group_0__2__Impl2616);
            rule__Value__RefAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getRefAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__2__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1312:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1316:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1317:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02652);
            rule__Event__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02655);
            rule__Event__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1324:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1328:1: ( ( () ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1329:1: ( () )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1329:1: ( () )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1330:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventAction_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1331:1: ()
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1333:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1343:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1347:1: ( rule__Event__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1348:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12713);
            rule__Event__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1354:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1358:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1359:1: ( ( rule__Event__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1359:1: ( ( rule__Event__Group_1__0 )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1360:1: ( rule__Event__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1361:1: ( rule__Event__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)||LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1361:2: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2740);
                    rule__Event__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1375:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1379:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1380:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02775);
            rule__Event__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02778);
            rule__Event__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1387:1: rule__Event__Group_1__0__Impl : ( ( 'on' )? ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1391:1: ( ( ( 'on' )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1392:1: ( ( 'on' )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1392:1: ( ( 'on' )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1393:1: ( 'on' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getOnKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1394:1: ( 'on' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1395:2: 'on'
                    {
                    match(input,22,FOLLOW_22_in_rule__Event__Group_1__0__Impl2807); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getOnKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1406:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1410:1: ( rule__Event__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1411:2: rule__Event__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12840);
            rule__Event__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1417:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__EventAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1421:1: ( ( ( rule__Event__EventAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1422:1: ( ( rule__Event__EventAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1422:1: ( ( rule__Event__EventAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1423:1: ( rule__Event__EventAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1424:1: ( rule__Event__EventAssignment_1_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1424:2: rule__Event__EventAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Event__EventAssignment_1_1_in_rule__Event__Group_1__1__Impl2867);
            rule__Event__EventAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1438:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1442:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1443:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__02901);
            rule__Guard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__02904);
            rule__Guard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1450:1: rule__Guard__Group__0__Impl : ( () ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1454:1: ( ( () ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1455:1: ( () )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1455:1: ( () )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1456:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardAccess().getGuardAction_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1457:1: ()
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1459:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardAccess().getGuardAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1469:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1473:1: ( rule__Guard__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1474:2: rule__Guard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__12962);
            rule__Guard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1480:1: rule__Guard__Group__1__Impl : ( ( rule__Guard__Group_1__0 )? ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1484:1: ( ( ( rule__Guard__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1485:1: ( ( rule__Guard__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1485:1: ( ( rule__Guard__Group_1__0 )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1486:1: ( rule__Guard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1487:1: ( rule__Guard__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1487:2: rule__Guard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Guard__Group_1__0_in_rule__Guard__Group__1__Impl2989);
                    rule__Guard__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group_1__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1501:1: rule__Guard__Group_1__0 : rule__Guard__Group_1__0__Impl rule__Guard__Group_1__1 ;
    public final void rule__Guard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1505:1: ( rule__Guard__Group_1__0__Impl rule__Guard__Group_1__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1506:2: rule__Guard__Group_1__0__Impl rule__Guard__Group_1__1
            {
            pushFollow(FOLLOW_rule__Guard__Group_1__0__Impl_in_rule__Guard__Group_1__03024);
            rule__Guard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Guard__Group_1__1_in_rule__Guard__Group_1__03027);
            rule__Guard__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_1__0"


    // $ANTLR start "rule__Guard__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1513:1: rule__Guard__Group_1__0__Impl : ( ( 'if' ) ) ;
    public final void rule__Guard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1517:1: ( ( ( 'if' ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1518:1: ( ( 'if' ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1518:1: ( ( 'if' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1519:1: ( 'if' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardAccess().getIfKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1520:1: ( 'if' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1521:2: 'if'
            {
            match(input,23,FOLLOW_23_in_rule__Guard__Group_1__0__Impl3056); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardAccess().getIfKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_1__0__Impl"


    // $ANTLR start "rule__Guard__Group_1__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1532:1: rule__Guard__Group_1__1 : rule__Guard__Group_1__1__Impl ;
    public final void rule__Guard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1536:1: ( rule__Guard__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1537:2: rule__Guard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Guard__Group_1__1__Impl_in_rule__Guard__Group_1__13088);
            rule__Guard__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_1__1"


    // $ANTLR start "rule__Guard__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1543:1: rule__Guard__Group_1__1__Impl : ( ( rule__Guard__GuardAssignment_1_1 ) ) ;
    public final void rule__Guard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1547:1: ( ( ( rule__Guard__GuardAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1548:1: ( ( rule__Guard__GuardAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1548:1: ( ( rule__Guard__GuardAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1549:1: ( rule__Guard__GuardAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardAccess().getGuardAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1550:1: ( rule__Guard__GuardAssignment_1_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1550:2: rule__Guard__GuardAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Guard__GuardAssignment_1_1_in_rule__Guard__Group_1__1__Impl3115);
            rule__Guard__GuardAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardAccess().getGuardAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_1__1__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1564:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1568:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1569:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03149);
            rule__Action__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03152);
            rule__Action__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1576:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1580:1: ( ( () ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1581:1: ( () )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1581:1: ( () )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1582:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getActionAction_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1583:1: ()
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1585:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getActionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1595:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1599:1: ( rule__Action__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1600:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13210);
            rule__Action__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1606:1: rule__Action__Group__1__Impl : ( ( rule__Action__Group_1__0 )? ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1610:1: ( ( ( rule__Action__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1611:1: ( ( rule__Action__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1611:1: ( ( rule__Action__Group_1__0 )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1612:1: ( rule__Action__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1613:1: ( rule__Action__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1613:2: rule__Action__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Action__Group_1__0_in_rule__Action__Group__1__Impl3237);
                    rule__Action__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group_1__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1627:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1631:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1632:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_rule__Action__Group_1__0__Impl_in_rule__Action__Group_1__03272);
            rule__Action__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Action__Group_1__1_in_rule__Action__Group_1__03275);
            rule__Action__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_1__0"


    // $ANTLR start "rule__Action__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1639:1: rule__Action__Group_1__0__Impl : ( ( 'do' ) ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1643:1: ( ( ( 'do' ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:1: ( ( 'do' ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1644:1: ( ( 'do' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1645:1: ( 'do' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getDoKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1646:1: ( 'do' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1647:2: 'do'
            {
            match(input,24,FOLLOW_24_in_rule__Action__Group_1__0__Impl3304); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getDoKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_1__0__Impl"


    // $ANTLR start "rule__Action__Group_1__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1658:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1662:1: ( rule__Action__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1663:2: rule__Action__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_1__1__Impl_in_rule__Action__Group_1__13336);
            rule__Action__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_1__1"


    // $ANTLR start "rule__Action__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1669:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__ActionAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1673:1: ( ( ( rule__Action__ActionAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1674:1: ( ( rule__Action__ActionAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1674:1: ( ( rule__Action__ActionAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1675:1: ( rule__Action__ActionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getActionAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1676:1: ( rule__Action__ActionAssignment_1_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1676:2: rule__Action__ActionAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Action__ActionAssignment_1_1_in_rule__Action__Group_1__1__Impl3363);
            rule__Action__ActionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getActionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1690:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1694:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1695:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03397);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03400);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1702:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1706:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1707:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1707:1: ( 'import' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1708:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Import__Group__0__Impl3428); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1721:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1725:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1726:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13459);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1732:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1736:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1737:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1737:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1738:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1739:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1739:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3486);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1753:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1757:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1758:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03520);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03523);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1765:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1769:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1770:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1770:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1771:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3550); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1782:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1786:1: ( rule__QualifiedName__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1787:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13579);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1793:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1797:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1798:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1798:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1799:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1800:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1800:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3606);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1814:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1818:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1819:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03641);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03644);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1826:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1830:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1831:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1831:1: ( '.' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1832:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl3672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1845:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1849:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1850:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13703);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1856:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1860:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1861:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1861:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1862:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3730); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Statemodel__ImportsAssignment_0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1878:1: rule__Statemodel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Statemodel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1882:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1883:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1883:1: ( ruleImport )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1884:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Statemodel__ImportsAssignment_03768);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemodelAccess().getImportsImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemodel__ImportsAssignment_0"


    // $ANTLR start "rule__Statemodel__StatemachineAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1893:1: rule__Statemodel__StatemachineAssignment_1 : ( ruleStatemachine ) ;
    public final void rule__Statemodel__StatemachineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1897:1: ( ( ruleStatemachine ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1898:1: ( ruleStatemachine )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1898:1: ( ruleStatemachine )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1899:1: ruleStatemachine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getStatemachineStatemachineParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatemachine_in_rule__Statemodel__StatemachineAssignment_13799);
            ruleStatemachine();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemodelAccess().getStatemachineStatemachineParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemodel__StatemachineAssignment_1"


    // $ANTLR start "rule__Statemachine__NameAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1908:1: rule__Statemachine__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__Statemachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1912:1: ( ( ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1913:1: ( ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1913:1: ( ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1914:1: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getNameIdentifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Statemachine__NameAssignment_13830);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getNameIdentifierParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NameAssignment_1"


    // $ANTLR start "rule__Statemachine__MappedAssignment_2_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1923:1: rule__Statemachine__MappedAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Statemachine__MappedAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1927:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1928:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1928:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1929:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getMappedEntityCrossReference_2_1_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1930:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1931:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getMappedEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Statemachine__MappedAssignment_2_13865);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getMappedEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getMappedEntityCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__MappedAssignment_2_1"


    // $ANTLR start "rule__Statemachine__StateAssignment_4"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1942:1: rule__Statemachine__StateAssignment_4 : ( ruleState ) ;
    public final void rule__Statemachine__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1946:1: ( ( ruleState ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1947:1: ( ruleState )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1947:1: ( ruleState )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1948:1: ruleState
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleState_in_rule__Statemachine__StateAssignment_43900);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__StateAssignment_4"


    // $ANTLR start "rule__State__TypeAssignment_0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1957:1: rule__State__TypeAssignment_0 : ( ruleStateType ) ;
    public final void rule__State__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1961:1: ( ( ruleStateType ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1962:1: ( ruleStateType )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1962:1: ( ruleStateType )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1963:1: ruleStateType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__TypeAssignment_03931);
            ruleStateType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__TypeAssignment_0"


    // $ANTLR start "rule__State__NameAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1972:1: rule__State__NameAssignment_1 : ( ruleIdentifier ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1976:1: ( ( ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1977:1: ( ruleIdentifier )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1977:1: ( ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1978:1: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getNameIdentifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rule__State__NameAssignment_13962);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getNameIdentifierParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__State__ElementAssignment_3"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1987:1: rule__State__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__State__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1991:1: ( ( ruleElement ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1992:1: ( ruleElement )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1992:1: ( ruleElement )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1993:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getElementElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__State__ElementAssignment_33993);
            ruleElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getElementElementParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__ElementAssignment_3"


    // $ANTLR start "rule__Transition__EventAssignment_0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2002:1: rule__Transition__EventAssignment_0 : ( ruleEvent ) ;
    public final void rule__Transition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2006:1: ( ( ruleEvent ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2007:1: ( ruleEvent )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2007:1: ( ruleEvent )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2008:1: ruleEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_rule__Transition__EventAssignment_04024);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_0"


    // $ANTLR start "rule__Transition__GuardAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2017:1: rule__Transition__GuardAssignment_1 : ( ruleGuard ) ;
    public final void rule__Transition__GuardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2021:1: ( ( ruleGuard ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2022:1: ( ruleGuard )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2022:1: ( ruleGuard )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2023:1: ruleGuard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleGuard_in_rule__Transition__GuardAssignment_14055);
            ruleGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardAssignment_1"


    // $ANTLR start "rule__Transition__ActionAssignment_2"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2032:1: rule__Transition__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Transition__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2036:1: ( ( ruleAction ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2037:1: ( ruleAction )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2037:1: ( ruleAction )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2038:1: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleAction_in_rule__Transition__ActionAssignment_24086);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionAssignment_2"


    // $ANTLR start "rule__Transition__StateAssignment_4"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2047:1: rule__Transition__StateAssignment_4 : ( ( ruleIdentifier ) ) ;
    public final void rule__Transition__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2051:1: ( ( ( ruleIdentifier ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2052:1: ( ( ruleIdentifier ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2052:1: ( ( ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2053:1: ( ruleIdentifier )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStateStateCrossReference_4_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2054:1: ( ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2055:1: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStateStateIdentifierParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Transition__StateAssignment_44121);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getStateStateIdentifierParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getStateStateCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__StateAssignment_4"


    // $ANTLR start "rule__Value__IdAssignment_0_0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2066:1: rule__Value__IdAssignment_0_0 : ( ( ruleIdentifier ) ) ;
    public final void rule__Value__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2070:1: ( ( ( ruleIdentifier ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2071:1: ( ( ruleIdentifier ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2071:1: ( ( ruleIdentifier ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2072:1: ( ruleIdentifier )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getIdStatemachineCrossReference_0_0_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2073:1: ( ruleIdentifier )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2074:1: ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getIdStatemachineIdentifierParserRuleCall_0_0_0_1()); 
            }
            pushFollow(FOLLOW_ruleIdentifier_in_rule__Value__IdAssignment_0_04160);
            ruleIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getIdStatemachineIdentifierParserRuleCall_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getIdStatemachineCrossReference_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__IdAssignment_0_0"


    // $ANTLR start "rule__Value__RefAssignment_0_2"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2085:1: rule__Value__RefAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Value__RefAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2089:1: ( ( ( RULE_ID ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2090:1: ( ( RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2090:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2091:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getRefOperationCrossReference_0_2_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2092:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2093:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getRefOperationIDTerminalRuleCall_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Value__RefAssignment_0_24199); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getRefOperationIDTerminalRuleCall_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getRefOperationCrossReference_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__RefAssignment_0_2"


    // $ANTLR start "rule__Value__ValueAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2104:1: rule__Value__ValueAssignment_1 : ( ruleCompositeString ) ;
    public final void rule__Value__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2108:1: ( ( ruleCompositeString ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2109:1: ( ruleCompositeString )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2109:1: ( ruleCompositeString )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2110:1: ruleCompositeString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getValueCompositeStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCompositeString_in_rule__Value__ValueAssignment_14234);
            ruleCompositeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueAccess().getValueCompositeStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__ValueAssignment_1"


    // $ANTLR start "rule__Event__EventAssignment_1_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2119:1: rule__Event__EventAssignment_1_1 : ( ruleValue ) ;
    public final void rule__Event__EventAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2123:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2124:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2124:1: ( ruleValue )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2125:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getEventValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Event__EventAssignment_1_14265);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getEventValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__EventAssignment_1_1"


    // $ANTLR start "rule__Guard__GuardAssignment_1_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2134:1: rule__Guard__GuardAssignment_1_1 : ( ruleValue ) ;
    public final void rule__Guard__GuardAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2138:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2139:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2139:1: ( ruleValue )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2140:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardAccess().getGuardValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Guard__GuardAssignment_1_14296);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardAccess().getGuardValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__GuardAssignment_1_1"


    // $ANTLR start "rule__Action__ActionAssignment_1_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2149:1: rule__Action__ActionAssignment_1_1 : ( ruleValue ) ;
    public final void rule__Action__ActionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2153:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2154:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2154:1: ( ruleValue )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2155:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getActionValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Action__ActionAssignment_1_14327);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getActionValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ActionAssignment_1_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2164:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2168:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2169:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2169:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:2170:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14358); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStatemodel_in_entryRuleStatemodel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemodel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__0_in_ruleStatemodel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0_in_ruleGuard520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_entryRuleCompositeString607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeString614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Alternatives_in_ruleCompositeString640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_entryRuleIdentifier727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdentifier734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Identifier__Alternatives_in_ruleIdentifier760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Element__Alternatives892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Element__Alternatives909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transition__Alternatives_3942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transition__Alternatives_3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_0__0_in_rule__Value__Alternatives996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__ValueAssignment_1_in_rule__Value__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeString__Alternatives1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONDITION_in_rule__CompositeString__Alternatives1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Identifier__Alternatives1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Identifier__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateType__Alternatives1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StateType__Alternatives1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StateType__Alternatives1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__0__Impl_in_rule__Statemodel__Group__01223 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__1_in_rule__Statemodel__Group__01226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__ImportsAssignment_0_in_rule__Statemodel__Group__0__Impl1253 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__1__Impl_in_rule__Statemodel__Group__11284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__StatemachineAssignment_1_in_rule__Statemodel__Group__1__Impl1311 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__01346 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__01349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Statemachine__Group__0__Impl1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__11408 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21468 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__0_in_rule__Statemachine__Group__2__Impl1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31529 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Statemachine__Group__3__Impl1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41591 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__5_in_rule__Statemachine__Group__41594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__StateAssignment_4_in_rule__Statemachine__Group__4__Impl1621 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__5__Impl_in_rule__Statemachine__Group__51652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statemachine__Group__5__Impl1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__0__Impl_in_rule__Statemachine__Group_2__01723 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__1_in_rule__Statemachine__Group_2__01726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Statemachine__Group_2__0__Impl1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group_2__1__Impl_in_rule__Statemachine__Group_2__11787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__MappedAssignment_2_1_in_rule__Statemachine__Group_2__1__Impl1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01848 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TypeAssignment_0_in_rule__State__Group__0__Impl1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11908 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21968 = new BitSet(new long[]{0x000000000049C070L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group__2__Impl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__32030 = new BitSet(new long[]{0x000000000049C070L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__32033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ElementAssignment_3_in_rule__State__Group__3__Impl2060 = new BitSet(new long[]{0x000000000041C072L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__42091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__State__Group__4__Impl2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__02160 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__02163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__12220 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__12223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_1_in_rule__Transition__Group__1__Impl2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__22280 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__22283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ActionAssignment_2_in_rule__Transition__Group__2__Impl2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__32340 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__32343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_3_in_rule__Transition__Group__3__Impl2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__42400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_4_in_rule__Transition__Group__4__Impl2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_0__0__Impl_in_rule__Value__Group_0__02467 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Value__Group_0__1_in_rule__Value__Group_0__02470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__IdAssignment_0_0_in_rule__Value__Group_0__0__Impl2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_0__1__Impl_in_rule__Value__Group_0__12527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Value__Group_0__2_in_rule__Value__Group_0__12530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Value__Group_0__1__Impl2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Group_0__2__Impl_in_rule__Value__Group_0__22589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__RefAssignment_0_2_in_rule__Value__Group_0__2__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__02652 = new BitSet(new long[]{0x0000000000400070L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__02655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__12713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0_in_rule__Event__Group__1__Impl2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__0__Impl_in_rule__Event__Group_1__02775 = new BitSet(new long[]{0x0000000000400070L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1_in_rule__Event__Group_1__02778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Event__Group_1__0__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group_1__1__Impl_in_rule__Event__Group_1__12840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__EventAssignment_1_1_in_rule__Event__Group_1__1__Impl2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__0__Impl_in_rule__Guard__Group__02901 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Guard__Group__1_in_rule__Guard__Group__02904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group__1__Impl_in_rule__Guard__Group__12962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group_1__0_in_rule__Guard__Group__1__Impl2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group_1__0__Impl_in_rule__Guard__Group_1__03024 = new BitSet(new long[]{0x0000000000400070L});
    public static final BitSet FOLLOW_rule__Guard__Group_1__1_in_rule__Guard__Group_1__03027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Guard__Group_1__0__Impl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Group_1__1__Impl_in_rule__Guard__Group_1__13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__GuardAssignment_1_1_in_rule__Guard__Group_1__1__Impl3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03149 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_1__0_in_rule__Action__Group__1__Impl3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_1__0__Impl_in_rule__Action__Group_1__03272 = new BitSet(new long[]{0x0000000000400070L});
    public static final BitSet FOLLOW_rule__Action__Group_1__1_in_rule__Action__Group_1__03275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Action__Group_1__0__Impl3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_1__1__Impl_in_rule__Action__Group_1__13336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ActionAssignment_1_1_in_rule__Action__Group_1__1__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03397 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__0__Impl3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03520 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3606 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03641 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__QualifiedName__Group_1__0__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Statemodel__ImportsAssignment_03768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_rule__Statemodel__StatemachineAssignment_13799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Statemachine__NameAssignment_13830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Statemachine__MappedAssignment_2_13865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Statemachine__StateAssignment_43900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__TypeAssignment_03931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__State__NameAssignment_13962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__State__ElementAssignment_33993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Transition__EventAssignment_04024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardAssignment_14055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Transition__ActionAssignment_24086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Transition__StateAssignment_44121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdentifier_in_rule__Value__IdAssignment_0_04160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Value__RefAssignment_0_24199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_rule__Value__ValueAssignment_14234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Event__EventAssignment_1_14265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Guard__GuardAssignment_1_14296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Action__ActionAssignment_1_14327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_14358 = new BitSet(new long[]{0x0000000000000002L});

}
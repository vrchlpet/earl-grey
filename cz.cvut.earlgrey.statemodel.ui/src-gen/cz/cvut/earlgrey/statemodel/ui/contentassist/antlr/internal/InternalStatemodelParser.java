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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_CONDITION", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=>'", "'goto'", "'state'", "'initial'", "'final'", "'statemachine'", "'{'", "'}'", "'on'", "'if'", "'do'", "'import'", "'.'"
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


    // $ANTLR start "entryRuleEvent"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:201:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:202:1: ( ruleEvent EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:203:1: ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent367);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent374); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:210:1: ruleEvent : ( ( rule__Event__ValueAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:214:2: ( ( ( rule__Event__ValueAssignment ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:215:1: ( ( rule__Event__ValueAssignment ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:215:1: ( ( rule__Event__ValueAssignment ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:216:1: ( rule__Event__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getValueAssignment()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:217:1: ( rule__Event__ValueAssignment )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:217:2: rule__Event__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Event__ValueAssignment_in_ruleEvent400);
            rule__Event__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getValueAssignment()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:229:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:230:1: ( ruleGuard EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:231:1: ruleGuard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardRule()); 
            }
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard427);
            ruleGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard434); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:238:1: ruleGuard : ( ( rule__Guard__ValueAssignment ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:242:2: ( ( ( rule__Guard__ValueAssignment ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:243:1: ( ( rule__Guard__ValueAssignment ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:243:1: ( ( rule__Guard__ValueAssignment ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:244:1: ( rule__Guard__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardAccess().getValueAssignment()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:245:1: ( rule__Guard__ValueAssignment )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:245:2: rule__Guard__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Guard__ValueAssignment_in_ruleGuard460);
            rule__Guard__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardAccess().getValueAssignment()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:257:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:258:1: ( ruleAction EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:259:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction487);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction494); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:266:1: ruleAction : ( ( rule__Action__ValueAssignment ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:270:2: ( ( ( rule__Action__ValueAssignment ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:271:1: ( ( rule__Action__ValueAssignment ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:271:1: ( ( rule__Action__ValueAssignment ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:272:1: ( rule__Action__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getValueAssignment()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:273:1: ( rule__Action__ValueAssignment )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:273:2: rule__Action__ValueAssignment
            {
            pushFollow(FOLLOW_rule__Action__ValueAssignment_in_ruleAction520);
            rule__Action__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getValueAssignment()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:285:1: entryRuleCompositeString : ruleCompositeString EOF ;
    public final void entryRuleCompositeString() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:286:1: ( ruleCompositeString EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:287:1: ruleCompositeString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeStringRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeString_in_entryRuleCompositeString547);
            ruleCompositeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeString554); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:294:1: ruleCompositeString : ( ( rule__CompositeString__Alternatives ) ) ;
    public final void ruleCompositeString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:298:2: ( ( ( rule__CompositeString__Alternatives ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:299:1: ( ( rule__CompositeString__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:299:1: ( ( rule__CompositeString__Alternatives ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:300:1: ( rule__CompositeString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeStringAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:301:1: ( rule__CompositeString__Alternatives )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:301:2: rule__CompositeString__Alternatives
            {
            pushFollow(FOLLOW_rule__CompositeString__Alternatives_in_ruleCompositeString580);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:313:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:314:1: ( ruleImport EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:315:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport607);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport614); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:322:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:326:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:327:1: ( ( rule__Import__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:327:1: ( ( rule__Import__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:328:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:329:1: ( rule__Import__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:329:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport640);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:343:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:344:1: ( ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:345:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName669);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName676); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:352:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:356:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:357:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:357:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:358:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:359:1: ( rule__QualifiedName__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:359:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName702);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:372:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:376:1: ( ( ( rule__StateType__Alternatives ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:377:1: ( ( rule__StateType__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:377:1: ( ( rule__StateType__Alternatives ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:378:1: ( rule__StateType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:379:1: ( rule__StateType__Alternatives )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:379:2: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_rule__StateType__Alternatives_in_ruleStateType739);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:390:1: rule__Element__Alternatives : ( ( ruleTransition ) | ( ruleState ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:394:1: ( ( ruleTransition ) | ( ruleState ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_CONDITION)||(LA1_0>=12 && LA1_0<=13)||(LA1_0>=20 && LA1_0<=22)) ) {
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
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:395:1: ( ruleTransition )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:395:1: ( ruleTransition )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:396:1: ruleTransition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getTransitionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTransition_in_rule__Element__Alternatives774);
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
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:401:6: ( ruleState )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:401:6: ( ruleState )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:402:1: ruleState
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getElementAccess().getStateParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleState_in_rule__Element__Alternatives791);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:412:1: rule__Transition__Alternatives_3 : ( ( '=>' ) | ( 'goto' ) );
    public final void rule__Transition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:416:1: ( ( '=>' ) | ( 'goto' ) )
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
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:417:1: ( '=>' )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:417:1: ( '=>' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:418:1: '=>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Transition__Alternatives_3824); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:425:6: ( 'goto' )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:425:6: ( 'goto' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:426:1: 'goto'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getGotoKeyword_3_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Transition__Alternatives_3844); if (state.failed) return ;
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


    // $ANTLR start "rule__CompositeString__Alternatives"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:438:1: rule__CompositeString__Alternatives : ( ( RULE_ID ) | ( RULE_CONDITION ) );
    public final void rule__CompositeString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:442:1: ( ( RULE_ID ) | ( RULE_CONDITION ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_CONDITION) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:443:1: ( RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:443:1: ( RULE_ID )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:444:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeStringAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CompositeString__Alternatives878); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompositeStringAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:449:6: ( RULE_CONDITION )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:449:6: ( RULE_CONDITION )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:450:1: RULE_CONDITION
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeStringAccess().getCONDITIONTerminalRuleCall_1()); 
                    }
                    match(input,RULE_CONDITION,FOLLOW_RULE_CONDITION_in_rule__CompositeString__Alternatives895); if (state.failed) return ;
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


    // $ANTLR start "rule__StateType__Alternatives"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:461:1: rule__StateType__Alternatives : ( ( ( 'state' ) ) | ( ( 'initial' ) ) | ( ( 'final' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:465:1: ( ( ( 'state' ) ) | ( ( 'initial' ) ) | ( ( 'final' ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:466:1: ( ( 'state' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:466:1: ( ( 'state' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:467:1: ( 'state' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:468:1: ( 'state' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:468:3: 'state'
                    {
                    match(input,14,FOLLOW_14_in_rule__StateType__Alternatives929); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:473:6: ( ( 'initial' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:473:6: ( ( 'initial' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:474:1: ( 'initial' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:475:1: ( 'initial' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:475:3: 'initial'
                    {
                    match(input,15,FOLLOW_15_in_rule__StateType__Alternatives950); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:480:6: ( ( 'final' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:480:6: ( ( 'final' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:481:1: ( 'final' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStateTypeAccess().getFINALEnumLiteralDeclaration_2()); 
                    }
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:482:1: ( 'final' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:482:3: 'final'
                    {
                    match(input,16,FOLLOW_16_in_rule__StateType__Alternatives971); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:494:1: rule__Statemodel__Group__0 : rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1 ;
    public final void rule__Statemodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:498:1: ( rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:499:2: rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1
            {
            pushFollow(FOLLOW_rule__Statemodel__Group__0__Impl_in_rule__Statemodel__Group__01004);
            rule__Statemodel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemodel__Group__1_in_rule__Statemodel__Group__01007);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:506:1: rule__Statemodel__Group__0__Impl : ( ( rule__Statemodel__ImportsAssignment_0 )* ) ;
    public final void rule__Statemodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:510:1: ( ( ( rule__Statemodel__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:511:1: ( ( rule__Statemodel__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:511:1: ( ( rule__Statemodel__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:512:1: ( rule__Statemodel__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:513:1: ( rule__Statemodel__ImportsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:513:2: rule__Statemodel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Statemodel__ImportsAssignment_0_in_rule__Statemodel__Group__0__Impl1034);
            	    rule__Statemodel__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:523:1: rule__Statemodel__Group__1 : rule__Statemodel__Group__1__Impl ;
    public final void rule__Statemodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:527:1: ( rule__Statemodel__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:528:2: rule__Statemodel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statemodel__Group__1__Impl_in_rule__Statemodel__Group__11065);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:534:1: rule__Statemodel__Group__1__Impl : ( ( rule__Statemodel__StatemachineAssignment_1 )* ) ;
    public final void rule__Statemodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:538:1: ( ( ( rule__Statemodel__StatemachineAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:539:1: ( ( rule__Statemodel__StatemachineAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:539:1: ( ( rule__Statemodel__StatemachineAssignment_1 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:540:1: ( rule__Statemodel__StatemachineAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getStatemachineAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:541:1: ( rule__Statemodel__StatemachineAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:541:2: rule__Statemodel__StatemachineAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemodel__StatemachineAssignment_1_in_rule__Statemodel__Group__1__Impl1092);
            	    rule__Statemodel__StatemachineAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:555:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:559:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:560:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__01127);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__01130);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:567:1: rule__Statemachine__Group__0__Impl : ( 'statemachine' ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:571:1: ( ( 'statemachine' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:572:1: ( 'statemachine' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:572:1: ( 'statemachine' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:573:1: 'statemachine'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Statemachine__Group__0__Impl1158); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:586:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:590:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:591:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__11189);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__11192);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:598:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__NameAssignment_1 ) ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:602:1: ( ( ( rule__Statemachine__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:603:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:603:1: ( ( rule__Statemachine__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:604:1: ( rule__Statemachine__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:605:1: ( rule__Statemachine__NameAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:605:2: rule__Statemachine__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl1219);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:615:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:619:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:620:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21249);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21252);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:627:1: rule__Statemachine__Group__2__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:631:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:632:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:632:1: ( '{' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:633:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__Statemachine__Group__2__Impl1280); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:646:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:650:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:651:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31311);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31314);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:658:1: rule__Statemachine__Group__3__Impl : ( ( rule__Statemachine__StateAssignment_3 )* ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:662:1: ( ( ( rule__Statemachine__StateAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:663:1: ( ( rule__Statemachine__StateAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:663:1: ( ( rule__Statemachine__StateAssignment_3 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:664:1: ( rule__Statemachine__StateAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getStateAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:665:1: ( rule__Statemachine__StateAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=14 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:665:2: rule__Statemachine__StateAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__StateAssignment_3_in_rule__Statemachine__Group__3__Impl1341);
            	    rule__Statemachine__StateAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getStateAssignment_3()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:675:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:679:1: ( rule__Statemachine__Group__4__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:680:2: rule__Statemachine__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41372);
            rule__Statemachine__Group__4__Impl();

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:686:1: rule__Statemachine__Group__4__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:690:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:691:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:691:1: ( '}' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:692:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_19_in_rule__Statemachine__Group__4__Impl1400); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_4()); 
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


    // $ANTLR start "rule__State__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:715:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:719:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:720:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01441);
            rule__State__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01444);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:727:1: rule__State__Group__0__Impl : ( ( rule__State__TypeAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:731:1: ( ( ( rule__State__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:732:1: ( ( rule__State__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:732:1: ( ( rule__State__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:733:1: ( rule__State__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:734:1: ( rule__State__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:734:2: rule__State__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__State__TypeAssignment_0_in_rule__State__Group__0__Impl1471);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:744:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:748:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:749:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11501);
            rule__State__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11504);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:756:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:760:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:761:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:761:1: ( ( rule__State__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:762:1: ( rule__State__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:763:1: ( rule__State__NameAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:763:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1531);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:773:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:777:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:778:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21561);
            rule__State__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21564);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:785:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:789:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:790:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:790:1: ( '{' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:791:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,18,FOLLOW_18_in_rule__State__Group__2__Impl1592); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:804:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:808:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:809:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31623);
            rule__State__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31626);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:816:1: rule__State__Group__3__Impl : ( ( rule__State__ElementAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:820:1: ( ( ( rule__State__ElementAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:821:1: ( ( rule__State__ElementAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:821:1: ( ( rule__State__ElementAssignment_3 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:822:1: ( rule__State__ElementAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getElementAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:823:1: ( rule__State__ElementAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_CONDITION)||(LA8_0>=12 && LA8_0<=16)||(LA8_0>=20 && LA8_0<=22)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:823:2: rule__State__ElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__ElementAssignment_3_in_rule__State__Group__3__Impl1653);
            	    rule__State__ElementAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:833:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:837:1: ( rule__State__Group__4__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:838:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__41684);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:844:1: rule__State__Group__4__Impl : ( '}' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:848:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:849:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:849:1: ( '}' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:850:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,19,FOLLOW_19_in_rule__State__Group__4__Impl1712); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:873:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:877:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:878:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01753);
            rule__Transition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01756);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:885:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__Group_0__0 )? ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:889:1: ( ( ( rule__Transition__Group_0__0 )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:890:1: ( ( rule__Transition__Group_0__0 )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:890:1: ( ( rule__Transition__Group_0__0 )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:891:1: ( rule__Transition__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:892:1: ( rule__Transition__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_CONDITION)||LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:892:2: rule__Transition__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_0__0_in_rule__Transition__Group__0__Impl1783);
                    rule__Transition__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup_0()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:902:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:906:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:907:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11814);
            rule__Transition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11817);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:914:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__Group_1__0 )? ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:918:1: ( ( ( rule__Transition__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:919:1: ( ( rule__Transition__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:919:1: ( ( rule__Transition__Group_1__0 )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:920:1: ( rule__Transition__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:921:1: ( rule__Transition__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:921:2: rule__Transition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_1__0_in_rule__Transition__Group__1__Impl1844);
                    rule__Transition__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup_1()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:931:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:935:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:936:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21875);
            rule__Transition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21878);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:943:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:947:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:948:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:948:1: ( ( rule__Transition__Group_2__0 )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:949:1: ( rule__Transition__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:950:1: ( rule__Transition__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:950:2: rule__Transition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_2__0_in_rule__Transition__Group__2__Impl1905);
                    rule__Transition__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGroup_2()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:960:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:964:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:965:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__31936);
            rule__Transition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__31939);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:972:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Alternatives_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:976:1: ( ( ( rule__Transition__Alternatives_3 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:977:1: ( ( rule__Transition__Alternatives_3 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:977:1: ( ( rule__Transition__Alternatives_3 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:978:1: ( rule__Transition__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getAlternatives_3()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:979:1: ( rule__Transition__Alternatives_3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:979:2: rule__Transition__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_3_in_rule__Transition__Group__3__Impl1966);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:989:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:993:1: ( rule__Transition__Group__4__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:994:2: rule__Transition__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__41996);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1000:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__StateAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1004:1: ( ( ( rule__Transition__StateAssignment_4 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1005:1: ( ( rule__Transition__StateAssignment_4 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1005:1: ( ( rule__Transition__StateAssignment_4 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1006:1: ( rule__Transition__StateAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStateAssignment_4()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1007:1: ( rule__Transition__StateAssignment_4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1007:2: rule__Transition__StateAssignment_4
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_4_in_rule__Transition__Group__4__Impl2023);
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


    // $ANTLR start "rule__Transition__Group_0__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1027:1: rule__Transition__Group_0__0 : rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 ;
    public final void rule__Transition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1031:1: ( rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1032:2: rule__Transition__Group_0__0__Impl rule__Transition__Group_0__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_0__0__Impl_in_rule__Transition__Group_0__02063);
            rule__Transition__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_0__1_in_rule__Transition__Group_0__02066);
            rule__Transition__Group_0__1();

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
    // $ANTLR end "rule__Transition__Group_0__0"


    // $ANTLR start "rule__Transition__Group_0__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1039:1: rule__Transition__Group_0__0__Impl : ( ( 'on' )? ) ;
    public final void rule__Transition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1043:1: ( ( ( 'on' )? ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1044:1: ( ( 'on' )? )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1044:1: ( ( 'on' )? )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1045:1: ( 'on' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getOnKeyword_0_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1046:1: ( 'on' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1047:2: 'on'
                    {
                    match(input,20,FOLLOW_20_in_rule__Transition__Group_0__0__Impl2095); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getOnKeyword_0_0()); 
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
    // $ANTLR end "rule__Transition__Group_0__0__Impl"


    // $ANTLR start "rule__Transition__Group_0__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1058:1: rule__Transition__Group_0__1 : rule__Transition__Group_0__1__Impl ;
    public final void rule__Transition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1062:1: ( rule__Transition__Group_0__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1063:2: rule__Transition__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_0__1__Impl_in_rule__Transition__Group_0__12128);
            rule__Transition__Group_0__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_0__1"


    // $ANTLR start "rule__Transition__Group_0__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1069:1: rule__Transition__Group_0__1__Impl : ( ( rule__Transition__EventAssignment_0_1 ) ) ;
    public final void rule__Transition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1073:1: ( ( ( rule__Transition__EventAssignment_0_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1074:1: ( ( rule__Transition__EventAssignment_0_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1074:1: ( ( rule__Transition__EventAssignment_0_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1075:1: ( rule__Transition__EventAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEventAssignment_0_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1076:1: ( rule__Transition__EventAssignment_0_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1076:2: rule__Transition__EventAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_0_1_in_rule__Transition__Group_0__1__Impl2155);
            rule__Transition__EventAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEventAssignment_0_1()); 
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
    // $ANTLR end "rule__Transition__Group_0__1__Impl"


    // $ANTLR start "rule__Transition__Group_1__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1090:1: rule__Transition__Group_1__0 : rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 ;
    public final void rule__Transition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1094:1: ( rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1095:2: rule__Transition__Group_1__0__Impl rule__Transition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__0__Impl_in_rule__Transition__Group_1__02189);
            rule__Transition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_1__1_in_rule__Transition__Group_1__02192);
            rule__Transition__Group_1__1();

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
    // $ANTLR end "rule__Transition__Group_1__0"


    // $ANTLR start "rule__Transition__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1102:1: rule__Transition__Group_1__0__Impl : ( ( 'if' ) ) ;
    public final void rule__Transition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1106:1: ( ( ( 'if' ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1107:1: ( ( 'if' ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1107:1: ( ( 'if' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1108:1: ( 'if' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getIfKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1109:1: ( 'if' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1110:2: 'if'
            {
            match(input,21,FOLLOW_21_in_rule__Transition__Group_1__0__Impl2221); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getIfKeyword_1_0()); 
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
    // $ANTLR end "rule__Transition__Group_1__0__Impl"


    // $ANTLR start "rule__Transition__Group_1__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1121:1: rule__Transition__Group_1__1 : rule__Transition__Group_1__1__Impl ;
    public final void rule__Transition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1125:1: ( rule__Transition__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1126:2: rule__Transition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_1__1__Impl_in_rule__Transition__Group_1__12253);
            rule__Transition__Group_1__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_1__1"


    // $ANTLR start "rule__Transition__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1132:1: rule__Transition__Group_1__1__Impl : ( ( rule__Transition__GuardAssignment_1_1 ) ) ;
    public final void rule__Transition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1136:1: ( ( ( rule__Transition__GuardAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1137:1: ( ( rule__Transition__GuardAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1137:1: ( ( rule__Transition__GuardAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1138:1: ( rule__Transition__GuardAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1139:1: ( rule__Transition__GuardAssignment_1_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1139:2: rule__Transition__GuardAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Transition__GuardAssignment_1_1_in_rule__Transition__Group_1__1__Impl2280);
            rule__Transition__GuardAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGuardAssignment_1_1()); 
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
    // $ANTLR end "rule__Transition__Group_1__1__Impl"


    // $ANTLR start "rule__Transition__Group_2__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1153:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1157:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1158:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_2__0__Impl_in_rule__Transition__Group_2__02314);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Transition__Group_2__1_in_rule__Transition__Group_2__02317);
            rule__Transition__Group_2__1();

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
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1165:1: rule__Transition__Group_2__0__Impl : ( ( 'do' ) ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1169:1: ( ( ( 'do' ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1170:1: ( ( 'do' ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1170:1: ( ( 'do' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1171:1: ( 'do' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getDoKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1172:1: ( 'do' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1173:2: 'do'
            {
            match(input,22,FOLLOW_22_in_rule__Transition__Group_2__0__Impl2346); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getDoKeyword_2_0()); 
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
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1184:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1188:1: ( rule__Transition__Group_2__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1189:2: rule__Transition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_2__1__Impl_in_rule__Transition__Group_2__12378);
            rule__Transition__Group_2__1__Impl();

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
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1195:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__ActionAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1199:1: ( ( ( rule__Transition__ActionAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1200:1: ( ( rule__Transition__ActionAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1200:1: ( ( rule__Transition__ActionAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1201:1: ( rule__Transition__ActionAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1202:1: ( rule__Transition__ActionAssignment_2_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1202:2: rule__Transition__ActionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Transition__ActionAssignment_2_1_in_rule__Transition__Group_2__1__Impl2405);
            rule__Transition__ActionAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getActionAssignment_2_1()); 
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
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1216:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1220:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1221:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02439);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02442);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1228:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1232:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1233:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1233:1: ( 'import' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1234:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Import__Group__0__Impl2470); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1247:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1251:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1252:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12501);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1258:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1262:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1263:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1263:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1264:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1265:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1265:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2528);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1279:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1283:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1284:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02562);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02565);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1291:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1295:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1296:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1296:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1297:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2592); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1308:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1312:1: ( rule__QualifiedName__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1313:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12621);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1319:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1323:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1324:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1324:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1325:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1326:1: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1326:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2648);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1340:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1344:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1345:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02683);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02686);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1352:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1356:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1357:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1357:1: ( '.' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1358:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl2714); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1371:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1375:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1376:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12745);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1382:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1386:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1387:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1387:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1388:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2772); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1404:1: rule__Statemodel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Statemodel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1408:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1409:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1409:1: ( ruleImport )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1410:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Statemodel__ImportsAssignment_02810);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1419:1: rule__Statemodel__StatemachineAssignment_1 : ( ruleStatemachine ) ;
    public final void rule__Statemodel__StatemachineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1423:1: ( ( ruleStatemachine ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1424:1: ( ruleStatemachine )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1424:1: ( ruleStatemachine )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1425:1: ruleStatemachine
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemodelAccess().getStatemachineStatemachineParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleStatemachine_in_rule__Statemodel__StatemachineAssignment_12841);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1434:1: rule__Statemachine__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Statemachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1438:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1439:1: ( ruleQualifiedName )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1439:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1440:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Statemachine__NameAssignment_12872);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getNameQualifiedNameParserRuleCall_1_0()); 
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


    // $ANTLR start "rule__Statemachine__StateAssignment_3"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1449:1: rule__Statemachine__StateAssignment_3 : ( ruleState ) ;
    public final void rule__Statemachine__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1453:1: ( ( ruleState ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1454:1: ( ruleState )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1454:1: ( ruleState )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1455:1: ruleState
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleState_in_rule__Statemachine__StateAssignment_32903);
            ruleState();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Statemachine__StateAssignment_3"


    // $ANTLR start "rule__State__TypeAssignment_0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1464:1: rule__State__TypeAssignment_0 : ( ruleStateType ) ;
    public final void rule__State__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1468:1: ( ( ruleStateType ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1469:1: ( ruleStateType )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1469:1: ( ruleStateType )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1470:1: ruleStateType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleStateType_in_rule__State__TypeAssignment_02934);
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1479:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1483:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1484:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1484:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1485:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_12965); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1494:1: rule__State__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__State__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1498:1: ( ( ruleElement ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1499:1: ( ruleElement )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1499:1: ( ruleElement )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1500:1: ruleElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStateAccess().getElementElementParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleElement_in_rule__State__ElementAssignment_32996);
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


    // $ANTLR start "rule__Transition__EventAssignment_0_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1509:1: rule__Transition__EventAssignment_0_1 : ( ruleEvent ) ;
    public final void rule__Transition__EventAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1513:1: ( ( ruleEvent ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1514:1: ( ruleEvent )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1514:1: ( ruleEvent )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1515:1: ruleEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleEvent_in_rule__Transition__EventAssignment_0_13027);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_0_1_0()); 
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
    // $ANTLR end "rule__Transition__EventAssignment_0_1"


    // $ANTLR start "rule__Transition__GuardAssignment_1_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1524:1: rule__Transition__GuardAssignment_1_1 : ( ruleGuard ) ;
    public final void rule__Transition__GuardAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1528:1: ( ( ruleGuard ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1529:1: ( ruleGuard )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1529:1: ( ruleGuard )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1530:1: ruleGuard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleGuard_in_rule__Transition__GuardAssignment_1_13058);
            ruleGuard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getGuardGuardParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Transition__GuardAssignment_1_1"


    // $ANTLR start "rule__Transition__ActionAssignment_2_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1539:1: rule__Transition__ActionAssignment_2_1 : ( ruleAction ) ;
    public final void rule__Transition__ActionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1543:1: ( ( ruleAction ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1544:1: ( ruleAction )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1544:1: ( ruleAction )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1545:1: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAction_in_rule__Transition__ActionAssignment_2_13089);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Transition__ActionAssignment_2_1"


    // $ANTLR start "rule__Transition__StateAssignment_4"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1554:1: rule__Transition__StateAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1558:1: ( ( ( RULE_ID ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1559:1: ( ( RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1559:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1560:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStateStateCrossReference_4_0()); 
            }
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1561:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1562:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_43124); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_4_0_1()); 
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


    // $ANTLR start "rule__Event__ValueAssignment"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1573:1: rule__Event__ValueAssignment : ( ruleCompositeString ) ;
    public final void rule__Event__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1577:1: ( ( ruleCompositeString ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1578:1: ( ruleCompositeString )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1578:1: ( ruleCompositeString )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1579:1: ruleCompositeString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getValueCompositeStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompositeString_in_rule__Event__ValueAssignment3159);
            ruleCompositeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getValueCompositeStringParserRuleCall_0()); 
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
    // $ANTLR end "rule__Event__ValueAssignment"


    // $ANTLR start "rule__Guard__ValueAssignment"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1588:1: rule__Guard__ValueAssignment : ( ruleCompositeString ) ;
    public final void rule__Guard__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1592:1: ( ( ruleCompositeString ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1593:1: ( ruleCompositeString )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1593:1: ( ruleCompositeString )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1594:1: ruleCompositeString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getGuardAccess().getValueCompositeStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompositeString_in_rule__Guard__ValueAssignment3190);
            ruleCompositeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getGuardAccess().getValueCompositeStringParserRuleCall_0()); 
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
    // $ANTLR end "rule__Guard__ValueAssignment"


    // $ANTLR start "rule__Action__ValueAssignment"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1603:1: rule__Action__ValueAssignment : ( ruleCompositeString ) ;
    public final void rule__Action__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1607:1: ( ( ruleCompositeString ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1608:1: ( ruleCompositeString )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1608:1: ( ruleCompositeString )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1609:1: ruleCompositeString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getValueCompositeStringParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleCompositeString_in_rule__Action__ValueAssignment3221);
            ruleCompositeString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getValueCompositeStringParserRuleCall_0()); 
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
    // $ANTLR end "rule__Action__ValueAssignment"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1618:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1622:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1623:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1623:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1624:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_13252); if (state.failed) return ;
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
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__ValueAssignment_in_ruleEvent400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__ValueAssignment_in_ruleGuard460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__ValueAssignment_in_ruleAction520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_entryRuleCompositeString547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeString554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompositeString__Alternatives_in_ruleCompositeString580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName669 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Element__Alternatives774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Element__Alternatives791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Transition__Alternatives_3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Transition__Alternatives_3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CompositeString__Alternatives878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONDITION_in_rule__CompositeString__Alternatives895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateType__Alternatives929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StateType__Alternatives950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StateType__Alternatives971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__0__Impl_in_rule__Statemodel__Group__01004 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__1_in_rule__Statemodel__Group__01007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__ImportsAssignment_0_in_rule__Statemodel__Group__0__Impl1034 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__1__Impl_in_rule__Statemodel__Group__11065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__StatemachineAssignment_1_in_rule__Statemodel__Group__1__Impl1092 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__01127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__01130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Statemachine__Group__0__Impl1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__11189 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__NameAssignment_1_in_rule__Statemachine__Group__1__Impl1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__21249 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__21252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Statemachine__Group__2__Impl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__31311 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__31314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__StateAssignment_3_in_rule__Statemachine__Group__3__Impl1341 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__41372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Statemachine__Group__4__Impl1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TypeAssignment_0_in_rule__State__Group__0__Impl1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11501 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21561 = new BitSet(new long[]{0x000000000079F030L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__State__Group__2__Impl1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31623 = new BitSet(new long[]{0x000000000079F030L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__ElementAssignment_3_in_rule__State__Group__3__Impl1653 = new BitSet(new long[]{0x000000000071F032L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__41684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__State__Group__4__Impl1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01753 = new BitSet(new long[]{0x0000000000703030L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__0_in_rule__Transition__Group__0__Impl1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11814 = new BitSet(new long[]{0x0000000000703030L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__0_in_rule__Transition__Group__1__Impl1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21875 = new BitSet(new long[]{0x0000000000703030L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_2__0_in_rule__Transition__Group__2__Impl1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__31936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__31939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_3_in_rule__Transition__Group__3__Impl1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__41996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_4_in_rule__Transition__Group__4__Impl2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__0__Impl_in_rule__Transition__Group_0__02063 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__1_in_rule__Transition__Group_0__02066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Transition__Group_0__0__Impl2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_0__1__Impl_in_rule__Transition__Group_0__12128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_0_1_in_rule__Transition__Group_0__1__Impl2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__0__Impl_in_rule__Transition__Group_1__02189 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__1_in_rule__Transition__Group_1__02192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Transition__Group_1__0__Impl2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_1__1__Impl_in_rule__Transition__Group_1__12253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_1_1_in_rule__Transition__Group_1__1__Impl2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_2__0__Impl_in_rule__Transition__Group_2__02314 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_rule__Transition__Group_2__1_in_rule__Transition__Group_2__02317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transition__Group_2__0__Impl2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_2__1__Impl_in_rule__Transition__Group_2__12378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ActionAssignment_2_1_in_rule__Transition__Group_2__1__Impl2405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02439 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Import__Group__0__Impl2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__02562 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__02565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__12621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl2648 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__02683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__02686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__QualifiedName__Group_1__0__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__12745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Statemodel__ImportsAssignment_02810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_rule__Statemodel__StatemachineAssignment_12841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Statemachine__NameAssignment_12872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Statemachine__StateAssignment_32903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__TypeAssignment_02934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_12965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__State__ElementAssignment_32996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Transition__EventAssignment_0_13027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__Transition__GuardAssignment_1_13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Transition__ActionAssignment_2_13089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_43124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_rule__Event__ValueAssignment3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_rule__Guard__ValueAssignment3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeString_in_rule__Action__ValueAssignment3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_13252 = new BitSet(new long[]{0x0000000000000002L});

}
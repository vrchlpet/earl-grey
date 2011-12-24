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

@SuppressWarnings("all")
public class InternalStatemodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "'initial'", "'final'", "'statemachine'", "'{'", "'}'", "'=>'", "'import'", "'.'"
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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:60:1: entryRuleStatemodel : ruleStatemodel EOF ;
    public final void entryRuleStatemodel() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:61:1: ( ruleStatemodel EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:62:1: ruleStatemodel EOF
            {
             before(grammarAccess.getStatemodelRule()); 
            pushFollow(FOLLOW_ruleStatemodel_in_entryRuleStatemodel61);
            ruleStatemodel();

            state._fsp--;

             after(grammarAccess.getStatemodelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemodel68); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:69:1: ruleStatemodel : ( ( rule__Statemodel__Group__0 ) ) ;
    public final void ruleStatemodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:73:2: ( ( ( rule__Statemodel__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:74:1: ( ( rule__Statemodel__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:74:1: ( ( rule__Statemodel__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:75:1: ( rule__Statemodel__Group__0 )
            {
             before(grammarAccess.getStatemodelAccess().getGroup()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:76:1: ( rule__Statemodel__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:76:2: rule__Statemodel__Group__0
            {
            pushFollow(FOLLOW_rule__Statemodel__Group__0_in_ruleStatemodel94);
            rule__Statemodel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemodelAccess().getGroup()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:88:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:89:1: ( ruleStatemachine EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:90:1: ruleStatemachine EOF
            {
             before(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_ruleStatemachine_in_entryRuleStatemachine121);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatemachine128); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:97:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:101:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:102:1: ( ( rule__Statemachine__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:102:1: ( ( rule__Statemachine__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:103:1: ( rule__Statemachine__Group__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:104:1: ( rule__Statemachine__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:104:2: rule__Statemachine__Group__0
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine154);
            rule__Statemachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:116:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:117:1: ( ruleState EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:118:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState181);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState188); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:125:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:129:2: ( ( ( rule__State__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:130:1: ( ( rule__State__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:130:1: ( ( rule__State__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:131:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:132:1: ( rule__State__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:132:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState214);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:144:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:145:1: ( ruleTransition EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:146:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition241);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition248); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:153:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:157:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:158:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:158:1: ( ( rule__Transition__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:159:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:160:1: ( rule__Transition__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:160:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition274);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:172:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:173:1: ( ruleEvent EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:174:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent301);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent308); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:181:1: ruleEvent : ( ( rule__Event__NameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:185:2: ( ( ( rule__Event__NameAssignment ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:186:1: ( ( rule__Event__NameAssignment ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:186:1: ( ( rule__Event__NameAssignment ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:187:1: ( rule__Event__NameAssignment )
            {
             before(grammarAccess.getEventAccess().getNameAssignment()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:188:1: ( rule__Event__NameAssignment )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:188:2: rule__Event__NameAssignment
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_in_ruleEvent334);
            rule__Event__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment()); 

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


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:200:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:201:1: ( ruleImport EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:202:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport361);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport368); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:209:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:213:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:214:1: ( ( rule__Import__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:214:1: ( ( rule__Import__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:215:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:216:1: ( rule__Import__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:216:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport394);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:228:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:229:1: ( ruleQualifiedName EOF )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:230:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName421);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName428); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:237:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:241:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:242:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:242:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:243:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:244:1: ( rule__QualifiedName__Group__0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:244:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName454);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:257:1: ruleStateType : ( ( rule__StateType__Alternatives ) ) ;
    public final void ruleStateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:261:1: ( ( ( rule__StateType__Alternatives ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:262:1: ( ( rule__StateType__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:262:1: ( ( rule__StateType__Alternatives ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:263:1: ( rule__StateType__Alternatives )
            {
             before(grammarAccess.getStateTypeAccess().getAlternatives()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:264:1: ( rule__StateType__Alternatives )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:264:2: rule__StateType__Alternatives
            {
            pushFollow(FOLLOW_rule__StateType__Alternatives_in_ruleStateType491);
            rule__StateType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStateTypeAccess().getAlternatives()); 

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


    // $ANTLR start "rule__StateType__Alternatives"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:275:1: rule__StateType__Alternatives : ( ( ( 'state' ) ) | ( ( 'initial' ) ) | ( ( 'final' ) ) );
    public final void rule__StateType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:279:1: ( ( ( 'state' ) ) | ( ( 'initial' ) ) | ( ( 'final' ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:280:1: ( ( 'state' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:280:1: ( ( 'state' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:281:1: ( 'state' )
                    {
                     before(grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:282:1: ( 'state' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:282:3: 'state'
                    {
                    match(input,11,FOLLOW_11_in_rule__StateType__Alternatives527); 

                    }

                     after(grammarAccess.getStateTypeAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:287:6: ( ( 'initial' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:287:6: ( ( 'initial' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:288:1: ( 'initial' )
                    {
                     before(grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:289:1: ( 'initial' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:289:3: 'initial'
                    {
                    match(input,12,FOLLOW_12_in_rule__StateType__Alternatives548); 

                    }

                     after(grammarAccess.getStateTypeAccess().getINITIALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:294:6: ( ( 'final' ) )
                    {
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:294:6: ( ( 'final' ) )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:295:1: ( 'final' )
                    {
                     before(grammarAccess.getStateTypeAccess().getFINALEnumLiteralDeclaration_2()); 
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:296:1: ( 'final' )
                    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:296:3: 'final'
                    {
                    match(input,13,FOLLOW_13_in_rule__StateType__Alternatives569); 

                    }

                     after(grammarAccess.getStateTypeAccess().getFINALEnumLiteralDeclaration_2()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:308:1: rule__Statemodel__Group__0 : rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1 ;
    public final void rule__Statemodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:312:1: ( rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:313:2: rule__Statemodel__Group__0__Impl rule__Statemodel__Group__1
            {
            pushFollow(FOLLOW_rule__Statemodel__Group__0__Impl_in_rule__Statemodel__Group__0602);
            rule__Statemodel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemodel__Group__1_in_rule__Statemodel__Group__0605);
            rule__Statemodel__Group__1();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:320:1: rule__Statemodel__Group__0__Impl : ( ( rule__Statemodel__ImportsAssignment_0 )* ) ;
    public final void rule__Statemodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:324:1: ( ( ( rule__Statemodel__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:325:1: ( ( rule__Statemodel__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:325:1: ( ( rule__Statemodel__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:326:1: ( rule__Statemodel__ImportsAssignment_0 )*
            {
             before(grammarAccess.getStatemodelAccess().getImportsAssignment_0()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:327:1: ( rule__Statemodel__ImportsAssignment_0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:327:2: rule__Statemodel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Statemodel__ImportsAssignment_0_in_rule__Statemodel__Group__0__Impl632);
            	    rule__Statemodel__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStatemodelAccess().getImportsAssignment_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:337:1: rule__Statemodel__Group__1 : rule__Statemodel__Group__1__Impl ;
    public final void rule__Statemodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:341:1: ( rule__Statemodel__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:342:2: rule__Statemodel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Statemodel__Group__1__Impl_in_rule__Statemodel__Group__1663);
            rule__Statemodel__Group__1__Impl();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:348:1: rule__Statemodel__Group__1__Impl : ( ( rule__Statemodel__StatemachineAssignment_1 )* ) ;
    public final void rule__Statemodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:352:1: ( ( ( rule__Statemodel__StatemachineAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:353:1: ( ( rule__Statemodel__StatemachineAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:353:1: ( ( rule__Statemodel__StatemachineAssignment_1 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:354:1: ( rule__Statemodel__StatemachineAssignment_1 )*
            {
             before(grammarAccess.getStatemodelAccess().getStatemachineAssignment_1()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:355:1: ( rule__Statemodel__StatemachineAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:355:2: rule__Statemodel__StatemachineAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Statemodel__StatemachineAssignment_1_in_rule__Statemodel__Group__1__Impl690);
            	    rule__Statemodel__StatemachineAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStatemodelAccess().getStatemachineAssignment_1()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:369:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:373:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:374:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0725);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0728);
            rule__Statemachine__Group__1();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:381:1: rule__Statemachine__Group__0__Impl : ( 'statemachine' ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:385:1: ( ( 'statemachine' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:386:1: ( 'statemachine' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:386:1: ( 'statemachine' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:387:1: 'statemachine'
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Statemachine__Group__0__Impl756); 
             after(grammarAccess.getStatemachineAccess().getStatemachineKeyword_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:400:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:404:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:405:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1787);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1790);
            rule__Statemachine__Group__2();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:412:1: rule__Statemachine__Group__1__Impl : ( ( rule__Statemachine__ReferenceAssignment_1 ) ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:416:1: ( ( ( rule__Statemachine__ReferenceAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:417:1: ( ( rule__Statemachine__ReferenceAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:417:1: ( ( rule__Statemachine__ReferenceAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:418:1: ( rule__Statemachine__ReferenceAssignment_1 )
            {
             before(grammarAccess.getStatemachineAccess().getReferenceAssignment_1()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:419:1: ( rule__Statemachine__ReferenceAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:419:2: rule__Statemachine__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Statemachine__ReferenceAssignment_1_in_rule__Statemachine__Group__1__Impl817);
            rule__Statemachine__ReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getReferenceAssignment_1()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:429:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:433:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:434:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__2847);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__2850);
            rule__Statemachine__Group__3();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:441:1: rule__Statemachine__Group__2__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:445:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:446:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:446:1: ( '{' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:447:1: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Statemachine__Group__2__Impl878); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:460:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:464:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:465:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__3909);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__3912);
            rule__Statemachine__Group__4();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:472:1: rule__Statemachine__Group__3__Impl : ( ( rule__Statemachine__StateAssignment_3 )* ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:476:1: ( ( ( rule__Statemachine__StateAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:477:1: ( ( rule__Statemachine__StateAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:477:1: ( ( rule__Statemachine__StateAssignment_3 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:478:1: ( rule__Statemachine__StateAssignment_3 )*
            {
             before(grammarAccess.getStatemachineAccess().getStateAssignment_3()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:479:1: ( rule__Statemachine__StateAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:479:2: rule__Statemachine__StateAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Statemachine__StateAssignment_3_in_rule__Statemachine__Group__3__Impl939);
            	    rule__Statemachine__StateAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getStateAssignment_3()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:489:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:493:1: ( rule__Statemachine__Group__4__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:494:2: rule__Statemachine__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__4970);
            rule__Statemachine__Group__4__Impl();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:500:1: rule__Statemachine__Group__4__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:504:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:505:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:505:1: ( '}' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:506:1: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Statemachine__Group__4__Impl998); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_4()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:529:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:533:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:534:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01039);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__01042);
            rule__State__Group__1();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:541:1: rule__State__Group__0__Impl : ( ( rule__State__TypeAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:545:1: ( ( ( rule__State__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:546:1: ( ( rule__State__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:546:1: ( ( rule__State__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:547:1: ( rule__State__TypeAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getTypeAssignment_0()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:548:1: ( rule__State__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:548:2: rule__State__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__State__TypeAssignment_0_in_rule__State__Group__0__Impl1069);
            rule__State__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getTypeAssignment_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:558:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:562:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:563:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11099);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__2_in_rule__State__Group__11102);
            rule__State__Group__2();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:570:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:574:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:575:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:575:1: ( ( rule__State__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:576:1: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:577:1: ( rule__State__NameAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:577:2: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1129);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:587:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:591:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:592:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21159);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__3_in_rule__State__Group__21162);
            rule__State__Group__3();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:599:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:603:1: ( ( '{' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:604:1: ( '{' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:604:1: ( '{' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:605:1: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__State__Group__2__Impl1190); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:618:1: rule__State__Group__3 : rule__State__Group__3__Impl rule__State__Group__4 ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:622:1: ( rule__State__Group__3__Impl rule__State__Group__4 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:623:2: rule__State__Group__3__Impl rule__State__Group__4
            {
            pushFollow(FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31221);
            rule__State__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__4_in_rule__State__Group__31224);
            rule__State__Group__4();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:630:1: rule__State__Group__3__Impl : ( ( rule__State__TransitionsAssignment_3 )* ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:634:1: ( ( ( rule__State__TransitionsAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:635:1: ( ( rule__State__TransitionsAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:635:1: ( ( rule__State__TransitionsAssignment_3 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:636:1: ( rule__State__TransitionsAssignment_3 )*
            {
             before(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:637:1: ( rule__State__TransitionsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:637:2: rule__State__TransitionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__3__Impl1251);
            	    rule__State__TransitionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStateAccess().getTransitionsAssignment_3()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:647:1: rule__State__Group__4 : rule__State__Group__4__Impl ;
    public final void rule__State__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:651:1: ( rule__State__Group__4__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:652:2: rule__State__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__41282);
            rule__State__Group__4__Impl();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:658:1: rule__State__Group__4__Impl : ( '}' ) ;
    public final void rule__State__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:662:1: ( ( '}' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:663:1: ( '}' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:663:1: ( '}' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:664:1: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__State__Group__4__Impl1310); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:687:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:691:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:692:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01351);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01354);
            rule__Transition__Group__1();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:699:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__EventAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:703:1: ( ( ( rule__Transition__EventAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:704:1: ( ( rule__Transition__EventAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:704:1: ( ( rule__Transition__EventAssignment_0 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:705:1: ( rule__Transition__EventAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_0()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:706:1: ( rule__Transition__EventAssignment_0 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:706:2: rule__Transition__EventAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl1381);
            rule__Transition__EventAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:716:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:720:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:721:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11411);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11414);
            rule__Transition__Group__2();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:728:1: rule__Transition__Group__1__Impl : ( '=>' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:732:1: ( ( '=>' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:733:1: ( '=>' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:733:1: ( '=>' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:734:1: '=>'
            {
             before(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,17,FOLLOW_17_in_rule__Transition__Group__1__Impl1442); 
             after(grammarAccess.getTransitionAccess().getEqualsSignGreaterThanSignKeyword_1()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:747:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:751:1: ( rule__Transition__Group__2__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:752:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21473);
            rule__Transition__Group__2__Impl();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:758:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__StateAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:762:1: ( ( ( rule__Transition__StateAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:763:1: ( ( rule__Transition__StateAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:763:1: ( ( rule__Transition__StateAssignment_2 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:764:1: ( rule__Transition__StateAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getStateAssignment_2()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:765:1: ( rule__Transition__StateAssignment_2 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:765:2: rule__Transition__StateAssignment_2
            {
            pushFollow(FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl1500);
            rule__Transition__StateAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getStateAssignment_2()); 

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


    // $ANTLR start "rule__Import__Group__0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:781:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:785:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:786:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01536);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01539);
            rule__Import__Group__1();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:793:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:797:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:798:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:798:1: ( 'import' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:799:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl1567); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:812:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:816:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:817:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11598);
            rule__Import__Group__1__Impl();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:823:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:827:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:828:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:828:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:829:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:830:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:830:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1625);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:844:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:848:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:849:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01659);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01662);
            rule__QualifiedName__Group__1();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:856:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:860:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:861:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:861:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:862:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1689); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:873:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:877:1: ( rule__QualifiedName__Group__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:878:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11718);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:884:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:888:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:889:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:889:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:890:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:891:1: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:891:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1745);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:905:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:909:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:910:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01780);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01783);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:917:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:921:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:922:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:922:1: ( '.' )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:923:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl1811); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:936:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:940:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:941:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11842);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:947:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:951:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:952:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:952:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:953:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1869); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:969:1: rule__Statemodel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Statemodel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:973:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:974:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:974:1: ( ruleImport )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:975:1: ruleImport
            {
             before(grammarAccess.getStatemodelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Statemodel__ImportsAssignment_01907);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getStatemodelAccess().getImportsImportParserRuleCall_0_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:984:1: rule__Statemodel__StatemachineAssignment_1 : ( ruleStatemachine ) ;
    public final void rule__Statemodel__StatemachineAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:988:1: ( ( ruleStatemachine ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:989:1: ( ruleStatemachine )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:989:1: ( ruleStatemachine )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:990:1: ruleStatemachine
            {
             before(grammarAccess.getStatemodelAccess().getStatemachineStatemachineParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatemachine_in_rule__Statemodel__StatemachineAssignment_11938);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemodelAccess().getStatemachineStatemachineParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Statemachine__ReferenceAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:999:1: rule__Statemachine__ReferenceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Statemachine__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1003:1: ( ( ( ruleQualifiedName ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1004:1: ( ( ruleQualifiedName ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1004:1: ( ( ruleQualifiedName ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1005:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getStatemachineAccess().getReferenceEntityCrossReference_1_0()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1006:1: ( ruleQualifiedName )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1007:1: ruleQualifiedName
            {
             before(grammarAccess.getStatemachineAccess().getReferenceEntityQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Statemachine__ReferenceAssignment_11973);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getReferenceEntityQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getReferenceEntityCrossReference_1_0()); 

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
    // $ANTLR end "rule__Statemachine__ReferenceAssignment_1"


    // $ANTLR start "rule__Statemachine__StateAssignment_3"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1018:1: rule__Statemachine__StateAssignment_3 : ( ruleState ) ;
    public final void rule__Statemachine__StateAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1022:1: ( ( ruleState ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1023:1: ( ruleState )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1023:1: ( ruleState )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1024:1: ruleState
            {
             before(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__Statemachine__StateAssignment_32008);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_3_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1033:1: rule__State__TypeAssignment_0 : ( ruleStateType ) ;
    public final void rule__State__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1037:1: ( ( ruleStateType ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1038:1: ( ruleStateType )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1038:1: ( ruleStateType )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1039:1: ruleStateType
            {
             before(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleStateType_in_rule__State__TypeAssignment_02039);
            ruleStateType();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTypeStateTypeEnumRuleCall_0_0()); 

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
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1048:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1052:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1053:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1053:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1054:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_12070); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

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


    // $ANTLR start "rule__State__TransitionsAssignment_3"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1063:1: rule__State__TransitionsAssignment_3 : ( ruleTransition ) ;
    public final void rule__State__TransitionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1067:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1068:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1068:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1069:1: ruleTransition
            {
             before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_32101);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__State__TransitionsAssignment_3"


    // $ANTLR start "rule__Transition__EventAssignment_0"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1078:1: rule__Transition__EventAssignment_0 : ( ruleEvent ) ;
    public final void rule__Transition__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1082:1: ( ( ruleEvent ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1083:1: ( ruleEvent )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1083:1: ( ruleEvent )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1084:1: ruleEvent
            {
             before(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEvent_in_rule__Transition__EventAssignment_02132);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_0_0()); 

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


    // $ANTLR start "rule__Transition__StateAssignment_2"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1093:1: rule__Transition__StateAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__StateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1097:1: ( ( ( RULE_ID ) ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1098:1: ( ( RULE_ID ) )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1098:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1099:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1100:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1101:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_22167); 
             after(grammarAccess.getTransitionAccess().getStateStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getStateStateCrossReference_2_0()); 

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
    // $ANTLR end "rule__Transition__StateAssignment_2"


    // $ANTLR start "rule__Event__NameAssignment"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1112:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1116:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1117:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1117:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1118:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment2202); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Event__NameAssignment"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1127:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1131:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1132:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1132:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.statemodel.ui/src-gen/cz/cvut/earlgrey/statemodel/ui/contentassist/antlr/internal/InternalStatemodel.g:1133:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_12233); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

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


 

    public static final BitSet FOLLOW_ruleStatemodel_in_entryRuleStatemodel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemodel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__0_in_ruleStatemodel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_entryRuleStatemachine121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatemachine128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0_in_ruleStatemachine154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_in_ruleEvent334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateType__Alternatives_in_ruleStateType491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__StateType__Alternatives527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StateType__Alternatives548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateType__Alternatives569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__0__Impl_in_rule__Statemodel__Group__0602 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__1_in_rule__Statemodel__Group__0605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__ImportsAssignment_0_in_rule__Statemodel__Group__0__Impl632 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Statemodel__Group__1__Impl_in_rule__Statemodel__Group__1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemodel__StatemachineAssignment_1_in_rule__Statemodel__Group__1__Impl690 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__0__Impl_in_rule__Statemachine__Group__0725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1_in_rule__Statemachine__Group__0728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Statemachine__Group__0__Impl756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__1__Impl_in_rule__Statemachine__Group__1787 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2_in_rule__Statemachine__Group__1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__ReferenceAssignment_1_in_rule__Statemachine__Group__1__Impl817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__2__Impl_in_rule__Statemachine__Group__2847 = new BitSet(new long[]{0x0000000000013800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3_in_rule__Statemachine__Group__2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Statemachine__Group__2__Impl878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__3__Impl_in_rule__Statemachine__Group__3909 = new BitSet(new long[]{0x0000000000013800L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4_in_rule__Statemachine__Group__3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statemachine__StateAssignment_3_in_rule__Statemachine__Group__3__Impl939 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_rule__Statemachine__Group__4__Impl_in_rule__Statemachine__Group__4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Statemachine__Group__4__Impl998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__01039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__01042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TypeAssignment_0_in_rule__State__Group__0__Impl1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__11099 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__State__Group__2_in_rule__State__Group__11102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_1_in_rule__State__Group__1__Impl1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__2__Impl_in_rule__State__Group__21159 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__State__Group__3_in_rule__State__Group__21162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__State__Group__2__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__3__Impl_in_rule__State__Group__31221 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__State__Group__4_in_rule__State__Group__31224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__TransitionsAssignment_3_in_rule__State__Group__3__Impl1251 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__State__Group__4__Impl_in_rule__State__Group__41282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__State__Group__4__Impl1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01351 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__EventAssignment_0_in_rule__Transition__Group__0__Impl1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Transition__Group__1__Impl1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__StateAssignment_2_in_rule__Transition__Group__2__Impl1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01536 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__01659 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__01662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl1745 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__01780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__01783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__QualifiedName__Group_1__0__Impl1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__11842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Statemodel__ImportsAssignment_01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatemachine_in_rule__Statemodel__StatemachineAssignment_11938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Statemachine__ReferenceAssignment_11973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__Statemachine__StateAssignment_32008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateType_in_rule__State__TypeAssignment_02039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_12070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__State__TransitionsAssignment_32101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Transition__EventAssignment_02132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__StateAssignment_22167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_12233 = new BitSet(new long[]{0x0000000000000002L});

}
package cz.cvut.earlgrey.sequencemodel.ui.contentassist.antlr.internal; 

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
import cz.cvut.earlgrey.sequencemodel.services.SequencemodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalSequencemodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_BOOLEAN", "RULE_NULL", "RULE_ID", "RULE_NATURAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'e'", "'E'", "'+'", "'-'", "'import'", "'sequence'", "'end'", "':'", "'('", "')'", "', '", "'new'", "'return '", "'@'", "','", "'='", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_NATURAL=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_NULL=6;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__19=19;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalSequencemodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSequencemodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSequencemodelParser.tokenNames; }
    public String getGrammarFileName() { return "../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g"; }


     
     	private SequencemodelGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SequencemodelGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleSequencemodel"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:61:1: entryRuleSequencemodel : ruleSequencemodel EOF ;
    public final void entryRuleSequencemodel() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:62:1: ( ruleSequencemodel EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:63:1: ruleSequencemodel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelRule()); 
            }
            pushFollow(FOLLOW_ruleSequencemodel_in_entryRuleSequencemodel67);
            ruleSequencemodel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequencemodelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequencemodel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSequencemodel"


    // $ANTLR start "ruleSequencemodel"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:70:1: ruleSequencemodel : ( ( rule__Sequencemodel__Group__0 ) ) ;
    public final void ruleSequencemodel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:74:2: ( ( ( rule__Sequencemodel__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:75:1: ( ( rule__Sequencemodel__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:75:1: ( ( rule__Sequencemodel__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:76:1: ( rule__Sequencemodel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:77:1: ( rule__Sequencemodel__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:77:2: rule__Sequencemodel__Group__0
            {
            pushFollow(FOLLOW_rule__Sequencemodel__Group__0_in_ruleSequencemodel100);
            rule__Sequencemodel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequencemodelAccess().getGroup()); 
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
    // $ANTLR end "ruleSequencemodel"


    // $ANTLR start "entryRuleImport"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:90:1: ( ruleImport EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport127);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport134); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:105:1: ( rule__Import__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport160);
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


    // $ANTLR start "entryRuleSequence"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:117:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:118:1: ( ruleSequence EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:119:1: ruleSequence EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceRule()); 
            }
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence187);
            ruleSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:126:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:130:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:131:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:131:1: ( ( rule__Sequence__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:132:1: ( rule__Sequence__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:133:1: ( rule__Sequence__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:133:2: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0_in_ruleSequence220);
            rule__Sequence__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getGroup()); 
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
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleParticipant"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:145:1: entryRuleParticipant : ruleParticipant EOF ;
    public final void entryRuleParticipant() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:146:1: ( ruleParticipant EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:147:1: ruleParticipant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantRule()); 
            }
            pushFollow(FOLLOW_ruleParticipant_in_entryRuleParticipant247);
            ruleParticipant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParticipant254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParticipant"


    // $ANTLR start "ruleParticipant"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:154:1: ruleParticipant : ( ( rule__Participant__Group__0 ) ) ;
    public final void ruleParticipant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:158:2: ( ( ( rule__Participant__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:159:1: ( ( rule__Participant__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:159:1: ( ( rule__Participant__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:160:1: ( rule__Participant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:161:1: ( rule__Participant__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:161:2: rule__Participant__Group__0
            {
            pushFollow(FOLLOW_rule__Participant__Group__0_in_ruleParticipant280);
            rule__Participant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getGroup()); 
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
    // $ANTLR end "ruleParticipant"


    // $ANTLR start "entryRuleTransition"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:173:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:174:1: ( ruleTransition EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:175:1: ruleTransition EOF
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:182:1: ruleTransition : ( ( rule__Transition__Alternatives ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:186:2: ( ( ( rule__Transition__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:187:1: ( ( rule__Transition__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:187:1: ( ( rule__Transition__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:188:1: ( rule__Transition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:189:1: ( rule__Transition__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:189:2: rule__Transition__Alternatives
            {
            pushFollow(FOLLOW_rule__Transition__Alternatives_in_ruleTransition340);
            rule__Transition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionAccess().getAlternatives()); 
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


    // $ANTLR start "entryRuleTransitionBlock"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:201:1: entryRuleTransitionBlock : ruleTransitionBlock EOF ;
    public final void entryRuleTransitionBlock() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:202:1: ( ruleTransitionBlock EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:203:1: ruleTransitionBlock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockRule()); 
            }
            pushFollow(FOLLOW_ruleTransitionBlock_in_entryRuleTransitionBlock367);
            ruleTransitionBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransitionBlock374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTransitionBlock"


    // $ANTLR start "ruleTransitionBlock"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:210:1: ruleTransitionBlock : ( ( rule__TransitionBlock__Group__0 ) ) ;
    public final void ruleTransitionBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:214:2: ( ( ( rule__TransitionBlock__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:215:1: ( ( rule__TransitionBlock__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:215:1: ( ( rule__TransitionBlock__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:216:1: ( rule__TransitionBlock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:217:1: ( rule__TransitionBlock__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:217:2: rule__TransitionBlock__Group__0
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__0_in_ruleTransitionBlock400);
            rule__TransitionBlock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getGroup()); 
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
    // $ANTLR end "ruleTransitionBlock"


    // $ANTLR start "entryRuleMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:229:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:230:1: ( ruleMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:231:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage427);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:238:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:242:2: ( ( ( rule__Message__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:243:1: ( ( rule__Message__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:243:1: ( ( rule__Message__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:244:1: ( rule__Message__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:245:1: ( rule__Message__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:245:2: rule__Message__Alternatives
            {
            pushFollow(FOLLOW_rule__Message__Alternatives_in_ruleMessage460);
            rule__Message__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageAccess().getAlternatives()); 
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleCallMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:257:1: entryRuleCallMessage : ruleCallMessage EOF ;
    public final void entryRuleCallMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:258:1: ( ruleCallMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:259:1: ruleCallMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageRule()); 
            }
            pushFollow(FOLLOW_ruleCallMessage_in_entryRuleCallMessage487);
            ruleCallMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallMessage494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCallMessage"


    // $ANTLR start "ruleCallMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:266:1: ruleCallMessage : ( ( rule__CallMessage__Group__0 ) ) ;
    public final void ruleCallMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:270:2: ( ( ( rule__CallMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:271:1: ( ( rule__CallMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:271:1: ( ( rule__CallMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:272:1: ( rule__CallMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:273:1: ( rule__CallMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:273:2: rule__CallMessage__Group__0
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__0_in_ruleCallMessage520);
            rule__CallMessage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup()); 
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
    // $ANTLR end "ruleCallMessage"


    // $ANTLR start "entryRuleNewMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:285:1: entryRuleNewMessage : ruleNewMessage EOF ;
    public final void entryRuleNewMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:286:1: ( ruleNewMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:287:1: ruleNewMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageRule()); 
            }
            pushFollow(FOLLOW_ruleNewMessage_in_entryRuleNewMessage547);
            ruleNewMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMessage554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNewMessage"


    // $ANTLR start "ruleNewMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:294:1: ruleNewMessage : ( ( rule__NewMessage__Group__0 ) ) ;
    public final void ruleNewMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:298:2: ( ( ( rule__NewMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:299:1: ( ( rule__NewMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:299:1: ( ( rule__NewMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:300:1: ( rule__NewMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:301:1: ( rule__NewMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:301:2: rule__NewMessage__Group__0
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__0_in_ruleNewMessage580);
            rule__NewMessage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getGroup()); 
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
    // $ANTLR end "ruleNewMessage"


    // $ANTLR start "entryRuleReturnMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:313:1: entryRuleReturnMessage : ruleReturnMessage EOF ;
    public final void entryRuleReturnMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:314:1: ( ruleReturnMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:315:1: ruleReturnMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageRule()); 
            }
            pushFollow(FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage607);
            ruleReturnMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnMessage614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReturnMessage"


    // $ANTLR start "ruleReturnMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:322:1: ruleReturnMessage : ( ( rule__ReturnMessage__Group__0 ) ) ;
    public final void ruleReturnMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:326:2: ( ( ( rule__ReturnMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:327:1: ( ( rule__ReturnMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:327:1: ( ( rule__ReturnMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:328:1: ( rule__ReturnMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:329:1: ( rule__ReturnMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:329:2: rule__ReturnMessage__Group__0
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__0_in_ruleReturnMessage640);
            rule__ReturnMessage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getGroup()); 
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
    // $ANTLR end "ruleReturnMessage"


    // $ANTLR start "entryRuleAnnotation"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:341:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:342:1: ( ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:343:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation667);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:350:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:354:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:355:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:355:1: ( ( rule__Annotation__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:356:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:357:1: ( rule__Annotation__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:357:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation700);
            rule__Annotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup()); 
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:369:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:370:1: ( ruleParameter EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:371:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter727);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:378:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:382:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:383:1: ( ( rule__Parameter__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:383:1: ( ( rule__Parameter__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:384:1: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:385:1: ( rule__Parameter__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:385:2: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_rule__Parameter__Alternatives_in_ruleParameter760);
            rule__Parameter__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getAlternatives()); 
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAssignParameter"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:397:1: entryRuleAssignParameter : ruleAssignParameter EOF ;
    public final void entryRuleAssignParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:398:1: ( ruleAssignParameter EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:399:1: ruleAssignParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterRule()); 
            }
            pushFollow(FOLLOW_ruleAssignParameter_in_entryRuleAssignParameter787);
            ruleAssignParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignParameter794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssignParameter"


    // $ANTLR start "ruleAssignParameter"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:406:1: ruleAssignParameter : ( ( rule__AssignParameter__Group__0 ) ) ;
    public final void ruleAssignParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:410:2: ( ( ( rule__AssignParameter__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:411:1: ( ( rule__AssignParameter__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:411:1: ( ( rule__AssignParameter__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:412:1: ( rule__AssignParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:413:1: ( rule__AssignParameter__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:413:2: rule__AssignParameter__Group__0
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__0_in_ruleAssignParameter820);
            rule__AssignParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignParameterAccess().getGroup()); 
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
    // $ANTLR end "ruleAssignParameter"


    // $ANTLR start "entryRuleValueParameter"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:425:1: entryRuleValueParameter : ruleValueParameter EOF ;
    public final void entryRuleValueParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:426:1: ( ruleValueParameter EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:427:1: ruleValueParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueParameterRule()); 
            }
            pushFollow(FOLLOW_ruleValueParameter_in_entryRuleValueParameter847);
            ruleValueParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueParameter854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleValueParameter"


    // $ANTLR start "ruleValueParameter"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:434:1: ruleValueParameter : ( ( rule__ValueParameter__ValueAssignment ) ) ;
    public final void ruleValueParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:438:2: ( ( ( rule__ValueParameter__ValueAssignment ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:439:1: ( ( rule__ValueParameter__ValueAssignment ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:439:1: ( ( rule__ValueParameter__ValueAssignment ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:440:1: ( rule__ValueParameter__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueParameterAccess().getValueAssignment()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:441:1: ( rule__ValueParameter__ValueAssignment )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:441:2: rule__ValueParameter__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ValueParameter__ValueAssignment_in_ruleValueParameter880);
            rule__ValueParameter__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueParameterAccess().getValueAssignment()); 
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
    // $ANTLR end "ruleValueParameter"


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:453:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:454:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:455:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue907);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue914); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:462:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:466:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:467:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:467:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:468:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:469:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:469:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue940);
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


    // $ANTLR start "entryRuleExtendedID"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:481:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:482:1: ( ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:483:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID967);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleExtendedID"


    // $ANTLR start "ruleExtendedID"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:490:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:494:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:495:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:495:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:496:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:497:1: ( rule__ExtendedID__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:497:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1000);
            rule__ExtendedID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getGroup()); 
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
    // $ANTLR end "ruleExtendedID"


    // $ANTLR start "entryRuleReal"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:513:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:514:1: ( ruleReal EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:515:1: ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal1031);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal1038); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:522:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:526:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:527:1: ( ( rule__Real__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:527:1: ( ( rule__Real__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:528:1: ( rule__Real__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:529:1: ( rule__Real__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:529:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal1064);
            rule__Real__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getGroup()); 
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
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:541:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:542:1: ( ruleInteger EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:543:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger1091);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger1098); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:550:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:554:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:555:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:555:1: ( ( rule__Integer__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:556:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:557:1: ( rule__Integer__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:557:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger1124);
            rule__Integer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getGroup()); 
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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "rule__Transition__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:569:1: rule__Transition__Alternatives : ( ( ruleTransitionBlock ) | ( ruleMessage ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:573:1: ( ( ruleTransitionBlock ) | ( ruleMessage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==20) ) {
                    alt1=1;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==19||LA1_1==21||(LA1_1>=24 && LA1_1<=25)) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>=24 && LA1_0<=25)) ) {
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:574:1: ( ruleTransitionBlock )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:574:1: ( ruleTransitionBlock )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:575:1: ruleTransitionBlock
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getTransitionBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleTransitionBlock_in_rule__Transition__Alternatives1160);
                    ruleTransitionBlock();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getTransitionBlockParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:580:6: ( ruleMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:580:6: ( ruleMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:581:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getMessageParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__Transition__Alternatives1177);
                    ruleMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getMessageParserRuleCall_1()); 
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
    // $ANTLR end "rule__Transition__Alternatives"


    // $ANTLR start "rule__Message__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:591:1: rule__Message__Alternatives : ( ( ruleCallMessage ) | ( ruleNewMessage ) | ( ruleReturnMessage ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:595:1: ( ( ruleCallMessage ) | ( ruleNewMessage ) | ( ruleReturnMessage ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:596:1: ( ruleCallMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:596:1: ( ruleCallMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:597:1: ruleCallMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getCallMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCallMessage_in_rule__Message__Alternatives1209);
                    ruleCallMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageAccess().getCallMessageParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:602:6: ( ruleNewMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:602:6: ( ruleNewMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:603:1: ruleNewMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getNewMessageParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNewMessage_in_rule__Message__Alternatives1226);
                    ruleNewMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageAccess().getNewMessageParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:608:6: ( ruleReturnMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:608:6: ( ruleReturnMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:609:1: ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getReturnMessageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_rule__Message__Alternatives1243);
                    ruleReturnMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageAccess().getReturnMessageParserRuleCall_2()); 
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
    // $ANTLR end "rule__Message__Alternatives"


    // $ANTLR start "rule__Parameter__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:619:1: rule__Parameter__Alternatives : ( ( ruleAssignParameter ) | ( ruleValueParameter ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:623:1: ( ( ruleAssignParameter ) | ( ruleValueParameter ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:624:1: ( ruleAssignParameter )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:624:1: ( ruleAssignParameter )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:625:1: ruleAssignParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getAssignParameterParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAssignParameter_in_rule__Parameter__Alternatives1275);
                    ruleAssignParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getAssignParameterParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:630:6: ( ruleValueParameter )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:630:6: ( ruleValueParameter )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:631:1: ruleValueParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getValueParameterParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValueParameter_in_rule__Parameter__Alternatives1292);
                    ruleValueParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterAccess().getValueParameterParserRuleCall_1()); 
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
    // $ANTLR end "rule__Parameter__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:641:1: rule__Value__Alternatives : ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:645:1: ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_NATURAL) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==EOF||LA4_2==22||LA4_2==27) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==29) ) {
                        alt4=6;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||LA4_2==22||LA4_2==27) ) {
                    alt4=1;
                }
                else if ( (LA4_2==29) ) {
                    alt4=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_ID:
                {
                alt4=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt4=4;
                }
                break;
            case RULE_NULL:
                {
                alt4=5;
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:646:1: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:646:1: ( ruleInteger )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:647:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__Value__Alternatives1324);
                    ruleInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:652:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:652:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:653:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives1341); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:658:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:658:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:659:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives1358);
                    ruleExtendedID();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:664:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:664:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:665:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives1375); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:670:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:670:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:671:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives1392); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:676:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:676:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:677:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__Value__Alternatives1409);
                    ruleReal();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
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


    // $ANTLR start "rule__Real__Alternatives_4_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:689:1: rule__Real__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:693:1: ( ( 'e' ) | ( 'E' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:694:1: ( 'e' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:694:1: ( 'e' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:695:1: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Real__Alternatives_4_01444); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:702:6: ( 'E' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:702:6: ( 'E' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:703:1: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Real__Alternatives_4_01464); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
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
    // $ANTLR end "rule__Real__Alternatives_4_0"


    // $ANTLR start "rule__Real__Alternatives_4_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:715:1: rule__Real__Alternatives_4_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:719:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:720:1: ( '+' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:720:1: ( '+' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:721:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Real__Alternatives_4_11499); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:728:6: ( '-' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:728:6: ( '-' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:729:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Real__Alternatives_4_11519); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
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
    // $ANTLR end "rule__Real__Alternatives_4_1"


    // $ANTLR start "rule__Sequencemodel__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:743:1: rule__Sequencemodel__Group__0 : rule__Sequencemodel__Group__0__Impl rule__Sequencemodel__Group__1 ;
    public final void rule__Sequencemodel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:747:1: ( rule__Sequencemodel__Group__0__Impl rule__Sequencemodel__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:748:2: rule__Sequencemodel__Group__0__Impl rule__Sequencemodel__Group__1
            {
            pushFollow(FOLLOW_rule__Sequencemodel__Group__0__Impl_in_rule__Sequencemodel__Group__01551);
            rule__Sequencemodel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequencemodel__Group__1_in_rule__Sequencemodel__Group__01554);
            rule__Sequencemodel__Group__1();

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
    // $ANTLR end "rule__Sequencemodel__Group__0"


    // $ANTLR start "rule__Sequencemodel__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:755:1: rule__Sequencemodel__Group__0__Impl : ( ( rule__Sequencemodel__ImportsAssignment_0 )* ) ;
    public final void rule__Sequencemodel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:759:1: ( ( ( rule__Sequencemodel__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:760:1: ( ( rule__Sequencemodel__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:760:1: ( ( rule__Sequencemodel__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:761:1: ( rule__Sequencemodel__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:762:1: ( rule__Sequencemodel__ImportsAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:762:2: rule__Sequencemodel__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Sequencemodel__ImportsAssignment_0_in_rule__Sequencemodel__Group__0__Impl1581);
            	    rule__Sequencemodel__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequencemodelAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__Sequencemodel__Group__0__Impl"


    // $ANTLR start "rule__Sequencemodel__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:772:1: rule__Sequencemodel__Group__1 : rule__Sequencemodel__Group__1__Impl ;
    public final void rule__Sequencemodel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:776:1: ( rule__Sequencemodel__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:777:2: rule__Sequencemodel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequencemodel__Group__1__Impl_in_rule__Sequencemodel__Group__11612);
            rule__Sequencemodel__Group__1__Impl();

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
    // $ANTLR end "rule__Sequencemodel__Group__1"


    // $ANTLR start "rule__Sequencemodel__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:783:1: rule__Sequencemodel__Group__1__Impl : ( ( rule__Sequencemodel__SequenceAssignment_1 )* ) ;
    public final void rule__Sequencemodel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:787:1: ( ( ( rule__Sequencemodel__SequenceAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:788:1: ( ( rule__Sequencemodel__SequenceAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:788:1: ( ( rule__Sequencemodel__SequenceAssignment_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:789:1: ( rule__Sequencemodel__SequenceAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getSequenceAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:790:1: ( rule__Sequencemodel__SequenceAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:790:2: rule__Sequencemodel__SequenceAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Sequencemodel__SequenceAssignment_1_in_rule__Sequencemodel__Group__1__Impl1639);
            	    rule__Sequencemodel__SequenceAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequencemodelAccess().getSequenceAssignment_1()); 
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
    // $ANTLR end "rule__Sequencemodel__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:804:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:808:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:809:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01674);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01677);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:816:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:820:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:821:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:821:1: ( 'import' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:822:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl1705); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:835:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:839:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:840:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11736);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:846:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:850:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:851:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:851:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:852:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:853:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:853:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1763);
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


    // $ANTLR start "rule__Sequence__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:867:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:871:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:872:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01797);
            rule__Sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01800);
            rule__Sequence__Group__1();

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
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:879:1: rule__Sequence__Group__0__Impl : ( ( rule__Sequence__AnnotationAssignment_0 )* ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:883:1: ( ( ( rule__Sequence__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:884:1: ( ( rule__Sequence__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:884:1: ( ( rule__Sequence__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:885:1: ( rule__Sequence__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:886:1: ( rule__Sequence__AnnotationAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:886:2: rule__Sequence__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__AnnotationAssignment_0_in_rule__Sequence__Group__0__Impl1827);
            	    rule__Sequence__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getAnnotationAssignment_0()); 
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
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:896:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:900:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:901:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11858);
            rule__Sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11861);
            rule__Sequence__Group__2();

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
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:908:1: rule__Sequence__Group__1__Impl : ( ( 'sequence' ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:912:1: ( ( ( 'sequence' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:913:1: ( ( 'sequence' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:913:1: ( ( 'sequence' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:914:1: ( 'sequence' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getSequenceKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:915:1: ( 'sequence' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:916:2: 'sequence'
            {
            match(input,18,FOLLOW_18_in_rule__Sequence__Group__1__Impl1890); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getSequenceKeyword_1()); 
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
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:927:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:931:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:932:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21922);
            rule__Sequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21925);
            rule__Sequence__Group__3();

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
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:939:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__NameAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:943:1: ( ( ( rule__Sequence__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:944:1: ( ( rule__Sequence__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:944:1: ( ( rule__Sequence__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:945:1: ( rule__Sequence__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:946:1: ( rule__Sequence__NameAssignment_2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:946:2: rule__Sequence__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_2_in_rule__Sequence__Group__2__Impl1952);
            rule__Sequence__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:956:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:960:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:961:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__31982);
            rule__Sequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__31985);
            rule__Sequence__Group__4();

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
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:968:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__ParticipantAssignment_3 )* ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:972:1: ( ( ( rule__Sequence__ParticipantAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:973:1: ( ( rule__Sequence__ParticipantAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:973:1: ( ( rule__Sequence__ParticipantAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:974:1: ( rule__Sequence__ParticipantAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getParticipantAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:975:1: ( rule__Sequence__ParticipantAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:975:2: rule__Sequence__ParticipantAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__ParticipantAssignment_3_in_rule__Sequence__Group__3__Impl2012);
            	    rule__Sequence__ParticipantAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getParticipantAssignment_3()); 
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
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:985:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:989:1: ( rule__Sequence__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:990:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42043);
            rule__Sequence__Group__4__Impl();

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
    // $ANTLR end "rule__Sequence__Group__4"


    // $ANTLR start "rule__Sequence__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:996:1: rule__Sequence__Group__4__Impl : ( 'end' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1000:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1001:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1001:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1002:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getEndKeyword_4()); 
            }
            match(input,19,FOLLOW_19_in_rule__Sequence__Group__4__Impl2071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__Sequence__Group__4__Impl"


    // $ANTLR start "rule__Participant__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1025:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1029:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1030:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
            {
            pushFollow(FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__02112);
            rule__Participant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__02115);
            rule__Participant__Group__1();

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
    // $ANTLR end "rule__Participant__Group__0"


    // $ANTLR start "rule__Participant__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1037:1: rule__Participant__Group__0__Impl : ( ( rule__Participant__NameAssignment_0 ) ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1041:1: ( ( ( rule__Participant__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1042:1: ( ( rule__Participant__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1042:1: ( ( rule__Participant__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1043:1: ( rule__Participant__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1044:1: ( rule__Participant__NameAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1044:2: rule__Participant__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Participant__NameAssignment_0_in_rule__Participant__Group__0__Impl2142);
            rule__Participant__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Participant__Group__0__Impl"


    // $ANTLR start "rule__Participant__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1054:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1058:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1059:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
            {
            pushFollow(FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__12172);
            rule__Participant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__12175);
            rule__Participant__Group__2();

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
    // $ANTLR end "rule__Participant__Group__1"


    // $ANTLR start "rule__Participant__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1066:1: rule__Participant__Group__1__Impl : ( ( rule__Participant__TransitionAssignment_1 )* ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1070:1: ( ( ( rule__Participant__TransitionAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1071:1: ( ( rule__Participant__TransitionAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1071:1: ( ( rule__Participant__TransitionAssignment_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1072:1: ( rule__Participant__TransitionAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getTransitionAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1073:1: ( rule__Participant__TransitionAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=24 && LA11_0<=25)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1073:2: rule__Participant__TransitionAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Participant__TransitionAssignment_1_in_rule__Participant__Group__1__Impl2202);
            	    rule__Participant__TransitionAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getTransitionAssignment_1()); 
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
    // $ANTLR end "rule__Participant__Group__1__Impl"


    // $ANTLR start "rule__Participant__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1083:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1087:1: ( rule__Participant__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1088:2: rule__Participant__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__22233);
            rule__Participant__Group__2__Impl();

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
    // $ANTLR end "rule__Participant__Group__2"


    // $ANTLR start "rule__Participant__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1094:1: rule__Participant__Group__2__Impl : ( 'end' ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1098:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1099:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1099:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1100:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getEndKeyword_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__Participant__Group__2__Impl2261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getEndKeyword_2()); 
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
    // $ANTLR end "rule__Participant__Group__2__Impl"


    // $ANTLR start "rule__TransitionBlock__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1119:1: rule__TransitionBlock__Group__0 : rule__TransitionBlock__Group__0__Impl rule__TransitionBlock__Group__1 ;
    public final void rule__TransitionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1123:1: ( rule__TransitionBlock__Group__0__Impl rule__TransitionBlock__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1124:2: rule__TransitionBlock__Group__0__Impl rule__TransitionBlock__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__0__Impl_in_rule__TransitionBlock__Group__02298);
            rule__TransitionBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group__1_in_rule__TransitionBlock__Group__02301);
            rule__TransitionBlock__Group__1();

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
    // $ANTLR end "rule__TransitionBlock__Group__0"


    // $ANTLR start "rule__TransitionBlock__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1131:1: rule__TransitionBlock__Group__0__Impl : ( ( rule__TransitionBlock__NameAssignment_0 ) ) ;
    public final void rule__TransitionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1135:1: ( ( ( rule__TransitionBlock__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1136:1: ( ( rule__TransitionBlock__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1136:1: ( ( rule__TransitionBlock__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1137:1: ( rule__TransitionBlock__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1138:1: ( rule__TransitionBlock__NameAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1138:2: rule__TransitionBlock__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__TransitionBlock__NameAssignment_0_in_rule__TransitionBlock__Group__0__Impl2328);
            rule__TransitionBlock__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__TransitionBlock__Group__0__Impl"


    // $ANTLR start "rule__TransitionBlock__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1148:1: rule__TransitionBlock__Group__1 : rule__TransitionBlock__Group__1__Impl rule__TransitionBlock__Group__2 ;
    public final void rule__TransitionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1152:1: ( rule__TransitionBlock__Group__1__Impl rule__TransitionBlock__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1153:2: rule__TransitionBlock__Group__1__Impl rule__TransitionBlock__Group__2
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__1__Impl_in_rule__TransitionBlock__Group__12358);
            rule__TransitionBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group__2_in_rule__TransitionBlock__Group__12361);
            rule__TransitionBlock__Group__2();

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
    // $ANTLR end "rule__TransitionBlock__Group__1"


    // $ANTLR start "rule__TransitionBlock__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1160:1: rule__TransitionBlock__Group__1__Impl : ( ':' ) ;
    public final void rule__TransitionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1164:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1165:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1165:1: ( ':' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1166:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getColonKeyword_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__TransitionBlock__Group__1__Impl2389); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getColonKeyword_1()); 
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
    // $ANTLR end "rule__TransitionBlock__Group__1__Impl"


    // $ANTLR start "rule__TransitionBlock__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1179:1: rule__TransitionBlock__Group__2 : rule__TransitionBlock__Group__2__Impl rule__TransitionBlock__Group__3 ;
    public final void rule__TransitionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1183:1: ( rule__TransitionBlock__Group__2__Impl rule__TransitionBlock__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1184:2: rule__TransitionBlock__Group__2__Impl rule__TransitionBlock__Group__3
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__2__Impl_in_rule__TransitionBlock__Group__22420);
            rule__TransitionBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group__3_in_rule__TransitionBlock__Group__22423);
            rule__TransitionBlock__Group__3();

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
    // $ANTLR end "rule__TransitionBlock__Group__2"


    // $ANTLR start "rule__TransitionBlock__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1191:1: rule__TransitionBlock__Group__2__Impl : ( ( rule__TransitionBlock__TransitionAssignment_2 )* ) ;
    public final void rule__TransitionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1195:1: ( ( ( rule__TransitionBlock__TransitionAssignment_2 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1196:1: ( ( rule__TransitionBlock__TransitionAssignment_2 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1196:1: ( ( rule__TransitionBlock__TransitionAssignment_2 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1197:1: ( rule__TransitionBlock__TransitionAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getTransitionAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1198:1: ( rule__TransitionBlock__TransitionAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=24 && LA12_0<=25)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1198:2: rule__TransitionBlock__TransitionAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TransitionBlock__TransitionAssignment_2_in_rule__TransitionBlock__Group__2__Impl2450);
            	    rule__TransitionBlock__TransitionAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getTransitionAssignment_2()); 
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
    // $ANTLR end "rule__TransitionBlock__Group__2__Impl"


    // $ANTLR start "rule__TransitionBlock__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1208:1: rule__TransitionBlock__Group__3 : rule__TransitionBlock__Group__3__Impl ;
    public final void rule__TransitionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1212:1: ( rule__TransitionBlock__Group__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1213:2: rule__TransitionBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__3__Impl_in_rule__TransitionBlock__Group__32481);
            rule__TransitionBlock__Group__3__Impl();

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
    // $ANTLR end "rule__TransitionBlock__Group__3"


    // $ANTLR start "rule__TransitionBlock__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1219:1: rule__TransitionBlock__Group__3__Impl : ( 'end' ) ;
    public final void rule__TransitionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1223:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1224:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1224:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1225:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getEndKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__TransitionBlock__Group__3__Impl2509); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getEndKeyword_3()); 
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
    // $ANTLR end "rule__TransitionBlock__Group__3__Impl"


    // $ANTLR start "rule__CallMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1246:1: rule__CallMessage__Group__0 : rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1 ;
    public final void rule__CallMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1250:1: ( rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1251:2: rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__0__Impl_in_rule__CallMessage__Group__02548);
            rule__CallMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__1_in_rule__CallMessage__Group__02551);
            rule__CallMessage__Group__1();

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
    // $ANTLR end "rule__CallMessage__Group__0"


    // $ANTLR start "rule__CallMessage__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1258:1: rule__CallMessage__Group__0__Impl : ( ( rule__CallMessage__NameAssignment_0 ) ) ;
    public final void rule__CallMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1262:1: ( ( ( rule__CallMessage__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1263:1: ( ( rule__CallMessage__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1263:1: ( ( rule__CallMessage__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1264:1: ( rule__CallMessage__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1265:1: ( rule__CallMessage__NameAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1265:2: rule__CallMessage__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__CallMessage__NameAssignment_0_in_rule__CallMessage__Group__0__Impl2578);
            rule__CallMessage__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__CallMessage__Group__0__Impl"


    // $ANTLR start "rule__CallMessage__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1275:1: rule__CallMessage__Group__1 : rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2 ;
    public final void rule__CallMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1279:1: ( rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1280:2: rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__1__Impl_in_rule__CallMessage__Group__12608);
            rule__CallMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__2_in_rule__CallMessage__Group__12611);
            rule__CallMessage__Group__2();

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
    // $ANTLR end "rule__CallMessage__Group__1"


    // $ANTLR start "rule__CallMessage__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1287:1: rule__CallMessage__Group__1__Impl : ( ( rule__CallMessage__Group_1__0 )? ) ;
    public final void rule__CallMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1291:1: ( ( ( rule__CallMessage__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1292:1: ( ( rule__CallMessage__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1292:1: ( ( rule__CallMessage__Group_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1293:1: ( rule__CallMessage__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1294:1: ( rule__CallMessage__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1294:2: rule__CallMessage__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__Group_1__0_in_rule__CallMessage__Group__1__Impl2638);
                    rule__CallMessage__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_1()); 
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
    // $ANTLR end "rule__CallMessage__Group__1__Impl"


    // $ANTLR start "rule__CallMessage__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1304:1: rule__CallMessage__Group__2 : rule__CallMessage__Group__2__Impl ;
    public final void rule__CallMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1308:1: ( rule__CallMessage__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1309:2: rule__CallMessage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__2__Impl_in_rule__CallMessage__Group__22669);
            rule__CallMessage__Group__2__Impl();

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
    // $ANTLR end "rule__CallMessage__Group__2"


    // $ANTLR start "rule__CallMessage__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1315:1: rule__CallMessage__Group__2__Impl : ( ( rule__CallMessage__ParticipantAssignment_2 )? ) ;
    public final void rule__CallMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1319:1: ( ( ( rule__CallMessage__ParticipantAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1320:1: ( ( rule__CallMessage__ParticipantAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1320:1: ( ( rule__CallMessage__ParticipantAssignment_2 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1321:1: ( rule__CallMessage__ParticipantAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParticipantAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1322:1: ( rule__CallMessage__ParticipantAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred19_InternalSequencemodel()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1322:2: rule__CallMessage__ParticipantAssignment_2
                    {
                    pushFollow(FOLLOW_rule__CallMessage__ParticipantAssignment_2_in_rule__CallMessage__Group__2__Impl2696);
                    rule__CallMessage__ParticipantAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParticipantAssignment_2()); 
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
    // $ANTLR end "rule__CallMessage__Group__2__Impl"


    // $ANTLR start "rule__CallMessage__Group_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1338:1: rule__CallMessage__Group_1__0 : rule__CallMessage__Group_1__0__Impl rule__CallMessage__Group_1__1 ;
    public final void rule__CallMessage__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1342:1: ( rule__CallMessage__Group_1__0__Impl rule__CallMessage__Group_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1343:2: rule__CallMessage__Group_1__0__Impl rule__CallMessage__Group_1__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_1__0__Impl_in_rule__CallMessage__Group_1__02733);
            rule__CallMessage__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_1__1_in_rule__CallMessage__Group_1__02736);
            rule__CallMessage__Group_1__1();

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
    // $ANTLR end "rule__CallMessage__Group_1__0"


    // $ANTLR start "rule__CallMessage__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1350:1: rule__CallMessage__Group_1__0__Impl : ( ( '(' ) ) ;
    public final void rule__CallMessage__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1354:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1355:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1355:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1356:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1357:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1358:2: '('
            {
            match(input,21,FOLLOW_21_in_rule__CallMessage__Group_1__0__Impl2765); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_1_0()); 
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
    // $ANTLR end "rule__CallMessage__Group_1__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1369:1: rule__CallMessage__Group_1__1 : rule__CallMessage__Group_1__1__Impl rule__CallMessage__Group_1__2 ;
    public final void rule__CallMessage__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1373:1: ( rule__CallMessage__Group_1__1__Impl rule__CallMessage__Group_1__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1374:2: rule__CallMessage__Group_1__1__Impl rule__CallMessage__Group_1__2
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_1__1__Impl_in_rule__CallMessage__Group_1__12797);
            rule__CallMessage__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_1__2_in_rule__CallMessage__Group_1__12800);
            rule__CallMessage__Group_1__2();

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
    // $ANTLR end "rule__CallMessage__Group_1__1"


    // $ANTLR start "rule__CallMessage__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1381:1: rule__CallMessage__Group_1__1__Impl : ( ( rule__CallMessage__Group_1_1__0 )? ) ;
    public final void rule__CallMessage__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1385:1: ( ( ( rule__CallMessage__Group_1_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1386:1: ( ( rule__CallMessage__Group_1_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1386:1: ( ( rule__CallMessage__Group_1_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1387:1: ( rule__CallMessage__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1388:1: ( rule__CallMessage__Group_1_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1388:2: rule__CallMessage__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__Group_1_1__0_in_rule__CallMessage__Group_1__1__Impl2827);
                    rule__CallMessage__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_1_1()); 
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
    // $ANTLR end "rule__CallMessage__Group_1__1__Impl"


    // $ANTLR start "rule__CallMessage__Group_1__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1398:1: rule__CallMessage__Group_1__2 : rule__CallMessage__Group_1__2__Impl ;
    public final void rule__CallMessage__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1402:1: ( rule__CallMessage__Group_1__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1403:2: rule__CallMessage__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_1__2__Impl_in_rule__CallMessage__Group_1__22858);
            rule__CallMessage__Group_1__2__Impl();

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
    // $ANTLR end "rule__CallMessage__Group_1__2"


    // $ANTLR start "rule__CallMessage__Group_1__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1409:1: rule__CallMessage__Group_1__2__Impl : ( ')' ) ;
    public final void rule__CallMessage__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1413:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1414:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1414:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1415:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__CallMessage__Group_1__2__Impl2886); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_1_2()); 
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
    // $ANTLR end "rule__CallMessage__Group_1__2__Impl"


    // $ANTLR start "rule__CallMessage__Group_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1434:1: rule__CallMessage__Group_1_1__0 : rule__CallMessage__Group_1_1__0__Impl rule__CallMessage__Group_1_1__1 ;
    public final void rule__CallMessage__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1438:1: ( rule__CallMessage__Group_1_1__0__Impl rule__CallMessage__Group_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1439:2: rule__CallMessage__Group_1_1__0__Impl rule__CallMessage__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_1_1__0__Impl_in_rule__CallMessage__Group_1_1__02923);
            rule__CallMessage__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_1_1__1_in_rule__CallMessage__Group_1_1__02926);
            rule__CallMessage__Group_1_1__1();

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
    // $ANTLR end "rule__CallMessage__Group_1_1__0"


    // $ANTLR start "rule__CallMessage__Group_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1446:1: rule__CallMessage__Group_1_1__0__Impl : ( ( rule__CallMessage__ParamAssignment_1_1_0 ) ) ;
    public final void rule__CallMessage__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1450:1: ( ( ( rule__CallMessage__ParamAssignment_1_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1451:1: ( ( rule__CallMessage__ParamAssignment_1_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1451:1: ( ( rule__CallMessage__ParamAssignment_1_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1452:1: ( rule__CallMessage__ParamAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParamAssignment_1_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1453:1: ( rule__CallMessage__ParamAssignment_1_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1453:2: rule__CallMessage__ParamAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__CallMessage__ParamAssignment_1_1_0_in_rule__CallMessage__Group_1_1__0__Impl2953);
            rule__CallMessage__ParamAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParamAssignment_1_1_0()); 
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
    // $ANTLR end "rule__CallMessage__Group_1_1__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1463:1: rule__CallMessage__Group_1_1__1 : rule__CallMessage__Group_1_1__1__Impl ;
    public final void rule__CallMessage__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1467:1: ( rule__CallMessage__Group_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1468:2: rule__CallMessage__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_1_1__1__Impl_in_rule__CallMessage__Group_1_1__12983);
            rule__CallMessage__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__CallMessage__Group_1_1__1"


    // $ANTLR start "rule__CallMessage__Group_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1474:1: rule__CallMessage__Group_1_1__1__Impl : ( ( rule__CallMessage__Group_1_1_1__0 )* ) ;
    public final void rule__CallMessage__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1478:1: ( ( ( rule__CallMessage__Group_1_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1479:1: ( ( rule__CallMessage__Group_1_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1479:1: ( ( rule__CallMessage__Group_1_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1480:1: ( rule__CallMessage__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1481:1: ( rule__CallMessage__Group_1_1_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1481:2: rule__CallMessage__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CallMessage__Group_1_1_1__0_in_rule__CallMessage__Group_1_1__1__Impl3010);
            	    rule__CallMessage__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_1_1_1()); 
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
    // $ANTLR end "rule__CallMessage__Group_1_1__1__Impl"


    // $ANTLR start "rule__CallMessage__Group_1_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1495:1: rule__CallMessage__Group_1_1_1__0 : rule__CallMessage__Group_1_1_1__0__Impl rule__CallMessage__Group_1_1_1__1 ;
    public final void rule__CallMessage__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1499:1: ( rule__CallMessage__Group_1_1_1__0__Impl rule__CallMessage__Group_1_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1500:2: rule__CallMessage__Group_1_1_1__0__Impl rule__CallMessage__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_1_1_1__0__Impl_in_rule__CallMessage__Group_1_1_1__03045);
            rule__CallMessage__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_1_1_1__1_in_rule__CallMessage__Group_1_1_1__03048);
            rule__CallMessage__Group_1_1_1__1();

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
    // $ANTLR end "rule__CallMessage__Group_1_1_1__0"


    // $ANTLR start "rule__CallMessage__Group_1_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1507:1: rule__CallMessage__Group_1_1_1__0__Impl : ( ( ', ' ) ) ;
    public final void rule__CallMessage__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1511:1: ( ( ( ', ' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1512:1: ( ( ', ' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1512:1: ( ( ', ' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1513:1: ( ', ' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getCommaSpaceKeyword_1_1_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1514:1: ( ', ' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1515:2: ', '
            {
            match(input,23,FOLLOW_23_in_rule__CallMessage__Group_1_1_1__0__Impl3077); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getCommaSpaceKeyword_1_1_1_0()); 
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
    // $ANTLR end "rule__CallMessage__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_1_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1526:1: rule__CallMessage__Group_1_1_1__1 : rule__CallMessage__Group_1_1_1__1__Impl ;
    public final void rule__CallMessage__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1530:1: ( rule__CallMessage__Group_1_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1531:2: rule__CallMessage__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_1_1_1__1__Impl_in_rule__CallMessage__Group_1_1_1__13109);
            rule__CallMessage__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__CallMessage__Group_1_1_1__1"


    // $ANTLR start "rule__CallMessage__Group_1_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1537:1: rule__CallMessage__Group_1_1_1__1__Impl : ( ( rule__CallMessage__ParamAssignment_1_1_1_1 ) ) ;
    public final void rule__CallMessage__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1541:1: ( ( ( rule__CallMessage__ParamAssignment_1_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1542:1: ( ( rule__CallMessage__ParamAssignment_1_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1542:1: ( ( rule__CallMessage__ParamAssignment_1_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1543:1: ( rule__CallMessage__ParamAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParamAssignment_1_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1544:1: ( rule__CallMessage__ParamAssignment_1_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1544:2: rule__CallMessage__ParamAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__CallMessage__ParamAssignment_1_1_1_1_in_rule__CallMessage__Group_1_1_1__1__Impl3136);
            rule__CallMessage__ParamAssignment_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParamAssignment_1_1_1_1()); 
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
    // $ANTLR end "rule__CallMessage__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__NewMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1558:1: rule__NewMessage__Group__0 : rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1 ;
    public final void rule__NewMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1562:1: ( rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1563:2: rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__0__Impl_in_rule__NewMessage__Group__03170);
            rule__NewMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group__1_in_rule__NewMessage__Group__03173);
            rule__NewMessage__Group__1();

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
    // $ANTLR end "rule__NewMessage__Group__0"


    // $ANTLR start "rule__NewMessage__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1570:1: rule__NewMessage__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1574:1: ( ( 'new' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1575:1: ( 'new' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1575:1: ( 'new' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1576:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getNewKeyword_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__NewMessage__Group__0__Impl3201); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getNewKeyword_0()); 
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
    // $ANTLR end "rule__NewMessage__Group__0__Impl"


    // $ANTLR start "rule__NewMessage__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1589:1: rule__NewMessage__Group__1 : rule__NewMessage__Group__1__Impl ;
    public final void rule__NewMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1593:1: ( rule__NewMessage__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1594:2: rule__NewMessage__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__1__Impl_in_rule__NewMessage__Group__13232);
            rule__NewMessage__Group__1__Impl();

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
    // $ANTLR end "rule__NewMessage__Group__1"


    // $ANTLR start "rule__NewMessage__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1600:1: rule__NewMessage__Group__1__Impl : ( ( rule__NewMessage__ParticipantAssignment_1 ) ) ;
    public final void rule__NewMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1604:1: ( ( ( rule__NewMessage__ParticipantAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1605:1: ( ( rule__NewMessage__ParticipantAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1605:1: ( ( rule__NewMessage__ParticipantAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1606:1: ( rule__NewMessage__ParticipantAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParticipantAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1607:1: ( rule__NewMessage__ParticipantAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1607:2: rule__NewMessage__ParticipantAssignment_1
            {
            pushFollow(FOLLOW_rule__NewMessage__ParticipantAssignment_1_in_rule__NewMessage__Group__1__Impl3259);
            rule__NewMessage__ParticipantAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParticipantAssignment_1()); 
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
    // $ANTLR end "rule__NewMessage__Group__1__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1621:1: rule__ReturnMessage__Group__0 : rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 ;
    public final void rule__ReturnMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1625:1: ( rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1626:2: rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__0__Impl_in_rule__ReturnMessage__Group__03293);
            rule__ReturnMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group__1_in_rule__ReturnMessage__Group__03296);
            rule__ReturnMessage__Group__1();

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
    // $ANTLR end "rule__ReturnMessage__Group__0"


    // $ANTLR start "rule__ReturnMessage__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1633:1: rule__ReturnMessage__Group__0__Impl : ( 'return ' ) ;
    public final void rule__ReturnMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1637:1: ( ( 'return ' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1638:1: ( 'return ' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1638:1: ( 'return ' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1639:1: 'return '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getReturnKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__ReturnMessage__Group__0__Impl3324); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getReturnKeyword_0()); 
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
    // $ANTLR end "rule__ReturnMessage__Group__0__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1652:1: rule__ReturnMessage__Group__1 : rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 ;
    public final void rule__ReturnMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1656:1: ( rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1657:2: rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__1__Impl_in_rule__ReturnMessage__Group__13355);
            rule__ReturnMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group__2_in_rule__ReturnMessage__Group__13358);
            rule__ReturnMessage__Group__2();

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
    // $ANTLR end "rule__ReturnMessage__Group__1"


    // $ANTLR start "rule__ReturnMessage__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1664:1: rule__ReturnMessage__Group__1__Impl : ( ( rule__ReturnMessage__NameAssignment_1 ) ) ;
    public final void rule__ReturnMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1668:1: ( ( ( rule__ReturnMessage__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1669:1: ( ( rule__ReturnMessage__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1669:1: ( ( rule__ReturnMessage__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1670:1: ( rule__ReturnMessage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1671:1: ( rule__ReturnMessage__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1671:2: rule__ReturnMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__NameAssignment_1_in_rule__ReturnMessage__Group__1__Impl3385);
            rule__ReturnMessage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__ReturnMessage__Group__1__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1681:1: rule__ReturnMessage__Group__2 : rule__ReturnMessage__Group__2__Impl ;
    public final void rule__ReturnMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1685:1: ( rule__ReturnMessage__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1686:2: rule__ReturnMessage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__2__Impl_in_rule__ReturnMessage__Group__23415);
            rule__ReturnMessage__Group__2__Impl();

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
    // $ANTLR end "rule__ReturnMessage__Group__2"


    // $ANTLR start "rule__ReturnMessage__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1692:1: rule__ReturnMessage__Group__2__Impl : ( ( rule__ReturnMessage__Group_2__0 )? ) ;
    public final void rule__ReturnMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1696:1: ( ( ( rule__ReturnMessage__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1697:1: ( ( rule__ReturnMessage__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1697:1: ( ( rule__ReturnMessage__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1698:1: ( rule__ReturnMessage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1699:1: ( rule__ReturnMessage__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1699:2: rule__ReturnMessage__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ReturnMessage__Group_2__0_in_rule__ReturnMessage__Group__2__Impl3442);
                    rule__ReturnMessage__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getGroup_2()); 
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
    // $ANTLR end "rule__ReturnMessage__Group__2__Impl"


    // $ANTLR start "rule__ReturnMessage__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1715:1: rule__ReturnMessage__Group_2__0 : rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1 ;
    public final void rule__ReturnMessage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1719:1: ( rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1720:2: rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__0__Impl_in_rule__ReturnMessage__Group_2__03479);
            rule__ReturnMessage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__1_in_rule__ReturnMessage__Group_2__03482);
            rule__ReturnMessage__Group_2__1();

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
    // $ANTLR end "rule__ReturnMessage__Group_2__0"


    // $ANTLR start "rule__ReturnMessage__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1727:1: rule__ReturnMessage__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__ReturnMessage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1731:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1732:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1732:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1733:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1734:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1735:2: '('
            {
            match(input,21,FOLLOW_21_in_rule__ReturnMessage__Group_2__0__Impl3511); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__ReturnMessage__Group_2__0__Impl"


    // $ANTLR start "rule__ReturnMessage__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1746:1: rule__ReturnMessage__Group_2__1 : rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2 ;
    public final void rule__ReturnMessage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1750:1: ( rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1751:2: rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__1__Impl_in_rule__ReturnMessage__Group_2__13543);
            rule__ReturnMessage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__2_in_rule__ReturnMessage__Group_2__13546);
            rule__ReturnMessage__Group_2__2();

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
    // $ANTLR end "rule__ReturnMessage__Group_2__1"


    // $ANTLR start "rule__ReturnMessage__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1758:1: rule__ReturnMessage__Group_2__1__Impl : ( ( rule__ReturnMessage__Group_2_1__0 )? ) ;
    public final void rule__ReturnMessage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1762:1: ( ( ( rule__ReturnMessage__Group_2_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1763:1: ( ( rule__ReturnMessage__Group_2_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1763:1: ( ( rule__ReturnMessage__Group_2_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1764:1: ( rule__ReturnMessage__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1765:1: ( rule__ReturnMessage__Group_2_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1765:2: rule__ReturnMessage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__0_in_rule__ReturnMessage__Group_2__1__Impl3573);
                    rule__ReturnMessage__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__ReturnMessage__Group_2__1__Impl"


    // $ANTLR start "rule__ReturnMessage__Group_2__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1775:1: rule__ReturnMessage__Group_2__2 : rule__ReturnMessage__Group_2__2__Impl ;
    public final void rule__ReturnMessage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1779:1: ( rule__ReturnMessage__Group_2__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1780:2: rule__ReturnMessage__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__2__Impl_in_rule__ReturnMessage__Group_2__23604);
            rule__ReturnMessage__Group_2__2__Impl();

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
    // $ANTLR end "rule__ReturnMessage__Group_2__2"


    // $ANTLR start "rule__ReturnMessage__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1786:1: rule__ReturnMessage__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ReturnMessage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1790:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1791:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1791:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1792:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,22,FOLLOW_22_in_rule__ReturnMessage__Group_2__2__Impl3632); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__ReturnMessage__Group_2__2__Impl"


    // $ANTLR start "rule__ReturnMessage__Group_2_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1811:1: rule__ReturnMessage__Group_2_1__0 : rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1 ;
    public final void rule__ReturnMessage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1815:1: ( rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1816:2: rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__0__Impl_in_rule__ReturnMessage__Group_2_1__03669);
            rule__ReturnMessage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__1_in_rule__ReturnMessage__Group_2_1__03672);
            rule__ReturnMessage__Group_2_1__1();

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
    // $ANTLR end "rule__ReturnMessage__Group_2_1__0"


    // $ANTLR start "rule__ReturnMessage__Group_2_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1823:1: rule__ReturnMessage__Group_2_1__0__Impl : ( ( rule__ReturnMessage__ParamAssignment_2_1_0 ) ) ;
    public final void rule__ReturnMessage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1827:1: ( ( ( rule__ReturnMessage__ParamAssignment_2_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1828:1: ( ( rule__ReturnMessage__ParamAssignment_2_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1828:1: ( ( rule__ReturnMessage__ParamAssignment_2_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1829:1: ( rule__ReturnMessage__ParamAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParamAssignment_2_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1830:1: ( rule__ReturnMessage__ParamAssignment_2_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1830:2: rule__ReturnMessage__ParamAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__ReturnMessage__ParamAssignment_2_1_0_in_rule__ReturnMessage__Group_2_1__0__Impl3699);
            rule__ReturnMessage__ParamAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getParamAssignment_2_1_0()); 
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
    // $ANTLR end "rule__ReturnMessage__Group_2_1__0__Impl"


    // $ANTLR start "rule__ReturnMessage__Group_2_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1840:1: rule__ReturnMessage__Group_2_1__1 : rule__ReturnMessage__Group_2_1__1__Impl ;
    public final void rule__ReturnMessage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1844:1: ( rule__ReturnMessage__Group_2_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1845:2: rule__ReturnMessage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__1__Impl_in_rule__ReturnMessage__Group_2_1__13729);
            rule__ReturnMessage__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__ReturnMessage__Group_2_1__1"


    // $ANTLR start "rule__ReturnMessage__Group_2_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1851:1: rule__ReturnMessage__Group_2_1__1__Impl : ( ( rule__ReturnMessage__Group_2_1_1__0 )* ) ;
    public final void rule__ReturnMessage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1855:1: ( ( ( rule__ReturnMessage__Group_2_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1856:1: ( ( rule__ReturnMessage__Group_2_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1856:1: ( ( rule__ReturnMessage__Group_2_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1857:1: ( rule__ReturnMessage__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1858:1: ( rule__ReturnMessage__Group_2_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1858:2: rule__ReturnMessage__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__0_in_rule__ReturnMessage__Group_2_1__1__Impl3756);
            	    rule__ReturnMessage__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getGroup_2_1_1()); 
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
    // $ANTLR end "rule__ReturnMessage__Group_2_1__1__Impl"


    // $ANTLR start "rule__ReturnMessage__Group_2_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1872:1: rule__ReturnMessage__Group_2_1_1__0 : rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1 ;
    public final void rule__ReturnMessage__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1876:1: ( rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1877:2: rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__0__Impl_in_rule__ReturnMessage__Group_2_1_1__03791);
            rule__ReturnMessage__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__1_in_rule__ReturnMessage__Group_2_1_1__03794);
            rule__ReturnMessage__Group_2_1_1__1();

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
    // $ANTLR end "rule__ReturnMessage__Group_2_1_1__0"


    // $ANTLR start "rule__ReturnMessage__Group_2_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1884:1: rule__ReturnMessage__Group_2_1_1__0__Impl : ( ( ', ' ) ) ;
    public final void rule__ReturnMessage__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1888:1: ( ( ( ', ' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1889:1: ( ( ', ' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1889:1: ( ( ', ' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1890:1: ( ', ' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getCommaSpaceKeyword_2_1_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1891:1: ( ', ' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1892:2: ', '
            {
            match(input,23,FOLLOW_23_in_rule__ReturnMessage__Group_2_1_1__0__Impl3823); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getCommaSpaceKeyword_2_1_1_0()); 
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
    // $ANTLR end "rule__ReturnMessage__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__ReturnMessage__Group_2_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1903:1: rule__ReturnMessage__Group_2_1_1__1 : rule__ReturnMessage__Group_2_1_1__1__Impl ;
    public final void rule__ReturnMessage__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1907:1: ( rule__ReturnMessage__Group_2_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1908:2: rule__ReturnMessage__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__1__Impl_in_rule__ReturnMessage__Group_2_1_1__13855);
            rule__ReturnMessage__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__ReturnMessage__Group_2_1_1__1"


    // $ANTLR start "rule__ReturnMessage__Group_2_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1914:1: rule__ReturnMessage__Group_2_1_1__1__Impl : ( ( rule__ReturnMessage__ParamAssignment_2_1_1_1 ) ) ;
    public final void rule__ReturnMessage__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1918:1: ( ( ( rule__ReturnMessage__ParamAssignment_2_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1919:1: ( ( rule__ReturnMessage__ParamAssignment_2_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1919:1: ( ( rule__ReturnMessage__ParamAssignment_2_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1920:1: ( rule__ReturnMessage__ParamAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParamAssignment_2_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1921:1: ( rule__ReturnMessage__ParamAssignment_2_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1921:2: rule__ReturnMessage__ParamAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__ParamAssignment_2_1_1_1_in_rule__ReturnMessage__Group_2_1_1__1__Impl3882);
            rule__ReturnMessage__ParamAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getParamAssignment_2_1_1_1()); 
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
    // $ANTLR end "rule__ReturnMessage__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1935:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1939:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1940:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03916);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03919);
            rule__Annotation__Group__1();

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1947:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1951:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1952:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1952:1: ( '@' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1953:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Annotation__Group__0__Impl3947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
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
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1966:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1970:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1971:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13978);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13981);
            rule__Annotation__Group__2();

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1978:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1982:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1983:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1983:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1984:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1985:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1985:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl4008);
            rule__Annotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1995:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1999:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2000:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__24038);
            rule__Annotation__Group__2__Impl();

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
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2006:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2010:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2011:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2011:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2012:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2013:1: ( rule__Annotation__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2013:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl4065);
                    rule__Annotation__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2029:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2033:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2034:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__04102);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__04105);
            rule__Annotation__Group_2__1();

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
    // $ANTLR end "rule__Annotation__Group_2__0"


    // $ANTLR start "rule__Annotation__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2041:1: rule__Annotation__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2045:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2046:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2046:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2047:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2048:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2049:2: '('
            {
            match(input,21,FOLLOW_21_in_rule__Annotation__Group_2__0__Impl4134); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__Annotation__Group_2__0__Impl"


    // $ANTLR start "rule__Annotation__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2060:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2064:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2065:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__14166);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__14169);
            rule__Annotation__Group_2__2();

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
    // $ANTLR end "rule__Annotation__Group_2__1"


    // $ANTLR start "rule__Annotation__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2072:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2076:1: ( ( ( rule__Annotation__ParameterAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2077:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2077:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2078:1: ( rule__Annotation__ParameterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2079:1: ( rule__Annotation__ParameterAssignment_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2079:2: rule__Annotation__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl4196);
            rule__Annotation__ParameterAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
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
    // $ANTLR end "rule__Annotation__Group_2__1__Impl"


    // $ANTLR start "rule__Annotation__Group_2__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2089:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2093:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2094:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__24226);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__24229);
            rule__Annotation__Group_2__3();

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
    // $ANTLR end "rule__Annotation__Group_2__2"


    // $ANTLR start "rule__Annotation__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2101:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2105:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2106:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2106:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2107:1: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2108:1: ( rule__Annotation__Group_2_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2108:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl4256);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
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
    // $ANTLR end "rule__Annotation__Group_2__2__Impl"


    // $ANTLR start "rule__Annotation__Group_2__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2118:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2122:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2123:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__34287);
            rule__Annotation__Group_2__3__Impl();

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
    // $ANTLR end "rule__Annotation__Group_2__3"


    // $ANTLR start "rule__Annotation__Group_2__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2129:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2133:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2134:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2134:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2135:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,22,FOLLOW_22_in_rule__Annotation__Group_2__3__Impl4315); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
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
    // $ANTLR end "rule__Annotation__Group_2__3__Impl"


    // $ANTLR start "rule__Annotation__Group_2_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2156:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2160:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2161:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__04354);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__04357);
            rule__Annotation__Group_2_2__1();

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
    // $ANTLR end "rule__Annotation__Group_2_2__0"


    // $ANTLR start "rule__Annotation__Group_2_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2168:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2172:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2173:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2173:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2174:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__Annotation__Group_2_2__0__Impl4385); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
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
    // $ANTLR end "rule__Annotation__Group_2_2__0__Impl"


    // $ANTLR start "rule__Annotation__Group_2_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2187:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2191:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2192:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__14416);
            rule__Annotation__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group_2_2__1"


    // $ANTLR start "rule__Annotation__Group_2_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2198:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2202:1: ( ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2203:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2203:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2204:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2205:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2205:2: rule__Annotation__ParameterAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl4443);
            rule__Annotation__ParameterAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
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
    // $ANTLR end "rule__Annotation__Group_2_2__1__Impl"


    // $ANTLR start "rule__AssignParameter__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2219:1: rule__AssignParameter__Group__0 : rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1 ;
    public final void rule__AssignParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2223:1: ( rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2224:2: rule__AssignParameter__Group__0__Impl rule__AssignParameter__Group__1
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__0__Impl_in_rule__AssignParameter__Group__04477);
            rule__AssignParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignParameter__Group__1_in_rule__AssignParameter__Group__04480);
            rule__AssignParameter__Group__1();

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
    // $ANTLR end "rule__AssignParameter__Group__0"


    // $ANTLR start "rule__AssignParameter__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2231:1: rule__AssignParameter__Group__0__Impl : ( ( rule__AssignParameter__NameAssignment_0 ) ) ;
    public final void rule__AssignParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2235:1: ( ( ( rule__AssignParameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2236:1: ( ( rule__AssignParameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2236:1: ( ( rule__AssignParameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2237:1: ( rule__AssignParameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2238:1: ( rule__AssignParameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2238:2: rule__AssignParameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AssignParameter__NameAssignment_0_in_rule__AssignParameter__Group__0__Impl4507);
            rule__AssignParameter__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignParameterAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__AssignParameter__Group__0__Impl"


    // $ANTLR start "rule__AssignParameter__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2248:1: rule__AssignParameter__Group__1 : rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2 ;
    public final void rule__AssignParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2252:1: ( rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2253:2: rule__AssignParameter__Group__1__Impl rule__AssignParameter__Group__2
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__1__Impl_in_rule__AssignParameter__Group__14537);
            rule__AssignParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssignParameter__Group__2_in_rule__AssignParameter__Group__14540);
            rule__AssignParameter__Group__2();

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
    // $ANTLR end "rule__AssignParameter__Group__1"


    // $ANTLR start "rule__AssignParameter__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2260:1: rule__AssignParameter__Group__1__Impl : ( '=' ) ;
    public final void rule__AssignParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2264:1: ( ( '=' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2265:1: ( '=' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2265:1: ( '=' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2266:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getEqualsSignKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__AssignParameter__Group__1__Impl4568); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignParameterAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__AssignParameter__Group__1__Impl"


    // $ANTLR start "rule__AssignParameter__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2279:1: rule__AssignParameter__Group__2 : rule__AssignParameter__Group__2__Impl ;
    public final void rule__AssignParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2283:1: ( rule__AssignParameter__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2284:2: rule__AssignParameter__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignParameter__Group__2__Impl_in_rule__AssignParameter__Group__24599);
            rule__AssignParameter__Group__2__Impl();

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
    // $ANTLR end "rule__AssignParameter__Group__2"


    // $ANTLR start "rule__AssignParameter__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2290:1: rule__AssignParameter__Group__2__Impl : ( ( rule__AssignParameter__ValueAssignment_2 ) ) ;
    public final void rule__AssignParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2294:1: ( ( ( rule__AssignParameter__ValueAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2295:1: ( ( rule__AssignParameter__ValueAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2295:1: ( ( rule__AssignParameter__ValueAssignment_2 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2296:1: ( rule__AssignParameter__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getValueAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2297:1: ( rule__AssignParameter__ValueAssignment_2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2297:2: rule__AssignParameter__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AssignParameter__ValueAssignment_2_in_rule__AssignParameter__Group__2__Impl4626);
            rule__AssignParameter__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignParameterAccess().getValueAssignment_2()); 
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
    // $ANTLR end "rule__AssignParameter__Group__2__Impl"


    // $ANTLR start "rule__ExtendedID__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2313:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2317:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2318:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__04662);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__04665);
            rule__ExtendedID__Group__1();

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
    // $ANTLR end "rule__ExtendedID__Group__0"


    // $ANTLR start "rule__ExtendedID__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2325:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2329:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2330:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2330:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2331:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl4692); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ExtendedID__Group__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2342:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2346:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2347:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__14721);
            rule__ExtendedID__Group__1__Impl();

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
    // $ANTLR end "rule__ExtendedID__Group__1"


    // $ANTLR start "rule__ExtendedID__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2353:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2357:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2358:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2358:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2359:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2360:1: ( rule__ExtendedID__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==29) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2360:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl4748);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ExtendedID__Group__1__Impl"


    // $ANTLR start "rule__ExtendedID__Group_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2374:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2378:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2379:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__04783);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__04786);
            rule__ExtendedID__Group_1__1();

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
    // $ANTLR end "rule__ExtendedID__Group_1__0"


    // $ANTLR start "rule__ExtendedID__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2386:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2390:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2391:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2391:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2392:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ExtendedID__Group_1__0__Impl4814); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
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
    // $ANTLR end "rule__ExtendedID__Group_1__0__Impl"


    // $ANTLR start "rule__ExtendedID__Group_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2405:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2409:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2410:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__14845);
            rule__ExtendedID__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExtendedID__Group_1__1"


    // $ANTLR start "rule__ExtendedID__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2416:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2420:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2421:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2421:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2422:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl4872); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__ExtendedID__Group_1__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2437:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2441:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2442:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__04905);
            rule__Real__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__04908);
            rule__Real__Group__1();

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
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2449:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2453:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2454:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2454:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2455:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2456:1: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2457:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__Real__Group__0__Impl4937); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2468:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2472:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2473:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__14970);
            rule__Real__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__14973);
            rule__Real__Group__2();

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
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2480:1: rule__Real__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2484:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2485:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2485:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2486:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl5000); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2497:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2501:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2502:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__25029);
            rule__Real__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__3_in_rule__Real__Group__25032);
            rule__Real__Group__3();

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
    // $ANTLR end "rule__Real__Group__2"


    // $ANTLR start "rule__Real__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2509:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2513:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2514:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2514:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2515:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Real__Group__2__Impl5060); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
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
    // $ANTLR end "rule__Real__Group__2__Impl"


    // $ANTLR start "rule__Real__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2528:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2532:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2533:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__35091);
            rule__Real__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__4_in_rule__Real__Group__35094);
            rule__Real__Group__4();

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
    // $ANTLR end "rule__Real__Group__3"


    // $ANTLR start "rule__Real__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2540:1: rule__Real__Group__3__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2544:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2545:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2545:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2546:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl5121); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__Real__Group__3__Impl"


    // $ANTLR start "rule__Real__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2557:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2561:1: ( rule__Real__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2562:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__45150);
            rule__Real__Group__4__Impl();

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
    // $ANTLR end "rule__Real__Group__4"


    // $ANTLR start "rule__Real__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2568:1: rule__Real__Group__4__Impl : ( ( rule__Real__Group_4__0 )? ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2572:1: ( ( ( rule__Real__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2573:1: ( ( rule__Real__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2573:1: ( ( rule__Real__Group_4__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2574:1: ( rule__Real__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2575:1: ( rule__Real__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=13 && LA24_0<=14)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2575:2: rule__Real__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl5177);
                    rule__Real__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Real__Group__4__Impl"


    // $ANTLR start "rule__Real__Group_4__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2595:1: rule__Real__Group_4__0 : rule__Real__Group_4__0__Impl rule__Real__Group_4__1 ;
    public final void rule__Real__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2599:1: ( rule__Real__Group_4__0__Impl rule__Real__Group_4__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2600:2: rule__Real__Group_4__0__Impl rule__Real__Group_4__1
            {
            pushFollow(FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__05218);
            rule__Real__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__05221);
            rule__Real__Group_4__1();

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
    // $ANTLR end "rule__Real__Group_4__0"


    // $ANTLR start "rule__Real__Group_4__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2607:1: rule__Real__Group_4__0__Impl : ( ( rule__Real__Alternatives_4_0 ) ) ;
    public final void rule__Real__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2611:1: ( ( ( rule__Real__Alternatives_4_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2612:1: ( ( rule__Real__Alternatives_4_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2612:1: ( ( rule__Real__Alternatives_4_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2613:1: ( rule__Real__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2614:1: ( rule__Real__Alternatives_4_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2614:2: rule__Real__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl5248);
            rule__Real__Alternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getAlternatives_4_0()); 
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
    // $ANTLR end "rule__Real__Group_4__0__Impl"


    // $ANTLR start "rule__Real__Group_4__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2624:1: rule__Real__Group_4__1 : rule__Real__Group_4__1__Impl rule__Real__Group_4__2 ;
    public final void rule__Real__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2628:1: ( rule__Real__Group_4__1__Impl rule__Real__Group_4__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2629:2: rule__Real__Group_4__1__Impl rule__Real__Group_4__2
            {
            pushFollow(FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__15278);
            rule__Real__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__15281);
            rule__Real__Group_4__2();

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
    // $ANTLR end "rule__Real__Group_4__1"


    // $ANTLR start "rule__Real__Group_4__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2636:1: rule__Real__Group_4__1__Impl : ( ( rule__Real__Alternatives_4_1 ) ) ;
    public final void rule__Real__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2640:1: ( ( ( rule__Real__Alternatives_4_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2641:1: ( ( rule__Real__Alternatives_4_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2641:1: ( ( rule__Real__Alternatives_4_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2642:1: ( rule__Real__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2643:1: ( rule__Real__Alternatives_4_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2643:2: rule__Real__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl5308);
            rule__Real__Alternatives_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getAlternatives_4_1()); 
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
    // $ANTLR end "rule__Real__Group_4__1__Impl"


    // $ANTLR start "rule__Real__Group_4__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2653:1: rule__Real__Group_4__2 : rule__Real__Group_4__2__Impl ;
    public final void rule__Real__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2657:1: ( rule__Real__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2658:2: rule__Real__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__25338);
            rule__Real__Group_4__2__Impl();

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
    // $ANTLR end "rule__Real__Group_4__2"


    // $ANTLR start "rule__Real__Group_4__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2664:1: rule__Real__Group_4__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2668:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2669:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2669:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2670:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl5365); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
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
    // $ANTLR end "rule__Real__Group_4__2__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2687:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2691:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2692:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__05400);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__05403);
            rule__Integer__Group__1();

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
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2699:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2703:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2704:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2704:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2705:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2706:1: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==16) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2707:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__Integer__Group__0__Impl5432); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2718:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2722:1: ( rule__Integer__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2723:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__15465);
            rule__Integer__Group__1__Impl();

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
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2729:1: rule__Integer__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2733:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2734:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2734:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2735:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl5492); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Sequencemodel__ImportsAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2751:1: rule__Sequencemodel__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Sequencemodel__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2755:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2756:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2756:1: ( ruleImport )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2757:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Sequencemodel__ImportsAssignment_05530);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequencemodelAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Sequencemodel__ImportsAssignment_0"


    // $ANTLR start "rule__Sequencemodel__SequenceAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2766:1: rule__Sequencemodel__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Sequencemodel__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2770:1: ( ( ruleSequence ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2771:1: ( ruleSequence )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2771:1: ( ruleSequence )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2772:1: ruleSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequencemodelAccess().getSequenceSequenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSequence_in_rule__Sequencemodel__SequenceAssignment_15561);
            ruleSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequencemodelAccess().getSequenceSequenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Sequencemodel__SequenceAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2781:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2785:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2786:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2786:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2787:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15592); if (state.failed) return ;
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


    // $ANTLR start "rule__Sequence__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2796:1: rule__Sequence__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Sequence__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2800:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2801:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2801:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2802:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Sequence__AnnotationAssignment_05623);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Sequence__AnnotationAssignment_0"


    // $ANTLR start "rule__Sequence__NameAssignment_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2811:1: rule__Sequence__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2815:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2816:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2816:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2817:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_25654); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Sequence__NameAssignment_2"


    // $ANTLR start "rule__Sequence__ParticipantAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2826:1: rule__Sequence__ParticipantAssignment_3 : ( ruleParticipant ) ;
    public final void rule__Sequence__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2830:1: ( ( ruleParticipant ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2831:1: ( ruleParticipant )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2831:1: ( ruleParticipant )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2832:1: ruleParticipant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleParticipant_in_rule__Sequence__ParticipantAssignment_35685);
            ruleParticipant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Sequence__ParticipantAssignment_3"


    // $ANTLR start "rule__Participant__NameAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2841:1: rule__Participant__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2845:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2846:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2846:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2847:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Participant__NameAssignment_05716); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Participant__NameAssignment_0"


    // $ANTLR start "rule__Participant__TransitionAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2856:1: rule__Participant__TransitionAssignment_1 : ( ruleTransition ) ;
    public final void rule__Participant__TransitionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2860:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2861:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2861:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2862:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getTransitionTransitionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__Participant__TransitionAssignment_15747);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getTransitionTransitionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Participant__TransitionAssignment_1"


    // $ANTLR start "rule__TransitionBlock__NameAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2871:1: rule__TransitionBlock__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__TransitionBlock__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2875:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2876:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2876:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2877:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TransitionBlock__NameAssignment_05778); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__TransitionBlock__NameAssignment_0"


    // $ANTLR start "rule__TransitionBlock__TransitionAssignment_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2886:1: rule__TransitionBlock__TransitionAssignment_2 : ( ruleMessage ) ;
    public final void rule__TransitionBlock__TransitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2890:1: ( ( ruleMessage ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2891:1: ( ruleMessage )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2891:1: ( ruleMessage )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2892:1: ruleMessage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getTransitionMessageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_rule__TransitionBlock__TransitionAssignment_25809);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getTransitionMessageParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__TransitionBlock__TransitionAssignment_2"


    // $ANTLR start "rule__CallMessage__NameAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2901:1: rule__CallMessage__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CallMessage__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2905:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2906:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2906:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2907:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__NameAssignment_05840); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__CallMessage__NameAssignment_0"


    // $ANTLR start "rule__CallMessage__ParamAssignment_1_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2916:1: rule__CallMessage__ParamAssignment_1_1_0 : ( RULE_ID ) ;
    public final void rule__CallMessage__ParamAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2920:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2921:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2921:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2922:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParamIDTerminalRuleCall_1_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__ParamAssignment_1_1_05871); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParamIDTerminalRuleCall_1_1_0_0()); 
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
    // $ANTLR end "rule__CallMessage__ParamAssignment_1_1_0"


    // $ANTLR start "rule__CallMessage__ParamAssignment_1_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2931:1: rule__CallMessage__ParamAssignment_1_1_1_1 : ( RULE_ID ) ;
    public final void rule__CallMessage__ParamAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2935:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2936:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2936:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2937:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParamIDTerminalRuleCall_1_1_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__ParamAssignment_1_1_1_15902); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParamIDTerminalRuleCall_1_1_1_1_0()); 
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
    // $ANTLR end "rule__CallMessage__ParamAssignment_1_1_1_1"


    // $ANTLR start "rule__CallMessage__ParticipantAssignment_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2946:1: rule__CallMessage__ParticipantAssignment_2 : ( RULE_ID ) ;
    public final void rule__CallMessage__ParticipantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2950:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2951:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2951:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2952:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParticipantIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__ParticipantAssignment_25933); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParticipantIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__CallMessage__ParticipantAssignment_2"


    // $ANTLR start "rule__NewMessage__ParticipantAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2961:1: rule__NewMessage__ParticipantAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewMessage__ParticipantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2965:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2966:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2966:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2967:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParticipantIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMessage__ParticipantAssignment_15964); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParticipantIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__NewMessage__ParticipantAssignment_1"


    // $ANTLR start "rule__ReturnMessage__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2976:1: rule__ReturnMessage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ReturnMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2980:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2981:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2981:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2982:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReturnMessage__NameAssignment_15995); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__ReturnMessage__NameAssignment_1"


    // $ANTLR start "rule__ReturnMessage__ParamAssignment_2_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2991:1: rule__ReturnMessage__ParamAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__ReturnMessage__ParamAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2995:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2996:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2996:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2997:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParamIDTerminalRuleCall_2_1_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReturnMessage__ParamAssignment_2_1_06026); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getParamIDTerminalRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__ReturnMessage__ParamAssignment_2_1_0"


    // $ANTLR start "rule__ReturnMessage__ParamAssignment_2_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3006:1: rule__ReturnMessage__ParamAssignment_2_1_1_1 : ( RULE_ID ) ;
    public final void rule__ReturnMessage__ParamAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3010:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3011:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3011:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3012:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParamIDTerminalRuleCall_2_1_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ReturnMessage__ParamAssignment_2_1_1_16057); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getParamIDTerminalRuleCall_2_1_1_1_0()); 
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
    // $ANTLR end "rule__ReturnMessage__ParamAssignment_2_1_1_1"


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3021:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3025:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3026:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3026:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3027:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_16088);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Annotation__NameAssignment_1"


    // $ANTLR start "rule__Annotation__ParameterAssignment_2_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3036:1: rule__Annotation__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3040:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3041:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3041:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3042:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_16119);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Annotation__ParameterAssignment_2_1"


    // $ANTLR start "rule__Annotation__ParameterAssignment_2_2_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3051:1: rule__Annotation__ParameterAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3055:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3056:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3056:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3057:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_16150);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
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
    // $ANTLR end "rule__Annotation__ParameterAssignment_2_2_1"


    // $ANTLR start "rule__AssignParameter__NameAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3066:1: rule__AssignParameter__NameAssignment_0 : ( ruleExtendedID ) ;
    public final void rule__AssignParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3070:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3071:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3071:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3072:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getNameExtendedIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__AssignParameter__NameAssignment_06181);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignParameterAccess().getNameExtendedIDParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__AssignParameter__NameAssignment_0"


    // $ANTLR start "rule__AssignParameter__ValueAssignment_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3081:1: rule__AssignParameter__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__AssignParameter__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3085:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3086:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3086:1: ( ruleValue )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3087:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssignParameterAccess().getValueValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__AssignParameter__ValueAssignment_26212);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssignParameterAccess().getValueValueParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__AssignParameter__ValueAssignment_2"


    // $ANTLR start "rule__ValueParameter__ValueAssignment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3096:1: rule__ValueParameter__ValueAssignment : ( ruleValue ) ;
    public final void rule__ValueParameter__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3100:1: ( ( ruleValue ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3101:1: ( ruleValue )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3101:1: ( ruleValue )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3102:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueParameterAccess().getValueValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ValueParameter__ValueAssignment6243);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueParameterAccess().getValueValueParserRuleCall_0()); 
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
    // $ANTLR end "rule__ValueParameter__ValueAssignment"

    // $ANTLR start synpred19_InternalSequencemodel
    public final void synpred19_InternalSequencemodel_fragment() throws RecognitionException {   
        // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1322:2: ( rule__CallMessage__ParticipantAssignment_2 )
        // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1322:2: rule__CallMessage__ParticipantAssignment_2
        {
        pushFollow(FOLLOW_rule__CallMessage__ParticipantAssignment_2_in_synpred19_InternalSequencemodel2696);
        rule__CallMessage__ParticipantAssignment_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalSequencemodel

    // Delegated rules

    public final boolean synpred19_InternalSequencemodel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalSequencemodel_fragment(); // can never throw exception
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
    static final String DFA3_eotS =
        "\6\uffff";
    static final String DFA3_eofS =
        "\1\uffff\1\2\3\uffff\1\2";
    static final String DFA3_minS =
        "\1\4\1\26\1\uffff\1\7\1\uffff\1\26";
    static final String DFA3_maxS =
        "\1\20\1\35\1\uffff\1\7\1\uffff\1\35";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\3\2\1\1\1\2\7\uffff\1\2",
            "\1\2\4\uffff\1\2\1\4\1\3",
            "",
            "\1\5",
            "",
            "\1\2\4\uffff\1\2\1\4\1\3"
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
            return "619:1: rule__Parameter__Alternatives : ( ( ruleAssignParameter ) | ( ruleValueParameter ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleSequencemodel_in_entryRuleSequencemodel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequencemodel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__Group__0_in_ruleSequencemodel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_entryRuleParticipant247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParticipant254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__0_in_ruleParticipant280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Alternatives_in_ruleTransition340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_entryRuleTransitionBlock367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransitionBlock374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__0_in_ruleTransitionBlock400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Alternatives_in_ruleMessage460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_entryRuleCallMessage487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallMessage494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__0_in_ruleCallMessage520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_entryRuleNewMessage547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMessage554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__0_in_ruleNewMessage580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnMessage614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__0_in_ruleReturnMessage640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Alternatives_in_ruleParameter760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignParameter_in_entryRuleAssignParameter787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignParameter794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__0_in_ruleAssignParameter820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueParameter_in_entryRuleValueParameter847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueParameter854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueParameter__ValueAssignment_in_ruleValueParameter880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal1031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_rule__Transition__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Transition__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_rule__Message__Alternatives1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_rule__Message__Alternatives1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_rule__Message__Alternatives1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignParameter_in_rule__Parameter__Alternatives1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueParameter_in_rule__Parameter__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Value__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__Alternatives1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Real__Alternatives_4_01444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Real__Alternatives_4_01464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Real__Alternatives_4_11499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Alternatives_4_11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__Group__0__Impl_in_rule__Sequencemodel__Group__01551 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_rule__Sequencemodel__Group__1_in_rule__Sequencemodel__Group__01554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__ImportsAssignment_0_in_rule__Sequencemodel__Group__0__Impl1581 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__Group__1__Impl_in_rule__Sequencemodel__Group__11612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequencemodel__SequenceAssignment_1_in_rule__Sequencemodel__Group__1__Impl1639 = new BitSet(new long[]{0x0000000004040002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__01674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__01677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01797 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__AnnotationAssignment_0_in_rule__Sequence__Group__0__Impl1827 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11858 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Sequence__Group__1__Impl1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21922 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_2_in_rule__Sequence__Group__2__Impl1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__31982 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__31985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ParticipantAssignment_3_in_rule__Sequence__Group__3__Impl2012 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sequence__Group__4__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__02112 = new BitSet(new long[]{0x0000000003080080L});
    public static final BitSet FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__02115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__NameAssignment_0_in_rule__Participant__Group__0__Impl2142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__12172 = new BitSet(new long[]{0x0000000003080080L});
    public static final BitSet FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__12175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__TransitionAssignment_1_in_rule__Participant__Group__1__Impl2202 = new BitSet(new long[]{0x0000000003000082L});
    public static final BitSet FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__22233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Participant__Group__2__Impl2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__0__Impl_in_rule__TransitionBlock__Group__02298 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__1_in_rule__TransitionBlock__Group__02301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__NameAssignment_0_in_rule__TransitionBlock__Group__0__Impl2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__1__Impl_in_rule__TransitionBlock__Group__12358 = new BitSet(new long[]{0x0000000003080080L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__2_in_rule__TransitionBlock__Group__12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TransitionBlock__Group__1__Impl2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__2__Impl_in_rule__TransitionBlock__Group__22420 = new BitSet(new long[]{0x0000000003080080L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__3_in_rule__TransitionBlock__Group__22423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__TransitionAssignment_2_in_rule__TransitionBlock__Group__2__Impl2450 = new BitSet(new long[]{0x0000000003000082L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__3__Impl_in_rule__TransitionBlock__Group__32481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TransitionBlock__Group__3__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__0__Impl_in_rule__CallMessage__Group__02548 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__1_in_rule__CallMessage__Group__02551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__NameAssignment_0_in_rule__CallMessage__Group__0__Impl2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__1__Impl_in_rule__CallMessage__Group__12608 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__2_in_rule__CallMessage__Group__12611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1__0_in_rule__CallMessage__Group__1__Impl2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__2__Impl_in_rule__CallMessage__Group__22669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParticipantAssignment_2_in_rule__CallMessage__Group__2__Impl2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1__0__Impl_in_rule__CallMessage__Group_1__02733 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1__1_in_rule__CallMessage__Group_1__02736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CallMessage__Group_1__0__Impl2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1__1__Impl_in_rule__CallMessage__Group_1__12797 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1__2_in_rule__CallMessage__Group_1__12800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1_1__0_in_rule__CallMessage__Group_1__1__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1__2__Impl_in_rule__CallMessage__Group_1__22858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CallMessage__Group_1__2__Impl2886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1_1__0__Impl_in_rule__CallMessage__Group_1_1__02923 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1_1__1_in_rule__CallMessage__Group_1_1__02926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParamAssignment_1_1_0_in_rule__CallMessage__Group_1_1__0__Impl2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1_1__1__Impl_in_rule__CallMessage__Group_1_1__12983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1_1_1__0_in_rule__CallMessage__Group_1_1__1__Impl3010 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1_1_1__0__Impl_in_rule__CallMessage__Group_1_1_1__03045 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1_1_1__1_in_rule__CallMessage__Group_1_1_1__03048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CallMessage__Group_1_1_1__0__Impl3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_1_1_1__1__Impl_in_rule__CallMessage__Group_1_1_1__13109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParamAssignment_1_1_1_1_in_rule__CallMessage__Group_1_1_1__1__Impl3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__0__Impl_in_rule__NewMessage__Group__03170 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__1_in_rule__NewMessage__Group__03173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NewMessage__Group__0__Impl3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__1__Impl_in_rule__NewMessage__Group__13232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__ParticipantAssignment_1_in_rule__NewMessage__Group__1__Impl3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__0__Impl_in_rule__ReturnMessage__Group__03293 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__1_in_rule__ReturnMessage__Group__03296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ReturnMessage__Group__0__Impl3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__1__Impl_in_rule__ReturnMessage__Group__13355 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__2_in_rule__ReturnMessage__Group__13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__NameAssignment_1_in_rule__ReturnMessage__Group__1__Impl3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__2__Impl_in_rule__ReturnMessage__Group__23415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__0_in_rule__ReturnMessage__Group__2__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__0__Impl_in_rule__ReturnMessage__Group_2__03479 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__1_in_rule__ReturnMessage__Group_2__03482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ReturnMessage__Group_2__0__Impl3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__1__Impl_in_rule__ReturnMessage__Group_2__13543 = new BitSet(new long[]{0x0000000000400080L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__2_in_rule__ReturnMessage__Group_2__13546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__0_in_rule__ReturnMessage__Group_2__1__Impl3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__2__Impl_in_rule__ReturnMessage__Group_2__23604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReturnMessage__Group_2__2__Impl3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__0__Impl_in_rule__ReturnMessage__Group_2_1__03669 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__1_in_rule__ReturnMessage__Group_2_1__03672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__ParamAssignment_2_1_0_in_rule__ReturnMessage__Group_2_1__0__Impl3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__1__Impl_in_rule__ReturnMessage__Group_2_1__13729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__0_in_rule__ReturnMessage__Group_2_1__1__Impl3756 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__0__Impl_in_rule__ReturnMessage__Group_2_1_1__03791 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__1_in_rule__ReturnMessage__Group_2_1_1__03794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReturnMessage__Group_2_1_1__0__Impl3823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__1__Impl_in_rule__ReturnMessage__Group_2_1_1__13855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__ParamAssignment_2_1_1_1_in_rule__ReturnMessage__Group_2_1_1__1__Impl3882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03916 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Annotation__Group__0__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13978 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__24038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__04102 = new BitSet(new long[]{0x00000000000101F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__04105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Annotation__Group_2__0__Impl4134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__14166 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__14169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl4196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__24226 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__24229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl4256 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__34287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Annotation__Group_2__3__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__04354 = new BitSet(new long[]{0x00000000000101F0L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__04357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Annotation__Group_2_2__0__Impl4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__14416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__0__Impl_in_rule__AssignParameter__Group__04477 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__1_in_rule__AssignParameter__Group__04480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__NameAssignment_0_in_rule__AssignParameter__Group__0__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__1__Impl_in_rule__AssignParameter__Group__14537 = new BitSet(new long[]{0x00000000000101F0L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__2_in_rule__AssignParameter__Group__14540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AssignParameter__Group__1__Impl4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__Group__2__Impl_in_rule__AssignParameter__Group__24599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignParameter__ValueAssignment_2_in_rule__AssignParameter__Group__2__Impl4626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__04662 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__04665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__14721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl4748 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__04783 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__04786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ExtendedID__Group_1__0__Impl4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__14845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__04905 = new BitSet(new long[]{0x00000000000101F0L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__04908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Group__0__Impl4937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__14970 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__14973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__25029 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Real__Group__3_in_rule__Real__Group__25032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Real__Group__2__Impl5060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__35091 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Real__Group__4_in_rule__Real__Group__35094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__45150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__05218 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__05221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl5248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__15278 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__15281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__25338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__05400 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__05403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Integer__Group__0__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__15465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Sequencemodel__ImportsAssignment_05530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Sequencemodel__SequenceAssignment_15561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_15592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Sequence__AnnotationAssignment_05623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_25654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_rule__Sequence__ParticipantAssignment_35685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Participant__NameAssignment_05716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Participant__TransitionAssignment_15747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TransitionBlock__NameAssignment_05778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__TransitionBlock__TransitionAssignment_25809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__NameAssignment_05840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__ParamAssignment_1_1_05871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__ParamAssignment_1_1_1_15902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__ParticipantAssignment_25933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMessage__ParticipantAssignment_15964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReturnMessage__NameAssignment_15995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReturnMessage__ParamAssignment_2_1_06026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ReturnMessage__ParamAssignment_2_1_1_16057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_16088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_16119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_16150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__AssignParameter__NameAssignment_06181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__AssignParameter__ValueAssignment_26212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ValueParameter__ValueAssignment6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParticipantAssignment_2_in_synpred19_InternalSequencemodel2696 = new BitSet(new long[]{0x0000000000000002L});

}
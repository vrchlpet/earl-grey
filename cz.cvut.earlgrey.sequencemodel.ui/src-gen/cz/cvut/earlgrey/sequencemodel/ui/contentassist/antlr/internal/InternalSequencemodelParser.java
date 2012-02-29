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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_OPERATOR", "RULE_ANY_OTHER", "RULE_WS", "RULE_STRING", "RULE_BOOLEAN", "RULE_NULL", "RULE_NATURAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "'e'", "'E'", "'+'", "'-'", "'import'", "'sequence'", "'end'", "'def'", "'('", "')'", "','", "'if'", "'then'", "'elsif'", "'else'", "'foreach'", "'do'", "'while'", "'assert'", "'break'", "'next'", "'.'", "'new'", "'return '", "'delete '", "':'", "'['", "']'", "'in'", "'..'", "'@'"
    };
    public static final int RULE_BOOLEAN=9;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=6;
    public static final int T__20=20;
    public static final int RULE_NATURAL=11;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_NULL=10;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OPERATOR=5;
    public static final int RULE_WS=7;

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




    // $ANTLR start "entryRuleModel"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:62:1: ( ruleModel EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:77:1: ( rule__Model__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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
    // $ANTLR end "ruleModel"


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


    // $ANTLR start "entryRuleFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:229:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:230:1: ( ruleFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:231:1: ruleFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleFragment_in_entryRuleFragment427);
            ruleFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFragment434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:238:1: ruleFragment : ( ( rule__Fragment__Alternatives ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:242:2: ( ( ( rule__Fragment__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:243:1: ( ( rule__Fragment__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:243:1: ( ( rule__Fragment__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:244:1: ( rule__Fragment__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFragmentAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:245:1: ( rule__Fragment__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:245:2: rule__Fragment__Alternatives
            {
            pushFollow(FOLLOW_rule__Fragment__Alternatives_in_ruleFragment460);
            rule__Fragment__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFragmentAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleIfElseFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:257:1: entryRuleIfElseFragment : ruleIfElseFragment EOF ;
    public final void entryRuleIfElseFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:258:1: ( ruleIfElseFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:259:1: ruleIfElseFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment487);
            ruleIfElseFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfElseFragment494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleIfElseFragment"


    // $ANTLR start "ruleIfElseFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:266:1: ruleIfElseFragment : ( ( rule__IfElseFragment__Group__0 ) ) ;
    public final void ruleIfElseFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:270:2: ( ( ( rule__IfElseFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:271:1: ( ( rule__IfElseFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:271:1: ( ( rule__IfElseFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:272:1: ( rule__IfElseFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:273:1: ( rule__IfElseFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:273:2: rule__IfElseFragment__Group__0
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__0_in_ruleIfElseFragment520);
            rule__IfElseFragment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getGroup()); 
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
    // $ANTLR end "ruleIfElseFragment"


    // $ANTLR start "entryRuleForeachFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:285:1: entryRuleForeachFragment : ruleForeachFragment EOF ;
    public final void entryRuleForeachFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:286:1: ( ruleForeachFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:287:1: ruleForeachFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment547);
            ruleForeachFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachFragment554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleForeachFragment"


    // $ANTLR start "ruleForeachFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:294:1: ruleForeachFragment : ( ( rule__ForeachFragment__Group__0 ) ) ;
    public final void ruleForeachFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:298:2: ( ( ( rule__ForeachFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:299:1: ( ( rule__ForeachFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:299:1: ( ( rule__ForeachFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:300:1: ( rule__ForeachFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:301:1: ( rule__ForeachFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:301:2: rule__ForeachFragment__Group__0
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__0_in_ruleForeachFragment580);
            rule__ForeachFragment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentAccess().getGroup()); 
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
    // $ANTLR end "ruleForeachFragment"


    // $ANTLR start "entryRuleLoopFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:313:1: entryRuleLoopFragment : ruleLoopFragment EOF ;
    public final void entryRuleLoopFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:314:1: ( ruleLoopFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:315:1: ruleLoopFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment607);
            ruleLoopFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoopFragment614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLoopFragment"


    // $ANTLR start "ruleLoopFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:322:1: ruleLoopFragment : ( ( rule__LoopFragment__Group__0 ) ) ;
    public final void ruleLoopFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:326:2: ( ( ( rule__LoopFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:327:1: ( ( rule__LoopFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:327:1: ( ( rule__LoopFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:328:1: ( rule__LoopFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:329:1: ( rule__LoopFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:329:2: rule__LoopFragment__Group__0
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__0_in_ruleLoopFragment640);
            rule__LoopFragment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentAccess().getGroup()); 
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
    // $ANTLR end "ruleLoopFragment"


    // $ANTLR start "entryRuleAssertFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:341:1: entryRuleAssertFragment : ruleAssertFragment EOF ;
    public final void entryRuleAssertFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:342:1: ( ruleAssertFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:343:1: ruleAssertFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment667);
            ruleAssertFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssertFragment674); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAssertFragment"


    // $ANTLR start "ruleAssertFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:350:1: ruleAssertFragment : ( ( rule__AssertFragment__Group__0 ) ) ;
    public final void ruleAssertFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:354:2: ( ( ( rule__AssertFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:355:1: ( ( rule__AssertFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:355:1: ( ( rule__AssertFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:356:1: ( rule__AssertFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:357:1: ( rule__AssertFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:357:2: rule__AssertFragment__Group__0
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__0_in_ruleAssertFragment700);
            rule__AssertFragment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentAccess().getGroup()); 
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
    // $ANTLR end "ruleAssertFragment"


    // $ANTLR start "entryRuleBreakFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:369:1: entryRuleBreakFragment : ruleBreakFragment EOF ;
    public final void entryRuleBreakFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:370:1: ( ruleBreakFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:371:1: ruleBreakFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment727);
            ruleBreakFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakFragment734); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBreakFragment"


    // $ANTLR start "ruleBreakFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:378:1: ruleBreakFragment : ( ( rule__BreakFragment__Group__0 ) ) ;
    public final void ruleBreakFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:382:2: ( ( ( rule__BreakFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:383:1: ( ( rule__BreakFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:383:1: ( ( rule__BreakFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:384:1: ( rule__BreakFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:385:1: ( rule__BreakFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:385:2: rule__BreakFragment__Group__0
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group__0_in_ruleBreakFragment760);
            rule__BreakFragment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getGroup()); 
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
    // $ANTLR end "ruleBreakFragment"


    // $ANTLR start "entryRuleNextFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:397:1: entryRuleNextFragment : ruleNextFragment EOF ;
    public final void entryRuleNextFragment() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:398:1: ( ruleNextFragment EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:399:1: ruleNextFragment EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentRule()); 
            }
            pushFollow(FOLLOW_ruleNextFragment_in_entryRuleNextFragment787);
            ruleNextFragment();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextFragment794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNextFragment"


    // $ANTLR start "ruleNextFragment"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:406:1: ruleNextFragment : ( ( rule__NextFragment__Group__0 ) ) ;
    public final void ruleNextFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:410:2: ( ( ( rule__NextFragment__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:411:1: ( ( rule__NextFragment__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:411:1: ( ( rule__NextFragment__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:412:1: ( rule__NextFragment__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:413:1: ( rule__NextFragment__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:413:2: rule__NextFragment__Group__0
            {
            pushFollow(FOLLOW_rule__NextFragment__Group__0_in_ruleNextFragment820);
            rule__NextFragment__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getGroup()); 
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
    // $ANTLR end "ruleNextFragment"


    // $ANTLR start "entryRuleMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:425:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:426:1: ( ruleMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:427:1: ruleMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageRule()); 
            }
            pushFollow(FOLLOW_ruleMessage_in_entryRuleMessage847);
            ruleMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMessage854); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:434:1: ruleMessage : ( ( rule__Message__Alternatives ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:438:2: ( ( ( rule__Message__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:439:1: ( ( rule__Message__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:439:1: ( ( rule__Message__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:440:1: ( rule__Message__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMessageAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:441:1: ( rule__Message__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:441:2: rule__Message__Alternatives
            {
            pushFollow(FOLLOW_rule__Message__Alternatives_in_ruleMessage880);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:453:1: entryRuleCallMessage : ruleCallMessage EOF ;
    public final void entryRuleCallMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:454:1: ( ruleCallMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:455:1: ruleCallMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageRule()); 
            }
            pushFollow(FOLLOW_ruleCallMessage_in_entryRuleCallMessage907);
            ruleCallMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallMessage914); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:462:1: ruleCallMessage : ( ( rule__CallMessage__Group__0 ) ) ;
    public final void ruleCallMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:466:2: ( ( ( rule__CallMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:467:1: ( ( rule__CallMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:467:1: ( ( rule__CallMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:468:1: ( rule__CallMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:469:1: ( rule__CallMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:469:2: rule__CallMessage__Group__0
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__0_in_ruleCallMessage940);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:481:1: entryRuleNewMessage : ruleNewMessage EOF ;
    public final void entryRuleNewMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:482:1: ( ruleNewMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:483:1: ruleNewMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageRule()); 
            }
            pushFollow(FOLLOW_ruleNewMessage_in_entryRuleNewMessage967);
            ruleNewMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNewMessage974); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:490:1: ruleNewMessage : ( ( rule__NewMessage__Group__0 ) ) ;
    public final void ruleNewMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:494:2: ( ( ( rule__NewMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:495:1: ( ( rule__NewMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:495:1: ( ( rule__NewMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:496:1: ( rule__NewMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:497:1: ( rule__NewMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:497:2: rule__NewMessage__Group__0
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__0_in_ruleNewMessage1000);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:509:1: entryRuleReturnMessage : ruleReturnMessage EOF ;
    public final void entryRuleReturnMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:510:1: ( ruleReturnMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:511:1: ruleReturnMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageRule()); 
            }
            pushFollow(FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage1027);
            ruleReturnMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnMessage1034); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:518:1: ruleReturnMessage : ( ( rule__ReturnMessage__Group__0 ) ) ;
    public final void ruleReturnMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:522:2: ( ( ( rule__ReturnMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:523:1: ( ( rule__ReturnMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:523:1: ( ( rule__ReturnMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:524:1: ( rule__ReturnMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:525:1: ( rule__ReturnMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:525:2: rule__ReturnMessage__Group__0
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__0_in_ruleReturnMessage1060);
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


    // $ANTLR start "entryRuleDeleteMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:537:1: entryRuleDeleteMessage : ruleDeleteMessage EOF ;
    public final void entryRuleDeleteMessage() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:538:1: ( ruleDeleteMessage EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:539:1: ruleDeleteMessage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageRule()); 
            }
            pushFollow(FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage1087);
            ruleDeleteMessage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeleteMessage1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDeleteMessage"


    // $ANTLR start "ruleDeleteMessage"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:546:1: ruleDeleteMessage : ( ( rule__DeleteMessage__Group__0 ) ) ;
    public final void ruleDeleteMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:550:2: ( ( ( rule__DeleteMessage__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:551:1: ( ( rule__DeleteMessage__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:551:1: ( ( rule__DeleteMessage__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:552:1: ( rule__DeleteMessage__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:553:1: ( rule__DeleteMessage__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:553:2: rule__DeleteMessage__Group__0
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__0_in_ruleDeleteMessage1120);
            rule__DeleteMessage__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getGroup()); 
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
    // $ANTLR end "ruleDeleteMessage"


    // $ANTLR start "entryRuleParameter"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:565:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:566:1: ( ruleParameter EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:567:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1147);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1154); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:574:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:578:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:579:1: ( ( rule__Parameter__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:579:1: ( ( rule__Parameter__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:580:1: ( rule__Parameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:581:1: ( rule__Parameter__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:581:2: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0_in_ruleParameter1180);
            rule__Parameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup()); 
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


    // $ANTLR start "entryRuleReference"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:593:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:594:1: ( ruleReference EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:595:1: ruleReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleReference_in_entryRuleReference1207);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReference1214); if (state.failed) return ;

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:602:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:606:2: ( ( ( rule__Reference__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:607:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:607:1: ( ( rule__Reference__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:608:1: ( rule__Reference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:609:1: ( rule__Reference__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:609:2: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_rule__Reference__Group__0_in_ruleReference1240);
            rule__Reference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getGroup()); 
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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleArray"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:621:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:622:1: ( ruleArray EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:623:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray1267);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray1274); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:630:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:634:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:635:1: ( ( rule__Array__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:635:1: ( ( rule__Array__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:636:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:637:1: ( rule__Array__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:637:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray1300);
            rule__Array__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getGroup()); 
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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleForeachExpression"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:649:1: entryRuleForeachExpression : ruleForeachExpression EOF ;
    public final void entryRuleForeachExpression() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");

        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:653:1: ( ruleForeachExpression EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:654:1: ruleForeachExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression1332);
            ruleForeachExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForeachExpression1339); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleForeachExpression"


    // $ANTLR start "ruleForeachExpression"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:664:1: ruleForeachExpression : ( ( rule__ForeachExpression__Group__0 ) ) ;
    public final void ruleForeachExpression() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:669:2: ( ( ( rule__ForeachExpression__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:670:1: ( ( rule__ForeachExpression__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:670:1: ( ( rule__ForeachExpression__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:671:1: ( rule__ForeachExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:672:1: ( rule__ForeachExpression__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:672:2: rule__ForeachExpression__Group__0
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group__0_in_ruleForeachExpression1369);
            rule__ForeachExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionAccess().getGroup()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleForeachExpression"


    // $ANTLR start "entryRuleValueWithSpaces"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:685:1: entryRuleValueWithSpaces : ruleValueWithSpaces EOF ;
    public final void entryRuleValueWithSpaces() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:689:1: ( ruleValueWithSpaces EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:690:1: ruleValueWithSpaces EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueWithSpacesRule()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces1401);
            ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueWithSpacesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueWithSpaces1408); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleValueWithSpaces"


    // $ANTLR start "ruleValueWithSpaces"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:700:1: ruleValueWithSpaces : ( ( rule__ValueWithSpaces__Alternatives )* ) ;
    public final void ruleValueWithSpaces() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:705:2: ( ( ( rule__ValueWithSpaces__Alternatives )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:706:1: ( ( rule__ValueWithSpaces__Alternatives )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:706:1: ( ( rule__ValueWithSpaces__Alternatives )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:707:1: ( rule__ValueWithSpaces__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueWithSpacesAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:708:1: ( rule__ValueWithSpaces__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_NATURAL)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:708:2: rule__ValueWithSpaces__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__ValueWithSpaces__Alternatives_in_ruleValueWithSpaces1438);
            	    rule__ValueWithSpaces__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueWithSpacesAccess().getAlternatives()); 
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
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleValueWithSpaces"


    // $ANTLR start "entryRuleAnnotation"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:721:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:722:1: ( ruleAnnotation EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:723:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1466);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1473); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:730:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:734:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:735:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:735:1: ( ( rule__Annotation__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:736:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:737:1: ( rule__Annotation__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:737:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1499);
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


    // $ANTLR start "entryRuleValue"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:753:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:754:1: ( ruleValue EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:755:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue1530);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue1537); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:762:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:766:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:767:1: ( ( rule__Value__Alternatives ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:767:1: ( ( rule__Value__Alternatives ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:768:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:769:1: ( rule__Value__Alternatives )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:769:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue1563);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:781:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:782:1: ( ruleExtendedID EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:783:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID1590);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID1597); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:790:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:794:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:795:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:795:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:796:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:797:1: ( rule__ExtendedID__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:797:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1623);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:811:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:812:1: ( ruleReal EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:813:1: ruleReal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal1652);
            ruleReal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal1659); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:820:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:824:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:825:1: ( ( rule__Real__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:825:1: ( ( rule__Real__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:826:1: ( rule__Real__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:827:1: ( rule__Real__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:827:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal1685);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:839:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:840:1: ( ruleInteger EOF )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:841:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger1712);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger1719); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:848:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:852:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:853:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:853:1: ( ( rule__Integer__Group__0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:854:1: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:855:1: ( rule__Integer__Group__0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:855:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger1745);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:867:1: rule__Transition__Alternatives : ( ( ruleMessage ) | ( ruleFragment ) );
    public final void rule__Transition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:871:1: ( ( ruleMessage ) | ( ruleFragment ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=36 && LA2_0<=38)) ) {
                alt2=1;
            }
            else if ( (LA2_0==25||LA2_0==29||(LA2_0>=31 && LA2_0<=34)) ) {
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:872:1: ( ruleMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:872:1: ( ruleMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:873:1: ruleMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleMessage_in_rule__Transition__Alternatives1781);
                    ruleMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getMessageParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:878:6: ( ruleFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:878:6: ( ruleFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:879:1: ruleFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTransitionAccess().getFragmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleFragment_in_rule__Transition__Alternatives1798);
                    ruleFragment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTransitionAccess().getFragmentParserRuleCall_1()); 
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


    // $ANTLR start "rule__Fragment__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:889:1: rule__Fragment__Alternatives : ( ( ruleIfElseFragment ) | ( ruleForeachFragment ) | ( ruleAssertFragment ) | ( ruleLoopFragment ) | ( ruleBreakFragment ) | ( ruleNextFragment ) );
    public final void rule__Fragment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:893:1: ( ( ruleIfElseFragment ) | ( ruleForeachFragment ) | ( ruleAssertFragment ) | ( ruleLoopFragment ) | ( ruleBreakFragment ) | ( ruleNextFragment ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 32:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            case 33:
                {
                alt3=5;
                }
                break;
            case 34:
                {
                alt3=6;
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:894:1: ( ruleIfElseFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:894:1: ( ruleIfElseFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:895:1: ruleIfElseFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getIfElseFragmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleIfElseFragment_in_rule__Fragment__Alternatives1830);
                    ruleIfElseFragment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFragmentAccess().getIfElseFragmentParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:900:6: ( ruleForeachFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:900:6: ( ruleForeachFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:901:1: ruleForeachFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getForeachFragmentParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleForeachFragment_in_rule__Fragment__Alternatives1847);
                    ruleForeachFragment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFragmentAccess().getForeachFragmentParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:906:6: ( ruleAssertFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:906:6: ( ruleAssertFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:907:1: ruleAssertFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getAssertFragmentParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAssertFragment_in_rule__Fragment__Alternatives1864);
                    ruleAssertFragment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFragmentAccess().getAssertFragmentParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:912:6: ( ruleLoopFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:912:6: ( ruleLoopFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:913:1: ruleLoopFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getLoopFragmentParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleLoopFragment_in_rule__Fragment__Alternatives1881);
                    ruleLoopFragment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFragmentAccess().getLoopFragmentParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:918:6: ( ruleBreakFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:918:6: ( ruleBreakFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:919:1: ruleBreakFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getBreakFragmentParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleBreakFragment_in_rule__Fragment__Alternatives1898);
                    ruleBreakFragment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFragmentAccess().getBreakFragmentParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:924:6: ( ruleNextFragment )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:924:6: ( ruleNextFragment )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:925:1: ruleNextFragment
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFragmentAccess().getNextFragmentParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleNextFragment_in_rule__Fragment__Alternatives1915);
                    ruleNextFragment();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFragmentAccess().getNextFragmentParserRuleCall_5()); 
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
    // $ANTLR end "rule__Fragment__Alternatives"


    // $ANTLR start "rule__Message__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:935:1: rule__Message__Alternatives : ( ( ruleCallMessage ) | ( ruleNewMessage ) | ( ruleReturnMessage ) | ( ruleDeleteMessage ) );
    public final void rule__Message__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:939:1: ( ( ruleCallMessage ) | ( ruleNewMessage ) | ( ruleReturnMessage ) | ( ruleDeleteMessage ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=3;
                }
                break;
            case 38:
                {
                alt4=4;
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:940:1: ( ruleCallMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:940:1: ( ruleCallMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:941:1: ruleCallMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getCallMessageParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCallMessage_in_rule__Message__Alternatives1947);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:946:6: ( ruleNewMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:946:6: ( ruleNewMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:947:1: ruleNewMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getNewMessageParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNewMessage_in_rule__Message__Alternatives1964);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:952:6: ( ruleReturnMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:952:6: ( ruleReturnMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:953:1: ruleReturnMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getReturnMessageParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleReturnMessage_in_rule__Message__Alternatives1981);
                    ruleReturnMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageAccess().getReturnMessageParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:958:6: ( ruleDeleteMessage )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:958:6: ( ruleDeleteMessage )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:959:1: ruleDeleteMessage
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMessageAccess().getDeleteMessageParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleDeleteMessage_in_rule__Message__Alternatives1998);
                    ruleDeleteMessage();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMessageAccess().getDeleteMessageParserRuleCall_3()); 
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


    // $ANTLR start "rule__ForeachExpression__Alternatives_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:969:1: rule__ForeachExpression__Alternatives_2 : ( ( ( rule__ForeachExpression__Group_2_0__0 ) ) | ( RULE_ID ) );
    public final void rule__ForeachExpression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:973:1: ( ( ( rule__ForeachExpression__Group_2_0__0 ) ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_NATURAL) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:974:1: ( ( rule__ForeachExpression__Group_2_0__0 ) )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:974:1: ( ( rule__ForeachExpression__Group_2_0__0 ) )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:975:1: ( rule__ForeachExpression__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForeachExpressionAccess().getGroup_2_0()); 
                    }
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:976:1: ( rule__ForeachExpression__Group_2_0__0 )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:976:2: rule__ForeachExpression__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__0_in_rule__ForeachExpression__Alternatives_22030);
                    rule__ForeachExpression__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForeachExpressionAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:980:6: ( RULE_ID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:980:6: ( RULE_ID )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:981:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_2_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForeachExpression__Alternatives_22048); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_2_1()); 
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
    // $ANTLR end "rule__ForeachExpression__Alternatives_2"


    // $ANTLR start "rule__ValueWithSpaces__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:991:1: rule__ValueWithSpaces__Alternatives : ( ( RULE_OPERATOR ) | ( ruleValue ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) );
    public final void rule__ValueWithSpaces__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:995:1: ( ( RULE_OPERATOR ) | ( ruleValue ) | ( RULE_ANY_OTHER ) | ( RULE_WS ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_OPERATOR:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_BOOLEAN:
            case RULE_NULL:
            case RULE_NATURAL:
            case 17:
                {
                alt6=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt6=3;
                }
                break;
            case RULE_WS:
                {
                alt6=4;
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:996:1: ( RULE_OPERATOR )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:996:1: ( RULE_OPERATOR )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:997:1: RULE_OPERATOR
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueWithSpacesAccess().getOPERATORTerminalRuleCall_0()); 
                    }
                    match(input,RULE_OPERATOR,FOLLOW_RULE_OPERATOR_in_rule__ValueWithSpaces__Alternatives2080); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueWithSpacesAccess().getOPERATORTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1002:6: ( ruleValue )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1002:6: ( ruleValue )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1003:1: ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueWithSpacesAccess().getValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleValue_in_rule__ValueWithSpaces__Alternatives2097);
                    ruleValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueWithSpacesAccess().getValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1008:6: ( RULE_ANY_OTHER )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1008:6: ( RULE_ANY_OTHER )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1009:1: RULE_ANY_OTHER
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueWithSpacesAccess().getANY_OTHERTerminalRuleCall_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__ValueWithSpaces__Alternatives2114); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueWithSpacesAccess().getANY_OTHERTerminalRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1014:6: ( RULE_WS )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1014:6: ( RULE_WS )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1015:1: RULE_WS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueWithSpacesAccess().getWSTerminalRuleCall_3()); 
                    }
                    match(input,RULE_WS,FOLLOW_RULE_WS_in_rule__ValueWithSpaces__Alternatives2131); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueWithSpacesAccess().getWSTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__ValueWithSpaces__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1025:1: rule__Value__Alternatives : ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1029:1: ( ( ruleInteger ) | ( RULE_STRING ) | ( ruleExtendedID ) | ( RULE_BOOLEAN ) | ( RULE_NULL ) | ( ruleReal ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_NATURAL) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==35) ) {
                        alt7=6;
                    }
                    else if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_NATURAL)||LA7_2==17||LA7_2==26||LA7_2==30) ) {
                        alt7=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NATURAL:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==35) ) {
                    alt7=6;
                }
                else if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_NATURAL)||LA7_2==17||LA7_2==26||LA7_2==30) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt7=4;
                }
                break;
            case RULE_NULL:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1030:1: ( ruleInteger )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1030:1: ( ruleInteger )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1031:1: ruleInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInteger_in_rule__Value__Alternatives2163);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1036:6: ( RULE_STRING )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1036:6: ( RULE_STRING )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1037:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Value__Alternatives2180); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1042:6: ( ruleExtendedID )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1042:6: ( ruleExtendedID )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1043:1: ruleExtendedID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getExtendedIDParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExtendedID_in_rule__Value__Alternatives2197);
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
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1048:6: ( RULE_BOOLEAN )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1048:6: ( RULE_BOOLEAN )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1049:1: RULE_BOOLEAN
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }
                    match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives2214); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getBOOLEANTerminalRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1054:6: ( RULE_NULL )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1054:6: ( RULE_NULL )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1055:1: RULE_NULL
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }
                    match(input,RULE_NULL,FOLLOW_RULE_NULL_in_rule__Value__Alternatives2231); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getNULLTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1060:6: ( ruleReal )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1060:6: ( ruleReal )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1061:1: ruleReal
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getRealParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleReal_in_rule__Value__Alternatives2248);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1072:1: rule__Real__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Real__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1076:1: ( ( 'e' ) | ( 'E' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1077:1: ( 'e' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1077:1: ( 'e' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1078:1: 'e'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Real__Alternatives_4_02282); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getEKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1085:6: ( 'E' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1085:6: ( 'E' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1086:1: 'E'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getEKeyword_4_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Real__Alternatives_4_02302); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1098:1: rule__Real__Alternatives_4_1 : ( ( '+' ) | ( '-' ) );
    public final void rule__Real__Alternatives_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1102:1: ( ( '+' ) | ( '-' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1103:1: ( '+' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1103:1: ( '+' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1104:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Real__Alternatives_4_12337); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRealAccess().getPlusSignKeyword_4_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1111:6: ( '-' )
                    {
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1111:6: ( '-' )
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1112:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRealAccess().getHyphenMinusKeyword_4_1_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Real__Alternatives_4_12357); if (state.failed) return ;
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


    // $ANTLR start "rule__Model__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1126:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1130:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1131:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02389);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02392);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1138:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1142:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1143:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1143:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1144:1: ( rule__Model__ImportsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1145:1: ( rule__Model__ImportsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1145:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2419);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1155:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1159:1: ( rule__Model__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1160:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12450);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1166:1: rule__Model__Group__1__Impl : ( ( rule__Model__SequenceAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1170:1: ( ( ( rule__Model__SequenceAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1171:1: ( ( rule__Model__SequenceAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1171:1: ( ( rule__Model__SequenceAssignment_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1172:1: ( rule__Model__SequenceAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSequenceAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1173:1: ( rule__Model__SequenceAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19||LA11_0==44) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1173:2: rule__Model__SequenceAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__SequenceAssignment_1_in_rule__Model__Group__1__Impl2477);
            	    rule__Model__SequenceAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSequenceAssignment_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1187:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1191:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1192:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02512);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02515);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1199:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1203:1: ( ( 'import' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1204:1: ( 'import' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1204:1: ( 'import' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1205:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Import__Group__0__Impl2543); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1218:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1222:1: ( rule__Import__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1223:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12574);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1229:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1233:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1234:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1234:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1235:1: ( rule__Import__ImportURIAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1236:1: ( rule__Import__ImportURIAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1236:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2601);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1250:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1254:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1255:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02635);
            rule__Sequence__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02638);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1262:1: rule__Sequence__Group__0__Impl : ( ( rule__Sequence__AnnotationAssignment_0 )* ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1266:1: ( ( ( rule__Sequence__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1267:1: ( ( rule__Sequence__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1267:1: ( ( rule__Sequence__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1268:1: ( rule__Sequence__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1269:1: ( rule__Sequence__AnnotationAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==44) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1269:2: rule__Sequence__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__AnnotationAssignment_0_in_rule__Sequence__Group__0__Impl2665);
            	    rule__Sequence__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1279:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1283:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1284:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12696);
            rule__Sequence__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12699);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1291:1: rule__Sequence__Group__1__Impl : ( ( 'sequence' ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1295:1: ( ( ( 'sequence' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1296:1: ( ( 'sequence' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1296:1: ( ( 'sequence' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1297:1: ( 'sequence' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getSequenceKeyword_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1298:1: ( 'sequence' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1299:2: 'sequence'
            {
            match(input,19,FOLLOW_19_in_rule__Sequence__Group__1__Impl2728); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1310:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1314:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1315:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22760);
            rule__Sequence__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22763);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1322:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__NameAssignment_2 ) ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1326:1: ( ( ( rule__Sequence__NameAssignment_2 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1327:1: ( ( rule__Sequence__NameAssignment_2 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1327:1: ( ( rule__Sequence__NameAssignment_2 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1328:1: ( rule__Sequence__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getNameAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1329:1: ( rule__Sequence__NameAssignment_2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1329:2: rule__Sequence__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_2_in_rule__Sequence__Group__2__Impl2790);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1339:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1343:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1344:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32820);
            rule__Sequence__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32823);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1351:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__ParticipantAssignment_3 )* ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1355:1: ( ( ( rule__Sequence__ParticipantAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1356:1: ( ( rule__Sequence__ParticipantAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1356:1: ( ( rule__Sequence__ParticipantAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1357:1: ( rule__Sequence__ParticipantAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getParticipantAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1358:1: ( rule__Sequence__ParticipantAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1358:2: rule__Sequence__ParticipantAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Sequence__ParticipantAssignment_3_in_rule__Sequence__Group__3__Impl2850);
            	    rule__Sequence__ParticipantAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1368:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1372:1: ( rule__Sequence__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1373:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42881);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1379:1: rule__Sequence__Group__4__Impl : ( 'end' ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1383:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1384:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1384:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1385:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__Sequence__Group__4__Impl2909); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1408:1: rule__Participant__Group__0 : rule__Participant__Group__0__Impl rule__Participant__Group__1 ;
    public final void rule__Participant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1412:1: ( rule__Participant__Group__0__Impl rule__Participant__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1413:2: rule__Participant__Group__0__Impl rule__Participant__Group__1
            {
            pushFollow(FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__02950);
            rule__Participant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__02953);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1420:1: rule__Participant__Group__0__Impl : ( ( rule__Participant__AnnotationAssignment_0 )* ) ;
    public final void rule__Participant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1424:1: ( ( ( rule__Participant__AnnotationAssignment_0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1425:1: ( ( rule__Participant__AnnotationAssignment_0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1425:1: ( ( rule__Participant__AnnotationAssignment_0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1426:1: ( rule__Participant__AnnotationAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getAnnotationAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1427:1: ( rule__Participant__AnnotationAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==44) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1427:2: rule__Participant__AnnotationAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Participant__AnnotationAssignment_0_in_rule__Participant__Group__0__Impl2980);
            	    rule__Participant__AnnotationAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getAnnotationAssignment_0()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1437:1: rule__Participant__Group__1 : rule__Participant__Group__1__Impl rule__Participant__Group__2 ;
    public final void rule__Participant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1441:1: ( rule__Participant__Group__1__Impl rule__Participant__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1442:2: rule__Participant__Group__1__Impl rule__Participant__Group__2
            {
            pushFollow(FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__13011);
            rule__Participant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__13014);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1449:1: rule__Participant__Group__1__Impl : ( ( rule__Participant__NameAssignment_1 ) ) ;
    public final void rule__Participant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1453:1: ( ( ( rule__Participant__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1454:1: ( ( rule__Participant__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1454:1: ( ( rule__Participant__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1455:1: ( rule__Participant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1456:1: ( rule__Participant__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1456:2: rule__Participant__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Participant__NameAssignment_1_in_rule__Participant__Group__1__Impl3041);
            rule__Participant__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getNameAssignment_1()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1466:1: rule__Participant__Group__2 : rule__Participant__Group__2__Impl rule__Participant__Group__3 ;
    public final void rule__Participant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1470:1: ( rule__Participant__Group__2__Impl rule__Participant__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1471:2: rule__Participant__Group__2__Impl rule__Participant__Group__3
            {
            pushFollow(FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__23071);
            rule__Participant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Participant__Group__3_in_rule__Participant__Group__23074);
            rule__Participant__Group__3();

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1478:1: rule__Participant__Group__2__Impl : ( ( rule__Participant__TransitionAssignment_2 )* ) ;
    public final void rule__Participant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1482:1: ( ( ( rule__Participant__TransitionAssignment_2 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1483:1: ( ( rule__Participant__TransitionAssignment_2 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1483:1: ( ( rule__Participant__TransitionAssignment_2 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1484:1: ( rule__Participant__TransitionAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getTransitionAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1485:1: ( rule__Participant__TransitionAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==25||LA15_0==29||(LA15_0>=31 && LA15_0<=34)||(LA15_0>=36 && LA15_0<=38)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1485:2: rule__Participant__TransitionAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Participant__TransitionAssignment_2_in_rule__Participant__Group__2__Impl3101);
            	    rule__Participant__TransitionAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getTransitionAssignment_2()); 
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


    // $ANTLR start "rule__Participant__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1495:1: rule__Participant__Group__3 : rule__Participant__Group__3__Impl rule__Participant__Group__4 ;
    public final void rule__Participant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1499:1: ( rule__Participant__Group__3__Impl rule__Participant__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1500:2: rule__Participant__Group__3__Impl rule__Participant__Group__4
            {
            pushFollow(FOLLOW_rule__Participant__Group__3__Impl_in_rule__Participant__Group__33132);
            rule__Participant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Participant__Group__4_in_rule__Participant__Group__33135);
            rule__Participant__Group__4();

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
    // $ANTLR end "rule__Participant__Group__3"


    // $ANTLR start "rule__Participant__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1507:1: rule__Participant__Group__3__Impl : ( ( rule__Participant__BlockAssignment_3 )* ) ;
    public final void rule__Participant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1511:1: ( ( ( rule__Participant__BlockAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1512:1: ( ( rule__Participant__BlockAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1512:1: ( ( rule__Participant__BlockAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1513:1: ( rule__Participant__BlockAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getBlockAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1514:1: ( rule__Participant__BlockAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1514:2: rule__Participant__BlockAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Participant__BlockAssignment_3_in_rule__Participant__Group__3__Impl3162);
            	    rule__Participant__BlockAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getBlockAssignment_3()); 
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
    // $ANTLR end "rule__Participant__Group__3__Impl"


    // $ANTLR start "rule__Participant__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1524:1: rule__Participant__Group__4 : rule__Participant__Group__4__Impl ;
    public final void rule__Participant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1528:1: ( rule__Participant__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1529:2: rule__Participant__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Participant__Group__4__Impl_in_rule__Participant__Group__43193);
            rule__Participant__Group__4__Impl();

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
    // $ANTLR end "rule__Participant__Group__4"


    // $ANTLR start "rule__Participant__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1535:1: rule__Participant__Group__4__Impl : ( 'end' ) ;
    public final void rule__Participant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1539:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1540:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1540:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1541:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__Participant__Group__4__Impl3221); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__Participant__Group__4__Impl"


    // $ANTLR start "rule__TransitionBlock__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1564:1: rule__TransitionBlock__Group__0 : rule__TransitionBlock__Group__0__Impl rule__TransitionBlock__Group__1 ;
    public final void rule__TransitionBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1568:1: ( rule__TransitionBlock__Group__0__Impl rule__TransitionBlock__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1569:2: rule__TransitionBlock__Group__0__Impl rule__TransitionBlock__Group__1
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__0__Impl_in_rule__TransitionBlock__Group__03262);
            rule__TransitionBlock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group__1_in_rule__TransitionBlock__Group__03265);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1576:1: rule__TransitionBlock__Group__0__Impl : ( 'def' ) ;
    public final void rule__TransitionBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1580:1: ( ( 'def' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1581:1: ( 'def' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1581:1: ( 'def' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1582:1: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getDefKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__TransitionBlock__Group__0__Impl3293); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getDefKeyword_0()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1595:1: rule__TransitionBlock__Group__1 : rule__TransitionBlock__Group__1__Impl rule__TransitionBlock__Group__2 ;
    public final void rule__TransitionBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1599:1: ( rule__TransitionBlock__Group__1__Impl rule__TransitionBlock__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1600:2: rule__TransitionBlock__Group__1__Impl rule__TransitionBlock__Group__2
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__1__Impl_in_rule__TransitionBlock__Group__13324);
            rule__TransitionBlock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group__2_in_rule__TransitionBlock__Group__13327);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1607:1: rule__TransitionBlock__Group__1__Impl : ( ( rule__TransitionBlock__NameAssignment_1 ) ) ;
    public final void rule__TransitionBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1611:1: ( ( ( rule__TransitionBlock__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1612:1: ( ( rule__TransitionBlock__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1612:1: ( ( rule__TransitionBlock__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1613:1: ( rule__TransitionBlock__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1614:1: ( rule__TransitionBlock__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1614:2: rule__TransitionBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TransitionBlock__NameAssignment_1_in_rule__TransitionBlock__Group__1__Impl3354);
            rule__TransitionBlock__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getNameAssignment_1()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1624:1: rule__TransitionBlock__Group__2 : rule__TransitionBlock__Group__2__Impl rule__TransitionBlock__Group__3 ;
    public final void rule__TransitionBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1628:1: ( rule__TransitionBlock__Group__2__Impl rule__TransitionBlock__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1629:2: rule__TransitionBlock__Group__2__Impl rule__TransitionBlock__Group__3
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__2__Impl_in_rule__TransitionBlock__Group__23384);
            rule__TransitionBlock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group__3_in_rule__TransitionBlock__Group__23387);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1636:1: rule__TransitionBlock__Group__2__Impl : ( ( rule__TransitionBlock__Group_2__0 )? ) ;
    public final void rule__TransitionBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1640:1: ( ( ( rule__TransitionBlock__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1641:1: ( ( rule__TransitionBlock__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1641:1: ( ( rule__TransitionBlock__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1642:1: ( rule__TransitionBlock__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1643:1: ( rule__TransitionBlock__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1643:2: rule__TransitionBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TransitionBlock__Group_2__0_in_rule__TransitionBlock__Group__2__Impl3414);
                    rule__TransitionBlock__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getGroup_2()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1653:1: rule__TransitionBlock__Group__3 : rule__TransitionBlock__Group__3__Impl rule__TransitionBlock__Group__4 ;
    public final void rule__TransitionBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1657:1: ( rule__TransitionBlock__Group__3__Impl rule__TransitionBlock__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1658:2: rule__TransitionBlock__Group__3__Impl rule__TransitionBlock__Group__4
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__3__Impl_in_rule__TransitionBlock__Group__33445);
            rule__TransitionBlock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group__4_in_rule__TransitionBlock__Group__33448);
            rule__TransitionBlock__Group__4();

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1665:1: rule__TransitionBlock__Group__3__Impl : ( ( rule__TransitionBlock__TransitionAssignment_3 )* ) ;
    public final void rule__TransitionBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1669:1: ( ( ( rule__TransitionBlock__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1670:1: ( ( rule__TransitionBlock__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1670:1: ( ( rule__TransitionBlock__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1671:1: ( rule__TransitionBlock__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1672:1: ( rule__TransitionBlock__TransitionAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==25||LA18_0==29||(LA18_0>=31 && LA18_0<=34)||(LA18_0>=36 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1672:2: rule__TransitionBlock__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__TransitionBlock__TransitionAssignment_3_in_rule__TransitionBlock__Group__3__Impl3475);
            	    rule__TransitionBlock__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getTransitionAssignment_3()); 
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


    // $ANTLR start "rule__TransitionBlock__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1682:1: rule__TransitionBlock__Group__4 : rule__TransitionBlock__Group__4__Impl ;
    public final void rule__TransitionBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1686:1: ( rule__TransitionBlock__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1687:2: rule__TransitionBlock__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group__4__Impl_in_rule__TransitionBlock__Group__43506);
            rule__TransitionBlock__Group__4__Impl();

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
    // $ANTLR end "rule__TransitionBlock__Group__4"


    // $ANTLR start "rule__TransitionBlock__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1693:1: rule__TransitionBlock__Group__4__Impl : ( 'end' ) ;
    public final void rule__TransitionBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1697:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1698:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1698:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1699:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__TransitionBlock__Group__4__Impl3534); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__TransitionBlock__Group__4__Impl"


    // $ANTLR start "rule__TransitionBlock__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1722:1: rule__TransitionBlock__Group_2__0 : rule__TransitionBlock__Group_2__0__Impl rule__TransitionBlock__Group_2__1 ;
    public final void rule__TransitionBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1726:1: ( rule__TransitionBlock__Group_2__0__Impl rule__TransitionBlock__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1727:2: rule__TransitionBlock__Group_2__0__Impl rule__TransitionBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2__0__Impl_in_rule__TransitionBlock__Group_2__03575);
            rule__TransitionBlock__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2__1_in_rule__TransitionBlock__Group_2__03578);
            rule__TransitionBlock__Group_2__1();

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
    // $ANTLR end "rule__TransitionBlock__Group_2__0"


    // $ANTLR start "rule__TransitionBlock__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1734:1: rule__TransitionBlock__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__TransitionBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1738:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1739:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1739:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1740:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1741:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1742:2: '('
            {
            match(input,22,FOLLOW_22_in_rule__TransitionBlock__Group_2__0__Impl3607); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__TransitionBlock__Group_2__0__Impl"


    // $ANTLR start "rule__TransitionBlock__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1753:1: rule__TransitionBlock__Group_2__1 : rule__TransitionBlock__Group_2__1__Impl rule__TransitionBlock__Group_2__2 ;
    public final void rule__TransitionBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1757:1: ( rule__TransitionBlock__Group_2__1__Impl rule__TransitionBlock__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1758:2: rule__TransitionBlock__Group_2__1__Impl rule__TransitionBlock__Group_2__2
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2__1__Impl_in_rule__TransitionBlock__Group_2__13639);
            rule__TransitionBlock__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2__2_in_rule__TransitionBlock__Group_2__13642);
            rule__TransitionBlock__Group_2__2();

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
    // $ANTLR end "rule__TransitionBlock__Group_2__1"


    // $ANTLR start "rule__TransitionBlock__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1765:1: rule__TransitionBlock__Group_2__1__Impl : ( ( rule__TransitionBlock__Group_2_1__0 )? ) ;
    public final void rule__TransitionBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1769:1: ( ( ( rule__TransitionBlock__Group_2_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1770:1: ( ( rule__TransitionBlock__Group_2_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1770:1: ( ( rule__TransitionBlock__Group_2_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1771:1: ( rule__TransitionBlock__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getGroup_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1772:1: ( rule__TransitionBlock__Group_2_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1772:2: rule__TransitionBlock__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__TransitionBlock__Group_2_1__0_in_rule__TransitionBlock__Group_2__1__Impl3669);
                    rule__TransitionBlock__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__TransitionBlock__Group_2__1__Impl"


    // $ANTLR start "rule__TransitionBlock__Group_2__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1782:1: rule__TransitionBlock__Group_2__2 : rule__TransitionBlock__Group_2__2__Impl ;
    public final void rule__TransitionBlock__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1786:1: ( rule__TransitionBlock__Group_2__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1787:2: rule__TransitionBlock__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2__2__Impl_in_rule__TransitionBlock__Group_2__23700);
            rule__TransitionBlock__Group_2__2__Impl();

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
    // $ANTLR end "rule__TransitionBlock__Group_2__2"


    // $ANTLR start "rule__TransitionBlock__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1793:1: rule__TransitionBlock__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TransitionBlock__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1797:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1798:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1798:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1799:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__TransitionBlock__Group_2__2__Impl3728); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__TransitionBlock__Group_2__2__Impl"


    // $ANTLR start "rule__TransitionBlock__Group_2_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1818:1: rule__TransitionBlock__Group_2_1__0 : rule__TransitionBlock__Group_2_1__0__Impl rule__TransitionBlock__Group_2_1__1 ;
    public final void rule__TransitionBlock__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1822:1: ( rule__TransitionBlock__Group_2_1__0__Impl rule__TransitionBlock__Group_2_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1823:2: rule__TransitionBlock__Group_2_1__0__Impl rule__TransitionBlock__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2_1__0__Impl_in_rule__TransitionBlock__Group_2_1__03765);
            rule__TransitionBlock__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2_1__1_in_rule__TransitionBlock__Group_2_1__03768);
            rule__TransitionBlock__Group_2_1__1();

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
    // $ANTLR end "rule__TransitionBlock__Group_2_1__0"


    // $ANTLR start "rule__TransitionBlock__Group_2_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1830:1: rule__TransitionBlock__Group_2_1__0__Impl : ( ( rule__TransitionBlock__ParameterAssignment_2_1_0 ) ) ;
    public final void rule__TransitionBlock__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1834:1: ( ( ( rule__TransitionBlock__ParameterAssignment_2_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1835:1: ( ( rule__TransitionBlock__ParameterAssignment_2_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1835:1: ( ( rule__TransitionBlock__ParameterAssignment_2_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1836:1: ( rule__TransitionBlock__ParameterAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getParameterAssignment_2_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1837:1: ( rule__TransitionBlock__ParameterAssignment_2_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1837:2: rule__TransitionBlock__ParameterAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__TransitionBlock__ParameterAssignment_2_1_0_in_rule__TransitionBlock__Group_2_1__0__Impl3795);
            rule__TransitionBlock__ParameterAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getParameterAssignment_2_1_0()); 
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
    // $ANTLR end "rule__TransitionBlock__Group_2_1__0__Impl"


    // $ANTLR start "rule__TransitionBlock__Group_2_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1847:1: rule__TransitionBlock__Group_2_1__1 : rule__TransitionBlock__Group_2_1__1__Impl ;
    public final void rule__TransitionBlock__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1851:1: ( rule__TransitionBlock__Group_2_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1852:2: rule__TransitionBlock__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2_1__1__Impl_in_rule__TransitionBlock__Group_2_1__13825);
            rule__TransitionBlock__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__TransitionBlock__Group_2_1__1"


    // $ANTLR start "rule__TransitionBlock__Group_2_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1858:1: rule__TransitionBlock__Group_2_1__1__Impl : ( ( rule__TransitionBlock__Group_2_1_1__0 )* ) ;
    public final void rule__TransitionBlock__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1862:1: ( ( ( rule__TransitionBlock__Group_2_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1863:1: ( ( rule__TransitionBlock__Group_2_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1863:1: ( ( rule__TransitionBlock__Group_2_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1864:1: ( rule__TransitionBlock__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getGroup_2_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1865:1: ( rule__TransitionBlock__Group_2_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1865:2: rule__TransitionBlock__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TransitionBlock__Group_2_1_1__0_in_rule__TransitionBlock__Group_2_1__1__Impl3852);
            	    rule__TransitionBlock__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getGroup_2_1_1()); 
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
    // $ANTLR end "rule__TransitionBlock__Group_2_1__1__Impl"


    // $ANTLR start "rule__TransitionBlock__Group_2_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1879:1: rule__TransitionBlock__Group_2_1_1__0 : rule__TransitionBlock__Group_2_1_1__0__Impl rule__TransitionBlock__Group_2_1_1__1 ;
    public final void rule__TransitionBlock__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1883:1: ( rule__TransitionBlock__Group_2_1_1__0__Impl rule__TransitionBlock__Group_2_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1884:2: rule__TransitionBlock__Group_2_1_1__0__Impl rule__TransitionBlock__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2_1_1__0__Impl_in_rule__TransitionBlock__Group_2_1_1__03887);
            rule__TransitionBlock__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2_1_1__1_in_rule__TransitionBlock__Group_2_1_1__03890);
            rule__TransitionBlock__Group_2_1_1__1();

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
    // $ANTLR end "rule__TransitionBlock__Group_2_1_1__0"


    // $ANTLR start "rule__TransitionBlock__Group_2_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1891:1: rule__TransitionBlock__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__TransitionBlock__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1895:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1896:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1896:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1897:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__TransitionBlock__Group_2_1_1__0__Impl3918); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getCommaKeyword_2_1_1_0()); 
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
    // $ANTLR end "rule__TransitionBlock__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__TransitionBlock__Group_2_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1910:1: rule__TransitionBlock__Group_2_1_1__1 : rule__TransitionBlock__Group_2_1_1__1__Impl ;
    public final void rule__TransitionBlock__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1914:1: ( rule__TransitionBlock__Group_2_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1915:2: rule__TransitionBlock__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TransitionBlock__Group_2_1_1__1__Impl_in_rule__TransitionBlock__Group_2_1_1__13949);
            rule__TransitionBlock__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__TransitionBlock__Group_2_1_1__1"


    // $ANTLR start "rule__TransitionBlock__Group_2_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1921:1: rule__TransitionBlock__Group_2_1_1__1__Impl : ( ( rule__TransitionBlock__ParameterAssignment_2_1_1_1 ) ) ;
    public final void rule__TransitionBlock__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1925:1: ( ( ( rule__TransitionBlock__ParameterAssignment_2_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1926:1: ( ( rule__TransitionBlock__ParameterAssignment_2_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1926:1: ( ( rule__TransitionBlock__ParameterAssignment_2_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1927:1: ( rule__TransitionBlock__ParameterAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getParameterAssignment_2_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1928:1: ( rule__TransitionBlock__ParameterAssignment_2_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1928:2: rule__TransitionBlock__ParameterAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__TransitionBlock__ParameterAssignment_2_1_1_1_in_rule__TransitionBlock__Group_2_1_1__1__Impl3976);
            rule__TransitionBlock__ParameterAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getParameterAssignment_2_1_1_1()); 
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
    // $ANTLR end "rule__TransitionBlock__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__IfElseFragment__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1942:1: rule__IfElseFragment__Group__0 : rule__IfElseFragment__Group__0__Impl rule__IfElseFragment__Group__1 ;
    public final void rule__IfElseFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1946:1: ( rule__IfElseFragment__Group__0__Impl rule__IfElseFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1947:2: rule__IfElseFragment__Group__0__Impl rule__IfElseFragment__Group__1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__0__Impl_in_rule__IfElseFragment__Group__04010);
            rule__IfElseFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__1_in_rule__IfElseFragment__Group__04013);
            rule__IfElseFragment__Group__1();

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
    // $ANTLR end "rule__IfElseFragment__Group__0"


    // $ANTLR start "rule__IfElseFragment__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1954:1: rule__IfElseFragment__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfElseFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1958:1: ( ( 'if' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1959:1: ( 'if' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1959:1: ( 'if' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1960:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getIfKeyword_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__IfElseFragment__Group__0__Impl4041); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getIfKeyword_0()); 
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
    // $ANTLR end "rule__IfElseFragment__Group__0__Impl"


    // $ANTLR start "rule__IfElseFragment__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1973:1: rule__IfElseFragment__Group__1 : rule__IfElseFragment__Group__1__Impl rule__IfElseFragment__Group__2 ;
    public final void rule__IfElseFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1977:1: ( rule__IfElseFragment__Group__1__Impl rule__IfElseFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1978:2: rule__IfElseFragment__Group__1__Impl rule__IfElseFragment__Group__2
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__1__Impl_in_rule__IfElseFragment__Group__14072);
            rule__IfElseFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__2_in_rule__IfElseFragment__Group__14075);
            rule__IfElseFragment__Group__2();

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
    // $ANTLR end "rule__IfElseFragment__Group__1"


    // $ANTLR start "rule__IfElseFragment__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1985:1: rule__IfElseFragment__Group__1__Impl : ( ( rule__IfElseFragment__ExprAssignment_1 ) ) ;
    public final void rule__IfElseFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1989:1: ( ( ( rule__IfElseFragment__ExprAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1990:1: ( ( rule__IfElseFragment__ExprAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1990:1: ( ( rule__IfElseFragment__ExprAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1991:1: ( rule__IfElseFragment__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getExprAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1992:1: ( rule__IfElseFragment__ExprAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:1992:2: rule__IfElseFragment__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__ExprAssignment_1_in_rule__IfElseFragment__Group__1__Impl4102);
            rule__IfElseFragment__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__IfElseFragment__Group__1__Impl"


    // $ANTLR start "rule__IfElseFragment__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2002:1: rule__IfElseFragment__Group__2 : rule__IfElseFragment__Group__2__Impl rule__IfElseFragment__Group__3 ;
    public final void rule__IfElseFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2006:1: ( rule__IfElseFragment__Group__2__Impl rule__IfElseFragment__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2007:2: rule__IfElseFragment__Group__2__Impl rule__IfElseFragment__Group__3
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__2__Impl_in_rule__IfElseFragment__Group__24132);
            rule__IfElseFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__3_in_rule__IfElseFragment__Group__24135);
            rule__IfElseFragment__Group__3();

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
    // $ANTLR end "rule__IfElseFragment__Group__2"


    // $ANTLR start "rule__IfElseFragment__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2014:1: rule__IfElseFragment__Group__2__Impl : ( 'then' ) ;
    public final void rule__IfElseFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2018:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2019:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2019:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2020:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getThenKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__IfElseFragment__Group__2__Impl4163); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getThenKeyword_2()); 
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
    // $ANTLR end "rule__IfElseFragment__Group__2__Impl"


    // $ANTLR start "rule__IfElseFragment__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2033:1: rule__IfElseFragment__Group__3 : rule__IfElseFragment__Group__3__Impl rule__IfElseFragment__Group__4 ;
    public final void rule__IfElseFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2037:1: ( rule__IfElseFragment__Group__3__Impl rule__IfElseFragment__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2038:2: rule__IfElseFragment__Group__3__Impl rule__IfElseFragment__Group__4
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__3__Impl_in_rule__IfElseFragment__Group__34194);
            rule__IfElseFragment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__4_in_rule__IfElseFragment__Group__34197);
            rule__IfElseFragment__Group__4();

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
    // $ANTLR end "rule__IfElseFragment__Group__3"


    // $ANTLR start "rule__IfElseFragment__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2045:1: rule__IfElseFragment__Group__3__Impl : ( ( rule__IfElseFragment__TransitionAssignment_3 )* ) ;
    public final void rule__IfElseFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2049:1: ( ( ( rule__IfElseFragment__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2050:1: ( ( rule__IfElseFragment__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2050:1: ( ( rule__IfElseFragment__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2051:1: ( rule__IfElseFragment__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2052:1: ( rule__IfElseFragment__TransitionAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID||LA21_0==25||LA21_0==29||(LA21_0>=31 && LA21_0<=34)||(LA21_0>=36 && LA21_0<=38)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2052:2: rule__IfElseFragment__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__IfElseFragment__TransitionAssignment_3_in_rule__IfElseFragment__Group__3__Impl4224);
            	    rule__IfElseFragment__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getTransitionAssignment_3()); 
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
    // $ANTLR end "rule__IfElseFragment__Group__3__Impl"


    // $ANTLR start "rule__IfElseFragment__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2062:1: rule__IfElseFragment__Group__4 : rule__IfElseFragment__Group__4__Impl rule__IfElseFragment__Group__5 ;
    public final void rule__IfElseFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2066:1: ( rule__IfElseFragment__Group__4__Impl rule__IfElseFragment__Group__5 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2067:2: rule__IfElseFragment__Group__4__Impl rule__IfElseFragment__Group__5
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__4__Impl_in_rule__IfElseFragment__Group__44255);
            rule__IfElseFragment__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__5_in_rule__IfElseFragment__Group__44258);
            rule__IfElseFragment__Group__5();

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
    // $ANTLR end "rule__IfElseFragment__Group__4"


    // $ANTLR start "rule__IfElseFragment__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2074:1: rule__IfElseFragment__Group__4__Impl : ( ( rule__IfElseFragment__Group_4__0 )* ) ;
    public final void rule__IfElseFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2078:1: ( ( ( rule__IfElseFragment__Group_4__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2079:1: ( ( rule__IfElseFragment__Group_4__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2079:1: ( ( rule__IfElseFragment__Group_4__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2080:1: ( rule__IfElseFragment__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2081:1: ( rule__IfElseFragment__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2081:2: rule__IfElseFragment__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__IfElseFragment__Group_4__0_in_rule__IfElseFragment__Group__4__Impl4285);
            	    rule__IfElseFragment__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getGroup_4()); 
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
    // $ANTLR end "rule__IfElseFragment__Group__4__Impl"


    // $ANTLR start "rule__IfElseFragment__Group__5"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2091:1: rule__IfElseFragment__Group__5 : rule__IfElseFragment__Group__5__Impl rule__IfElseFragment__Group__6 ;
    public final void rule__IfElseFragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2095:1: ( rule__IfElseFragment__Group__5__Impl rule__IfElseFragment__Group__6 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2096:2: rule__IfElseFragment__Group__5__Impl rule__IfElseFragment__Group__6
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__5__Impl_in_rule__IfElseFragment__Group__54316);
            rule__IfElseFragment__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group__6_in_rule__IfElseFragment__Group__54319);
            rule__IfElseFragment__Group__6();

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
    // $ANTLR end "rule__IfElseFragment__Group__5"


    // $ANTLR start "rule__IfElseFragment__Group__5__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2103:1: rule__IfElseFragment__Group__5__Impl : ( ( rule__IfElseFragment__Group_5__0 )? ) ;
    public final void rule__IfElseFragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2107:1: ( ( ( rule__IfElseFragment__Group_5__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2108:1: ( ( rule__IfElseFragment__Group_5__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2108:1: ( ( rule__IfElseFragment__Group_5__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2109:1: ( rule__IfElseFragment__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getGroup_5()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2110:1: ( rule__IfElseFragment__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2110:2: rule__IfElseFragment__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__IfElseFragment__Group_5__0_in_rule__IfElseFragment__Group__5__Impl4346);
                    rule__IfElseFragment__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getGroup_5()); 
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
    // $ANTLR end "rule__IfElseFragment__Group__5__Impl"


    // $ANTLR start "rule__IfElseFragment__Group__6"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2120:1: rule__IfElseFragment__Group__6 : rule__IfElseFragment__Group__6__Impl ;
    public final void rule__IfElseFragment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2124:1: ( rule__IfElseFragment__Group__6__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2125:2: rule__IfElseFragment__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group__6__Impl_in_rule__IfElseFragment__Group__64377);
            rule__IfElseFragment__Group__6__Impl();

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
    // $ANTLR end "rule__IfElseFragment__Group__6"


    // $ANTLR start "rule__IfElseFragment__Group__6__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2131:1: rule__IfElseFragment__Group__6__Impl : ( 'end' ) ;
    public final void rule__IfElseFragment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2135:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2136:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2136:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2137:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getEndKeyword_6()); 
            }
            match(input,20,FOLLOW_20_in_rule__IfElseFragment__Group__6__Impl4405); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getEndKeyword_6()); 
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
    // $ANTLR end "rule__IfElseFragment__Group__6__Impl"


    // $ANTLR start "rule__IfElseFragment__Group_4__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2164:1: rule__IfElseFragment__Group_4__0 : rule__IfElseFragment__Group_4__0__Impl rule__IfElseFragment__Group_4__1 ;
    public final void rule__IfElseFragment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2168:1: ( rule__IfElseFragment__Group_4__0__Impl rule__IfElseFragment__Group_4__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2169:2: rule__IfElseFragment__Group_4__0__Impl rule__IfElseFragment__Group_4__1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__0__Impl_in_rule__IfElseFragment__Group_4__04450);
            rule__IfElseFragment__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__1_in_rule__IfElseFragment__Group_4__04453);
            rule__IfElseFragment__Group_4__1();

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
    // $ANTLR end "rule__IfElseFragment__Group_4__0"


    // $ANTLR start "rule__IfElseFragment__Group_4__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2176:1: rule__IfElseFragment__Group_4__0__Impl : ( ( 'elsif' ) ) ;
    public final void rule__IfElseFragment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2180:1: ( ( ( 'elsif' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2181:1: ( ( 'elsif' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2181:1: ( ( 'elsif' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2182:1: ( 'elsif' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElsifKeyword_4_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2183:1: ( 'elsif' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2184:2: 'elsif'
            {
            match(input,27,FOLLOW_27_in_rule__IfElseFragment__Group_4__0__Impl4482); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getElsifKeyword_4_0()); 
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
    // $ANTLR end "rule__IfElseFragment__Group_4__0__Impl"


    // $ANTLR start "rule__IfElseFragment__Group_4__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2195:1: rule__IfElseFragment__Group_4__1 : rule__IfElseFragment__Group_4__1__Impl rule__IfElseFragment__Group_4__2 ;
    public final void rule__IfElseFragment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2199:1: ( rule__IfElseFragment__Group_4__1__Impl rule__IfElseFragment__Group_4__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2200:2: rule__IfElseFragment__Group_4__1__Impl rule__IfElseFragment__Group_4__2
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__1__Impl_in_rule__IfElseFragment__Group_4__14514);
            rule__IfElseFragment__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__2_in_rule__IfElseFragment__Group_4__14517);
            rule__IfElseFragment__Group_4__2();

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
    // $ANTLR end "rule__IfElseFragment__Group_4__1"


    // $ANTLR start "rule__IfElseFragment__Group_4__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2207:1: rule__IfElseFragment__Group_4__1__Impl : ( ( rule__IfElseFragment__ElseIfExprAssignment_4_1 ) ) ;
    public final void rule__IfElseFragment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2211:1: ( ( ( rule__IfElseFragment__ElseIfExprAssignment_4_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2212:1: ( ( rule__IfElseFragment__ElseIfExprAssignment_4_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2212:1: ( ( rule__IfElseFragment__ElseIfExprAssignment_4_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2213:1: ( rule__IfElseFragment__ElseIfExprAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseIfExprAssignment_4_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2214:1: ( rule__IfElseFragment__ElseIfExprAssignment_4_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2214:2: rule__IfElseFragment__ElseIfExprAssignment_4_1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__ElseIfExprAssignment_4_1_in_rule__IfElseFragment__Group_4__1__Impl4544);
            rule__IfElseFragment__ElseIfExprAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getElseIfExprAssignment_4_1()); 
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
    // $ANTLR end "rule__IfElseFragment__Group_4__1__Impl"


    // $ANTLR start "rule__IfElseFragment__Group_4__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2224:1: rule__IfElseFragment__Group_4__2 : rule__IfElseFragment__Group_4__2__Impl rule__IfElseFragment__Group_4__3 ;
    public final void rule__IfElseFragment__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2228:1: ( rule__IfElseFragment__Group_4__2__Impl rule__IfElseFragment__Group_4__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2229:2: rule__IfElseFragment__Group_4__2__Impl rule__IfElseFragment__Group_4__3
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__2__Impl_in_rule__IfElseFragment__Group_4__24574);
            rule__IfElseFragment__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__3_in_rule__IfElseFragment__Group_4__24577);
            rule__IfElseFragment__Group_4__3();

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
    // $ANTLR end "rule__IfElseFragment__Group_4__2"


    // $ANTLR start "rule__IfElseFragment__Group_4__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2236:1: rule__IfElseFragment__Group_4__2__Impl : ( 'then' ) ;
    public final void rule__IfElseFragment__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2240:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2241:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2241:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2242:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getThenKeyword_4_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__IfElseFragment__Group_4__2__Impl4605); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getThenKeyword_4_2()); 
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
    // $ANTLR end "rule__IfElseFragment__Group_4__2__Impl"


    // $ANTLR start "rule__IfElseFragment__Group_4__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2255:1: rule__IfElseFragment__Group_4__3 : rule__IfElseFragment__Group_4__3__Impl ;
    public final void rule__IfElseFragment__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2259:1: ( rule__IfElseFragment__Group_4__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2260:2: rule__IfElseFragment__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_4__3__Impl_in_rule__IfElseFragment__Group_4__34636);
            rule__IfElseFragment__Group_4__3__Impl();

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
    // $ANTLR end "rule__IfElseFragment__Group_4__3"


    // $ANTLR start "rule__IfElseFragment__Group_4__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2266:1: rule__IfElseFragment__Group_4__3__Impl : ( ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )* ) ;
    public final void rule__IfElseFragment__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2270:1: ( ( ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2271:1: ( ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2271:1: ( ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2272:1: ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseIftransitionAssignment_4_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2273:1: ( rule__IfElseFragment__ElseIftransitionAssignment_4_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==25||LA24_0==29||(LA24_0>=31 && LA24_0<=34)||(LA24_0>=36 && LA24_0<=38)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2273:2: rule__IfElseFragment__ElseIftransitionAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_rule__IfElseFragment__ElseIftransitionAssignment_4_3_in_rule__IfElseFragment__Group_4__3__Impl4663);
            	    rule__IfElseFragment__ElseIftransitionAssignment_4_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getElseIftransitionAssignment_4_3()); 
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
    // $ANTLR end "rule__IfElseFragment__Group_4__3__Impl"


    // $ANTLR start "rule__IfElseFragment__Group_5__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2291:1: rule__IfElseFragment__Group_5__0 : rule__IfElseFragment__Group_5__0__Impl rule__IfElseFragment__Group_5__1 ;
    public final void rule__IfElseFragment__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2295:1: ( rule__IfElseFragment__Group_5__0__Impl rule__IfElseFragment__Group_5__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2296:2: rule__IfElseFragment__Group_5__0__Impl rule__IfElseFragment__Group_5__1
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_5__0__Impl_in_rule__IfElseFragment__Group_5__04702);
            rule__IfElseFragment__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__IfElseFragment__Group_5__1_in_rule__IfElseFragment__Group_5__04705);
            rule__IfElseFragment__Group_5__1();

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
    // $ANTLR end "rule__IfElseFragment__Group_5__0"


    // $ANTLR start "rule__IfElseFragment__Group_5__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2303:1: rule__IfElseFragment__Group_5__0__Impl : ( ( 'else' ) ) ;
    public final void rule__IfElseFragment__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2307:1: ( ( ( 'else' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2308:1: ( ( 'else' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2308:1: ( ( 'else' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2309:1: ( 'else' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseKeyword_5_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2310:1: ( 'else' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2311:2: 'else'
            {
            match(input,28,FOLLOW_28_in_rule__IfElseFragment__Group_5__0__Impl4734); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getElseKeyword_5_0()); 
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
    // $ANTLR end "rule__IfElseFragment__Group_5__0__Impl"


    // $ANTLR start "rule__IfElseFragment__Group_5__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2322:1: rule__IfElseFragment__Group_5__1 : rule__IfElseFragment__Group_5__1__Impl ;
    public final void rule__IfElseFragment__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2326:1: ( rule__IfElseFragment__Group_5__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2327:2: rule__IfElseFragment__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__IfElseFragment__Group_5__1__Impl_in_rule__IfElseFragment__Group_5__14766);
            rule__IfElseFragment__Group_5__1__Impl();

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
    // $ANTLR end "rule__IfElseFragment__Group_5__1"


    // $ANTLR start "rule__IfElseFragment__Group_5__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2333:1: rule__IfElseFragment__Group_5__1__Impl : ( ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )* ) ;
    public final void rule__IfElseFragment__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2337:1: ( ( ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2338:1: ( ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2338:1: ( ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2339:1: ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseTransitionAssignment_5_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2340:1: ( rule__IfElseFragment__ElseTransitionAssignment_5_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||LA25_0==25||LA25_0==29||(LA25_0>=31 && LA25_0<=34)||(LA25_0>=36 && LA25_0<=38)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2340:2: rule__IfElseFragment__ElseTransitionAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__IfElseFragment__ElseTransitionAssignment_5_1_in_rule__IfElseFragment__Group_5__1__Impl4793);
            	    rule__IfElseFragment__ElseTransitionAssignment_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getElseTransitionAssignment_5_1()); 
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
    // $ANTLR end "rule__IfElseFragment__Group_5__1__Impl"


    // $ANTLR start "rule__ForeachFragment__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2354:1: rule__ForeachFragment__Group__0 : rule__ForeachFragment__Group__0__Impl rule__ForeachFragment__Group__1 ;
    public final void rule__ForeachFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2358:1: ( rule__ForeachFragment__Group__0__Impl rule__ForeachFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2359:2: rule__ForeachFragment__Group__0__Impl rule__ForeachFragment__Group__1
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__0__Impl_in_rule__ForeachFragment__Group__04828);
            rule__ForeachFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachFragment__Group__1_in_rule__ForeachFragment__Group__04831);
            rule__ForeachFragment__Group__1();

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
    // $ANTLR end "rule__ForeachFragment__Group__0"


    // $ANTLR start "rule__ForeachFragment__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2366:1: rule__ForeachFragment__Group__0__Impl : ( 'foreach' ) ;
    public final void rule__ForeachFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2370:1: ( ( 'foreach' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2371:1: ( 'foreach' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2371:1: ( 'foreach' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2372:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getForeachKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__ForeachFragment__Group__0__Impl4859); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentAccess().getForeachKeyword_0()); 
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
    // $ANTLR end "rule__ForeachFragment__Group__0__Impl"


    // $ANTLR start "rule__ForeachFragment__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2385:1: rule__ForeachFragment__Group__1 : rule__ForeachFragment__Group__1__Impl rule__ForeachFragment__Group__2 ;
    public final void rule__ForeachFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2389:1: ( rule__ForeachFragment__Group__1__Impl rule__ForeachFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2390:2: rule__ForeachFragment__Group__1__Impl rule__ForeachFragment__Group__2
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__1__Impl_in_rule__ForeachFragment__Group__14890);
            rule__ForeachFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachFragment__Group__2_in_rule__ForeachFragment__Group__14893);
            rule__ForeachFragment__Group__2();

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
    // $ANTLR end "rule__ForeachFragment__Group__1"


    // $ANTLR start "rule__ForeachFragment__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2397:1: rule__ForeachFragment__Group__1__Impl : ( ( rule__ForeachFragment__ExprAssignment_1 ) ) ;
    public final void rule__ForeachFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2401:1: ( ( ( rule__ForeachFragment__ExprAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2402:1: ( ( rule__ForeachFragment__ExprAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2402:1: ( ( rule__ForeachFragment__ExprAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2403:1: ( rule__ForeachFragment__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getExprAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2404:1: ( rule__ForeachFragment__ExprAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2404:2: rule__ForeachFragment__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__ForeachFragment__ExprAssignment_1_in_rule__ForeachFragment__Group__1__Impl4920);
            rule__ForeachFragment__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__ForeachFragment__Group__1__Impl"


    // $ANTLR start "rule__ForeachFragment__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2414:1: rule__ForeachFragment__Group__2 : rule__ForeachFragment__Group__2__Impl rule__ForeachFragment__Group__3 ;
    public final void rule__ForeachFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2418:1: ( rule__ForeachFragment__Group__2__Impl rule__ForeachFragment__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2419:2: rule__ForeachFragment__Group__2__Impl rule__ForeachFragment__Group__3
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__2__Impl_in_rule__ForeachFragment__Group__24950);
            rule__ForeachFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachFragment__Group__3_in_rule__ForeachFragment__Group__24953);
            rule__ForeachFragment__Group__3();

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
    // $ANTLR end "rule__ForeachFragment__Group__2"


    // $ANTLR start "rule__ForeachFragment__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2426:1: rule__ForeachFragment__Group__2__Impl : ( 'do' ) ;
    public final void rule__ForeachFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2430:1: ( ( 'do' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2431:1: ( 'do' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2431:1: ( 'do' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2432:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getDoKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__ForeachFragment__Group__2__Impl4981); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentAccess().getDoKeyword_2()); 
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
    // $ANTLR end "rule__ForeachFragment__Group__2__Impl"


    // $ANTLR start "rule__ForeachFragment__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2445:1: rule__ForeachFragment__Group__3 : rule__ForeachFragment__Group__3__Impl rule__ForeachFragment__Group__4 ;
    public final void rule__ForeachFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2449:1: ( rule__ForeachFragment__Group__3__Impl rule__ForeachFragment__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2450:2: rule__ForeachFragment__Group__3__Impl rule__ForeachFragment__Group__4
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__3__Impl_in_rule__ForeachFragment__Group__35012);
            rule__ForeachFragment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachFragment__Group__4_in_rule__ForeachFragment__Group__35015);
            rule__ForeachFragment__Group__4();

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
    // $ANTLR end "rule__ForeachFragment__Group__3"


    // $ANTLR start "rule__ForeachFragment__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2457:1: rule__ForeachFragment__Group__3__Impl : ( ( rule__ForeachFragment__TransitionAssignment_3 )* ) ;
    public final void rule__ForeachFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2461:1: ( ( ( rule__ForeachFragment__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2462:1: ( ( rule__ForeachFragment__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2462:1: ( ( rule__ForeachFragment__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2463:1: ( rule__ForeachFragment__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2464:1: ( rule__ForeachFragment__TransitionAssignment_3 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||LA26_0==25||LA26_0==29||(LA26_0>=31 && LA26_0<=34)||(LA26_0>=36 && LA26_0<=38)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2464:2: rule__ForeachFragment__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ForeachFragment__TransitionAssignment_3_in_rule__ForeachFragment__Group__3__Impl5042);
            	    rule__ForeachFragment__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentAccess().getTransitionAssignment_3()); 
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
    // $ANTLR end "rule__ForeachFragment__Group__3__Impl"


    // $ANTLR start "rule__ForeachFragment__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2474:1: rule__ForeachFragment__Group__4 : rule__ForeachFragment__Group__4__Impl ;
    public final void rule__ForeachFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2478:1: ( rule__ForeachFragment__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2479:2: rule__ForeachFragment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ForeachFragment__Group__4__Impl_in_rule__ForeachFragment__Group__45073);
            rule__ForeachFragment__Group__4__Impl();

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
    // $ANTLR end "rule__ForeachFragment__Group__4"


    // $ANTLR start "rule__ForeachFragment__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2485:1: rule__ForeachFragment__Group__4__Impl : ( 'end' ) ;
    public final void rule__ForeachFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2489:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2490:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2490:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2491:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__ForeachFragment__Group__4__Impl5101); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__ForeachFragment__Group__4__Impl"


    // $ANTLR start "rule__LoopFragment__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2514:1: rule__LoopFragment__Group__0 : rule__LoopFragment__Group__0__Impl rule__LoopFragment__Group__1 ;
    public final void rule__LoopFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2518:1: ( rule__LoopFragment__Group__0__Impl rule__LoopFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2519:2: rule__LoopFragment__Group__0__Impl rule__LoopFragment__Group__1
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__0__Impl_in_rule__LoopFragment__Group__05142);
            rule__LoopFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopFragment__Group__1_in_rule__LoopFragment__Group__05145);
            rule__LoopFragment__Group__1();

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
    // $ANTLR end "rule__LoopFragment__Group__0"


    // $ANTLR start "rule__LoopFragment__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2526:1: rule__LoopFragment__Group__0__Impl : ( 'while' ) ;
    public final void rule__LoopFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2530:1: ( ( 'while' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2531:1: ( 'while' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2531:1: ( 'while' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2532:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getWhileKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__LoopFragment__Group__0__Impl5173); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentAccess().getWhileKeyword_0()); 
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
    // $ANTLR end "rule__LoopFragment__Group__0__Impl"


    // $ANTLR start "rule__LoopFragment__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2545:1: rule__LoopFragment__Group__1 : rule__LoopFragment__Group__1__Impl rule__LoopFragment__Group__2 ;
    public final void rule__LoopFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2549:1: ( rule__LoopFragment__Group__1__Impl rule__LoopFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2550:2: rule__LoopFragment__Group__1__Impl rule__LoopFragment__Group__2
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__1__Impl_in_rule__LoopFragment__Group__15204);
            rule__LoopFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopFragment__Group__2_in_rule__LoopFragment__Group__15207);
            rule__LoopFragment__Group__2();

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
    // $ANTLR end "rule__LoopFragment__Group__1"


    // $ANTLR start "rule__LoopFragment__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2557:1: rule__LoopFragment__Group__1__Impl : ( ( rule__LoopFragment__ExprAssignment_1 ) ) ;
    public final void rule__LoopFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2561:1: ( ( ( rule__LoopFragment__ExprAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2562:1: ( ( rule__LoopFragment__ExprAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2562:1: ( ( rule__LoopFragment__ExprAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2563:1: ( rule__LoopFragment__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getExprAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2564:1: ( rule__LoopFragment__ExprAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2564:2: rule__LoopFragment__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__LoopFragment__ExprAssignment_1_in_rule__LoopFragment__Group__1__Impl5234);
            rule__LoopFragment__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__LoopFragment__Group__1__Impl"


    // $ANTLR start "rule__LoopFragment__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2574:1: rule__LoopFragment__Group__2 : rule__LoopFragment__Group__2__Impl rule__LoopFragment__Group__3 ;
    public final void rule__LoopFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2578:1: ( rule__LoopFragment__Group__2__Impl rule__LoopFragment__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2579:2: rule__LoopFragment__Group__2__Impl rule__LoopFragment__Group__3
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__2__Impl_in_rule__LoopFragment__Group__25264);
            rule__LoopFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopFragment__Group__3_in_rule__LoopFragment__Group__25267);
            rule__LoopFragment__Group__3();

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
    // $ANTLR end "rule__LoopFragment__Group__2"


    // $ANTLR start "rule__LoopFragment__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2586:1: rule__LoopFragment__Group__2__Impl : ( 'do' ) ;
    public final void rule__LoopFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2590:1: ( ( 'do' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2591:1: ( 'do' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2591:1: ( 'do' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2592:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getDoKeyword_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__LoopFragment__Group__2__Impl5295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentAccess().getDoKeyword_2()); 
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
    // $ANTLR end "rule__LoopFragment__Group__2__Impl"


    // $ANTLR start "rule__LoopFragment__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2605:1: rule__LoopFragment__Group__3 : rule__LoopFragment__Group__3__Impl rule__LoopFragment__Group__4 ;
    public final void rule__LoopFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2609:1: ( rule__LoopFragment__Group__3__Impl rule__LoopFragment__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2610:2: rule__LoopFragment__Group__3__Impl rule__LoopFragment__Group__4
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__3__Impl_in_rule__LoopFragment__Group__35326);
            rule__LoopFragment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LoopFragment__Group__4_in_rule__LoopFragment__Group__35329);
            rule__LoopFragment__Group__4();

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
    // $ANTLR end "rule__LoopFragment__Group__3"


    // $ANTLR start "rule__LoopFragment__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2617:1: rule__LoopFragment__Group__3__Impl : ( ( rule__LoopFragment__TransitionAssignment_3 )* ) ;
    public final void rule__LoopFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2621:1: ( ( ( rule__LoopFragment__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2622:1: ( ( rule__LoopFragment__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2622:1: ( ( rule__LoopFragment__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2623:1: ( rule__LoopFragment__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2624:1: ( rule__LoopFragment__TransitionAssignment_3 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||LA27_0==25||LA27_0==29||(LA27_0>=31 && LA27_0<=34)||(LA27_0>=36 && LA27_0<=38)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2624:2: rule__LoopFragment__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__LoopFragment__TransitionAssignment_3_in_rule__LoopFragment__Group__3__Impl5356);
            	    rule__LoopFragment__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentAccess().getTransitionAssignment_3()); 
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
    // $ANTLR end "rule__LoopFragment__Group__3__Impl"


    // $ANTLR start "rule__LoopFragment__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2634:1: rule__LoopFragment__Group__4 : rule__LoopFragment__Group__4__Impl ;
    public final void rule__LoopFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2638:1: ( rule__LoopFragment__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2639:2: rule__LoopFragment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LoopFragment__Group__4__Impl_in_rule__LoopFragment__Group__45387);
            rule__LoopFragment__Group__4__Impl();

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
    // $ANTLR end "rule__LoopFragment__Group__4"


    // $ANTLR start "rule__LoopFragment__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2645:1: rule__LoopFragment__Group__4__Impl : ( 'end' ) ;
    public final void rule__LoopFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2649:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2650:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2650:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2651:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__LoopFragment__Group__4__Impl5415); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__LoopFragment__Group__4__Impl"


    // $ANTLR start "rule__AssertFragment__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2674:1: rule__AssertFragment__Group__0 : rule__AssertFragment__Group__0__Impl rule__AssertFragment__Group__1 ;
    public final void rule__AssertFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2678:1: ( rule__AssertFragment__Group__0__Impl rule__AssertFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2679:2: rule__AssertFragment__Group__0__Impl rule__AssertFragment__Group__1
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__0__Impl_in_rule__AssertFragment__Group__05456);
            rule__AssertFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssertFragment__Group__1_in_rule__AssertFragment__Group__05459);
            rule__AssertFragment__Group__1();

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
    // $ANTLR end "rule__AssertFragment__Group__0"


    // $ANTLR start "rule__AssertFragment__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2686:1: rule__AssertFragment__Group__0__Impl : ( 'assert' ) ;
    public final void rule__AssertFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2690:1: ( ( 'assert' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2691:1: ( 'assert' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2691:1: ( 'assert' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2692:1: 'assert'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getAssertKeyword_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__AssertFragment__Group__0__Impl5487); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentAccess().getAssertKeyword_0()); 
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
    // $ANTLR end "rule__AssertFragment__Group__0__Impl"


    // $ANTLR start "rule__AssertFragment__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2705:1: rule__AssertFragment__Group__1 : rule__AssertFragment__Group__1__Impl rule__AssertFragment__Group__2 ;
    public final void rule__AssertFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2709:1: ( rule__AssertFragment__Group__1__Impl rule__AssertFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2710:2: rule__AssertFragment__Group__1__Impl rule__AssertFragment__Group__2
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__1__Impl_in_rule__AssertFragment__Group__15518);
            rule__AssertFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssertFragment__Group__2_in_rule__AssertFragment__Group__15521);
            rule__AssertFragment__Group__2();

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
    // $ANTLR end "rule__AssertFragment__Group__1"


    // $ANTLR start "rule__AssertFragment__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2717:1: rule__AssertFragment__Group__1__Impl : ( ( rule__AssertFragment__ExprAssignment_1 ) ) ;
    public final void rule__AssertFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2721:1: ( ( ( rule__AssertFragment__ExprAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2722:1: ( ( rule__AssertFragment__ExprAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2722:1: ( ( rule__AssertFragment__ExprAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2723:1: ( rule__AssertFragment__ExprAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getExprAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2724:1: ( rule__AssertFragment__ExprAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2724:2: rule__AssertFragment__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__AssertFragment__ExprAssignment_1_in_rule__AssertFragment__Group__1__Impl5548);
            rule__AssertFragment__ExprAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentAccess().getExprAssignment_1()); 
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
    // $ANTLR end "rule__AssertFragment__Group__1__Impl"


    // $ANTLR start "rule__AssertFragment__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2734:1: rule__AssertFragment__Group__2 : rule__AssertFragment__Group__2__Impl rule__AssertFragment__Group__3 ;
    public final void rule__AssertFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2738:1: ( rule__AssertFragment__Group__2__Impl rule__AssertFragment__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2739:2: rule__AssertFragment__Group__2__Impl rule__AssertFragment__Group__3
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__2__Impl_in_rule__AssertFragment__Group__25578);
            rule__AssertFragment__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssertFragment__Group__3_in_rule__AssertFragment__Group__25581);
            rule__AssertFragment__Group__3();

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
    // $ANTLR end "rule__AssertFragment__Group__2"


    // $ANTLR start "rule__AssertFragment__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2746:1: rule__AssertFragment__Group__2__Impl : ( 'then' ) ;
    public final void rule__AssertFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2750:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2751:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2751:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2752:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getThenKeyword_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__AssertFragment__Group__2__Impl5609); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentAccess().getThenKeyword_2()); 
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
    // $ANTLR end "rule__AssertFragment__Group__2__Impl"


    // $ANTLR start "rule__AssertFragment__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2765:1: rule__AssertFragment__Group__3 : rule__AssertFragment__Group__3__Impl rule__AssertFragment__Group__4 ;
    public final void rule__AssertFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2769:1: ( rule__AssertFragment__Group__3__Impl rule__AssertFragment__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2770:2: rule__AssertFragment__Group__3__Impl rule__AssertFragment__Group__4
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__3__Impl_in_rule__AssertFragment__Group__35640);
            rule__AssertFragment__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__AssertFragment__Group__4_in_rule__AssertFragment__Group__35643);
            rule__AssertFragment__Group__4();

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
    // $ANTLR end "rule__AssertFragment__Group__3"


    // $ANTLR start "rule__AssertFragment__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2777:1: rule__AssertFragment__Group__3__Impl : ( ( rule__AssertFragment__TransitionAssignment_3 )* ) ;
    public final void rule__AssertFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2781:1: ( ( ( rule__AssertFragment__TransitionAssignment_3 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2782:1: ( ( rule__AssertFragment__TransitionAssignment_3 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2782:1: ( ( rule__AssertFragment__TransitionAssignment_3 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2783:1: ( rule__AssertFragment__TransitionAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getTransitionAssignment_3()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2784:1: ( rule__AssertFragment__TransitionAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==25||LA28_0==29||(LA28_0>=31 && LA28_0<=34)||(LA28_0>=36 && LA28_0<=38)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2784:2: rule__AssertFragment__TransitionAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__AssertFragment__TransitionAssignment_3_in_rule__AssertFragment__Group__3__Impl5670);
            	    rule__AssertFragment__TransitionAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentAccess().getTransitionAssignment_3()); 
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
    // $ANTLR end "rule__AssertFragment__Group__3__Impl"


    // $ANTLR start "rule__AssertFragment__Group__4"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2794:1: rule__AssertFragment__Group__4 : rule__AssertFragment__Group__4__Impl ;
    public final void rule__AssertFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2798:1: ( rule__AssertFragment__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2799:2: rule__AssertFragment__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AssertFragment__Group__4__Impl_in_rule__AssertFragment__Group__45701);
            rule__AssertFragment__Group__4__Impl();

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
    // $ANTLR end "rule__AssertFragment__Group__4"


    // $ANTLR start "rule__AssertFragment__Group__4__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2805:1: rule__AssertFragment__Group__4__Impl : ( 'end' ) ;
    public final void rule__AssertFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2809:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2810:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2810:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2811:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getEndKeyword_4()); 
            }
            match(input,20,FOLLOW_20_in_rule__AssertFragment__Group__4__Impl5729); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentAccess().getEndKeyword_4()); 
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
    // $ANTLR end "rule__AssertFragment__Group__4__Impl"


    // $ANTLR start "rule__BreakFragment__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2834:1: rule__BreakFragment__Group__0 : rule__BreakFragment__Group__0__Impl rule__BreakFragment__Group__1 ;
    public final void rule__BreakFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2838:1: ( rule__BreakFragment__Group__0__Impl rule__BreakFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2839:2: rule__BreakFragment__Group__0__Impl rule__BreakFragment__Group__1
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group__0__Impl_in_rule__BreakFragment__Group__05770);
            rule__BreakFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group__1_in_rule__BreakFragment__Group__05773);
            rule__BreakFragment__Group__1();

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
    // $ANTLR end "rule__BreakFragment__Group__0"


    // $ANTLR start "rule__BreakFragment__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2846:1: rule__BreakFragment__Group__0__Impl : ( () ) ;
    public final void rule__BreakFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2850:1: ( ( () ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2851:1: ( () )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2851:1: ( () )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2852:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getBreakFragmentAction_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2853:1: ()
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2855:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getBreakFragmentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BreakFragment__Group__0__Impl"


    // $ANTLR start "rule__BreakFragment__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2865:1: rule__BreakFragment__Group__1 : rule__BreakFragment__Group__1__Impl rule__BreakFragment__Group__2 ;
    public final void rule__BreakFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2869:1: ( rule__BreakFragment__Group__1__Impl rule__BreakFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2870:2: rule__BreakFragment__Group__1__Impl rule__BreakFragment__Group__2
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group__1__Impl_in_rule__BreakFragment__Group__15831);
            rule__BreakFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group__2_in_rule__BreakFragment__Group__15834);
            rule__BreakFragment__Group__2();

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
    // $ANTLR end "rule__BreakFragment__Group__1"


    // $ANTLR start "rule__BreakFragment__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2877:1: rule__BreakFragment__Group__1__Impl : ( 'break' ) ;
    public final void rule__BreakFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2881:1: ( ( 'break' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2882:1: ( 'break' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2882:1: ( 'break' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2883:1: 'break'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getBreakKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__BreakFragment__Group__1__Impl5862); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getBreakKeyword_1()); 
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
    // $ANTLR end "rule__BreakFragment__Group__1__Impl"


    // $ANTLR start "rule__BreakFragment__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2896:1: rule__BreakFragment__Group__2 : rule__BreakFragment__Group__2__Impl ;
    public final void rule__BreakFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2900:1: ( rule__BreakFragment__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2901:2: rule__BreakFragment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group__2__Impl_in_rule__BreakFragment__Group__25893);
            rule__BreakFragment__Group__2__Impl();

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
    // $ANTLR end "rule__BreakFragment__Group__2"


    // $ANTLR start "rule__BreakFragment__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2907:1: rule__BreakFragment__Group__2__Impl : ( ( rule__BreakFragment__Group_2__0 )? ) ;
    public final void rule__BreakFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2911:1: ( ( ( rule__BreakFragment__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2912:1: ( ( rule__BreakFragment__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2912:1: ( ( rule__BreakFragment__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2913:1: ( rule__BreakFragment__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2914:1: ( rule__BreakFragment__Group_2__0 )?
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2914:2: rule__BreakFragment__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__BreakFragment__Group_2__0_in_rule__BreakFragment__Group__2__Impl5920);
                    rule__BreakFragment__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getGroup_2()); 
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
    // $ANTLR end "rule__BreakFragment__Group__2__Impl"


    // $ANTLR start "rule__BreakFragment__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2930:1: rule__BreakFragment__Group_2__0 : rule__BreakFragment__Group_2__0__Impl rule__BreakFragment__Group_2__1 ;
    public final void rule__BreakFragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2934:1: ( rule__BreakFragment__Group_2__0__Impl rule__BreakFragment__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2935:2: rule__BreakFragment__Group_2__0__Impl rule__BreakFragment__Group_2__1
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__0__Impl_in_rule__BreakFragment__Group_2__05957);
            rule__BreakFragment__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__1_in_rule__BreakFragment__Group_2__05960);
            rule__BreakFragment__Group_2__1();

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
    // $ANTLR end "rule__BreakFragment__Group_2__0"


    // $ANTLR start "rule__BreakFragment__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2942:1: rule__BreakFragment__Group_2__0__Impl : ( ( rule__BreakFragment__ExprAssignment_2_0 ) ) ;
    public final void rule__BreakFragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2946:1: ( ( ( rule__BreakFragment__ExprAssignment_2_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2947:1: ( ( rule__BreakFragment__ExprAssignment_2_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2947:1: ( ( rule__BreakFragment__ExprAssignment_2_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2948:1: ( rule__BreakFragment__ExprAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getExprAssignment_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2949:1: ( rule__BreakFragment__ExprAssignment_2_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2949:2: rule__BreakFragment__ExprAssignment_2_0
            {
            pushFollow(FOLLOW_rule__BreakFragment__ExprAssignment_2_0_in_rule__BreakFragment__Group_2__0__Impl5987);
            rule__BreakFragment__ExprAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getExprAssignment_2_0()); 
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
    // $ANTLR end "rule__BreakFragment__Group_2__0__Impl"


    // $ANTLR start "rule__BreakFragment__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2959:1: rule__BreakFragment__Group_2__1 : rule__BreakFragment__Group_2__1__Impl rule__BreakFragment__Group_2__2 ;
    public final void rule__BreakFragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2963:1: ( rule__BreakFragment__Group_2__1__Impl rule__BreakFragment__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2964:2: rule__BreakFragment__Group_2__1__Impl rule__BreakFragment__Group_2__2
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__1__Impl_in_rule__BreakFragment__Group_2__16017);
            rule__BreakFragment__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__2_in_rule__BreakFragment__Group_2__16020);
            rule__BreakFragment__Group_2__2();

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
    // $ANTLR end "rule__BreakFragment__Group_2__1"


    // $ANTLR start "rule__BreakFragment__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2971:1: rule__BreakFragment__Group_2__1__Impl : ( 'then' ) ;
    public final void rule__BreakFragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2975:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2976:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2976:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2977:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getThenKeyword_2_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__BreakFragment__Group_2__1__Impl6048); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getThenKeyword_2_1()); 
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
    // $ANTLR end "rule__BreakFragment__Group_2__1__Impl"


    // $ANTLR start "rule__BreakFragment__Group_2__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2990:1: rule__BreakFragment__Group_2__2 : rule__BreakFragment__Group_2__2__Impl rule__BreakFragment__Group_2__3 ;
    public final void rule__BreakFragment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2994:1: ( rule__BreakFragment__Group_2__2__Impl rule__BreakFragment__Group_2__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:2995:2: rule__BreakFragment__Group_2__2__Impl rule__BreakFragment__Group_2__3
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__2__Impl_in_rule__BreakFragment__Group_2__26079);
            rule__BreakFragment__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__3_in_rule__BreakFragment__Group_2__26082);
            rule__BreakFragment__Group_2__3();

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
    // $ANTLR end "rule__BreakFragment__Group_2__2"


    // $ANTLR start "rule__BreakFragment__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3002:1: rule__BreakFragment__Group_2__2__Impl : ( ( rule__BreakFragment__TransitionAssignment_2_2 )* ) ;
    public final void rule__BreakFragment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3006:1: ( ( ( rule__BreakFragment__TransitionAssignment_2_2 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3007:1: ( ( rule__BreakFragment__TransitionAssignment_2_2 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3007:1: ( ( rule__BreakFragment__TransitionAssignment_2_2 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3008:1: ( rule__BreakFragment__TransitionAssignment_2_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getTransitionAssignment_2_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3009:1: ( rule__BreakFragment__TransitionAssignment_2_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID||LA30_0==25||LA30_0==29||(LA30_0>=31 && LA30_0<=34)||(LA30_0>=36 && LA30_0<=38)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3009:2: rule__BreakFragment__TransitionAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__BreakFragment__TransitionAssignment_2_2_in_rule__BreakFragment__Group_2__2__Impl6109);
            	    rule__BreakFragment__TransitionAssignment_2_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getTransitionAssignment_2_2()); 
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
    // $ANTLR end "rule__BreakFragment__Group_2__2__Impl"


    // $ANTLR start "rule__BreakFragment__Group_2__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3019:1: rule__BreakFragment__Group_2__3 : rule__BreakFragment__Group_2__3__Impl ;
    public final void rule__BreakFragment__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3023:1: ( rule__BreakFragment__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3024:2: rule__BreakFragment__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__BreakFragment__Group_2__3__Impl_in_rule__BreakFragment__Group_2__36140);
            rule__BreakFragment__Group_2__3__Impl();

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
    // $ANTLR end "rule__BreakFragment__Group_2__3"


    // $ANTLR start "rule__BreakFragment__Group_2__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3030:1: rule__BreakFragment__Group_2__3__Impl : ( 'end' ) ;
    public final void rule__BreakFragment__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3034:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3035:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3035:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3036:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getEndKeyword_2_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__BreakFragment__Group_2__3__Impl6168); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getEndKeyword_2_3()); 
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
    // $ANTLR end "rule__BreakFragment__Group_2__3__Impl"


    // $ANTLR start "rule__NextFragment__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3057:1: rule__NextFragment__Group__0 : rule__NextFragment__Group__0__Impl rule__NextFragment__Group__1 ;
    public final void rule__NextFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3061:1: ( rule__NextFragment__Group__0__Impl rule__NextFragment__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3062:2: rule__NextFragment__Group__0__Impl rule__NextFragment__Group__1
            {
            pushFollow(FOLLOW_rule__NextFragment__Group__0__Impl_in_rule__NextFragment__Group__06207);
            rule__NextFragment__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group__1_in_rule__NextFragment__Group__06210);
            rule__NextFragment__Group__1();

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
    // $ANTLR end "rule__NextFragment__Group__0"


    // $ANTLR start "rule__NextFragment__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3069:1: rule__NextFragment__Group__0__Impl : ( () ) ;
    public final void rule__NextFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3073:1: ( ( () ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3074:1: ( () )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3074:1: ( () )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3075:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getNextFragmentAction_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3076:1: ()
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3078:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getNextFragmentAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextFragment__Group__0__Impl"


    // $ANTLR start "rule__NextFragment__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3088:1: rule__NextFragment__Group__1 : rule__NextFragment__Group__1__Impl rule__NextFragment__Group__2 ;
    public final void rule__NextFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3092:1: ( rule__NextFragment__Group__1__Impl rule__NextFragment__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3093:2: rule__NextFragment__Group__1__Impl rule__NextFragment__Group__2
            {
            pushFollow(FOLLOW_rule__NextFragment__Group__1__Impl_in_rule__NextFragment__Group__16268);
            rule__NextFragment__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group__2_in_rule__NextFragment__Group__16271);
            rule__NextFragment__Group__2();

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
    // $ANTLR end "rule__NextFragment__Group__1"


    // $ANTLR start "rule__NextFragment__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3100:1: rule__NextFragment__Group__1__Impl : ( 'next' ) ;
    public final void rule__NextFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3104:1: ( ( 'next' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3105:1: ( 'next' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3105:1: ( 'next' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3106:1: 'next'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getNextKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__NextFragment__Group__1__Impl6299); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getNextKeyword_1()); 
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
    // $ANTLR end "rule__NextFragment__Group__1__Impl"


    // $ANTLR start "rule__NextFragment__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3119:1: rule__NextFragment__Group__2 : rule__NextFragment__Group__2__Impl ;
    public final void rule__NextFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3123:1: ( rule__NextFragment__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3124:2: rule__NextFragment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NextFragment__Group__2__Impl_in_rule__NextFragment__Group__26330);
            rule__NextFragment__Group__2__Impl();

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
    // $ANTLR end "rule__NextFragment__Group__2"


    // $ANTLR start "rule__NextFragment__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3130:1: rule__NextFragment__Group__2__Impl : ( ( rule__NextFragment__Group_2__0 )? ) ;
    public final void rule__NextFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3134:1: ( ( ( rule__NextFragment__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3135:1: ( ( rule__NextFragment__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3135:1: ( ( rule__NextFragment__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3136:1: ( rule__NextFragment__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3137:1: ( rule__NextFragment__Group_2__0 )?
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3137:2: rule__NextFragment__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NextFragment__Group_2__0_in_rule__NextFragment__Group__2__Impl6357);
                    rule__NextFragment__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getGroup_2()); 
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
    // $ANTLR end "rule__NextFragment__Group__2__Impl"


    // $ANTLR start "rule__NextFragment__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3153:1: rule__NextFragment__Group_2__0 : rule__NextFragment__Group_2__0__Impl rule__NextFragment__Group_2__1 ;
    public final void rule__NextFragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3157:1: ( rule__NextFragment__Group_2__0__Impl rule__NextFragment__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3158:2: rule__NextFragment__Group_2__0__Impl rule__NextFragment__Group_2__1
            {
            pushFollow(FOLLOW_rule__NextFragment__Group_2__0__Impl_in_rule__NextFragment__Group_2__06394);
            rule__NextFragment__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group_2__1_in_rule__NextFragment__Group_2__06397);
            rule__NextFragment__Group_2__1();

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
    // $ANTLR end "rule__NextFragment__Group_2__0"


    // $ANTLR start "rule__NextFragment__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3165:1: rule__NextFragment__Group_2__0__Impl : ( ( rule__NextFragment__ExprAssignment_2_0 ) ) ;
    public final void rule__NextFragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3169:1: ( ( ( rule__NextFragment__ExprAssignment_2_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3170:1: ( ( rule__NextFragment__ExprAssignment_2_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3170:1: ( ( rule__NextFragment__ExprAssignment_2_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3171:1: ( rule__NextFragment__ExprAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getExprAssignment_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3172:1: ( rule__NextFragment__ExprAssignment_2_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3172:2: rule__NextFragment__ExprAssignment_2_0
            {
            pushFollow(FOLLOW_rule__NextFragment__ExprAssignment_2_0_in_rule__NextFragment__Group_2__0__Impl6424);
            rule__NextFragment__ExprAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getExprAssignment_2_0()); 
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
    // $ANTLR end "rule__NextFragment__Group_2__0__Impl"


    // $ANTLR start "rule__NextFragment__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3182:1: rule__NextFragment__Group_2__1 : rule__NextFragment__Group_2__1__Impl rule__NextFragment__Group_2__2 ;
    public final void rule__NextFragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3186:1: ( rule__NextFragment__Group_2__1__Impl rule__NextFragment__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3187:2: rule__NextFragment__Group_2__1__Impl rule__NextFragment__Group_2__2
            {
            pushFollow(FOLLOW_rule__NextFragment__Group_2__1__Impl_in_rule__NextFragment__Group_2__16454);
            rule__NextFragment__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group_2__2_in_rule__NextFragment__Group_2__16457);
            rule__NextFragment__Group_2__2();

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
    // $ANTLR end "rule__NextFragment__Group_2__1"


    // $ANTLR start "rule__NextFragment__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3194:1: rule__NextFragment__Group_2__1__Impl : ( 'then' ) ;
    public final void rule__NextFragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3198:1: ( ( 'then' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3199:1: ( 'then' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3199:1: ( 'then' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3200:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getThenKeyword_2_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__NextFragment__Group_2__1__Impl6485); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getThenKeyword_2_1()); 
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
    // $ANTLR end "rule__NextFragment__Group_2__1__Impl"


    // $ANTLR start "rule__NextFragment__Group_2__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3213:1: rule__NextFragment__Group_2__2 : rule__NextFragment__Group_2__2__Impl rule__NextFragment__Group_2__3 ;
    public final void rule__NextFragment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3217:1: ( rule__NextFragment__Group_2__2__Impl rule__NextFragment__Group_2__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3218:2: rule__NextFragment__Group_2__2__Impl rule__NextFragment__Group_2__3
            {
            pushFollow(FOLLOW_rule__NextFragment__Group_2__2__Impl_in_rule__NextFragment__Group_2__26516);
            rule__NextFragment__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NextFragment__Group_2__3_in_rule__NextFragment__Group_2__26519);
            rule__NextFragment__Group_2__3();

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
    // $ANTLR end "rule__NextFragment__Group_2__2"


    // $ANTLR start "rule__NextFragment__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3225:1: rule__NextFragment__Group_2__2__Impl : ( ( rule__NextFragment__TransitionAssignment_2_2 )* ) ;
    public final void rule__NextFragment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3229:1: ( ( ( rule__NextFragment__TransitionAssignment_2_2 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3230:1: ( ( rule__NextFragment__TransitionAssignment_2_2 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3230:1: ( ( rule__NextFragment__TransitionAssignment_2_2 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3231:1: ( rule__NextFragment__TransitionAssignment_2_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getTransitionAssignment_2_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3232:1: ( rule__NextFragment__TransitionAssignment_2_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID||LA32_0==25||LA32_0==29||(LA32_0>=31 && LA32_0<=34)||(LA32_0>=36 && LA32_0<=38)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3232:2: rule__NextFragment__TransitionAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__NextFragment__TransitionAssignment_2_2_in_rule__NextFragment__Group_2__2__Impl6546);
            	    rule__NextFragment__TransitionAssignment_2_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getTransitionAssignment_2_2()); 
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
    // $ANTLR end "rule__NextFragment__Group_2__2__Impl"


    // $ANTLR start "rule__NextFragment__Group_2__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3242:1: rule__NextFragment__Group_2__3 : rule__NextFragment__Group_2__3__Impl ;
    public final void rule__NextFragment__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3246:1: ( rule__NextFragment__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3247:2: rule__NextFragment__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__NextFragment__Group_2__3__Impl_in_rule__NextFragment__Group_2__36577);
            rule__NextFragment__Group_2__3__Impl();

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
    // $ANTLR end "rule__NextFragment__Group_2__3"


    // $ANTLR start "rule__NextFragment__Group_2__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3253:1: rule__NextFragment__Group_2__3__Impl : ( 'end' ) ;
    public final void rule__NextFragment__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3257:1: ( ( 'end' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3258:1: ( 'end' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3258:1: ( 'end' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3259:1: 'end'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getEndKeyword_2_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__NextFragment__Group_2__3__Impl6605); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getEndKeyword_2_3()); 
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
    // $ANTLR end "rule__NextFragment__Group_2__3__Impl"


    // $ANTLR start "rule__CallMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3280:1: rule__CallMessage__Group__0 : rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1 ;
    public final void rule__CallMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3284:1: ( rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3285:2: rule__CallMessage__Group__0__Impl rule__CallMessage__Group__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__0__Impl_in_rule__CallMessage__Group__06644);
            rule__CallMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__1_in_rule__CallMessage__Group__06647);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3292:1: rule__CallMessage__Group__0__Impl : ( ( rule__CallMessage__Group_0__0 )? ) ;
    public final void rule__CallMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3296:1: ( ( ( rule__CallMessage__Group_0__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3297:1: ( ( rule__CallMessage__Group_0__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3297:1: ( ( rule__CallMessage__Group_0__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3298:1: ( rule__CallMessage__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3299:1: ( rule__CallMessage__Group_0__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==35) ) {
                    alt33=1;
                }
            }
            switch (alt33) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3299:2: rule__CallMessage__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__Group_0__0_in_rule__CallMessage__Group__0__Impl6674);
                    rule__CallMessage__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_0()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3309:1: rule__CallMessage__Group__1 : rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2 ;
    public final void rule__CallMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3313:1: ( rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3314:2: rule__CallMessage__Group__1__Impl rule__CallMessage__Group__2
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__1__Impl_in_rule__CallMessage__Group__16705);
            rule__CallMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group__2_in_rule__CallMessage__Group__16708);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3321:1: rule__CallMessage__Group__1__Impl : ( ( rule__CallMessage__NameAssignment_1 ) ) ;
    public final void rule__CallMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3325:1: ( ( ( rule__CallMessage__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3326:1: ( ( rule__CallMessage__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3326:1: ( ( rule__CallMessage__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3327:1: ( rule__CallMessage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3328:1: ( rule__CallMessage__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3328:2: rule__CallMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CallMessage__NameAssignment_1_in_rule__CallMessage__Group__1__Impl6735);
            rule__CallMessage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getNameAssignment_1()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3338:1: rule__CallMessage__Group__2 : rule__CallMessage__Group__2__Impl ;
    public final void rule__CallMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3342:1: ( rule__CallMessage__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3343:2: rule__CallMessage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group__2__Impl_in_rule__CallMessage__Group__26765);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3349:1: rule__CallMessage__Group__2__Impl : ( ( rule__CallMessage__Group_2__0 )? ) ;
    public final void rule__CallMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3353:1: ( ( ( rule__CallMessage__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3354:1: ( ( rule__CallMessage__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3354:1: ( ( rule__CallMessage__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3355:1: ( rule__CallMessage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3356:1: ( rule__CallMessage__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3356:2: rule__CallMessage__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__Group_2__0_in_rule__CallMessage__Group__2__Impl6792);
                    rule__CallMessage__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_2()); 
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


    // $ANTLR start "rule__CallMessage__Group_0__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3372:1: rule__CallMessage__Group_0__0 : rule__CallMessage__Group_0__0__Impl rule__CallMessage__Group_0__1 ;
    public final void rule__CallMessage__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3376:1: ( rule__CallMessage__Group_0__0__Impl rule__CallMessage__Group_0__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3377:2: rule__CallMessage__Group_0__0__Impl rule__CallMessage__Group_0__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_0__0__Impl_in_rule__CallMessage__Group_0__06829);
            rule__CallMessage__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_0__1_in_rule__CallMessage__Group_0__06832);
            rule__CallMessage__Group_0__1();

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
    // $ANTLR end "rule__CallMessage__Group_0__0"


    // $ANTLR start "rule__CallMessage__Group_0__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3384:1: rule__CallMessage__Group_0__0__Impl : ( ( rule__CallMessage__ParticipantAssignment_0_0 ) ) ;
    public final void rule__CallMessage__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3388:1: ( ( ( rule__CallMessage__ParticipantAssignment_0_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3389:1: ( ( rule__CallMessage__ParticipantAssignment_0_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3389:1: ( ( rule__CallMessage__ParticipantAssignment_0_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3390:1: ( rule__CallMessage__ParticipantAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParticipantAssignment_0_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3391:1: ( rule__CallMessage__ParticipantAssignment_0_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3391:2: rule__CallMessage__ParticipantAssignment_0_0
            {
            pushFollow(FOLLOW_rule__CallMessage__ParticipantAssignment_0_0_in_rule__CallMessage__Group_0__0__Impl6859);
            rule__CallMessage__ParticipantAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParticipantAssignment_0_0()); 
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
    // $ANTLR end "rule__CallMessage__Group_0__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_0__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3401:1: rule__CallMessage__Group_0__1 : rule__CallMessage__Group_0__1__Impl ;
    public final void rule__CallMessage__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3405:1: ( rule__CallMessage__Group_0__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3406:2: rule__CallMessage__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_0__1__Impl_in_rule__CallMessage__Group_0__16889);
            rule__CallMessage__Group_0__1__Impl();

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
    // $ANTLR end "rule__CallMessage__Group_0__1"


    // $ANTLR start "rule__CallMessage__Group_0__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3412:1: rule__CallMessage__Group_0__1__Impl : ( '.' ) ;
    public final void rule__CallMessage__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3416:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3417:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3417:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3418:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getFullStopKeyword_0_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__CallMessage__Group_0__1__Impl6917); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getFullStopKeyword_0_1()); 
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
    // $ANTLR end "rule__CallMessage__Group_0__1__Impl"


    // $ANTLR start "rule__CallMessage__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3435:1: rule__CallMessage__Group_2__0 : rule__CallMessage__Group_2__0__Impl rule__CallMessage__Group_2__1 ;
    public final void rule__CallMessage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3439:1: ( rule__CallMessage__Group_2__0__Impl rule__CallMessage__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3440:2: rule__CallMessage__Group_2__0__Impl rule__CallMessage__Group_2__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2__0__Impl_in_rule__CallMessage__Group_2__06952);
            rule__CallMessage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_2__1_in_rule__CallMessage__Group_2__06955);
            rule__CallMessage__Group_2__1();

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
    // $ANTLR end "rule__CallMessage__Group_2__0"


    // $ANTLR start "rule__CallMessage__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3447:1: rule__CallMessage__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__CallMessage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3451:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3452:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3452:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3453:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3454:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3455:2: '('
            {
            match(input,22,FOLLOW_22_in_rule__CallMessage__Group_2__0__Impl6984); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__CallMessage__Group_2__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3466:1: rule__CallMessage__Group_2__1 : rule__CallMessage__Group_2__1__Impl rule__CallMessage__Group_2__2 ;
    public final void rule__CallMessage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3470:1: ( rule__CallMessage__Group_2__1__Impl rule__CallMessage__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3471:2: rule__CallMessage__Group_2__1__Impl rule__CallMessage__Group_2__2
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2__1__Impl_in_rule__CallMessage__Group_2__17016);
            rule__CallMessage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_2__2_in_rule__CallMessage__Group_2__17019);
            rule__CallMessage__Group_2__2();

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
    // $ANTLR end "rule__CallMessage__Group_2__1"


    // $ANTLR start "rule__CallMessage__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3478:1: rule__CallMessage__Group_2__1__Impl : ( ( rule__CallMessage__Group_2_1__0 )? ) ;
    public final void rule__CallMessage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3482:1: ( ( ( rule__CallMessage__Group_2_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3483:1: ( ( rule__CallMessage__Group_2_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3483:1: ( ( rule__CallMessage__Group_2_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3484:1: ( rule__CallMessage__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3485:1: ( rule__CallMessage__Group_2_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3485:2: rule__CallMessage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__CallMessage__Group_2_1__0_in_rule__CallMessage__Group_2__1__Impl7046);
                    rule__CallMessage__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__CallMessage__Group_2__1__Impl"


    // $ANTLR start "rule__CallMessage__Group_2__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3495:1: rule__CallMessage__Group_2__2 : rule__CallMessage__Group_2__2__Impl ;
    public final void rule__CallMessage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3499:1: ( rule__CallMessage__Group_2__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3500:2: rule__CallMessage__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2__2__Impl_in_rule__CallMessage__Group_2__27077);
            rule__CallMessage__Group_2__2__Impl();

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
    // $ANTLR end "rule__CallMessage__Group_2__2"


    // $ANTLR start "rule__CallMessage__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3506:1: rule__CallMessage__Group_2__2__Impl : ( ')' ) ;
    public final void rule__CallMessage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3510:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3511:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3511:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3512:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__CallMessage__Group_2__2__Impl7105); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__CallMessage__Group_2__2__Impl"


    // $ANTLR start "rule__CallMessage__Group_2_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3531:1: rule__CallMessage__Group_2_1__0 : rule__CallMessage__Group_2_1__0__Impl rule__CallMessage__Group_2_1__1 ;
    public final void rule__CallMessage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3535:1: ( rule__CallMessage__Group_2_1__0__Impl rule__CallMessage__Group_2_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3536:2: rule__CallMessage__Group_2_1__0__Impl rule__CallMessage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2_1__0__Impl_in_rule__CallMessage__Group_2_1__07142);
            rule__CallMessage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_2_1__1_in_rule__CallMessage__Group_2_1__07145);
            rule__CallMessage__Group_2_1__1();

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
    // $ANTLR end "rule__CallMessage__Group_2_1__0"


    // $ANTLR start "rule__CallMessage__Group_2_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3543:1: rule__CallMessage__Group_2_1__0__Impl : ( ( rule__CallMessage__ParameterAssignment_2_1_0 ) ) ;
    public final void rule__CallMessage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3547:1: ( ( ( rule__CallMessage__ParameterAssignment_2_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3548:1: ( ( rule__CallMessage__ParameterAssignment_2_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3548:1: ( ( rule__CallMessage__ParameterAssignment_2_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3549:1: ( rule__CallMessage__ParameterAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParameterAssignment_2_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3550:1: ( rule__CallMessage__ParameterAssignment_2_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3550:2: rule__CallMessage__ParameterAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__CallMessage__ParameterAssignment_2_1_0_in_rule__CallMessage__Group_2_1__0__Impl7172);
            rule__CallMessage__ParameterAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParameterAssignment_2_1_0()); 
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
    // $ANTLR end "rule__CallMessage__Group_2_1__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_2_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3560:1: rule__CallMessage__Group_2_1__1 : rule__CallMessage__Group_2_1__1__Impl ;
    public final void rule__CallMessage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3564:1: ( rule__CallMessage__Group_2_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3565:2: rule__CallMessage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2_1__1__Impl_in_rule__CallMessage__Group_2_1__17202);
            rule__CallMessage__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__CallMessage__Group_2_1__1"


    // $ANTLR start "rule__CallMessage__Group_2_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3571:1: rule__CallMessage__Group_2_1__1__Impl : ( ( rule__CallMessage__Group_2_1_1__0 )* ) ;
    public final void rule__CallMessage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3575:1: ( ( ( rule__CallMessage__Group_2_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3576:1: ( ( rule__CallMessage__Group_2_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3576:1: ( ( rule__CallMessage__Group_2_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3577:1: ( rule__CallMessage__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getGroup_2_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3578:1: ( rule__CallMessage__Group_2_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==24) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3578:2: rule__CallMessage__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CallMessage__Group_2_1_1__0_in_rule__CallMessage__Group_2_1__1__Impl7229);
            	    rule__CallMessage__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getGroup_2_1_1()); 
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
    // $ANTLR end "rule__CallMessage__Group_2_1__1__Impl"


    // $ANTLR start "rule__CallMessage__Group_2_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3592:1: rule__CallMessage__Group_2_1_1__0 : rule__CallMessage__Group_2_1_1__0__Impl rule__CallMessage__Group_2_1_1__1 ;
    public final void rule__CallMessage__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3596:1: ( rule__CallMessage__Group_2_1_1__0__Impl rule__CallMessage__Group_2_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3597:2: rule__CallMessage__Group_2_1_1__0__Impl rule__CallMessage__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2_1_1__0__Impl_in_rule__CallMessage__Group_2_1_1__07264);
            rule__CallMessage__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallMessage__Group_2_1_1__1_in_rule__CallMessage__Group_2_1_1__07267);
            rule__CallMessage__Group_2_1_1__1();

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
    // $ANTLR end "rule__CallMessage__Group_2_1_1__0"


    // $ANTLR start "rule__CallMessage__Group_2_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3604:1: rule__CallMessage__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__CallMessage__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3608:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3609:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3609:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3610:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__CallMessage__Group_2_1_1__0__Impl7295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getCommaKeyword_2_1_1_0()); 
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
    // $ANTLR end "rule__CallMessage__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__CallMessage__Group_2_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3623:1: rule__CallMessage__Group_2_1_1__1 : rule__CallMessage__Group_2_1_1__1__Impl ;
    public final void rule__CallMessage__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3627:1: ( rule__CallMessage__Group_2_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3628:2: rule__CallMessage__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallMessage__Group_2_1_1__1__Impl_in_rule__CallMessage__Group_2_1_1__17326);
            rule__CallMessage__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__CallMessage__Group_2_1_1__1"


    // $ANTLR start "rule__CallMessage__Group_2_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3634:1: rule__CallMessage__Group_2_1_1__1__Impl : ( ( rule__CallMessage__ParameterAssignment_2_1_1_1 ) ) ;
    public final void rule__CallMessage__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3638:1: ( ( ( rule__CallMessage__ParameterAssignment_2_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3639:1: ( ( rule__CallMessage__ParameterAssignment_2_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3639:1: ( ( rule__CallMessage__ParameterAssignment_2_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3640:1: ( rule__CallMessage__ParameterAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParameterAssignment_2_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3641:1: ( rule__CallMessage__ParameterAssignment_2_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3641:2: rule__CallMessage__ParameterAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__CallMessage__ParameterAssignment_2_1_1_1_in_rule__CallMessage__Group_2_1_1__1__Impl7353);
            rule__CallMessage__ParameterAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParameterAssignment_2_1_1_1()); 
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
    // $ANTLR end "rule__CallMessage__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__NewMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3655:1: rule__NewMessage__Group__0 : rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1 ;
    public final void rule__NewMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3659:1: ( rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3660:2: rule__NewMessage__Group__0__Impl rule__NewMessage__Group__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__0__Impl_in_rule__NewMessage__Group__07387);
            rule__NewMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group__1_in_rule__NewMessage__Group__07390);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3667:1: rule__NewMessage__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3671:1: ( ( 'new' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3672:1: ( 'new' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3672:1: ( 'new' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3673:1: 'new'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getNewKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__NewMessage__Group__0__Impl7418); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3686:1: rule__NewMessage__Group__1 : rule__NewMessage__Group__1__Impl rule__NewMessage__Group__2 ;
    public final void rule__NewMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3690:1: ( rule__NewMessage__Group__1__Impl rule__NewMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3691:2: rule__NewMessage__Group__1__Impl rule__NewMessage__Group__2
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__1__Impl_in_rule__NewMessage__Group__17449);
            rule__NewMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group__2_in_rule__NewMessage__Group__17452);
            rule__NewMessage__Group__2();

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3698:1: rule__NewMessage__Group__1__Impl : ( ( rule__NewMessage__ParticipantAssignment_1 ) ) ;
    public final void rule__NewMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3702:1: ( ( ( rule__NewMessage__ParticipantAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3703:1: ( ( rule__NewMessage__ParticipantAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3703:1: ( ( rule__NewMessage__ParticipantAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3704:1: ( rule__NewMessage__ParticipantAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParticipantAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3705:1: ( rule__NewMessage__ParticipantAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3705:2: rule__NewMessage__ParticipantAssignment_1
            {
            pushFollow(FOLLOW_rule__NewMessage__ParticipantAssignment_1_in_rule__NewMessage__Group__1__Impl7479);
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


    // $ANTLR start "rule__NewMessage__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3715:1: rule__NewMessage__Group__2 : rule__NewMessage__Group__2__Impl ;
    public final void rule__NewMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3719:1: ( rule__NewMessage__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3720:2: rule__NewMessage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group__2__Impl_in_rule__NewMessage__Group__27509);
            rule__NewMessage__Group__2__Impl();

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
    // $ANTLR end "rule__NewMessage__Group__2"


    // $ANTLR start "rule__NewMessage__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3726:1: rule__NewMessage__Group__2__Impl : ( ( rule__NewMessage__Group_2__0 )? ) ;
    public final void rule__NewMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3730:1: ( ( ( rule__NewMessage__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3731:1: ( ( rule__NewMessage__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3731:1: ( ( rule__NewMessage__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3732:1: ( rule__NewMessage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3733:1: ( rule__NewMessage__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3733:2: rule__NewMessage__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NewMessage__Group_2__0_in_rule__NewMessage__Group__2__Impl7536);
                    rule__NewMessage__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getGroup_2()); 
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
    // $ANTLR end "rule__NewMessage__Group__2__Impl"


    // $ANTLR start "rule__NewMessage__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3749:1: rule__NewMessage__Group_2__0 : rule__NewMessage__Group_2__0__Impl rule__NewMessage__Group_2__1 ;
    public final void rule__NewMessage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3753:1: ( rule__NewMessage__Group_2__0__Impl rule__NewMessage__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3754:2: rule__NewMessage__Group_2__0__Impl rule__NewMessage__Group_2__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_2__0__Impl_in_rule__NewMessage__Group_2__07573);
            rule__NewMessage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group_2__1_in_rule__NewMessage__Group_2__07576);
            rule__NewMessage__Group_2__1();

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
    // $ANTLR end "rule__NewMessage__Group_2__0"


    // $ANTLR start "rule__NewMessage__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3761:1: rule__NewMessage__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__NewMessage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3765:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3766:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3766:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3767:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3768:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3769:2: '('
            {
            match(input,22,FOLLOW_22_in_rule__NewMessage__Group_2__0__Impl7605); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__NewMessage__Group_2__0__Impl"


    // $ANTLR start "rule__NewMessage__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3780:1: rule__NewMessage__Group_2__1 : rule__NewMessage__Group_2__1__Impl rule__NewMessage__Group_2__2 ;
    public final void rule__NewMessage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3784:1: ( rule__NewMessage__Group_2__1__Impl rule__NewMessage__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3785:2: rule__NewMessage__Group_2__1__Impl rule__NewMessage__Group_2__2
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_2__1__Impl_in_rule__NewMessage__Group_2__17637);
            rule__NewMessage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group_2__2_in_rule__NewMessage__Group_2__17640);
            rule__NewMessage__Group_2__2();

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
    // $ANTLR end "rule__NewMessage__Group_2__1"


    // $ANTLR start "rule__NewMessage__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3792:1: rule__NewMessage__Group_2__1__Impl : ( ( rule__NewMessage__Group_2_1__0 )? ) ;
    public final void rule__NewMessage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3796:1: ( ( ( rule__NewMessage__Group_2_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3797:1: ( ( rule__NewMessage__Group_2_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3797:1: ( ( rule__NewMessage__Group_2_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3798:1: ( rule__NewMessage__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3799:1: ( rule__NewMessage__Group_2_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3799:2: rule__NewMessage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__NewMessage__Group_2_1__0_in_rule__NewMessage__Group_2__1__Impl7667);
                    rule__NewMessage__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__NewMessage__Group_2__1__Impl"


    // $ANTLR start "rule__NewMessage__Group_2__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3809:1: rule__NewMessage__Group_2__2 : rule__NewMessage__Group_2__2__Impl ;
    public final void rule__NewMessage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3813:1: ( rule__NewMessage__Group_2__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3814:2: rule__NewMessage__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_2__2__Impl_in_rule__NewMessage__Group_2__27698);
            rule__NewMessage__Group_2__2__Impl();

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
    // $ANTLR end "rule__NewMessage__Group_2__2"


    // $ANTLR start "rule__NewMessage__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3820:1: rule__NewMessage__Group_2__2__Impl : ( ')' ) ;
    public final void rule__NewMessage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3824:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3825:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3825:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3826:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__NewMessage__Group_2__2__Impl7726); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__NewMessage__Group_2__2__Impl"


    // $ANTLR start "rule__NewMessage__Group_2_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3845:1: rule__NewMessage__Group_2_1__0 : rule__NewMessage__Group_2_1__0__Impl rule__NewMessage__Group_2_1__1 ;
    public final void rule__NewMessage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3849:1: ( rule__NewMessage__Group_2_1__0__Impl rule__NewMessage__Group_2_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3850:2: rule__NewMessage__Group_2_1__0__Impl rule__NewMessage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_2_1__0__Impl_in_rule__NewMessage__Group_2_1__07763);
            rule__NewMessage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group_2_1__1_in_rule__NewMessage__Group_2_1__07766);
            rule__NewMessage__Group_2_1__1();

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
    // $ANTLR end "rule__NewMessage__Group_2_1__0"


    // $ANTLR start "rule__NewMessage__Group_2_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3857:1: rule__NewMessage__Group_2_1__0__Impl : ( ( rule__NewMessage__ParameterAssignment_2_1_0 ) ) ;
    public final void rule__NewMessage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3861:1: ( ( ( rule__NewMessage__ParameterAssignment_2_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3862:1: ( ( rule__NewMessage__ParameterAssignment_2_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3862:1: ( ( rule__NewMessage__ParameterAssignment_2_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3863:1: ( rule__NewMessage__ParameterAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParameterAssignment_2_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3864:1: ( rule__NewMessage__ParameterAssignment_2_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3864:2: rule__NewMessage__ParameterAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__NewMessage__ParameterAssignment_2_1_0_in_rule__NewMessage__Group_2_1__0__Impl7793);
            rule__NewMessage__ParameterAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParameterAssignment_2_1_0()); 
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
    // $ANTLR end "rule__NewMessage__Group_2_1__0__Impl"


    // $ANTLR start "rule__NewMessage__Group_2_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3874:1: rule__NewMessage__Group_2_1__1 : rule__NewMessage__Group_2_1__1__Impl ;
    public final void rule__NewMessage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3878:1: ( rule__NewMessage__Group_2_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3879:2: rule__NewMessage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_2_1__1__Impl_in_rule__NewMessage__Group_2_1__17823);
            rule__NewMessage__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__NewMessage__Group_2_1__1"


    // $ANTLR start "rule__NewMessage__Group_2_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3885:1: rule__NewMessage__Group_2_1__1__Impl : ( ( rule__NewMessage__Group_2_1_1__0 )* ) ;
    public final void rule__NewMessage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3889:1: ( ( ( rule__NewMessage__Group_2_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3890:1: ( ( rule__NewMessage__Group_2_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3890:1: ( ( rule__NewMessage__Group_2_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3891:1: ( rule__NewMessage__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getGroup_2_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3892:1: ( rule__NewMessage__Group_2_1_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==24) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3892:2: rule__NewMessage__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__NewMessage__Group_2_1_1__0_in_rule__NewMessage__Group_2_1__1__Impl7850);
            	    rule__NewMessage__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getGroup_2_1_1()); 
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
    // $ANTLR end "rule__NewMessage__Group_2_1__1__Impl"


    // $ANTLR start "rule__NewMessage__Group_2_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3906:1: rule__NewMessage__Group_2_1_1__0 : rule__NewMessage__Group_2_1_1__0__Impl rule__NewMessage__Group_2_1_1__1 ;
    public final void rule__NewMessage__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3910:1: ( rule__NewMessage__Group_2_1_1__0__Impl rule__NewMessage__Group_2_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3911:2: rule__NewMessage__Group_2_1_1__0__Impl rule__NewMessage__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_2_1_1__0__Impl_in_rule__NewMessage__Group_2_1_1__07885);
            rule__NewMessage__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NewMessage__Group_2_1_1__1_in_rule__NewMessage__Group_2_1_1__07888);
            rule__NewMessage__Group_2_1_1__1();

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
    // $ANTLR end "rule__NewMessage__Group_2_1_1__0"


    // $ANTLR start "rule__NewMessage__Group_2_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3918:1: rule__NewMessage__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__NewMessage__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3922:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3923:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3923:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3924:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__NewMessage__Group_2_1_1__0__Impl7916); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getCommaKeyword_2_1_1_0()); 
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
    // $ANTLR end "rule__NewMessage__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__NewMessage__Group_2_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3937:1: rule__NewMessage__Group_2_1_1__1 : rule__NewMessage__Group_2_1_1__1__Impl ;
    public final void rule__NewMessage__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3941:1: ( rule__NewMessage__Group_2_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3942:2: rule__NewMessage__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NewMessage__Group_2_1_1__1__Impl_in_rule__NewMessage__Group_2_1_1__17947);
            rule__NewMessage__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__NewMessage__Group_2_1_1__1"


    // $ANTLR start "rule__NewMessage__Group_2_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3948:1: rule__NewMessage__Group_2_1_1__1__Impl : ( ( rule__NewMessage__ParameterAssignment_2_1_1_1 ) ) ;
    public final void rule__NewMessage__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3952:1: ( ( ( rule__NewMessage__ParameterAssignment_2_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3953:1: ( ( rule__NewMessage__ParameterAssignment_2_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3953:1: ( ( rule__NewMessage__ParameterAssignment_2_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3954:1: ( rule__NewMessage__ParameterAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParameterAssignment_2_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3955:1: ( rule__NewMessage__ParameterAssignment_2_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3955:2: rule__NewMessage__ParameterAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__NewMessage__ParameterAssignment_2_1_1_1_in_rule__NewMessage__Group_2_1_1__1__Impl7974);
            rule__NewMessage__ParameterAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParameterAssignment_2_1_1_1()); 
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
    // $ANTLR end "rule__NewMessage__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__ReturnMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3969:1: rule__ReturnMessage__Group__0 : rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 ;
    public final void rule__ReturnMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3973:1: ( rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3974:2: rule__ReturnMessage__Group__0__Impl rule__ReturnMessage__Group__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__0__Impl_in_rule__ReturnMessage__Group__08008);
            rule__ReturnMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group__1_in_rule__ReturnMessage__Group__08011);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3981:1: rule__ReturnMessage__Group__0__Impl : ( 'return ' ) ;
    public final void rule__ReturnMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3985:1: ( ( 'return ' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3986:1: ( 'return ' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3986:1: ( 'return ' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:3987:1: 'return '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getReturnKeyword_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__ReturnMessage__Group__0__Impl8039); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4000:1: rule__ReturnMessage__Group__1 : rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 ;
    public final void rule__ReturnMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4004:1: ( rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4005:2: rule__ReturnMessage__Group__1__Impl rule__ReturnMessage__Group__2
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__1__Impl_in_rule__ReturnMessage__Group__18070);
            rule__ReturnMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group__2_in_rule__ReturnMessage__Group__18073);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4012:1: rule__ReturnMessage__Group__1__Impl : ( ( rule__ReturnMessage__NameAssignment_1 ) ) ;
    public final void rule__ReturnMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4016:1: ( ( ( rule__ReturnMessage__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4017:1: ( ( rule__ReturnMessage__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4017:1: ( ( rule__ReturnMessage__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4018:1: ( rule__ReturnMessage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4019:1: ( rule__ReturnMessage__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4019:2: rule__ReturnMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__NameAssignment_1_in_rule__ReturnMessage__Group__1__Impl8100);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4029:1: rule__ReturnMessage__Group__2 : rule__ReturnMessage__Group__2__Impl ;
    public final void rule__ReturnMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4033:1: ( rule__ReturnMessage__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4034:2: rule__ReturnMessage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group__2__Impl_in_rule__ReturnMessage__Group__28130);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4040:1: rule__ReturnMessage__Group__2__Impl : ( ( rule__ReturnMessage__Group_2__0 )? ) ;
    public final void rule__ReturnMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4044:1: ( ( ( rule__ReturnMessage__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4045:1: ( ( rule__ReturnMessage__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4045:1: ( ( rule__ReturnMessage__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4046:1: ( rule__ReturnMessage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4047:1: ( rule__ReturnMessage__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==22) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4047:2: rule__ReturnMessage__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ReturnMessage__Group_2__0_in_rule__ReturnMessage__Group__2__Impl8157);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4063:1: rule__ReturnMessage__Group_2__0 : rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1 ;
    public final void rule__ReturnMessage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4067:1: ( rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4068:2: rule__ReturnMessage__Group_2__0__Impl rule__ReturnMessage__Group_2__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__0__Impl_in_rule__ReturnMessage__Group_2__08194);
            rule__ReturnMessage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__1_in_rule__ReturnMessage__Group_2__08197);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4075:1: rule__ReturnMessage__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__ReturnMessage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4079:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4080:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4080:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4081:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4082:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4083:2: '('
            {
            match(input,22,FOLLOW_22_in_rule__ReturnMessage__Group_2__0__Impl8226); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4094:1: rule__ReturnMessage__Group_2__1 : rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2 ;
    public final void rule__ReturnMessage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4098:1: ( rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4099:2: rule__ReturnMessage__Group_2__1__Impl rule__ReturnMessage__Group_2__2
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__1__Impl_in_rule__ReturnMessage__Group_2__18258);
            rule__ReturnMessage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__2_in_rule__ReturnMessage__Group_2__18261);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4106:1: rule__ReturnMessage__Group_2__1__Impl : ( ( rule__ReturnMessage__Group_2_1__0 )? ) ;
    public final void rule__ReturnMessage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4110:1: ( ( ( rule__ReturnMessage__Group_2_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4111:1: ( ( rule__ReturnMessage__Group_2_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4111:1: ( ( rule__ReturnMessage__Group_2_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4112:1: ( rule__ReturnMessage__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4113:1: ( rule__ReturnMessage__Group_2_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4113:2: rule__ReturnMessage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__0_in_rule__ReturnMessage__Group_2__1__Impl8288);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4123:1: rule__ReturnMessage__Group_2__2 : rule__ReturnMessage__Group_2__2__Impl ;
    public final void rule__ReturnMessage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4127:1: ( rule__ReturnMessage__Group_2__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4128:2: rule__ReturnMessage__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2__2__Impl_in_rule__ReturnMessage__Group_2__28319);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4134:1: rule__ReturnMessage__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ReturnMessage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4138:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4139:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4139:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4140:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__ReturnMessage__Group_2__2__Impl8347); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4159:1: rule__ReturnMessage__Group_2_1__0 : rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1 ;
    public final void rule__ReturnMessage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4163:1: ( rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4164:2: rule__ReturnMessage__Group_2_1__0__Impl rule__ReturnMessage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__0__Impl_in_rule__ReturnMessage__Group_2_1__08384);
            rule__ReturnMessage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__1_in_rule__ReturnMessage__Group_2_1__08387);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4171:1: rule__ReturnMessage__Group_2_1__0__Impl : ( ( rule__ReturnMessage__ParameterAssignment_2_1_0 ) ) ;
    public final void rule__ReturnMessage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4175:1: ( ( ( rule__ReturnMessage__ParameterAssignment_2_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4176:1: ( ( rule__ReturnMessage__ParameterAssignment_2_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4176:1: ( ( rule__ReturnMessage__ParameterAssignment_2_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4177:1: ( rule__ReturnMessage__ParameterAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParameterAssignment_2_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4178:1: ( rule__ReturnMessage__ParameterAssignment_2_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4178:2: rule__ReturnMessage__ParameterAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__ReturnMessage__ParameterAssignment_2_1_0_in_rule__ReturnMessage__Group_2_1__0__Impl8414);
            rule__ReturnMessage__ParameterAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getParameterAssignment_2_1_0()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4188:1: rule__ReturnMessage__Group_2_1__1 : rule__ReturnMessage__Group_2_1__1__Impl ;
    public final void rule__ReturnMessage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4192:1: ( rule__ReturnMessage__Group_2_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4193:2: rule__ReturnMessage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1__1__Impl_in_rule__ReturnMessage__Group_2_1__18444);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4199:1: rule__ReturnMessage__Group_2_1__1__Impl : ( ( rule__ReturnMessage__Group_2_1_1__0 )* ) ;
    public final void rule__ReturnMessage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4203:1: ( ( ( rule__ReturnMessage__Group_2_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4204:1: ( ( rule__ReturnMessage__Group_2_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4204:1: ( ( rule__ReturnMessage__Group_2_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4205:1: ( rule__ReturnMessage__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getGroup_2_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4206:1: ( rule__ReturnMessage__Group_2_1_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==24) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4206:2: rule__ReturnMessage__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__0_in_rule__ReturnMessage__Group_2_1__1__Impl8471);
            	    rule__ReturnMessage__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4220:1: rule__ReturnMessage__Group_2_1_1__0 : rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1 ;
    public final void rule__ReturnMessage__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4224:1: ( rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4225:2: rule__ReturnMessage__Group_2_1_1__0__Impl rule__ReturnMessage__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__0__Impl_in_rule__ReturnMessage__Group_2_1_1__08506);
            rule__ReturnMessage__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__1_in_rule__ReturnMessage__Group_2_1_1__08509);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4232:1: rule__ReturnMessage__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__ReturnMessage__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4236:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4237:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4237:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4238:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__ReturnMessage__Group_2_1_1__0__Impl8537); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getCommaKeyword_2_1_1_0()); 
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4251:1: rule__ReturnMessage__Group_2_1_1__1 : rule__ReturnMessage__Group_2_1_1__1__Impl ;
    public final void rule__ReturnMessage__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4255:1: ( rule__ReturnMessage__Group_2_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4256:2: rule__ReturnMessage__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ReturnMessage__Group_2_1_1__1__Impl_in_rule__ReturnMessage__Group_2_1_1__18568);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4262:1: rule__ReturnMessage__Group_2_1_1__1__Impl : ( ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 ) ) ;
    public final void rule__ReturnMessage__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4266:1: ( ( ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4267:1: ( ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4267:1: ( ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4268:1: ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParameterAssignment_2_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4269:1: ( rule__ReturnMessage__ParameterAssignment_2_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4269:2: rule__ReturnMessage__ParameterAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__ReturnMessage__ParameterAssignment_2_1_1_1_in_rule__ReturnMessage__Group_2_1_1__1__Impl8595);
            rule__ReturnMessage__ParameterAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getParameterAssignment_2_1_1_1()); 
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


    // $ANTLR start "rule__DeleteMessage__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4283:1: rule__DeleteMessage__Group__0 : rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 ;
    public final void rule__DeleteMessage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4287:1: ( rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4288:2: rule__DeleteMessage__Group__0__Impl rule__DeleteMessage__Group__1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__0__Impl_in_rule__DeleteMessage__Group__08629);
            rule__DeleteMessage__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group__1_in_rule__DeleteMessage__Group__08632);
            rule__DeleteMessage__Group__1();

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
    // $ANTLR end "rule__DeleteMessage__Group__0"


    // $ANTLR start "rule__DeleteMessage__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4295:1: rule__DeleteMessage__Group__0__Impl : ( 'delete ' ) ;
    public final void rule__DeleteMessage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4299:1: ( ( 'delete ' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4300:1: ( 'delete ' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4300:1: ( 'delete ' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4301:1: 'delete '
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getDeleteKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__DeleteMessage__Group__0__Impl8660); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getDeleteKeyword_0()); 
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
    // $ANTLR end "rule__DeleteMessage__Group__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4314:1: rule__DeleteMessage__Group__1 : rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 ;
    public final void rule__DeleteMessage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4318:1: ( rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4319:2: rule__DeleteMessage__Group__1__Impl rule__DeleteMessage__Group__2
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__1__Impl_in_rule__DeleteMessage__Group__18691);
            rule__DeleteMessage__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group__2_in_rule__DeleteMessage__Group__18694);
            rule__DeleteMessage__Group__2();

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
    // $ANTLR end "rule__DeleteMessage__Group__1"


    // $ANTLR start "rule__DeleteMessage__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4326:1: rule__DeleteMessage__Group__1__Impl : ( ( rule__DeleteMessage__NameAssignment_1 ) ) ;
    public final void rule__DeleteMessage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4330:1: ( ( ( rule__DeleteMessage__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4331:1: ( ( rule__DeleteMessage__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4331:1: ( ( rule__DeleteMessage__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4332:1: ( rule__DeleteMessage__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4333:1: ( rule__DeleteMessage__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4333:2: rule__DeleteMessage__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__NameAssignment_1_in_rule__DeleteMessage__Group__1__Impl8721);
            rule__DeleteMessage__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__DeleteMessage__Group__1__Impl"


    // $ANTLR start "rule__DeleteMessage__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4343:1: rule__DeleteMessage__Group__2 : rule__DeleteMessage__Group__2__Impl ;
    public final void rule__DeleteMessage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4347:1: ( rule__DeleteMessage__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4348:2: rule__DeleteMessage__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group__2__Impl_in_rule__DeleteMessage__Group__28751);
            rule__DeleteMessage__Group__2__Impl();

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
    // $ANTLR end "rule__DeleteMessage__Group__2"


    // $ANTLR start "rule__DeleteMessage__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4354:1: rule__DeleteMessage__Group__2__Impl : ( ( rule__DeleteMessage__Group_2__0 )? ) ;
    public final void rule__DeleteMessage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4358:1: ( ( ( rule__DeleteMessage__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4359:1: ( ( rule__DeleteMessage__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4359:1: ( ( rule__DeleteMessage__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4360:1: ( rule__DeleteMessage__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4361:1: ( rule__DeleteMessage__Group_2__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==22) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4361:2: rule__DeleteMessage__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__DeleteMessage__Group_2__0_in_rule__DeleteMessage__Group__2__Impl8778);
                    rule__DeleteMessage__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getGroup_2()); 
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
    // $ANTLR end "rule__DeleteMessage__Group__2__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_2__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4377:1: rule__DeleteMessage__Group_2__0 : rule__DeleteMessage__Group_2__0__Impl rule__DeleteMessage__Group_2__1 ;
    public final void rule__DeleteMessage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4381:1: ( rule__DeleteMessage__Group_2__0__Impl rule__DeleteMessage__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4382:2: rule__DeleteMessage__Group_2__0__Impl rule__DeleteMessage__Group_2__1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2__0__Impl_in_rule__DeleteMessage__Group_2__08815);
            rule__DeleteMessage__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2__1_in_rule__DeleteMessage__Group_2__08818);
            rule__DeleteMessage__Group_2__1();

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
    // $ANTLR end "rule__DeleteMessage__Group_2__0"


    // $ANTLR start "rule__DeleteMessage__Group_2__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4389:1: rule__DeleteMessage__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__DeleteMessage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4393:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4394:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4394:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4395:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4396:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4397:2: '('
            {
            match(input,22,FOLLOW_22_in_rule__DeleteMessage__Group_2__0__Impl8847); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getLeftParenthesisKeyword_2_0()); 
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
    // $ANTLR end "rule__DeleteMessage__Group_2__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_2__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4408:1: rule__DeleteMessage__Group_2__1 : rule__DeleteMessage__Group_2__1__Impl rule__DeleteMessage__Group_2__2 ;
    public final void rule__DeleteMessage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4412:1: ( rule__DeleteMessage__Group_2__1__Impl rule__DeleteMessage__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4413:2: rule__DeleteMessage__Group_2__1__Impl rule__DeleteMessage__Group_2__2
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2__1__Impl_in_rule__DeleteMessage__Group_2__18879);
            rule__DeleteMessage__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2__2_in_rule__DeleteMessage__Group_2__18882);
            rule__DeleteMessage__Group_2__2();

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
    // $ANTLR end "rule__DeleteMessage__Group_2__1"


    // $ANTLR start "rule__DeleteMessage__Group_2__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4420:1: rule__DeleteMessage__Group_2__1__Impl : ( ( rule__DeleteMessage__Group_2_1__0 )? ) ;
    public final void rule__DeleteMessage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4424:1: ( ( ( rule__DeleteMessage__Group_2_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4425:1: ( ( rule__DeleteMessage__Group_2_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4425:1: ( ( rule__DeleteMessage__Group_2_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4426:1: ( rule__DeleteMessage__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getGroup_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4427:1: ( rule__DeleteMessage__Group_2_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4427:2: rule__DeleteMessage__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__DeleteMessage__Group_2_1__0_in_rule__DeleteMessage__Group_2__1__Impl8909);
                    rule__DeleteMessage__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getGroup_2_1()); 
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
    // $ANTLR end "rule__DeleteMessage__Group_2__1__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_2__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4437:1: rule__DeleteMessage__Group_2__2 : rule__DeleteMessage__Group_2__2__Impl ;
    public final void rule__DeleteMessage__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4441:1: ( rule__DeleteMessage__Group_2__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4442:2: rule__DeleteMessage__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2__2__Impl_in_rule__DeleteMessage__Group_2__28940);
            rule__DeleteMessage__Group_2__2__Impl();

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
    // $ANTLR end "rule__DeleteMessage__Group_2__2"


    // $ANTLR start "rule__DeleteMessage__Group_2__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4448:1: rule__DeleteMessage__Group_2__2__Impl : ( ')' ) ;
    public final void rule__DeleteMessage__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4452:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4453:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4453:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4454:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__DeleteMessage__Group_2__2__Impl8968); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getRightParenthesisKeyword_2_2()); 
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
    // $ANTLR end "rule__DeleteMessage__Group_2__2__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_2_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4473:1: rule__DeleteMessage__Group_2_1__0 : rule__DeleteMessage__Group_2_1__0__Impl rule__DeleteMessage__Group_2_1__1 ;
    public final void rule__DeleteMessage__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4477:1: ( rule__DeleteMessage__Group_2_1__0__Impl rule__DeleteMessage__Group_2_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4478:2: rule__DeleteMessage__Group_2_1__0__Impl rule__DeleteMessage__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2_1__0__Impl_in_rule__DeleteMessage__Group_2_1__09005);
            rule__DeleteMessage__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2_1__1_in_rule__DeleteMessage__Group_2_1__09008);
            rule__DeleteMessage__Group_2_1__1();

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
    // $ANTLR end "rule__DeleteMessage__Group_2_1__0"


    // $ANTLR start "rule__DeleteMessage__Group_2_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4485:1: rule__DeleteMessage__Group_2_1__0__Impl : ( ( rule__DeleteMessage__ParameterAssignment_2_1_0 ) ) ;
    public final void rule__DeleteMessage__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4489:1: ( ( ( rule__DeleteMessage__ParameterAssignment_2_1_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4490:1: ( ( rule__DeleteMessage__ParameterAssignment_2_1_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4490:1: ( ( rule__DeleteMessage__ParameterAssignment_2_1_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4491:1: ( rule__DeleteMessage__ParameterAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getParameterAssignment_2_1_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4492:1: ( rule__DeleteMessage__ParameterAssignment_2_1_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4492:2: rule__DeleteMessage__ParameterAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__DeleteMessage__ParameterAssignment_2_1_0_in_rule__DeleteMessage__Group_2_1__0__Impl9035);
            rule__DeleteMessage__ParameterAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getParameterAssignment_2_1_0()); 
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
    // $ANTLR end "rule__DeleteMessage__Group_2_1__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_2_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4502:1: rule__DeleteMessage__Group_2_1__1 : rule__DeleteMessage__Group_2_1__1__Impl ;
    public final void rule__DeleteMessage__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4506:1: ( rule__DeleteMessage__Group_2_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4507:2: rule__DeleteMessage__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2_1__1__Impl_in_rule__DeleteMessage__Group_2_1__19065);
            rule__DeleteMessage__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__DeleteMessage__Group_2_1__1"


    // $ANTLR start "rule__DeleteMessage__Group_2_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4513:1: rule__DeleteMessage__Group_2_1__1__Impl : ( ( rule__DeleteMessage__Group_2_1_1__0 )* ) ;
    public final void rule__DeleteMessage__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4517:1: ( ( ( rule__DeleteMessage__Group_2_1_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4518:1: ( ( rule__DeleteMessage__Group_2_1_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4518:1: ( ( rule__DeleteMessage__Group_2_1_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4519:1: ( rule__DeleteMessage__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getGroup_2_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4520:1: ( rule__DeleteMessage__Group_2_1_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==24) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4520:2: rule__DeleteMessage__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__DeleteMessage__Group_2_1_1__0_in_rule__DeleteMessage__Group_2_1__1__Impl9092);
            	    rule__DeleteMessage__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getGroup_2_1_1()); 
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
    // $ANTLR end "rule__DeleteMessage__Group_2_1__1__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_2_1_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4534:1: rule__DeleteMessage__Group_2_1_1__0 : rule__DeleteMessage__Group_2_1_1__0__Impl rule__DeleteMessage__Group_2_1_1__1 ;
    public final void rule__DeleteMessage__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4538:1: ( rule__DeleteMessage__Group_2_1_1__0__Impl rule__DeleteMessage__Group_2_1_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4539:2: rule__DeleteMessage__Group_2_1_1__0__Impl rule__DeleteMessage__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2_1_1__0__Impl_in_rule__DeleteMessage__Group_2_1_1__09127);
            rule__DeleteMessage__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2_1_1__1_in_rule__DeleteMessage__Group_2_1_1__09130);
            rule__DeleteMessage__Group_2_1_1__1();

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
    // $ANTLR end "rule__DeleteMessage__Group_2_1_1__0"


    // $ANTLR start "rule__DeleteMessage__Group_2_1_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4546:1: rule__DeleteMessage__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__DeleteMessage__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4550:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4551:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4551:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4552:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__DeleteMessage__Group_2_1_1__0__Impl9158); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getCommaKeyword_2_1_1_0()); 
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
    // $ANTLR end "rule__DeleteMessage__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__DeleteMessage__Group_2_1_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4565:1: rule__DeleteMessage__Group_2_1_1__1 : rule__DeleteMessage__Group_2_1_1__1__Impl ;
    public final void rule__DeleteMessage__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4569:1: ( rule__DeleteMessage__Group_2_1_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4570:2: rule__DeleteMessage__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DeleteMessage__Group_2_1_1__1__Impl_in_rule__DeleteMessage__Group_2_1_1__19189);
            rule__DeleteMessage__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__DeleteMessage__Group_2_1_1__1"


    // $ANTLR start "rule__DeleteMessage__Group_2_1_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4576:1: rule__DeleteMessage__Group_2_1_1__1__Impl : ( ( rule__DeleteMessage__ParameterAssignment_2_1_1_1 ) ) ;
    public final void rule__DeleteMessage__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4580:1: ( ( ( rule__DeleteMessage__ParameterAssignment_2_1_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4581:1: ( ( rule__DeleteMessage__ParameterAssignment_2_1_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4581:1: ( ( rule__DeleteMessage__ParameterAssignment_2_1_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4582:1: ( rule__DeleteMessage__ParameterAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getParameterAssignment_2_1_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4583:1: ( rule__DeleteMessage__ParameterAssignment_2_1_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4583:2: rule__DeleteMessage__ParameterAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_rule__DeleteMessage__ParameterAssignment_2_1_1_1_in_rule__DeleteMessage__Group_2_1_1__1__Impl9216);
            rule__DeleteMessage__ParameterAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getParameterAssignment_2_1_1_1()); 
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
    // $ANTLR end "rule__DeleteMessage__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4597:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4601:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4602:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__09250);
            rule__Parameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__09253);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4609:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4613:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4614:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4614:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4615:1: ( rule__Parameter__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4616:1: ( rule__Parameter__NameAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4616:2: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl9280);
            rule__Parameter__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4626:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4630:1: ( rule__Parameter__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4631:2: rule__Parameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__19310);
            rule__Parameter__Group__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4637:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__Group_1__0 )? ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4641:1: ( ( ( rule__Parameter__Group_1__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4642:1: ( ( rule__Parameter__Group_1__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4642:1: ( ( rule__Parameter__Group_1__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4643:1: ( rule__Parameter__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4644:1: ( rule__Parameter__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==39) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4644:2: rule__Parameter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Parameter__Group_1__0_in_rule__Parameter__Group__1__Impl9337);
                    rule__Parameter__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group_1__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4658:1: rule__Parameter__Group_1__0 : rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 ;
    public final void rule__Parameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4662:1: ( rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4663:2: rule__Parameter__Group_1__0__Impl rule__Parameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1__0__Impl_in_rule__Parameter__Group_1__09372);
            rule__Parameter__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Parameter__Group_1__1_in_rule__Parameter__Group_1__09375);
            rule__Parameter__Group_1__1();

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
    // $ANTLR end "rule__Parameter__Group_1__0"


    // $ANTLR start "rule__Parameter__Group_1__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4670:1: rule__Parameter__Group_1__0__Impl : ( ':' ) ;
    public final void rule__Parameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4674:1: ( ( ':' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4675:1: ( ':' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4675:1: ( ':' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4676:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getColonKeyword_1_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Parameter__Group_1__0__Impl9403); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getColonKeyword_1_0()); 
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
    // $ANTLR end "rule__Parameter__Group_1__0__Impl"


    // $ANTLR start "rule__Parameter__Group_1__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4689:1: rule__Parameter__Group_1__1 : rule__Parameter__Group_1__1__Impl ;
    public final void rule__Parameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4693:1: ( rule__Parameter__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4694:2: rule__Parameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameter__Group_1__1__Impl_in_rule__Parameter__Group_1__19434);
            rule__Parameter__Group_1__1__Impl();

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
    // $ANTLR end "rule__Parameter__Group_1__1"


    // $ANTLR start "rule__Parameter__Group_1__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4700:1: rule__Parameter__Group_1__1__Impl : ( ( rule__Parameter__TypeAssignment_1_1 ) ) ;
    public final void rule__Parameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4704:1: ( ( ( rule__Parameter__TypeAssignment_1_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4705:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4705:1: ( ( rule__Parameter__TypeAssignment_1_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4706:1: ( rule__Parameter__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeAssignment_1_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4707:1: ( rule__Parameter__TypeAssignment_1_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4707:2: rule__Parameter__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameter__TypeAssignment_1_1_in_rule__Parameter__Group_1__1__Impl9461);
            rule__Parameter__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeAssignment_1_1()); 
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
    // $ANTLR end "rule__Parameter__Group_1__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4721:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4725:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4726:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__09495);
            rule__Reference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__09498);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4733:1: rule__Reference__Group__0__Impl : ( ( rule__Reference__TypeAssignment_0 ) ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4737:1: ( ( ( rule__Reference__TypeAssignment_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4738:1: ( ( rule__Reference__TypeAssignment_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4738:1: ( ( rule__Reference__TypeAssignment_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4739:1: ( rule__Reference__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeAssignment_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4740:1: ( rule__Reference__TypeAssignment_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4740:2: rule__Reference__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl9525);
            rule__Reference__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getTypeAssignment_0()); 
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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4750:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4754:1: ( rule__Reference__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4755:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__19555);
            rule__Reference__Group__1__Impl();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4761:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ArrayAssignment_1 )* ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4765:1: ( ( ( rule__Reference__ArrayAssignment_1 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4766:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4766:1: ( ( rule__Reference__ArrayAssignment_1 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4767:1: ( rule__Reference__ArrayAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4768:1: ( rule__Reference__ArrayAssignment_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==40) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4768:2: rule__Reference__ArrayAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl9582);
            	    rule__Reference__ArrayAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getArrayAssignment_1()); 
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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4782:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4786:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4787:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__09617);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__09620);
            rule__Array__Group__1();

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
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4794:1: rule__Array__Group__0__Impl : ( () ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4798:1: ( ( () ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4799:1: ( () )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4799:1: ( () )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4800:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getArrayAction_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4801:1: ()
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4803:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getArrayAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4813:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4817:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4818:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19678);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19681);
            rule__Array__Group__2();

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
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4825:1: rule__Array__Group__1__Impl : ( '[' ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4829:1: ( ( '[' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4830:1: ( '[' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4830:1: ( '[' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4831:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Array__Group__1__Impl9709); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1()); 
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
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4844:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4848:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4849:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29740);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__29743);
            rule__Array__Group__3();

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
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4856:1: rule__Array__Group__2__Impl : ( ( rule__Array__SizeAssignment_2 )? ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4860:1: ( ( ( rule__Array__SizeAssignment_2 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4861:1: ( ( rule__Array__SizeAssignment_2 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4861:1: ( ( rule__Array__SizeAssignment_2 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4862:1: ( rule__Array__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeAssignment_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4863:1: ( rule__Array__SizeAssignment_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_NATURAL) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4863:2: rule__Array__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl9770);
                    rule__Array__SizeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getSizeAssignment_2()); 
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
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4873:1: rule__Array__Group__3 : rule__Array__Group__3__Impl ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4877:1: ( rule__Array__Group__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4878:2: rule__Array__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__39801);
            rule__Array__Group__3__Impl();

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
    // $ANTLR end "rule__Array__Group__3"


    // $ANTLR start "rule__Array__Group__3__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4884:1: rule__Array__Group__3__Impl : ( ']' ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4888:1: ( ( ']' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4889:1: ( ']' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4889:1: ( ']' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4890:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,41,FOLLOW_41_in_rule__Array__Group__3__Impl9829); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getRightSquareBracketKeyword_3()); 
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
    // $ANTLR end "rule__Array__Group__3__Impl"


    // $ANTLR start "rule__ForeachExpression__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4911:1: rule__ForeachExpression__Group__0 : rule__ForeachExpression__Group__0__Impl rule__ForeachExpression__Group__1 ;
    public final void rule__ForeachExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4915:1: ( rule__ForeachExpression__Group__0__Impl rule__ForeachExpression__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4916:2: rule__ForeachExpression__Group__0__Impl rule__ForeachExpression__Group__1
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group__0__Impl_in_rule__ForeachExpression__Group__09868);
            rule__ForeachExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachExpression__Group__1_in_rule__ForeachExpression__Group__09871);
            rule__ForeachExpression__Group__1();

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
    // $ANTLR end "rule__ForeachExpression__Group__0"


    // $ANTLR start "rule__ForeachExpression__Group__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4923:1: rule__ForeachExpression__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ForeachExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4927:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4928:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4928:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4929:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ForeachExpression__Group__0__Impl9898); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionAccess().getIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ForeachExpression__Group__0__Impl"


    // $ANTLR start "rule__ForeachExpression__Group__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4940:1: rule__ForeachExpression__Group__1 : rule__ForeachExpression__Group__1__Impl rule__ForeachExpression__Group__2 ;
    public final void rule__ForeachExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4944:1: ( rule__ForeachExpression__Group__1__Impl rule__ForeachExpression__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4945:2: rule__ForeachExpression__Group__1__Impl rule__ForeachExpression__Group__2
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group__1__Impl_in_rule__ForeachExpression__Group__19927);
            rule__ForeachExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachExpression__Group__2_in_rule__ForeachExpression__Group__19930);
            rule__ForeachExpression__Group__2();

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
    // $ANTLR end "rule__ForeachExpression__Group__1"


    // $ANTLR start "rule__ForeachExpression__Group__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4952:1: rule__ForeachExpression__Group__1__Impl : ( 'in' ) ;
    public final void rule__ForeachExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4956:1: ( ( 'in' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4957:1: ( 'in' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4957:1: ( 'in' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4958:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getInKeyword_1()); 
            }
            match(input,42,FOLLOW_42_in_rule__ForeachExpression__Group__1__Impl9958); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionAccess().getInKeyword_1()); 
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
    // $ANTLR end "rule__ForeachExpression__Group__1__Impl"


    // $ANTLR start "rule__ForeachExpression__Group__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4971:1: rule__ForeachExpression__Group__2 : rule__ForeachExpression__Group__2__Impl ;
    public final void rule__ForeachExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4975:1: ( rule__ForeachExpression__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4976:2: rule__ForeachExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group__2__Impl_in_rule__ForeachExpression__Group__29989);
            rule__ForeachExpression__Group__2__Impl();

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
    // $ANTLR end "rule__ForeachExpression__Group__2"


    // $ANTLR start "rule__ForeachExpression__Group__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4982:1: rule__ForeachExpression__Group__2__Impl : ( ( rule__ForeachExpression__Alternatives_2 ) ) ;
    public final void rule__ForeachExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4986:1: ( ( ( rule__ForeachExpression__Alternatives_2 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4987:1: ( ( rule__ForeachExpression__Alternatives_2 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4987:1: ( ( rule__ForeachExpression__Alternatives_2 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4988:1: ( rule__ForeachExpression__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getAlternatives_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4989:1: ( rule__ForeachExpression__Alternatives_2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:4989:2: rule__ForeachExpression__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Alternatives_2_in_rule__ForeachExpression__Group__2__Impl10016);
            rule__ForeachExpression__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__ForeachExpression__Group__2__Impl"


    // $ANTLR start "rule__ForeachExpression__Group_2_0__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5005:1: rule__ForeachExpression__Group_2_0__0 : rule__ForeachExpression__Group_2_0__0__Impl rule__ForeachExpression__Group_2_0__1 ;
    public final void rule__ForeachExpression__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5009:1: ( rule__ForeachExpression__Group_2_0__0__Impl rule__ForeachExpression__Group_2_0__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5010:2: rule__ForeachExpression__Group_2_0__0__Impl rule__ForeachExpression__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__0__Impl_in_rule__ForeachExpression__Group_2_0__010052);
            rule__ForeachExpression__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__1_in_rule__ForeachExpression__Group_2_0__010055);
            rule__ForeachExpression__Group_2_0__1();

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
    // $ANTLR end "rule__ForeachExpression__Group_2_0__0"


    // $ANTLR start "rule__ForeachExpression__Group_2_0__0__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5017:1: rule__ForeachExpression__Group_2_0__0__Impl : ( RULE_NATURAL ) ;
    public final void rule__ForeachExpression__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5021:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5022:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5022:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5023:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__ForeachExpression__Group_2_0__0__Impl10082); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__ForeachExpression__Group_2_0__0__Impl"


    // $ANTLR start "rule__ForeachExpression__Group_2_0__1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5034:1: rule__ForeachExpression__Group_2_0__1 : rule__ForeachExpression__Group_2_0__1__Impl rule__ForeachExpression__Group_2_0__2 ;
    public final void rule__ForeachExpression__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5038:1: ( rule__ForeachExpression__Group_2_0__1__Impl rule__ForeachExpression__Group_2_0__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5039:2: rule__ForeachExpression__Group_2_0__1__Impl rule__ForeachExpression__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__1__Impl_in_rule__ForeachExpression__Group_2_0__110111);
            rule__ForeachExpression__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__2_in_rule__ForeachExpression__Group_2_0__110114);
            rule__ForeachExpression__Group_2_0__2();

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
    // $ANTLR end "rule__ForeachExpression__Group_2_0__1"


    // $ANTLR start "rule__ForeachExpression__Group_2_0__1__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5046:1: rule__ForeachExpression__Group_2_0__1__Impl : ( '..' ) ;
    public final void rule__ForeachExpression__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5050:1: ( ( '..' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5051:1: ( '..' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5051:1: ( '..' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5052:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getFullStopFullStopKeyword_2_0_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__ForeachExpression__Group_2_0__1__Impl10142); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionAccess().getFullStopFullStopKeyword_2_0_1()); 
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
    // $ANTLR end "rule__ForeachExpression__Group_2_0__1__Impl"


    // $ANTLR start "rule__ForeachExpression__Group_2_0__2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5065:1: rule__ForeachExpression__Group_2_0__2 : rule__ForeachExpression__Group_2_0__2__Impl ;
    public final void rule__ForeachExpression__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5069:1: ( rule__ForeachExpression__Group_2_0__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5070:2: rule__ForeachExpression__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ForeachExpression__Group_2_0__2__Impl_in_rule__ForeachExpression__Group_2_0__210173);
            rule__ForeachExpression__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__ForeachExpression__Group_2_0__2"


    // $ANTLR start "rule__ForeachExpression__Group_2_0__2__Impl"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5076:1: rule__ForeachExpression__Group_2_0__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__ForeachExpression__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5080:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5081:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5081:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5082:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__ForeachExpression__Group_2_0__2__Impl10200); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachExpressionAccess().getNATURALTerminalRuleCall_2_0_2()); 
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
    // $ANTLR end "rule__ForeachExpression__Group_2_0__2__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5099:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5103:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5104:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__010235);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__010238);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5111:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5115:1: ( ( '@' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5116:1: ( '@' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5116:1: ( '@' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5117:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Annotation__Group__0__Impl10266); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5130:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5134:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5135:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__110297);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__110300);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5142:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5146:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5147:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5147:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5148:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5149:1: ( rule__Annotation__NameAssignment_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5149:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl10327);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5159:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5163:1: ( rule__Annotation__Group__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5164:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__210357);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5170:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__Group_2__0 )? ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5174:1: ( ( ( rule__Annotation__Group_2__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5175:1: ( ( rule__Annotation__Group_2__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5175:1: ( ( rule__Annotation__Group_2__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5176:1: ( rule__Annotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5177:1: ( rule__Annotation__Group_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==22) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5177:2: rule__Annotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl10384);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5193:1: rule__Annotation__Group_2__0 : rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 ;
    public final void rule__Annotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5197:1: ( rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5198:2: rule__Annotation__Group_2__0__Impl rule__Annotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__010421);
            rule__Annotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__010424);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5205:1: rule__Annotation__Group_2__0__Impl : ( ( '(' ) ) ;
    public final void rule__Annotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5209:1: ( ( ( '(' ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5210:1: ( ( '(' ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5210:1: ( ( '(' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5211:1: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5212:1: ( '(' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5213:2: '('
            {
            match(input,22,FOLLOW_22_in_rule__Annotation__Group_2__0__Impl10453); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5224:1: rule__Annotation__Group_2__1 : rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 ;
    public final void rule__Annotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5228:1: ( rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5229:2: rule__Annotation__Group_2__1__Impl rule__Annotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__110485);
            rule__Annotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__110488);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5236:1: rule__Annotation__Group_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_1 ) ) ;
    public final void rule__Annotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5240:1: ( ( ( rule__Annotation__ParameterAssignment_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5241:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5241:1: ( ( rule__Annotation__ParameterAssignment_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5242:1: ( rule__Annotation__ParameterAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5243:1: ( rule__Annotation__ParameterAssignment_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5243:2: rule__Annotation__ParameterAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl10515);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5253:1: rule__Annotation__Group_2__2 : rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 ;
    public final void rule__Annotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5257:1: ( rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5258:2: rule__Annotation__Group_2__2__Impl rule__Annotation__Group_2__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__210545);
            rule__Annotation__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__210548);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5265:1: rule__Annotation__Group_2__2__Impl : ( ( rule__Annotation__Group_2_2__0 )* ) ;
    public final void rule__Annotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5269:1: ( ( ( rule__Annotation__Group_2_2__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5270:1: ( ( rule__Annotation__Group_2_2__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5270:1: ( ( rule__Annotation__Group_2_2__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5271:1: ( rule__Annotation__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_2_2()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5272:1: ( rule__Annotation__Group_2_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==24) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5272:2: rule__Annotation__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl10575);
            	    rule__Annotation__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5282:1: rule__Annotation__Group_2__3 : rule__Annotation__Group_2__3__Impl ;
    public final void rule__Annotation__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5286:1: ( rule__Annotation__Group_2__3__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5287:2: rule__Annotation__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__310606);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5293:1: rule__Annotation__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Annotation__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5297:1: ( ( ')' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5298:1: ( ')' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5298:1: ( ')' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5299:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,23,FOLLOW_23_in_rule__Annotation__Group_2__3__Impl10634); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5320:1: rule__Annotation__Group_2_2__0 : rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 ;
    public final void rule__Annotation__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5324:1: ( rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5325:2: rule__Annotation__Group_2_2__0__Impl rule__Annotation__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__010673);
            rule__Annotation__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__010676);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5332:1: rule__Annotation__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5336:1: ( ( ',' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5337:1: ( ',' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5337:1: ( ',' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5338:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Annotation__Group_2_2__0__Impl10704); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5351:1: rule__Annotation__Group_2_2__1 : rule__Annotation__Group_2_2__1__Impl ;
    public final void rule__Annotation__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5355:1: ( rule__Annotation__Group_2_2__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5356:2: rule__Annotation__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__110735);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5362:1: rule__Annotation__Group_2_2__1__Impl : ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) ;
    public final void rule__Annotation__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5366:1: ( ( ( rule__Annotation__ParameterAssignment_2_2_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5367:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5367:1: ( ( rule__Annotation__ParameterAssignment_2_2_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5368:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterAssignment_2_2_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5369:1: ( rule__Annotation__ParameterAssignment_2_2_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5369:2: rule__Annotation__ParameterAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl10762);
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


    // $ANTLR start "rule__ExtendedID__Group__0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5384:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5388:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5389:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010797);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010800);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5396:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5400:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5401:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5401:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5402:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10827); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5413:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5417:1: ( rule__ExtendedID__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5418:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110856);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5424:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5428:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5429:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5429:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5430:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5431:1: ( rule__ExtendedID__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==35) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5431:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10883);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5445:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5449:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5450:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010918);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010921);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5457:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5461:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5462:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5462:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5463:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__ExtendedID__Group_1__0__Impl10949); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5476:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5480:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5481:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110980);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5487:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5491:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5492:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5492:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5493:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11007); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5508:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5512:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5513:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__011040);
            rule__Real__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__011043);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5520:1: rule__Real__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5524:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5525:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5525:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5526:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5527:1: ( '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==17) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5528:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Real__Group__0__Impl11072); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5539:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5543:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5544:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__111105);
            rule__Real__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__111108);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5551:1: rule__Real__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5555:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5556:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5556:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5557:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl11135); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5568:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5572:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5573:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__211164);
            rule__Real__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__3_in_rule__Real__Group__211167);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5580:1: rule__Real__Group__2__Impl : ( '.' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5584:1: ( ( '.' ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5585:1: ( '.' )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5585:1: ( '.' )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5586:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Real__Group__2__Impl11195); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5599:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5603:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5604:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__311226);
            rule__Real__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__4_in_rule__Real__Group__311229);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5611:1: rule__Real__Group__3__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5615:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5616:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5616:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5617:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_3()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl11256); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5628:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5632:1: ( rule__Real__Group__4__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5633:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__411285);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5639:1: rule__Real__Group__4__Impl : ( ( rule__Real__Group_4__0 )? ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5643:1: ( ( ( rule__Real__Group_4__0 )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5644:1: ( ( rule__Real__Group_4__0 )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5644:1: ( ( rule__Real__Group_4__0 )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5645:1: ( rule__Real__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup_4()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5646:1: ( rule__Real__Group_4__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=14 && LA53_0<=15)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5646:2: rule__Real__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl11312);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5666:1: rule__Real__Group_4__0 : rule__Real__Group_4__0__Impl rule__Real__Group_4__1 ;
    public final void rule__Real__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5670:1: ( rule__Real__Group_4__0__Impl rule__Real__Group_4__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5671:2: rule__Real__Group_4__0__Impl rule__Real__Group_4__1
            {
            pushFollow(FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__011353);
            rule__Real__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__011356);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5678:1: rule__Real__Group_4__0__Impl : ( ( rule__Real__Alternatives_4_0 ) ) ;
    public final void rule__Real__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5682:1: ( ( ( rule__Real__Alternatives_4_0 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5683:1: ( ( rule__Real__Alternatives_4_0 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5683:1: ( ( rule__Real__Alternatives_4_0 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5684:1: ( rule__Real__Alternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5685:1: ( rule__Real__Alternatives_4_0 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5685:2: rule__Real__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl11383);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5695:1: rule__Real__Group_4__1 : rule__Real__Group_4__1__Impl rule__Real__Group_4__2 ;
    public final void rule__Real__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5699:1: ( rule__Real__Group_4__1__Impl rule__Real__Group_4__2 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5700:2: rule__Real__Group_4__1__Impl rule__Real__Group_4__2
            {
            pushFollow(FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__111413);
            rule__Real__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__111416);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5707:1: rule__Real__Group_4__1__Impl : ( ( rule__Real__Alternatives_4_1 ) ) ;
    public final void rule__Real__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5711:1: ( ( ( rule__Real__Alternatives_4_1 ) ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5712:1: ( ( rule__Real__Alternatives_4_1 ) )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5712:1: ( ( rule__Real__Alternatives_4_1 ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5713:1: ( rule__Real__Alternatives_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getAlternatives_4_1()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5714:1: ( rule__Real__Alternatives_4_1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5714:2: rule__Real__Alternatives_4_1
            {
            pushFollow(FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl11443);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5724:1: rule__Real__Group_4__2 : rule__Real__Group_4__2__Impl ;
    public final void rule__Real__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5728:1: ( rule__Real__Group_4__2__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5729:2: rule__Real__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__211473);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5735:1: rule__Real__Group_4__2__Impl : ( RULE_NATURAL ) ;
    public final void rule__Real__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5739:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5740:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5740:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5741:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRealAccess().getNATURALTerminalRuleCall_4_2()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl11500); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5758:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5762:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5763:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__011535);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__011538);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5770:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5774:1: ( ( ( '-' )? ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5775:1: ( ( '-' )? )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5775:1: ( ( '-' )? )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5776:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            }
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5777:1: ( '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==17) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5778:2: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__Integer__Group__0__Impl11567); if (state.failed) return ;

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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5789:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5793:1: ( rule__Integer__Group__1__Impl )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5794:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__111600);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5800:1: rule__Integer__Group__1__Impl : ( RULE_NATURAL ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5804:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5805:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5805:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5806:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNATURALTerminalRuleCall_1()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl11627); if (state.failed) return ;
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


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5822:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5826:1: ( ( ruleImport ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5827:1: ( ruleImport )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5827:1: ( ruleImport )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5828:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_011665);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__SequenceAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5837:1: rule__Model__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Model__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5841:1: ( ( ruleSequence ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5842:1: ( ruleSequence )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5842:1: ( ruleSequence )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5843:1: ruleSequence
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSequenceSequenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSequence_in_rule__Model__SequenceAssignment_111696);
            ruleSequence();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSequenceSequenceParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Model__SequenceAssignment_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5852:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5856:1: ( ( RULE_STRING ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5857:1: ( RULE_STRING )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5857:1: ( RULE_STRING )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5858:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111727); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5867:1: rule__Sequence__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Sequence__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5871:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5872:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5872:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5873:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Sequence__AnnotationAssignment_011758);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5882:1: rule__Sequence__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5886:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5887:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5887:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5888:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_211789); if (state.failed) return ;
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5897:1: rule__Sequence__ParticipantAssignment_3 : ( ruleParticipant ) ;
    public final void rule__Sequence__ParticipantAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5901:1: ( ( ruleParticipant ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5902:1: ( ruleParticipant )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5902:1: ( ruleParticipant )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5903:1: ruleParticipant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSequenceAccess().getParticipantParticipantParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleParticipant_in_rule__Sequence__ParticipantAssignment_311820);
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


    // $ANTLR start "rule__Participant__AnnotationAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5912:1: rule__Participant__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Participant__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5916:1: ( ( ruleAnnotation ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5917:1: ( ruleAnnotation )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5917:1: ( ruleAnnotation )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5918:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Participant__AnnotationAssignment_011851);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Participant__AnnotationAssignment_0"


    // $ANTLR start "rule__Participant__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5927:1: rule__Participant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Participant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5931:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5932:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5932:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5933:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Participant__NameAssignment_111882); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Participant__NameAssignment_1"


    // $ANTLR start "rule__Participant__TransitionAssignment_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5942:1: rule__Participant__TransitionAssignment_2 : ( ruleTransition ) ;
    public final void rule__Participant__TransitionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5946:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5947:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5947:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5948:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getTransitionTransitionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__Participant__TransitionAssignment_211913);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getTransitionTransitionParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__Participant__TransitionAssignment_2"


    // $ANTLR start "rule__Participant__BlockAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5957:1: rule__Participant__BlockAssignment_3 : ( ruleTransitionBlock ) ;
    public final void rule__Participant__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5961:1: ( ( ruleTransitionBlock ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5962:1: ( ruleTransitionBlock )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5962:1: ( ruleTransitionBlock )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5963:1: ruleTransitionBlock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParticipantAccess().getBlockTransitionBlockParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransitionBlock_in_rule__Participant__BlockAssignment_311944);
            ruleTransitionBlock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParticipantAccess().getBlockTransitionBlockParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Participant__BlockAssignment_3"


    // $ANTLR start "rule__TransitionBlock__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5972:1: rule__TransitionBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TransitionBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5976:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5977:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5977:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5978:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TransitionBlock__NameAssignment_111975); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__TransitionBlock__NameAssignment_1"


    // $ANTLR start "rule__TransitionBlock__ParameterAssignment_2_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5987:1: rule__TransitionBlock__ParameterAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__TransitionBlock__ParameterAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5991:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5992:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5992:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:5993:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__TransitionBlock__ParameterAssignment_2_1_012006);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__TransitionBlock__ParameterAssignment_2_1_0"


    // $ANTLR start "rule__TransitionBlock__ParameterAssignment_2_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6002:1: rule__TransitionBlock__ParameterAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__TransitionBlock__ParameterAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6006:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6007:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6007:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6008:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__TransitionBlock__ParameterAssignment_2_1_1_112037);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
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
    // $ANTLR end "rule__TransitionBlock__ParameterAssignment_2_1_1_1"


    // $ANTLR start "rule__TransitionBlock__TransitionAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6017:1: rule__TransitionBlock__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__TransitionBlock__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6021:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6022:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6022:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6023:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTransitionBlockAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__TransitionBlock__TransitionAssignment_312068);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTransitionBlockAccess().getTransitionTransitionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__TransitionBlock__TransitionAssignment_3"


    // $ANTLR start "rule__IfElseFragment__ExprAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6032:1: rule__IfElseFragment__ExprAssignment_1 : ( ruleValueWithSpaces ) ;
    public final void rule__IfElseFragment__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6036:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6037:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6037:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6038:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__IfElseFragment__ExprAssignment_112099);
            ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__IfElseFragment__ExprAssignment_1"


    // $ANTLR start "rule__IfElseFragment__TransitionAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6047:1: rule__IfElseFragment__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__IfElseFragment__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6051:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6052:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6052:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6053:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__IfElseFragment__TransitionAssignment_312130);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__IfElseFragment__TransitionAssignment_3"


    // $ANTLR start "rule__IfElseFragment__ElseIfExprAssignment_4_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6062:1: rule__IfElseFragment__ElseIfExprAssignment_4_1 : ( ruleValueWithSpaces ) ;
    public final void rule__IfElseFragment__ElseIfExprAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6066:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6067:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6067:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6068:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseIfExprValueWithSpacesParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__IfElseFragment__ElseIfExprAssignment_4_112161);
            ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getElseIfExprValueWithSpacesParserRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__IfElseFragment__ElseIfExprAssignment_4_1"


    // $ANTLR start "rule__IfElseFragment__ElseIftransitionAssignment_4_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6077:1: rule__IfElseFragment__ElseIftransitionAssignment_4_3 : ( ruleTransition ) ;
    public final void rule__IfElseFragment__ElseIftransitionAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6081:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6082:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6082:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6083:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseIftransitionTransitionParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__IfElseFragment__ElseIftransitionAssignment_4_312192);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getElseIftransitionTransitionParserRuleCall_4_3_0()); 
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
    // $ANTLR end "rule__IfElseFragment__ElseIftransitionAssignment_4_3"


    // $ANTLR start "rule__IfElseFragment__ElseTransitionAssignment_5_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6092:1: rule__IfElseFragment__ElseTransitionAssignment_5_1 : ( ruleTransition ) ;
    public final void rule__IfElseFragment__ElseTransitionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6096:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6097:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6097:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6098:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfElseFragmentAccess().getElseTransitionTransitionParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__IfElseFragment__ElseTransitionAssignment_5_112223);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfElseFragmentAccess().getElseTransitionTransitionParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__IfElseFragment__ElseTransitionAssignment_5_1"


    // $ANTLR start "rule__ForeachFragment__ExprAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6107:1: rule__ForeachFragment__ExprAssignment_1 : ( ruleForeachExpression ) ;
    public final void rule__ForeachFragment__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6111:1: ( ( ruleForeachExpression ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6112:1: ( ruleForeachExpression )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6112:1: ( ruleForeachExpression )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6113:1: ruleForeachExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getExprForeachExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleForeachExpression_in_rule__ForeachFragment__ExprAssignment_112254);
            ruleForeachExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentAccess().getExprForeachExpressionParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__ForeachFragment__ExprAssignment_1"


    // $ANTLR start "rule__ForeachFragment__TransitionAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6122:1: rule__ForeachFragment__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__ForeachFragment__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6126:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6127:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6127:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6128:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeachFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__ForeachFragment__TransitionAssignment_312285);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeachFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__ForeachFragment__TransitionAssignment_3"


    // $ANTLR start "rule__LoopFragment__ExprAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6137:1: rule__LoopFragment__ExprAssignment_1 : ( ruleValueWithSpaces ) ;
    public final void rule__LoopFragment__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6141:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6142:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6142:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6143:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__LoopFragment__ExprAssignment_112316);
            ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__LoopFragment__ExprAssignment_1"


    // $ANTLR start "rule__LoopFragment__TransitionAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6152:1: rule__LoopFragment__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__LoopFragment__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6156:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6157:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6157:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6158:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLoopFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__LoopFragment__TransitionAssignment_312347);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLoopFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__LoopFragment__TransitionAssignment_3"


    // $ANTLR start "rule__AssertFragment__ExprAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6167:1: rule__AssertFragment__ExprAssignment_1 : ( ruleValueWithSpaces ) ;
    public final void rule__AssertFragment__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6171:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6172:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6172:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6173:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__AssertFragment__ExprAssignment_112378);
            ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentAccess().getExprValueWithSpacesParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__AssertFragment__ExprAssignment_1"


    // $ANTLR start "rule__AssertFragment__TransitionAssignment_3"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6182:1: rule__AssertFragment__TransitionAssignment_3 : ( ruleTransition ) ;
    public final void rule__AssertFragment__TransitionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6186:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6187:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6187:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6188:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAssertFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__AssertFragment__TransitionAssignment_312409);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAssertFragmentAccess().getTransitionTransitionParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__AssertFragment__TransitionAssignment_3"


    // $ANTLR start "rule__BreakFragment__ExprAssignment_2_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6197:1: rule__BreakFragment__ExprAssignment_2_0 : ( ruleValueWithSpaces ) ;
    public final void rule__BreakFragment__ExprAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6201:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6202:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6202:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6203:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__BreakFragment__ExprAssignment_2_012440);
            ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__BreakFragment__ExprAssignment_2_0"


    // $ANTLR start "rule__BreakFragment__TransitionAssignment_2_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6212:1: rule__BreakFragment__TransitionAssignment_2_2 : ( ruleTransition ) ;
    public final void rule__BreakFragment__TransitionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6216:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6217:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6217:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6218:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBreakFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__BreakFragment__TransitionAssignment_2_212471);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBreakFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__BreakFragment__TransitionAssignment_2_2"


    // $ANTLR start "rule__NextFragment__ExprAssignment_2_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6227:1: rule__NextFragment__ExprAssignment_2_0 : ( ruleValueWithSpaces ) ;
    public final void rule__NextFragment__ExprAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6231:1: ( ( ruleValueWithSpaces ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6232:1: ( ruleValueWithSpaces )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6232:1: ( ruleValueWithSpaces )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6233:1: ruleValueWithSpaces
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleValueWithSpaces_in_rule__NextFragment__ExprAssignment_2_012502);
            ruleValueWithSpaces();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getExprValueWithSpacesParserRuleCall_2_0_0()); 
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
    // $ANTLR end "rule__NextFragment__ExprAssignment_2_0"


    // $ANTLR start "rule__NextFragment__TransitionAssignment_2_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6242:1: rule__NextFragment__TransitionAssignment_2_2 : ( ruleTransition ) ;
    public final void rule__NextFragment__TransitionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6246:1: ( ( ruleTransition ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6247:1: ( ruleTransition )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6247:1: ( ruleTransition )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6248:1: ruleTransition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNextFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_rule__NextFragment__TransitionAssignment_2_212533);
            ruleTransition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNextFragmentAccess().getTransitionTransitionParserRuleCall_2_2_0()); 
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
    // $ANTLR end "rule__NextFragment__TransitionAssignment_2_2"


    // $ANTLR start "rule__CallMessage__ParticipantAssignment_0_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6257:1: rule__CallMessage__ParticipantAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__CallMessage__ParticipantAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6261:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6262:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6262:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6263:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParticipantIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__ParticipantAssignment_0_012564); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParticipantIDTerminalRuleCall_0_0_0()); 
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
    // $ANTLR end "rule__CallMessage__ParticipantAssignment_0_0"


    // $ANTLR start "rule__CallMessage__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6272:1: rule__CallMessage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CallMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6276:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6277:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6277:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6278:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CallMessage__NameAssignment_112595); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__CallMessage__NameAssignment_1"


    // $ANTLR start "rule__CallMessage__ParameterAssignment_2_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6287:1: rule__CallMessage__ParameterAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__CallMessage__ParameterAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6291:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6292:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6292:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6293:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__CallMessage__ParameterAssignment_2_1_012626);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__CallMessage__ParameterAssignment_2_1_0"


    // $ANTLR start "rule__CallMessage__ParameterAssignment_2_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6302:1: rule__CallMessage__ParameterAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__CallMessage__ParameterAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6306:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6307:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6307:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6308:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__CallMessage__ParameterAssignment_2_1_1_112657);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
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
    // $ANTLR end "rule__CallMessage__ParameterAssignment_2_1_1_1"


    // $ANTLR start "rule__NewMessage__ParticipantAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6317:1: rule__NewMessage__ParticipantAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewMessage__ParticipantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6321:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6322:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6322:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6323:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParticipantIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NewMessage__ParticipantAssignment_112688); if (state.failed) return ;
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


    // $ANTLR start "rule__NewMessage__ParameterAssignment_2_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6332:1: rule__NewMessage__ParameterAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__NewMessage__ParameterAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6336:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6337:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6337:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6338:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__NewMessage__ParameterAssignment_2_1_012719);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__NewMessage__ParameterAssignment_2_1_0"


    // $ANTLR start "rule__NewMessage__ParameterAssignment_2_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6347:1: rule__NewMessage__ParameterAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__NewMessage__ParameterAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6351:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6352:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6352:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6353:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__NewMessage__ParameterAssignment_2_1_1_112750);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNewMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
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
    // $ANTLR end "rule__NewMessage__ParameterAssignment_2_1_1_1"


    // $ANTLR start "rule__ReturnMessage__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6362:1: rule__ReturnMessage__NameAssignment_1 : ( ruleReference ) ;
    public final void rule__ReturnMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6366:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6367:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6367:1: ( ruleReference )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6368:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getNameReferenceParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__ReturnMessage__NameAssignment_112781);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getNameReferenceParserRuleCall_1_0()); 
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


    // $ANTLR start "rule__ReturnMessage__ParameterAssignment_2_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6377:1: rule__ReturnMessage__ParameterAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__ReturnMessage__ParameterAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6381:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6382:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6382:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6383:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReturnMessage__ParameterAssignment_2_1_012812);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__ReturnMessage__ParameterAssignment_2_1_0"


    // $ANTLR start "rule__ReturnMessage__ParameterAssignment_2_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6392:1: rule__ReturnMessage__ParameterAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__ReturnMessage__ParameterAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6396:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6397:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6397:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6398:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReturnMessage__ParameterAssignment_2_1_1_112843);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReturnMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
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
    // $ANTLR end "rule__ReturnMessage__ParameterAssignment_2_1_1_1"


    // $ANTLR start "rule__DeleteMessage__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6407:1: rule__DeleteMessage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DeleteMessage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6411:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6412:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6412:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6413:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeleteMessage__NameAssignment_112874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__DeleteMessage__NameAssignment_1"


    // $ANTLR start "rule__DeleteMessage__ParameterAssignment_2_1_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6422:1: rule__DeleteMessage__ParameterAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__DeleteMessage__ParameterAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6426:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6427:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6427:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6428:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__DeleteMessage__ParameterAssignment_2_1_012905);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_2_1_0_0()); 
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
    // $ANTLR end "rule__DeleteMessage__ParameterAssignment_2_1_0"


    // $ANTLR start "rule__DeleteMessage__ParameterAssignment_2_1_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6437:1: rule__DeleteMessage__ParameterAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__DeleteMessage__ParameterAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6441:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6442:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6442:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6443:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__DeleteMessage__ParameterAssignment_2_1_1_112936);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDeleteMessageAccess().getParameterParameterParserRuleCall_2_1_1_1_0()); 
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
    // $ANTLR end "rule__DeleteMessage__ParameterAssignment_2_1_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6452:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6456:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6457:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6457:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6458:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012967); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_1_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6467:1: rule__Parameter__TypeAssignment_1_1 : ( ruleReference ) ;
    public final void rule__Parameter__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6471:1: ( ( ruleReference ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6472:1: ( ruleReference )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6472:1: ( ruleReference )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6473:1: ruleReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_1_112998);
            ruleReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getTypeReferenceParserRuleCall_1_1_0()); 
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
    // $ANTLR end "rule__Parameter__TypeAssignment_1_1"


    // $ANTLR start "rule__Reference__TypeAssignment_0"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6482:1: rule__Reference__TypeAssignment_0 : ( RULE_ID ) ;
    public final void rule__Reference__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6486:1: ( ( RULE_ID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6487:1: ( RULE_ID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6487:1: ( RULE_ID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6488:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getTypeIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__TypeAssignment_013029); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getTypeIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Reference__TypeAssignment_0"


    // $ANTLR start "rule__Reference__ArrayAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6497:1: rule__Reference__ArrayAssignment_1 : ( ruleArray ) ;
    public final void rule__Reference__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6501:1: ( ( ruleArray ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6502:1: ( ruleArray )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6502:1: ( ruleArray )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6503:1: ruleArray
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_113060);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getArrayArrayParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Reference__ArrayAssignment_1"


    // $ANTLR start "rule__Array__SizeAssignment_2"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6512:1: rule__Array__SizeAssignment_2 : ( RULE_NATURAL ) ;
    public final void rule__Array__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6516:1: ( ( RULE_NATURAL ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6517:1: ( RULE_NATURAL )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6517:1: ( RULE_NATURAL )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6518:1: RULE_NATURAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getSizeNATURALTerminalRuleCall_2_0()); 
            }
            match(input,RULE_NATURAL,FOLLOW_RULE_NATURAL_in_rule__Array__SizeAssignment_213091); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getSizeNATURALTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Array__SizeAssignment_2"


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6527:1: rule__Annotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6531:1: ( ( ruleExtendedID ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6532:1: ( ruleExtendedID )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6532:1: ( ruleExtendedID )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6533:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_113122);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6542:1: rule__Annotation__ParameterAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6546:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6547:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6547:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6548:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_113153);
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
    // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6557:1: rule__Annotation__ParameterAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Annotation__ParameterAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6561:1: ( ( ruleParameter ) )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6562:1: ( ruleParameter )
            {
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6562:1: ( ruleParameter )
            // ../cz.cvut.earlgrey.sequencemodel.ui/src-gen/cz/cvut/earlgrey/sequencemodel/ui/contentassist/antlr/internal/InternalSequencemodel.g:6563:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getParameterParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_113184);
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

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA29_eotS =
        "\6\uffff";
    static final String DFA29_eofS =
        "\1\3\1\uffff\1\3\2\uffff\1\3";
    static final String DFA29_minS =
        "\1\4\1\uffff\1\4\1\uffff\2\4";
    static final String DFA29_maxS =
        "\1\46\1\uffff\1\46\1\uffff\1\4\1\46";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\2\uffff";
    static final String DFA29_specialS =
        "\6\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\7\1\5\uffff\1\1\2\uffff\2\3\3\uffff\1\3\1\1\3\3\1\uffff"+
            "\4\3\1\uffff\3\3",
            "",
            "\1\2\7\1\5\uffff\1\1\2\uffff\3\3\2\uffff\1\3\1\1\3\3\1\uffff"+
            "\4\3\1\4\3\3",
            "",
            "\1\5",
            "\1\2\7\1\5\uffff\1\1\2\uffff\3\3\2\uffff\1\3\1\1\3\3\1\uffff"+
            "\4\3\1\1\3\3"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "2914:1: ( rule__BreakFragment__Group_2__0 )?";
        }
    }
    static final String DFA31_eotS =
        "\6\uffff";
    static final String DFA31_eofS =
        "\1\3\1\uffff\1\3\2\uffff\1\3";
    static final String DFA31_minS =
        "\1\4\1\uffff\1\4\1\uffff\2\4";
    static final String DFA31_maxS =
        "\1\46\1\uffff\1\46\1\uffff\1\4\1\46";
    static final String DFA31_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\2\uffff";
    static final String DFA31_specialS =
        "\6\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\7\1\5\uffff\1\1\2\uffff\2\3\3\uffff\1\3\1\1\3\3\1\uffff"+
            "\4\3\1\uffff\3\3",
            "",
            "\1\2\7\1\5\uffff\1\1\2\uffff\3\3\2\uffff\1\3\1\1\3\3\1\uffff"+
            "\4\3\1\4\3\3",
            "",
            "\1\5",
            "\1\2\7\1\5\uffff\1\1\2\uffff\3\3\2\uffff\1\3\1\1\3\3\1\uffff"+
            "\4\3\1\1\3\3"
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
            return "3137:1: ( rule__NextFragment__Group_2__0 )?";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleFragment_in_entryRuleFragment427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFragment434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fragment__Alternatives_in_ruleFragment460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_entryRuleIfElseFragment487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfElseFragment494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__0_in_ruleIfElseFragment520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_entryRuleForeachFragment547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachFragment554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__0_in_ruleForeachFragment580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_entryRuleLoopFragment607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoopFragment614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__0_in_ruleLoopFragment640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_entryRuleAssertFragment667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssertFragment674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__0_in_ruleAssertFragment700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_entryRuleBreakFragment727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakFragment734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__0_in_ruleBreakFragment760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_entryRuleNextFragment787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextFragment794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__0_in_ruleNextFragment820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMessage854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Message__Alternatives_in_ruleMessage880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_entryRuleCallMessage907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallMessage914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__0_in_ruleCallMessage940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_entryRuleNewMessage967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNewMessage974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__0_in_ruleNewMessage1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_entryRuleReturnMessage1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnMessage1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__0_in_ruleReturnMessage1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_entryRuleDeleteMessage1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeleteMessage1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__0_in_ruleDeleteMessage1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0_in_ruleParameter1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_entryRuleReference1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReference1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0_in_ruleReference1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_entryRuleForeachExpression1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForeachExpression1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__0_in_ruleForeachExpression1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_entryRuleValueWithSpaces1401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueWithSpaces1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ValueWithSpaces__Alternatives_in_ruleValueWithSpaces1438 = new BitSet(new long[]{0x0000000000020FF2L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID1590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMessage_in_rule__Transition__Alternatives1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFragment_in_rule__Transition__Alternatives1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfElseFragment_in_rule__Fragment__Alternatives1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachFragment_in_rule__Fragment__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssertFragment_in_rule__Fragment__Alternatives1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoopFragment_in_rule__Fragment__Alternatives1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakFragment_in_rule__Fragment__Alternatives1898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextFragment_in_rule__Fragment__Alternatives1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallMessage_in_rule__Message__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNewMessage_in_rule__Message__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnMessage_in_rule__Message__Alternatives1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeleteMessage_in_rule__Message__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__0_in_rule__ForeachExpression__Alternatives_22030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForeachExpression__Alternatives_22048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OPERATOR_in_rule__ValueWithSpaces__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ValueWithSpaces__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__ValueWithSpaces__Alternatives2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WS_in_rule__ValueWithSpaces__Alternatives2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Value__Alternatives2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Value__Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Value__Alternatives2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__Value__Alternatives2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_rule__Value__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Value__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Real__Alternatives_4_02282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Real__Alternatives_4_02302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Real__Alternatives_4_12337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Alternatives_4_12357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02389 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2419 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SequenceAssignment_1_in_rule__Model__Group__1__Impl2477 = new BitSet(new long[]{0x0000100000080002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02512 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Import__Group__0__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__02635 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__02638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__AnnotationAssignment_0_in_rule__Sequence__Group__0__Impl2665 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__12696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__12699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Sequence__Group__1__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__22760 = new BitSet(new long[]{0x0000100000100010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__22763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_2_in_rule__Sequence__Group__2__Impl2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32820 = new BitSet(new long[]{0x0000100000100010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__ParticipantAssignment_3_in_rule__Sequence__Group__3__Impl2850 = new BitSet(new long[]{0x0000100000000012L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Sequence__Group__4__Impl2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__0__Impl_in_rule__Participant__Group__02950 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rule__Participant__Group__1_in_rule__Participant__Group__02953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__AnnotationAssignment_0_in_rule__Participant__Group__0__Impl2980 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__1__Impl_in_rule__Participant__Group__13011 = new BitSet(new long[]{0x00000077A2300010L});
    public static final BitSet FOLLOW_rule__Participant__Group__2_in_rule__Participant__Group__13014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__NameAssignment_1_in_rule__Participant__Group__1__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__Group__2__Impl_in_rule__Participant__Group__23071 = new BitSet(new long[]{0x00000077A2300010L});
    public static final BitSet FOLLOW_rule__Participant__Group__3_in_rule__Participant__Group__23074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__TransitionAssignment_2_in_rule__Participant__Group__2__Impl3101 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__Participant__Group__3__Impl_in_rule__Participant__Group__33132 = new BitSet(new long[]{0x00000077A2300010L});
    public static final BitSet FOLLOW_rule__Participant__Group__4_in_rule__Participant__Group__33135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Participant__BlockAssignment_3_in_rule__Participant__Group__3__Impl3162 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Participant__Group__4__Impl_in_rule__Participant__Group__43193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Participant__Group__4__Impl3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__0__Impl_in_rule__TransitionBlock__Group__03262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__1_in_rule__TransitionBlock__Group__03265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__TransitionBlock__Group__0__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__1__Impl_in_rule__TransitionBlock__Group__13324 = new BitSet(new long[]{0x00000077A2500010L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__2_in_rule__TransitionBlock__Group__13327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__NameAssignment_1_in_rule__TransitionBlock__Group__1__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__2__Impl_in_rule__TransitionBlock__Group__23384 = new BitSet(new long[]{0x00000077A2500010L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__3_in_rule__TransitionBlock__Group__23387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2__0_in_rule__TransitionBlock__Group__2__Impl3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__3__Impl_in_rule__TransitionBlock__Group__33445 = new BitSet(new long[]{0x00000077A2500010L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__4_in_rule__TransitionBlock__Group__33448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__TransitionAssignment_3_in_rule__TransitionBlock__Group__3__Impl3475 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group__4__Impl_in_rule__TransitionBlock__Group__43506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TransitionBlock__Group__4__Impl3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2__0__Impl_in_rule__TransitionBlock__Group_2__03575 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2__1_in_rule__TransitionBlock__Group_2__03578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__TransitionBlock__Group_2__0__Impl3607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2__1__Impl_in_rule__TransitionBlock__Group_2__13639 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2__2_in_rule__TransitionBlock__Group_2__13642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2_1__0_in_rule__TransitionBlock__Group_2__1__Impl3669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2__2__Impl_in_rule__TransitionBlock__Group_2__23700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TransitionBlock__Group_2__2__Impl3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2_1__0__Impl_in_rule__TransitionBlock__Group_2_1__03765 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2_1__1_in_rule__TransitionBlock__Group_2_1__03768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__ParameterAssignment_2_1_0_in_rule__TransitionBlock__Group_2_1__0__Impl3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2_1__1__Impl_in_rule__TransitionBlock__Group_2_1__13825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2_1_1__0_in_rule__TransitionBlock__Group_2_1__1__Impl3852 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2_1_1__0__Impl_in_rule__TransitionBlock__Group_2_1_1__03887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2_1_1__1_in_rule__TransitionBlock__Group_2_1_1__03890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__TransitionBlock__Group_2_1_1__0__Impl3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__Group_2_1_1__1__Impl_in_rule__TransitionBlock__Group_2_1_1__13949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TransitionBlock__ParameterAssignment_2_1_1_1_in_rule__TransitionBlock__Group_2_1_1__1__Impl3976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__0__Impl_in_rule__IfElseFragment__Group__04010 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__1_in_rule__IfElseFragment__Group__04013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__IfElseFragment__Group__0__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__1__Impl_in_rule__IfElseFragment__Group__14072 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__2_in_rule__IfElseFragment__Group__14075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__ExprAssignment_1_in_rule__IfElseFragment__Group__1__Impl4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__2__Impl_in_rule__IfElseFragment__Group__24132 = new BitSet(new long[]{0x00000077BA100010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__3_in_rule__IfElseFragment__Group__24135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IfElseFragment__Group__2__Impl4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__3__Impl_in_rule__IfElseFragment__Group__34194 = new BitSet(new long[]{0x00000077BA100010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__4_in_rule__IfElseFragment__Group__34197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__TransitionAssignment_3_in_rule__IfElseFragment__Group__3__Impl4224 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__4__Impl_in_rule__IfElseFragment__Group__44255 = new BitSet(new long[]{0x00000077BA100010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__5_in_rule__IfElseFragment__Group__44258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__0_in_rule__IfElseFragment__Group__4__Impl4285 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__5__Impl_in_rule__IfElseFragment__Group__54316 = new BitSet(new long[]{0x00000077BA100010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__6_in_rule__IfElseFragment__Group__54319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_5__0_in_rule__IfElseFragment__Group__5__Impl4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group__6__Impl_in_rule__IfElseFragment__Group__64377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IfElseFragment__Group__6__Impl4405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__0__Impl_in_rule__IfElseFragment__Group_4__04450 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__1_in_rule__IfElseFragment__Group_4__04453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__IfElseFragment__Group_4__0__Impl4482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__1__Impl_in_rule__IfElseFragment__Group_4__14514 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__2_in_rule__IfElseFragment__Group_4__14517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__ElseIfExprAssignment_4_1_in_rule__IfElseFragment__Group_4__1__Impl4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__2__Impl_in_rule__IfElseFragment__Group_4__24574 = new BitSet(new long[]{0x00000077A2000010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__3_in_rule__IfElseFragment__Group_4__24577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__IfElseFragment__Group_4__2__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_4__3__Impl_in_rule__IfElseFragment__Group_4__34636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__ElseIftransitionAssignment_4_3_in_rule__IfElseFragment__Group_4__3__Impl4663 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_5__0__Impl_in_rule__IfElseFragment__Group_5__04702 = new BitSet(new long[]{0x00000077A2000010L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_5__1_in_rule__IfElseFragment__Group_5__04705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IfElseFragment__Group_5__0__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__Group_5__1__Impl_in_rule__IfElseFragment__Group_5__14766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfElseFragment__ElseTransitionAssignment_5_1_in_rule__IfElseFragment__Group_5__1__Impl4793 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__0__Impl_in_rule__ForeachFragment__Group__04828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__1_in_rule__ForeachFragment__Group__04831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ForeachFragment__Group__0__Impl4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__1__Impl_in_rule__ForeachFragment__Group__14890 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__2_in_rule__ForeachFragment__Group__14893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__ExprAssignment_1_in_rule__ForeachFragment__Group__1__Impl4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__2__Impl_in_rule__ForeachFragment__Group__24950 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__3_in_rule__ForeachFragment__Group__24953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ForeachFragment__Group__2__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__3__Impl_in_rule__ForeachFragment__Group__35012 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__4_in_rule__ForeachFragment__Group__35015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachFragment__TransitionAssignment_3_in_rule__ForeachFragment__Group__3__Impl5042 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__ForeachFragment__Group__4__Impl_in_rule__ForeachFragment__Group__45073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ForeachFragment__Group__4__Impl5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__0__Impl_in_rule__LoopFragment__Group__05142 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__1_in_rule__LoopFragment__Group__05145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__LoopFragment__Group__0__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__1__Impl_in_rule__LoopFragment__Group__15204 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__2_in_rule__LoopFragment__Group__15207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__ExprAssignment_1_in_rule__LoopFragment__Group__1__Impl5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__2__Impl_in_rule__LoopFragment__Group__25264 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__3_in_rule__LoopFragment__Group__25267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__LoopFragment__Group__2__Impl5295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__3__Impl_in_rule__LoopFragment__Group__35326 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__4_in_rule__LoopFragment__Group__35329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LoopFragment__TransitionAssignment_3_in_rule__LoopFragment__Group__3__Impl5356 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__LoopFragment__Group__4__Impl_in_rule__LoopFragment__Group__45387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LoopFragment__Group__4__Impl5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__0__Impl_in_rule__AssertFragment__Group__05456 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__1_in_rule__AssertFragment__Group__05459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AssertFragment__Group__0__Impl5487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__1__Impl_in_rule__AssertFragment__Group__15518 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__2_in_rule__AssertFragment__Group__15521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__ExprAssignment_1_in_rule__AssertFragment__Group__1__Impl5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__2__Impl_in_rule__AssertFragment__Group__25578 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__3_in_rule__AssertFragment__Group__25581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AssertFragment__Group__2__Impl5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__3__Impl_in_rule__AssertFragment__Group__35640 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__4_in_rule__AssertFragment__Group__35643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssertFragment__TransitionAssignment_3_in_rule__AssertFragment__Group__3__Impl5670 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__AssertFragment__Group__4__Impl_in_rule__AssertFragment__Group__45701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AssertFragment__Group__4__Impl5729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__0__Impl_in_rule__BreakFragment__Group__05770 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__1_in_rule__BreakFragment__Group__05773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__1__Impl_in_rule__BreakFragment__Group__15831 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__2_in_rule__BreakFragment__Group__15834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__BreakFragment__Group__1__Impl5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group__2__Impl_in_rule__BreakFragment__Group__25893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__0_in_rule__BreakFragment__Group__2__Impl5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__0__Impl_in_rule__BreakFragment__Group_2__05957 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__1_in_rule__BreakFragment__Group_2__05960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__ExprAssignment_2_0_in_rule__BreakFragment__Group_2__0__Impl5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__1__Impl_in_rule__BreakFragment__Group_2__16017 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__2_in_rule__BreakFragment__Group_2__16020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__BreakFragment__Group_2__1__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__2__Impl_in_rule__BreakFragment__Group_2__26079 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__3_in_rule__BreakFragment__Group_2__26082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakFragment__TransitionAssignment_2_2_in_rule__BreakFragment__Group_2__2__Impl6109 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__BreakFragment__Group_2__3__Impl_in_rule__BreakFragment__Group_2__36140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BreakFragment__Group_2__3__Impl6168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__0__Impl_in_rule__NextFragment__Group__06207 = new BitSet(new long[]{0x00000077A2000010L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__1_in_rule__NextFragment__Group__06210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__1__Impl_in_rule__NextFragment__Group__16268 = new BitSet(new long[]{0x0000000000020FF0L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__2_in_rule__NextFragment__Group__16271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NextFragment__Group__1__Impl6299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group__2__Impl_in_rule__NextFragment__Group__26330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__0_in_rule__NextFragment__Group__2__Impl6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__0__Impl_in_rule__NextFragment__Group_2__06394 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__1_in_rule__NextFragment__Group_2__06397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__ExprAssignment_2_0_in_rule__NextFragment__Group_2__0__Impl6424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__1__Impl_in_rule__NextFragment__Group_2__16454 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__2_in_rule__NextFragment__Group_2__16457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__NextFragment__Group_2__1__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__2__Impl_in_rule__NextFragment__Group_2__26516 = new BitSet(new long[]{0x00000077A2100010L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__3_in_rule__NextFragment__Group_2__26519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextFragment__TransitionAssignment_2_2_in_rule__NextFragment__Group_2__2__Impl6546 = new BitSet(new long[]{0x00000077A2000012L});
    public static final BitSet FOLLOW_rule__NextFragment__Group_2__3__Impl_in_rule__NextFragment__Group_2__36577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NextFragment__Group_2__3__Impl6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__0__Impl_in_rule__CallMessage__Group__06644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__1_in_rule__CallMessage__Group__06647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_0__0_in_rule__CallMessage__Group__0__Impl6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__1__Impl_in_rule__CallMessage__Group__16705 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__2_in_rule__CallMessage__Group__16708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__NameAssignment_1_in_rule__CallMessage__Group__1__Impl6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group__2__Impl_in_rule__CallMessage__Group__26765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__0_in_rule__CallMessage__Group__2__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_0__0__Impl_in_rule__CallMessage__Group_0__06829 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_0__1_in_rule__CallMessage__Group_0__06832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParticipantAssignment_0_0_in_rule__CallMessage__Group_0__0__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_0__1__Impl_in_rule__CallMessage__Group_0__16889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__CallMessage__Group_0__1__Impl6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__0__Impl_in_rule__CallMessage__Group_2__06952 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__1_in_rule__CallMessage__Group_2__06955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CallMessage__Group_2__0__Impl6984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__1__Impl_in_rule__CallMessage__Group_2__17016 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__2_in_rule__CallMessage__Group_2__17019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2_1__0_in_rule__CallMessage__Group_2__1__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2__2__Impl_in_rule__CallMessage__Group_2__27077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CallMessage__Group_2__2__Impl7105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2_1__0__Impl_in_rule__CallMessage__Group_2_1__07142 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2_1__1_in_rule__CallMessage__Group_2_1__07145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParameterAssignment_2_1_0_in_rule__CallMessage__Group_2_1__0__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2_1__1__Impl_in_rule__CallMessage__Group_2_1__17202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2_1_1__0_in_rule__CallMessage__Group_2_1__1__Impl7229 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2_1_1__0__Impl_in_rule__CallMessage__Group_2_1_1__07264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2_1_1__1_in_rule__CallMessage__Group_2_1_1__07267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CallMessage__Group_2_1_1__0__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__Group_2_1_1__1__Impl_in_rule__CallMessage__Group_2_1_1__17326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallMessage__ParameterAssignment_2_1_1_1_in_rule__CallMessage__Group_2_1_1__1__Impl7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__0__Impl_in_rule__NewMessage__Group__07387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__1_in_rule__NewMessage__Group__07390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__NewMessage__Group__0__Impl7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__1__Impl_in_rule__NewMessage__Group__17449 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__2_in_rule__NewMessage__Group__17452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__ParticipantAssignment_1_in_rule__NewMessage__Group__1__Impl7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group__2__Impl_in_rule__NewMessage__Group__27509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2__0_in_rule__NewMessage__Group__2__Impl7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2__0__Impl_in_rule__NewMessage__Group_2__07573 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2__1_in_rule__NewMessage__Group_2__07576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NewMessage__Group_2__0__Impl7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2__1__Impl_in_rule__NewMessage__Group_2__17637 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2__2_in_rule__NewMessage__Group_2__17640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2_1__0_in_rule__NewMessage__Group_2__1__Impl7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2__2__Impl_in_rule__NewMessage__Group_2__27698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__NewMessage__Group_2__2__Impl7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2_1__0__Impl_in_rule__NewMessage__Group_2_1__07763 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2_1__1_in_rule__NewMessage__Group_2_1__07766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__ParameterAssignment_2_1_0_in_rule__NewMessage__Group_2_1__0__Impl7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2_1__1__Impl_in_rule__NewMessage__Group_2_1__17823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2_1_1__0_in_rule__NewMessage__Group_2_1__1__Impl7850 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2_1_1__0__Impl_in_rule__NewMessage__Group_2_1_1__07885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2_1_1__1_in_rule__NewMessage__Group_2_1_1__07888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__NewMessage__Group_2_1_1__0__Impl7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__Group_2_1_1__1__Impl_in_rule__NewMessage__Group_2_1_1__17947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NewMessage__ParameterAssignment_2_1_1_1_in_rule__NewMessage__Group_2_1_1__1__Impl7974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__0__Impl_in_rule__ReturnMessage__Group__08008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__1_in_rule__ReturnMessage__Group__08011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ReturnMessage__Group__0__Impl8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__1__Impl_in_rule__ReturnMessage__Group__18070 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__2_in_rule__ReturnMessage__Group__18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__NameAssignment_1_in_rule__ReturnMessage__Group__1__Impl8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group__2__Impl_in_rule__ReturnMessage__Group__28130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__0_in_rule__ReturnMessage__Group__2__Impl8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__0__Impl_in_rule__ReturnMessage__Group_2__08194 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__1_in_rule__ReturnMessage__Group_2__08197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ReturnMessage__Group_2__0__Impl8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__1__Impl_in_rule__ReturnMessage__Group_2__18258 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__2_in_rule__ReturnMessage__Group_2__18261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__0_in_rule__ReturnMessage__Group_2__1__Impl8288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2__2__Impl_in_rule__ReturnMessage__Group_2__28319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ReturnMessage__Group_2__2__Impl8347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__0__Impl_in_rule__ReturnMessage__Group_2_1__08384 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__1_in_rule__ReturnMessage__Group_2_1__08387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__ParameterAssignment_2_1_0_in_rule__ReturnMessage__Group_2_1__0__Impl8414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1__1__Impl_in_rule__ReturnMessage__Group_2_1__18444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__0_in_rule__ReturnMessage__Group_2_1__1__Impl8471 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__0__Impl_in_rule__ReturnMessage__Group_2_1_1__08506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__1_in_rule__ReturnMessage__Group_2_1_1__08509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ReturnMessage__Group_2_1_1__0__Impl8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__Group_2_1_1__1__Impl_in_rule__ReturnMessage__Group_2_1_1__18568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReturnMessage__ParameterAssignment_2_1_1_1_in_rule__ReturnMessage__Group_2_1_1__1__Impl8595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__0__Impl_in_rule__DeleteMessage__Group__08629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__1_in_rule__DeleteMessage__Group__08632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__DeleteMessage__Group__0__Impl8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__1__Impl_in_rule__DeleteMessage__Group__18691 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__2_in_rule__DeleteMessage__Group__18694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__NameAssignment_1_in_rule__DeleteMessage__Group__1__Impl8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group__2__Impl_in_rule__DeleteMessage__Group__28751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2__0_in_rule__DeleteMessage__Group__2__Impl8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2__0__Impl_in_rule__DeleteMessage__Group_2__08815 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2__1_in_rule__DeleteMessage__Group_2__08818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DeleteMessage__Group_2__0__Impl8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2__1__Impl_in_rule__DeleteMessage__Group_2__18879 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2__2_in_rule__DeleteMessage__Group_2__18882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2_1__0_in_rule__DeleteMessage__Group_2__1__Impl8909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2__2__Impl_in_rule__DeleteMessage__Group_2__28940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DeleteMessage__Group_2__2__Impl8968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2_1__0__Impl_in_rule__DeleteMessage__Group_2_1__09005 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2_1__1_in_rule__DeleteMessage__Group_2_1__09008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__ParameterAssignment_2_1_0_in_rule__DeleteMessage__Group_2_1__0__Impl9035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2_1__1__Impl_in_rule__DeleteMessage__Group_2_1__19065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2_1_1__0_in_rule__DeleteMessage__Group_2_1__1__Impl9092 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2_1_1__0__Impl_in_rule__DeleteMessage__Group_2_1_1__09127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2_1_1__1_in_rule__DeleteMessage__Group_2_1_1__09130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DeleteMessage__Group_2_1_1__0__Impl9158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__Group_2_1_1__1__Impl_in_rule__DeleteMessage__Group_2_1_1__19189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeleteMessage__ParameterAssignment_2_1_1_1_in_rule__DeleteMessage__Group_2_1_1__1__Impl9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__0__Impl_in_rule__Parameter__Group__09250 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1_in_rule__Parameter__Group__09253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_0_in_rule__Parameter__Group__0__Impl9280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group__1__Impl_in_rule__Parameter__Group__19310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__0_in_rule__Parameter__Group__1__Impl9337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__0__Impl_in_rule__Parameter__Group_1__09372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__1_in_rule__Parameter__Group_1__09375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Parameter__Group_1__0__Impl9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Group_1__1__Impl_in_rule__Parameter__Group_1__19434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__TypeAssignment_1_1_in_rule__Parameter__Group_1__1__Impl9461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__09495 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__09498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__TypeAssignment_0_in_rule__Reference__Group__0__Impl9525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__ArrayAssignment_1_in_rule__Reference__Group__1__Impl9582 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__09617 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__09620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__19678 = new BitSet(new long[]{0x0000020000000800L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__19681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Array__Group__1__Impl9709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__29740 = new BitSet(new long[]{0x0000020000000800L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__29743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__SizeAssignment_2_in_rule__Array__Group__2__Impl9770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__39801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Array__Group__3__Impl9829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__0__Impl_in_rule__ForeachExpression__Group__09868 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__1_in_rule__ForeachExpression__Group__09871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ForeachExpression__Group__0__Impl9898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__1__Impl_in_rule__ForeachExpression__Group__19927 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__2_in_rule__ForeachExpression__Group__19930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ForeachExpression__Group__1__Impl9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group__2__Impl_in_rule__ForeachExpression__Group__29989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Alternatives_2_in_rule__ForeachExpression__Group__2__Impl10016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__0__Impl_in_rule__ForeachExpression__Group_2_0__010052 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__1_in_rule__ForeachExpression__Group_2_0__010055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__ForeachExpression__Group_2_0__0__Impl10082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__1__Impl_in_rule__ForeachExpression__Group_2_0__110111 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__2_in_rule__ForeachExpression__Group_2_0__110114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ForeachExpression__Group_2_0__1__Impl10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForeachExpression__Group_2_0__2__Impl_in_rule__ForeachExpression__Group_2_0__210173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__ForeachExpression__Group_2_0__2__Impl10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__010235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__010238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Annotation__Group__0__Impl10266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__110297 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__110300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__NameAssignment_1_in_rule__Annotation__Group__1__Impl10327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__210357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0_in_rule__Annotation__Group__2__Impl10384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__0__Impl_in_rule__Annotation__Group_2__010421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1_in_rule__Annotation__Group_2__010424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Annotation__Group_2__0__Impl10453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__1__Impl_in_rule__Annotation__Group_2__110485 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2_in_rule__Annotation__Group_2__110488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_1_in_rule__Annotation__Group_2__1__Impl10515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__2__Impl_in_rule__Annotation__Group_2__210545 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3_in_rule__Annotation__Group_2__210548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0_in_rule__Annotation__Group_2__2__Impl10575 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2__3__Impl_in_rule__Annotation__Group_2__310606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Annotation__Group_2__3__Impl10634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__0__Impl_in_rule__Annotation__Group_2_2__010673 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1_in_rule__Annotation__Group_2_2__010676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Annotation__Group_2_2__0__Impl10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_2_2__1__Impl_in_rule__Annotation__Group_2_2__110735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ParameterAssignment_2_2_1_in_rule__Annotation__Group_2_2__1__Impl10762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010797 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10883 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ExtendedID__Group_1__0__Impl10949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl11007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__011040 = new BitSet(new long[]{0x0000000000020F10L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__011043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Real__Group__0__Impl11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__111105 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__111108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__1__Impl11135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__211164 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Real__Group__3_in_rule__Real__Group__211167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Real__Group__2__Impl11195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__3__Impl_in_rule__Real__Group__311226 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Real__Group__4_in_rule__Real__Group__311229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group__3__Impl11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__4__Impl_in_rule__Real__Group__411285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0_in_rule__Real__Group__4__Impl11312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__0__Impl_in_rule__Real__Group_4__011353 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1_in_rule__Real__Group_4__011356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_0_in_rule__Real__Group_4__0__Impl11383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__1__Impl_in_rule__Real__Group_4__111413 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2_in_rule__Real__Group_4__111416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Alternatives_4_1_in_rule__Real__Group_4__1__Impl11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group_4__2__Impl_in_rule__Real__Group_4__211473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Real__Group_4__2__Impl11500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__011535 = new BitSet(new long[]{0x0000000000020800L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__011538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Integer__Group__0__Impl11567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__111600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Integer__Group__1__Impl11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_011665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Model__SequenceAssignment_111696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_111727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Sequence__AnnotationAssignment_011758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_211789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParticipant_in_rule__Sequence__ParticipantAssignment_311820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Participant__AnnotationAssignment_011851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Participant__NameAssignment_111882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Participant__TransitionAssignment_211913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransitionBlock_in_rule__Participant__BlockAssignment_311944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TransitionBlock__NameAssignment_111975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__TransitionBlock__ParameterAssignment_2_1_012006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__TransitionBlock__ParameterAssignment_2_1_1_112037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__TransitionBlock__TransitionAssignment_312068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__IfElseFragment__ExprAssignment_112099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__IfElseFragment__TransitionAssignment_312130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__IfElseFragment__ElseIfExprAssignment_4_112161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__IfElseFragment__ElseIftransitionAssignment_4_312192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__IfElseFragment__ElseTransitionAssignment_5_112223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForeachExpression_in_rule__ForeachFragment__ExprAssignment_112254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__ForeachFragment__TransitionAssignment_312285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__LoopFragment__ExprAssignment_112316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__LoopFragment__TransitionAssignment_312347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__AssertFragment__ExprAssignment_112378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__AssertFragment__TransitionAssignment_312409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__BreakFragment__ExprAssignment_2_012440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__BreakFragment__TransitionAssignment_2_212471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueWithSpaces_in_rule__NextFragment__ExprAssignment_2_012502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__NextFragment__TransitionAssignment_2_212533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__ParticipantAssignment_0_012564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CallMessage__NameAssignment_112595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CallMessage__ParameterAssignment_2_1_012626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__CallMessage__ParameterAssignment_2_1_1_112657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NewMessage__ParticipantAssignment_112688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__NewMessage__ParameterAssignment_2_1_012719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__NewMessage__ParameterAssignment_2_1_1_112750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__ReturnMessage__NameAssignment_112781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReturnMessage__ParameterAssignment_2_1_012812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReturnMessage__ParameterAssignment_2_1_1_112843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeleteMessage__NameAssignment_112874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DeleteMessage__ParameterAssignment_2_1_012905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__DeleteMessage__ParameterAssignment_2_1_1_112936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment_012967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Parameter__TypeAssignment_1_112998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__TypeAssignment_013029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Reference__ArrayAssignment_113060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NATURAL_in_rule__Array__SizeAssignment_213091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__Annotation__NameAssignment_113122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_113153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Annotation__ParameterAssignment_2_2_113184 = new BitSet(new long[]{0x0000000000000002L});

}